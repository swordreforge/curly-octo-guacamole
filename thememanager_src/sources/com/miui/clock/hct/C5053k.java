package com.miui.clock.hct;

/* JADX INFO: renamed from: com.miui.clock.hct.k */
/* JADX INFO: compiled from: Cam16.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C5053k {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    static final double[][] f71860ld6 = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    static final double[][] f71861x2 = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final double f71862f7l8;

    /* JADX INFO: renamed from: g */
    private final double f29115g;

    /* JADX INFO: renamed from: k */
    private final double f29116k;

    /* JADX INFO: renamed from: n */
    private final double f29117n;

    /* JADX INFO: renamed from: p */
    private final double[] f29118p = {0.0d, 0.0d, 0.0d};

    /* JADX INFO: renamed from: q */
    private final double f29119q;

    /* JADX INFO: renamed from: s */
    private final double f29120s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final double f71863toq;

    /* JADX INFO: renamed from: y */
    private final double f29121y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final double f71864zy;

    private C5053k(double d2, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11) {
        this.f29116k = d2;
        this.f71863toq = d4;
        this.f71864zy = d5;
        this.f29119q = d6;
        this.f29117n = d7;
        this.f29115g = d8;
        this.f71862f7l8 = d9;
        this.f29121y = d10;
        this.f29120s = d11;
    }

    public static C5053k f7l8(double d2, double d4, double d5, f7l8 f7l8Var) {
        double dExpm1 = (Math.expm1(Math.hypot(d4, d5) * 0.0228d) / 0.0228d) / f7l8Var.m17650n();
        double dAtan2 = Math.atan2(d5, d4) * 57.29577951308232d;
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        return m17657n(d2 / (1.0d - ((d2 - 100.0d) * 0.007d)), dExpm1, dAtan2, f7l8Var);
    }

    /* JADX INFO: renamed from: g */
    public static C5053k m17656g(double d2, double d4, double d5) {
        return f7l8(d2, d4, d5, f7l8.f71856ld6);
    }

    /* JADX INFO: renamed from: n */
    private static C5053k m17657n(double d2, double d4, double d5, f7l8 f7l8Var) {
        double d6 = d2 / 100.0d;
        double dZy = (4.0d / f7l8Var.zy()) * Math.sqrt(d6) * (f7l8Var.toq() + 4.0d) * f7l8Var.m17650n();
        double dM17650n = d4 * f7l8Var.m17650n();
        double dSqrt = Math.sqrt(((d4 / Math.sqrt(d6)) * f7l8Var.zy()) / (f7l8Var.toq() + 4.0d)) * 50.0d;
        double radians = Math.toRadians(d5);
        double d7 = (1.7000000000000002d * d2) / ((0.007d * d2) + 1.0d);
        double dLog1p = 43.859649122807014d * Math.log1p(dM17650n * 0.0228d);
        return new C5053k(d5, d4, d2, dZy, dM17650n, dSqrt, d7, Math.cos(radians) * dLog1p, Math.sin(radians) * dLog1p);
    }

    /* JADX INFO: renamed from: q */
    static C5053k m17658q(double d2, double d4, double d5) {
        return m17657n(d2, d4, d5, f7l8.f71856ld6);
    }

    public static C5053k toq(int i2) {
        return zy(i2, f7l8.f71856ld6);
    }

    /* JADX INFO: renamed from: y */
    static C5053k m17659y(double d2, double d4, double d5, f7l8 f7l8Var) {
        double[][] dArr = f71860ld6;
        double[] dArr2 = dArr[0];
        double d6 = (dArr2[0] * d2) + (dArr2[1] * d4) + (dArr2[2] * d5);
        double[] dArr3 = dArr[1];
        double d7 = (dArr3[0] * d2) + (dArr3[1] * d4) + (dArr3[2] * d5);
        double[] dArr4 = dArr[2];
        double d8 = (dArr4[0] * d2) + (dArr4[1] * d4) + (dArr4[2] * d5);
        double d9 = f7l8Var.m17651p()[0] * d6;
        double d10 = f7l8Var.m17651p()[1] * d7;
        double d11 = f7l8Var.m17651p()[2] * d8;
        double dPow = Math.pow((f7l8Var.m17652q() * Math.abs(d9)) / 100.0d, 0.42d);
        double dPow2 = Math.pow((f7l8Var.m17652q() * Math.abs(d10)) / 100.0d, 0.42d);
        double dPow3 = Math.pow((f7l8Var.m17652q() * Math.abs(d11)) / 100.0d, 0.42d);
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
        double dPow4 = Math.pow((d16 * f7l8Var.f7l8()) / f7l8Var.toq(), f7l8Var.zy() * f7l8Var.ld6()) * 100.0d;
        double d18 = dPow4 / 100.0d;
        double dZy = (4.0d / f7l8Var.zy()) * Math.sqrt(d18) * (f7l8Var.toq() + 4.0d) * f7l8Var.m17650n();
        double dPow5 = Math.pow(1.64d - Math.pow(0.29d, f7l8Var.m17649g()), 0.73d) * Math.pow(((((((Math.cos(Math.toRadians(d17 < 20.14d ? d17 + 360.0d : d17) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * f7l8Var.m17654y()) * f7l8Var.m17653s()) * Math.hypot(d12, d13)) / (d15 + 0.305d), 0.9d);
        double dSqrt = Math.sqrt(d18) * dPow5;
        double dM17650n = dSqrt * f7l8Var.m17650n();
        double dLog1p = Math.log1p(dM17650n * 0.0228d) * 43.859649122807014d;
        return new C5053k(d17, dSqrt, dPow4, dZy, dM17650n, Math.sqrt((dPow5 * f7l8Var.zy()) / (f7l8Var.toq() + 4.0d)) * 50.0d, (1.7000000000000002d * dPow4) / ((0.007d * dPow4) + 1.0d), dLog1p * Math.cos(radians), dLog1p * Math.sin(radians));
    }

    static C5053k zy(int i2, f7l8 f7l8Var) {
        double dN7h = toq.n7h((16711680 & i2) >> 16);
        double dN7h2 = toq.n7h((65280 & i2) >> 8);
        double dN7h3 = toq.n7h(i2 & 255);
        return m17659y((0.41233895d * dN7h) + (0.35762064d * dN7h2) + (0.18051042d * dN7h3), (0.2126d * dN7h) + (0.7152d * dN7h2) + (0.0722d * dN7h3), (dN7h * 0.01932141d) + (dN7h2 * 0.11916382d) + (dN7h3 * 0.95034478d), f7l8Var);
    }

    public double cdj() {
        return this.f29115g;
    }

    /* JADX INFO: renamed from: h */
    public double m17660h() {
        return this.f29119q;
    }

    /* JADX INFO: renamed from: i */
    double[] m17661i(f7l8 f7l8Var, double[] dArr) {
        double dPow = Math.pow(((ld6() == 0.0d || qrj() == 0.0d) ? 0.0d : ld6() / Math.sqrt(qrj() / 100.0d)) / Math.pow(1.64d - Math.pow(0.29d, f7l8Var.m17649g()), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(x2());
        double dCos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d;
        double qVar = f7l8Var.toq() * Math.pow(qrj() / 100.0d, (1.0d / f7l8Var.zy()) / f7l8Var.ld6());
        double dM17654y = dCos * 3846.153846153846d * f7l8Var.m17654y() * f7l8Var.m17653s();
        double dF7l8 = qVar / f7l8Var.f7l8();
        double dSin = Math.sin(radians);
        double dCos2 = Math.cos(radians);
        double d2 = (((0.305d + dF7l8) * 23.0d) * dPow) / (((dM17654y * 23.0d) + ((11.0d * dPow) * dCos2)) + ((dPow * 108.0d) * dSin));
        double d4 = dCos2 * d2;
        double d5 = d2 * dSin;
        double d6 = dF7l8 * 460.0d;
        double d7 = (((451.0d * d4) + d6) + (288.0d * d5)) / 1403.0d;
        double d8 = ((d6 - (891.0d * d4)) - (261.0d * d5)) / 1403.0d;
        double d9 = ((d6 - (d4 * 220.0d)) - (d5 * 6300.0d)) / 1403.0d;
        double dSignum = Math.signum(d7) * (100.0d / f7l8Var.m17652q()) * Math.pow(Math.max(0.0d, (Math.abs(d7) * 27.13d) / (400.0d - Math.abs(d7))), 2.380952380952381d);
        double dSignum2 = Math.signum(d8) * (100.0d / f7l8Var.m17652q()) * Math.pow(Math.max(0.0d, (Math.abs(d8) * 27.13d) / (400.0d - Math.abs(d8))), 2.380952380952381d);
        double dSignum3 = Math.signum(d9) * (100.0d / f7l8Var.m17652q()) * Math.pow(Math.max(0.0d, (Math.abs(d9) * 27.13d) / (400.0d - Math.abs(d9))), 2.380952380952381d);
        double d10 = dSignum / f7l8Var.m17651p()[0];
        double d11 = dSignum2 / f7l8Var.m17651p()[1];
        double d12 = dSignum3 / f7l8Var.m17651p()[2];
        double[][] dArr2 = f71861x2;
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
    double m17662k(C5053k c5053k) {
        double dN7h = n7h() - c5053k.n7h();
        double dM17664s = m17664s() - c5053k.m17664s();
        double dM17663p = m17663p() - c5053k.m17663p();
        return Math.pow(Math.sqrt((dN7h * dN7h) + (dM17664s * dM17664s) + (dM17663p * dM17663p)), 0.63d) * 1.41d;
    }

    public int ki() {
        return t8r(f7l8.f71856ld6);
    }

    public double kja0() {
        return this.f29117n;
    }

    public double ld6() {
        return this.f71863toq;
    }

    public double n7h() {
        return this.f71862f7l8;
    }

    /* JADX INFO: renamed from: p */
    public double m17663p() {
        return this.f29120s;
    }

    public double qrj() {
        return this.f71864zy;
    }

    /* JADX INFO: renamed from: s */
    public double m17664s() {
        return this.f29121y;
    }

    int t8r(f7l8 f7l8Var) {
        double[] dArrM17661i = m17661i(f7l8Var, this.f29118p);
        return toq.m17679g(dArrM17661i[0], dArrM17661i[1], dArrM17661i[2]);
    }

    public double x2() {
        return this.f29116k;
    }
}
