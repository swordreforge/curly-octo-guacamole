package com.google.common.math;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: MathPreconditions.java */
/* JADX INFO: loaded from: classes2.dex */
@CanIgnoreReturnValue
@wlev.toq
final class f7l8 {
    private f7l8() {
    }

    static BigInteger f7l8(@NullableDecl String str, BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            return bigInteger;
        }
        throw new IllegalArgumentException(str + " (" + bigInteger + ") must be >= 0");
    }

    /* JADX INFO: renamed from: g */
    static long m16490g(@NullableDecl String str, long j2) {
        if (j2 >= 0) {
            return j2;
        }
        throw new IllegalArgumentException(str + " (" + j2 + ") must be >= 0");
    }

    /* JADX INFO: renamed from: k */
    static void m16491k(boolean z2, double d2, RoundingMode roundingMode) {
        if (z2) {
            return;
        }
        throw new ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + roundingMode);
    }

    static void ld6(boolean z2) {
        if (!z2) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    /* JADX INFO: renamed from: n */
    static int m16492n(@NullableDecl String str, int i2) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException(str + " (" + i2 + ") must be >= 0");
    }

    /* JADX INFO: renamed from: p */
    static BigInteger m16493p(@NullableDecl String str, BigInteger bigInteger) {
        if (bigInteger.signum() > 0) {
            return bigInteger;
        }
        throw new IllegalArgumentException(str + " (" + bigInteger + ") must be > 0");
    }

    /* JADX INFO: renamed from: q */
    static double m16494q(@NullableDecl String str, double d2) {
        if (d2 >= 0.0d) {
            return d2;
        }
        throw new IllegalArgumentException(str + " (" + d2 + ") must be >= 0");
    }

    /* JADX INFO: renamed from: s */
    static long m16495s(@NullableDecl String str, long j2) {
        if (j2 > 0) {
            return j2;
        }
        throw new IllegalArgumentException(str + " (" + j2 + ") must be > 0");
    }

    static void toq(boolean z2, String str, int i2, int i3) {
        if (z2) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + i2 + ", " + i3 + ")");
    }

    /* JADX INFO: renamed from: y */
    static int m16496y(@NullableDecl String str, int i2) {
        if (i2 > 0) {
            return i2;
        }
        throw new IllegalArgumentException(str + " (" + i2 + ") must be > 0");
    }

    static void zy(boolean z2, String str, long j2, long j3) {
        if (z2) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j2 + ", " + j3 + ")");
    }
}
