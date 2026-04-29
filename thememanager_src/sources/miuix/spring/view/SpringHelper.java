package miuix.spring.view;

import androidx.annotation.Keep;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SpringHelper {

    /* JADX INFO: renamed from: k */
    private zy f41799k = new C7345k(0);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private zy f90334toq = new toq(1);

    /* JADX INFO: renamed from: miuix.spring.view.SpringHelper$k */
    class C7345k extends zy {
        C7345k(int i2) {
            super(i2);
        }

        @Override // miuix.spring.view.SpringHelper.zy
        /* JADX INFO: renamed from: g */
        void mo26645g() {
            SpringHelper.this.vibrate();
        }

        @Override // miuix.spring.view.SpringHelper.zy
        /* JADX INFO: renamed from: k */
        protected boolean mo26646k() {
            return SpringHelper.this.mo4881k();
        }

        @Override // miuix.spring.view.SpringHelper.zy
        protected int toq() {
            return SpringHelper.this.mo4884y();
        }
    }

    class toq extends zy {
        toq(int i2) {
            super(i2);
        }

        @Override // miuix.spring.view.SpringHelper.zy
        /* JADX INFO: renamed from: g */
        void mo26645g() {
            SpringHelper.this.vibrate();
        }

        @Override // miuix.spring.view.SpringHelper.zy
        /* JADX INFO: renamed from: k */
        protected boolean mo26646k() {
            return SpringHelper.this.toq();
        }

        @Override // miuix.spring.view.SpringHelper.zy
        protected int toq() {
            return SpringHelper.this.mo4882n();
        }
    }

    private abstract class zy {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final float f90335f7l8 = 2.0f;

        /* JADX INFO: renamed from: g */
        private static final float f41802g = 0.5f;

        /* JADX INFO: renamed from: s */
        private static final float f41803s = 0.6666667f;

        /* JADX INFO: renamed from: y */
        private static final float f41804y = 0.33333334f;

        /* JADX INFO: renamed from: k */
        float f41805k;

        /* JADX INFO: renamed from: q */
        int f41807q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        float f90336toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f90337zy;

        zy(int i2) {
            this.f41807q = i2;
        }

        private float f7l8() {
            float f2 = (float) (-Math.pow(Math.abs(this.f90337zy / toq()) - 1.0f, 3.0d));
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            return f2 / 1.5f;
        }

        /* JADX INFO: renamed from: n */
        private float m26647n(float f2) {
            float f3;
            float fPow;
            int qVar = toq();
            if (qVar == 0) {
                fPow = Math.abs(f2);
                f3 = 0.5f;
            } else {
                f3 = qVar;
                double dMin = Math.min(Math.abs(f2) / f3, 1.0f);
                fPow = (float) (((Math.pow(dMin, 3.0d) / 3.0d) - Math.pow(dMin, 2.0d)) + dMin);
            }
            return fPow * f3;
        }

        /* JADX INFO: renamed from: p */
        private float m26648p(float f2) {
            int qVar = toq();
            if (qVar == 0) {
                return Math.abs(f2) * 2.0f;
            }
            if (Math.abs(f2) / qVar > f41804y) {
                return f2 * 3.0f;
            }
            double d2 = qVar;
            return (float) (d2 - (Math.pow(d2, 0.6666666865348816d) * Math.pow(r2 - (Math.abs(f2) * 3.0f), 0.3333333432674408d)));
        }

        /* JADX INFO: renamed from: s */
        private int m26649s(int i2, int[] iArr, boolean z2) {
            float f2 = this.f41805k;
            float f3 = this.f90336toq;
            float fSignum = Math.signum(f2);
            float f4 = this.f90336toq + i2;
            this.f90336toq = f4;
            if (z2) {
                this.f41805k = Math.signum(f4) * m26647n(Math.abs(this.f90336toq));
                int i3 = this.f41807q;
                iArr[i3] = iArr[i3] + (i2 - i2);
            }
            int i4 = (int) (this.f41805k + (this.f90336toq - f3));
            float f5 = i4;
            if (fSignum * f5 >= 0.0f) {
                if (!z2) {
                    this.f41805k = f5;
                }
                iArr[this.f41807q] = i2;
            } else {
                this.f41805k = 0.0f;
                iArr[this.f41807q] = (int) (iArr[r7] + f2);
            }
            float f6 = this.f41805k;
            if (f6 == 0.0f) {
                this.f90336toq = 0.0f;
            }
            if (!z2) {
                this.f90336toq = Math.signum(f6) * m26648p(Math.abs(this.f41805k));
            }
            return i4;
        }

        /* JADX INFO: renamed from: y */
        private void m26650y(int i2, int[] iArr, boolean z2) {
            if (i2 == 0 || !mo26646k()) {
                return;
            }
            float f2 = i2;
            float f3 = this.f90336toq + f2;
            this.f90336toq = f3;
            if (z2) {
                this.f41805k = Math.signum(f3) * m26647n(Math.abs(this.f90336toq));
            } else {
                if (this.f41805k == 0.0f) {
                    mo26645g();
                }
                float f4 = this.f41805k + f2;
                this.f41805k = f4;
                this.f90336toq = Math.signum(f4) * m26648p(Math.abs(this.f41805k));
            }
            int i3 = this.f41807q;
            iArr[i3] = iArr[i3] + i2;
        }

        /* JADX INFO: renamed from: g */
        abstract void mo26645g();

        /* JADX INFO: renamed from: k */
        protected abstract boolean mo26646k();

        /* JADX INFO: renamed from: q */
        void m26651q(int i2, @dd int[] iArr, int i3, @lvui int[] iArr2) {
            if (SpringHelper.this.ld6()) {
                m26650y(i2, iArr2, i3 == 0);
            }
        }

        protected abstract int toq();

        boolean zy(@lvui int[] iArr, @lvui int[] iArr2, boolean z2) {
            int i2 = iArr[this.f41807q];
            if (i2 != 0 && mo26646k()) {
                float f2 = this.f41805k;
                if (f2 == 0.0f || Integer.signum((int) f2) * i2 > 0) {
                    return false;
                }
                iArr[this.f41807q] = m26649s(i2, iArr2, z2);
                return true;
            }
            return false;
        }
    }

    public int f7l8() {
        return (int) this.f90334toq.f41805k;
    }

    /* JADX INFO: renamed from: g */
    public int m26642g() {
        return (int) this.f41799k.f41805k;
    }

    /* JADX INFO: renamed from: k */
    protected abstract boolean mo4881k();

    protected abstract boolean ld6();

    /* JADX INFO: renamed from: n */
    protected abstract int mo4882n();

    /* JADX INFO: renamed from: p */
    public void m26643p(int i2, int i3, int i4, int i5, @dd int[] iArr, int i6, @dd int[] iArr2) {
        if (iArr2 == null) {
            iArr2 = new int[]{0, 0};
        }
        mo4883q(i2, i3, i4, i5, iArr, i6, iArr2);
        int i7 = i4 - iArr2[0];
        int i8 = i5 - iArr2[1];
        if (i7 == 0 && i8 == 0) {
            return;
        }
        this.f41799k.m26651q(i7, iArr, i6, iArr2);
        this.f90334toq.m26651q(i8, iArr, i6, iArr2);
    }

    /* JADX INFO: renamed from: q */
    protected abstract void mo4883q(int i2, int i3, int i4, int i5, @dd int[] iArr, int i6, @dd int[] iArr2);

    /* JADX INFO: renamed from: s */
    public boolean m26644s(int i2, int i3, @dd int[] iArr, @dd int[] iArr2, int i4) {
        int i5;
        int i6;
        boolean z2;
        int[] iArr3 = {0, 0};
        if (ld6()) {
            boolean z3 = i4 == 0;
            int[] iArr4 = {i2, i3};
            boolean zZy = this.f90334toq.zy(iArr4, iArr3, z3) | this.f41799k.zy(iArr4, iArr3, z3);
            i5 = iArr4[0];
            i6 = iArr4[1];
            z2 = zZy;
        } else {
            i5 = i2;
            i6 = i3;
            z2 = false;
        }
        if (z2) {
            i5 -= iArr3[0];
            i6 -= iArr3[1];
        }
        boolean zZy2 = zy(i5, i6, iArr, iArr2, i4) | z2;
        if (iArr != null) {
            iArr[0] = iArr[0] + iArr3[0];
            iArr[1] = iArr[1] + iArr3[1];
        }
        return zZy2;
    }

    protected abstract boolean toq();

    @Keep
    protected abstract void vibrate();

    /* JADX INFO: renamed from: y */
    protected abstract int mo4884y();

    protected abstract boolean zy(int i2, int i3, @dd int[] iArr, @dd int[] iArr2, int i4);
}
