package com.miui.clock.hct;

/* JADX INFO: compiled from: ColorUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    static final double[][] f29124k = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final double[][] f71867toq = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    static final double[] f71868zy = {95.047d, 100.0d, 108.883d};

    private toq() {
    }

    public static int cdj(int i2) {
        return (i2 >> 16) & 255;
    }

    public static int f7l8(int i2) {
        return i2 & 255;
    }

    /* JADX INFO: renamed from: g */
    public static int m17679g(double d2, double d4, double d5) {
        double[][] dArr = f71867toq;
        double[] dArr2 = dArr[0];
        double d6 = (dArr2[0] * d2) + (dArr2[1] * d4) + (dArr2[2] * d5);
        double[] dArr3 = dArr[1];
        double d7 = (dArr3[0] * d2) + (dArr3[1] * d4) + (dArr3[2] * d5);
        double[] dArr4 = dArr[2];
        return m17683n(m17687y(d6), m17687y(d7), m17687y((dArr4[0] * d2) + (dArr4[1] * d4) + (dArr4[2] * d5)));
    }

    /* JADX INFO: renamed from: h */
    public static double m17680h(double d2) {
        return (ld6(d2 / 100.0d) * 116.0d) - 16.0d;
    }

    /* JADX INFO: renamed from: i */
    public static double m17681i(double d2) {
        return qrj((d2 + 16.0d) / 116.0d) * 100.0d;
    }

    /* JADX INFO: renamed from: k */
    public static int m17682k(int i2) {
        return (i2 >> 24) & 255;
    }

    public static double[] ki() {
        return f71868zy;
    }

    public static double kja0(int i2) {
        return (ld6(t8r(i2)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    static double ld6(double d2) {
        return d2 > 0.008856451679035631d ? Math.pow(d2, 0.3333333333333333d) : ((d2 * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    /* JADX INFO: renamed from: n */
    public static int m17683n(int i2, int i3, int i4) {
        return ((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255);
    }

    public static double n7h(int i2) {
        double d2 = ((double) i2) / 255.0d;
        return (d2 <= 0.040449936d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m17684p(int i2) {
        return m17682k(i2) >= 255;
    }

    /* JADX INFO: renamed from: q */
    public static int m17685q(double d2) {
        int iM17687y = m17687y(m17681i(d2));
        return m17683n(iM17687y, iM17687y, iM17687y);
    }

    static double qrj(double d2) {
        double d4 = d2 * d2 * d2;
        return d4 > 0.008856451679035631d ? d4 : ((d2 * 116.0d) - 16.0d) / 903.2962962962963d;
    }

    /* JADX INFO: renamed from: s */
    public static int m17686s(int i2) {
        return (i2 >> 8) & 255;
    }

    public static double[] t8r(int i2) {
        return C5054n.m17667n(new double[]{n7h(cdj(i2)), n7h(m17686s(i2)), n7h(f7l8(i2))}, f29124k);
    }

    public static int toq(double d2, double d4, double d5) {
        double[] dArr = f71868zy;
        double d6 = (d2 + 16.0d) / 116.0d;
        double d7 = d6 - (d5 / 200.0d);
        return m17679g(qrj((d4 / 500.0d) + d6) * dArr[0], qrj(d6) * dArr[1], qrj(d7) * dArr[2]);
    }

    public static double[] x2(int i2) {
        double dN7h = n7h(cdj(i2));
        double dN7h2 = n7h(m17686s(i2));
        double dN7h3 = n7h(f7l8(i2));
        double[][] dArr = f29124k;
        double[] dArr2 = dArr[0];
        double d2 = (dArr2[0] * dN7h) + (dArr2[1] * dN7h2) + (dArr2[2] * dN7h3);
        double[] dArr3 = dArr[1];
        double d4 = (dArr3[0] * dN7h) + (dArr3[1] * dN7h2) + (dArr3[2] * dN7h3);
        double[] dArr4 = dArr[2];
        double d5 = (dArr4[0] * dN7h) + (dArr4[1] * dN7h2) + (dArr4[2] * dN7h3);
        double[] dArr5 = f71868zy;
        double d6 = d2 / dArr5[0];
        double d7 = d4 / dArr5[1];
        double d8 = d5 / dArr5[2];
        double dLd6 = ld6(d6);
        double dLd62 = ld6(d7);
        return new double[]{(116.0d * dLd62) - 16.0d, (dLd6 - dLd62) * 500.0d, (dLd62 - ld6(d8)) * 200.0d};
    }

    /* JADX INFO: renamed from: y */
    public static int m17687y(double d2) {
        double d4 = d2 / 100.0d;
        return C5054n.toq(0, 255, (int) Math.round((d4 <= 0.0031308d ? d4 * 12.92d : (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d));
    }

    public static int zy(double[] dArr) {
        return m17683n(m17687y(dArr[0]), m17687y(dArr[1]), m17687y(dArr[2]));
    }
}
