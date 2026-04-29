package com.merak.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.merak.utils.ThemeRotationManager

class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action != Intent.ACTION_BOOT_COMPLETED) return
        if (ThemeRotationManager.isEnabled()) {
            ThemeRotationManager.scheduleNextRotation(context)
        }
    }
}
