package com.merak.service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.PowerManager
import android.util.Log
import com.merak.service.ThemeInstallAccessibilityService
import com.merak.utils.ThemeRotationManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ThemeRotationReceiver : BroadcastReceiver() {

    companion object {
        private const val TAG = "ThemeRotationReceiver"
    }

    override fun onReceive(context: Context, intent: Intent) {
        Log.d(TAG, "onReceive called, action=${intent.action}")
        
        if (intent.action != ThemeRotationManager.ACTION_ROTATION_ALARM) {
            Log.d(TAG, "action not match, return")
            return
        }
        
        val enabled = ThemeRotationManager.isEnabled()
        Log.d(TAG, "isEnabled=$enabled")
        
        if (!enabled) {
            return
        }

        Log.d(TAG, "Starting rotation...")
        
        val pendingResult = goAsync()
        CoroutineScope(Dispatchers.IO).launch {
            try {
                // 检查是否需要等待息屏
                val withoutScreenOff = ThemeRotationManager.isWithoutScreenOff()
                val powerManager = context.getSystemService(Context.POWER_SERVICE) as PowerManager
                val isScreenOn = powerManager.isInteractive

                if (withoutScreenOff && isScreenOn) {
                    // 分支 A: 需要等待息屏，且屏幕亮着 -> 挂起任务
                    Log.d(TAG, "Screen is ON and withoutScreenOff is true -> deferring rotation")
                    ThemeRotationManager.setPending(true)
                    
                    // 通知辅助服务更新内存状态
                    Intent(ThemeInstallAccessibilityService.ACTION_ROTATION_PENDING_SET).apply {
                        putExtra("pending", true)
                        setPackage(context.packageName)
                        context.sendBroadcast(this)
                    }
                    
                    // 取消进度通知，避免一直显示
                    ThemeRotationManager.cancelProgressNotification(context)
                } else {
                    // 分支 B: 立即执行 (不需要等待 OR 屏幕已灭)
                    Log.d(TAG, "Executing rotation immediately")
                    
                    // 获取 WakeLock
                    val wakeLock = powerManager.newWakeLock(
                        PowerManager.FULL_WAKE_LOCK
                                or PowerManager.ACQUIRE_CAUSES_WAKEUP
                                or PowerManager.ON_AFTER_RELEASE,
                        "ThemeStore:RotationWakeLock"
                    )
                    wakeLock.acquire(15 * 1000)

                    try {
                        ThemeRotationManager.performRotation(context)
                    } catch (e: Exception) {
                        Log.e(TAG, "Rotation failed", e)
                    } finally {
                        ThemeRotationManager.cancelProgressNotification(context)
                        ThemeRotationManager.scheduleNextRotation(context)
                        if (wakeLock.isHeld) wakeLock.release()
                    }
                }
            } catch (e: Exception) {
                Log.e(TAG, "Unexpected error in rotation receiver", e)
            } finally {
                pendingResult.finish()
            }
        }
    }
}