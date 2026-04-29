package miuix.animation.internal;

import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.LinkNode;

/* JADX INFO: loaded from: classes3.dex */
public class AnimTask extends LinkNode<AnimTask> implements Runnable {
    public static final int MAX_PAGE_SIZE = 150;
    public static final int MAX_SINGLE_TASK_SIZE = 4000;
    public static final int MAX_TO_PAGE_SIZE = 500;
    public static final byte OP_CANCEL = 4;
    public static final byte OP_END = 3;
    public static final byte OP_FAILED = 5;
    public static final byte OP_INVALID = 0;
    public static final byte OP_START = 1;
    public static final byte OP_UPDATE = 2;
    public static final AtomicInteger sTaskCount = new AtomicInteger();
    public final AnimStats animStats = new AnimStats();
    public volatile long deltaT;
    public volatile TransitionInfo info;
    public volatile int startPos;
    public volatile boolean toPage;
    public volatile long totalT;

    public static boolean isRunning(byte b2) {
        return b2 == 1 || b2 == 2;
    }

    public int getAnimCount() {
        return this.animStats.animCount;
    }

    public int getTotalAnimCount() {
        int i2 = 0;
        for (AnimTask animTask = this; animTask != null; animTask = (AnimTask) animTask.next) {
            i2 += animTask.animStats.animCount;
        }
        return i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            AnimRunnerTask.doAnimationFrame(this, this.totalT, this.deltaT, true, this.toPage);
        } catch (Exception e2) {
            Log.d(CommonUtils.TAG, "doAnimationFrame failed", e2);
        }
        if (sTaskCount.decrementAndGet() == 0) {
            AnimRunner.sRunnerHandler.sendEmptyMessage(2);
        }
    }

    public void setup(int i2, int i3) {
        this.animStats.clear();
        this.animStats.animCount = i3;
        this.startPos = i2;
    }

    public void start(long j2, long j3, boolean z2) {
        this.totalT = j2;
        this.deltaT = j3;
        this.toPage = z2;
        ThreadPoolUtil.post(this);
    }

    void updateAnimStats() {
        int i2 = this.startPos + this.animStats.animCount;
        for (int i3 = this.startPos; i3 < i2; i3++) {
            UpdateInfo updateInfo = this.info.updateList.get(i3);
            if (updateInfo != null) {
                if (updateInfo.animInfo.op == 0 || updateInfo.animInfo.op == 1) {
                    this.animStats.startCount++;
                } else {
                    this.animStats.initCount++;
                    byte b2 = updateInfo.animInfo.op;
                    if (b2 == 3) {
                        this.animStats.endCount++;
                    } else if (b2 == 4) {
                        this.animStats.cancelCount++;
                    } else if (b2 == 5) {
                        this.animStats.failCount++;
                    }
                }
            }
        }
    }
}
