package com.google.android.material.color;

/* JADX INFO: renamed from: com.google.android.material.color.k */
/* JADX INFO: compiled from: Blend.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3983k {

    /* JADX INFO: renamed from: k */
    private static final float f24176k = 15.0f;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final float f67488toq = 0.5f;

    private C3983k() {
    }

    /* JADX INFO: renamed from: k */
    public static int m14272k(int i2, int i3, float f2) {
        toq qVar = toq.toq(i2);
        toq qVar2 = toq.toq(i3);
        float fN7h = qVar.n7h();
        float fM14344y = qVar.m14344y();
        float fM14343s = qVar.m14343s();
        return toq.m14337g(fN7h + ((qVar2.n7h() - fN7h) * f2), fM14344y + ((qVar2.m14344y() - fM14344y) * f2), fM14343s + ((qVar2.m14343s() - fM14343s) * f2)).x2();
    }

    /* JADX INFO: renamed from: q */
    private static float m14273q(float f2, float f3) {
        float f4 = f3 - f2;
        float f5 = f4 + 360.0f;
        float f6 = f4 - 360.0f;
        float fAbs = Math.abs(f4);
        float fAbs2 = Math.abs(f5);
        float fAbs3 = Math.abs(f6);
        return (fAbs > fAbs2 || fAbs > fAbs3) ? (fAbs2 > fAbs || fAbs2 > fAbs3) ? ((double) f6) >= 0.0d ? 1.0f : -1.0f : ((double) f5) >= 0.0d ? 1.0f : -1.0f : ((double) f4) >= 0.0d ? 1.0f : -1.0f;
    }

    public static int toq(int i2, int i3, float f2) {
        return n7h.toq(toq.toq(m14272k(i2, i3, f2)).ld6(), toq.toq(i2).m14342p(), f7l8.x2(i2)).qrj();
    }

    public static int zy(int i2, int i3) {
        n7h n7hVarZy = n7h.zy(i2);
        n7h n7hVarZy2 = n7h.zy(i3);
        return n7h.toq(C3982h.m14271q(n7hVarZy.f7l8() + (Math.min(C3982h.toq(n7hVarZy.f7l8(), n7hVarZy2.f7l8()) * 0.5f, f24176k) * m14273q(n7hVarZy.f7l8(), n7hVarZy2.f7l8()))), n7hVarZy.m14313g(), n7hVarZy.m14316y()).qrj();
    }
}
