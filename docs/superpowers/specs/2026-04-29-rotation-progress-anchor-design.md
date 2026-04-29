# Rotation Progress Anchor Design

## 1. 问题背景
- 当前 `RotationProgressCard` 通过 `System.currentTimeMillis() - lastRotationTime` 计算进度和剩余时间。
- 用户调整时间设置时，`lastRotationTime` 未改变，导致 UI 显示瞬间跳变或错误（进度超 100%、剩余时间变为 0）。
- 缺乏对 AlarmManager 实际调度时间的感知，无法体现 Doze 模式下的闹钟推迟情况。

## 2. 核心方案：目标时间锚点法
不再依赖“过去的时间点”计算进度，而是存储闹钟的“绝对触发时间”（Target Trigger Time）作为锚点。

## 3. 架构变更

### 3.1 数据层 (ThemeRotationManager)
- **新增常量**: `private const val PREF_NEXT_TRIGGER_TIME = "theme_rotation_next_trigger_time"`
- **新增接口**:
  - `fun setNextTriggerTime(time: Long)`
  - `fun getNextTriggerTime(): Long`
- **修改 `scheduleNextRotation`**:
  - 在确定 `triggerAt` (即 `System.currentTimeMillis() + intervalMs`) 后，同步调用 `setNextTriggerTime(triggerAt)`。
  - 此操作确保每次闹钟调度更新时，数据层都拥有最新的绝对触发时间。

### 3.2 表现层 (RotationProgressCard)
- **数据获取**:
  - `nextTriggerTime = ThemeRotationManager.getNextTriggerTime()`
  - `intervalMs = ThemeRotationManager.getIntervalMinutes() * 60_000L`
  - `now = System.currentTimeMillis()`
- **计算逻辑**:
  1. **剩余时间 (`remainingMs`)**: `max(0, nextTriggerTime - now)`
     - 若 `nextTriggerTime` 为 0 (未调度)，则视为 0 或显示"等待中"。
  2. **进度 (`progress`)**:
     - `progress = (intervalMs - remainingMs).toFloat() / intervalMs`
     - 限制在 `[0f, 1f]` 之间。
  3. **文本显示**:
     - `remainingText`: 将 `remainingMs` 格式化为人类可读字符串。
     - 若 `remainingMs == 0` 且闹钟未触发，显示 "即将触发..."。

## 4. 优势
- **状态同步**: 无论用户在 Settings 页面如何修改间隔时间，只要 `scheduleNextRotation` 被调用，UI 立即读取最新的锚点时间，显示瞬间恢复正常，不再出现进度突变。
- **系统延迟感知**: 即使系统推迟闹钟（Doze 模式），UI 也能如实显示“已超时”或“剩余 0m”，提示用户系统状态。
