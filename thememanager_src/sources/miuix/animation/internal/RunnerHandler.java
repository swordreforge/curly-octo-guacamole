package miuix.animation.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import miuix.animation.IAnimTarget;
import miuix.animation.ViewTarget;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.FloatProperty;
import miuix.animation.utils.LinkNode;
import miuix.animation.utils.LogUtils;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
class RunnerHandler extends Handler {
    public static final int ANIM_MSG_CLEAN = 5;
    public static final int ANIM_MSG_RUNNER_RUN = 3;
    public static final int ANIM_MSG_SETUP = 1;
    public static final int ANIM_MSG_SET_TO = 4;
    public static final int ANIM_MSG_UPDATE = 2;
    private final List<IAnimTarget> mDelList;
    private int mFrameCount;
    private boolean mIsTaskRunning;
    private long mLastRun;
    private final Map<IAnimTarget, AnimOperationInfo> mOpMap;
    private boolean mRunnerStart;
    private final int[] mSplitInfo;
    private boolean mStart;
    private final List<AnimTask> mTaskList;
    private long mTotalT;
    private final List<TransitionInfo> mTransList;
    private final Map<IAnimTarget, TransitionInfo> mTransMap;
    private final Set<IAnimTarget> runningTarget;

    private static class SetToInfo {
        AnimState state;
        IAnimTarget target;

        private SetToInfo() {
        }
    }

    public RunnerHandler(@lvui Looper looper) {
        super(looper);
        this.runningTarget = new HashSet();
        this.mOpMap = new ConcurrentHashMap();
        this.mTransMap = new HashMap();
        this.mTaskList = new ArrayList();
        this.mDelList = new ArrayList();
        this.mTransList = new ArrayList();
        this.mLastRun = 0L;
        this.mTotalT = 0L;
        this.mFrameCount = 0;
        this.mSplitInfo = new int[2];
    }

    private void addAnimTask(List<TransitionInfo> list, int i2, int i3) {
        Iterator<TransitionInfo> it = list.iterator();
        while (it.hasNext()) {
            for (AnimTask animTask : it.next().animTasks) {
                AnimTask taskOfMinCount = getTaskOfMinCount();
                if (taskOfMinCount == null || (this.mTaskList.size() < i3 && taskOfMinCount.getTotalAnimCount() + animTask.getAnimCount() > i2)) {
                    this.mTaskList.add(animTask);
                } else {
                    taskOfMinCount.addToTail(animTask);
                }
            }
        }
    }

    private <T extends LinkNode> void addToMap(IAnimTarget iAnimTarget, T t2, Map<IAnimTarget, T> map) {
        T t3 = map.get(iAnimTarget);
        if (t3 == null) {
            map.put(iAnimTarget, t2);
        } else {
            t3.addToTail(t2);
        }
    }

    private static void doSetOperation(AnimTask animTask, AnimStats animStats, UpdateInfo updateInfo, AnimOperationInfo animOperationInfo) {
        List<FloatProperty> list;
        byte b2 = updateInfo.animInfo.op;
        if (AnimTask.isRunning(b2) && animOperationInfo.op != 0 && (((list = animOperationInfo.propList) == null || list.contains(updateInfo.property)) && AnimTask.isRunning(updateInfo.animInfo.op))) {
            animOperationInfo.usedCount++;
            byte b3 = animOperationInfo.op;
            if (b3 == 3) {
                if (updateInfo.animInfo.targetValue != Double.MAX_VALUE) {
                    AnimInfo animInfo = updateInfo.animInfo;
                    animInfo.value = animInfo.targetValue;
                }
                animTask.animStats.endCount++;
                animStats.endCount++;
            } else if (b3 == 4) {
                animTask.animStats.cancelCount++;
                animStats.cancelCount++;
            }
            updateInfo.setOp(animOperationInfo.op);
            TransitionInfo.decreaseStartCountForDelayAnim(animTask, animStats, updateInfo, b2);
        }
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("---- RunnerHandler handleUpdate doSetOperation " + ((int) b2) + " taskInfo " + animTask.info, new Object[0]);
        }
    }

    private void doSetup() {
        for (TransitionInfo transitionInfoRemove : this.mTransMap.values()) {
            this.runningTarget.add(transitionInfoRemove.target);
            do {
                transitionInfoRemove.target.animManager.setupTransition(transitionInfoRemove);
                transitionInfoRemove = transitionInfoRemove.remove();
            } while (transitionInfoRemove != null);
        }
        this.mTransMap.clear();
        if (this.mRunnerStart) {
            return;
        }
        this.mRunnerStart = true;
        AnimRunner.getInst().start();
    }

    private AnimTask getTaskOfMinCount() {
        AnimTask animTask = null;
        int i2 = Integer.MAX_VALUE;
        for (AnimTask animTask2 : this.mTaskList) {
            int totalAnimCount = animTask2.getTotalAnimCount();
            if (totalAnimCount < i2) {
                animTask = animTask2;
                i2 = totalAnimCount;
            }
        }
        return animTask;
    }

    private int getTotalAnimCount() {
        Iterator<IAnimTarget> it = this.runningTarget.iterator();
        int totalAnimCount = 0;
        while (it.hasNext()) {
            totalAnimCount += it.next().animManager.getTotalAnimCount();
        }
        return totalAnimCount;
    }

    private static boolean handleSetTo(AnimTask animTask, AnimStats animStats, UpdateInfo updateInfo) {
        if (!AnimValueUtils.handleSetToValue(updateInfo)) {
            return false;
        }
        if (AnimTask.isRunning(updateInfo.animInfo.op)) {
            animTask.animStats.cancelCount++;
            animStats.cancelCount++;
            updateInfo.setOp((byte) 4);
            TransitionInfo.decreaseStartCountForDelayAnim(animTask, animStats, updateInfo, updateInfo.animInfo.op);
        }
        return true;
    }

    private static void handleUpdate(TransitionInfo transitionInfo, AnimOperationInfo animOperationInfo, AnimStats animStats) {
        boolean zContains = transitionInfo.target.animManager.mStartAnim.contains(transitionInfo.key);
        for (AnimTask animTask : transitionInfo.animTasks) {
            List<UpdateInfo> list = transitionInfo.updateList;
            int i2 = animTask.startPos;
            int animCount = animTask.getAnimCount() + i2;
            while (i2 < animCount) {
                UpdateInfo updateInfo = list.get(i2);
                if (updateInfo != null && !handleSetTo(animTask, animStats, updateInfo) && zContains && animOperationInfo != null) {
                    doSetOperation(animTask, animStats, updateInfo, animOperationInfo);
                }
                i2++;
            }
        }
        if (!zContains) {
            transitionInfo.target.animManager.mStartAnim.add(transitionInfo.key);
        }
        if (animStats.isRunning() && animStats.updateCount > 0 && transitionInfo.target.animManager.mBeginAnim.add(transitionInfo.key)) {
            TransitionInfo.sMap.put(Integer.valueOf(transitionInfo.id), transitionInfo);
            if (LogUtils.isLogEnabled()) {
                LogUtils.debug("---- RunnerHandler handleUpdate ANIM_MSG_START_TAG " + transitionInfo, new Object[0]);
            }
            transitionInfo.target.handler.sendStartMsg(transitionInfo);
        }
    }

    private boolean isInfoInTransMap(TransitionInfo transitionInfo) {
        for (TransitionInfo transitionInfo2 = this.mTransMap.get(transitionInfo.target); transitionInfo2 != null; transitionInfo2 = (TransitionInfo) transitionInfo2.next) {
            if (transitionInfo2 == transitionInfo) {
                return true;
            }
        }
        return false;
    }

    private void onSetTo(SetToInfo setToInfo) {
        boolean z2 = setToInfo.target instanceof ViewTarget;
        Iterator<Object> it = setToInfo.state.keySet().iterator();
        while (it.hasNext()) {
            FloatProperty property = setToInfo.state.getProperty(it.next());
            UpdateInfo updateInfo = setToInfo.target.animManager.mUpdateMap.get(property);
            if (updateInfo != null) {
                updateInfo.animInfo.setToValue = setToInfo.state.get(setToInfo.target, property);
                if (!z2) {
                    updateInfo.setTargetValue(setToInfo.target);
                }
            }
        }
        if (setToInfo.target.isAnimRunning(new FloatProperty[0])) {
            return;
        }
        setToInfo.target.animManager.mUpdateMap.clear();
    }

    private void runAnim(long j2, long j3, boolean z2) {
        if (this.runningTarget.isEmpty()) {
            stopAnimRunner();
            return;
        }
        this.mLastRun = j2;
        long averageDelta = AnimRunner.getInst().getAverageDelta();
        int i2 = this.mFrameCount;
        if (i2 == 1 && j3 > 2 * averageDelta) {
            j3 = averageDelta;
        }
        this.mTotalT += j3;
        this.mFrameCount = i2 + 1;
        ThreadPoolUtil.getSplitCount(getTotalAnimCount(), this.mSplitInfo);
        int[] iArr = this.mSplitInfo;
        int i3 = iArr[0];
        int i4 = iArr[1];
        Iterator<IAnimTarget> it = this.runningTarget.iterator();
        while (it.hasNext()) {
            it.next().animManager.getTransitionInfos(this.mTransList);
        }
        addAnimTask(this.mTransList, i4, i3);
        this.mIsTaskRunning = !this.mTaskList.isEmpty();
        AnimTask.sTaskCount.set(this.mTaskList.size());
        Iterator<AnimTask> it2 = this.mTaskList.iterator();
        while (it2.hasNext()) {
            it2.next().start(this.mTotalT, j3, z2);
        }
        boolean zIsEmpty = this.mTransList.isEmpty();
        this.mTransList.clear();
        this.mTaskList.clear();
        if (!zIsEmpty || this.mIsTaskRunning) {
            return;
        }
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("-- runAnim no transList then clean", new Object[0]);
        }
        AnimRunner.sRunnerHandler.sendEmptyMessage(5);
    }

    private boolean setupWaitTrans(IAnimTarget iAnimTarget) {
        TransitionInfo transitionInfoPoll = iAnimTarget.animManager.mWaitState.poll();
        if (transitionInfoPoll == null) {
            return false;
        }
        addToMap(transitionInfoPoll.target, transitionInfoPoll, this.mTransMap);
        return true;
    }

    private void stopAnimRunner() {
        if (this.mStart) {
            if (LogUtils.isLogEnabled()) {
                LogUtils.debug("-- stopAnimRunner", "total time = " + this.mTotalT, "frame count = " + this.mFrameCount);
            }
            this.mStart = false;
            this.mRunnerStart = false;
            this.mTotalT = 0L;
            this.mFrameCount = 0;
            AnimRunner.getInst().end();
        }
    }

    private void updateAnim() {
        this.mIsTaskRunning = false;
        boolean z2 = false;
        for (IAnimTarget iAnimTarget : this.runningTarget) {
            if (updateTarget(iAnimTarget, this.mTransList) || setupWaitTrans(iAnimTarget)) {
                z2 = true;
            } else {
                this.mDelList.add(iAnimTarget);
            }
            this.mTransList.clear();
        }
        this.runningTarget.removeAll(this.mDelList);
        this.mDelList.clear();
        if (!this.mTransMap.isEmpty()) {
            if (LogUtils.isLogEnabled()) {
                LogUtils.debug("- updateAnim->doSetup", new Object[0]);
            }
            doSetup();
            z2 = true;
        }
        if (z2) {
            return;
        }
        stopAnimRunner();
    }

    private boolean updateTarget(IAnimTarget iAnimTarget, List<TransitionInfo> list) {
        AnimOperationInfo animOperationInfo;
        int i2;
        int i3;
        int i4;
        int i5;
        iAnimTarget.animManager.getTransitionInfos(list);
        AnimOperationInfo animOperationInfo2 = this.mOpMap.get(iAnimTarget);
        char c2 = 0;
        int i6 = 0;
        int i7 = 0;
        for (TransitionInfo transitionInfo : list) {
            if (isInfoInTransMap(transitionInfo)) {
                i7++;
            } else {
                if (animOperationInfo2 == null || transitionInfo.startTime <= animOperationInfo2.sendTime) {
                    animOperationInfo = animOperationInfo2;
                } else {
                    i6++;
                    animOperationInfo = null;
                }
                AnimStats animStats = transitionInfo.getAnimStats();
                if (animStats.isStarted()) {
                    handleUpdate(transitionInfo, animOperationInfo, animStats);
                }
                if (LogUtils.isLogEnabled()) {
                    String str = "---- updateAnim, target = " + iAnimTarget;
                    Object[] objArr = new Object[7];
                    objArr[c2] = "id = " + transitionInfo.id;
                    objArr[1] = "key = " + transitionInfo.key;
                    objArr[2] = "useOp = " + animOperationInfo;
                    i3 = 3;
                    objArr[3] = "info.startTime = " + transitionInfo.startTime;
                    StringBuilder sb = new StringBuilder();
                    sb.append("opInfo.time = ");
                    i2 = i6;
                    sb.append(animOperationInfo2 != null ? Long.valueOf(animOperationInfo2.sendTime) : null);
                    objArr[4] = sb.toString();
                    objArr[5] = "stats.isRunning = " + animStats.isRunning();
                    objArr[6] = "stats = " + animStats;
                    LogUtils.debug(str, objArr);
                } else {
                    i2 = i6;
                    i3 = 3;
                }
                if (animStats.isRunning()) {
                    i7++;
                } else {
                    AnimManager animManager = iAnimTarget.animManager;
                    if (animStats.cancelCount > animStats.endCount) {
                        i5 = 2;
                        i4 = 4;
                    } else {
                        i4 = i3;
                        i5 = 2;
                    }
                    animManager.notifyTransitionEnd(transitionInfo, i5, i4);
                }
                i6 = i2;
                c2 = 0;
            }
        }
        if (animOperationInfo2 != null && (i6 == list.size() || animOperationInfo2.isUsed())) {
            this.mOpMap.remove(iAnimTarget);
        }
        list.clear();
        return i7 > 0;
    }

    public void addSetToState(IAnimTarget iAnimTarget, AnimState animState) {
        SetToInfo setToInfo = new SetToInfo();
        setToInfo.target = iAnimTarget;
        if (animState.isTemporary) {
            AnimState animState2 = new AnimState();
            setToInfo.state = animState2;
            animState2.set(animState);
        } else {
            setToInfo.state = animState;
        }
        obtainMessage(4, setToInfo).sendToTarget();
    }

    @Override // android.os.Handler
    public void handleMessage(@lvui Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            TransitionInfo transitionInfoRemove = TransitionInfo.sMap.remove(Integer.valueOf(message.arg1));
            if (transitionInfoRemove != null) {
                addToMap(transitionInfoRemove.target, transitionInfoRemove, this.mTransMap);
                transitionInfoRemove.target.animManager.mSetupInfo.remove(Integer.valueOf(transitionInfoRemove.id));
                if (!this.mIsTaskRunning) {
                    if (LogUtils.isLogEnabled()) {
                        LogUtils.debug("- ANIM_MSG_SETUP->doSetup", new Object[0]);
                    }
                    doSetup();
                }
            }
        } else if (i2 == 2) {
            updateAnim();
        } else if (i2 != 3) {
            if (i2 == 4) {
                onSetTo((SetToInfo) message.obj);
            } else if (i2 == 5) {
                this.runningTarget.clear();
                stopAnimRunner();
            }
        } else if (this.mRunnerStart) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long averageDelta = AnimRunner.getInst().getAverageDelta();
            boolean zBooleanValue = ((Boolean) message.obj).booleanValue();
            if (!this.mStart) {
                this.mStart = true;
                this.mTotalT = 0L;
                this.mFrameCount = 0;
                runAnim(jCurrentTimeMillis, averageDelta, zBooleanValue);
            } else if (!this.mIsTaskRunning) {
                runAnim(jCurrentTimeMillis, jCurrentTimeMillis - this.mLastRun, zBooleanValue);
            }
        }
        message.obj = null;
    }

    public void setOperation(AnimOperationInfo animOperationInfo) {
        if (animOperationInfo.target.isAnimRunning(new FloatProperty[0])) {
            animOperationInfo.sendTime = System.nanoTime();
            this.mOpMap.put(animOperationInfo.target, animOperationInfo);
        }
    }
}
