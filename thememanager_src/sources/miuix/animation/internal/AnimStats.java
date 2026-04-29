package miuix.animation.internal;

import miuix.animation.utils.ObjectPool;

/* JADX INFO: loaded from: classes3.dex */
class AnimStats implements ObjectPool.IPoolObject {
    public int animCount;
    public int cancelCount;
    public int endCount;
    public int failCount;
    public int initCount;
    public int startCount;
    public int updateCount;

    AnimStats() {
    }

    public void add(AnimStats animStats) {
        this.animCount += animStats.animCount;
        this.startCount += animStats.startCount;
        this.initCount += animStats.initCount;
        this.failCount += animStats.failCount;
        this.updateCount += animStats.updateCount;
        this.cancelCount += animStats.cancelCount;
        this.endCount += animStats.endCount;
    }

    @Override // miuix.animation.utils.ObjectPool.IPoolObject
    public void clear() {
        this.animCount = 0;
        this.startCount = 0;
        this.initCount = 0;
        this.failCount = 0;
        this.updateCount = 0;
        this.cancelCount = 0;
        this.endCount = 0;
    }

    public boolean isRunning() {
        return !isStarted() || (this.cancelCount + this.endCount) + this.failCount < this.animCount;
    }

    public boolean isStarted() {
        return this.initCount > 0;
    }

    public String toString() {
        return "AnimStats{animCount = " + this.animCount + ", startCount=" + this.startCount + ", startedCount = " + this.initCount + ", failCount=" + this.failCount + ", updateCount=" + this.updateCount + ", cancelCount=" + this.cancelCount + ", endCount=" + this.endCount + '}';
    }
}
