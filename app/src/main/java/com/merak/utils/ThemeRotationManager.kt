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
    const val ACTION_ROTATION_COMPLETED = "com.merak.action.ROTATION_COMPLETED"
    private const val PREF_ENABLED = "theme_rotation_enabled"
    private const val PREF_INTERVAL = "theme_rotation_interval_minutes"
    private const val PREF_ORDER_MODE = "theme_rotation_order_mode"
    private const val PREF_LAST_INDEX = "theme_rotation_last_index"
    private const val PREF_PENDING = "theme_rotation_pending"
    private const val PREF_WITHOUT_SCREEN_OFF = "theme_rotation_without_screen_off"
    private const val PREF_CURRENT_FILE = "theme_rotation_current_file"
    private const val PREF_LAST_ROTATION_TIME = "theme_rotation_last_time"
    private const val CHANNEL_ID = "theme_rotation_channel"
    private const val NOTIFICATION_ID = 2001

    fun isEnabled(): Boolean = PreferenceUtil.getBoolean(PREF_ENABLED, false)

    fun setEnabled(enabled: Boolean) {
        PreferenceUtil.setBoolean(PREF_ENABLED, enabled)
    }

    fun getIntervalMinutes(): Int = PreferenceUtil.getInt(PREF_INTERVAL, 60)

    fun setIntervalMinutes(minutes: Int) {
        PreferenceUtil.setInt(PREF_INTERVAL, minutes.coerceIn(1, 2880))
    }

    fun getOrderMode(): Int = PreferenceUtil.getInt(PREF_ORDER_MODE, 0)

    fun setOrderMode(mode: Int) = PreferenceUtil.setInt(PREF_ORDER_MODE, mode)

    private fun getLastIndex(): Int = PreferenceUtil.getInt(PREF_LAST_INDEX, -1)

    private fun setLastIndex(index: Int) = PreferenceUtil.setInt(PREF_LAST_INDEX, index)

    fun isPending(): Boolean = PreferenceUtil.getBoolean(PREF_PENDING, false)

    fun setPending(pending: Boolean) = PreferenceUtil.setBoolean(PREF_PENDING, pending)

    fun isWithoutScreenOff(): Boolean = PreferenceUtil.getBoolean(PREF_WITHOUT_SCREEN_OFF, false)

    fun setWithoutScreenOff(enabled: Boolean) = PreferenceUtil.setBoolean(PREF_WITHOUT_SCREEN_OFF, enabled)

    fun getCurrentFileName(): String = PreferenceUtil.getString(PREF_CURRENT_FILE, "")

    fun setCurrentFileName(name: String) = PreferenceUtil.setString(PREF_CURRENT_FILE, name)

    fun getLastRotationTime(): Long = PreferenceUtil.getLong(PREF_LAST_ROTATION_TIME, 0)

    fun setLastRotationTime(time: Long) = PreferenceUtil.setLong(PREF_LAST_ROTATION_TIME, time)

    /**
     * 调度下一次轮换闹钟
     */
    fun scheduleNextRotation(context: Context) {
        if (!isEnabled()) return
        // 首次开启轮换时，从未执行过，将当前时间设为计时起点，避免进度条永远卡在 0%
        if (getLastRotationTime() == 0L) {
            setLastRotationTime(System.currentTimeMillis())
        }
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
        val hasExactPermission = Build.VERSION.SDK_INT < Build.VERSION_CODES.S ||
                alarmManager.canScheduleExactAlarms()

        if (!hasExactPermission) {
            // 仅首次或状态变化时记录一次，避免刷屏
            if (PreferenceUtil.getBoolean("exact_alarm_warned", false).not()) {
                PreferenceUtil.setBoolean("exact_alarm_warned", true)
                CoroutineScope(Dispatchers.IO).launch {
                    LogManager.log(
                        context,
                        LogManager.LogType.WARNING,
                        "Exact alarm permission denied",
                        "Falling back to inexact alarm"
                    )
                }
            }
            setInexact(alarmManager, triggerAt, pendingIntent)
            return
        }

        // 权限恢复后重置标记
        PreferenceUtil.setBoolean("exact_alarm_warned", false)

        try {
            alarmManager.setExactAndAllowWhileIdle(
                AlarmManager.RTC_WAKEUP,
                triggerAt,
                pendingIntent
            )
        } catch (e: SecurityException) {
            CoroutineScope(Dispatchers.IO).launch {
                LogManager.log(
                    context,
                    LogManager.LogType.ERROR,
                    context.getString(R.string.log_rotation_failed),
                    e.message ?: e.toString()
                )
            }
            setInexact(alarmManager, triggerAt, pendingIntent)
        }
    }

    private fun setInexact(alarmManager: AlarmManager, triggerAt: Long, pendingIntent: PendingIntent) {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                // Android 12+ setAndAllowWhileIdle 也需要 SCHEDULE_EXACT_ALARM 权限
                // 回退到 set()，不需要精确闹钟权限，Doze 下可能有延迟但至少能成功设置
                alarmManager.set(AlarmManager.RTC_WAKEUP, triggerAt, pendingIntent)
            } else {
                alarmManager.setAndAllowWhileIdle(
                    AlarmManager.RTC_WAKEUP,
                    triggerAt,
                    pendingIntent
                )
            }
        } catch (e: Exception) {
            // Final fallback - do nothing
        }
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

                ThemeHistory.add(
                    ThemeHistory.HistoryItem(
                        fileName = targetItem.fileName,
                        sourcePath = targetItem.sourcePath,
                        installTime = System.currentTimeMillis()
                    )
                )

                sendRotationNotification(context, targetItem.fileName)
                setLastRotationTime(System.currentTimeMillis())
                setCurrentFileName(targetItem.fileName)

                true
            } catch (e: Exception) {
                LogManager.log(
                    context,
                    LogManager.LogType.ERROR,
                    context.getString(R.string.log_rotation_failed),
                    e.message ?: e.toString()
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

        // 点亮屏幕，提升后台启动 Activity 成功率
        val powerManager = context.getSystemService(Context.POWER_SERVICE) as android.os.PowerManager
        val wakeLock = powerManager.newWakeLock(
            android.os.PowerManager.FULL_WAKE_LOCK
                    or android.os.PowerManager.ACQUIRE_CAUSES_WAKEUP
                    or android.os.PowerManager.ON_AFTER_RELEASE,
            "ThemeStore:ScreenOffRotationWakeLock"
        )
        wakeLock.acquire(15 * 1000)

        CoroutineScope(Dispatchers.IO).launch {
            try {
                performRotation(context)
            } finally {
                if (wakeLock.isHeld) wakeLock.release()
                // 无论本次轮换成功与否，都调度下一次闹钟，避免功能卡住
                scheduleNextRotation(context)
                // 通知主进程刷新 UI，解决跨进程 SharedPreferences 缓存延迟
                Intent(ACTION_ROTATION_COMPLETED).apply {
                    setPackage(context.packageName)
                    context.sendBroadcast(this)
                }
            }
        }
    }

    private fun ensureNotificationChannel(context: Context) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return
        val notificationManager =
            context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (notificationManager.getNotificationChannel(CHANNEL_ID) != null) return
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

    private fun sendRotationNotification(context: Context, fileName: String) {
        ensureNotificationChannel(context)
        val notificationManager =
            context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

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
