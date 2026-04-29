# Screen-Off Rotation Implementation Design

## 1. 问题背景
"不亮屏才换" (Wait for Screen Off) 功能当前处于 Dead Feature 状态：
- 设置页有开关，状态已保存，但执行逻辑 (`ThemeRotationReceiver`) 完全忽略该值。
- 无论屏幕亮灭，闹钟一到点就会强制亮屏并执行轮换，打断用户。

## 2. 核心方案：条件挂起 (Conditional Deferral)
引入"挂起-执行"机制。当闹钟触发且需要等待息屏时，不执行轮换，而是标记为 Pending 状态；当条件满足（息屏或用户切换回立即模式）时，再执行轮换并调度下一次闹钟。

## 3. 架构变更

### 3.1 闹钟接收器 (ThemeRotationReceiver)
**当前逻辑**: 收到闹钟 -> 获取 WakeLock -> 立即执行 `performRotation` -> 调度下一次。
**新逻辑**:
1. 检查 `isWithoutScreenOff()`。
2. **分支 A (需要等待息屏 & 屏幕当前亮着)**:
   - 设置 `isPending(true)`。
   - 发送广播 `ACTION_ROTATION_PENDING_SET` 通知辅助服务更新内存状态。
   - **不调度**下一次闹钟 (避免产生"幽灵闹钟")。
   - 取消进度通知 (或更新为"等待息屏中")。
3. **分支 B (立即执行 / 屏幕已灭)**:
   - 获取 WakeLock。
   - 执行 `performRotation`。
   - `finally` 块中调度下一次闹钟 (`scheduleNextRotation`)。

### 3.2 辅助服务 (ThemeInstallAccessibilityService)
- 当前已实现 `ACTION_ROTATION_PENDING_SET` 接收逻辑和内存变量 `rotationPending`。
- 当前已实现 `ACTION_SCREEN_OFF` 分支检查 `rotationPending` 并执行。
- **无需修改**，现有的跨进程同步机制已就绪。

### 3.3 设置页面 (SettingsPage)
**场景**: 用户在"等待息屏"模式下挂起了一个任务，随后切换回"立即轮换"。
**新逻辑**:
1. 当 `rotationWithoutScreenOff` 开关从 `true` 变为 `false` 时。
2. 检查 `ThemeRotationManager.isPending()`。
3. 如果为 `true`:
   - 立即调用 `ThemeRotationManager.checkAndPerformPendingRotation(context)`。
   - 显示 Toast: "已切换为立即轮换，当前待执行任务将立即运行"。

### 3.4 UI 状态 (RotationProgressCard)
- 当 `isPending()` 为 true 且 `getNextTriggerTime()` <= 当前时间时。
- 显示文案从 "剩余: 0m" 改为 "等待息屏中..."。

## 4. 边界情况处理
- **长时间不关屏**: 任务一直 Pending，直到息屏或用户干预。进度条卡在满格提示等待。
- **Pending 期间关闭总开关**: `cancelRotation` 会清除 Pending 标记，任务取消。
- **Pending 期间重启**: `isPending` 保存在 SharedPreferences，重启后服务恢复读取，息屏时仍可触发。
