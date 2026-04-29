package ki;

/* JADX INFO: renamed from: ki.k */
/* JADX INFO: compiled from: MathUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class C6116k {
    private C6116k() {
    }

    public static int cdj(long j2) {
        int i2 = (int) j2;
        if (i2 == j2) {
            return i2;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int f7l8(int i2) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    /* JADX INFO: renamed from: g */
    public static long m22391g(long j2, long j3, long j4) {
        return j2 < j3 ? j3 : j2 > j4 ? j4 : j2;
    }

    /* JADX INFO: renamed from: h */
    public static long m22392h(long j2, long j3) {
        long j4 = j2 - j3;
        if (((j2 ^ j4) & (j3 ^ j2)) >= 0) {
            return j4;
        }
        throw new ArithmeticException("long overflow");
    }

    /* JADX INFO: renamed from: k */
    public static int m22393k(int i2, int i3) {
        int i4 = i2 + i3;
        if (((i2 ^ i4) & (i3 ^ i4)) >= 0) {
            return i4;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int kja0(int i2, int i3) {
        int i4 = i2 - i3;
        if (((i2 ^ i4) & (i3 ^ i2)) >= 0) {
            return i4;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int ld6(int i2, int i3) {
        long j2 = ((long) i2) * ((long) i3);
        int i4 = (int) j2;
        if (i4 == j2) {
            return i4;
        }
        throw new ArithmeticException("integer overflow");
    }

    /* JADX INFO: renamed from: n */
    public static int m22394n(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static long n7h(long j2) {
        if (j2 != Long.MIN_VALUE) {
            return -j2;
        }
        throw new ArithmeticException("long overflow");
    }

    /* JADX INFO: renamed from: p */
    public static long m22395p(long j2) {
        if (j2 != Long.MAX_VALUE) {
            return j2 + 1;
        }
        throw new ArithmeticException("long overflow");
    }

    /* JADX INFO: renamed from: q */
    public static float m22396q(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    public static int qrj(int i2) {
        if (i2 != Integer.MIN_VALUE) {
            return -i2;
        }
        throw new ArithmeticException("integer overflow");
    }

    /* JADX INFO: renamed from: s */
    public static int m22397s(int i2) {
        if (i2 != Integer.MAX_VALUE) {
            return i2 + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long toq(long j2, long j3) {
        long j4 = j2 + j3;
        if (((j2 ^ j4) & (j3 ^ j4)) >= 0) {
            return j4;
        }
        throw new ArithmeticException("long overflow");
    }

    public static long x2(long j2, long j3) {
        long j4 = j2 * j3;
        if (((Math.abs(j2) | Math.abs(j3)) >>> 31) == 0 || ((j3 == 0 || j4 / j3 == j2) && !(j2 == Long.MIN_VALUE && j3 == -1))) {
            return j4;
        }
        throw new ArithmeticException("long overflow");
    }

    /* JADX INFO: renamed from: y */
    public static long m22398y(long j2) {
        if (j2 != Long.MIN_VALUE) {
            return j2 - 1;
        }
        throw new ArithmeticException("long overflow");
    }

    public static double zy(double d2, double d4, double d5) {
        return d2 < d4 ? d4 : d2 > d5 ? d5 : d2;
    }
}
