package com.merak.service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.PowerManager
import android.util.Log
import com.merak.utils.ThemeRotationManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ThemeRotationReceiver : BroadcastReceiver() {

    companion object {
        private const val TAG = "ThemeRotationReceiver"
    }

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action != ThemeRotationManager.ACTION_ROTATION_ALARM) return
        if (!ThemeRotationManager.isEnabled()) return

        val powerManager = context.getSystemService(Context.POWER_SERVICE) as PowerManager
        val isScreenOn = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT_WATCH) {
            powerManager.isInteractive
        } else {
            @Suppress("DEPRECATION")
            powerManager.isScreenOn
        }

        if (isScreenOn && !ThemeRotationManager.isWithoutScreenOff()) {
            Log.d(TAG, "Screen is on, marking rotation as pending")
            ThemeRotationManager.setPending(true)

            // 通过广播实时通知 :alarm_intercept 进程，避免 SharedPreferences 跨进程延迟
            Intent(ThemeInstallAccessibilityService.ACTION_ROTATION_PENDING_SET).apply {
                setPackage(context.packageName)
                putExtra("pending", true)
                context.sendBroadcast(this)
            }
            Log.d(TAG, "已发送 pending 广播到 :alarm_intercept")
        } else {
            Log.d(TAG, "Screen is off, performing rotation immediately")

            // 获取 WakeLock 点亮屏幕，解除 Android 10+ 后台启动 Activity 限制
            val wakeLock = powerManager.newWakeLock(
                PowerManager.FULL_WAKE_LOCK
                        or PowerManager.ACQUIRE_CAUSES_WAKEUP
                        or PowerManager.ON_AFTER_RELEASE,
                "ThemeStore:RotationWakeLock"
            )
            wakeLock.acquire(15 * 1000)

            val pendingResult = goAsync()
            CoroutineScope(Dispatchers.IO).launch {
                try {
                    val success = ThemeRotationManager.performRotation(context)
                    if (success) {
                        Log.d(TAG, "Rotation succeeded")
                    } else {
                        Log.d(TAG, "Rotation failed")
                    }
                } catch (e: Exception) {
                    Log.e(TAG, "Rotation exception", e)
                } finally {
                    // 无论成功失败都调度下一次，避免轮换链条断裂
                    ThemeRotationManager.scheduleNextRotation(context)
                    if (wakeLock.isHeld) wakeLock.release()
                    pendingResult.finish()
                }
            }
        }
    }
}
