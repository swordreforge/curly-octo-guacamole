# 防卸载功能设计

## 概述

通过无障碍服务监听系统事件，当检测到本应用的卸载/停用/强制停止操作时，自动点击"取消"按钮阻止操作。

## 触发条件

同时满足以下条件才拦截：
1. 窗口文本包含危险关键词（"卸载"/"停用"/"强制停止"）
2. **同时**包含本应用包名 `com.merak` 或应用名称

## 监听的事件

- `TYPE_WINDOW_STATE_CHANGED` - 窗口状态变化
- `TYPE_WINDOW_CONTENT_CHANGED` - 窗口内容变化

## 拦截操作

| 操作类型 | 检测关键词 | 点击按钮 |
|---------|-----------|----------|
| 卸载 | 卸载 / uninstall | 取消 / cancel |
| 停用 | 停用 / disable | 取消 / cancel |
| 强制停止 | 强制停止 / force stop | 确定 / confirm / OK |

## 实现方案

### 核心逻辑
```kotlin
override fun onAccessibilityEvent(event: AccessibilityEvent?) {
    if (event?.eventType !in listOf(TYPE_WINDOW_STATE_CHANGED, TYPE_WINDOW_CONTENT_CHANGED)) {
        return
    }

    // 获取窗口文本
    val text = event.text?.joinToString("") ?: return
    val packageName = event.packageName?.toString() ?: return

    // 检查是否包含包名
    if (!packageName.contains("com.merak") && !text.contains("com.merak")) {
        return
    }

    // 检查危险关键词
    val isDangerousAction = DANGER_KEYWORDS.any { text.contains(it) }
    if (!isDangerousAction) return

    // 查找并点击取消按钮
    val canceled = findAndClickCancelButton()
    if (canceled) {
        logProtection()
    }
}
```

### 按钮查找策略
- 递归遍历窗口节点
- 匹配文本包含"取消"/"cancel"的按钮
- 使用 `AccessibilityNodeInfo.performAction(ACTION_CLICK)`

## 配置项

- `enable_uninstall_protection` - Boolean，默认 false，用户在设置页面手动开启

## 修改文件

1. `ThemeInstallAccessibilityService.kt` - 添加事件监听和拦截逻辑
2. `SettingsPage.kt` - 添加开关 UI
3. `PreferenceUtil.kt` - 添加配置项
4. `strings.xml` (zh/en/zh-rTW) - 添加相关字符串

## 日志记录

使用现有的 `LogManager` 记录拦截事件：
- 操作类型
- 触发时间
- 拦截结果