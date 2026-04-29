package com.google.common.primitives;

import com.google.common.base.jk;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Comparator;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: UnsignedInts.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
@InterfaceC7731k
public final class cdj {

    /* JADX INFO: renamed from: k */
    static final long f27274k = 4294967295L;

    /* JADX INFO: renamed from: com.google.common.primitives.cdj$k */
    /* JADX INFO: compiled from: UnsignedInts.java */
    enum EnumC4734k implements Comparator<int[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int iMin = Math.min(iArr.length, iArr2.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int i3 = iArr[i2];
                int i4 = iArr2[i2];
                if (i3 != i4) {
                    return cdj.toq(i3, i4);
                }
            }
            return iArr.length - iArr2.length;
        }
    }

    private cdj() {
    }

    public static void cdj(int[] iArr, int i2, int i3) {
        jk.a9(iArr);
        jk.ek5k(i2, i3, iArr.length);
        for (int i4 = i2; i4 < i3; i4++) {
            iArr[i4] = Integer.MAX_VALUE ^ iArr[i4];
        }
        Arrays.sort(iArr, i2, i3);
        while (i2 < i3) {
            iArr[i2] = iArr[i2] ^ Integer.MAX_VALUE;
            i2++;
        }
    }

    public static Comparator<int[]> f7l8() {
        return EnumC4734k.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static String m16622g(String str, int... iArr) {
        jk.a9(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iArr.length * 5);
        sb.append(t8r(iArr[0]));
        for (int i2 = 1; i2 < iArr.length; i2++) {
            sb.append(str);
            sb.append(t8r(iArr[i2]));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static void m16623h(int[] iArr) {
        jk.a9(iArr);
        cdj(iArr, 0, iArr.length);
    }

    /* JADX INFO: renamed from: i */
    public static String m16624i(int i2, int i3) {
        return Long.toString(((long) i2) & f27274k, i3);
    }

    /* JADX INFO: renamed from: k */
    public static int m16625k(long j2) {
        jk.m15374h((j2 >> 32) == 0, "out of range: %s", j2);
        return (int) j2;
    }

    public static long ki(int i2) {
        return ((long) i2) & f27274k;
    }

    public static void kja0(int[] iArr, int i2, int i3) {
        jk.a9(iArr);
        jk.ek5k(i2, i3, iArr.length);
        for (int i4 = i2; i4 < i3; i4++) {
            iArr[i4] = m16626n(iArr[i4]);
        }
        Arrays.sort(iArr, i2, i3);
        while (i2 < i3) {
            iArr[i2] = m16626n(iArr[i2]);
            i2++;
        }
    }

    @CanIgnoreReturnValue
    public static int ld6(String str, int i2) {
        jk.a9(str);
        long j2 = Long.parseLong(str, i2);
        if ((f27274k & j2) == j2) {
            return (int) j2;
        }
        throw new NumberFormatException("Input " + str + " in base " + i2 + " is not in the range of an unsigned integer");
    }

    /* JADX INFO: renamed from: n */
    static int m16626n(int i2) {
        return i2 ^ Integer.MIN_VALUE;
    }

    public static void n7h(int[] iArr) {
        jk.a9(iArr);
        kja0(iArr, 0, iArr.length);
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: p */
    public static int m16627p(String str) {
        return ld6(str, 10);
    }

    /* JADX INFO: renamed from: q */
    public static int m16628q(int i2, int i3) {
        return (int) (ki(i2) / ki(i3));
    }

    public static int qrj(long j2) {
        if (j2 <= 0) {
            return 0;
        }
        if (j2 >= 4294967296L) {
            return -1;
        }
        return (int) j2;
    }

    /* JADX INFO: renamed from: s */
    public static int m16629s(int... iArr) {
        jk.m15383q(iArr.length > 0);
        int iM16626n = m16626n(iArr[0]);
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int iM16626n2 = m16626n(iArr[i2]);
            if (iM16626n2 < iM16626n) {
                iM16626n = iM16626n2;
            }
        }
        return m16626n(iM16626n);
    }

    public static String t8r(int i2) {
        return m16624i(i2, 10);
    }

    public static int toq(int i2, int i3) {
        return C4746s.m16716n(m16626n(i2), m16626n(i3));
    }

    public static int x2(int i2, int i3) {
        return (int) (ki(i2) % ki(i3));
    }

    /* JADX INFO: renamed from: y */
    public static int m16630y(int... iArr) {
        jk.m15383q(iArr.length > 0);
        int iM16626n = m16626n(iArr[0]);
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int iM16626n2 = m16626n(iArr[i2]);
            if (iM16626n2 > iM16626n) {
                iM16626n = iM16626n2;
            }
        }
        return m16626n(iM16626n);
    }

    @CanIgnoreReturnValue
    public static int zy(String str) {
        ld6 ld6VarM16662k = ld6.m16662k(str);
        try {
            return ld6(ld6VarM16662k.f27289k, ld6VarM16662k.f68580toq);
        } catch (NumberFormatException e2) {
            NumberFormatException numberFormatException = new NumberFormatException("Error parsing value: " + str);
            numberFormatException.initCause(e2);
            throw numberFormatException;
        }
    }
}
