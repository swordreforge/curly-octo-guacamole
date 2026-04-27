package com.merak.service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.PowerManager
import com.merak.utils.ThemeRotationManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ThemeRotationReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action != ThemeRotationManager.ACTION_ROTATION_ALARM) return
        if (!ThemeRotationManager.isEnabled()) return

        val powerManager = context.getSystemService(Context.POWER_SERVICE) as PowerManager
        val isScreenOn = powerManager.isInteractive

        if (isScreenOn) {
            ThemeRotationManager.setPending(true)
        } else {
            CoroutineScope(Dispatchers.IO).launch {
                val success = ThemeRotationManager.performRotation(context)
                if (success) {
                    ThemeRotationManager.scheduleNextRotation(context)
                }
            }
        }
    }
}
