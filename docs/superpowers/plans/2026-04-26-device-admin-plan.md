# 设备管理器 (Device Owner) 实现计划

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** 通过 Sizuku 授权将应用激活为设备管理器 (Device Owner)，实现更强的应用保护能力。

**Architecture:** 创建 DeviceAdminReceiver、配置 XML、设置页面开关，通过 Sizuku 授权流程激活。

**Tech Stack:** Kotlin, Android DeviceAdminReceiver, DevicePolicyManager, SharedPreferences

---

### Task 1: 创建 DeviceAdminReceiver

**Files:**
- Create: `app/src/main/java/com/merak/service/DeviceAdminReceiver.kt`

- [ ] **Step 1: 创建 DeviceAdminReceiver 类**

```kotlin
package com.merak.service

import android.app.admin.DeviceAdminReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class DeviceAdminReceiver : DeviceAdminReceiver() {

    override fun onEnabled(context: Context, intent: Intent) {
        super.onEnabled(context, intent)
        Log.d("DeviceAdmin", "已激活为设备管理器")
        Toast.makeText(context, "设备管理器已激活", Toast.LENGTH_SHORT).show()
    }

    override fun onDisabled(context: Context, intent: Intent) {
        super.onDisabled(context, intent)
        Log.d("DeviceAdmin", "已禁用设备管理器")
        Toast.makeText(context, "设备管理器已禁用", Toast.LENGTH_SHORT).show()
    }
}
```

- [ ] **Step 2: Commit**

```bash
git add app/src/main/java/com/merak/service/DeviceAdminReceiver.kt
git commit -m "feat: add DeviceAdminReceiver for device owner"
```

---

### Task 2: 创建 device_admin.xml 配置

**Files:**
- Create: `app/src/main/res/xml/device_admin.xml`

- [ ] **Step 1: 创建 xml 目录并添加配置文件**

检查 `res` 目录下是否有 `xml` 目录：
```bash
ls app/src/main/res/xml/
```

如果不存在，创建它并添加 `device_admin.xml`：
```xml
<?xml version="1.0" encoding="utf-8"?>
<device-admin xmlns:android="http://schemas.android.com/apk/res/android">
    <uses-policies>
        <force-lock />
        <wipe-data />
        <reset-password />
    </uses-policies>
</device-admin>
```

- [ ] **Step 2: Commit**

```bash
git add app/src/main/res/xml/device_admin.xml
git commit -m "feat: add device_admin.xml policy config"
```

---

### Task 3: 更新 AndroidManifest.xml

**Files:**
- Modify: `app/src/main/AndroidManifest.xml`

- [ ] **Step 1: 添加 receiver 声明和权限**

在 `<application>` 标签内添加：
```xml
<receiver
    android:name=".service.DeviceAdminReceiver"
    android:permission="android.permission.BIND_DEVICE_ADMIN"
    android:exported="true">
    <meta-data
        android:name="android.app.device_admin"
        android:resource="@xml/device_admin" />
    <intent-filter>
        <action android:name="android.app.action.DEVICE_ADMIN_ENABLED" />
        <action android:name="android.app.action.DEVICE_ADMIN_DISABLED" />
    </intent-filter>
</receiver>
```

添加权限：
```xml
<uses-permission android:name="android.permission.BIND_DEVICE_ADMIN" />
```

- [ ] **Step 2: Commit**

```bash
git add app/src/main/AndroidManifest.xml
git commit -m "feat: add DeviceAdminReceiver to manifest"
```

---

### Task 4: 添加字符串资源

**Files:**
- Modify: `app/src/main/res/values/strings.xml`
- Modify: `app/src/main/res/values-en/strings.xml`
- Modify: `app/src/main/res/values-zh-rTW/strings.xml`

- [ ] **Step 1: 添加中文字符串**

```xml
<string name="device_admin_title">设备管理器</string>
<string name="device_admin_summary">通过 Sizuku 激活设备管理器以增强应用保护</string>
<string name="device_admin_enabled">设备管理器已激活</string>
<string name="device_admin_disabled">设备管理器已禁用</string>
<string name="device_admin_activate">激活设备管理器</string>
<string name="device_admin_sizuku_not_found">请先安装 Sizuku 应用</string>
```

- [ ] **Step 2: 添加英文字符串**

```xml
<string name="device_admin_title">Device Manager</string>
<string name="device_admin_summary">Activate device manager via Sizuku for enhanced app protection</string>
<string name="device_admin_enabled">Device manager enabled</string>
<string name="device_admin_disabled">Device manager disabled</string>
<string name="device_admin_activate">Activate Device Manager</string>
<string name="device_admin_sizuku_not_found">Please install Sizuku first</string>
```

- [ ] **Step 3: Commit**

```bash
git add app/src/main/res/values*/strings.xml
git commit -m "feat: add device admin strings"
```

---

### Task 5: 在设置页面添加开关

**Files:**
- Modify: `app/src/main/java/com/merak/ui/page/SettingsPage.kt`

- [ ] **Step 1: 添加开关 UI 代码**

在设置页面添加新的设置项（在防卸载保护之后）：

```kotlin
import android.app.admin.DevicePolicyManager
import android.content.ComponentName

// 添加状态变量
var deviceAdminEnabled by remember {
    mutableStateOf(
        devicePolicyManager.isAdminActive(deviceAdminComponent)
    )
}

val deviceAdminComponent = ComponentName(
    context,
    DeviceAdminReceiver::class.java
)
val devicePolicyManager = context.getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager

// UI 添加设置项
SettingsItem(
    title = stringResource(R.string.device_admin_title),
    summary = stringResource(R.string.device_admin_summary),
    leading = {
        Switch(
            checked = deviceAdminEnabled,
            onCheckedChange = { checked ->
                if (checked) {
                    val intent = Intent(DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN)
                    intent.putExtra(DevicePolicyManager.EXTRA_DEVICE_ADMIN, deviceAdminComponent)
                    intent.putExtra(DevicePolicyManager.EXTRA_ADD_EXPLANATION, 
                        context.getString(R.string.device_admin_summary))
                    try {
                        activity.startActivity(intent)
                    } catch (e: Exception) {
                        Toast.makeText(context, 
                            context.getString(R.string.device_admin_sizuku_not_found),
                            Toast.LENGTH_SHORT).show()
                    }
                } else {
                    devicePolicyManager.removeActiveAdmin(deviceAdminComponent)
                    deviceAdminEnabled = false
                }
            }
        )
    }
)
```

- [ ] **Step 2: 在 onResume 中更新状态**

```kotlin
// 在 SettingsPage 的 onResume 或 lifecycle 中更新状态
LaunchedEffect(Unit) {
    deviceAdminEnabled = devicePolicyManager.isAdminActive(deviceAdminComponent)
}
```

- [ ] **Step 3: Commit**

```bash
git add app/src/main/java/com/merak/ui/page/SettingsPage.kt
git commit -m "feat: add device admin switch to settings"
```

---

### Task 6: 测试和验证

**Files:**
- None

- [ ] **Step 1: 编译测试**

```bash
./gradlew assembleDebug --no-daemon
```

预期：编译成功

- [ ] **Step 2: 验证功能**

1. 在设置页面找到"设备管理器"开关
2. 点击开关，验证是否调用 Sizuku 授权
3. 授权后验证开关状态变化