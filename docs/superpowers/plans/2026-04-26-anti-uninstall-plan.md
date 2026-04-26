# 防卸载功能实现计划

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** 通过无障碍服务监听系统事件，当检测到本应用的卸载/停用/强制停止操作时，自动点击"取消"按钮阻止操作。

**Architecture:** 在 `ThemeInstallAccessibilityService` 中添加 `onAccessibilityEvent` 监听，使用 `AccessibilityNodeInfo` 递归查找并点击"取消"按钮。设置页面添加开关控制。

**Tech Stack:** Kotlin, Android AccessibilityService, SharedPreferences

---

### Task 1: 添加配置项

**Files:**
- Modify: `app/src/main/java/com/merak/utils/PreferenceUtil.kt`
- Test: None

- [ ] **Step 1: 在 PreferenceUtil.kt 添加配置项**

```kotlin
// 在 PreferenceUtil.kt 中添加
fun getBoolean(key: String, defaultValue: Boolean = false): Boolean =
    prefs.getBoolean(key, defaultValue)

fun setBoolean(key: String, value: Boolean) {
    prefs.edit().putBoolean(key, value).apply()
}
```

- [ ] **Step 2: 定义配置常量**

在 `PreferenceUtil.kt` 中添加：
```kotlin
const val KEY_UNINSTALL_PROTECTION = "enable_uninstall_protection"
```

---

### Task 2: 添加字符串资源

**Files:**
- Modify: `app/src/main/res/values/strings.xml`
- Modify: `app/src/main/res/values-en/strings.xml`
- Modify: `app/src/main/res/values-zh-rTW/strings.xml`

- [ ] **Step 1: 添加中文字符串**

在 `values/strings.xml` 末尾 `</resources>` 前添加：
```xml
<string name="uninstall_protection_title">防卸载保护</string>
<string name="uninstall_protection_summary">开启后可通过无障碍服务阻止卸载、停用和强制停止</string>
<string name="uninstall_protection_toast">防卸载保护已开启</string>
<string name="log_uninstall_blocked">已拦截卸载操作</string>
<string name="log_disable_blocked">已拦截停用操作</string>
<string name="log_force_stop_blocked">已拦截强制停止操作</string>
```

- [ ] **Step 2: 添加英文字符串**

在 `values-en/strings.xml` 末尾添加：
```xml
<string name="uninstall_protection_title">Anti-Uninstall Protection</string>
<string name="uninstall_protection_summary">When enabled, prevents uninstall, disable and force stop via accessibility service</string>
<string name="uninstall_protection_toast">Anti-uninstall protection enabled</string>
<string name="log_uninstall_blocked">Uninstall blocked</string>
<string name="log_disable_blocked">Disable blocked</string>
<string name="log_force_stop_blocked">Force stop blocked</string>
```

- [ ] **Step 3: 添加繁体中文字符串**

在 `values-zh-rTW/strings.xml` 末尾添加：
```xml
<string name="uninstall_protection_title">防卸載保護</string>
<string name="uninstall_protection_summary">開啟後可透過無障礙服務阻止卸載、停用和強制停止</string>
<string name="uninstall_protection_toast">防卸載保護已開啟</string>
<string name="log_uninstall_blocked">已攔截卸載操作</string>
<string name="log_disable_blocked">已攔截停用操作</string>
<string name="log_force_stop_blocked">已攔截強制停止操作</string>
```

---

### Task 3: 在设置页面添加开关

**Files:**
- Modify: `app/src/main/java/com/merak/ui/page/SettingsPage.kt`

- [ ] **Step 1: 添加开关 UI 代码**

在 SettingsPage.kt 中找到现有的设置项区域，添加：

```kotlin
// 在设置项列表中添加
SettingsItem(
    title = stringResource(R.string.uninstall_protection_title),
    summary = stringResource(R.string.uninstall_protection_summary),
    leading = {
        Switch(
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
                    return@Switch
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
)
```

- [ ] **Step 2: 添加缺失字符串**

确保 `strings.xml` 中有 `accessibility_not_enabled` 字符串：
```xml
<string name="accessibility_not_enabled">请先开启无障碍权限</string>
```

---

### Task 4: 实现无障碍事件监听和拦截

**Files:**
- Modify: `app/src/main/java/com/merak/service/ThemeInstallAccessibilityService.kt`

- [ ] **Step 1: 添加companion object中的配置检查方法**

在 `ThemeInstallAccessibilityService` 的 companion object 中添加：

```kotlin
@JvmStatic
fun isUninstallProtectionEnabled(context: Context): Boolean {
    return try {
        PreferenceUtil.getBoolean(PreferenceUtil.KEY_UNINSTALL_PROTECTION, false)
    } catch (e: Exception) {
        false
    }
}
```

- [ ] **Step 2: 实现 onAccessibilityEvent 监听**

替换现有的空实现：

```kotlin
override fun onAccessibilityEvent(event: AccessibilityEvent?) {
    // 检查防卸载保护是否开启
    if (!isUninstallProtectionEnabled(applicationContext)) {
        return
    }

    val eventType = event?.eventType ?: return
    if (eventType != AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED &&
        eventType != AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED) {
        return
    }

    // 获取窗口文本和包名
    val text = event.text?.joinToString("") ?: return
    val packageName = event.packageName?.toString() ?: return

    // 检查是否包含本应用包名
    if (!packageName.contains("com.merak") && !text.contains("com.merak")) {
        return
    }

    // 检查危险关键词
    val actionType = detectDangerousAction(text)
    if (actionType == null) return

    // 查找并点击取消按钮
    val clicked = findAndClickCancelButton(rootInActiveWindow)
    if (clicked) {
        Log.d("AntiUninstall", "Successfully blocked: $actionType")
        logProtection(actionType)
    }
}
```

- [ ] **Step 3: 添加检测危险操作方法**

```kotlin
private fun detectDangerousAction(text: String): String? {
    val lowerText = text.lowercase()
    return when {
        lowerText.contains("卸裁") || lowerText.contains("uninstall") -> "uninstall"
        lowerText.contains("停用") || lowerText.contains("disable") -> "disable"
        lowerText.contains("强制停止") || lowerText.contains("force stop") -> "force_stop"
        else -> null
    }
}
```

- [ ] **Step 4: 添加查找并点击取消按钮方法**

```kotlin
private fun findAndClickCancelButton(root: AccessibilityNodeInfo?): Boolean {
    if (root == null) return false

    // 检查当前节点是否是取消���钮
    val nodeText = root.text?.toString()?.lowercase() ?: ""
    val nodeContentDesc = root.contentDescription?.toString()?.lowercase() ?: ""

    val isCancelButton = nodeText.contains("取消") || nodeText.contains("cancel") ||
            nodeContentDesc.contains("取消") || nodeContentDesc.contains("cancel")

    if (isCancelButton && root.isClickable) {
        val result = root.performAction(AccessibilityNodeInfo.ACTION_CLICK)
        root.recycle()
        return result
    }

    // 递归检查子节点
    for (i in 0 until root.childCount) {
        val child = root.getChild(i) ?: continue
        if (findAndClickCancelButton(child)) {
            root.recycle()
            return true
        }
        child.recycle()
    }

    root.recycle()
    return false
}
```

- [ ] **Step 5: 添加日志记录方法**

```kotlin
private fun logProtection(actionType: String) {
    try {
        val message = when (actionType) {
            "uninstall" -> getString(R.string.log_uninstall_blocked)
            "disable" -> getString(R.string.log_disable_blocked)
            "force_stop" -> getString(R.string.log_force_stop_blocked)
            else -> "Unknown action blocked"
        }
        LogManager.log(
            applicationContext,
            LogManager.LogType.PROTECTION,
            message
        )
    } catch (e: Exception) {
        Log.e("AntiUninstall", "Failed to log: $e")
    }
}
```

- [ ] **Step 6: 添加必要的import**

```kotlin
import com.merak.utils.LogManager
import com.merak.utils.PreferenceUtil
import android.view.accessibility.AccessibilityNodeInfo
```

---

### Task 5: 测试和验证

**Files:**
- None

- [ ] **Step 1: 编译测试**

```bash
./gradlew assembleDebug --no-daemon
```

- [ ] **Step 2: 验证功能**

1. 在设置页面开启"防卸载保护"开关
2. 尝试卸载应用，观察是否自动取消
3. 检查日志是否正确记录