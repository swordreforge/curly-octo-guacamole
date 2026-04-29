package com.google.android.material.color;

/* JADX INFO: renamed from: com.google.android.material.color.h */
/* JADX INFO: compiled from: MathUtils.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3982h {
    private C3982h() {
    }

    static float f7l8(float f2) {
        return (f2 / 180.0f) * 3.1415927f;
    }

    /* JADX INFO: renamed from: g */
    static float m14268g(float f2) {
        return (f2 * 180.0f) / 3.1415927f;
    }

    /* JADX INFO: renamed from: k */
    static float m14269k(float f2, float f3, float f4) {
        return Math.min(Math.max(f4, f2), f3);
    }

    /* JADX INFO: renamed from: n */
    public static int m14270n(int i2) {
        return i2 < 0 ? (i2 % 360) + 360 : i2 >= 360 ? i2 % 360 : i2;
    }

    /* JADX INFO: renamed from: q */
    public static float m14271q(float f2) {
        return f2 < 0.0f ? (f2 % 360.0f) + 360.0f : f2 >= 360.0f ? f2 % 360.0f : f2;
    }

    public static float toq(float f2, float f3) {
        return 180.0f - Math.abs(Math.abs(f2 - f3) - 180.0f);
    }

    public static float zy(float f2, float f3, float f4) {
        return ((1.0f - f4) * f2) + (f4 * f3);
    }
}
