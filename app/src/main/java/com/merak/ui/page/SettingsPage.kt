package com.merak.ui.page

import android.Manifest
import android.app.Activity
import android.content.pm.PackageManager
import android.os.Build
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import com.merak.R
import com.merak.service.KeepAliveService
import com.merak.service.ThemeInstallAccessibilityService
import com.merak.state.AppSettingsState
import com.merak.utils.PreferenceUtil
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import top.yukonga.miuix.kmp.basic.ButtonDefaults
import top.yukonga.miuix.kmp.basic.Card
import top.yukonga.miuix.kmp.basic.MiuixScrollBehavior
import top.yukonga.miuix.kmp.basic.Scaffold
import top.yukonga.miuix.kmp.basic.SmallTitle
import top.yukonga.miuix.kmp.basic.TextButton
import top.yukonga.miuix.kmp.basic.TopAppBar
import top.yukonga.miuix.kmp.basic.rememberTopAppBarState
import top.yukonga.miuix.kmp.extra.SuperArrow
import top.yukonga.miuix.kmp.extra.SuperDialog
import top.yukonga.miuix.kmp.extra.SuperDropdown
import top.yukonga.miuix.kmp.extra.SuperSwitch
import top.yukonga.miuix.kmp.utils.overScrollVertical
import kotlin.system.exitProcess

@Composable
fun SettingsPage(onNavigateToAbout: () -> Unit = {}) {
    val context = LocalContext.current
    val activity = context as Activity
    val language = AppSettingsState.language
    val colorMode = AppSettingsState.colorMode
    val scrollBehavior = MiuixScrollBehavior(rememberTopAppBarState())
    val coroutineScope = rememberCoroutineScope()
    val appContext = context.applicationContext
    
    // 常驻通知保活状态
    var keepAliveEnabled by remember { 
        mutableStateOf(PreferenceUtil.getBoolean("keep_alive_enabled", false))
    }
    
    // 优化模式状态
    var optimizationModeEnabled by remember {
        mutableStateOf(PreferenceUtil.getBoolean("optimization_mode_enabled", false))
    }
    val showOptimizationDialog = remember { mutableStateOf(false) }
    
    fun hasNotificationPermission(): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            ContextCompat.checkSelfPermission(
                appContext,
                Manifest.permission.POST_NOTIFICATIONS
            ) == PackageManager.PERMISSION_GRANTED
        } else {
            NotificationManagerCompat.from(appContext).areNotificationsEnabled()
        }
    }
    
    fun enableKeepAlive(): Boolean {
        if (!hasNotificationPermission()) {
            Toast.makeText(
                context,
                context.getString(R.string.keep_alive_notification_permission_required),
                Toast.LENGTH_LONG
            ).show()
            keepAliveEnabled = false
            PreferenceUtil.setBoolean("keep_alive_enabled", false)
            return false
        }
        keepAliveEnabled = true
        PreferenceUtil.setBoolean("keep_alive_enabled", true)
        KeepAliveService.start(
            appContext,
            keepAliveState = true,
            optimizationState = optimizationModeEnabled
        )
        KeepAliveService.requestRefresh(
            appContext,
            keepAliveState = true,
            optimizationState = optimizationModeEnabled
        )
        return true
    }
    
    fun disableKeepAlive() {
        keepAliveEnabled = false
        PreferenceUtil.setBoolean("keep_alive_enabled", false)
        KeepAliveService.requestRefresh(
            appContext,
            keepAliveState = false,
            optimizationState = false
        )
        KeepAliveService.stop(appContext)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = stringResource(R.string.title_settings),
                scrollBehavior = scrollBehavior
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .nestedScroll(scrollBehavior.nestedScrollConnection)
                .overScrollVertical()
                .fillMaxSize()
        ) {
            item {
                SmallTitle(stringResource(R.string.language_label))
            }
            item {
                Card(
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    SuperDropdown(
                        title = stringResource(R.string.language_label),
                        items = listOf(
                            stringResource(R.string.lang_zh_cn),
                            stringResource(R.string.lang_zh_tw),
                            stringResource(R.string.lang_en)
                        ),
                        selectedIndex = language.intValue,
                        onSelectedIndexChange = { index ->
                            // 只有当选择了不同的语言时才重建 Activity
                            if (index != language.intValue) {
                                PreferenceUtil.setInt("app_language", index)
                                activity.recreate() // 重新创建 Activity，attachBaseContext 会自动应用新语言
                            }
                        }
                    )
                }
            }
            item {
                SmallTitle(stringResource(R.string.color_mode))
            }
            item {
                Card(
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    SuperDropdown(
                        title = stringResource(R.string.color_mode),
                        items = listOf(
                            stringResource(R.string.color_system),
                            stringResource(R.string.color_light),
                            stringResource(R.string.color_dark)
                        ),
                        selectedIndex = colorMode.intValue,
                        onSelectedIndexChange = { index ->
                            colorMode.intValue = index
                            PreferenceUtil.setInt("color_mode", index)
                        }
                    )
                }
            }
            item {
                SmallTitle(stringResource(R.string.home_tools_title))
            }
            item {
                Card(
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    SuperSwitch(
                        title = stringResource(R.string.keep_alive_title),
                        summary = stringResource(R.string.keep_alive_summary),
                        checked = keepAliveEnabled,
                        onCheckedChange = { checked ->
                            if (checked) {
                                enableKeepAlive()
                            } else {
                                disableKeepAlive()
                                // 关闭常驻通知保活时，同时关闭优化模式
                                if (optimizationModeEnabled) {
                                    optimizationModeEnabled = false
                                    PreferenceUtil.setBoolean("optimization_mode_enabled", false)
                                    KeepAliveService.requestRefresh(
                                        appContext,
                                        keepAliveState = keepAliveEnabled,
                                        optimizationState = false
                                    )
                                }
                            }
                        }
                    )
                }
            }
            // 优化模式（仅在常驻通知保活开启时显示）
            if (keepAliveEnabled) {
                item {
                    Card(
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        SuperSwitch(
                            title = stringResource(R.string.optimization_mode_title),
                            summary = stringResource(R.string.optimization_mode_summary),
                            checked = optimizationModeEnabled,
                            onCheckedChange = { checked ->
                                if (checked) {
                                    if (!keepAliveEnabled && !enableKeepAlive()) {
                                        return@SuperSwitch
                                    }
                                    
                                    // 检查无障碍权限
                                    val accessibilityEnabled = ThemeInstallAccessibilityService
                                        .isAccessibilityServiceEnabled(
                                            context,
                                            ThemeInstallAccessibilityService::class.java
                                        )
                                    
                                    if (!accessibilityEnabled) {
                                        Toast.makeText(
                                            context,
                                            context.getString(R.string.optimization_mode_require_accessibility),
                                        Toast.LENGTH_LONG
                                    ).show()
                                    return@SuperSwitch
                                    }
                                    
                                    // 显示确认对话框
                                    showOptimizationDialog.value = true
                        } else {
                            // 关闭优化模式
                            optimizationModeEnabled = false
                            PreferenceUtil.setBoolean("optimization_mode_enabled", false)
                            KeepAliveService.requestRefresh(
                                appContext,
                                keepAliveState = keepAliveEnabled,
                                optimizationState = false
                            )
                            
                            Toast.makeText(
                                context,
                                context.getString(R.string.optimization_mode_disabled_toast),
                                Toast.LENGTH_SHORT
                                ).show()
                            }
                            }
                        )
                    }
                }
            }
            item {
                SmallTitle(stringResource(R.string.about_others))
            }
            item {
                Card(
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    SuperArrow(
                        title = stringResource(R.string.about_title),
                        summary = stringResource(R.string.about_version_label),
                        onClick = onNavigateToAbout
                    )
                }
            }
        }
    }
    
    // 优化模式确认对话框
    SuperDialog(
        title = stringResource(R.string.optimization_mode_dialog_title),
        summary = stringResource(R.string.optimization_mode_dialog_message),
        show = showOptimizationDialog,
        onDismissRequest = {
            showOptimizationDialog.value = false
        }
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            TextButton(
                text = stringResource(R.string.cancel),
                onClick = {
                    showOptimizationDialog.value = false
                },
                modifier = Modifier.weight(1f)
            )
            Spacer(Modifier.width(20.dp))
            TextButton(
                text = stringResource(R.string.confirm),
                onClick = {
                    val keepAliveReady = if (keepAliveEnabled) {
                        true
                    } else {
                        enableKeepAlive()
                    }
                    if (!keepAliveReady) {
                        showOptimizationDialog.value = false
                        return@TextButton
                    }
                    
                    optimizationModeEnabled = true
                    PreferenceUtil.setBoolean("optimization_mode_enabled", true)
                    KeepAliveService.requestRefresh(
                        appContext,
                        keepAliveState = keepAliveEnabled,
                        optimizationState = true
                    )
                    showOptimizationDialog.value = false
                    
                    Toast.makeText(
                        context,
                        context.getString(R.string.optimization_mode_enabled_toast),
                        Toast.LENGTH_SHORT
                    ).show()
                    
                    // 延迟 2 秒后退出主进程
                    coroutineScope.launch {
                        delay(2000)
                        activity.finish()
                        exitProcess(0)
                    }
                },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.textButtonColorsPrimary()
            )
        }
    }
}
