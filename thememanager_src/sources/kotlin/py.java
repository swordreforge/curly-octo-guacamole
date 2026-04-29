package kotlin;

import kotlin.text.C6452q;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: UnsignedUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6769y(name = "UnsignedKt")
public final class py {
    @nn86
    public static final int f7l8(long j2, long j3) {
        return kotlin.jvm.internal.d2ok.fn3e(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
    }

    @nn86
    /* JADX INFO: renamed from: g */
    public static final double m23241g(int i2) {
        return ((double) (Integer.MAX_VALUE & i2)) + (((double) ((i2 >>> 31) << 30)) * ((double) 2));
    }

    @nn86
    /* JADX INFO: renamed from: k */
    public static final int m23242k(double d2) {
        if (Double.isNaN(d2) || d2 <= m23241g(0)) {
            return 0;
        }
        if (d2 >= m23241g(-1)) {
            return -1;
        }
        return d2 <= 2.147483647E9d ? gyi.ld6((int) d2) : gyi.ld6(gyi.ld6((int) (d2 - ((double) Integer.MAX_VALUE))) + gyi.ld6(Integer.MAX_VALUE));
    }

    @InterfaceC7396q
    public static final String ld6(long j2) {
        return x2(j2, 10);
    }

    @nn86
    /* JADX INFO: renamed from: n */
    public static final int m23243n(int i2, int i3) {
        return gyi.ld6((int) ((((long) i2) & 4294967295L) % (((long) i3) & 4294967295L)));
    }

    @nn86
    /* JADX INFO: renamed from: p */
    public static final double m23244p(long j2) {
        return ((j2 >>> 11) * ((double) 2048)) + (j2 & 2047);
    }

    @nn86
    /* JADX INFO: renamed from: q */
    public static final int m23245q(int i2, int i3) {
        return gyi.ld6((int) ((((long) i2) & 4294967295L) / (((long) i3) & 4294967295L)));
    }

    @nn86
    /* JADX INFO: renamed from: s */
    public static final long m23246s(long j2, long j3) {
        if (j3 < 0) {
            return Long.compareUnsigned(j2, j3) < 0 ? j2 : ikck.ld6(j2 - j3);
        }
        if (j2 >= 0) {
            return ikck.ld6(j2 % j3);
        }
        long j4 = j2 - ((((j2 >>> 1) / j3) << 1) * j3);
        if (Long.compareUnsigned(ikck.ld6(j4), ikck.ld6(j3)) < 0) {
            j3 = 0;
        }
        return ikck.ld6(j4 - j3);
    }

    @nn86
    public static final long toq(double d2) {
        if (Double.isNaN(d2) || d2 <= m23244p(0L)) {
            return 0L;
        }
        if (d2 >= m23244p(-1L)) {
            return -1L;
        }
        return d2 < 9.223372036854776E18d ? ikck.ld6((long) d2) : ikck.ld6(ikck.ld6((long) (d2 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @InterfaceC7396q
    public static final String x2(long j2, int i2) {
        if (j2 >= 0) {
            String string = Long.toString(j2, C6452q.m23604k(i2));
            kotlin.jvm.internal.d2ok.kja0(string, "toString(this, checkRadix(radix))");
            return string;
        }
        long j3 = i2;
        long j4 = ((j2 >>> 1) / j3) << 1;
        long j5 = j2 - (j4 * j3);
        if (j5 >= j3) {
            j5 -= j3;
            j4++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j4, C6452q.m23604k(i2));
        kotlin.jvm.internal.d2ok.kja0(string2, "toString(this, checkRadix(radix))");
        sb.append(string2);
        String string3 = Long.toString(j5, C6452q.m23604k(i2));
        kotlin.jvm.internal.d2ok.kja0(string3, "toString(this, checkRadix(radix))");
        sb.append(string3);
        return sb.toString();
    }

    @nn86
    /* JADX INFO: renamed from: y */
    public static final long m23247y(long j2, long j3) {
        if (j3 < 0) {
            return Long.compareUnsigned(j2, j3) < 0 ? ikck.ld6(0L) : ikck.ld6(1L);
        }
        if (j2 >= 0) {
            return ikck.ld6(j2 / j3);
        }
        long j4 = ((j2 >>> 1) / j3) << 1;
        return ikck.ld6(j4 + ((long) (Long.compareUnsigned(ikck.ld6(j2 - (j4 * j3)), ikck.ld6(j3)) < 0 ? 0 : 1)));
    }

    @nn86
    public static final int zy(int i2, int i3) {
        return kotlin.jvm.internal.d2ok.m23076i(i2 ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE);
    }
}
