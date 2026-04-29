package com.miui.miwallpaper.material.hct;

import com.miui.miwallpaper.material.utils.C5283k;

/* JADX INFO: renamed from: com.miui.miwallpaper.material.hct.k */
/* JADX INFO: compiled from: Cam16.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C5275k {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    static final double[][] f72139ld6 = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    static final double[][] f72140x2 = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final double f72141f7l8;

    /* JADX INFO: renamed from: g */
    private final double f29491g;

    /* JADX INFO: renamed from: k */
    private final double f29492k;

    /* JADX INFO: renamed from: n */
    private final double f29493n;

    /* JADX INFO: renamed from: p */
    private final double[] f29494p = {0.0d, 0.0d, 0.0d};

    /* JADX INFO: renamed from: q */
    private final double f29495q;

    /* JADX INFO: renamed from: s */
    private final double f29496s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final double f72142toq;

    /* JADX INFO: renamed from: y */
    private final double f29497y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final double f72143zy;

    private C5275k(double d2, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11) {
        this.f29492k = d2;
        this.f72142toq = d4;
        this.f72143zy = d5;
        this.f29495q = d6;
        this.f29493n = d7;
        this.f29491g = d8;
        this.f72141f7l8 = d9;
        this.f29497y = d10;
        this.f29496s = d11;
    }

    public static C5275k f7l8(double d2, double d4, double d5, C5276q c5276q) {
        double dExpm1 = (Math.expm1(Math.hypot(d4, d5) * 0.0228d) / 0.0228d) / c5276q.m17879n();
        double dAtan2 = Math.atan2(d5, d4) * 57.29577951308232d;
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        return m17869n(d2 / (1.0d - ((d2 - 100.0d) * 0.007d)), dExpm1, dAtan2, c5276q);
    }

    /* JADX INFO: renamed from: g */
    public static C5275k m17868g(double d2, double d4, double d5) {
        return f7l8(d2, d4, d5, C5276q.f72144ld6);
    }

    /* JADX INFO: renamed from: n */
    private static C5275k m17869n(double d2, double d4, double d5, C5276q c5276q) {
        double d6 = d2 / 100.0d;
        double dZy = (4.0d / c5276q.zy()) * Math.sqrt(d6) * (c5276q.toq() + 4.0d) * c5276q.m17879n();
        double dM17879n = d4 * c5276q.m17879n();
        double dSqrt = Math.sqrt(((d4 / Math.sqrt(d6)) * c5276q.zy()) / (c5276q.toq() + 4.0d)) * 50.0d;
        double radians = Math.toRadians(d5);
        double d7 = (1.7000000000000002d * d2) / ((0.007d * d2) + 1.0d);
        double dLog1p = 43.859649122807014d * Math.log1p(dM17879n * 0.0228d);
        return new C5275k(d5, d4, d2, dZy, dM17879n, dSqrt, d7, Math.cos(radians) * dLog1p, Math.sin(radians) * dLog1p);
    }

    /* JADX INFO: renamed from: q */
    static C5275k m17870q(double d2, double d4, double d5) {
        return m17869n(d2, d4, d5, C5276q.f72144ld6);
    }

    public static C5275k toq(int i2) {
        return zy(i2, C5276q.f72144ld6);
    }

    /* JADX INFO: renamed from: y */
    static C5275k m17871y(double d2, double d4, double d5, C5276q c5276q) {
        double[][] dArr = f72139ld6;
        double[] dArr2 = dArr[0];
        double d6 = (dArr2[0] * d2) + (dArr2[1] * d4) + (dArr2[2] * d5);
        double[] dArr3 = dArr[1];
        double d7 = (dArr3[0] * d2) + (dArr3[1] * d4) + (dArr3[2] * d5);
        double[] dArr4 = dArr[2];
        double d8 = (dArr4[0] * d2) + (dArr4[1] * d4) + (dArr4[2] * d5);
        double d9 = c5276q.m17880p()[0] * d6;
        double d10 = c5276q.m17880p()[1] * d7;
        double d11 = c5276q.m17880p()[2] * d8;
        double dPow = Math.pow((c5276q.m17881q() * Math.abs(d9)) / 100.0d, 0.42d);
        double dPow2 = Math.pow((c5276q.m17881q() * Math.abs(d10)) / 100.0d, 0.42d);
        double dPow3 = Math.pow((c5276q.m17881q() * Math.abs(d11)) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d9) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((Math.signum(d10) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((Math.signum(d11) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d12 = (((dSignum * 11.0d) + ((-12.0d) * dSignum2)) + dSignum3) / 11.0d;
        double d13 = ((dSignum + dSignum2) - (dSignum3 * 2.0d)) / 9.0d;
        double d14 = dSignum2 * 20.0d;
        double d15 = (((dSignum * 20.0d) + d14) + (21.0d * dSignum3)) / 20.0d;
        double d16 = (((dSignum * 40.0d) + d14) + dSignum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d13, d12));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d17 = degrees;
        double radians = Math.toRadians(d17);
        double dPow4 = Math.pow((d16 * c5276q.f7l8()) / c5276q.toq(), c5276q.zy() * c5276q.ld6()) * 100.0d;
        double d18 = dPow4 / 100.0d;
        double dZy = (4.0d / c5276q.zy()) * Math.sqrt(d18) * (c5276q.toq() + 4.0d) * c5276q.m17879n();
        double dPow5 = Math.pow(1.64d - Math.pow(0.29d, c5276q.m17878g()), 0.73d) * Math.pow(((((((Math.cos(Math.toRadians(d17 < 20.14d ? d17 + 360.0d : d17) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * c5276q.m17883y()) * c5276q.m17882s()) * Math.hypot(d12, d13)) / (d15 + 0.305d), 0.9d);
        double dSqrt = Math.sqrt(d18) * dPow5;
        double dM17879n = dSqrt * c5276q.m17879n();
        double dLog1p = Math.log1p(dM17879n * 0.0228d) * 43.859649122807014d;
        return new C5275k(d17, dSqrt, dPow4, dZy, dM17879n, Math.sqrt((dPow5 * c5276q.zy()) / (c5276q.toq() + 4.0d)) * 50.0d, (1.7000000000000002d * dPow4) / ((0.007d * dPow4) + 1.0d), dLog1p * Math.cos(radians), dLog1p * Math.sin(radians));
    }

    static C5275k zy(int i2, C5276q c5276q) {
        double dN7h = C5283k.n7h((16711680 & i2) >> 16);
        double dN7h2 = C5283k.n7h((65280 & i2) >> 8);
        double dN7h3 = C5283k.n7h(i2 & 255);
        return m17871y((0.41233895d * dN7h) + (0.35762064d * dN7h2) + (0.18051042d * dN7h3), (0.2126d * dN7h) + (0.7152d * dN7h2) + (0.0722d * dN7h3), (dN7h * 0.01932141d) + (dN7h2 * 0.11916382d) + (dN7h3 * 0.95034478d), c5276q);
    }

    public double cdj() {
        return this.f29491g;
    }

    /* JADX INFO: renamed from: h */
    public double m17872h() {
        return this.f29495q;
    }

    /* JADX INFO: renamed from: i */
    double[] m17873i(C5276q c5276q, double[] dArr) {
        double dPow = Math.pow(((ld6() == 0.0d || qrj() == 0.0d) ? 0.0d : ld6() / Math.sqrt(qrj() / 100.0d)) / Math.pow(1.64d - Math.pow(0.29d, c5276q.m17878g()), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(x2());
        double dCos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d;
        double qVar = c5276q.toq() * Math.pow(qrj() / 100.0d, (1.0d / c5276q.zy()) / c5276q.ld6());
        double dM17883y = dCos * 3846.153846153846d * c5276q.m17883y() * c5276q.m17882s();
        double dF7l8 = qVar / c5276q.f7l8();
        double dSin = Math.sin(radians);
        double dCos2 = Math.cos(radians);
        double d2 = (((0.305d + dF7l8) * 23.0d) * dPow) / (((dM17883y * 23.0d) + ((11.0d * dPow) * dCos2)) + ((dPow * 108.0d) * dSin));
        double d4 = dCos2 * d2;
        double d5 = d2 * dSin;
        double d6 = dF7l8 * 460.0d;
        double d7 = (((451.0d * d4) + d6) + (288.0d * d5)) / 1403.0d;
        double d8 = ((d6 - (891.0d * d4)) - (261.0d * d5)) / 1403.0d;
        double d9 = ((d6 - (d4 * 220.0d)) - (d5 * 6300.0d)) / 1403.0d;
        double dSignum = Math.signum(d7) * (100.0d / c5276q.m17881q()) * Math.pow(Math.max(0.0d, (Math.abs(d7) * 27.13d) / (400.0d - Math.abs(d7))), 2.380952380952381d);
        double dSignum2 = Math.signum(d8) * (100.0d / c5276q.m17881q()) * Math.pow(Math.max(0.0d, (Math.abs(d8) * 27.13d) / (400.0d - Math.abs(d8))), 2.380952380952381d);
        double dSignum3 = Math.signum(d9) * (100.0d / c5276q.m17881q()) * Math.pow(Math.max(0.0d, (Math.abs(d9) * 27.13d) / (400.0d - Math.abs(d9))), 2.380952380952381d);
        double d10 = dSignum / c5276q.m17880p()[0];
        double d11 = dSignum2 / c5276q.m17880p()[1];
        double d12 = dSignum3 / c5276q.m17880p()[2];
        double[][] dArr2 = f72140x2;
        double[] dArr3 = dArr2[0];
        double d13 = (dArr3[0] * d10) + (dArr3[1] * d11) + (dArr3[2] * d12);
        double[] dArr4 = dArr2[1];
        double d14 = (dArr4[0] * d10) + (dArr4[1] * d11) + (dArr4[2] * d12);
        double[] dArr5 = dArr2[2];
        double d15 = (d10 * dArr5[0]) + (d11 * dArr5[1]) + (d12 * dArr5[2]);
        if (dArr == null) {
            return new double[]{d13, d14, d15};
        }
        dArr[0] = d13;
        dArr[1] = d14;
        dArr[2] = d15;
        return dArr;
    }

    /* JADX INFO: renamed from: k */
    double m17874k(C5275k c5275k) {
        double dN7h = n7h() - c5275k.n7h();
        double dM17876s = m17876s() - c5275k.m17876s();
        double dM17875p = m17875p() - c5275k.m17875p();
        return Math.pow(Math.sqrt((dN7h * dN7h) + (dM17876s * dM17876s) + (dM17875p * dM17875p)), 0.63d) * 1.41d;
    }

    public int ki() {
        return t8r(C5276q.f72144ld6);
    }

    public double kja0() {
        return this.f29493n;
    }

    public double ld6() {
        return this.f72142toq;
    }

    public double n7h() {
        return this.f72141f7l8;
    }

    /* JADX INFO: renamed from: p */
    public double m17875p() {
        return this.f29496s;
    }

    public double qrj() {
        return this.f72143zy;
    }

    /* JADX INFO: renamed from: s */
    public double m17876s() {
        return this.f29497y;
    }

    int t8r(C5276q c5276q) {
        double[] dArrM17873i = m17873i(c5276q, this.f29494p);
        return C5283k.m17953g(dArrM17873i[0], dArrM17873i[1], dArrM17873i[2]);
    }

    public double x2() {
        return this.f29492k;
    }
}
