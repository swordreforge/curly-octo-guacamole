package com.google.common.primitives;

import com.google.common.base.jk;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: UnsignedLongs.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
@InterfaceC7731k
public final class t8r {

    /* JADX INFO: renamed from: k */
    public static final long f27303k = -1;

    /* JADX INFO: renamed from: com.google.common.primitives.t8r$k */
    /* JADX INFO: compiled from: UnsignedLongs.java */
    enum EnumC4747k implements Comparator<long[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int iMin = Math.min(jArr.length, jArr2.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                long j2 = jArr[i2];
                long j3 = jArr2[i2];
                if (j2 != j3) {
                    return t8r.m16725k(j2, j3);
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    /* JADX INFO: compiled from: UnsignedLongs.java */
    private static final class toq {

        /* JADX INFO: renamed from: k */
        static final long[] f27305k = new long[37];

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final int[] f68585toq = new int[37];

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        static final int[] f68586zy = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i2 = 2; i2 <= 36; i2++) {
                long j2 = i2;
                f27305k[i2] = t8r.zy(-1L, j2);
                f68585toq[i2] = (int) t8r.ld6(-1L, j2);
                f68586zy[i2] = bigInteger.toString(i2).length() - 1;
            }
        }

        private toq() {
        }

        /* JADX INFO: renamed from: k */
        static boolean m16731k(long j2, int i2, int i3) {
            if (j2 < 0) {
                return true;
            }
            long j3 = f27305k[i3];
            if (j2 < j3) {
                return false;
            }
            return j2 > j3 || i2 > f68585toq[i3];
        }
    }

    private t8r() {
    }

    public static String cdj(long j2, int i2) {
        jk.ld6(i2 >= 2 && i2 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i2);
        if (j2 == 0) {
            return "0";
        }
        if (j2 > 0) {
            return Long.toString(j2, i2);
        }
        int i3 = 64;
        char[] cArr = new char[64];
        int i4 = i2 - 1;
        if ((i2 & i4) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2);
            do {
                i3--;
                cArr[i3] = Character.forDigit(((int) j2) & i4, i2);
                j2 >>>= iNumberOfTrailingZeros;
            } while (j2 != 0);
        } else {
            long jZy = (i2 & 1) == 0 ? (j2 >>> 1) / ((long) (i2 >>> 1)) : zy(j2, i2);
            long j3 = i2;
            cArr[63] = Character.forDigit((int) (j2 - (jZy * j3)), i2);
            i3 = 63;
            while (jZy > 0) {
                i3--;
                cArr[i3] = Character.forDigit((int) (jZy % j3), i2);
                jZy /= j3;
            }
        }
        return new String(cArr, i3, 64 - i3);
    }

    public static long f7l8(long... jArr) {
        jk.m15383q(jArr.length > 0);
        long jM16728q = m16728q(jArr[0]);
        for (int i2 = 1; i2 < jArr.length; i2++) {
            long jM16728q2 = m16728q(jArr[i2]);
            if (jM16728q2 > jM16728q) {
                jM16728q = jM16728q2;
            }
        }
        return m16728q(jM16728q);
    }

    /* JADX INFO: renamed from: g */
    public static Comparator<long[]> m16723g() {
        return EnumC4747k.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static String m16724h(long j2) {
        return cdj(j2, 10);
    }

    /* JADX INFO: renamed from: k */
    public static int m16725k(long j2, long j3) {
        return C4743p.m16685q(m16728q(j2), m16728q(j3));
    }

    public static void kja0(long[] jArr, int i2, int i3) {
        jk.a9(jArr);
        jk.ek5k(i2, i3, jArr.length);
        for (int i4 = i2; i4 < i3; i4++) {
            jArr[i4] = Long.MAX_VALUE ^ jArr[i4];
        }
        Arrays.sort(jArr, i2, i3);
        while (i2 < i3) {
            jArr[i2] = jArr[i2] ^ Long.MAX_VALUE;
            i2++;
        }
    }

    public static long ld6(long j2, long j3) {
        if (j3 < 0) {
            return m16725k(j2, j3) < 0 ? j2 : j2 - j3;
        }
        if (j2 >= 0) {
            return j2 % j3;
        }
        long j4 = j2 - ((((j2 >>> 1) / j3) << 1) * j3);
        if (m16725k(j4, j3) < 0) {
            j3 = 0;
        }
        return j4 - j3;
    }

    /* JADX INFO: renamed from: n */
    public static String m16726n(String str, long... jArr) {
        jk.a9(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(jArr.length * 5);
        sb.append(m16724h(jArr[0]));
        for (int i2 = 1; i2 < jArr.length; i2++) {
            sb.append(str);
            sb.append(m16724h(jArr[i2]));
        }
        return sb.toString();
    }

    public static void n7h(long[] jArr) {
        jk.a9(jArr);
        kja0(jArr, 0, jArr.length);
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: p */
    public static long m16727p(String str, int i2) {
        jk.a9(str);
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        if (i2 < 2 || i2 > 36) {
            throw new NumberFormatException("illegal radix: " + i2);
        }
        int i3 = toq.f68586zy[i2] - 1;
        long j2 = 0;
        for (int i4 = 0; i4 < str.length(); i4++) {
            int iDigit = Character.digit(str.charAt(i4), i2);
            if (iDigit == -1) {
                throw new NumberFormatException(str);
            }
            if (i4 > i3 && toq.m16731k(j2, iDigit, i2)) {
                throw new NumberFormatException("Too large for unsigned long: " + str);
            }
            j2 = (j2 * ((long) i2)) + ((long) iDigit);
        }
        return j2;
    }

    /* JADX INFO: renamed from: q */
    private static long m16728q(long j2) {
        return j2 ^ Long.MIN_VALUE;
    }

    public static void qrj(long[] jArr, int i2, int i3) {
        jk.a9(jArr);
        jk.ek5k(i2, i3, jArr.length);
        for (int i4 = i2; i4 < i3; i4++) {
            jArr[i4] = m16728q(jArr[i4]);
        }
        Arrays.sort(jArr, i2, i3);
        while (i2 < i3) {
            jArr[i2] = m16728q(jArr[i2]);
            i2++;
        }
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: s */
    public static long m16729s(String str) {
        return m16727p(str, 10);
    }

    @CanIgnoreReturnValue
    public static long toq(String str) {
        ld6 ld6VarM16662k = ld6.m16662k(str);
        try {
            return m16727p(ld6VarM16662k.f27289k, ld6VarM16662k.f68580toq);
        } catch (NumberFormatException e2) {
            NumberFormatException numberFormatException = new NumberFormatException("Error parsing value: " + str);
            numberFormatException.initCause(e2);
            throw numberFormatException;
        }
    }

    public static void x2(long[] jArr) {
        jk.a9(jArr);
        qrj(jArr, 0, jArr.length);
    }

    /* JADX INFO: renamed from: y */
    public static long m16730y(long... jArr) {
        jk.m15383q(jArr.length > 0);
        long jM16728q = m16728q(jArr[0]);
        for (int i2 = 1; i2 < jArr.length; i2++) {
            long jM16728q2 = m16728q(jArr[i2]);
            if (jM16728q2 < jM16728q) {
                jM16728q = jM16728q2;
            }
        }
        return m16728q(jM16728q);
    }

    public static long zy(long j2, long j3) {
        if (j3 < 0) {
            return m16725k(j2, j3) < 0 ? 0L : 1L;
        }
        if (j2 >= 0) {
            return j2 / j3;
        }
        long j4 = ((j2 >>> 1) / j3) << 1;
        return j4 + ((long) (m16725k(j2 - (j4 * j3), j3) < 0 ? 0 : 1));
    }
}
