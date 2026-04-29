package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.g */
/* JADX INFO: compiled from: HyperSpline.java */
/* JADX INFO: loaded from: classes.dex */
public class C0275g {

    /* JADX INFO: renamed from: g */
    double[][] f1575g;

    /* JADX INFO: renamed from: k */
    int f1576k;

    /* JADX INFO: renamed from: n */
    double f1577n;

    /* JADX INFO: renamed from: q */
    double[] f1578q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    k[][] f47265toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    int f47266zy;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.g$k */
    /* JADX INFO: compiled from: HyperSpline.java */
    public static class k {

        /* JADX INFO: renamed from: k */
        double f1579k;

        /* JADX INFO: renamed from: q */
        double f1580q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        double f47267toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        double f47268zy;

        public k(double d2, double d4, double d5, double d6) {
            this.f1579k = d2;
            this.f47267toq = d4;
            this.f47268zy = d5;
            this.f1580q = d6;
        }

        /* JADX INFO: renamed from: k */
        public double m1003k(double d2) {
            return (((((this.f1580q * d2) + this.f47268zy) * d2) + this.f47267toq) * d2) + this.f1579k;
        }

        public double toq(double d2) {
            return (((this.f1580q * 3.0d * d2) + (this.f47268zy * 2.0d)) * d2) + this.f47267toq;
        }
    }

    public C0275g(double[][] dArr) {
        f7l8(dArr);
    }

    static k[] toq(int i2, double[] dArr) {
        double[] dArr2 = new double[i2];
        double[] dArr3 = new double[i2];
        double[] dArr4 = new double[i2];
        int i3 = i2 - 1;
        int i4 = 0;
        dArr2[0] = 0.5d;
        int i5 = 1;
        for (int i6 = 1; i6 < i3; i6++) {
            dArr2[i6] = 1.0d / (4.0d - dArr2[i6 - 1]);
        }
        int i7 = i3 - 1;
        dArr2[i3] = 1.0d / (2.0d - dArr2[i7]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i5 < i3) {
            int i8 = i5 + 1;
            int i9 = i5 - 1;
            dArr3[i5] = (((dArr[i8] - dArr[i9]) * 3.0d) - dArr3[i9]) * dArr2[i5];
            i5 = i8;
        }
        double d2 = (((dArr[i3] - dArr[i7]) * 3.0d) - dArr3[i7]) * dArr2[i3];
        dArr3[i3] = d2;
        dArr4[i3] = d2;
        while (i7 >= 0) {
            dArr4[i7] = dArr3[i7] - (dArr2[i7] * dArr4[i7 + 1]);
            i7--;
        }
        k[] kVarArr = new k[i3];
        while (i4 < i3) {
            double d4 = dArr[i4];
            double d5 = dArr4[i4];
            int i10 = i4 + 1;
            double d6 = dArr[i10];
            double d7 = dArr4[i10];
            kVarArr[i4] = new k((float) d4, d5, (((d6 - d4) * 3.0d) - (d5 * 2.0d)) - d7, ((d4 - d6) * 2.0d) + d5 + d7);
            i4 = i10;
        }
        return kVarArr;
    }

    public void f7l8(double[][] dArr) {
        int i2;
        int length = dArr[0].length;
        this.f47266zy = length;
        int length2 = dArr.length;
        this.f1576k = length2;
        this.f1575g = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        this.f47265toq = new k[this.f47266zy][];
        for (int i3 = 0; i3 < this.f47266zy; i3++) {
            for (int i4 = 0; i4 < this.f1576k; i4++) {
                this.f1575g[i3][i4] = dArr[i4][i3];
            }
        }
        int i5 = 0;
        while (true) {
            i2 = this.f47266zy;
            if (i5 >= i2) {
                break;
            }
            k[][] kVarArr = this.f47265toq;
            double[] dArr2 = this.f1575g[i5];
            kVarArr[i5] = toq(dArr2.length, dArr2);
            i5++;
        }
        this.f1578q = new double[this.f1576k - 1];
        this.f1577n = 0.0d;
        k[] kVarArr2 = new k[i2];
        for (int i6 = 0; i6 < this.f1578q.length; i6++) {
            for (int i7 = 0; i7 < this.f47266zy; i7++) {
                kVarArr2[i7] = this.f47265toq[i7][i6];
            }
            double d2 = this.f1577n;
            double[] dArr3 = this.f1578q;
            double dM1000k = m1000k(kVarArr2);
            dArr3[i6] = dM1000k;
            this.f1577n = d2 + dM1000k;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m999g(double d2, double[] dArr) {
        double d4 = d2 * this.f1577n;
        int i2 = 0;
        while (true) {
            double[] dArr2 = this.f1578q;
            if (i2 >= dArr2.length - 1) {
                break;
            }
            double d5 = dArr2[i2];
            if (d5 >= d4) {
                break;
            }
            d4 -= d5;
            i2++;
        }
        for (int i3 = 0; i3 < dArr.length; i3++) {
            dArr[i3] = this.f47265toq[i3][i2].toq(d4 / this.f1578q[i2]);
        }
    }

    /* JADX INFO: renamed from: k */
    public double m1000k(k[] kVarArr) {
        int i2;
        int length = kVarArr.length;
        double[] dArr = new double[kVarArr.length];
        double d2 = 0.0d;
        double d4 = 0.0d;
        double dSqrt = 0.0d;
        while (true) {
            i2 = 0;
            if (d4 >= 1.0d) {
                break;
            }
            double d5 = 0.0d;
            while (i2 < kVarArr.length) {
                double d6 = dArr[i2];
                double dM1003k = kVarArr[i2].m1003k(d4);
                dArr[i2] = dM1003k;
                double d7 = d6 - dM1003k;
                d5 += d7 * d7;
                i2++;
            }
            if (d4 > 0.0d) {
                dSqrt += Math.sqrt(d5);
            }
            d4 += 0.1d;
        }
        while (i2 < kVarArr.length) {
            double d8 = dArr[i2];
            double dM1003k2 = kVarArr[i2].m1003k(1.0d);
            dArr[i2] = dM1003k2;
            double d9 = d8 - dM1003k2;
            d2 += d9 * d9;
            i2++;
        }
        return dSqrt + Math.sqrt(d2);
    }

    /* JADX INFO: renamed from: n */
    public void m1001n(double d2, float[] fArr) {
        double d4 = d2 * this.f1577n;
        int i2 = 0;
        while (true) {
            double[] dArr = this.f1578q;
            if (i2 >= dArr.length - 1) {
                break;
            }
            double d5 = dArr[i2];
            if (d5 >= d4) {
                break;
            }
            d4 -= d5;
            i2++;
        }
        for (int i3 = 0; i3 < fArr.length; i3++) {
            fArr[i3] = (float) this.f47265toq[i3][i2].m1003k(d4 / this.f1578q[i2]);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m1002q(double d2, double[] dArr) {
        double d4 = d2 * this.f1577n;
        int i2 = 0;
        while (true) {
            double[] dArr2 = this.f1578q;
            if (i2 >= dArr2.length - 1) {
                break;
            }
            double d5 = dArr2[i2];
            if (d5 >= d4) {
                break;
            }
            d4 -= d5;
            i2++;
        }
        for (int i3 = 0; i3 < dArr.length; i3++) {
            dArr[i3] = this.f47265toq[i3][i2].m1003k(d4 / this.f1578q[i2]);
        }
    }

    public double zy(double d2, int i2) {
        double[] dArr;
        double d4 = d2 * this.f1577n;
        int i3 = 0;
        while (true) {
            dArr = this.f1578q;
            if (i3 >= dArr.length - 1) {
                break;
            }
            double d5 = dArr[i3];
            if (d5 >= d4) {
                break;
            }
            d4 -= d5;
            i3++;
        }
        return this.f47265toq[i2][i3].m1003k(d4 / dArr[i3]);
    }

    public C0275g() {
    }
}
