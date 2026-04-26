# 设备管理器 (Device Owner) 功能设计

## 概述

通过 Sizuku 授权将应用激活为设备管理器 (Device Owner)，实现更强的应用保护能力。

## 功能

1. 在设置页面添加"设备管理器"开关
2. 用户点击后调用 Sizuku 授权流程
3. 成功后应用成为 Device Owner
4. 支持锁屏、强制锁定等设备管理策略

## 实现方案

### 1. 创建 DeviceAdminReceiver

```kotlin
class DeviceAdminReceiver : DeviceAdminReceiver() {
    override fun onEnabled(context: Context, intent: Intent) {
        super.onEnabled(context, intent)
        Log.d("DeviceAdmin", "已激活为设备管理器")
    }

    override fun onDisabled(context: Context, intent: Intent) {
        super.onDisabled(context, intent)
        Log.d("DeviceAdmin", "已禁用设备管理器")
    }
}
```

### 2. 创建 device_admin.xml

```xml
<device-admin xmlns:android="http://schemas.android.com/apk/res/android">
    <uses-policies>
        <force-lock />
        <wipe-data />
        <reset-password />
    </uses-policies>
</device-admin>
```

### 3. 在 AndroidManifest.xml 中声明

```xml
<receiver
    android:name=".service.DeviceAdminReceiver"
    android:permission="android.permission.BIND_DEVICE_ADMIN">
    <meta-data
        android:name="android.app.device_admin"
        android:resource="@xml/device_admin" />
    <intent-filter>
        <action android:name="android.app.action.DEVICE_ADMIN_ENABLED" />
    </intent-filter>
</receiver>
```

### 4. 设置页面 UI

添加开关/按钮组件，显示激活状态，用户点击后调用 Sizuku 授权。

### 5. Sizuku 激活逻辑

```kotlin
fun activateDeviceAdmin(context: Context) {
    val intent = Intent(DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN)
    intent.putExtra(DevicePolicyManager.EXTRA_DEVICE_ADMIN, deviceAdminComponent)
    intent.putExtra(DevicePolicyManager.EXTRA_ADD_EXPLANATION, "启用设备管理器以保护应用")
    context.startActivity(intent)
}
```

## 数据流

```
设置页面 → 用户点击激活按钮
    ↓
调用 Sizuku 授权
    ↓
用户授权 → 应用成为 Device Owner
    ↓
保存激活状态到 SharedPreferences
```

## 配置项

- `device_admin_enabled` - Boolean，默认 false

## 修改文件

1. `app/src/main/java/com/merak/service/DeviceAdminReceiver.kt` - 新建
2. `app/src/main/res/xml/device_admin.xml` - 新建
3. `app/src/main/AndroidManifest.xml` - 修改
4. `app/src/main/java/com/merak/ui/page/SettingsPage.kt` - 添加开关
5. `app/src/main/res/values/strings.xml` - 添加字符串

## 与无障碍防卸载的关系

- 两者同时生效
- 无障碍：通过监听窗口自动点击"取消"
- Device Owner：系统级保护，卸载需要先禁用设备管理器
- 双重保护，更安全