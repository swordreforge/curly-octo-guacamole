package miuix.animation.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.Collection;
import miuix.animation.Folme;
import miuix.animation.IAnimTarget;
import miuix.animation.base.AnimConfigLink;
import miuix.animation.controller.AnimState;
import miuix.animation.physics.AnimationHandler;
import miuix.animation.property.FloatProperty;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public class AnimRunner implements AnimationHandler.AnimationFrameCallback {
    public static final long MAX_DELTA = 16;
    private static final int MAX_RECORD = 5;
    private static final int MSG_END = 1;
    private static final int MSG_START = 0;
    static volatile Handler sMainHandler;
    public static final RunnerHandler sRunnerHandler;
    private static final HandlerThread sRunnerThread;
    private volatile long mAverageDelta;
    private long[] mDeltaRecord;
    private volatile boolean mIsRunning;
    private long mLastFrameTime;
    private float mRatio;
    private int mRecordCount;

    private static class Holder {
        static final AnimRunner inst = new AnimRunner();

        private Holder() {
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("AnimRunnerThread");
        sRunnerThread = handlerThread;
        createMainHandler(Folme.getLooper());
        handlerThread.start();
        sRunnerHandler = new RunnerHandler(handlerThread.getLooper());
    }

    private long average(long[] jArr) {
        int i2 = 0;
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += j3;
            if (j3 > 0) {
                i2++;
            }
        }
        if (i2 > 0) {
            return j2 / ((long) i2);
        }
        return 0L;
    }

    private long calculateAverageDelta(long j2) {
        long jAverage = average(this.mDeltaRecord);
        if (jAverage > 0) {
            j2 = jAverage;
        }
        if (j2 == 0 || j2 > 16) {
            j2 = 16;
        }
        return (long) Math.ceil(j2 / this.mRatio);
    }

    public static void createMainHandler(Looper looper) {
        if (looper == null) {
            return;
        }
        sMainHandler = new Handler(looper) { // from class: miuix.animation.internal.AnimRunner.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 0) {
                    AnimRunner.startAnimRunner();
                } else {
                    if (i2 != 1) {
                        return;
                    }
                    AnimRunner.endAnimation();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void endAnimation() {
        AnimRunner inst = getInst();
        if (inst.mIsRunning) {
            if (LogUtils.isLogEnabled()) {
                LogUtils.debug("AnimRunner.endAnimation", new Object[0]);
            }
            inst.mIsRunning = false;
            AnimationHandler.getInstance().removeCallback(inst);
        }
    }

    public static AnimRunner getInst() {
        return Holder.inst;
    }

    public static Handler getMainHandler() {
        return sMainHandler;
    }

    public static void setThreadPriority(int i2) {
        Process.setThreadPriority(sRunnerThread.getThreadId(), i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void startAnimRunner() {
        AnimRunner inst = getInst();
        if (inst.mIsRunning) {
            return;
        }
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("AnimRunner.start", new Object[0]);
        }
        inst.mRatio = Folme.getTimeRatio();
        inst.mIsRunning = true;
        AnimationHandler.getInstance().addAnimationFrameCallback(inst, 0L);
    }

    private static void updateAnimRunner(Collection<IAnimTarget> collection, boolean z2) {
        if (collection.size() == 0) {
            sRunnerHandler.sendEmptyMessage(5);
        }
        for (IAnimTarget iAnimTarget : collection) {
            boolean zIsAnimRunning = iAnimTarget.animManager.isAnimRunning(new FloatProperty[0]);
            boolean zIsAnimSetup = iAnimTarget.animManager.isAnimSetup();
            boolean zIsValidFlag = iAnimTarget.isValidFlag();
            if (zIsAnimRunning) {
                iAnimTarget.animManager.update(z2);
            } else if (!zIsAnimSetup && !zIsAnimRunning && iAnimTarget.hasFlags(1L) && zIsValidFlag) {
                Folme.clean(iAnimTarget);
            }
        }
    }

    private void updateRunningTime(long j2) {
        long j3 = this.mLastFrameTime;
        long j4 = 0;
        if (j3 == 0) {
            this.mLastFrameTime = j2;
        } else {
            j4 = j2 - j3;
            this.mLastFrameTime = j2;
        }
        int i2 = this.mRecordCount;
        this.mDeltaRecord[i2 % 5] = j4;
        this.mRecordCount = i2 + 1;
        this.mAverageDelta = calculateAverageDelta(j4);
    }

    public void cancel(IAnimTarget iAnimTarget, String... strArr) {
        sRunnerHandler.setOperation(new AnimOperationInfo(iAnimTarget, (byte) 4, strArr, null));
    }

    @Override // miuix.animation.physics.AnimationHandler.AnimationFrameCallback
    public boolean doAnimationFrame(long j2) {
        updateRunningTime(j2);
        if (this.mIsRunning) {
            Collection<IAnimTarget> targets = Folme.getTargets();
            int totalAnimCount = 0;
            for (IAnimTarget iAnimTarget : targets) {
                if (iAnimTarget.animManager.isAnimRunning(new FloatProperty[0])) {
                    totalAnimCount += iAnimTarget.animManager.getTotalAnimCount();
                }
            }
            boolean z2 = totalAnimCount > 500;
            if ((!z2 && targets.size() > 0) || targets.size() == 0) {
                updateAnimRunner(targets, z2);
            }
            RunnerHandler runnerHandler = sRunnerHandler;
            Message messageObtainMessage = runnerHandler.obtainMessage();
            messageObtainMessage.what = 3;
            messageObtainMessage.obj = Boolean.valueOf(z2);
            runnerHandler.sendMessage(messageObtainMessage);
            if (z2 && targets.size() > 0) {
                updateAnimRunner(targets, z2);
            }
        }
        return this.mIsRunning;
    }

    public void end(IAnimTarget iAnimTarget, String... strArr) {
        if (CommonUtils.isArrayEmpty(strArr)) {
            iAnimTarget.handler.sendEmptyMessage(3);
        }
        sRunnerHandler.setOperation(new AnimOperationInfo(iAnimTarget, (byte) 3, strArr, null));
    }

    public long getAverageDelta() {
        return this.mAverageDelta;
    }

    public void run(IAnimTarget iAnimTarget, AnimState animState, AnimState animState2, AnimConfigLink animConfigLink) {
        run(new TransitionInfo(iAnimTarget, animState, animState2, animConfigLink));
    }

    void start() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            startAnimRunner();
            return;
        }
        Handler mainHandler = getMainHandler();
        if (mainHandler != null) {
            mainHandler.sendEmptyMessage(0);
            return;
        }
        Log.w(CommonUtils.TAG, "AnimRunner.start handler is null! looper: " + Looper.myLooper());
    }

    private AnimRunner() {
        this.mAverageDelta = 16L;
        this.mDeltaRecord = new long[]{0, 0, 0, 0, 0};
        this.mRecordCount = 0;
    }

    public void cancel(IAnimTarget iAnimTarget, FloatProperty... floatPropertyArr) {
        sRunnerHandler.setOperation(new AnimOperationInfo(iAnimTarget, (byte) 4, null, floatPropertyArr));
    }

    public void run(TransitionInfo transitionInfo) {
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("- AnimManager.run", new Object[0]);
        }
        transitionInfo.target.animManager.startAnim(transitionInfo);
    }

    public void end(IAnimTarget iAnimTarget, FloatProperty... floatPropertyArr) {
        if (CommonUtils.isArrayEmpty(floatPropertyArr)) {
            iAnimTarget.handler.sendEmptyMessage(3);
        }
        sRunnerHandler.setOperation(new AnimOperationInfo(iAnimTarget, (byte) 3, null, floatPropertyArr));
    }

    void end() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            endAnimation();
            return;
        }
        Handler mainHandler = getMainHandler();
        if (mainHandler != null) {
            mainHandler.sendEmptyMessage(1);
            return;
        }
        Log.w(CommonUtils.TAG, "AnimRunner.end handler is null! looper: " + Looper.myLooper());
    }
}
