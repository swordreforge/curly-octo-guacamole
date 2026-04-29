package com.miui.miwallpaper.material.utils;

/* JADX INFO: compiled from: MathUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {
    private toq() {
    }

    public static double f7l8(double d2) {
        double d4 = d2 % 360.0d;
        return d4 < 0.0d ? d4 + 360.0d : d4;
    }

    /* JADX INFO: renamed from: g */
    public static double m17972g(double d2, double d4) {
        return f7l8(d4 - d2) <= 180.0d ? 1.0d : -1.0d;
    }

    /* JADX INFO: renamed from: k */
    public static double m17973k(double d2, double d4, double d5) {
        return d5 < d2 ? d2 : d5 > d4 ? d4 : d5;
    }

    /* JADX INFO: renamed from: n */
    public static double[] m17974n(double[] dArr, double[][] dArr2) {
        double d2 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d4 = dArr3[0] * d2;
        double d5 = dArr[1];
        double d6 = d4 + (dArr3[1] * d5);
        double d7 = dArr[2];
        double d8 = d6 + (dArr3[2] * d7);
        double[] dArr4 = dArr2[1];
        double d9 = (dArr4[0] * d2) + (dArr4[1] * d5) + (dArr4[2] * d7);
        double[] dArr5 = dArr2[2];
        return new double[]{d8, d9, (d2 * dArr5[0]) + (d5 * dArr5[1]) + (d7 * dArr5[2])};
    }

    /* JADX INFO: renamed from: q */
    public static double m17975q(double d2, double d4, double d5) {
        return ((1.0d - d5) * d2) + (d5 * d4);
    }

    /* JADX INFO: renamed from: s */
    public static int m17976s(double d2) {
        if (d2 < 0.0d) {
            return -1;
        }
        return d2 == 0.0d ? 0 : 1;
    }

    public static int toq(int i2, int i3, int i4) {
        return i4 < i2 ? i2 : i4 > i3 ? i3 : i4;
    }

    /* JADX INFO: renamed from: y */
    public static int m17977y(int i2) {
        int i3 = i2 % 360;
        return i3 < 0 ? i3 + 360 : i3;
    }

    public static double zy(double d2, double d4) {
        return 180.0d - Math.abs(Math.abs(d2 - d4) - 180.0d);
    }
}
