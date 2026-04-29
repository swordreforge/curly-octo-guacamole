package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.C0265g;
import androidx.constraintlayout.core.motion.C0266k;
import androidx.constraintlayout.core.motion.utils.C0285s;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.i */
/* JADX INFO: compiled from: TimeCycleSplineSet.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0277i {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    protected static float f47274kja0 = 6.2831855f;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f47275ld6 = "SplineSet";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    protected static final int f47276n7h = 2;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    protected static final int f47277qrj = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    protected static final int f47278x2 = 0;

    /* JADX INFO: renamed from: g */
    protected String f1588g;

    /* JADX INFO: renamed from: k */
    protected androidx.constraintlayout.core.motion.utils.toq f1589k;

    /* JADX INFO: renamed from: n */
    protected int f1590n;

    /* JADX INFO: renamed from: s */
    protected long f1593s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected int f47280toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected int[] f47281zy = new int[10];

    /* JADX INFO: renamed from: q */
    protected float[][] f1592q = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    protected float[] f47279f7l8 = new float[3];

    /* JADX INFO: renamed from: y */
    protected boolean f1594y = false;

    /* JADX INFO: renamed from: p */
    protected float f1591p = Float.NaN;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.i$k */
    /* JADX INFO: compiled from: TimeCycleSplineSet.java */
    public static class k extends AbstractC0277i {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        C0285s.k f47282cdj;

        /* JADX INFO: renamed from: h */
        String f1595h;

        /* JADX INFO: renamed from: i */
        float[] f1596i;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        C0285s.zy f47283ki = new C0285s.zy();

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        float[] f47284t8r;

        public k(String str, C0285s.k kVar) {
            this.f1595h = str.split(",")[1];
            this.f47282cdj = kVar;
        }

        public void f7l8(int i2, C0266k c0266k, float f2, int i3, float f3) {
            this.f47282cdj.m1054k(i2, c0266k);
            this.f47283ki.m1062k(i2, new float[]{f2, f3});
            this.f47280toq = Math.max(this.f47280toq, i3);
        }

        @Override // androidx.constraintlayout.core.motion.utils.AbstractC0277i
        /* JADX INFO: renamed from: g */
        public void mo1009g(int i2) {
            int iM1053g = this.f47282cdj.m1053g();
            int iM949y = this.f47282cdj.f7l8(0).m949y();
            double[] dArr = new double[iM1053g];
            int i3 = iM949y + 2;
            this.f47284t8r = new float[i3];
            this.f1596i = new float[iM949y];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iM1053g, i3);
            for (int i4 = 0; i4 < iM1053g; i4++) {
                int iM1056q = this.f47282cdj.m1056q(i4);
                C0266k c0266kF7l8 = this.f47282cdj.f7l8(i4);
                float[] fArrF7l8 = this.f47283ki.f7l8(i4);
                dArr[i4] = ((double) iM1056q) * 0.01d;
                c0266kF7l8.m945n(this.f47284t8r);
                int i5 = 0;
                while (true) {
                    if (i5 < this.f47284t8r.length) {
                        dArr2[i4][i5] = r8[i5];
                        i5++;
                    }
                }
                double[] dArr3 = dArr2[i4];
                dArr3[iM949y] = fArrF7l8[0];
                dArr3[iM949y + 1] = fArrF7l8[1];
            }
            this.f1589k = androidx.constraintlayout.core.motion.utils.toq.m1067k(i2, dArr, dArr2);
        }

        /* JADX INFO: renamed from: y */
        public boolean m1013y(C0265g c0265g, float f2, long j2, f7l8 f7l8Var) {
            this.f1589k.mo1017n(f2, this.f47284t8r);
            float[] fArr = this.f47284t8r;
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            long j3 = j2 - this.f1593s;
            if (Float.isNaN(this.f1591p)) {
                float fM987k = f7l8Var.m987k(c0265g, this.f1595h, 0);
                this.f1591p = fM987k;
                if (Float.isNaN(fM987k)) {
                    this.f1591p = 0.0f;
                }
            }
            float f5 = (float) ((((double) this.f1591p) + ((j3 * 1.0E-9d) * ((double) f3))) % 1.0d);
            this.f1591p = f5;
            this.f1593s = j2;
            float fM1010k = m1010k(f5);
            this.f1594y = false;
            int i2 = 0;
            while (true) {
                float[] fArr2 = this.f1596i;
                if (i2 >= fArr2.length) {
                    break;
                }
                boolean z2 = this.f1594y;
                float f6 = this.f47284t8r[i2];
                this.f1594y = z2 | (((double) f6) != 0.0d);
                fArr2[i2] = (f6 * fM1010k) + f4;
                i2++;
            }
            c0265g.lvui(this.f47282cdj.f7l8(0), this.f1596i);
            if (f3 != 0.0f) {
                this.f1594y = true;
            }
            return this.f1594y;
        }

        @Override // androidx.constraintlayout.core.motion.utils.AbstractC0277i
        public void zy(int i2, float f2, float f3, int i3, float f4) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.i$toq */
    /* JADX INFO: compiled from: TimeCycleSplineSet.java */
    public static class toq extends AbstractC0277i {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        C0285s.toq f47285cdj;

        /* JADX INFO: renamed from: h */
        String f1597h;

        /* JADX INFO: renamed from: i */
        float[] f1598i;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        C0285s.zy f47286ki = new C0285s.zy();

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        float[] f47287t8r;

        public toq(String str, C0285s.toq toqVar) {
            this.f1597h = str.split(",")[1];
            this.f47285cdj = toqVar;
        }

        public void f7l8(int i2, androidx.constraintlayout.core.motion.toq toqVar, float f2, int i3, float f3) {
            this.f47285cdj.m1058k(i2, toqVar);
            this.f47286ki.m1062k(i2, new float[]{f2, f3});
            this.f47280toq = Math.max(this.f47280toq, i3);
        }

        @Override // androidx.constraintlayout.core.motion.utils.AbstractC0277i
        /* JADX INFO: renamed from: g */
        public void mo1009g(int i2) {
            int iM1057g = this.f47285cdj.m1057g();
            int iKi = this.f47285cdj.f7l8(0).ki();
            double[] dArr = new double[iM1057g];
            int i3 = iKi + 2;
            this.f47287t8r = new float[i3];
            this.f1598i = new float[iKi];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iM1057g, i3);
            for (int i4 = 0; i4 < iM1057g; i4++) {
                int iM1060q = this.f47285cdj.m1060q(i4);
                androidx.constraintlayout.core.motion.toq toqVarF7l8 = this.f47285cdj.f7l8(i4);
                float[] fArrF7l8 = this.f47286ki.f7l8(i4);
                dArr[i4] = ((double) iM1060q) * 0.01d;
                toqVarF7l8.kja0(this.f47287t8r);
                int i5 = 0;
                while (true) {
                    if (i5 < this.f47287t8r.length) {
                        dArr2[i4][i5] = r8[i5];
                        i5++;
                    }
                }
                double[] dArr3 = dArr2[i4];
                dArr3[iKi] = fArrF7l8[0];
                dArr3[iKi + 1] = fArrF7l8[1];
            }
            this.f1589k = androidx.constraintlayout.core.motion.utils.toq.m1067k(i2, dArr, dArr2);
        }

        /* JADX INFO: renamed from: y */
        public boolean m1014y(C0265g c0265g, float f2, long j2, f7l8 f7l8Var) {
            this.f1589k.mo1017n(f2, this.f47287t8r);
            float[] fArr = this.f47287t8r;
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            long j3 = j2 - this.f1593s;
            if (Float.isNaN(this.f1591p)) {
                float fM987k = f7l8Var.m987k(c0265g, this.f1597h, 0);
                this.f1591p = fM987k;
                if (Float.isNaN(fM987k)) {
                    this.f1591p = 0.0f;
                }
            }
            float f5 = (float) ((((double) this.f1591p) + ((j3 * 1.0E-9d) * ((double) f3))) % 1.0d);
            this.f1591p = f5;
            this.f1593s = j2;
            float fM1010k = m1010k(f5);
            this.f1594y = false;
            int i2 = 0;
            while (true) {
                float[] fArr2 = this.f1598i;
                if (i2 >= fArr2.length) {
                    break;
                }
                boolean z2 = this.f1594y;
                float f6 = this.f47287t8r[i2];
                this.f1594y = z2 | (((double) f6) != 0.0d);
                fArr2[i2] = (f6 * fM1010k) + f4;
                i2++;
            }
            this.f47285cdj.f7l8(0).ni7(c0265g, this.f1598i);
            if (f3 != 0.0f) {
                this.f1594y = true;
            }
            return this.f1594y;
        }

        @Override // androidx.constraintlayout.core.motion.utils.AbstractC0277i
        public void zy(int i2, float f2, float f3, int i3, float f4) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.i$zy */
    /* JADX INFO: compiled from: TimeCycleSplineSet.java */
    protected static class zy {
        protected zy() {
        }

        /* JADX INFO: renamed from: k */
        static void m1015k(int[] iArr, float[][] fArr, int i2, int i3) {
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

        private static int toq(int[] iArr, float[][] fArr, int i2, int i3) {
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

        private static void zy(int[] iArr, float[][] fArr, int i2, int i3) {
            int i4 = iArr[i2];
            iArr[i2] = iArr[i3];
            iArr[i3] = i4;
            float[] fArr2 = fArr[i2];
            fArr[i2] = fArr[i3];
            fArr[i3] = fArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1009g(int r12) {
        /*
            r11 = this;
            int r0 = r11.f1590n
            if (r0 != 0) goto L1d
            java.io.PrintStream r12 = java.lang.System.err
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error no points added to "
            r0.append(r1)
            java.lang.String r1 = r11.f1588g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.println(r0)
            return
        L1d:
            int[] r1 = r11.f47281zy
            float[][] r2 = r11.f1592q
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            androidx.constraintlayout.core.motion.utils.AbstractC0277i.zy.m1015k(r1, r2, r4, r0)
            r0 = r3
            r1 = r4
        L29:
            int[] r2 = r11.f47281zy
            int r5 = r2.length
            if (r0 >= r5) goto L3b
            r5 = r2[r0]
            int r6 = r0 + (-1)
            r2 = r2[r6]
            if (r5 == r2) goto L38
            int r1 = r1 + 1
        L38:
            int r0 = r0 + 1
            goto L29
        L3b:
            if (r1 != 0) goto L3e
            r1 = r3
        L3e:
            double[] r0 = new double[r1]
            r2 = 3
            r5 = 2
            int[] r6 = new int[r5]
            r6[r3] = r2
            r6[r4] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r6)
            double[][] r1 = (double[][]) r1
            r2 = r4
            r6 = r2
        L52:
            int r7 = r11.f1590n
            if (r2 >= r7) goto L8a
            if (r2 <= 0) goto L63
            int[] r7 = r11.f47281zy
            r8 = r7[r2]
            int r9 = r2 + (-1)
            r7 = r7[r9]
            if (r8 != r7) goto L63
            goto L87
        L63:
            int[] r7 = r11.f47281zy
            r7 = r7[r2]
            double r7 = (double) r7
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r7 = r7 * r9
            r0[r6] = r7
            r7 = r1[r6]
            float[][] r8 = r11.f1592q
            r8 = r8[r2]
            r9 = r8[r4]
            double r9 = (double) r9
            r7[r4] = r9
            r9 = r8[r3]
            double r9 = (double) r9
            r7[r3] = r9
            r8 = r8[r5]
            double r8 = (double) r8
            r7[r5] = r8
            int r6 = r6 + 1
        L87:
            int r2 = r2 + 1
            goto L52
        L8a:
            androidx.constraintlayout.core.motion.utils.toq r12 = androidx.constraintlayout.core.motion.utils.toq.m1067k(r12, r0, r1)
            r11.f1589k = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.AbstractC0277i.mo1009g(int):void");
    }

    /* JADX INFO: renamed from: k */
    protected float m1010k(float f2) {
        float fAbs;
        switch (this.f47280toq) {
            case 1:
                return Math.signum(f2 * f47274kja0);
            case 2:
                fAbs = Math.abs(f2);
                break;
            case 3:
                return (((f2 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f2 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f2 * f47274kja0);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f2 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f2 * f47274kja0);
        }
        return 1.0f - fAbs;
    }

    /* JADX INFO: renamed from: n */
    public void m1011n(String str) {
        this.f1588g = str;
    }

    /* JADX INFO: renamed from: q */
    protected void m1012q(long j2) {
        this.f1593s = j2;
    }

    public String toString() {
        String str = this.f1588g;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i2 = 0; i2 < this.f1590n; i2++) {
            str = str + "[" + this.f47281zy[i2] + " , " + decimalFormat.format(this.f1592q[i2]) + "] ";
        }
        return str;
    }

    public androidx.constraintlayout.core.motion.utils.toq toq() {
        return this.f1589k;
    }

    public void zy(int i2, float f2, float f3, int i3, float f4) {
        int[] iArr = this.f47281zy;
        int i4 = this.f1590n;
        iArr[i4] = i2;
        float[] fArr = this.f1592q[i4];
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        this.f47280toq = Math.max(this.f47280toq, i3);
        this.f1590n++;
    }
}
