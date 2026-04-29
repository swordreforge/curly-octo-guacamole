package kotlin.internal;

import kotlin.nn86;

/* JADX INFO: compiled from: progressionUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class n7h {
    /* JADX INFO: renamed from: g */
    private static final long m22874g(long j2, long j3) {
        long j4 = j2 % j3;
        return j4 >= 0 ? j4 : j4 + j3;
    }

    /* JADX INFO: renamed from: k */
    private static final int m22875k(int i2, int i3, int i4) {
        return m22876n(m22876n(i2, i4) - m22876n(i3, i4), i4);
    }

    /* JADX INFO: renamed from: n */
    private static final int m22876n(int i2, int i3) {
        int i4 = i2 % i3;
        return i4 >= 0 ? i4 : i4 + i3;
    }

    @nn86
    /* JADX INFO: renamed from: q */
    public static final long m22877q(long j2, long j3, long j4) {
        if (j4 > 0) {
            return j2 >= j3 ? j3 : j3 - toq(j3, j2, j4);
        }
        if (j4 < 0) {
            return j2 <= j3 ? j3 : j3 + toq(j2, j3, -j4);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    private static final long toq(long j2, long j3, long j4) {
        return m22874g(m22874g(j2, j4) - m22874g(j3, j4), j4);
    }

    @nn86
    public static final int zy(int i2, int i3, int i4) {
        if (i4 > 0) {
            return i2 >= i3 ? i3 : i3 - m22875k(i3, i2, i4);
        }
        if (i4 < 0) {
            return i2 <= i3 ? i3 : i3 + m22875k(i2, i3, -i4);
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
