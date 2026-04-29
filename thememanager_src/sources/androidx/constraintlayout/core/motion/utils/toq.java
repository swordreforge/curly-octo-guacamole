package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: CurveFit.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class toq {

    /* JADX INFO: renamed from: k */
    public static final int f1662k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f47344toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f47345zy = 2;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.toq$k */
    /* JADX INFO: compiled from: CurveFit.java */
    static class C0286k extends toq {

        /* JADX INFO: renamed from: n */
        double[] f1663n;

        /* JADX INFO: renamed from: q */
        double f1664q;

        C0286k(double d2, double[] dArr) {
            this.f1664q = d2;
            this.f1663n = dArr;
        }

        @Override // androidx.constraintlayout.core.motion.utils.toq
        public void f7l8(double d2, double[] dArr) {
            for (int i2 = 0; i2 < this.f1663n.length; i2++) {
                dArr[i2] = 0.0d;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.toq
        /* JADX INFO: renamed from: g */
        public double mo1016g(double d2, int i2) {
            return 0.0d;
        }

        @Override // androidx.constraintlayout.core.motion.utils.toq
        /* JADX INFO: renamed from: n */
        public void mo1017n(double d2, float[] fArr) {
            int i2 = 0;
            while (true) {
                double[] dArr = this.f1663n;
                if (i2 >= dArr.length) {
                    return;
                }
                fArr[i2] = (float) dArr[i2];
                i2++;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.toq
        /* JADX INFO: renamed from: q */
        public void mo1018q(double d2, double[] dArr) {
            double[] dArr2 = this.f1663n;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // androidx.constraintlayout.core.motion.utils.toq
        /* JADX INFO: renamed from: y */
        public double[] mo1019y() {
            return new double[]{this.f1664q};
        }

        @Override // androidx.constraintlayout.core.motion.utils.toq
        public double zy(double d2, int i2) {
            return this.f1663n[i2];
        }
    }

    /* JADX INFO: renamed from: k */
    public static toq m1067k(int i2, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i2 = 2;
        }
        return i2 != 0 ? i2 != 2 ? new C0283p(dArr, dArr2) : new C0286k(dArr[0], dArr2[0]) : new ld6(dArr, dArr2);
    }

    public static toq toq(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C0278k(iArr, dArr, dArr2);
    }

    public abstract void f7l8(double d2, double[] dArr);

    /* JADX INFO: renamed from: g */
    public abstract double mo1016g(double d2, int i2);

    /* JADX INFO: renamed from: n */
    public abstract void mo1017n(double d2, float[] fArr);

    /* JADX INFO: renamed from: q */
    public abstract void mo1018q(double d2, double[] dArr);

    /* JADX INFO: renamed from: y */
    public abstract double[] mo1019y();

    public abstract double zy(double d2, int i2);
}
