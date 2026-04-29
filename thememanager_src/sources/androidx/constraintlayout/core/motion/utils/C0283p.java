package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.p */
/* JADX INFO: compiled from: LinearCurveFit.java */
/* JADX INFO: loaded from: classes.dex */
public class C0283p extends toq {

    /* JADX INFO: renamed from: s */
    private static final String f1632s = "LinearCurveFit";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f47315f7l8 = true;

    /* JADX INFO: renamed from: g */
    private double f1633g;

    /* JADX INFO: renamed from: n */
    private double[][] f1634n;

    /* JADX INFO: renamed from: q */
    private double[] f1635q;

    /* JADX INFO: renamed from: y */
    double[] f1636y;

    public C0283p(double[] dArr, double[][] dArr2) {
        this.f1633g = Double.NaN;
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f1636y = new double[length2];
        this.f1635q = dArr;
        this.f1634n = dArr2;
        if (length2 <= 2) {
            return;
        }
        int i2 = 0;
        double d2 = 0.0d;
        while (true) {
            double d4 = d2;
            if (i2 >= dArr.length) {
                this.f1633g = 0.0d;
                return;
            }
            double d5 = dArr2[i2][0];
            if (i2 > 0) {
                Math.hypot(d5 - d2, d5 - d4);
            }
            i2++;
            d2 = d5;
        }
    }

    /* JADX INFO: renamed from: s */
    private double m1047s(double d2) {
        if (Double.isNaN(this.f1633g)) {
            return 0.0d;
        }
        double[] dArr = this.f1635q;
        int length = dArr.length;
        if (d2 <= dArr[0]) {
            return 0.0d;
        }
        int i2 = length - 1;
        if (d2 >= dArr[i2]) {
            return this.f1633g;
        }
        double dHypot = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        int i3 = 0;
        while (i3 < i2) {
            double[] dArr2 = this.f1634n[i3];
            double d6 = dArr2[0];
            double d7 = dArr2[1];
            if (i3 > 0) {
                dHypot += Math.hypot(d6 - d4, d7 - d5);
            }
            double[] dArr3 = this.f1635q;
            double d8 = dArr3[i3];
            if (d2 == d8) {
                return dHypot;
            }
            int i4 = i3 + 1;
            double d9 = dArr3[i4];
            if (d2 < d9) {
                double d10 = (d2 - d8) / (d9 - d8);
                double[][] dArr4 = this.f1634n;
                double[] dArr5 = dArr4[i3];
                double d11 = dArr5[0];
                double[] dArr6 = dArr4[i4];
                double d12 = 1.0d - d10;
                return dHypot + Math.hypot(d7 - ((dArr5[1] * d12) + (dArr6[1] * d10)), d6 - ((d11 * d12) + (dArr6[0] * d10)));
            }
            i3 = i4;
            d4 = d6;
            d5 = d7;
        }
        return 0.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f A[PHI: r4
      0x000f: PHI (r4v5 double) = (r4v0 double), (r4v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.toq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f7l8(double r13, double[] r15) {
        /*
            r12 = this;
            double[] r0 = r12.f1635q
            int r1 = r0.length
            double[][] r2 = r12.f1634n
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L11
        Lf:
            r13 = r4
            goto L1a
        L11:
            int r4 = r1 + (-1)
            r4 = r0[r4]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L1a
            goto Lf
        L1a:
            r0 = r3
        L1b:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto L41
            double[] r4 = r12.f1635q
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L3f
            r13 = r4[r0]
            double r6 = r6 - r13
        L2c:
            if (r3 >= r2) goto L41
            double[][] r13 = r12.f1634n
            r14 = r13[r0]
            r8 = r14[r3]
            r13 = r13[r5]
            r10 = r13[r3]
            double r10 = r10 - r8
            double r10 = r10 / r6
            r15[r3] = r10
            int r3 = r3 + 1
            goto L2c
        L3f:
            r0 = r5
            goto L1b
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.C0283p.f7l8(double, double[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a A[PHI: r3
      0x000a: PHI (r3v4 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.toq
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double mo1016g(double r8, int r10) {
        /*
            r7 = this;
            double[] r0 = r7.f1635q
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
        La:
            r8 = r3
            goto L15
        Lc:
            int r3 = r1 + (-1)
            r3 = r0[r3]
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L15
            goto La
        L15:
            int r0 = r1 + (-1)
            if (r2 >= r0) goto L35
            double[] r0 = r7.f1635q
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L33
            r8 = r0[r2]
            double r4 = r4 - r8
            double[][] r8 = r7.f1634n
            r9 = r8[r2]
            r0 = r9[r10]
            r8 = r8[r3]
            r9 = r8[r10]
            double r9 = r9 - r0
            double r9 = r9 / r4
            return r9
        L33:
            r2 = r3
            goto L15
        L35:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.C0283p.mo1016g(double, int):double");
    }

    @Override // androidx.constraintlayout.core.motion.utils.toq
    /* JADX INFO: renamed from: n */
    public void mo1017n(double d2, float[] fArr) {
        double[] dArr = this.f1635q;
        int length = dArr.length;
        int i2 = 0;
        int length2 = this.f1634n[0].length;
        if (this.f47315f7l8) {
            double d4 = dArr[0];
            if (d2 <= d4) {
                f7l8(d4, this.f1636y);
                for (int i3 = 0; i3 < length2; i3++) {
                    fArr[i3] = (float) (this.f1634n[0][i3] + ((d2 - this.f1635q[0]) * this.f1636y[i3]));
                }
                return;
            }
            int i4 = length - 1;
            double d5 = dArr[i4];
            if (d2 >= d5) {
                f7l8(d5, this.f1636y);
                while (i2 < length2) {
                    fArr[i2] = (float) (this.f1634n[i4][i2] + ((d2 - this.f1635q[i4]) * this.f1636y[i2]));
                    i2++;
                }
                return;
            }
        } else {
            if (d2 <= dArr[0]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) this.f1634n[0][i5];
                }
                return;
            }
            int i6 = length - 1;
            if (d2 >= dArr[i6]) {
                while (i2 < length2) {
                    fArr[i2] = (float) this.f1634n[i6][i2];
                    i2++;
                }
                return;
            }
        }
        int i7 = 0;
        while (i7 < length - 1) {
            if (d2 == this.f1635q[i7]) {
                for (int i8 = 0; i8 < length2; i8++) {
                    fArr[i8] = (float) this.f1634n[i7][i8];
                }
            }
            double[] dArr2 = this.f1635q;
            int i9 = i7 + 1;
            double d6 = dArr2[i9];
            if (d2 < d6) {
                double d7 = dArr2[i7];
                double d8 = (d2 - d7) / (d6 - d7);
                while (i2 < length2) {
                    double[][] dArr3 = this.f1634n;
                    fArr[i2] = (float) ((dArr3[i7][i2] * (1.0d - d8)) + (dArr3[i9][i2] * d8));
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
        double[] dArr2 = this.f1635q;
        int length = dArr2.length;
        int i2 = 0;
        int length2 = this.f1634n[0].length;
        if (this.f47315f7l8) {
            double d4 = dArr2[0];
            if (d2 <= d4) {
                f7l8(d4, this.f1636y);
                for (int i3 = 0; i3 < length2; i3++) {
                    dArr[i3] = this.f1634n[0][i3] + ((d2 - this.f1635q[0]) * this.f1636y[i3]);
                }
                return;
            }
            int i4 = length - 1;
            double d5 = dArr2[i4];
            if (d2 >= d5) {
                f7l8(d5, this.f1636y);
                while (i2 < length2) {
                    dArr[i2] = this.f1634n[i4][i2] + ((d2 - this.f1635q[i4]) * this.f1636y[i2]);
                    i2++;
                }
                return;
            }
        } else {
            if (d2 <= dArr2[0]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = this.f1634n[0][i5];
                }
                return;
            }
            int i6 = length - 1;
            if (d2 >= dArr2[i6]) {
                while (i2 < length2) {
                    dArr[i2] = this.f1634n[i6][i2];
                    i2++;
                }
                return;
            }
        }
        int i7 = 0;
        while (i7 < length - 1) {
            if (d2 == this.f1635q[i7]) {
                for (int i8 = 0; i8 < length2; i8++) {
                    dArr[i8] = this.f1634n[i7][i8];
                }
            }
            double[] dArr3 = this.f1635q;
            int i9 = i7 + 1;
            double d6 = dArr3[i9];
            if (d2 < d6) {
                double d7 = dArr3[i7];
                double d8 = (d2 - d7) / (d6 - d7);
                while (i2 < length2) {
                    double[][] dArr4 = this.f1634n;
                    dArr[i2] = (dArr4[i7][i2] * (1.0d - d8)) + (dArr4[i9][i2] * d8);
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
        return this.f1635q;
    }

    @Override // androidx.constraintlayout.core.motion.utils.toq
    public double zy(double d2, int i2) {
        double d4;
        double d5;
        double dMo1016g;
        double[] dArr = this.f1635q;
        int length = dArr.length;
        int i3 = 0;
        if (this.f47315f7l8) {
            double d6 = dArr[0];
            if (d2 <= d6) {
                d4 = this.f1634n[0][i2];
                d5 = d2 - d6;
                dMo1016g = mo1016g(d6, i2);
            } else {
                int i4 = length - 1;
                double d7 = dArr[i4];
                if (d2 >= d7) {
                    d4 = this.f1634n[i4][i2];
                    d5 = d2 - d7;
                    dMo1016g = mo1016g(d7, i2);
                }
            }
            return d4 + (d5 * dMo1016g);
        }
        if (d2 <= dArr[0]) {
            return this.f1634n[0][i2];
        }
        int i5 = length - 1;
        if (d2 >= dArr[i5]) {
            return this.f1634n[i5][i2];
        }
        while (i3 < length - 1) {
            double[] dArr2 = this.f1635q;
            double d8 = dArr2[i3];
            if (d2 == d8) {
                return this.f1634n[i3][i2];
            }
            int i6 = i3 + 1;
            double d9 = dArr2[i6];
            if (d2 < d9) {
                double d10 = (d2 - d8) / (d9 - d8);
                double[][] dArr3 = this.f1634n;
                return (dArr3[i3][i2] * (1.0d - d10)) + (dArr3[i6][i2] * d10);
            }
            i3 = i6;
        }
        return 0.0d;
    }
}
