package com.merak.ui.page

import android.Manifest
import android.app.Activity
import android.app.AlarmManager
import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.provider.Settings
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
import androidx.compose.runtime.DisposableEffect
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
import com.merak.utils.LogManager
import com.merak.utils.ThemeHistory
import com.merak.utils.ThemeRotationManager
import androidx.compose.foundation.layout.Column
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.sp
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
    val lifecycleOwner = LocalLifecycleOwner.current

    // 常驻通知保活状态
    var keepAliveEnabled by remember {
        mutableStateOf(PreferenceUtil.getBoolean("keep_alive_enabled", false))
    }
    
    // 优化模式状态
    var optimizationModeEnabled by remember {
        mutableStateOf(PreferenceUtil.getBoolean("optimization_mode_enabled", false))
    }
    val showOptimizationDialog = remember { mutableStateOf(false) }
    
    // 自动轮换主题状态
    var rotationEnabled by remember {
        mutableStateOf(ThemeRotationManager.isEnabled())
    }
    val showExactAlarmDialog = remember { mutableStateOf(false) }
    var rotationInterval by remember {
        mutableStateOf(ThemeRotationManager.getIntervalMinutes())
    }
    var rotationOrderMode by remember {
        mutableStateOf(ThemeRotationManager.getOrderMode())
    }
    var rotationWithoutScreenOff by remember {
        mutableStateOf(ThemeRotationManager.isWithoutScreenOff())
    }
    val historyEmpty = remember { ThemeHistory.getAll().isEmpty() }

    // 监听生命周期：用户从系统设置页返回时，重新检查精确闹钟权限
    DisposableEffect(lifecycleOwner, context) {
        val observer = LifecycleEventObserver { _, event ->
            if (event == Lifecycle.Event.ON_RESUME) {
                // 用户可能刚从设置页回来，检查权限是否已授予
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S && ThemeRotationManager.isEnabled()) {
                    val alarmManager = appContext.getSystemService(Context.ALARM_SERVICE) as AlarmManager
                    if (alarmManager.canScheduleExactAlarms()) {
                        // 权限已恢复，重置警告标记并重新调度
                        if (PreferenceUtil.getBoolean("exact_alarm_warned", false)) {
                            PreferenceUtil.setBoolean("exact_alarm_warned", false)
                            ThemeRotationManager.scheduleNextRotation(appContext)
                            coroutineScope.launch {
                                LogManager.log(
                                    appContext,
                                    LogManager.LogType.INFO,
                                    "Exact alarm permission granted",
                                    "Permission restored, rescheduled rotation"
                                )
                            }
                        }
                    }
                }
            }
        }
        lifecycleOwner.lifecycle.addObserver(observer)
        onDispose { lifecycleOwner.lifecycle.removeObserver(observer) }
    }

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
        // 关闭保活时，同时关闭自动轮换主题
        if (rotationEnabled) {
            rotationEnabled = false
            ThemeRotationManager.setEnabled(false)
            ThemeRotationManager.cancelRotation(appContext)
        }
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
                            title = stringResource(R.string.rotation_title),
                            summary = stringResource(
                                if (historyEmpty) R.string.rotation_summary_empty else R.string.rotation_summary
                            ),
                            checked = rotationEnabled,
                            enabled = !historyEmpty,
                            onCheckedChange = { checked ->
                                if (checked) {
                                    if (historyEmpty) {
                                        Toast.makeText(
                                            context,
                                            context.getString(R.string.rotation_summary_empty),
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    } else {
                                        rotationEnabled = true
                                        ThemeRotationManager.setEnabled(true)

                                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                                            val alarmManager = appContext.getSystemService(Context.ALARM_SERVICE) as AlarmManager
                                            if (!alarmManager.canScheduleExactAlarms()) {
                                                showExactAlarmDialog.value = true
                                            }
                                        }

                                        ThemeRotationManager.scheduleNextRotation(appContext)
                                        Toast.makeText(
                                            context,
                                            "已开启",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    }
                                } else {
                                    rotationEnabled = false
                                    ThemeRotationManager.setEnabled(false)
                                    ThemeRotationManager.cancelRotation(appContext)
                                    Toast.makeText(
                                        context,
                                        "已关闭",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            }
                        )
                    }
                }
                if (rotationEnabled) {
                    item {
                        Card(
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                        ) {
                            Column(
                                modifier = Modifier.padding(16.dp)
                            ) {
                                Text(
                                    text = stringResource(R.string.rotation_interval_title),
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 16.sp
                                )
                                Text(
                                    text = stringResource(
                                        R.string.rotation_interval_summary,
                                        formatIntervalText(context, rotationInterval)
                                    )
                                )
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Slider(
                                        value = rotationInterval.toFloat(),
                                        onValueChange = { rotationInterval = it.toInt() },
                                        valueRange = 1f..2880f,
                                        onValueChangeFinished = {
                                            ThemeRotationManager.setIntervalMinutes(rotationInterval)
                                            ThemeRotationManager.scheduleNextRotation(appContext)
                                        },
                                        modifier = Modifier.weight(1f)
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    TextField(
                                        value = rotationInterval.toString(),
                                        onValueChange = { newValue ->
                                            val parsed = newValue.toIntOrNull()
                                            if (parsed != null) {
                                                val coerced = parsed.coerceIn(1, 2880)
                                                rotationInterval = coerced
                                                ThemeRotationManager.setIntervalMinutes(coerced)
                                                ThemeRotationManager.scheduleNextRotation(appContext)
                                            }
                                        },
                                        keyboardOptions = KeyboardOptions(
                                            keyboardType = KeyboardType.Number
                                        ),
                                        modifier = Modifier.width(80.dp)
                                    )
                                }
                            }
                        }
                    }
                }
                if (rotationEnabled) {
                    item {
                        Card(
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                        ) {
                            SuperDropdown(
                                title = stringResource(R.string.rotation_order_title),
                                items = listOf(
                                    stringResource(R.string.rotation_order_chronological),
                                    stringResource(R.string.rotation_order_random)
                                ),
                                selectedIndex = rotationOrderMode,
                                onSelectedIndexChange = { index ->
                                    rotationOrderMode = index
                                    ThemeRotationManager.setOrderMode(index)
                                }
                            )
                        }
                    }
                }
                if (rotationEnabled) {
                    item {
                        Card(
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                        ) {
                            SuperSwitch(
                                title = stringResource(R.string.rotation_without_screen_off_title),
                                summary = stringResource(R.string.rotation_without_screen_off_summary),
                                checked = rotationWithoutScreenOff,
                                onCheckedChange = { checked ->
                                    val wasPending = ThemeRotationManager.isPending()
                                    rotationWithoutScreenOff = checked
                                    ThemeRotationManager.setWithoutScreenOff(checked)

                                    // 如果用户切回"立即轮换"且有挂起任务，立即执行
                                    if (!checked && wasPending) {
                                        ThemeRotationManager.checkAndPerformPendingRotation(appContext)
                                        Toast.makeText(
                                            context,
                                            "已切换为立即轮换，当前待执行任务将立即运行",
                                            Toast.LENGTH_LONG
                                        ).show()
                                    }
                                }
                            )
                        }
                    }
                }
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
                Card(
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    SuperSwitch(
                        title = stringResource(R.string.uninstall_protection_title),
                        summary = stringResource(R.string.uninstall_protection_summary),
                        checked = PreferenceUtil.getBoolean(PreferenceUtil.KEY_UNINSTALL_PROTECTION, false),
                        onCheckedChange = { checked ->
                            val accessibilityEnabled = ThemeInstallAccessibilityService
                                .isAccessibilityServiceEnabled(
                                    context,
                                    ThemeInstallAccessibilityService::class.java
                                )
                            if (!accessibilityEnabled) {
                                Toast.makeText(
                                    context,
                                    context.getString(R.string.accessibility_not_enabled),
                                    Toast.LENGTH_SHORT
                                ).show()
                                return@SuperSwitch
                            }
                            PreferenceUtil.setBoolean(PreferenceUtil.KEY_UNINSTALL_PROTECTION, checked)
                            if (checked) {
                                Toast.makeText(
                                    context,
                                    context.getString(R.string.uninstall_protection_toast),
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        }
                    )
                }
            }
            item {
                Card(
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    val devicePolicyManager = context.getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager
                    val deviceAdminComponent = ComponentName(context, com.merak.service.DeviceAdminReceiver::class.java)
                    var deviceAdminEnabled by remember { mutableStateOf(devicePolicyManager.isAdminActive(deviceAdminComponent)) }

                    val isDeviceOwner = remember {
                        com.merak.service.DeviceAdminReceiver.isDeviceOwner(context)
                    }

                    SuperSwitch(
                        title = stringResource(R.string.device_admin_title),
                        summary = if (isDeviceOwner) "🔒 设备所有者模式已激活 - 最强卸载防护已生效" else stringResource(R.string.device_admin_summary),
                        checked = deviceAdminEnabled,
                        onCheckedChange = { checked ->
                            if (checked) {
                                try {
                                    val intent = Intent(DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN)
                                    intent.putExtra(DevicePolicyManager.EXTRA_DEVICE_ADMIN, deviceAdminComponent)
                                    intent.putExtra(DevicePolicyManager.EXTRA_ADD_EXPLANATION,
                                        context.getString(R.string.device_admin_summary))
                                    activity.startActivity(intent)
                                } catch (e: Exception) {
                                    Toast.makeText(context,
                                        context.getString(R.string.device_admin_sizuku_not_found),
                                        Toast.LENGTH_SHORT).show()
                                }
                            } else {
                                try {
                                    // 检查是否有功能依赖设备管理器
                                    val uninstallProtectionOn = PreferenceUtil.getBoolean(
                                        PreferenceUtil.KEY_UNINSTALL_PROTECTION, false
                                    )
                                    val optimizationModeOn = PreferenceUtil.getBoolean(
                                        "optimization_mode_enabled", false
                                    )
                                    if (uninstallProtectionOn || optimizationModeOn) {
                                        Toast.makeText(
                                            context,
                                            "请先关闭「防止卸载保护」和「优化模式」后再关闭设备管理器",
                                            Toast.LENGTH_LONG
                                        ).show()
                                        return@SuperSwitch
                                    }
                                    devicePolicyManager.removeActiveAdmin(deviceAdminComponent)
                                    deviceAdminEnabled = false
                                    Toast.makeText(
                                        context,
                                        "设备管理器已关闭",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                } catch (e: Exception) {
                                    Toast.makeText(
                                        context,
                                        "关闭失败：${e.message}",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            }
                        }
                    )

                    if (!isDeviceOwner && deviceAdminEnabled) {
                        androidx.compose.foundation.layout.Column(
                            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                        ) {
                            Text(
                                text = "💡 提示：当前仅为普通设备管理员。通过 ADB 设置为「设备所有者」后，可获得系统级卸载阻止保护（无法通过长按卸载）。",
                                fontSize = 13.sp,
                                color = androidx.compose.ui.graphics.Color.Gray
                            )
                            top.yukonga.miuix.kmp.basic.TextButton(
                                text = "复制 ADB 激活命令",
                                onClick = {
                                    val cmd = "adb shell dpm set-device-owner com.merak/.service.DeviceAdminReceiver"
                                    val clipboard = context.getSystemService(android.content.Context.CLIPBOARD_SERVICE) as android.content.ClipboardManager
                                    clipboard.setPrimaryClip(android.content.ClipData.newPlainText("ADB命令", cmd))
                                    Toast.makeText(context, "已复制到剪贴板", Toast.LENGTH_SHORT).show()
                                },
                                modifier = Modifier.padding(top = 4.dp)
                            )
                        }
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

    // 精确闹钟权限提示对话框
    SuperDialog(
        title = "需要精确闹钟权限",
        summary = "Android 12+ 要求应用获得「精确闹钟」权限才能准时执行主题轮换。" +
                "如果没有该权限，轮换可能会在 Doze 模式下被系统推迟甚至失效。请点击「去设置」手动授权。",
        show = showExactAlarmDialog,
        onDismissRequest = {
            showExactAlarmDialog.value = false
        }
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            TextButton(
                text = "稍后再说",
                onClick = {
                    showExactAlarmDialog.value = false
                },
                modifier = Modifier.weight(1f)
            )
            Spacer(Modifier.width(20.dp))
            TextButton(
                text = "去设置",
                onClick = {
                    showExactAlarmDialog.value = false
                    try {
                        // 不带 package URI，让系统跳转到正确的「闹钟和提醒」授权页
                        val intent = Intent(Settings.ACTION_REQUEST_SCHEDULE_EXACT_ALARM)
                        activity.startActivity(intent)
                    } catch (e: Exception) {
                        // 回退到应用详情页
                        try {
                            val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                                data = android.net.Uri.parse("package:${appContext.packageName}")
                            }
                            activity.startActivity(intent)
                        } catch (e2: Exception) {
                            Toast.makeText(
                                context,
                                "无法打开设置页面，请手动前往「应用信息 → 权限 → 精确闹钟」开启",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    }
                },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.textButtonColorsPrimary()
            )
        }
    }
}

private fun formatIntervalText(context: Context, minutes: Int): String {
    return when {
        minutes < 60 -> context.getString(R.string.rotation_time_minutes, minutes)
        minutes == 60 -> context.getString(R.string.rotation_time_1hour)
        minutes % 60 == 0 -> context.getString(R.string.rotation_time_hours, minutes / 60)
        else -> context.getString(R.string.rotation_time_hours_minutes, minutes / 60, minutes % 60)
    }
}
