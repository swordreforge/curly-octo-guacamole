# ThemeStore 历史记录功能设计

## 概述
记录每次成功安装的主题，供用户快速查看和重新安装。

## 数据结构

```kotlin
data class ThemeHistoryItem(
    val fileName: String,      // 文件名
    val sourcePath: String,    // 来源路径（本地文件路径或下载URL）
    val installTime: Long       // 安装时间戳
)
```

### 存储方式
- **SharedPreferences** 存储 JSON 格式的列表
- key: `theme_history`

## 功能设计

### 1. 记录历史
- 每次 `ThemeInstaller` 成功安装后，记录一条历史
- `ThemeHistory.add(historyItem)`

### 2. 历史页面
- 入口：首页底部导航"历史"按钮
- 列表展示：每行显示文件名、路径、时间
- 点击条目 → 重新调用 `quickInstall`
- 左滑删除单条记录

### 3. 数据流
1. `ThemeInstaller.kt` → 安装成功后回调
2. `ThemeHistory.kt` → 写入存储
3. `HistoryPage.kt` → 读取并展示
4. 点击条目 → 调用 `quickInstall(sourcePath)`

## 涉及文件

### 新增文件
- `app/src/main/java/com/merak/utils/ThemeHistory.kt`
- `app/src/main/java/com/merak/ui/page/HistoryPage.kt`

### 修改文件
- `app/src/main/java/com/merak/utils/ThemeInstaller.kt` - 安装成功后写入历史
- `app/src/main/java/com/merak/ui/Router.kt` - 添加路由
- `app/src/main/java/com/merak/ui/page/MainPage.kt` - 底部导航

## 界面布局

```
┌─────────────────────────────┐
│  历史记录              [清空] │
├─────────────────────────────┤
│ 文件名: xxx.mtz          │
│ 路径: /sdcard/xxx       │
│ 2024-01-01 12:00         │
├─────────────────────────────┤
│ 文件名: xxx.mtz          │
│ 路径: https://xxx         │
│ 2024-01-02 12:00         │
├─────────────────────────────┤
│ ...                         │
└─────────────────────────────┘
```