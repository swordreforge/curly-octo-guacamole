package lh;

/* JADX INFO: renamed from: lh.k */
/* JADX INFO: compiled from: MathUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C6775k {

    /* JADX INFO: renamed from: k */
    public static final float f37606k = 1.0E-4f;

    private C6775k() {
    }

    private static float f7l8(float f2, float f3, float f4, float f5) {
        return (f2 <= f3 || f2 <= f4 || f2 <= f5) ? (f3 <= f4 || f3 <= f5) ? f4 > f5 ? f4 : f5 : f3 : f2;
    }

    /* JADX INFO: renamed from: g */
    public static float m24715g(float f2, float f3, float f4) {
        return ((1.0f - f4) * f2) + (f4 * f3);
    }

    /* JADX INFO: renamed from: k */
    public static float m24716k(float f2, float f3, float f4, float f5) {
        return (float) Math.hypot(f4 - f2, f5 - f3);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m24717n(float f2, float f3, float f4) {
        return f2 + f4 >= f3;
    }

    /* JADX INFO: renamed from: q */
    public static int m24718q(int i2, int i3) {
        int i4 = i2 / i3;
        if ((i2 ^ i3) < 0 && i4 * i3 != i2) {
            i4--;
        }
        return i2 - (i4 * i3);
    }

    public static float toq(float f2, float f3, float f4, float f5, float f6, float f7) {
        return f7l8(m24716k(f2, f3, f4, f5), m24716k(f2, f3, f6, f5), m24716k(f2, f3, f6, f7), m24716k(f2, f3, f4, f7));
    }

    public static float zy(float f2, int i2) {
        float f3 = i2;
        int i3 = (int) (f2 / f3);
        if (Math.signum(f2) * f3 < 0.0f && i3 * i2 != f2) {
            i3--;
        }
        return f2 - (i3 * i2);
    }
}
