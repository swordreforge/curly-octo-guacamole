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
        
        val powerManager = context.getSystemService(Context.POWER_SERVICE) as PowerManager

        // 总是执行轮换
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
                ThemeRotationManager.performRotation(context)
            } catch (e: Exception) {
                // 忽略错误
            } finally {
                ThemeRotationManager.scheduleNextRotation(context)
                if (wakeLock.isHeld) wakeLock.release()
                pendingResult.finish()
            }
        }
    }
}