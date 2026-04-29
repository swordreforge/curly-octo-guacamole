package com.google.common.math;

import com.google.common.base.jk;
import com.google.common.primitives.C4739k;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: DoubleMath.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class toq {

    /* JADX INFO: renamed from: g */
    @InterfaceC7732q
    static final int f27182g = 170;

    /* JADX INFO: renamed from: k */
    private static final double f27183k = -2.147483648E9d;

    /* JADX INFO: renamed from: q */
    private static final double f27185q = 9.223372036854776E18d;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final double f68371toq = 2.147483647E9d;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final double f68372zy = -9.223372036854776E18d;

    /* JADX INFO: renamed from: n */
    private static final double f27184n = Math.log(2.0d);

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7732q
    static final double[] f68370f7l8 = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* JADX INFO: renamed from: com.google.common.math.toq$k */
    /* JADX INFO: compiled from: DoubleMath.java */
    static /* synthetic */ class C4725k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f27186k;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f27186k = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27186k[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27186k[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27186k[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27186k[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27186k[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27186k[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27186k[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private toq() {
    }

    @wlev.zy
    public static long cdj(double d2, RoundingMode roundingMode) {
        double dN7h = n7h(d2, roundingMode);
        f7l8.m16491k((f68372zy - dN7h < 1.0d) & (dN7h < f27185q), d2, roundingMode);
        return (long) dN7h;
    }

    public static double f7l8(double d2) {
        return Math.log(d2) / f27184n;
    }

    @wlev.zy
    /* JADX INFO: renamed from: g */
    public static boolean m16558g(double d2) {
        if (d2 <= 0.0d || !zy.m16578q(d2)) {
            return false;
        }
        long jZy = zy.zy(d2);
        return (jZy & (jZy - 1)) == 0;
    }

    @wlev.zy
    /* JADX INFO: renamed from: h */
    public static int m16559h(double d2, RoundingMode roundingMode) {
        double dN7h = n7h(d2, roundingMode);
        f7l8.m16491k((dN7h > -2.147483649E9d) & (dN7h < 2.147483648E9d), d2, roundingMode);
        return (int) dN7h;
    }

    @CanIgnoreReturnValue
    @wlev.zy
    /* JADX INFO: renamed from: k */
    private static double m16560k(double d2) {
        jk.m15383q(zy.m16578q(d2));
        return d2;
    }

    @wlev.zy
    public static BigInteger kja0(double d2, RoundingMode roundingMode) {
        double dN7h = n7h(d2, roundingMode);
        if ((f68372zy - dN7h < 1.0d) && (dN7h < f27185q)) {
            return BigInteger.valueOf((long) dN7h);
        }
        BigInteger bigIntegerShiftLeft = BigInteger.valueOf(zy.zy(dN7h)).shiftLeft(Math.getExponent(dN7h) - 52);
        return dN7h < 0.0d ? bigIntegerShiftLeft.negate() : bigIntegerShiftLeft;
    }

    @wlev.zy
    @Deprecated
    public static double ld6(double... dArr) {
        jk.m15380n(dArr.length > 0, "Cannot take mean of 0 values");
        double dM16560k = m16560k(dArr[0]);
        long j2 = 1;
        for (int i2 = 1; i2 < dArr.length; i2++) {
            m16560k(dArr[i2]);
            j2++;
            dM16560k += (dArr[i2] - dM16560k) / j2;
        }
        return dM16560k;
    }

    @wlev.zy
    /* JADX INFO: renamed from: n */
    public static boolean m16561n(double d2) {
        return zy.m16578q(d2) && (d2 == 0.0d || 52 - Long.numberOfTrailingZeros(zy.zy(d2)) <= Math.getExponent(d2));
    }

    @wlev.zy
    static double n7h(double d2, RoundingMode roundingMode) {
        if (!zy.m16578q(d2)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (C4725k.f27186k[roundingMode.ordinal()]) {
            case 1:
                f7l8.ld6(m16561n(d2));
                return d2;
            case 2:
                return (d2 >= 0.0d || m16561n(d2)) ? d2 : ((long) d2) - 1;
            case 3:
                return (d2 <= 0.0d || m16561n(d2)) ? d2 : ((long) d2) + 1;
            case 4:
                return d2;
            case 5:
                if (m16561n(d2)) {
                    return d2;
                }
                return ((long) d2) + ((long) (d2 > 0.0d ? 1 : -1));
            case 6:
                return Math.rint(d2);
            case 7:
                double dRint = Math.rint(d2);
                return Math.abs(d2 - dRint) == 0.5d ? d2 + Math.copySign(0.5d, d2) : dRint;
            case 8:
                double dRint2 = Math.rint(d2);
                return Math.abs(d2 - dRint2) == 0.5d ? d2 : dRint2;
            default:
                throw new AssertionError();
        }
    }

    @wlev.zy
    @Deprecated
    /* JADX INFO: renamed from: p */
    public static double m16562p(Iterator<? extends Number> it) {
        jk.m15380n(it.hasNext(), "Cannot take mean of 0 values");
        double dM16560k = m16560k(it.next().doubleValue());
        long j2 = 1;
        while (it.hasNext()) {
            j2++;
            dM16560k += (m16560k(it.next().doubleValue()) - dM16560k) / j2;
        }
        return dM16560k;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m16563q(double d2, double d4, double d5) {
        f7l8.m16494q("tolerance", d5);
        return Math.copySign(d2 - d4, 1.0d) <= d5 || d2 == d4 || (Double.isNaN(d2) && Double.isNaN(d4));
    }

    @Deprecated
    public static double qrj(long... jArr) {
        jk.m15380n(jArr.length > 0, "Cannot take mean of 0 values");
        double d2 = jArr[0];
        long j2 = 1;
        for (int i2 = 1; i2 < jArr.length; i2++) {
            j2++;
            d2 += (jArr[i2] - d2) / j2;
        }
        return d2;
    }

    @wlev.zy
    @Deprecated
    /* JADX INFO: renamed from: s */
    public static double m16564s(Iterable<? extends Number> iterable) {
        return m16562p(iterable.iterator());
    }

    public static double toq(int i2) {
        f7l8.m16492n("n", i2);
        if (i2 > f27182g) {
            return Double.POSITIVE_INFINITY;
        }
        double d2 = 1.0d;
        int i3 = i2 & (-16);
        while (true) {
            i3++;
            if (i3 > i2) {
                return d2 * f68370f7l8[i2 >> 4];
            }
            d2 *= (double) i3;
        }
    }

    @Deprecated
    public static double x2(int... iArr) {
        jk.m15380n(iArr.length > 0, "Cannot take mean of 0 values");
        long j2 = 0;
        for (int i2 : iArr) {
            j2 += (long) i2;
        }
        return j2 / ((double) iArr.length);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @wlev.zy
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m16565y(double r5, java.math.RoundingMode r7) {
        /*
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L10
            boolean r0 = com.google.common.math.zy.m16578q(r5)
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.String r3 = "x must be positive and finite"
            com.google.common.base.jk.m15380n(r0, r3)
            int r0 = java.lang.Math.getExponent(r5)
            boolean r3 = com.google.common.math.zy.m16577n(r5)
            if (r3 != 0) goto L2a
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r5 = r5 * r0
            int r5 = m16565y(r5, r7)
            int r5 = r5 + (-52)
            return r5
        L2a:
            int[] r3 = com.google.common.math.toq.C4725k.f27186k
            int r7 = r7.ordinal()
            r7 = r3[r7]
            switch(r7) {
                case 1: goto L61;
                case 2: goto L68;
                case 3: goto L5a;
                case 4: goto L50;
                case 5: goto L48;
                case 6: goto L3b;
                case 7: goto L3b;
                case 8: goto L3b;
                default: goto L35;
            }
        L35:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L3b:
            double r5 = com.google.common.math.zy.f7l8(r5)
            double r5 = r5 * r5
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 <= 0) goto L68
            r1 = r2
            goto L68
        L48:
            if (r0 < 0) goto L4b
            r1 = r2
        L4b:
            boolean r5 = m16558g(r5)
            goto L57
        L50:
            if (r0 >= 0) goto L53
            r1 = r2
        L53:
            boolean r5 = m16558g(r5)
        L57:
            r5 = r5 ^ r2
            r1 = r1 & r5
            goto L68
        L5a:
            boolean r5 = m16558g(r5)
            r1 = r5 ^ 1
            goto L68
        L61:
            boolean r5 = m16558g(r5)
            com.google.common.math.f7l8.ld6(r5)
        L68:
            if (r1 == 0) goto L6c
            int r0 = r0 + 1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.toq.m16565y(double, java.math.RoundingMode):int");
    }

    public static int zy(double d2, double d4, double d5) {
        if (m16563q(d2, d4, d5)) {
            return 0;
        }
        if (d2 < d4) {
            return -1;
        }
        if (d2 > d4) {
            return 1;
        }
        return C4739k.m16649q(Double.isNaN(d2), Double.isNaN(d4));
    }
}
