package com.merak

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.merak.service.ThemeInstallAccessibilityService
import com.merak.state.AppSettingsState
import com.merak.ui.App
import com.merak.ui.theme.AppTheme
import com.merak.utils.LanguageHelper
import com.merak.utils.PreferenceUtil
import kotlin.system.exitProcess

class MainActivity : ComponentActivity() {
    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(LanguageHelper.wrap(newBase))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // 检查是否是从"退出优化"按钮启动的
        val justExited = PreferenceUtil.getBoolean("optimization_mode_just_exited", false)
        if (justExited) {
            PreferenceUtil.setBoolean("optimization_mode_just_exited", false)
            Toast.makeText(
                this,
                getString(R.string.optimization_mode_disabled_toast),
                Toast.LENGTH_SHORT
            ).show()
        } else {
            // 检查优化模式：如果开启且无障碍服务运行，自动退出主进程
            val optimizationMode = PreferenceUtil.getBoolean("optimization_mode_enabled", false)
            if (optimizationMode) {
                val accessibilityEnabled = ThemeInstallAccessibilityService
                    .isAccessibilityServiceEnabled(
                        this,
                        ThemeInstallAccessibilityService::class.java
                    )
                
                if (accessibilityEnabled) {
                    // 优化模式已开启且无障碍服务运行，退出主进程
                    finish()
                    exitProcess(0)
                    return
                } else {
                    // 无障碍服务未运行，自动关闭优化模式
                    PreferenceUtil.setBoolean("optimization_mode_enabled", false)
                }
            }
        }
        
        // 每次 Activity 创建时重新加载设置状态
        AppSettingsState.language.intValue = PreferenceUtil.getInt("app_language", 0)
        AppSettingsState.colorMode.intValue = PreferenceUtil.getInt("color_mode", 0)
        
        setContent { AppTheme { App() } }
    }
}



