# 历史记录功能增强设计

## 概述
为历史记录添加封面图显示，并将列表布局改为带封面的列表形式。

## 数据结构

```kotlin
data class HistoryItem(
    val fileName: String,
    val sourcePath: String,
    val installTime: Long,
    val coverPath: String? = null  // 封面缩略图缓存路径
)
```

### 存储方式
- SharedPreferences 存储 JSON 格式
- key: `theme_history`
- 新增 `coverPath` 字段

## 功能设计

### 1. 封面图提取
- **触发时机**：首次查看历史记录时自动提取
- **来源**：
  1. 优先从 `mtz/_FILES/wallpaper/default_lock_wallpaper.jpg` 提取
  2. 若不存在则从 `wallpaper/` 随机提取一张
- **mtz处理**：mtz本质是zip，使用ZipInputStream解压
- **缓存**：
  - 保存到 `app缓存目录/thumbnails/{md5(sourcePath)}.jpg`
  - 记录到历史数据的 `coverPath` 字段
  - 重新安装时用新时间戳更新文件名避免冲突

### 2. 布局变更
- 每行显示：左侧封面缩略图 + 右侧文件名、路径、时间
- 封面尺寸：宽度60dp，高度按9:16比例（约106dp）
- 布局使用 Row + Box/Image

```
┌─────────────────────────────────────┐
│ ┌──────────┐  文件名: xxx.mtz       │
│ │          │  路径: /sdcard/xxx      │
│ │   封面   │  2024-01-01 12:00     │
│ │  9:16   │                        │
│ └──────────┘                        │
├─────────────────────────────────────┤
│ ┌──────────┐  文件名: yyy.mtz       │
│ │          │  路径: https://xxx      │
│ │   封面   │  2024-01-02 12:00     │
│ │  9:16   │                        │
│ └──────────┘                        │
└─────────────────────────────────────┘
```

### 3. 数据流
1. 打开历史页面 → 检测无封面的历史项
2. 从mtz提取封面 → 压缩保存到缓存 → 更新 `HistoryItem.coverPath`
3. 页面刷新显示封面图

## 涉及文件

### 修改文件
- `app/src/main/java/com/merak/utils/ThemeHistory.kt` - 添加coverPath字段
- `app/src/main/java/com/merak/ui/page/HistoryPage.kt` - 封面图加载、布局变更
- `app/src/main/java/com/merak/utils/ThemeInstaller.kt` - 提取封面方法

### 新增方法
- `ThemeHistory.updateCoverPath(index, coverPath)` - 更新封面路径
- `ThemeInstaller.extractCover(sourcePath)` - 从mtz提取封面

## 错误处理
- mtz文件不存在/损坏 → 跳过该封面，显示占位图
- 封面图下载失败 → 显示占位图
- 存储空间不足 → 忽略，暂不保存