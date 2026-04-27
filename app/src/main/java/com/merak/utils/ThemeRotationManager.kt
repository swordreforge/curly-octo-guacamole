package com.merak.utils

import android.app.AlarmManager
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import com.merak.MainActivity
import com.merak.R
import com.merak.service.ThemeRotationReceiver
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

object ThemeRotationManager {

    const val ACTION_ROTATION_ALARM = "com.merak.action.ROTATION_ALARM"
    private const val PREF_ENABLED = "theme_rotation_enabled"
    private const val PREF_INTERVAL = "theme_rotation_interval_minutes"
    private const val PREF_ORDER_MODE = "theme_rotation_order_mode"
    private const val PREF_LAST_INDEX = "theme_rotation_last_index"
    private const val PREF_PENDING = "theme_rotation_pending"
    private const val CHANNEL_ID = "theme_rotation_channel"
    private const val NOTIFICATION_ID = 2001

    fun isEnabled(): Boolean = PreferenceUtil.getBoolean(PREF_ENABLED, false)

    fun setEnabled(enabled: Boolean) {
        PreferenceUtil.setBoolean(PREF_ENABLED, enabled)
    }

    fun getIntervalMinutes(): Int = PreferenceUtil.getInt(PREF_INTERVAL, 60)

    fun setIntervalMinutes(minutes: Int) {
        PreferenceUtil.setInt(PREF_INTERVAL, minutes.coerceIn(3, 2880))
    }

    fun getOrderMode(): Int = PreferenceUtil.getInt(PREF_ORDER_MODE, 0)

    fun setOrderMode(mode: Int) = PreferenceUtil.setInt(PREF_ORDER_MODE, mode)

    private fun getLastIndex(): Int = PreferenceUtil.getInt(PREF_LAST_INDEX, -1)

    private fun setLastIndex(index: Int) = PreferenceUtil.setInt(PREF_LAST_INDEX, index)

    fun isPending(): Boolean = PreferenceUtil.getBoolean(PREF_PENDING, false)

    fun setPending(pending: Boolean) = PreferenceUtil.setBoolean(PREF_PENDING, pending)

    /**
     * 调度下一次轮换闹钟
     */
    fun scheduleNextRotation(context: Context) {
        if (!isEnabled()) return
        val intervalMs = getIntervalMinutes() * 60_000L
        val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val intent = Intent(context, ThemeRotationReceiver::class.java).apply {
            action = ACTION_ROTATION_ALARM
        }
        val pendingIntent = PendingIntent.getBroadcast(
            context,
            0,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        val triggerAt = System.currentTimeMillis() + intervalMs
        alarmManager.setExactAndAllowWhileIdle(
            AlarmManager.RTC_WAKEUP,
            triggerAt,
            pendingIntent
        )
    }

    /**
     * 取消已调度的闹钟
     */
    fun cancelRotation(context: Context) {
        val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val intent = Intent(context, ThemeRotationReceiver::class.java).apply {
            action = ACTION_ROTATION_ALARM
        }
        val pendingIntent = PendingIntent.getBroadcast(
            context,
            0,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
        alarmManager.cancel(pendingIntent)
        setPending(false)
    }

    /**
     * 执行一次主题轮换
     */
    suspend fun performRotation(context: Context): Boolean {
        val history = ThemeHistory.getAll()
        if (history.isEmpty()) {
            LogManager.log(
                context,
                LogManager.LogType.WARNING,
                context.getString(R.string.log_rotation_failed),
                context.getString(R.string.log_rotation_empty_history)
            )
            return false
        }

        val lastIndex = getLastIndex()
        val nextIndex = when (getOrderMode()) {
            1 -> {
                val candidates = history.indices.filter { it != lastIndex }
                if (candidates.isNotEmpty()) candidates.random() else 0
            }

            else -> (lastIndex + 1) % history.size
        }
        val targetItem = history[nextIndex]
        setLastIndex(nextIndex)

        return withContext(Dispatchers.IO) {
            try {
                val installResult = ThemeInstaller.installThemeFromPath(targetItem.sourcePath)
                if (installResult.isFailure) {
                    LogManager.log(
                        context,
                        LogManager.LogType.ERROR,
                        context.getString(R.string.log_rotation_failed),
                        context.getString(
                            R.string.log_rotation_copy_failed,
                            installResult.exceptionOrNull()?.message ?: ""
                        )
                    )
                    return@withContext false
                }

                val applied = ThemeInstaller.applyTheme(context)
                if (!applied) {
                    LogManager.log(
                        context,
                        LogManager.LogType.ERROR,
                        context.getString(R.string.log_rotation_failed),
                        context.getString(R.string.log_rotation_apply_failed)
                    )
                    return@withContext false
                }

                LogManager.log(
                    context,
                    LogManager.LogType.THEME_INSTALL,
                    context.getString(R.string.log_rotation_success),
                    targetItem.fileName
                )

                sendRotationNotification(context, targetItem.fileName)

                true
            } catch (e: Exception) {
                LogManager.log(
                    context,
                    LogManager.LogType.ERROR,
                    context.getString(R.string.log_rotation_failed),
                    e.message
                )
                false
            }
        }
    }

    /**
     * 检查并执行 pending 的轮换任务
     * 由 SCREEN_OFF 广播调用
     */
    fun checkAndPerformPendingRotation(context: Context) {
        if (!isPending()) return
        setPending(false)
        CoroutineScope(Dispatchers.IO).launch {
            performRotation(context)
            // 无论本次轮换成功与否，都调度下一次闹钟，避免功能卡住
            scheduleNextRotation(context)
        }
    }

    private fun sendRotationNotification(context: Context, fileName: String) {
        val notificationManager =
            context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                context.getString(R.string.rotation_channel_name),
                NotificationManager.IMPORTANCE_LOW
            ).apply {
                description = context.getString(R.string.rotation_channel_desc)
                setShowBadge(false)
                enableLights(false)
                enableVibration(false)
            }
            notificationManager.createNotificationChannel(channel)
        }

        val contentIntent = PendingIntent.getActivity(
            context,
            0,
            Intent(context, MainActivity::class.java),
            PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
        )

        val nextTimeStr = formatMinutes(context, getIntervalMinutes())

        val notification = NotificationCompat.Builder(context, CHANNEL_ID)
            .setContentTitle(context.getString(R.string.rotation_notification_title))
            .setContentText(
                context.getString(
                    R.string.rotation_notification_content,
                    fileName,
                    nextTimeStr
                )
            )
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentIntent(contentIntent)
            .setAutoCancel(true)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .setShowWhen(true)
            .build()

        notificationManager.notify(NOTIFICATION_ID, notification)
    }

    private fun formatMinutes(context: Context, minutes: Int): String {
        return when {
            minutes < 60 -> context.getString(R.string.rotation_time_minutes, minutes)
            minutes == 60 -> context.getString(R.string.rotation_time_1hour)
            minutes % 60 == 0 -> context.getString(R.string.rotation_time_hours, minutes / 60)
            else -> context.getString(R.string.rotation_time_hours_minutes, minutes / 60, minutes % 60)
        }
    }
}
