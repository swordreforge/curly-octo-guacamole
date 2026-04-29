# Rotation Progress Anchor Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Fix countdown display glitch when user changes rotation interval, by storing the absolute alarm trigger time as an anchor point.

**Architecture:** Add a new SharedPreferences field for the next trigger time in ThemeRotationManager, save it during scheduling, and have RotationProgressCard compute progress from that anchor instead of elapsed time.

**Tech Stack:** Kotlin, Android SharedPreferences, Jetpack Compose

---

### Task 1: Data Layer - Add Trigger Time Storage to ThemeRotationManager

**Files:**
- Modify: `app/src/main/java/com/merak/utils/ThemeRotationManager.kt`

- [ ] **Step 1: Add new constant and public API for trigger time**

Add the `PREF_NEXT_TRIGGER_TIME` constant after line 32 (`PREF_LAST_ROTATION_TIME`):

```kotlin
    private const val PREF_LAST_ROTATION_TIME = "theme_rotation_last_time"
    private const val PREF_NEXT_TRIGGER_TIME = "theme_rotation_next_trigger_time"
    private const val CHANNEL_ID = "theme_rotation_channel"
```

Add getter and setter methods after `setLastRotationTime` (after line 71):

```kotlin
    fun setLastRotationTime(time: Long) = PreferenceUtil.setLong(PREF_LAST_ROTATION_TIME, time)

    fun getNextTriggerTime(): Long = PreferenceUtil.getLong(PREF_NEXT_TRIGGER_TIME, 0)

    fun setNextTriggerTime(time: Long) = PreferenceUtil.setLong(PREF_NEXT_TRIGGER_TIME, time)
```

- [ ] **Step 2: Save trigger time in scheduleNextRotation**

In the `scheduleNextRotation` function, the variable `triggerAt` is calculated on line 96:

```kotlin
        val triggerAt = System.currentTimeMillis() + intervalMs
```

Immediately after line 96, add a call to persist the trigger time:

```kotlin
        val triggerAt = System.currentTimeMillis() + intervalMs
        setNextTriggerTime(triggerAt)
```

This ensures that every time the alarm is rescheduled (whether by interval change, completion, or pending rotation), the UI has the latest absolute trigger time.

- [ ] **Step 3: Clear trigger time when rotation is cancelled**

In `cancelRotation` (line 160-173), add a call to clear the trigger time. After line 171 (`alarmManager.cancel(pendingIntent)`):

```kotlin
        alarmManager.cancel(pendingIntent)
        setNextTriggerTime(0)
        setPending(false)
```

- [ ] **Step 4: Verify the build compiles**

Run:
```bash
./gradlew :app:compileDebugKotlin
```

Expected: BUILD SUCCESSFUL with no errors.

- [ ] **Step 5: Commit**

```bash
git add app/src/main/java/com/merak/utils/ThemeRotationManager.kt
git commit -m "feat: add trigger time anchor for accurate progress tracking"
```

---

### Task 2: UI Layer - Update RotationProgressCard to Use Anchor

**Files:**
- Modify: `app/src/main/java/com/merak/ui/page/RotationProgressCard.kt`

- [ ] **Step 1: Replace the LaunchedEffect calculation logic**

Replace the entire `LaunchedEffect` block (lines 55-84) with the anchor-based calculation:

```kotlin
    LaunchedEffect(refreshTick) {
        while (true) {
            val intervalMinutes = ThemeRotationManager.getIntervalMinutes()
            val intervalMs = intervalMinutes * 60_000L
            val nextTriggerTime = ThemeRotationManager.getNextTriggerTime()
            val now = System.currentTimeMillis()

            if (nextTriggerTime > 0) {
                val remainingMs = (nextTriggerTime - now).coerceAtLeast(0)
                val progressValue = if (intervalMs > 0) {
                    ((intervalMs - remainingMs).toFloat() / intervalMs).coerceIn(0f, 1f)
                } else {
                    0f
                }
                progress = progressValue
                val remainingMin = (remainingMs / 60_000).toInt()
                val elapsedMin = ((intervalMs - remainingMs) / 60_000).toInt().coerceAtLeast(0)
                elapsedText = formatTime(elapsedMin)
                remainingText = if (remainingMs == 0L) {
                    "即将触发..."
                } else {
                    formatTime(remainingMin)
                }
                statusText = ""
            } else {
                progress = 0f
                elapsedText = "0m"
                remainingText = "${intervalMinutes}m"
                statusText = "等待首次轮换..."
            }

            currentTheme = ThemeRotationManager.getCurrentFileName()
            if (currentTheme.isEmpty()) {
                currentTheme = "等待轮换"
            }
            delay(1000)
        }
    }
```

Key changes from the original:
- `lastTime` replaced by `nextTriggerTime = ThemeRotationManager.getNextTriggerTime()`
- `remainingMs` computed directly as `nextTriggerTime - now` (not derived from elapsed time)
- `progress` computed as `(intervalMs - remainingMs) / intervalMs`
- When `remainingMs == 0` and trigger time is set, `remainingText` shows "即将触发..." instead of "0m"
- Removed the old "等待首次轮换..." check based on `lastTime == 0`, now based on `nextTriggerTime == 0`

- [ ] **Step 2: Verify the build compiles**

Run:
```bash
./gradlew :app:compileDebugKotlin
```

Expected: BUILD SUCCESSFUL with no errors.

- [ ] **Step 3: Commit**

```bash
git add app/src/main/java/com/merak/ui/page/RotationProgressCard.kt
git commit -m "ui: use trigger time anchor for countdown progress calculation"
```

---

## Self-Review

### Spec Coverage
- [x] New `PREF_NEXT_TRIGGER_TIME` constant - Task 1, Step 1
- [x] `setNextTriggerTime` and `getNextTriggerTime` API - Task 1, Step 1
- [x] `scheduleNextRotation` saves `triggerAt` - Task 1, Step 2
- [x] UI uses `nextTriggerTime` for calculation - Task 2, Step 1
- [x] Progress = `(intervalMs - remainingMs) / intervalMs` - Task 2, Step 1
- [x] Remaining time = `max(0, nextTriggerTime - now)` - Task 2, Step 1
- [x] Display "即将触发..." when remaining is 0 - Task 2, Step 1

### Placeholder Scan
- No "TBD", "TODO", or "fill in later" found.
- All code blocks contain complete, copy-pasteable implementations.

### Type Consistency
- `getNextTriggerTime()` returns `Long` - used consistently in both files.
- `setNextTriggerTime(time: Long)` accepts `Long` - `triggerAt` is `Long`.
- `intervalMs` is `Long` in both files.
- `coerceAtLeast(0)` on `Long` values - correct.
- `progress` is `mutableFloatStateOf(0f)` - `coerceIn(0f, 1f)` returns `Float` - correct.

### No Placeholders Found
- All steps contain exact code and commands.
- No references to undefined types or methods.
