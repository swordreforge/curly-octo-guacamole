package com.merak

import android.app.Application
import com.merak.state.AppSettingsState
import com.merak.utils.PreferenceUtil

class ThemeStoreApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        PreferenceUtil.init(this)
        // 加载保存的设置
        AppSettingsState.language.intValue = PreferenceUtil.getInt("app_language", 0)
        AppSettingsState.colorMode.intValue = PreferenceUtil.getInt("color_mode", 0)
    }
}

