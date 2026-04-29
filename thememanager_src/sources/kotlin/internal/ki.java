package kotlin.internal;

import kotlin.gyi;
import kotlin.ikck;
import kotlin.nn86;
import kotlin.yz;

/* JADX INFO: compiled from: UProgressionUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ki {
    /* JADX INFO: renamed from: k */
    private static final int m22872k(int i2, int i3, int i4) {
        int iRemainderUnsigned = Integer.remainderUnsigned(i2, i4);
        int iRemainderUnsigned2 = Integer.remainderUnsigned(i3, i4);
        int iCompareUnsigned = Integer.compareUnsigned(iRemainderUnsigned, iRemainderUnsigned2);
        int iLd6 = gyi.ld6(iRemainderUnsigned - iRemainderUnsigned2);
        return iCompareUnsigned >= 0 ? iLd6 : gyi.ld6(iLd6 + i4);
    }

    @nn86
    @yz(version = "1.3")
    /* JADX INFO: renamed from: q */
    public static final int m22873q(int i2, int i3, int i4) {
        if (i4 > 0) {
            return Integer.compareUnsigned(i2, i3) >= 0 ? i3 : gyi.ld6(i3 - m22872k(i3, i2, gyi.ld6(i4)));
        }
        if (i4 < 0) {
            return Integer.compareUnsigned(i2, i3) <= 0 ? i3 : gyi.ld6(i3 + m22872k(i2, i3, gyi.ld6(-i4)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    private static final long toq(long j2, long j3, long j4) {
        long jRemainderUnsigned = Long.remainderUnsigned(j2, j4);
        long jRemainderUnsigned2 = Long.remainderUnsigned(j3, j4);
        int iCompareUnsigned = Long.compareUnsigned(jRemainderUnsigned, jRemainderUnsigned2);
        long jLd6 = ikck.ld6(jRemainderUnsigned - jRemainderUnsigned2);
        return iCompareUnsigned >= 0 ? jLd6 : ikck.ld6(jLd6 + j4);
    }

    @nn86
    @yz(version = "1.3")
    public static final long zy(long j2, long j3, long j4) {
        if (j4 > 0) {
            return Long.compareUnsigned(j2, j3) >= 0 ? j3 : ikck.ld6(j3 - toq(j3, j2, ikck.ld6(j4)));
        }
        if (j4 < 0) {
            return Long.compareUnsigned(j2, j3) <= 0 ? j3 : ikck.ld6(j3 + toq(j2, j3, ikck.ld6(-j4)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
