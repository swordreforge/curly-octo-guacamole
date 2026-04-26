package com.merak

import android.app.Application
import com.merak.state.AppSettingsState
import com.merak.utils.PreferenceUtil
import com.merak.utils.ThemeHistory

class ThemeStoreApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        PreferenceUtil.init(this)
        ThemeHistory.init(this)
        // 加载保存的设置
        AppSettingsState.language.intValue = PreferenceUtil.getInt("app_language", 0)
        AppSettingsState.colorMode.intValue = PreferenceUtil.getInt("color_mode", 0)
    }
}

