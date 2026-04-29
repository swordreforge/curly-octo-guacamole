package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.C0265g;
import androidx.constraintlayout.core.motion.C0266k;
import androidx.constraintlayout.core.motion.utils.C0285s;
import androidx.constraintlayout.core.motion.utils.zurt;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: compiled from: SplineSet.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class kja0 {

    /* JADX INFO: renamed from: g */
    private static final String f1614g = "SplineSet";

    /* JADX INFO: renamed from: k */
    protected androidx.constraintlayout.core.motion.utils.toq f1615k;

    /* JADX INFO: renamed from: n */
    private String f1616n;

    /* JADX INFO: renamed from: q */
    private int f1617q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected int[] f47304toq = new int[10];

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected float[] f47305zy = new float[10];

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.kja0$k */
    /* JADX INFO: compiled from: SplineSet.java */
    private static class C0279k extends kja0 {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        String f47306f7l8;

        /* JADX INFO: renamed from: y */
        long f1618y;

        public C0279k(String str, long j2) {
            this.f47306f7l8 = str;
            this.f1618y = j2;
        }

        @Override // androidx.constraintlayout.core.motion.utils.kja0
        /* JADX INFO: renamed from: y */
        public void mo1033y(zurt zurtVar, float f2) {
            zurtVar.zy(zurtVar.mo933k(this.f47306f7l8), m1030k(f2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.kja0$q */
    /* JADX INFO: compiled from: SplineSet.java */
    private static class C0280q {
        private C0280q() {
        }

        /* JADX INFO: renamed from: k */
        static void m1034k(int[] iArr, float[] fArr, int i2, int i3) {
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
                    int qVar = toq(iArr, fArr, i6, i7);
                    int i8 = i4 + 1;
                    iArr2[i4] = qVar - 1;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    int i10 = i9 + 1;
                    iArr2[i9] = i7;
                    i4 = i10 + 1;
                    iArr2[i10] = qVar + 1;
                }
            }
        }

        private static int toq(int[] iArr, float[] fArr, int i2, int i3) {
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

        private static void zy(int[] iArr, float[] fArr, int i2, int i3) {
            int i4 = iArr[i2];
            iArr[i2] = iArr[i3];
            iArr[i3] = i4;
            float f2 = fArr[i2];
            fArr[i2] = fArr[i3];
            fArr[i3] = f2;
        }
    }

    /* JADX INFO: compiled from: SplineSet.java */
    public static class toq extends kja0 {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        String f47307f7l8;

        /* JADX INFO: renamed from: s */
        float[] f1619s;

        /* JADX INFO: renamed from: y */
        C0285s.k f1620y;

        public toq(String str, C0285s.k kVar) {
            this.f47307f7l8 = str.split(",")[1];
            this.f1620y = kVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.kja0
        public void f7l8(int i2, float f2) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void ld6(int i2, C0266k c0266k) {
            this.f1620y.m1054k(i2, c0266k);
        }

        @Override // androidx.constraintlayout.core.motion.utils.kja0
        /* JADX INFO: renamed from: p */
        public void mo1031p(int i2) {
            int iM1053g = this.f1620y.m1053g();
            int iM949y = this.f1620y.f7l8(0).m949y();
            double[] dArr = new double[iM1053g];
            this.f1619s = new float[iM949y];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iM1053g, iM949y);
            for (int i3 = 0; i3 < iM1053g; i3++) {
                int iM1056q = this.f1620y.m1056q(i3);
                C0266k c0266kF7l8 = this.f1620y.f7l8(i3);
                dArr[i3] = ((double) iM1056q) * 0.01d;
                c0266kF7l8.m945n(this.f1619s);
                int i4 = 0;
                while (true) {
                    if (i4 < this.f1619s.length) {
                        dArr2[i3][i4] = r6[i4];
                        i4++;
                    }
                }
            }
            this.f1615k = androidx.constraintlayout.core.motion.utils.toq.m1067k(i2, dArr, dArr2);
        }

        public void x2(androidx.constraintlayout.core.state.ki kiVar, float f2) {
            this.f1615k.mo1017n(f2, this.f1619s);
            kiVar.o1t(this.f1620y.f7l8(0), this.f1619s);
        }
    }

    /* JADX INFO: compiled from: SplineSet.java */
    public static class zy extends kja0 {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        String f47308f7l8;

        /* JADX INFO: renamed from: s */
        float[] f1621s;

        /* JADX INFO: renamed from: y */
        C0285s.toq f1622y;

        public zy(String str, C0285s.toq toqVar) {
            this.f47308f7l8 = str.split(",")[1];
            this.f1622y = toqVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.kja0
        public void f7l8(int i2, float f2) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void ld6(int i2, androidx.constraintlayout.core.motion.toq toqVar) {
            this.f1622y.m1058k(i2, toqVar);
        }

        @Override // androidx.constraintlayout.core.motion.utils.kja0
        /* JADX INFO: renamed from: p */
        public void mo1031p(int i2) {
            int iM1057g = this.f1622y.m1057g();
            int iKi = this.f1622y.f7l8(0).ki();
            double[] dArr = new double[iM1057g];
            this.f1621s = new float[iKi];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iM1057g, iKi);
            for (int i3 = 0; i3 < iM1057g; i3++) {
                int iM1060q = this.f1622y.m1060q(i3);
                androidx.constraintlayout.core.motion.toq toqVarF7l8 = this.f1622y.f7l8(i3);
                dArr[i3] = ((double) iM1060q) * 0.01d;
                toqVarF7l8.kja0(this.f1621s);
                int i4 = 0;
                while (true) {
                    if (i4 < this.f1621s.length) {
                        dArr2[i3][i4] = r6[i4];
                        i4++;
                    }
                }
            }
            this.f1615k = androidx.constraintlayout.core.motion.utils.toq.m1067k(i2, dArr, dArr2);
        }

        public void x2(C0265g c0265g, float f2) {
            this.f1615k.mo1017n(f2, this.f1621s);
            this.f1622y.f7l8(0).ni7(c0265g, this.f1621s);
        }

        @Override // androidx.constraintlayout.core.motion.utils.kja0
        /* JADX INFO: renamed from: y */
        public void mo1033y(zurt zurtVar, float f2) {
            x2((C0265g) zurtVar, f2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static kja0 m1027g(String str, long j2) {
        return new C0279k(str, j2);
    }

    /* JADX INFO: renamed from: n */
    public static kja0 m1028n(String str, C0285s.toq toqVar) {
        return new zy(str, toqVar);
    }

    /* JADX INFO: renamed from: q */
    public static kja0 m1029q(String str, C0285s.k kVar) {
        return new toq(str, kVar);
    }

    public void f7l8(int i2, float f2) {
        int[] iArr = this.f47304toq;
        if (iArr.length < this.f1617q + 1) {
            this.f47304toq = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f47305zy;
            this.f47305zy = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f47304toq;
        int i3 = this.f1617q;
        iArr2[i3] = i2;
        this.f47305zy[i3] = f2;
        this.f1617q = i3 + 1;
    }

    /* JADX INFO: renamed from: k */
    public float m1030k(float f2) {
        return (float) this.f1615k.zy(f2, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1031p(int r10) {
        /*
            r9 = this;
            int r0 = r9.f1617q
            if (r0 != 0) goto L5
            return
        L5:
            int[] r1 = r9.f47304toq
            float[] r2 = r9.f47305zy
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            androidx.constraintlayout.core.motion.utils.kja0.C0280q.m1034k(r1, r2, r4, r0)
            r0 = r3
            r1 = r0
        L11:
            int r2 = r9.f1617q
            if (r0 >= r2) goto L24
            int[] r2 = r9.f47304toq
            int r5 = r0 + (-1)
            r5 = r2[r5]
            r2 = r2[r0]
            if (r5 == r2) goto L21
            int r1 = r1 + 1
        L21:
            int r0 = r0 + 1
            goto L11
        L24:
            double[] r0 = new double[r1]
            r2 = 2
            int[] r2 = new int[r2]
            r2[r3] = r3
            r2[r4] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            double[][] r1 = (double[][]) r1
            r2 = r4
            r3 = r2
        L37:
            int r5 = r9.f1617q
            if (r2 >= r5) goto L63
            if (r2 <= 0) goto L48
            int[] r5 = r9.f47304toq
            r6 = r5[r2]
            int r7 = r2 + (-1)
            r5 = r5[r7]
            if (r6 != r5) goto L48
            goto L60
        L48:
            int[] r5 = r9.f47304toq
            r5 = r5[r2]
            double r5 = (double) r5
            r7 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r5 = r5 * r7
            r0[r3] = r5
            r5 = r1[r3]
            float[] r6 = r9.f47305zy
            r6 = r6[r2]
            double r6 = (double) r6
            r5[r4] = r6
            int r3 = r3 + 1
        L60:
            int r2 = r2 + 1
            goto L37
        L63:
            androidx.constraintlayout.core.motion.utils.toq r10 = androidx.constraintlayout.core.motion.utils.toq.m1067k(r10, r0, r1)
            r9.f1615k = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.kja0.mo1031p(int):void");
    }

    /* JADX INFO: renamed from: s */
    public void m1032s(String str) {
        this.f1616n = str;
    }

    public String toString() {
        String str = this.f1616n;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i2 = 0; i2 < this.f1617q; i2++) {
            str = str + "[" + this.f47304toq[i2] + " , " + decimalFormat.format(this.f47305zy[i2]) + "] ";
        }
        return str;
    }

    public androidx.constraintlayout.core.motion.utils.toq toq() {
        return this.f1615k;
    }

    /* JADX INFO: renamed from: y */
    public void mo1033y(zurt zurtVar, float f2) {
        zurtVar.zy(zurt.InterfaceC0290k.m1087k(this.f1616n), m1030k(f2));
    }

    public float zy(float f2) {
        return (float) this.f1615k.mo1016g(f2, 0);
    }
}
