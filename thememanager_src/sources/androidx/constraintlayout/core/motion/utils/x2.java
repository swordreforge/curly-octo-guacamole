package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* JADX INFO: compiled from: Oscillator.java */
/* JADX INFO: loaded from: classes.dex */
public class x2 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f47346cdj = 7;

    /* JADX INFO: renamed from: h */
    public static final int f1665h = 6;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f47347kja0 = 5;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f47348ld6 = 1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f47349n7h = 4;

    /* JADX INFO: renamed from: p */
    public static final int f1666p = 0;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f47350qrj = 3;

    /* JADX INFO: renamed from: s */
    public static String f1667s = "Oscillator";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f47351x2 = 2;

    /* JADX INFO: renamed from: g */
    int f1668g;

    /* JADX INFO: renamed from: n */
    ld6 f1670n;

    /* JADX INFO: renamed from: q */
    String f1671q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    double[] f47354zy;

    /* JADX INFO: renamed from: k */
    float[] f1669k = new float[0];

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    double[] f47353toq = new double[0];

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    double f47352f7l8 = 6.283185307179586d;

    /* JADX INFO: renamed from: y */
    private boolean f1672y = false;

    public void f7l8(int i2, String str) {
        this.f1668g = i2;
        this.f1671q = str;
        if (str != null) {
            this.f1670n = ld6.m1036s(str);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m1068g() {
        int i2 = 0;
        double d2 = 0.0d;
        while (true) {
            float[] fArr = this.f1669k;
            if (i2 >= fArr.length) {
                break;
            }
            d2 += (double) fArr[i2];
            i2++;
        }
        double d4 = 0.0d;
        int i3 = 1;
        while (true) {
            float[] fArr2 = this.f1669k;
            if (i3 >= fArr2.length) {
                break;
            }
            int i4 = i3 - 1;
            float f2 = (fArr2[i4] + fArr2[i3]) / 2.0f;
            double[] dArr = this.f47353toq;
            d4 += (dArr[i3] - dArr[i4]) * ((double) f2);
            i3++;
        }
        int i5 = 0;
        while (true) {
            float[] fArr3 = this.f1669k;
            if (i5 >= fArr3.length) {
                break;
            }
            fArr3[i5] = (float) (((double) fArr3[i5]) * (d2 / d4));
            i5++;
        }
        this.f47354zy[0] = 0.0d;
        int i6 = 1;
        while (true) {
            float[] fArr4 = this.f1669k;
            if (i6 >= fArr4.length) {
                this.f1672y = true;
                return;
            }
            int i7 = i6 - 1;
            float f3 = (fArr4[i7] + fArr4[i6]) / 2.0f;
            double[] dArr2 = this.f47353toq;
            double d5 = dArr2[i6] - dArr2[i7];
            double[] dArr3 = this.f47354zy;
            dArr3[i6] = dArr3[i7] + (d5 * ((double) f3));
            i6++;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m1069k(double d2, float f2) {
        int length = this.f1669k.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f47353toq, d2);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f47353toq = Arrays.copyOf(this.f47353toq, length);
        this.f1669k = Arrays.copyOf(this.f1669k, length);
        this.f47354zy = new double[length];
        double[] dArr = this.f47353toq;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f47353toq[iBinarySearch] = d2;
        this.f1669k[iBinarySearch] = f2;
        this.f1672y = false;
    }

    /* JADX INFO: renamed from: n */
    public double m1070n(double d2, double d4) {
        double dAbs;
        double dZy = zy(d2) + d4;
        switch (this.f1668g) {
            case 1:
                return Math.signum(0.5d - (dZy % 1.0d));
            case 2:
                dAbs = Math.abs((((dZy * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dZy * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dZy * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f47352f7l8 * (d4 + dZy));
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dZy * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.f1670n.zy(dZy % 1.0d, 0);
            default:
                return Math.sin(this.f47352f7l8 * dZy);
        }
        return 1.0d - dAbs;
    }

    /* JADX INFO: renamed from: q */
    public double m1071q(double d2, double d4, double d5) {
        double dZy = d4 + zy(d2);
        double qVar = toq(d2) + d5;
        switch (this.f1668g) {
            case 1:
                return 0.0d;
            case 2:
                return qVar * 4.0d * Math.signum((((dZy * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return qVar * 2.0d;
            case 4:
                return (-qVar) * 2.0d;
            case 5:
                double d6 = this.f47352f7l8;
                return (-d6) * qVar * Math.sin(d6 * dZy);
            case 6:
                return qVar * 4.0d * ((((dZy * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.f1670n.mo1016g(dZy % 1.0d, 0);
            default:
                double d7 = this.f47352f7l8;
                return qVar * d7 * Math.cos(d7 * dZy);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f47353toq) + " period=" + Arrays.toString(this.f1669k);
    }

    double toq(double d2) {
        if (d2 <= 0.0d) {
            d2 = 1.0E-5d;
        } else if (d2 >= 1.0d) {
            d2 = 0.999999d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f47353toq, d2);
        if (iBinarySearch > 0 || iBinarySearch == 0) {
            return 0.0d;
        }
        int i2 = (-iBinarySearch) - 1;
        float[] fArr = this.f1669k;
        float f2 = fArr[i2];
        int i3 = i2 - 1;
        float f3 = fArr[i3];
        double d4 = f2 - f3;
        double[] dArr = this.f47353toq;
        double d5 = dArr[i2];
        double d6 = dArr[i3];
        double d7 = d4 / (d5 - d6);
        return (((double) f3) - (d7 * d6)) + (d2 * d7);
    }

    double zy(double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        } else if (d2 > 1.0d) {
            d2 = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f47353toq, d2);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return 0.0d;
        }
        int i2 = (-iBinarySearch) - 1;
        float[] fArr = this.f1669k;
        float f2 = fArr[i2];
        int i3 = i2 - 1;
        float f3 = fArr[i3];
        double d4 = f2 - f3;
        double[] dArr = this.f47353toq;
        double d5 = dArr[i2];
        double d6 = dArr[i3];
        double d7 = d4 / (d5 - d6);
        return this.f47354zy[i3] + ((((double) f3) - (d7 * d6)) * (d2 - d6)) + ((d7 * ((d2 * d2) - (d6 * d6))) / 2.0d);
    }
}
