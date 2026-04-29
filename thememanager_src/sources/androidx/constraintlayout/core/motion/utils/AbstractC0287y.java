package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.C0265g;
import androidx.constraintlayout.core.motion.utils.zurt;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.y */
/* JADX INFO: compiled from: KeyCycleOscillator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0287y {

    /* JADX INFO: renamed from: y */
    private static final String f1673y = "KeyCycleOscillator";

    /* JADX INFO: renamed from: k */
    private androidx.constraintlayout.core.motion.utils.toq f1675k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private zy f47356toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f47357zy;

    /* JADX INFO: renamed from: q */
    private int f1677q = 0;

    /* JADX INFO: renamed from: n */
    private String f1676n = null;

    /* JADX INFO: renamed from: g */
    public int f1674g = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    ArrayList<f7l8> f47355f7l8 = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.y$f7l8 */
    /* JADX INFO: compiled from: KeyCycleOscillator.java */
    static class f7l8 {

        /* JADX INFO: renamed from: k */
        int f1678k;

        /* JADX INFO: renamed from: n */
        float f1679n;

        /* JADX INFO: renamed from: q */
        float f1680q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        float f47358toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        float f47359zy;

        public f7l8(int i2, float f2, float f3, float f4, float f5) {
            this.f1678k = i2;
            this.f47358toq = f5;
            this.f47359zy = f3;
            this.f1680q = f2;
            this.f1679n = f4;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.y$g */
    /* JADX INFO: compiled from: KeyCycleOscillator.java */
    public static class g extends AbstractC0287y {

        /* JADX INFO: renamed from: p */
        int f1681p;

        /* JADX INFO: renamed from: s */
        String f1682s;

        public g(String str) {
            this.f1682s = str;
            this.f1681p = zurt.zy.m1093k(str);
        }

        public void x2(C0265g c0265g, float f2, double d2, double d4) {
            c0265g.m934l(m1074k(f2) + ((float) Math.toDegrees(Math.atan2(d4, d2))));
        }

        @Override // androidx.constraintlayout.core.motion.utils.AbstractC0287y
        /* JADX INFO: renamed from: y */
        public void mo1078y(C0265g c0265g, float f2) {
            c0265g.zy(this.f1681p, m1074k(f2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.y$k */
    /* JADX INFO: compiled from: KeyCycleOscillator.java */
    class k implements Comparator<f7l8> {
        k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(f7l8 f7l8Var, f7l8 f7l8Var2) {
            return Integer.compare(f7l8Var.f1678k, f7l8Var2.f1678k);
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.y$n */
    /* JADX INFO: compiled from: KeyCycleOscillator.java */
    private static class n {
        private n() {
        }

        /* JADX INFO: renamed from: k */
        private static int m1080k(int[] iArr, float[] fArr, float[] fArr2, int i2, int i3) {
            int i4 = iArr[i3];
            int i5 = i2;
            while (i2 < i3) {
                if (iArr[i2] <= i4) {
                    zy(iArr, fArr, fArr2, i5, i2);
                    i5++;
                }
                i2++;
            }
            zy(iArr, fArr, fArr2, i5, i3);
            return i5;
        }

        static void toq(int[] iArr, float[] fArr, float[] fArr2, int i2, int i3) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i3;
            iArr2[1] = i2;
            int i4 = 2;
            while (i4 > 0) {
                int i5 = i4 - 1;
                int i6 = iArr2[i5];
                i4 = i5 - 1;
                int i7 = iArr2[i4];
                if (i6 < i7) {
                    int iM1080k = m1080k(iArr, fArr, fArr2, i6, i7);
                    int i8 = i4 + 1;
                    iArr2[i4] = iM1080k - 1;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    int i10 = i9 + 1;
                    iArr2[i9] = i7;
                    i4 = i10 + 1;
                    iArr2[i10] = iM1080k + 1;
                }
            }
        }

        private static void zy(int[] iArr, float[] fArr, float[] fArr2, int i2, int i3) {
            int i4 = iArr[i2];
            iArr[i2] = iArr[i3];
            iArr[i3] = i4;
            float f2 = fArr[i2];
            fArr[i2] = fArr[i3];
            fArr[i3] = f2;
            float f3 = fArr2[i2];
            fArr2[i2] = fArr2[i3];
            fArr2[i3] = f3;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.y$q */
    /* JADX INFO: compiled from: KeyCycleOscillator.java */
    private static class q {
        private q() {
        }

        /* JADX INFO: renamed from: k */
        private static int m1081k(int[] iArr, float[] fArr, int i2, int i3) {
            int i4 = iArr[i3];
            int i5 = i2;
            while (i2 < i3) {
                if (iArr[i2] <= i4) {
                    zy(iArr, fArr, i5, i2);
                    i5++;
                }
                i2++;
            }
            zy(iArr, fArr, i5, i3);
            return i5;
        }

        static void toq(int[] iArr, float[] fArr, int i2, int i3) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i3;
            iArr2[1] = i2;
            int i4 = 2;
            while (i4 > 0) {
                int i5 = i4 - 1;
                int i6 = iArr2[i5];
                i4 = i5 - 1;
                int i7 = iArr2[i4];
                if (i6 < i7) {
                    int iM1081k = m1081k(iArr, fArr, i6, i7);
                    int i8 = i4 + 1;
                    iArr2[i4] = iM1081k - 1;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    int i10 = i9 + 1;
                    iArr2[i9] = i7;
                    i4 = i10 + 1;
                    iArr2[i10] = iM1081k + 1;
                }
            }
        }

        private static void zy(int[] iArr, float[] fArr, int i2, int i3) {
            int i4 = iArr[i2];
            iArr[i2] = iArr[i3];
            iArr[i3] = i4;
            float f2 = fArr[i2];
            fArr[i2] = fArr[i3];
            fArr[i3] = f2;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.y$toq */
    /* JADX INFO: compiled from: KeyCycleOscillator.java */
    private static class toq extends AbstractC0287y {

        /* JADX INFO: renamed from: p */
        int f1684p;

        /* JADX INFO: renamed from: s */
        String f1685s;

        public toq(String str) {
            this.f1685s = str;
            this.f1684p = zurt.zy.m1093k(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.AbstractC0287y
        /* JADX INFO: renamed from: y */
        public void mo1078y(C0265g c0265g, float f2) {
            c0265g.zy(this.f1684p, m1074k(f2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.y$zy */
    /* JADX INFO: compiled from: KeyCycleOscillator.java */
    static class zy {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        static final int f47360cdj = -1;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private static final String f47361ki = "CycleOscillator";

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        double[] f47362f7l8;

        /* JADX INFO: renamed from: g */
        float[] f1686g;

        /* JADX INFO: renamed from: h */
        float f1687h;

        /* JADX INFO: renamed from: k */
        private final int f1688k;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        double[] f47363kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        float[] f47364ld6;

        /* JADX INFO: renamed from: n */
        private final int f1689n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        double[] f47365n7h;

        /* JADX INFO: renamed from: p */
        float[] f1690p;

        /* JADX INFO: renamed from: q */
        private final int f1691q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        androidx.constraintlayout.core.motion.utils.toq f47366qrj;

        /* JADX INFO: renamed from: s */
        float[] f1692s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        x2 f47367toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        int f47368x2;

        /* JADX INFO: renamed from: y */
        float[] f1693y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f47369zy;

        zy(int i2, String str, int i3, int i4) {
            x2 x2Var = new x2();
            this.f47367toq = x2Var;
            this.f47369zy = 0;
            this.f1691q = 1;
            this.f1689n = 2;
            this.f47368x2 = i2;
            this.f1688k = i3;
            x2Var.f7l8(i2, str);
            this.f1686g = new float[i4];
            this.f47362f7l8 = new double[i4];
            this.f1693y = new float[i4];
            this.f1692s = new float[i4];
            this.f1690p = new float[i4];
            this.f47364ld6 = new float[i4];
        }

        /* JADX INFO: renamed from: k */
        public double m1082k() {
            return this.f47365n7h[1];
        }

        /* JADX INFO: renamed from: n */
        public void m1083n(float f2) {
            this.f1687h = f2;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f47362f7l8.length, 3);
            float[] fArr = this.f1686g;
            this.f47365n7h = new double[fArr.length + 2];
            this.f47363kja0 = new double[fArr.length + 2];
            if (this.f47362f7l8[0] > 0.0d) {
                this.f47367toq.m1069k(0.0d, this.f1693y[0]);
            }
            double[] dArr2 = this.f47362f7l8;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f47367toq.m1069k(1.0d, this.f1693y[length]);
            }
            for (int i2 = 0; i2 < dArr.length; i2++) {
                double[] dArr3 = dArr[i2];
                dArr3[0] = this.f1692s[i2];
                dArr3[1] = this.f1690p[i2];
                dArr3[2] = this.f1686g[i2];
                this.f47367toq.m1069k(this.f47362f7l8[i2], this.f1693y[i2]);
            }
            this.f47367toq.m1068g();
            double[] dArr4 = this.f47362f7l8;
            if (dArr4.length > 1) {
                this.f47366qrj = androidx.constraintlayout.core.motion.utils.toq.m1067k(0, dArr4, dArr);
            } else {
                this.f47366qrj = null;
            }
        }

        /* JADX INFO: renamed from: q */
        public void m1084q(int i2, int i3, float f2, float f3, float f4, float f5) {
            this.f47362f7l8[i2] = ((double) i3) / 100.0d;
            this.f1693y[i2] = f2;
            this.f1692s[i2] = f3;
            this.f1690p[i2] = f4;
            this.f1686g[i2] = f5;
        }

        public double toq(float f2) {
            androidx.constraintlayout.core.motion.utils.toq toqVar = this.f47366qrj;
            if (toqVar != null) {
                double d2 = f2;
                toqVar.f7l8(d2, this.f47363kja0);
                this.f47366qrj.mo1018q(d2, this.f47365n7h);
            } else {
                double[] dArr = this.f47363kja0;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d4 = f2;
            double dM1070n = this.f47367toq.m1070n(d4, this.f47365n7h[1]);
            double dM1071q = this.f47367toq.m1071q(d4, this.f47365n7h[1], this.f47363kja0[1]);
            double[] dArr2 = this.f47363kja0;
            return dArr2[0] + (dM1070n * dArr2[2]) + (dM1071q * this.f47365n7h[2]);
        }

        public double zy(float f2) {
            androidx.constraintlayout.core.motion.utils.toq toqVar = this.f47366qrj;
            if (toqVar != null) {
                toqVar.mo1018q(f2, this.f47365n7h);
            } else {
                double[] dArr = this.f47365n7h;
                dArr[0] = this.f1692s[0];
                dArr[1] = this.f1690p[0];
                dArr[2] = this.f1686g[0];
            }
            double[] dArr2 = this.f47365n7h;
            return dArr2[0] + (this.f47367toq.m1070n(f2, dArr2[1]) * this.f47365n7h[2]);
        }
    }

    /* JADX INFO: renamed from: q */
    public static AbstractC0287y m1072q(String str) {
        return str.equals("pathRotate") ? new g(str) : new toq(str);
    }

    public void f7l8(int i2, int i3, String str, int i4, float f2, float f3, float f4, float f5, Object obj) {
        this.f47355f7l8.add(new f7l8(i2, f2, f3, f4, f5));
        if (i4 != -1) {
            this.f1674g = i4;
        }
        this.f1677q = i3;
        mo1075n(obj);
        this.f1676n = str;
    }

    /* JADX INFO: renamed from: g */
    public void m1073g(int i2, int i3, String str, int i4, float f2, float f3, float f4, float f5) {
        this.f47355f7l8.add(new f7l8(i2, f2, f3, f4, f5));
        if (i4 != -1) {
            this.f1674g = i4;
        }
        this.f1677q = i3;
        this.f1676n = str;
    }

    /* JADX INFO: renamed from: k */
    public float m1074k(float f2) {
        return (float) this.f47356toq.zy(f2);
    }

    public boolean ld6() {
        return this.f1674g == 1;
    }

    /* JADX INFO: renamed from: n */
    protected void mo1075n(Object obj) {
    }

    /* JADX INFO: renamed from: p */
    public void m1076p(float f2) {
        int size = this.f47355f7l8.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f47355f7l8, new k());
        double[] dArr = new double[size];
        char c2 = 0;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f47356toq = new zy(this.f1677q, this.f1676n, this.f1674g, size);
        int i2 = 0;
        for (f7l8 f7l8Var : this.f47355f7l8) {
            float f3 = f7l8Var.f1680q;
            dArr[i2] = ((double) f3) * 0.01d;
            double[] dArr3 = dArr2[i2];
            float f4 = f7l8Var.f47358toq;
            dArr3[c2] = f4;
            float f5 = f7l8Var.f47359zy;
            dArr3[1] = f5;
            float f6 = f7l8Var.f1679n;
            dArr3[2] = f6;
            this.f47356toq.m1084q(i2, f7l8Var.f1678k, f3, f5, f6, f4);
            i2++;
            c2 = 0;
        }
        this.f47356toq.m1083n(f2);
        this.f1675k = androidx.constraintlayout.core.motion.utils.toq.m1067k(0, dArr, dArr2);
    }

    /* JADX INFO: renamed from: s */
    public void m1077s(String str) {
        this.f47357zy = str;
    }

    public String toString() {
        String str = this.f47357zy;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<f7l8> it = this.f47355f7l8.iterator();
        while (it.hasNext()) {
            str = str + "[" + it.next().f1678k + " , " + decimalFormat.format(r3.f47358toq) + "] ";
        }
        return str;
    }

    public androidx.constraintlayout.core.motion.utils.toq toq() {
        return this.f1675k;
    }

    /* JADX INFO: renamed from: y */
    public void mo1078y(C0265g c0265g, float f2) {
    }

    public float zy(float f2) {
        return (float) this.f47356toq.toq(f2);
    }
}
