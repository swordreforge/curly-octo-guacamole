package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.k */
/* JADX INFO: compiled from: ArcCurveFit.java */
/* JADX INFO: loaded from: classes.dex */
public class C0278k extends toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f47288f7l8 = 1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f47289ld6 = 1;

    /* JADX INFO: renamed from: p */
    public static final int f1599p = 0;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f47290qrj = 3;

    /* JADX INFO: renamed from: s */
    public static final int f1600s = 3;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f47291x2 = 2;

    /* JADX INFO: renamed from: y */
    public static final int f1601y = 2;

    /* JADX INFO: renamed from: g */
    private boolean f1602g = true;

    /* JADX INFO: renamed from: n */
    k[] f1603n;

    /* JADX INFO: renamed from: q */
    private final double[] f1604q;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.k$k */
    /* JADX INFO: compiled from: ArcCurveFit.java */
    private static class k {

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        private static final double f47292fn3e = 0.001d;

        /* JADX INFO: renamed from: i */
        private static double[] f1605i = new double[91];

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private static final String f47293t8r = "Arc";

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        boolean f47294cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        double f47295f7l8;

        /* JADX INFO: renamed from: g */
        double f1606g;

        /* JADX INFO: renamed from: h */
        double f1607h;

        /* JADX INFO: renamed from: k */
        double[] f1608k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        boolean f47296ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        double f47297kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        double f47298ld6;

        /* JADX INFO: renamed from: n */
        double f1609n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        double f47299n7h;

        /* JADX INFO: renamed from: p */
        double f1610p;

        /* JADX INFO: renamed from: q */
        double f1611q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        double f47300qrj;

        /* JADX INFO: renamed from: s */
        double f1612s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        double f47301toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        double f47302x2;

        /* JADX INFO: renamed from: y */
        double f1613y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        double f47303zy;

        k(int i2, double d2, double d4, double d5, double d6, double d7, double d8) {
            this.f47296ki = false;
            this.f47294cdj = i2 == 1;
            this.f47303zy = d2;
            this.f1611q = d4;
            this.f1612s = 1.0d / (d4 - d2);
            if (3 == i2) {
                this.f47296ki = true;
            }
            double d9 = d7 - d5;
            double d10 = d8 - d6;
            if (!this.f47296ki && Math.abs(d9) >= f47292fn3e && Math.abs(d10) >= f47292fn3e) {
                this.f1608k = new double[101];
                boolean z2 = this.f47294cdj;
                this.f1610p = d9 * ((double) (z2 ? -1 : 1));
                this.f47298ld6 = d10 * ((double) (z2 ? 1 : -1));
                this.f47302x2 = z2 ? d7 : d5;
                this.f47300qrj = z2 ? d6 : d8;
                m1020k(d5, d6, d7, d8);
                this.f47299n7h = this.f47301toq * this.f1612s;
                return;
            }
            this.f47296ki = true;
            this.f1609n = d5;
            this.f1606g = d7;
            this.f47295f7l8 = d6;
            this.f1613y = d8;
            double dHypot = Math.hypot(d10, d9);
            this.f47301toq = dHypot;
            this.f47299n7h = dHypot * this.f1612s;
            double d11 = this.f1611q;
            double d12 = this.f47303zy;
            this.f47302x2 = d9 / (d11 - d12);
            this.f47300qrj = d10 / (d11 - d12);
        }

        /* JADX INFO: renamed from: k */
        private void m1020k(double d2, double d4, double d5, double d6) {
            double dHypot;
            double d7 = d5 - d2;
            double d8 = d4 - d6;
            int i2 = 0;
            double d9 = 0.0d;
            double d10 = 0.0d;
            double d11 = 0.0d;
            while (true) {
                if (i2 >= f1605i.length) {
                    break;
                }
                double d12 = d9;
                double radians = Math.toRadians((((double) i2) * 90.0d) / ((double) (r15.length - 1)));
                double dSin = Math.sin(radians) * d7;
                double dCos = Math.cos(radians) * d8;
                if (i2 > 0) {
                    dHypot = Math.hypot(dSin - d10, dCos - d11) + d12;
                    f1605i[i2] = dHypot;
                } else {
                    dHypot = d12;
                }
                i2++;
                d11 = dCos;
                d9 = dHypot;
                d10 = dSin;
            }
            double d13 = d9;
            this.f47301toq = d13;
            int i3 = 0;
            while (true) {
                double[] dArr = f1605i;
                if (i3 >= dArr.length) {
                    break;
                }
                dArr[i3] = dArr[i3] / d13;
                i3++;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= this.f1608k.length) {
                    return;
                }
                double length = ((double) i4) / ((double) (r1.length - 1));
                int iBinarySearch = Arrays.binarySearch(f1605i, length);
                if (iBinarySearch >= 0) {
                    this.f1608k[i4] = ((double) iBinarySearch) / ((double) (f1605i.length - 1));
                } else if (iBinarySearch == -1) {
                    this.f1608k[i4] = 0.0d;
                } else {
                    int i5 = -iBinarySearch;
                    int i6 = i5 - 2;
                    double[] dArr2 = f1605i;
                    double d14 = dArr2[i6];
                    this.f1608k[i4] = (((double) i6) + ((length - d14) / (dArr2[i5 - 1] - d14))) / ((double) (dArr2.length - 1));
                }
                i4++;
            }
        }

        public double f7l8(double d2) {
            double d4 = (d2 - this.f47303zy) * this.f1612s;
            double d5 = this.f47295f7l8;
            return d5 + (d4 * (this.f1613y - d5));
        }

        /* JADX INFO: renamed from: g */
        public double m1021g(double d2) {
            double d4 = (d2 - this.f47303zy) * this.f1612s;
            double d5 = this.f1609n;
            return d5 + (d4 * (this.f1606g - d5));
        }

        void ld6(double d2) {
            double dM1023p = m1023p((this.f47294cdj ? this.f1611q - d2 : d2 - this.f47303zy) * this.f1612s) * 1.5707963267948966d;
            this.f47297kja0 = Math.sin(dM1023p);
            this.f1607h = Math.cos(dM1023p);
        }

        /* JADX INFO: renamed from: n */
        public double m1022n(double d2) {
            return this.f47300qrj;
        }

        /* JADX INFO: renamed from: p */
        double m1023p(double d2) {
            if (d2 <= 0.0d) {
                return 0.0d;
            }
            if (d2 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f1608k;
            double length = d2 * ((double) (dArr.length - 1));
            int i2 = (int) length;
            double d4 = length - ((double) i2);
            double d5 = dArr[i2];
            return d5 + (d4 * (dArr[i2 + 1] - d5));
        }

        /* JADX INFO: renamed from: q */
        public double m1024q(double d2) {
            return this.f47302x2;
        }

        /* JADX INFO: renamed from: s */
        double m1025s() {
            return this.f47300qrj + (this.f47298ld6 * this.f1607h);
        }

        double toq() {
            double d2 = this.f1610p * this.f1607h;
            double dHypot = this.f47299n7h / Math.hypot(d2, (-this.f47298ld6) * this.f47297kja0);
            if (this.f47294cdj) {
                d2 = -d2;
            }
            return d2 * dHypot;
        }

        /* JADX INFO: renamed from: y */
        double m1026y() {
            return this.f47302x2 + (this.f1610p * this.f47297kja0);
        }

        double zy() {
            double d2 = this.f1610p * this.f1607h;
            double d4 = (-this.f47298ld6) * this.f47297kja0;
            double dHypot = this.f47299n7h / Math.hypot(d2, d4);
            return this.f47294cdj ? (-d4) * dHypot : d4 * dHypot;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0278k(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r2 = 1
            r0.f1602g = r2
            r0.f1604q = r1
            int r3 = r1.length
            int r3 = r3 - r2
            androidx.constraintlayout.core.motion.utils.k$k[] r3 = new androidx.constraintlayout.core.motion.utils.C0278k.k[r3]
            r0.f1603n = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L16:
            androidx.constraintlayout.core.motion.utils.k$k[] r7 = r0.f1603n
            int r8 = r7.length
            if (r4 >= r8) goto L4f
            r8 = r25[r4]
            r9 = 3
            r10 = 2
            if (r8 == 0) goto L2f
            if (r8 == r2) goto L2c
            if (r8 == r10) goto L2a
            if (r8 == r9) goto L28
            goto L30
        L28:
            if (r5 != r2) goto L2c
        L2a:
            r5 = r10
            goto L2d
        L2c:
            r5 = r2
        L2d:
            r6 = r5
            goto L30
        L2f:
            r6 = r9
        L30:
            androidx.constraintlayout.core.motion.utils.k$k r22 = new androidx.constraintlayout.core.motion.utils.k$k
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r3]
            r16 = r8[r2]
            r8 = r27[r23]
            r18 = r8[r3]
            r20 = r8[r2]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L16
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.C0278k.<init>(int[], double[], double[][]):void");
    }

    @Override // androidx.constraintlayout.core.motion.utils.toq
    public void f7l8(double d2, double[] dArr) {
        k[] kVarArr = this.f1603n;
        double d4 = kVarArr[0].f47303zy;
        if (d2 < d4) {
            d2 = d4;
        } else if (d2 > kVarArr[kVarArr.length - 1].f1611q) {
            d2 = kVarArr[kVarArr.length - 1].f1611q;
        }
        int i2 = 0;
        while (true) {
            k[] kVarArr2 = this.f1603n;
            if (i2 >= kVarArr2.length) {
                return;
            }
            k kVar = kVarArr2[i2];
            if (d2 <= kVar.f1611q) {
                if (kVar.f47296ki) {
                    dArr[0] = kVar.m1024q(d2);
                    dArr[1] = this.f1603n[i2].m1022n(d2);
                    return;
                } else {
                    kVar.ld6(d2);
                    dArr[0] = this.f1603n[i2].toq();
                    dArr[1] = this.f1603n[i2].zy();
                    return;
                }
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.toq
    /* JADX INFO: renamed from: g */
    public double mo1016g(double d2, int i2) {
        k[] kVarArr = this.f1603n;
        int i3 = 0;
        double d4 = kVarArr[0].f47303zy;
        if (d2 < d4) {
            d2 = d4;
        }
        if (d2 > kVarArr[kVarArr.length - 1].f1611q) {
            d2 = kVarArr[kVarArr.length - 1].f1611q;
        }
        while (true) {
            k[] kVarArr2 = this.f1603n;
            if (i3 >= kVarArr2.length) {
                return Double.NaN;
            }
            k kVar = kVarArr2[i3];
            if (d2 <= kVar.f1611q) {
                if (kVar.f47296ki) {
                    return i2 == 0 ? kVar.m1024q(d2) : kVar.m1022n(d2);
                }
                kVar.ld6(d2);
                return i2 == 0 ? this.f1603n[i3].toq() : this.f1603n[i3].zy();
            }
            i3++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.toq
    /* JADX INFO: renamed from: n */
    public void mo1017n(double d2, float[] fArr) {
        if (this.f1602g) {
            k[] kVarArr = this.f1603n;
            k kVar = kVarArr[0];
            double d4 = kVar.f47303zy;
            if (d2 < d4) {
                double d5 = d2 - d4;
                if (kVar.f47296ki) {
                    fArr[0] = (float) (kVar.m1021g(d4) + (this.f1603n[0].m1024q(d4) * d5));
                    fArr[1] = (float) (this.f1603n[0].f7l8(d4) + (d5 * this.f1603n[0].m1022n(d4)));
                    return;
                } else {
                    kVar.ld6(d4);
                    fArr[0] = (float) (this.f1603n[0].m1026y() + (this.f1603n[0].toq() * d5));
                    fArr[1] = (float) (this.f1603n[0].m1025s() + (d5 * this.f1603n[0].zy()));
                    return;
                }
            }
            if (d2 > kVarArr[kVarArr.length - 1].f1611q) {
                double d6 = kVarArr[kVarArr.length - 1].f1611q;
                double d7 = d2 - d6;
                int length = kVarArr.length - 1;
                k kVar2 = kVarArr[length];
                if (kVar2.f47296ki) {
                    fArr[0] = (float) (kVar2.m1021g(d6) + (this.f1603n[length].m1024q(d6) * d7));
                    fArr[1] = (float) (this.f1603n[length].f7l8(d6) + (d7 * this.f1603n[length].m1022n(d6)));
                    return;
                } else {
                    kVar2.ld6(d2);
                    fArr[0] = (float) this.f1603n[length].m1026y();
                    fArr[1] = (float) this.f1603n[length].m1025s();
                    return;
                }
            }
        } else {
            k[] kVarArr2 = this.f1603n;
            double d8 = kVarArr2[0].f47303zy;
            if (d2 < d8) {
                d2 = d8;
            } else if (d2 > kVarArr2[kVarArr2.length - 1].f1611q) {
                d2 = kVarArr2[kVarArr2.length - 1].f1611q;
            }
        }
        int i2 = 0;
        while (true) {
            k[] kVarArr3 = this.f1603n;
            if (i2 >= kVarArr3.length) {
                return;
            }
            k kVar3 = kVarArr3[i2];
            if (d2 <= kVar3.f1611q) {
                if (kVar3.f47296ki) {
                    fArr[0] = (float) kVar3.m1021g(d2);
                    fArr[1] = (float) this.f1603n[i2].f7l8(d2);
                    return;
                } else {
                    kVar3.ld6(d2);
                    fArr[0] = (float) this.f1603n[i2].m1026y();
                    fArr[1] = (float) this.f1603n[i2].m1025s();
                    return;
                }
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.toq
    /* JADX INFO: renamed from: q */
    public void mo1018q(double d2, double[] dArr) {
        if (this.f1602g) {
            k[] kVarArr = this.f1603n;
            k kVar = kVarArr[0];
            double d4 = kVar.f47303zy;
            if (d2 < d4) {
                double d5 = d2 - d4;
                if (kVar.f47296ki) {
                    dArr[0] = kVar.m1021g(d4) + (this.f1603n[0].m1024q(d4) * d5);
                    dArr[1] = this.f1603n[0].f7l8(d4) + (d5 * this.f1603n[0].m1022n(d4));
                    return;
                } else {
                    kVar.ld6(d4);
                    dArr[0] = this.f1603n[0].m1026y() + (this.f1603n[0].toq() * d5);
                    dArr[1] = this.f1603n[0].m1025s() + (d5 * this.f1603n[0].zy());
                    return;
                }
            }
            if (d2 > kVarArr[kVarArr.length - 1].f1611q) {
                double d6 = kVarArr[kVarArr.length - 1].f1611q;
                double d7 = d2 - d6;
                int length = kVarArr.length - 1;
                k kVar2 = kVarArr[length];
                if (kVar2.f47296ki) {
                    dArr[0] = kVar2.m1021g(d6) + (this.f1603n[length].m1024q(d6) * d7);
                    dArr[1] = this.f1603n[length].f7l8(d6) + (d7 * this.f1603n[length].m1022n(d6));
                    return;
                } else {
                    kVar2.ld6(d2);
                    dArr[0] = this.f1603n[length].m1026y() + (this.f1603n[length].toq() * d7);
                    dArr[1] = this.f1603n[length].m1025s() + (d7 * this.f1603n[length].zy());
                    return;
                }
            }
        } else {
            k[] kVarArr2 = this.f1603n;
            double d8 = kVarArr2[0].f47303zy;
            if (d2 < d8) {
                d2 = d8;
            }
            if (d2 > kVarArr2[kVarArr2.length - 1].f1611q) {
                d2 = kVarArr2[kVarArr2.length - 1].f1611q;
            }
        }
        int i2 = 0;
        while (true) {
            k[] kVarArr3 = this.f1603n;
            if (i2 >= kVarArr3.length) {
                return;
            }
            k kVar3 = kVarArr3[i2];
            if (d2 <= kVar3.f1611q) {
                if (kVar3.f47296ki) {
                    dArr[0] = kVar3.m1021g(d2);
                    dArr[1] = this.f1603n[i2].f7l8(d2);
                    return;
                } else {
                    kVar3.ld6(d2);
                    dArr[0] = this.f1603n[i2].m1026y();
                    dArr[1] = this.f1603n[i2].m1025s();
                    return;
                }
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.toq
    /* JADX INFO: renamed from: y */
    public double[] mo1019y() {
        return this.f1604q;
    }

    @Override // androidx.constraintlayout.core.motion.utils.toq
    public double zy(double d2, int i2) {
        double dF7l8;
        double dM1022n;
        double dM1025s;
        double dZy;
        double dF7l82;
        double dM1022n2;
        int i3 = 0;
        if (this.f1602g) {
            k[] kVarArr = this.f1603n;
            k kVar = kVarArr[0];
            double d4 = kVar.f47303zy;
            if (d2 < d4) {
                double d5 = d2 - d4;
                if (kVar.f47296ki) {
                    if (i2 == 0) {
                        dF7l82 = kVar.m1021g(d4);
                        dM1022n2 = this.f1603n[0].m1024q(d4);
                    } else {
                        dF7l82 = kVar.f7l8(d4);
                        dM1022n2 = this.f1603n[0].m1022n(d4);
                    }
                    return dF7l82 + (d5 * dM1022n2);
                }
                kVar.ld6(d4);
                if (i2 == 0) {
                    dM1025s = this.f1603n[0].m1026y();
                    dZy = this.f1603n[0].toq();
                } else {
                    dM1025s = this.f1603n[0].m1025s();
                    dZy = this.f1603n[0].zy();
                }
                return dM1025s + (d5 * dZy);
            }
            if (d2 > kVarArr[kVarArr.length - 1].f1611q) {
                double d6 = kVarArr[kVarArr.length - 1].f1611q;
                double d7 = d2 - d6;
                int length = kVarArr.length - 1;
                if (i2 == 0) {
                    dF7l8 = kVarArr[length].m1021g(d6);
                    dM1022n = this.f1603n[length].m1024q(d6);
                } else {
                    dF7l8 = kVarArr[length].f7l8(d6);
                    dM1022n = this.f1603n[length].m1022n(d6);
                }
                return dF7l8 + (d7 * dM1022n);
            }
        } else {
            k[] kVarArr2 = this.f1603n;
            double d8 = kVarArr2[0].f47303zy;
            if (d2 < d8) {
                d2 = d8;
            } else if (d2 > kVarArr2[kVarArr2.length - 1].f1611q) {
                d2 = kVarArr2[kVarArr2.length - 1].f1611q;
            }
        }
        while (true) {
            k[] kVarArr3 = this.f1603n;
            if (i3 >= kVarArr3.length) {
                return Double.NaN;
            }
            k kVar2 = kVarArr3[i3];
            if (d2 <= kVar2.f1611q) {
                if (kVar2.f47296ki) {
                    return i2 == 0 ? kVar2.m1021g(d2) : kVar2.f7l8(d2);
                }
                kVar2.ld6(d2);
                return i2 == 0 ? this.f1603n[i3].m1026y() : this.f1603n[i3].m1025s();
            }
            i3++;
        }
    }
}
