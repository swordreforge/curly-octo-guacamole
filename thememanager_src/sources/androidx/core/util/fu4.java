package androidx.core.util;

import java.io.PrintWriter;
import zy.uv6;

/* JADX INFO: compiled from: TimeUtils.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public final class fu4 {

    /* JADX INFO: renamed from: k */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static final int f3877k = 19;

    /* JADX INFO: renamed from: q */
    private static final int f3879q = 86400;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f50629toq = 60;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f50630zy = 3600;

    /* JADX INFO: renamed from: n */
    private static final Object f3878n = new Object();

    /* JADX INFO: renamed from: g */
    private static char[] f3876g = new char[24];

    private fu4() {
    }

    private static int f7l8(char[] cArr, int i2, char c2, int i3, boolean z2, int i4) {
        int i5;
        if (!z2 && i2 <= 0) {
            return i3;
        }
        if ((!z2 || i4 < 3) && i2 <= 99) {
            i5 = i3;
        } else {
            int i6 = i2 / 100;
            cArr[i3] = (char) (i6 + 48);
            i5 = i3 + 1;
            i2 -= i6 * 100;
        }
        if ((z2 && i4 >= 2) || i2 > 9 || i3 != i5) {
            int i7 = i2 / 10;
            cArr[i5] = (char) (i7 + 48);
            i5++;
            i2 -= i7 * 10;
        }
        cArr[i5] = (char) (i2 + 48);
        int i8 = i5 + 1;
        cArr[i8] = c2;
        return i8 + 1;
    }

    /* JADX INFO: renamed from: g */
    private static int m2942g(long j2, int i2) {
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j3 = j2;
        if (f3876g.length < i2) {
            f3876g = new char[i2];
        }
        char[] cArr = f3876g;
        if (j3 == 0) {
            int i8 = i2 - 1;
            while (i8 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j3 > 0) {
            c2 = '+';
        } else {
            c2 = '-';
            j3 = -j3;
        }
        int i9 = (int) (j3 % 1000);
        int iFloor = (int) Math.floor(j3 / 1000);
        if (iFloor > f3879q) {
            i3 = iFloor / f3879q;
            iFloor -= f3879q * i3;
        } else {
            i3 = 0;
        }
        if (iFloor > f50630zy) {
            i4 = iFloor / f50630zy;
            iFloor -= i4 * f50630zy;
        } else {
            i4 = 0;
        }
        if (iFloor > 60) {
            int i10 = iFloor / 60;
            i5 = iFloor - (i10 * 60);
            i6 = i10;
        } else {
            i5 = iFloor;
            i6 = 0;
        }
        if (i2 != 0) {
            int iM2943k = m2943k(i3, 1, false, 0);
            int iM2943k2 = iM2943k + m2943k(i4, 1, iM2943k > 0, 2);
            int iM2943k3 = iM2943k2 + m2943k(i6, 1, iM2943k2 > 0, 2);
            int iM2943k4 = iM2943k3 + m2943k(i5, 1, iM2943k3 > 0, 2);
            i7 = 0;
            for (int iM2943k5 = iM2943k4 + m2943k(i9, 2, true, iM2943k4 > 0 ? 3 : 0) + 1; iM2943k5 < i2; iM2943k5++) {
                cArr[i7] = ' ';
                i7++;
            }
        } else {
            i7 = 0;
        }
        cArr[i7] = c2;
        int i11 = i7 + 1;
        boolean z2 = i2 != 0;
        int iF7l8 = f7l8(cArr, i3, 'd', i11, false, 0);
        int iF7l82 = f7l8(cArr, i4, 'h', iF7l8, iF7l8 != i11, z2 ? 2 : 0);
        int iF7l83 = f7l8(cArr, i6, 'm', iF7l82, iF7l82 != i11, z2 ? 2 : 0);
        int iF7l84 = f7l8(cArr, i5, 's', iF7l83, iF7l83 != i11, z2 ? 2 : 0);
        int iF7l85 = f7l8(cArr, i9, 'm', iF7l84, true, (!z2 || iF7l84 == i11) ? 0 : 3);
        cArr[iF7l85] = 's';
        return iF7l85 + 1;
    }

    /* JADX INFO: renamed from: k */
    private static int m2943k(int i2, int i3, boolean z2, int i4) {
        if (i2 > 99 || (z2 && i4 >= 3)) {
            return i3 + 3;
        }
        if (i2 > 9 || (z2 && i4 >= 2)) {
            return i3 + 2;
        }
        if (z2 || i2 > 0) {
            return i3 + 1;
        }
        return 0;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: n */
    public static void m2944n(long j2, StringBuilder sb) {
        synchronized (f3878n) {
            sb.append(f3876g, 0, m2942g(j2, 0));
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: q */
    public static void m2945q(long j2, PrintWriter printWriter, int i2) {
        synchronized (f3878n) {
            printWriter.print(new String(f3876g, 0, m2942g(j2, i2)));
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static void toq(long j2, long j3, PrintWriter printWriter) {
        if (j2 == 0) {
            printWriter.print("--");
        } else {
            m2945q(j2 - j3, printWriter, 0);
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static void zy(long j2, PrintWriter printWriter) {
        m2945q(j2, printWriter, 0);
    }
}
