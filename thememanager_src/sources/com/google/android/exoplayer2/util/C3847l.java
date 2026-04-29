package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.C3548p;

/* JADX INFO: renamed from: com.google.android.exoplayer2.util.l */
/* JADX INFO: compiled from: TimestampAdjuster.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3847l {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final long f67030f7l8 = 8589934592L;

    /* JADX INFO: renamed from: g */
    public static final long f23220g = 9223372036854775806L;

    /* JADX INFO: renamed from: n */
    public static final long f23221n = Long.MAX_VALUE;

    /* JADX INFO: renamed from: k */
    @zy.o1t("this")
    private long f23222k;

    /* JADX INFO: renamed from: q */
    private final ThreadLocal<Long> f23223q = new ThreadLocal<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.o1t("this")
    private long f67031toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.o1t("this")
    private long f67032zy;

    public C3847l(long j2) {
        f7l8(j2);
    }

    /* JADX INFO: renamed from: g */
    public static long m13644g(long j2) {
        return (j2 * 1000000) / 90000;
    }

    /* JADX INFO: renamed from: p */
    public static long m13645p(long j2) {
        return m13646s(j2) % f67030f7l8;
    }

    /* JADX INFO: renamed from: s */
    public static long m13646s(long j2) {
        return (j2 * 90000) / 1000000;
    }

    public synchronized void f7l8(long j2) {
        this.f23222k = j2;
        this.f67031toq = j2 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f67032zy = C3548p.f65257toq;
    }

    /* JADX INFO: renamed from: k */
    public synchronized long m13647k(long j2) {
        if (j2 == C3548p.f65257toq) {
            return C3548p.f65257toq;
        }
        if (this.f67031toq == C3548p.f65257toq) {
            long jLongValue = this.f23222k;
            if (jLongValue == f23220g) {
                jLongValue = ((Long) C3844k.f7l8(this.f23223q.get())).longValue();
            }
            this.f67031toq = jLongValue - j2;
            notifyAll();
        }
        this.f67032zy = j2;
        return j2 + this.f67031toq;
    }

    /* JADX INFO: renamed from: n */
    public synchronized long m13648n() {
        return this.f67031toq;
    }

    /* JADX INFO: renamed from: q */
    public synchronized long m13649q() {
        long j2;
        j2 = this.f67032zy;
        return j2 != C3548p.f65257toq ? j2 + this.f67031toq : zy();
    }

    public synchronized long toq(long j2) {
        if (j2 == C3548p.f65257toq) {
            return C3548p.f65257toq;
        }
        long j3 = this.f67032zy;
        if (j3 != C3548p.f65257toq) {
            long jM13646s = m13646s(j3);
            long j4 = (4294967296L + jM13646s) / f67030f7l8;
            long j5 = ((j4 - 1) * f67030f7l8) + j2;
            j2 += j4 * f67030f7l8;
            if (Math.abs(j5 - jM13646s) < Math.abs(j2 - jM13646s)) {
                j2 = j5;
            }
        }
        return m13647k(m13644g(j2));
    }

    /* JADX INFO: renamed from: y */
    public synchronized void m13650y(boolean z2, long j2) throws InterruptedException {
        C3844k.m13633s(this.f23222k == f23220g);
        if (this.f67031toq != C3548p.f65257toq) {
            return;
        }
        if (z2) {
            this.f23223q.set(Long.valueOf(j2));
        } else {
            while (this.f67031toq == C3548p.f65257toq) {
                wait();
            }
        }
    }

    public synchronized long zy() {
        long j2;
        j2 = this.f23222k;
        if (j2 == Long.MAX_VALUE || j2 == f23220g) {
            j2 = C3548p.f65257toq;
        }
        return j2;
    }
}
