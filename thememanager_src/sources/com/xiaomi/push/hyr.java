package com.xiaomi.push;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public class hyr<T> {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f73358f7l8;

    /* JADX INFO: renamed from: g */
    private long f33011g;

    /* JADX INFO: renamed from: k */
    private final long f33012k;

    /* JADX INFO: renamed from: n */
    private long f33013n;

    /* JADX INFO: renamed from: q */
    private long f33014q;

    /* JADX INFO: renamed from: s */
    private final long f33015s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f73359toq;

    /* JADX INFO: renamed from: y */
    private long f33016y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f73360zy;

    public hyr(long j2, long j3) {
        this.f33015s = j2 * 1000000;
        this.f33012k = j3;
    }

    /* JADX INFO: renamed from: k */
    public long m20964k() {
        return this.f73360zy;
    }

    /* JADX INFO: renamed from: n */
    public long m20965n() {
        long j2 = this.f33016y;
        long j3 = this.f73358f7l8;
        if (j2 > j3) {
            return j2 - j3;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: q */
    public long m20966q() {
        long j2 = this.f33011g;
        if (j2 > 0) {
            long j3 = this.f33013n;
            if (j3 > 0) {
                return j2 / j3;
            }
        }
        return 0L;
    }

    public T toq(Callable<T> callable) {
        long j2 = this.f73359toq;
        long j3 = this.f33015s;
        if (j2 > j3) {
            long j4 = (j2 / j3) * this.f33012k;
            this.f73359toq = 0L;
            if (j4 > 0) {
                try {
                    Thread.sleep(j4);
                } catch (Exception unused) {
                }
            }
        }
        long jNanoTime = System.nanoTime();
        if (this.f73358f7l8 <= 0) {
            this.f73358f7l8 = jNanoTime;
        }
        T tCall = null;
        try {
            tCall = callable.call();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        this.f33016y = System.nanoTime();
        this.f33013n++;
        if (this.f73360zy < jNanoTime2) {
            this.f73360zy = jNanoTime2;
        }
        if (jNanoTime2 > 0) {
            this.f33011g += jNanoTime2;
            long j5 = this.f33014q;
            if (j5 == 0 || j5 > jNanoTime2) {
                this.f33014q = jNanoTime2;
            }
        }
        this.f73359toq += Math.max(jNanoTime2, 0L);
        return tCall;
    }

    public long zy() {
        return this.f33014q;
    }
}
