# 后台自动轮换主题实现计划

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** 在 ThemeStore 中新增后台自动轮换主题功能，基于 ThemeHistory + AlarmManager 精确闹钟，灭屏时执行，支持自定义间隔和两种轮换顺序。

**Architecture:** 新增 `ThemeRotationManager` 单例管理配置和调度，`ThemeRotationReceiver` 接收闹钟广播。Alarm 触发时若屏幕亮则标记 pending，灭屏时由 `ThemeInstallAccessibilityService` 检查并执行。UI 在 SettingsPage 新增开关和配置项。

**Tech Stack:** Kotlin, Android SDK, AlarmManager, BroadcastReceiver, Jetpack Compose, Miuix UI, Coroutines

---

## 文件映射

| 文件 | 操作 | 职责 |
|---|---|---|
| `app/src/main/java/com/merak/utils/ThemeRotationManager.kt` | 新建 | 轮换配置管理、AlarmManager 调度、执行轮换 |
| `app/src/main/java/com/merak/service/ThemeRotationReceiver.kt` | 新建 | 接收闹钟广播，判断屏幕状态 |
| `app/src/main/java/com/merak/service/ThemeInstallAccessibilityService.kt` | 修改 | 在 SCREEN_OFF 分支添加 pending 轮换检查 |
| `app/src/main/java/com/merak/ui/page/SettingsPage.kt` | 修改 | 新增自动轮换开关、间隔配置、顺序配置 |
| `app/src/main/java/com/merak/service/KeepAliveService.kt` | 修改 | 保活状态变化时联动启停轮换服务 |
| `app/src/main/AndroidManifest.xml` | 修改 | 声明 ThemeRotationReceiver、精确闹钟权限 |
| `app/src/main/res/values/strings.xml` | 修改 | 新增所有 UI 和通知文案 |
| `app/src/main/res/values-en/strings.xml` | 修改 | 新增英文文案 |
| `app/src/main/res/values-zh-rTW/strings.xml` | 修改 | 新增繁体中文文案 |

---

## Task 1: 新建 ThemeRotationManager

**Files:**
- Create: `app/src/main/java/com/merak/utils/ThemeRotationManager.kt`

- [ ] **Step 1: 新建文件并编写完整实现**

```kotlin
package com.merak.utils

import android.app.AlarmManager
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import com.merak.MainActivity
import com.merak.R
import com.merak.service.ThemeRotationReceiver
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

object ThemeRotationManager {

    private const val ACTION_ROTATION_ALARM = "com.merak.action.ROTATION_ALARM"
    private const val PREF_ENABLED = "theme_rotation_enabled"
    private const val PREF_INTERVAL = "theme_rotation_interval_minutes"
    private const val PREF_ORDER_MODE = "theme_rotation_order_mode"
    private const val PREF_LAST_INDEX = "theme_rotation_last_index"
    private const val PREF_PENDING = "theme_rotation_pending"
    private const val CHANNEL_ID = "theme_rotation_channel"
    private const val NOTIFICATION_ID = 2001

    fun isEnabled(): Boolean = PreferenceUtil.getBoolean(PREF_ENABLED, false)

    fun setEnabled(enabled: Boolean) {
        PreferenceUtil.setBoolean(PREF_ENABLED, enabled)
    }

    fun getIntervalMinutes(): Int = PreferenceUtil.getInt(PREF_INTERVAL, 60)

    fun setIntervalMinutes(minutes: Int) {
        PreferenceUtil.setInt(PREF_INTERVAL, minutes.coerceIn(3, 2880))
    }

    fun getOrderMode(): Int = PreferenceUtil.getInt(PREF_ORDER_MODE, 0)

    fun setOrderMode(mode: Int) = PreferenceUtil.setInt(PREF_ORDER_MODE, mode)

    private fun getLastIndex(): Int = PreferenceUtil.getInt(PREF_LAST_INDEX, -1)

    private fun setLastIndex(index: Int) = PreferenceUtil.setInt(PREF_LAST_INDEX, index)

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
            context,
            0,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        val triggerAt = System.currentTimeMillis() + intervalMs
        alarmManager.setExactAndAllowWhileIdle(
            AlarmManager.RTC_WAKEUP,
            triggerAt,
            pendingIntent
        )
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
            context,
            0,
            intent,
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
            LogManager.log(
                context,
                LogManager.LogType.WARNING,
                context.getString(R.string.log_rotation_failed),
                context.getString(R.string.log_rotation_empty_history)
            )
            return false
        }

        val lastIndex = getLastIndex()
        val nextIndex = when (getOrderMode()) {
            1 -> {
                val candidates = history.indices.filter { it != lastIndex }
                if (candidates.isNotEmpty()) candidates.random() else 0
            }

            else -> (lastIndex + 1) % history.size
        }
        val targetItem = history[nextIndex]
        setLastIndex(nextIndex)

        return withContext(Dispatchers.IO) {
            try {
                val installResult = ThemeInstaller.installThemeFromPath(targetItem.sourcePath)
                if (installResult.isFailure) {
                    LogManager.log(
                        context,
                        LogManager.LogType.ERROR,
                        context.getString(R.string.log_rotation_failed),
                        context.getString(
                            R.string.log_rotation_copy_failed,
                            installResult.exceptionOrNull()?.message ?: ""
                        )
                    )
                    return@withContext false
                }

                val applied = ThemeInstaller.applyTheme(context)
                if (!applied) {
                    LogManager.log(
                        context,
                        LogManager.LogType.ERROR,
                        context.getString(R.string.log_rotation_failed),
                        context.getString(R.string.log_rotation_apply_failed)
                    )
                    return@withContext false
                }

                LogManager.log(
                    context,
                    LogManager.LogType.THEME_INSTALL,
                    context.getString(R.string.log_rotation_success),
                    targetItem.fileName
                )

                sendRotationNotification(context, targetItem.fileName)

                true
            } catch (e: Exception) {
                LogManager.log(
                    context,
                    LogManager.LogType.ERROR,
                    context.getString(R.string.log_rotation_failed),
                    e.message
                )
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
            scheduleNextRotation(context)
        }
    }

    private fun sendRotationNotification(context: Context, fileName: String) {
        val notificationManager =
            context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                context.getString(R.string.rotation_channel_name),
                NotificationManager.IMPORTANCE_LOW
            ).apply {
                description = context.getString(R.string.rotation_channel_desc)
                setShowBadge(false)
                enableLights(false)
                enableVibration(false)
            }
            notificationManager.createNotificationChannel(channel)
        }

        val contentIntent = PendingIntent.getActivity(
            context,
            0,
            Intent(context, MainActivity::class.java),
            PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
        )

        val nextTimeStr = formatMinutes(context, getIntervalMinutes())

        val notification = NotificationCompat.Builder(context, CHANNEL_ID)
            .setContentTitle(context.getString(R.string.rotation_notification_title))
            .setContentText(
                context.getString(
                    R.string.rotation_notification_content,
                    fileName,
                    nextTimeStr
                )
            )
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentIntent(contentIntent)
            .setAutoCancel(true)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .setShowWhen(true)
            .build()

        notificationManager.notify(NOTIFICATION_ID, notification)
    }

    private fun formatMinutes(context: Context, minutes: Int): String {
        return when {
            minutes < 60 -> context.getString(R.string.rotation_time_minutes, minutes)
            minutes == 60 -> context.getString(R.string.rotation_time_1hour)
            minutes % 60 == 0 -> context.getString(R.string.rotation_time_hours, minutes / 60)
            else -> context.getString(R.string.rotation_time_hours_minutes, minutes / 60, minutes % 60)
        }
    }
}
```

- [ ] **Step 2: Commit**

```bash
git add app/src/main/java/com/merak/utils/ThemeRotationManager.kt
git commit -m "feat: add ThemeRotationManager for auto theme rotation

- Manage rotation config (enabled, interval, order mode)
- Schedule/cancel AlarmManager exact alarms
- Perform rotation via ThemeInstaller with screen-off strategy
- Send notification on successful rotation
- Log all rotation events via LogManager"
```

---

## Task 2: 新建 ThemeRotationReceiver

**Files:**
- Create: `app/src/main/java/com/merak/service/ThemeRotationReceiver.kt`

- [ ] **Step 1: 新建文件并编写完整实现**

```kotlin
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
```

- [ ] **Step 2: Commit**

```bash
git add app/src/main/java/com/merak/service/ThemeRotationReceiver.kt
git commit -m "feat: add ThemeRotationReceiver for alarm broadcast handling

- Receive exact alarm broadcasts from AlarmManager
- Check screen state: execute immediately if off, mark pending if on
- Delegate actual rotation to ThemeRotationManager"
```

---

## Task 3: 修改 ThemeInstallAccessibilityService（SCREEN_OFF 分支）

**Files:**
- Modify: `app/src/main/java/com/merak/service/ThemeInstallAccessibilityService.kt:100-136`

- [ ] **Step 1: 在 SCREEN_OFF 分支添加 pending 检查**

在 `mBroadcastReceiver.onReceive` 的 `when` 表达式中，`Intent.ACTION_SCREEN_OFF` 当前为空匹配（隐式 fallthrough 到 `else` 之前的逻辑）。需要显式处理。

找到这段代码：

```kotlin
        val intentFilter = IntentFilter().apply {
            addAction(ALARM_ACTION)
            addAction(Intent.ACTION_SCREEN_OFF)
            addAction(ACTION_UPDATE_NOTIFICATION)
            addAction(ACTION_REFRESH_NOTIFICATION)
            priority = 1000
        }
```

以及 receiver 的 `onReceive` 方法中 `when` 部分。当前 `SCREEN_OFF` 没有独立分支（它隐式会匹配到 `else`，但 `else` 只处理 `ACTION_UPDATE_NOTIFICATION` / `ACTION_REFRESH_NOTIFICATION`）。

修改为：

```kotlin
    private val mBroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            if (intent == null || context == null) return

            when (intent.action) {
                ALARM_ACTION -> {
                    abortBroadcast()

                    val currentTime = System.currentTimeMillis()
                    st_receiveTime = getRst() + dateFormat.format(Date(currentTime))
                    lastEventTime = currentTime

                    serviceScope.launch(Dispatchers.IO) {
                        try {
                            com.merak.utils.LogManager.log(
                                context,
                                com.merak.utils.LogManager.LogType.ALARM_INTERCEPT,
                                context.getString(com.merak.R.string.log_alarm_intercepted),
                                buildString {
                                    append(context.getString(com.merak.R.string.log_broadcast_action))
                                    append(" $ALARM_ACTION\n")
                                    append(context.getString(com.merak.R.string.receive_time_st))
                                    append(" $st_receiveTime\n")
                                    append(context.getString(com.merak.R.string.log_intercept_status))
                                    append(" ")
                                    append(context.getString(com.merak.R.string.log_status_success))
                                }
                            )
                        } catch (e: Exception) {
                            Log.e("HyperThemeService", "记录日志失败", e)
                        } finally {
                            KeepAliveService.requestRefresh(applicationContext)
                        }
                    }
                }
                Intent.ACTION_SCREEN_OFF -> {
                    // 原有逻辑：SCREEN_OFF 用于保活进程存活，无额外处理
                    // 新增逻辑：检查是否有待执行的主题轮换
                    ThemeRotationManager.checkAndPerformPendingRotation(context)
                }
                ACTION_UPDATE_NOTIFICATION, ACTION_REFRESH_NOTIFICATION -> {
                    Log.d("HyperThemeService", "收到通知更新广播: ${intent.action}")
                    KeepAliveService.requestRefresh(context.applicationContext)
                }
            }
        }
    }
```

**注意：** 修改前请先确认当前 `when` 结构中 `Intent.ACTION_SCREEN_OFF` 是否真的为空匹配（可能已在某个位置处理）。如果当前代码中没有 `Intent.ACTION_SCREEN_OFF ->` 分支，直接添加即可。

- [ ] **Step 2: Commit**

```bash
git add app/src/main/java/com/merak/service/ThemeInstallAccessibilityService.kt
git commit -m "feat: integrate theme rotation into SCREEN_OFF broadcast

- Add ThemeRotationManager.checkAndPerformPendingRotation() in SCREEN_OFF handler
- Preserves original keep-alive logic, zero intrusion to ALARM_ACTION handling"
```

---

## Task 4: 修改 AndroidManifest.xml

**Files:**
- Modify: `app/src/main/AndroidManifest.xml`

- [ ] **Step 1: 添加精确闹钟权限**

在现有 `<uses-permission>` 区域末尾（网络权限之后、设备管理器权限之前）添加：

```xml
    <!-- 精确闹钟权限（Android 12+） -->
    <uses-permission android:name="android.permission.SCHEDULE_EXACT_ALARM" />
```

- [ ] **Step 2: 添加 ThemeRotationReceiver 声明**

在 `KeepAliveService` 声明之后、`OptimizationModeReceiver` 声明之前添加：

```xml
        <!-- 主题轮换闹钟接收器 -->
        <receiver
            android:name=".service.ThemeRotationReceiver"
            android:enabled="true"
            android:exported="false">
            <intent-filter>
                <action android:name="com.merak.action.ROTATION_ALARM" />
            </intent-filter>
        </receiver>
```

- [ ] **Step 3: Commit**

```bash
git add app/src/main/AndroidManifest.xml
git commit -m "feat: declare ThemeRotationReceiver and exact alarm permission in manifest"
```

---

## Task 5: 添加字符串资源

**Files:**
- Modify: `app/src/main/res/values/strings.xml`
- Modify: `app/src/main/res/values-en/strings.xml`
- Modify: `app/src/main/res/values-zh-rTW/strings.xml`

- [ ] **Step 1: 在简体中文 strings.xml 中添加**

在文件末尾 `</resources>` 之前插入：

```xml
    <!-- 自动轮换主题 -->
    <string name="rotation_title">自动轮换主题</string>
    <string name="rotation_summary">灭屏时自动切换已安装的历史主题</string>
    <string name="rotation_summary_empty">暂无历史主题，请先安装主题</string>
    <string name="rotation_interval_title">轮换间隔</string>
    <string name="rotation_interval_summary">每 %1$s 自动切换一次主题</string>
    <string name="rotation_order_title">轮换顺序</string>
    <string name="rotation_order_chronological">按时间顺序</string>
    <string name="rotation_order_random">随机抽取</string>
    <string name="rotation_time_minutes">%1$d 分钟</string>
    <string name="rotation_time_1hour">1 小时</string>
    <string name="rotation_time_hours">%1$d 小时</string>
    <string name="rotation_time_hours_minutes">%1$d 小时 %2$d 分钟</string>
    <string name="rotation_notification_title">主题已自动切换</string>
    <string name="rotation_notification_content">已切换至「%1$s」，下次轮换：%2$s后</string>
    <string name="rotation_channel_name">主题轮换</string>
    <string name="rotation_channel_desc">自动轮换主题成功时的通知</string>
    <string name="log_rotation_success">主题自动轮换成功</string>
    <string name="log_rotation_failed">主题轮换失败</string>
    <string name="log_rotation_empty_history">历史记录为空</string>
    <string name="log_rotation_copy_failed">复制文件失败: %1$s</string>
    <string name="log_rotation_apply_failed">applyTheme 返回 false</string>
    <string name="rotation_interval_input_hint">分钟 (≥3)</string>
```

- [ ] **Step 2: 在英文 strings.xml 中添加**

```xml
    <!-- Auto Theme Rotation -->
    <string name="rotation_title">Auto Rotate Theme</string>
    <string name="rotation_summary">Auto-switch installed themes when screen off</string>
    <string name="rotation_summary_empty">No history themes, please install first</string>
    <string name="rotation_interval_title">Rotation Interval</string>
    <string name="rotation_interval_summary">Switch theme every %1$s</string>
    <string name="rotation_order_title">Rotation Order</string>
    <string name="rotation_order_chronological">Chronological</string>
    <string name="rotation_order_random">Random</string>
    <string name="rotation_time_minutes">%1$d minutes</string>
    <string name="rotation_time_1hour">1 hour</string>
    <string name="rotation_time_hours">%1$d hours</string>
    <string name="rotation_time_hours_minutes">%1$d hours %2$d minutes</string>
    <string name="rotation_notification_title">Theme Auto-Switched</string>
    <string name="rotation_notification_content">Switched to "%1$s", next rotation: in %2$s</string>
    <string name="rotation_channel_name">Theme Rotation</string>
    <string name="rotation_channel_desc">Notifications for successful theme rotation</string>
    <string name="log_rotation_success">Theme auto-rotation succeeded</string>
    <string name="log_rotation_failed">Theme rotation failed</string>
    <string name="log_rotation_empty_history">History is empty</string>
    <string name="log_rotation_copy_failed">Copy failed: %1$s</string>
    <string name="log_rotation_apply_failed">applyTheme returned false</string>
    <string name="rotation_interval_input_hint">minutes (≥3)</string>
```

- [ ] **Step 3: 在繁体中文 strings.xml 中添加**

```xml
    <!-- 自動輪換主題 -->
    <string name="rotation_title">自動輪換主題</string>
    <string name="rotation_summary">滅屏時自動切換已安裝的歷史主題</string>
    <string name="rotation_summary_empty">暫無歷史主題，請先安裝主題</string>
    <string name="rotation_interval_title">輪換間隔</string>
    <string name="rotation_interval_summary">每 %1$s 自動切換一次主題</string>
    <string name="rotation_order_title">輪換順序</string>
    <string name="rotation_order_chronological">按時間順序</string>
    <string name="rotation_order_random">隨機抽取</string>
    <string name="rotation_time_minutes">%1$d 分鐘</string>
    <string name="rotation_time_1hour">1 小時</string>
    <string name="rotation_time_hours">%1$d 小時</string>
    <string name="rotation_time_hours_minutes">%1$d 小時 %2$d 分鐘</string>
    <string name="rotation_notification_title">主題已自動切換</string>
    <string name="rotation_notification_content">已切換至「%1$s」，下次輪換：%2$s後</string>
    <string name="rotation_channel_name">主題輪換</string>
    <string name="rotation_channel_desc">自動輪換主題成功時的通知</string>
    <string name="log_rotation_success">主題自動輪換成功</string>
    <string name="log_rotation_failed">主題輪換失敗</string>
    <string name="log_rotation_empty_history">歷史記錄為空</string>
    <string name="log_rotation_copy_failed">複製檔案失敗: %1$s</string>
    <string name="log_rotation_apply_failed">applyTheme 返回 false</string>
    <string name="rotation_interval_input_hint">分鐘 (≥3)</string>
```

- [ ] **Step 4: Commit**

```bash
git add app/src/main/res/values/strings.xml app/src/main/res/values-en/strings.xml app/src/main/res/values-zh-rTW/strings.xml
git commit -m "feat: add auto theme rotation string resources for zh, en, zh-rTW"
```

---

## Task 6: 修改 SettingsPage UI

**Files:**
- Modify: `app/src/main/java/com/merak/ui/page/SettingsPage.kt`

- [ ] **Step 1: 在 SettingsPage 顶部添加导入**

在现有 import 末尾添加：

```kotlin
import com.merak.utils.ThemeRotationManager
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.material3.Slider
import androidx.compose.material3.TextField
```

- [ ] **Step 2: 在 SettingsPage 的状态区域添加轮换相关状态**

在 `optimizationModeEnabled` 状态之后、`showOptimizationDialog` 之前添加：

```kotlin
    // 自动轮换主题状态
    var rotationEnabled by remember {
        mutableStateOf(ThemeRotationManager.isEnabled())
    }
    var rotationInterval by remember {
        mutableStateOf(ThemeRotationManager.getIntervalMinutes())
    }
    var rotationOrderMode by remember {
        mutableStateOf(ThemeRotationManager.getOrderMode())
    }
    val historyEmpty = remember { ThemeHistory.getAll().isEmpty() }
```

- [ ] **Step 3: 在常驻通知保活开关下方、优化模式区块之前，插入自动轮换配置区块**

找到这段代码位置：

```kotlin
            // 优化模式（仅在常驻通知保活开启时显示）
            if (keepAliveEnabled) {
```

在其上方、保活开关 Card 的闭合大括号之后，插入：

```kotlin
            // 自动轮换主题（仅在常驻通知保活开启时显示）
            if (keepAliveEnabled) {
                item {
                    Card(
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        SuperSwitch(
                            title = stringResource(R.string.rotation_title),
                            summary = if (historyEmpty) {
                                stringResource(R.string.rotation_summary_empty)
                            } else {
                                stringResource(R.string.rotation_summary)
                            },
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
                                        return@SuperSwitch
                                    }
                                    rotationEnabled = true
                                    ThemeRotationManager.setEnabled(true)
                                    ThemeRotationManager.scheduleNextRotation(appContext)
                                    Toast.makeText(
                                        context,
                                        context.getString(R.string.rotation_title) + " " + context.getString(
                                            R.string.optimization_mode_enabled_toast
                                        ),
                                        Toast.LENGTH_SHORT
                                    ).show()
                                } else {
                                    rotationEnabled = false
                                    ThemeRotationManager.setEnabled(false)
                                    ThemeRotationManager.cancelRotation(appContext)
                                    Toast.makeText(
                                        context,
                                        context.getString(R.string.rotation_title) + " " + context.getString(
                                            R.string.optimization_mode_disabled_toast
                                        ),
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
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 16.dp, vertical = 12.dp)
                            ) {
                                Text(
                                    text = stringResource(R.string.rotation_interval_title),
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 16.sp,
                                    color = MiuixTheme.colorScheme.onSurface
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = stringResource(
                                        R.string.rotation_interval_summary,
                                        formatIntervalText(context, rotationInterval)
                                    ),
                                    fontSize = 13.sp,
                                    color = MiuixTheme.colorScheme.onSurfaceVariant
                                )
                                Spacer(modifier = Modifier.height(8.dp))
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Slider(
                                        value = rotationInterval.toFloat(),
                                        onValueChange = { value ->
                                            rotationInterval = value.toInt()
                                        },
                                        onValueChangeFinished = {
                                            ThemeRotationManager.setIntervalMinutes(rotationInterval)
                                            if (rotationEnabled) {
                                                ThemeRotationManager.cancelRotation(appContext)
                                                ThemeRotationManager.scheduleNextRotation(appContext)
                                            }
                                        },
                                        valueRange = 3f..2880f,
                                        modifier = Modifier.weight(1f)
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    TextField(
                                        value = rotationInterval.toString(),
                                        onValueChange = { text ->
                                            val parsed = text.toIntOrNull()
                                            if (parsed != null) {
                                                rotationInterval = parsed.coerceIn(3, 2880)
                                                ThemeRotationManager.setIntervalMinutes(rotationInterval)
                                                if (rotationEnabled) {
                                                    ThemeRotationManager.cancelRotation(appContext)
                                                    ThemeRotationManager.scheduleNextRotation(appContext)
                                                }
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
            }
```

- [ ] **Step 4: 在 SettingsPage 底部添加辅助函数**

在 `SettingsPage` 函数的闭合大括号之后（文件末尾之前）添加：

```kotlin
private fun formatIntervalText(context: Context, minutes: Int): String {
    return when {
        minutes < 60 -> context.getString(R.string.rotation_time_minutes, minutes)
        minutes == 60 -> context.getString(R.string.rotation_time_1hour)
        minutes % 60 == 0 -> context.getString(R.string.rotation_time_hours, minutes / 60)
        else -> context.getString(R.string.rotation_time_hours_minutes, minutes / 60, minutes % 60)
    }
}
```

- [ ] **Step 5: 修改关闭保活时的联动逻辑**

在 `disableKeepAlive()` 函数中，在 `KeepAliveService.stop(appContext)` 之前添加：

```kotlin
        // 关闭保活时，同时关闭自动轮换主题
        if (rotationEnabled) {
            rotationEnabled = false
            ThemeRotationManager.setEnabled(false)
            ThemeRotationManager.cancelRotation(appContext)
        }
```

当前 `disableKeepAlive()`：

```kotlin
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
```

修改为：

```kotlin
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
```

- [ ] **Step 6: Commit**

```bash
git add app/src/main/java/com/merak/ui/page/SettingsPage.kt
git commit -m "feat: add auto theme rotation UI to SettingsPage

- Add SuperSwitch for enabling auto rotation
- Add Slider + TextField combo for interval config (3-2880 min)
- Add SuperDropdown for rotation order (chronological/random)
- Link to keep-alive state: auto-disable when keep-alive is turned off
- Show disabled state when theme history is empty"
```

---

## Task 7: 修改 KeepAliveService 联动逻辑

**Files:**
- Modify: `app/src/main/java/com/merak/service/KeepAliveService.kt`

- [ ] **Step 1: 在 KeepAliveService.start() 中，启动后检查是否需要恢复轮换闹钟**

在 `KeepAliveService` 的 `start()` 方法末尾（`ContextCompat.startForegroundService` 调用之后）添加：

```kotlin
            // 如果自动轮换主题已启用，恢复闹钟调度
            if (ThemeRotationManager.isEnabled()) {
                ThemeRotationManager.scheduleNextRotation(appContext)
            }
```

- [ ] **Step 2: Commit**

```bash
git add app/src/main/java/com/merak/service/KeepAliveService.kt
git commit -m "feat: link KeepAliveService with ThemeRotationManager

- Resume rotation alarm scheduling when keep-alive service starts
- Ensures rotation continues after service restart"
```

---

## Task 8: 构建验证

**Files:**
- 全部修改过的文件

- [ ] **Step 1: 运行 Gradle 构建**

```bash
cd /home/swordreforge/Downloads/ThemeStore
./gradlew :app:assembleDebug
```

**Expected:** BUILD SUCCESSFUL

- [ ] **Step 2: 检查无编译错误**

如果编译失败，根据错误信息修复：
- `Slider` / `TextField` 不在正确包中 → 确认 Compose Material3 依赖存在
- `ThemeRotationManager` 未找到 → 检查包名和 import
- 字符串资源缺失 → 确认三语 strings.xml 都已添加

- [ ] **Step 3: Commit（仅在构建成功时）**

```bash
git commit --allow-empty -m "build: verify auto theme rotation compiles successfully"
```

---

## Task 9: 自检清单

- [ ] `ThemeRotationManager` 中 `setPending` 为 `public`，`ThemeRotationReceiver` 和 `ThemeInstallAccessibilityService` 均可调用
- [ ] `ThemeRotationReceiver` 中 `ACTION_ROTATION_ALARM` 引用的是 `ThemeRotationManager` 中定义的常量
- [ ] `ThemeInstallAccessibilityService` 的 `SCREEN_OFF` 处理没有修改 `ALARM_ACTION` 或 `intentFilter` 的优先级
- [ ] `SettingsPage` 中关闭保活时同时调用 `ThemeRotationManager.cancelRotation()`
- [ ] 所有新增字符串在三语资源文件中均已定义
- [ ] `AndroidManifest.xml` 中 `ThemeRotationReceiver` 的 `exported="false"`
- [ ] `ThemeRotationManager.performRotation` 在 `Dispatchers.IO` 中执行 IO 操作
- [ ] `scheduleNextRotation` 使用 `setExactAndAllowWhileIdle` 而非 `setExact`（支持 Doze 模式）

---

## Spec 覆盖检查

| Spec 需求 | 对应 Task |
|---|---|
| AlarmManager 精确闹钟调度 | Task 1 (ThemeRotationManager) |
| 屏幕亮时标记 pending，灭屏执行 | Task 2 (ThemeRotationReceiver) + Task 3 (AccessibilityService) |
| 依赖常驻通知保活开关 | Task 6 (SettingsPage disableKeepAlive) |
| 自定义间隔 >=3 分钟 | Task 6 (Slider + TextField) |
| 按时间/随机两种顺序 | Task 6 (SuperDropdown) + Task 1 (performRotation) |
| 轮换成功发送通知 | Task 1 (sendRotationNotification) |
| 原有保活逻辑零侵入 | Task 3 (SCREEN_OFF 仅追加一行) |
| 主题历史为空时禁用 | Task 6 (historyEmpty 状态) |

---

## 执行方式选择

Plan complete and saved to `docs/superpowers/plans/2026-04-27-auto-theme-rotation-plan.md`.

**Two execution options:**

**1. Subagent-Driven (recommended)** - I dispatch a fresh subagent per task, review between tasks, fast iteration

**2. Inline Execution** - Execute tasks in this session using executing-plans, batch execution with checkpoints

**Which approach?**
