# 后台自动轮换主题设计方案

> 日期：2026-04-27  
> 作者：OpenCode  
> 状态：待审核  
> 关联 Issue：添加后台自动轮换主题服务

---

## 1. 背景与目标

### 1.1 背景

ThemeStore 是一款 Android 主题管理应用，核心能力包括：
- 从本地/网络安装 `.mtz` 主题包
- 通过 `ThemeInstaller.applyTheme()` 调用 MIUI/HyperOS 主题管理器应用主题
- 通过 `KeepAliveService` 前台通知保活
- 通过 `ThemeInstallAccessibilityService` 广播拦截实现后台保活

### 1.2 目标

新增"后台自动轮换主题"功能：
- 在后台定时自动切换已安装的历史主题
- 轮换触发时机为**灭屏时执行**，避免前台 Activity 跳转打扰用户
- 依赖"常驻通知保活"开关，不可独立开启
- 用户可配置轮换间隔（自定义，>=3 分钟）和轮换顺序（按时间/随机）
- 每次轮换成功后发送通知提示用户

---

## 2. 技术约束

### 2.1 主题应用方式受限

经全项目扫描确认，`ThemeInstaller.applyTheme()` 是目前**唯一可靠**的主题应用方式：

```kotlin
val intent = Intent().apply {
    action = Intent.ACTION_MAIN
    setClassName(
        "com.android.thememanager",
        "com.android.thememanager.ApplyThemeForScreenshot"
    )
    putExtra("theme_file_path", originalPath)
    putExtra("api_called_from", "ThemeEditor")
    putExtra("ver2_step", "ver2_step_apply")
    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
}
context.startActivity(intent)
```

项目中不存在：
- AIDL 接口调用
- 静默广播触发主题应用
- ContentProvider/Settings.System 修改主题
- `startService`/`bindService` 调用主题服务

**结论**：`startActivity` 唤起主题管理器 Activity 是目前唯一可行路径，必须通过"灭屏执行"策略规避前台打扰。

### 2.2 进程模型

- `ThemeInstallAccessibilityService` 运行在 `:alarm_intercept` 独立进程
- `KeepAliveService` 同样运行在 `:alarm_intercept` 进程
- AlarmManager 触发的广播由 `ThemeRotationReceiver` 接收
- 灭屏广播由 `ThemeInstallAccessibilityService.mBroadcastReceiver` 接收

---

## 3. 架构设计

### 3.1 新增组件

| 组件 | 类型 | 职责 |
|---|---|---|
| `ThemeRotationManager` | `object` 单例 | 管理轮换配置、调度 AlarmManager、维护"待执行"状态、执行实际轮换 |
| `ThemeRotationReceiver` | `BroadcastReceiver` | 接收 AlarmManager 精确闹钟广播，判断屏幕状态决定立即执行或标记 pending |
| `ThemeRotationService` | `Service` | ~~可选，本次实现不使用~~。所有逻辑收敛在 `ThemeRotationManager` + `ThemeRotationReceiver` 中，避免增加不必要的进程开销。 |

### 3.2 复用组件

| 组件 | 复用点 |
|---|---|
| `ThemeInstallAccessibilityService.mBroadcastReceiver` | 在 `SCREEN_OFF` 分支新增"检查待执行轮换"逻辑 |
| `ThemeInstaller` | `installThemeFromPath()` + `applyTheme()` |
| `ThemeHistory` | 获取轮换主题池 |
| `KeepAliveService` | 依赖其保活能力，功能开关联动 |

---

## 4. 数据流

```
用户开启自动轮换
  ↓
ThemeRotationManager.scheduleNextRotation()
  ↓
AlarmManager 触发（精确闹钟，RTC_WAKEUP）
  ↓
ThemeRotationReceiver.onReceive()
  ├─ 屏幕已关闭 ──→ 立即调用 ThemeRotationManager.performRotation()
  │                    ├─ installThemeFromPath()
  │                    ├─ applyTheme()
  │                    ├─ 记录日志
  │                    ├─ 发送通知
  │                    └─ scheduleNextRotation() 调度下一次
  └─ 屏幕亮着 ────→ PreferenceUtil.setBoolean("theme_rotation_pending", true)
                          ↓
                    用户灭屏
                          ↓
            ThemeInstallAccessibilityService 收到 SCREEN_OFF
                          ↓
            ThemeRotationManager.checkAndPerformPendingRotation()
                          ↓
            执行 performRotation() 完整流程
```

---

## 5. 配置持久化

所有配置通过 `PreferenceUtil` 持久化：

| Key | 类型 | 默认值 | 说明 |
|---|---|---|---|
| `theme_rotation_enabled` | Boolean | `false` | 自动轮换总开关 |
| `theme_rotation_interval_minutes` | Int | `60` | 轮换间隔分钟数，范围 `[3, 2880]` |
| `theme_rotation_order_mode` | Int | `0` | `0`=按时间顺序（从早到晚循环），`1`=随机 |
| `theme_rotation_last_index` | Int | `-1` | 上次轮换到的 `ThemeHistory` 索引 |
| `theme_rotation_pending` | Boolean | `false` | 是否有待执行的轮换任务（屏幕亮时 Alarm 触发） |

---

## 6. UI 设计

### 6.1 设置页面（SettingsPage）

在现有"常驻通知保活"开关下方新增区块，**仅在 `keepAliveEnabled == true` 时显示**。

#### 6.1.1 自动轮换主题 —— SuperSwitch

- 标题：`自动轮换主题`
- 摘要：`灭屏时自动切换已安装的历史主题`
- 联动：关闭"常驻通知保活"时，此开关自动关闭并隐藏
- 主题历史为空时：摘要显示`暂无历史主题，请先安装主题`，开关置灰不可开启

#### 6.1.2 轮换间隔 —— Slider + 输入框组合

- 布局：横向 Slider（范围 3~2880） + 右侧数字输入框
- 实时显示：输入框下方显示人类可读格式，如`30分钟`、`2小时`、`1天`
- 校验：输入值 `< 3` 时自动修正为 3，`> 2880` 时自动修正为 2880
- 默认值：60 分钟

#### 6.1.3 轮换顺序 —— SuperDropdown

- 选项：`按时间顺序` / `随机抽取`
- 默认值：`按时间顺序`

### 6.2 通知设计

轮换成功时发送通知：
- 通道：复用 `keep_alive_channel` 或新建 `theme_rotation_channel`
- 标题：`主题已自动切换`
- 内容：`已切换至「XXX.mtz」，下次轮换：30分钟后`
- 优先级：`NotificationCompat.PRIORITY_LOW`
- 点击：打开 MainActivity

---

## 7. 原有逻辑保护

### 7.1 SCREEN_OFF 监听零侵入

当前 `ThemeInstallAccessibilityService.mBroadcastReceiver` 中 `Intent.ACTION_SCREEN_OFF` **无任何处理逻辑**（空匹配）。新增代码仅在空分支内追加：

```kotlin
Intent.ACTION_SCREEN_OFF -> {
    // 原有逻辑：无（SCREEN_OFF 仅用于保活进程存活）
    // 新增逻辑：检查是否有待执行的主题轮换
    ThemeRotationManager.checkAndPerformPendingRotation(context)
}
```

### 7.2 禁止改动的区域

以下逻辑**严禁修改**：
- `ALARM_ACTION` 的处理流程（广播拦截核心逻辑）
- `ACTION_UPDATE_NOTIFICATION` / `ACTION_REFRESH_NOTIFICATION` 的处理
- `intentFilter` 的注册方式和优先级（`priority = 1000`）
- `onCreate` / `onDestroy` 中的 receiver 生命周期
- `KeepAliveService` 的通知展示和保活逻辑

---

## 8. 核心代码设计

### 8.1 ThemeRotationManager

```kotlin
object ThemeRotationManager {

    private const val ACTION_ROTATION_ALARM = "com.merak.action.ROTATION_ALARM"
    private const val PREF_ENABLED = "theme_rotation_enabled"
    private const val PREF_INTERVAL = "theme_rotation_interval_minutes"
    private const val PREF_ORDER_MODE = "theme_rotation_order_mode"
    private const val PREF_LAST_INDEX = "theme_rotation_last_index"
    private const val PREF_PENDING = "theme_rotation_pending"

    fun isEnabled(): Boolean = PreferenceUtil.getBoolean(PREF_ENABLED, false)
    fun setEnabled(enabled: Boolean) = PreferenceUtil.setBoolean(PREF_ENABLED, enabled)

    fun getIntervalMinutes(): Int = PreferenceUtil.getInt(PREF_INTERVAL, 60)
    fun setIntervalMinutes(minutes: Int) {
        PreferenceUtil.setInt(PREF_INTERVAL, minutes.coerceIn(3, 2880))
    }

    fun getOrderMode(): Int = PreferenceUtil.getInt(PREF_ORDER_MODE, 0)
    fun setOrderMode(mode: Int) = PreferenceUtil.setInt(PREF_ORDER_MODE, mode)

    fun isPending(): Boolean = PreferenceUtil.getBoolean(PREF_PENDING, false)
    fun setPending(pending: Boolean) = PreferenceUtil.setBoolean(PREF_PENDING, pending)

    /**
     * 调度下一次轮换闹钟
     */
    fun scheduleNextRotation(context: Context) {
        if (!isEnabled()) return
        val intervalMs = getIntervalMinutes() * 60_000L
        val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val intent = Intent(context, ThemeRotationReceiver::class.java).apply {
            action = ACTION_ROTATION_ALARM
        }
        val pendingIntent = PendingIntent.getBroadcast(
            context, 0, intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        val triggerAt = System.currentTimeMillis() + intervalMs
        alarmManager.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, triggerAt, pendingIntent)
    }

    /**
     * 取消已调度的闹钟
     */
    fun cancelRotation(context: Context) {
        val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val intent = Intent(context, ThemeRotationReceiver::class.java).apply {
            action = ACTION_ROTATION_ALARM
        }
        val pendingIntent = PendingIntent.getBroadcast(
            context, 0, intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
        alarmManager.cancel(pendingIntent)
        setPending(false)
    }

    /**
     * 执行一次主题轮换
     */
    suspend fun performRotation(context: Context): Boolean {
        val history = ThemeHistory.getAll()
        if (history.isEmpty()) {
            LogManager.log(context, LogManager.LogType.WARNING, "主题轮换失败", "历史记录为空")
            return false
        }

        val lastIndex = PreferenceUtil.getInt(PREF_LAST_INDEX, -1)
        val nextIndex = when (getOrderMode()) {
            1 -> {
                val candidates = history.indices.filter { it != lastIndex }
                if (candidates.isNotEmpty()) candidates.random() else 0
            }
            else -> (lastIndex + 1) % history.size      // 顺序循环
        }
        val targetItem = history[nextIndex]
        PreferenceUtil.setInt(PREF_LAST_INDEX, nextIndex)

        return withContext(Dispatchers.IO) {
            try {
                // 1. 复制主题到目标目录
                val installResult = ThemeInstaller.installThemeFromPath(targetItem.sourcePath)
                if (installResult.isFailure) {
                    LogManager.log(context, LogManager.LogType.ERROR,
                        "主题轮换失败", "复制文件失败: ${installResult.exceptionOrNull()?.message}")
                    return@withContext false
                }

                // 2. 应用主题（startActivity，当前唯一可行方式）
                val applied = ThemeInstaller.applyTheme(context)
                if (!applied) {
                    LogManager.log(context, LogManager.LogType.ERROR,
                        "主题轮换失败", "applyTheme 返回 false")
                    return@withContext false
                }

                // 3. 记录日志
                LogManager.log(context, LogManager.LogType.THEME_INSTALL,
                    "主题自动轮换成功", targetItem.fileName)

                // 4. 发送通知
                sendRotationNotification(context, targetItem.fileName)

                true
            } catch (e: Exception) {
                LogManager.log(context, LogManager.LogType.ERROR,
                    "主题轮换异常", e.message)
                false
            }
        }
    }

    /**
     * 检查并执行 pending 的轮换任务
     * 由 SCREEN_OFF 广播调用
     */
    fun checkAndPerformPendingRotation(context: Context) {
        if (!isPending()) return
        setPending(false)
        CoroutineScope(Dispatchers.IO).launch {
            performRotation(context)
            // 无论本次轮换成功与否，都调度下一次闹钟，避免功能卡住
            scheduleNextRotation(context)
        }
    }

    private fun sendRotationNotification(context: Context, fileName: String) {
        // ... 构建并发送通知
    }
}
```

### 8.2 ThemeRotationReceiver

```kotlin
class ThemeRotationReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action != ThemeRotationManager.ACTION_ROTATION_ALARM) return
        if (!ThemeRotationManager.isEnabled()) return

        val powerManager = context.getSystemService(Context.POWER_SERVICE) as PowerManager
        val isScreenOn = powerManager.isInteractive

        if (isScreenOn) {
            // 屏幕亮着，标记 pending，等灭屏再执行
            ThemeRotationManager.setPending(true)
        } else {
            // 屏幕已关闭，立即执行
            CoroutineScope(Dispatchers.IO).launch {
                val success = ThemeRotationManager.performRotation(context)
                if (success) {
                    ThemeRotationManager.scheduleNextRotation(context)
                }
            }
        }
    }
}
```

---

## 9. 边界处理

| 场景 | 行为 |
|---|---|
| 主题历史为空 | 跳过轮换，记录 warning 日志，不清除 pending，等下次 Alarm 再检查 |
| 只有一个历史主题 | 循环应用同一主题 |
| `applyTheme()` 失败 | pending 标记不清除（亮屏场景下），等下次 Alarm 重新尝试 |
| 用户关闭"常驻通知保活" | 自动关闭并禁用"自动轮换主题"，取消已调度闹钟 |
| 设备重启 | 需通过 `BOOT_COMPLETED` 广播恢复闹钟调度（如需要，后续迭代） |
| 间隔设为 3 分钟 | 合法，允许；Slider 和输入框均允许最小值 3 |
| 应用被强制停止 | AlarmManager 闹钟可能被系统清除，需配合保活服务尽量降低概率 |

---

## 10. AndroidManifest 变更

```xml
<!-- 精确闹钟权限（Android 12+） -->
<uses-permission android:name="android.permission.SCHEDULE_EXACT_ALARM" />

<!-- 新增广播接收器 -->
<receiver
    android:name=".service.ThemeRotationReceiver"
    android:enabled="true"
    android:exported="false">
    <intent-filter>
        <action android:name="com.merak.action.ROTATION_ALARM" />
    </intent-filter>
</receiver>
```

---

## 11. 安全与权限

| 权限 | 用途 | 申请时机 |
|---|---|---|
| `SCHEDULE_EXACT_ALARM` | Android 12+ 精确闹钟权限 | 用户开启自动轮换时检查，未授权则引导至系统设置 |
| `POST_NOTIFICATIONS` | 发送轮换成功通知 | 复用现有通知权限检查逻辑 |
| `FOREGROUND_SERVICE` | 保活服务 | 已存在 |
| `FOREGROUND_SERVICE_SPECIAL_USE` | 保活服务 | 已存在 |

---

## 12. 后续可扩展点

- `BOOT_COMPLETED` 恢复闹钟：设备重启后自动恢复轮换调度
- 排除特定主题：允许用户在历史记录中标记"不参与自动轮换"
- 轮换时段限制：仅允许在特定时间段内执行轮换（如夜间模式）
- 静默轮换优化：如未来 MIUI 开放静默主题应用 API，可直接替换 `applyTheme()` 调用

---

## 变更记录

| 日期 | 变更 | 作者 |
|---|---|---|
| 2026-04-27 | 初稿 | OpenCode |
