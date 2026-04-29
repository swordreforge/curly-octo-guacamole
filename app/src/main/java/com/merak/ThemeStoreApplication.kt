package com.merak

import android.app.Application
import com.merak.state.AppSettingsState
import com.merak.utils.PreferenceUtil
import com.merak.utils.ThemeHistory
import com.merak.utils.ThemeRotationManager

class ThemeStoreApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        PreferenceUtil.init(this)
        ThemeHistory.init(this)
        // 加载保存的设置
        AppSettingsState.language.intValue = PreferenceUtil.getInt("app_language", 0)
        AppSettingsState.colorMode.intValue = PreferenceUtil.getInt("color_mode", 0)
        // 如果轮换已开启，恢复调度（进程被杀/崩溃/升级后）
        if (ThemeRotationManager.isEnabled()) {
            ThemeRotationManager.scheduleNextRotation(this)
        }
    }
}

