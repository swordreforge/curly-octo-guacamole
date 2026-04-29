package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: compiled from: MonotonicCurveFit.java */
/* JADX INFO: loaded from: classes.dex */
public class ld6 extends toq {

    /* JADX INFO: renamed from: s */
    private static final String f1623s = "MonotonicCurveFit";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f47309f7l8 = true;

    /* JADX INFO: renamed from: g */
    private double[][] f1624g;

    /* JADX INFO: renamed from: n */
    private double[][] f1625n;

    /* JADX INFO: renamed from: q */
    private double[] f1626q;

    /* JADX INFO: renamed from: y */
    double[] f1627y;

    public ld6(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f1627y = new double[length2];
        int i2 = length - 1;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i2, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        for (int i3 = 0; i3 < length2; i3++) {
            int i4 = 0;
            while (i4 < i2) {
                int i5 = i4 + 1;
                double d2 = dArr[i5] - dArr[i4];
                double[] dArr5 = dArr3[i4];
                double d4 = (dArr2[i5][i3] - dArr2[i4][i3]) / d2;
                dArr5[i3] = d4;
                if (i4 == 0) {
                    dArr4[i4][i3] = d4;
                } else {
                    dArr4[i4][i3] = (dArr3[i4 - 1][i3] + d4) * 0.5d;
                }
                i4 = i5;
            }
            dArr4[i2][i3] = dArr3[length - 2][i3];
        }
        for (int i6 = 0; i6 < i2; i6++) {
            for (int i7 = 0; i7 < length2; i7++) {
                double d5 = dArr3[i6][i7];
                if (d5 == 0.0d) {
                    dArr4[i6][i7] = 0.0d;
                    dArr4[i6 + 1][i7] = 0.0d;
                } else {
                    double d6 = dArr4[i6][i7] / d5;
                    int i8 = i6 + 1;
                    double d7 = dArr4[i8][i7] / d5;
                    double dHypot = Math.hypot(d6, d7);
                    if (dHypot > 9.0d) {
                        double d8 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i6];
                        double[] dArr7 = dArr3[i6];
                        dArr6[i7] = d6 * d8 * dArr7[i7];
                        dArr4[i8][i7] = d8 * d7 * dArr7[i7];
                    }
                }
            }
        }
        this.f1626q = dArr;
        this.f1625n = dArr2;
        this.f1624g = dArr4;
    }

    private static double ld6(double d2, double d4, double d5, double d6, double d7, double d8) {
        double d9 = d4 * d4;
        double d10 = d4 * 6.0d;
        double d11 = 3.0d * d2;
        return ((((((((((-6.0d) * d9) * d6) + (d10 * d6)) + ((6.0d * d9) * d5)) - (d10 * d5)) + ((d11 * d8) * d9)) + ((d11 * d7) * d9)) - (((2.0d * d2) * d8) * d4)) - (((4.0d * d2) * d7) * d4)) + (d2 * d7);
    }

    /* JADX INFO: renamed from: p */
    private static ld6 m1035p(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d2 = 1.0d / ((double) length2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            double d4 = dArr[i2];
            int i3 = i2 + length2;
            dArr2[i3][0] = d4;
            double d5 = ((double) i2) * d2;
            dArr3[i3] = d5;
            if (i2 > 0) {
                int i4 = (length2 * 2) + i2;
                dArr2[i4][0] = d4 + 1.0d;
                dArr3[i4] = d5 + 1.0d;
                int i5 = i2 - 1;
                dArr2[i5][0] = (d4 - 1.0d) - d2;
                dArr3[i5] = (d5 - 1.0d) - d2;
            }
        }
        return new ld6(dArr3, dArr2);
    }

    /* JADX INFO: renamed from: s */
    public static ld6 m1036s(String str) {
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i2 = 0;
        while (iIndexOf2 != -1) {
            dArr[i2] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i2++;
        }
        dArr[i2] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        return m1035p(Arrays.copyOf(dArr, i2 + 1));
    }

    private static double x2(double d2, double d4, double d5, double d6, double d7, double d8) {
        double d9 = d4 * d4;
        double d10 = d9 * d4;
        double d11 = 3.0d * d9;
        double d12 = ((((((-2.0d) * d10) * d6) + (d11 * d6)) + ((d10 * 2.0d) * d5)) - (d11 * d5)) + d5;
        double d13 = d2 * d8;
        double d14 = d2 * d7;
        return ((((d12 + (d13 * d10)) + (d10 * d14)) - (d13 * d9)) - (((d2 * 2.0d) * d7) * d9)) + (d14 * d4);
    }

    @Override // androidx.constraintlayout.core.motion.utils.toq
    public void f7l8(double d2, double[] dArr) {
        double[] dArr2 = this.f1626q;
        int length = dArr2.length;
        int length2 = this.f1625n[0].length;
        double d4 = dArr2[0];
        if (d2 > d4) {
            d4 = dArr2[length - 1];
            if (d2 < d4) {
                d4 = d2;
            }
        }
        int i2 = 0;
        while (i2 < length - 1) {
            double[] dArr3 = this.f1626q;
            int i3 = i2 + 1;
            double d5 = dArr3[i3];
            if (d4 <= d5) {
                double d6 = dArr3[i2];
                double d7 = d5 - d6;
                double d8 = (d4 - d6) / d7;
                for (int i4 = 0; i4 < length2; i4++) {
                    double[][] dArr4 = this.f1625n;
                    double d9 = dArr4[i2][i4];
                    double d10 = dArr4[i3][i4];
                    double[][] dArr5 = this.f1624g;
                    dArr[i4] = ld6(d7, d8, d9, d10, dArr5[i2][i4], dArr5[i3][i4]) / d7;
                }
                return;
            }
            i2 = i3;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.toq
    /* JADX INFO: renamed from: g */
    public double mo1016g(double d2, int i2) {
        double[] dArr = this.f1626q;
        int length = dArr.length;
        int i3 = 0;
        double d4 = dArr[0];
        if (d2 >= d4) {
            d4 = dArr[length - 1];
            if (d2 < d4) {
                d4 = d2;
            }
        }
        while (i3 < length - 1) {
            double[] dArr2 = this.f1626q;
            int i4 = i3 + 1;
            double d5 = dArr2[i4];
            if (d4 <= d5) {
                double d6 = dArr2[i3];
                double d7 = d5 - d6;
                double[][] dArr3 = this.f1625n;
                double d8 = dArr3[i3][i2];
                double d9 = dArr3[i4][i2];
                double[][] dArr4 = this.f1624g;
                return ld6(d7, (d4 - d6) / d7, d8, d9, dArr4[i3][i2], dArr4[i4][i2]) / d7;
            }
            i3 = i4;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.toq
    /* JADX INFO: renamed from: n */
    public void mo1017n(double d2, float[] fArr) {
        double[] dArr = this.f1626q;
        int length = dArr.length;
        int i2 = 0;
        int length2 = this.f1625n[0].length;
        if (this.f47309f7l8) {
            double d4 = dArr[0];
            if (d2 <= d4) {
                f7l8(d4, this.f1627y);
                for (int i3 = 0; i3 < length2; i3++) {
                    fArr[i3] = (float) (this.f1625n[0][i3] + ((d2 - this.f1626q[0]) * this.f1627y[i3]));
                }
                return;
            }
            int i4 = length - 1;
            double d5 = dArr[i4];
            if (d2 >= d5) {
                f7l8(d5, this.f1627y);
                while (i2 < length2) {
                    fArr[i2] = (float) (this.f1625n[i4][i2] + ((d2 - this.f1626q[i4]) * this.f1627y[i2]));
                    i2++;
                }
                return;
            }
        } else {
            if (d2 <= dArr[0]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) this.f1625n[0][i5];
                }
                return;
            }
            int i6 = length - 1;
            if (d2 >= dArr[i6]) {
                while (i2 < length2) {
                    fArr[i2] = (float) this.f1625n[i6][i2];
                    i2++;
                }
                return;
            }
        }
        int i7 = 0;
        while (i7 < length - 1) {
            if (d2 == this.f1626q[i7]) {
                for (int i8 = 0; i8 < length2; i8++) {
                    fArr[i8] = (float) this.f1625n[i7][i8];
                }
            }
            double[] dArr2 = this.f1626q;
            int i9 = i7 + 1;
            double d6 = dArr2[i9];
            if (d2 < d6) {
                double d7 = dArr2[i7];
                double d8 = d6 - d7;
                double d9 = (d2 - d7) / d8;
                while (i2 < length2) {
                    double[][] dArr3 = this.f1625n;
                    double d10 = dArr3[i7][i2];
                    double d11 = dArr3[i9][i2];
                    double[][] dArr4 = this.f1624g;
                    fArr[i2] = (float) x2(d8, d9, d10, d11, dArr4[i7][i2], dArr4[i9][i2]);
                    i2++;
                }
                return;
            }
            i7 = i9;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.toq
    /* JADX INFO: renamed from: q */
    public void mo1018q(double d2, double[] dArr) {
        double[] dArr2 = this.f1626q;
        int length = dArr2.length;
        int i2 = 0;
        int length2 = this.f1625n[0].length;
        if (this.f47309f7l8) {
            double d4 = dArr2[0];
            if (d2 <= d4) {
                f7l8(d4, this.f1627y);
                for (int i3 = 0; i3 < length2; i3++) {
                    dArr[i3] = this.f1625n[0][i3] + ((d2 - this.f1626q[0]) * this.f1627y[i3]);
                }
                return;
            }
            int i4 = length - 1;
            double d5 = dArr2[i4];
            if (d2 >= d5) {
                f7l8(d5, this.f1627y);
                while (i2 < length2) {
                    dArr[i2] = this.f1625n[i4][i2] + ((d2 - this.f1626q[i4]) * this.f1627y[i2]);
                    i2++;
                }
                return;
            }
        } else {
            if (d2 <= dArr2[0]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = this.f1625n[0][i5];
                }
                return;
            }
            int i6 = length - 1;
            if (d2 >= dArr2[i6]) {
                while (i2 < length2) {
                    dArr[i2] = this.f1625n[i6][i2];
                    i2++;
                }
                return;
            }
        }
        int i7 = 0;
        while (i7 < length - 1) {
            if (d2 == this.f1626q[i7]) {
                for (int i8 = 0; i8 < length2; i8++) {
                    dArr[i8] = this.f1625n[i7][i8];
                }
            }
            double[] dArr3 = this.f1626q;
            int i9 = i7 + 1;
            double d6 = dArr3[i9];
            if (d2 < d6) {
                double d7 = dArr3[i7];
                double d8 = d6 - d7;
                double d9 = (d2 - d7) / d8;
                while (i2 < length2) {
                    double[][] dArr4 = this.f1625n;
                    double d10 = dArr4[i7][i2];
                    double d11 = dArr4[i9][i2];
                    double[][] dArr5 = this.f1624g;
                    dArr[i2] = x2(d8, d9, d10, d11, dArr5[i7][i2], dArr5[i9][i2]);
                    i2++;
                }
                return;
            }
            i7 = i9;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.toq
    /* JADX INFO: renamed from: y */
    public double[] mo1019y() {
        return this.f1626q;
    }

    @Override // androidx.constraintlayout.core.motion.utils.toq
    public double zy(double d2, int i2) {
        double d4;
        double d5;
        double dMo1016g;
        double[] dArr = this.f1626q;
        int length = dArr.length;
        int i3 = 0;
        if (this.f47309f7l8) {
            double d6 = dArr[0];
            if (d2 <= d6) {
                d4 = this.f1625n[0][i2];
                d5 = d2 - d6;
                dMo1016g = mo1016g(d6, i2);
            } else {
                int i4 = length - 1;
                double d7 = dArr[i4];
                if (d2 >= d7) {
                    d4 = this.f1625n[i4][i2];
                    d5 = d2 - d7;
                    dMo1016g = mo1016g(d7, i2);
                }
            }
            return d4 + (d5 * dMo1016g);
        }
        if (d2 <= dArr[0]) {
            return this.f1625n[0][i2];
        }
        int i5 = length - 1;
        if (d2 >= dArr[i5]) {
            return this.f1625n[i5][i2];
        }
        while (i3 < length - 1) {
            double[] dArr2 = this.f1626q;
            double d8 = dArr2[i3];
            if (d2 == d8) {
                return this.f1625n[i3][i2];
            }
            int i6 = i3 + 1;
            double d9 = dArr2[i6];
            if (d2 < d9) {
                double d10 = d9 - d8;
                double d11 = (d2 - d8) / d10;
                double[][] dArr3 = this.f1625n;
                double d12 = dArr3[i3][i2];
                double d13 = dArr3[i6][i2];
                double[][] dArr4 = this.f1624g;
                return x2(d10, d11, d12, d13, dArr4[i3][i2], dArr4[i6][i2]);
            }
            i3 = i6;
        }
        return 0.0d;
    }
}
