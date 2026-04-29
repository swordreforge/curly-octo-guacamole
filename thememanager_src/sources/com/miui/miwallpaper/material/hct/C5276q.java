package com.miui.miwallpaper.material.hct;

import com.miui.miwallpaper.material.utils.C5283k;

/* JADX INFO: renamed from: com.miui.miwallpaper.material.hct.q */
/* JADX INFO: compiled from: ViewingConditions.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C5276q {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final C5276q f72144ld6 = m17877k(50.0d);

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final double[] f72145f7l8;

    /* JADX INFO: renamed from: g */
    private final double f29498g;

    /* JADX INFO: renamed from: k */
    private final double f29499k;

    /* JADX INFO: renamed from: n */
    private final double f29500n;

    /* JADX INFO: renamed from: p */
    private final double f29501p;

    /* JADX INFO: renamed from: q */
    private final double f29502q;

    /* JADX INFO: renamed from: s */
    private final double f29503s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final double f72146toq;

    /* JADX INFO: renamed from: y */
    private final double f29504y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final double f72147zy;

    private C5276q(double d2, double d4, double d5, double d6, double d7, double d8, double[] dArr, double d9, double d10, double d11) {
        this.f29498g = d2;
        this.f29499k = d4;
        this.f72146toq = d5;
        this.f72147zy = d6;
        this.f29502q = d7;
        this.f29500n = d8;
        this.f72145f7l8 = dArr;
        this.f29504y = d9;
        this.f29503s = d10;
        this.f29501p = d11;
    }

    /* JADX INFO: renamed from: k */
    public static C5276q m17877k(double d2) {
        return x2(C5283k.ki(), (C5283k.m17955i(50.0d) * 63.66197723675813d) / 100.0d, d2, 2.0d, false);
    }

    public static C5276q x2(double[] dArr, double d2, double d4, double d5, boolean z2) {
        double dMax = Math.max(0.1d, d4);
        double[][] dArr2 = C5275k.f72139ld6;
        double d6 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d7 = dArr3[0] * d6;
        double d8 = dArr[1];
        double d9 = d7 + (dArr3[1] * d8);
        double d10 = dArr[2];
        double d11 = d9 + (dArr3[2] * d10);
        double[] dArr4 = dArr2[1];
        double d12 = (dArr4[0] * d6) + (dArr4[1] * d8) + (dArr4[2] * d10);
        double[] dArr5 = dArr2[2];
        double d13 = (d6 * dArr5[0]) + (d8 * dArr5[1]) + (d10 * dArr5[2]);
        double d14 = (d5 / 10.0d) + 0.8d;
        double dM17975q = d14 >= 0.9d ? com.miui.miwallpaper.material.utils.toq.m17975q(0.59d, 0.69d, (d14 - 0.9d) * 10.0d) : com.miui.miwallpaper.material.utils.toq.m17975q(0.525d, 0.59d, (d14 - 0.8d) * 10.0d);
        double dM17973k = com.miui.miwallpaper.material.utils.toq.m17973k(0.0d, 1.0d, z2 ? 1.0d : (1.0d - (Math.exp(((-d2) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d14);
        double[] dArr6 = {(((100.0d / d11) * dM17973k) + 1.0d) - dM17973k, (((100.0d / d12) * dM17973k) + 1.0d) - dM17973k, (((100.0d / d13) * dM17973k) + 1.0d) - dM17973k};
        double d15 = 5.0d * d2;
        double d16 = 1.0d / (d15 + 1.0d);
        double d17 = d16 * d16 * d16 * d16;
        double d18 = 1.0d - d17;
        double dCbrt = (d17 * d2) + (0.1d * d18 * d18 * Math.cbrt(d15));
        double dM17955i = C5283k.m17955i(dMax) / dArr[1];
        double dSqrt = Math.sqrt(dM17955i) + 1.48d;
        double dPow = 0.725d / Math.pow(dM17955i, 0.2d);
        double dPow2 = Math.pow(((dArr6[2] * dCbrt) * d13) / 100.0d, 0.42d);
        double[] dArr7 = {Math.pow(((dArr6[0] * dCbrt) * d11) / 100.0d, 0.42d), Math.pow(((dArr6[1] * dCbrt) * d12) / 100.0d, 0.42d), dPow2};
        double d19 = dArr7[0];
        double d20 = (d19 * 400.0d) / (d19 + 27.13d);
        double d21 = dArr7[1];
        return new C5276q(dM17955i, ((d20 * 2.0d) + ((d21 * 400.0d) / (d21 + 27.13d)) + (((400.0d * dPow2) / (dPow2 + 27.13d)) * 0.05d)) * dPow, dPow, dPow, dM17975q, d14, dArr6, dCbrt, Math.pow(dCbrt, 0.25d), dSqrt);
    }

    public double f7l8() {
        return this.f72146toq;
    }

    /* JADX INFO: renamed from: g */
    public double m17878g() {
        return this.f29498g;
    }

    double ld6() {
        return this.f29501p;
    }

    /* JADX INFO: renamed from: n */
    public double m17879n() {
        return this.f29503s;
    }

    /* JADX INFO: renamed from: p */
    public double[] m17880p() {
        return this.f72145f7l8;
    }

    /* JADX INFO: renamed from: q */
    double m17881q() {
        return this.f29504y;
    }

    /* JADX INFO: renamed from: s */
    double m17882s() {
        return this.f72147zy;
    }

    public double toq() {
        return this.f29499k;
    }

    /* JADX INFO: renamed from: y */
    double m17883y() {
        return this.f29500n;
    }

    double zy() {
        return this.f29502q;
    }
}
