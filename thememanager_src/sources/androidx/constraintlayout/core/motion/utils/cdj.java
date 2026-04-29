package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: compiled from: StepCurve.java */
/* JADX INFO: loaded from: classes.dex */
public class cdj extends C0284q {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final boolean f47253cdj = false;

    /* JADX INFO: renamed from: h */
    ld6 f1561h;

    cdj(String str) {
        this.f1643k = str;
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
        this.f1561h = m984n(Arrays.copyOf(dArr, i2 + 1));
    }

    /* JADX INFO: renamed from: n */
    private static ld6 m984n(double[] dArr) {
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
        ld6 ld6Var = new ld6(dArr3, dArr2);
        System.out.println(" 0 " + ld6Var.zy(0.0d, 0));
        System.out.println(" 1 " + ld6Var.zy(1.0d, 0));
        return ld6Var;
    }

    /* JADX INFO: renamed from: q */
    private static ld6 m985q(String str) {
        String[] strArrSplit = str.split("\\s+");
        int length = strArrSplit.length;
        double[] dArr = new double[length];
        for (int i2 = 0; i2 < length; i2++) {
            dArr[i2] = Double.parseDouble(strArrSplit[i2]);
        }
        return m984n(dArr);
    }

    @Override // androidx.constraintlayout.core.motion.utils.C0284q
    /* JADX INFO: renamed from: k */
    public double mo986k(double d2) {
        return this.f1561h.zy(d2, 0);
    }

    @Override // androidx.constraintlayout.core.motion.utils.C0284q
    public double toq(double d2) {
        return this.f1561h.mo1016g(d2, 0);
    }
}
