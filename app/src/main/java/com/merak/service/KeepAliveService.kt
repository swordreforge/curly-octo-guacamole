package com.merak.service

import android.Manifest
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import com.merak.MainActivity
import com.merak.R
import com.merak.utils.LogManager
import com.merak.utils.PreferenceUtil
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * 专门负责展示常驻保活通知的前台服务
 */
class KeepAliveService : Service() {

    companion object {
        private const val TAG = "KeepAliveService"
        private const val CHANNEL_ID = "keep_alive_channel"
        private const val NOTIFICATION_ID = 1001
        private const val ACTION_START = "com.merak.service.KeepAliveService.START"
        private const val ACTION_STOP = "com.merak.service.KeepAliveService.STOP"
        private const val ACTION_REFRESH = "com.merak.service.KeepAliveService.REFRESH"
        private const val EXTRA_OPTIMIZATION_STATE = "extra_optimization_state"
        private const val EXTRA_KEEP_ALIVE_STATE = "extra_keep_alive_state"

        fun start(context: Context, keepAliveState: Boolean? = null, optimizationState: Boolean? = null) {
            val appContext = context.applicationContext
            val shouldRun = keepAliveState
                ?: PreferenceUtil.getBoolean("keep_alive_enabled", false)

            if (!shouldRun) {
                stop(appContext)
                return
            }

            val intent = Intent(appContext, KeepAliveService::class.java).apply {
                action = ACTION_START
                keepAliveState?.let { putExtra(EXTRA_KEEP_ALIVE_STATE, it) }
                optimizationState?.let { putExtra(EXTRA_OPTIMIZATION_STATE, it) }
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                ContextCompat.startForegroundService(appContext, intent)
            } else {
                appContext.startService(intent)
            }
        }

        fun stop(context: Context) {
            val appContext = context.applicationContext
            appContext.stopService(Intent(appContext, KeepAliveService::class.java))
        }

        fun requestRefresh(context: Context, keepAliveState: Boolean? = null, optimizationState: Boolean? = null) {
            val appContext = context.applicationContext
            val shouldRun = keepAliveState
                ?: PreferenceUtil.getBoolean("keep_alive_enabled", false)

            if (!shouldRun) {
                stop(appContext)
                return
            }

            val intent = Intent(appContext, KeepAliveService::class.java).apply {
                action = ACTION_REFRESH
                keepAliveState?.let { putExtra(EXTRA_KEEP_ALIVE_STATE, it) }
                optimizationState?.let { putExtra(EXTRA_OPTIMIZATION_STATE, it) }
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                ContextCompat.startForegroundService(appContext, intent)
            } else {
                appContext.startService(intent)
            }
        }
    }

    private val serviceScope = CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate)
    private var isForeground = false

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val keepAliveOverride = intent?.extras?.let { extras ->
            if (extras.containsKey(EXTRA_KEEP_ALIVE_STATE)) extras.getBoolean(EXTRA_KEEP_ALIVE_STATE) else null
        }
        val optimizationOverride = intent?.extras?.let { extras ->
            if (extras.containsKey(EXTRA_OPTIMIZATION_STATE)) extras.getBoolean(EXTRA_OPTIMIZATION_STATE) else null
        }

        keepAliveOverride?.let {
            PreferenceUtil.setBoolean("keep_alive_enabled", it)
        }
        optimizationOverride?.let {
            PreferenceUtil.setBoolean("optimization_mode_enabled", it)
        }

        when (intent?.action) {
            ACTION_STOP -> {
                Log.d(TAG, "ACTION_STOP")
                serviceScope.launch {
                    stopForegroundService()
                }
            }
            ACTION_REFRESH -> {
                Log.d(TAG, "ACTION_REFRESH")
                serviceScope.launch {
                    updateNotification()
                }
            }
            else -> {
                Log.d(TAG, "ACTION_START")
                serviceScope.launch {
                    updateNotification()
                }
            }
        }
        return START_STICKY
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy")
        serviceScope.cancel()
        if (isForeground) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                stopForeground(STOP_FOREGROUND_REMOVE)
            } else {
                @Suppress("DEPRECATION")
                stopForeground(true)
            }
            isForeground = false
        }
        super.onDestroy()
    }

    override fun onBind(intent: Intent?): IBinder? = null

    private suspend fun updateNotification() {
        if (!PreferenceUtil.getBoolean("keep_alive_enabled", false)) {
            Log.d(TAG, "Keep-alive disabled, stopping service")
            stopForegroundService()
            return
        }

        if (!hasNotificationPermission()) {
            Log.w(TAG, "Notification permission missing, stopping service")
            stopForegroundService()
            return
        }

        val stats = runCatching {
            LogManager.getStatistics(this)
        }.getOrElse {
            Log.e(TAG, "Failed to load statistics", it)
            null
        } ?: LogManager.Statistics(
            themeInstallCount = 0,
            alarmInterceptCount = 0,
            lastThemeInstallTime = 0,
            lastAlarmInterceptTime = 0,
            totalLogSize = 0
        )

        val notification = buildNotification(stats)

        withContext(Dispatchers.Main) {
            createNotificationChannelIfNeeded()
            val manager = getSystemService(NotificationManager::class.java)
            if (!isForeground) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
                    startForeground(
                        NOTIFICATION_ID,
                        notification,
                        android.content.pm.ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE
                    )
                } else {
                    startForeground(NOTIFICATION_ID, notification)
                }
                isForeground = true
            } else {
                manager?.notify(NOTIFICATION_ID, notification)
            }
        }
    }

    private suspend fun stopForegroundService() {
        withContext(Dispatchers.Main) {
            if (isForeground) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    stopForeground(STOP_FOREGROUND_REMOVE)
                } else {
                    @Suppress("DEPRECATION")
                    stopForeground(true)
                }
                isForeground = false
            }
            stopSelf()
        }
    }

    private fun buildNotification(stats: LogManager.Statistics): Notification {
        val pendingIntent = PendingIntent.getActivity(
            this,
            0,
            Intent(this, MainActivity::class.java),
            PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
        )

        val contentText = getString(
            R.string.keep_alive_notification_content,
            stats.themeInstallCount,
            stats.alarmInterceptCount
        )

        val builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle(getString(R.string.keep_alive_notification_title))
            .setContentText(contentText)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentIntent(pendingIntent)
            .setOngoing(true)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .setShowWhen(false)

        if (PreferenceUtil.getBoolean("optimization_mode_enabled", false)) {
            val exitOptimizationIntent = Intent("com.merak.ACTION_EXIT_OPTIMIZATION").apply {
                setPackage(packageName)
            }
            val exitPendingIntent = PendingIntent.getBroadcast(
                this,
                1,
                exitOptimizationIntent,
                PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
            )
            builder.addAction(
                0,
                getString(R.string.optimization_mode_notification_action),
                exitPendingIntent
            )
        }

        return builder.build()
    }

    private fun hasNotificationPermission(): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.POST_NOTIFICATIONS
            ) == PackageManager.PERMISSION_GRANTED
        } else {
            NotificationManagerCompat.from(this).areNotificationsEnabled()
        }
    }

    private fun createNotificationChannelIfNeeded() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return
        val manager = getSystemService(NotificationManager::class.java) ?: return
        if (manager.getNotificationChannel(CHANNEL_ID) != null) {
            return
        }
        val channel = NotificationChannel(
            CHANNEL_ID,
            getString(R.string.keep_alive_channel_name),
            NotificationManager.IMPORTANCE_LOW
        ).apply {
            description = getString(R.string.keep_alive_channel_desc)
            setShowBadge(false)
            enableLights(false)
            enableVibration(false)
        }
        manager.createNotificationChannel(channel)
    }
}
