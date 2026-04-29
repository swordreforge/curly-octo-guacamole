package miuix.springback.view;

import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: SpringScroller.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final float f90399ki = 1.0f;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final float f90400t8r = 0.016f;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f90401cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private double f90402f7l8;

    /* JADX INFO: renamed from: g */
    private double f41890g;

    /* JADX INFO: renamed from: h */
    private boolean f41891h;

    /* JADX INFO: renamed from: k */
    private long f41892k;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private boolean f90403kja0 = true;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private double f90404ld6;

    /* JADX INFO: renamed from: n */
    private toq f41893n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f90405n7h;

    /* JADX INFO: renamed from: p */
    private double f41894p;

    /* JADX INFO: renamed from: q */
    private double f41895q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private double f90406qrj;

    /* JADX INFO: renamed from: s */
    private double f41896s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f90407toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private double f90408x2;

    /* JADX INFO: renamed from: y */
    private double f41897y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private double f90409zy;

    public void f7l8(float f2, float f3, float f4, float f5, float f6, int i2, boolean z2) {
        this.f90403kja0 = false;
        this.f41891h = false;
        double d2 = f2;
        this.f90402f7l8 = d2;
        this.f41897y = d2;
        this.f41890g = f3;
        double d4 = f4;
        this.f41894p = d4;
        this.f90404ld6 = d4;
        this.f41895q = (int) d4;
        this.f41896s = f5;
        double d5 = f6;
        this.f90408x2 = d5;
        this.f90406qrj = d5;
        if (Math.abs(d5) <= 5000.0d || z2) {
            this.f41893n = new toq(1.0f, 0.4f);
        } else {
            this.f41893n = new toq(1.0f, 0.55f);
        }
        this.f90405n7h = i2;
        this.f41892k = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m26734g() {
        return this.f90403kja0;
    }

    /* JADX INFO: renamed from: k */
    public boolean m26735k() {
        if (this.f41893n == null || this.f90403kja0) {
            return false;
        }
        int i2 = this.f90401cdj;
        if (i2 != 0) {
            if (this.f90405n7h == 1) {
                this.f90409zy = i2;
                this.f90402f7l8 = i2;
            } else {
                this.f41895q = i2;
                this.f41894p = i2;
            }
            this.f90401cdj = 0;
            return true;
        }
        if (this.f41891h) {
            this.f90403kja0 = true;
            return true;
        }
        this.f90407toq = AnimationUtils.currentAnimationTimeMillis();
        float f2 = f90400t8r;
        float fMin = Math.min((r0 - this.f41892k) / 1000.0f, f90400t8r);
        if (fMin != 0.0f) {
            f2 = fMin;
        }
        this.f41892k = this.f90407toq;
        if (this.f90405n7h == 2) {
            double dM26733k = this.f41893n.m26733k(this.f90406qrj, f2, this.f41896s, this.f41894p);
            double d2 = this.f41894p + (((double) f2) * dM26733k);
            this.f41895q = d2;
            this.f90406qrj = dM26733k;
            if (m26736n(d2, this.f90404ld6, this.f41896s)) {
                this.f41891h = true;
                this.f41895q = this.f41896s;
            } else {
                this.f41894p = this.f41895q;
            }
        } else {
            double dM26733k2 = this.f41893n.m26733k(this.f90406qrj, f2, this.f41890g, this.f90402f7l8);
            double d4 = this.f90402f7l8 + (((double) f2) * dM26733k2);
            this.f90409zy = d4;
            this.f90406qrj = dM26733k2;
            if (m26736n(d4, this.f41897y, this.f41890g)) {
                this.f41891h = true;
                this.f90409zy = this.f41890g;
            } else {
                this.f90402f7l8 = this.f90409zy;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m26736n(double d2, double d4, double d5) {
        if (d4 < d5 && d2 > d5) {
            return true;
        }
        if (d4 <= d5 || d2 >= d5) {
            return (d4 == d5 && Math.signum(this.f90408x2) != Math.signum(d2)) || Math.abs(d2 - d5) < 1.0d;
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final int m26737q() {
        return (int) this.f41895q;
    }

    public final void toq() {
        this.f90403kja0 = true;
        this.f90401cdj = 0;
    }

    /* JADX INFO: renamed from: y */
    public void m26738y(int i2) {
        this.f90401cdj = i2;
    }

    public final int zy() {
        return (int) this.f90409zy;
    }
}
