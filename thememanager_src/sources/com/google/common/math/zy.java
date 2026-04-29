package com.google.common.math;

import com.google.common.base.jk;
import java.math.BigInteger;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: DoubleUtils.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
final class zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7732q
    static final long f68375f7l8 = 4607182418800017408L;

    /* JADX INFO: renamed from: g */
    static final long f27191g = 4503599627370496L;

    /* JADX INFO: renamed from: k */
    static final long f27192k = 4503599627370495L;

    /* JADX INFO: renamed from: n */
    static final int f27193n = 1023;

    /* JADX INFO: renamed from: q */
    static final int f27194q = 52;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final long f68376toq = 9218868437227405312L;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    static final long f68377zy = Long.MIN_VALUE;

    private zy() {
    }

    static double f7l8(double d2) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d2) & f27192k) | f68375f7l8);
    }

    /* JADX INFO: renamed from: g */
    static double m16575g(double d2) {
        return -Math.nextUp(-d2);
    }

    /* JADX INFO: renamed from: k */
    static double m16576k(BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        boolean z2 = true;
        int iBitLength = bigIntegerAbs.bitLength() - 1;
        if (iBitLength < 63) {
            return bigInteger.longValue();
        }
        if (iBitLength > 1023) {
            return ((double) bigInteger.signum()) * Double.POSITIVE_INFINITY;
        }
        int i2 = (iBitLength - 52) - 1;
        long jLongValue = bigIntegerAbs.shiftRight(i2).longValue();
        long j2 = (jLongValue >> 1) & f27192k;
        if ((jLongValue & 1) == 0 || ((j2 & 1) == 0 && bigIntegerAbs.getLowestSetBit() >= i2)) {
            z2 = false;
        }
        if (z2) {
            j2++;
        }
        return Double.longBitsToDouble(((((long) (iBitLength + 1023)) << 52) + j2) | (((long) bigInteger.signum()) & Long.MIN_VALUE));
    }

    /* JADX INFO: renamed from: n */
    static boolean m16577n(double d2) {
        return Math.getExponent(d2) >= -1022;
    }

    /* JADX INFO: renamed from: q */
    static boolean m16578q(double d2) {
        return Math.getExponent(d2) <= 1023;
    }

    static double toq(double d2) {
        jk.m15383q(!Double.isNaN(d2));
        if (d2 > 0.0d) {
            return d2;
        }
        return 0.0d;
    }

    static long zy(double d2) {
        jk.m15380n(m16578q(d2), "not a normal value");
        int exponent = Math.getExponent(d2);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d2) & f27192k;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | f27191g;
    }
}
