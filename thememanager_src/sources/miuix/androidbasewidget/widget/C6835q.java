package miuix.androidbasewidget.widget;

import android.view.animation.AnimationUtils;

/* JADX INFO: renamed from: miuix.androidbasewidget.widget.q */
/* JADX INFO: compiled from: SpringScroller.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6835q {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final float f86720cdj = 1.0f;

    /* JADX INFO: renamed from: h */
    private static final int f38700h = 2;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final float f86721ki = 0.016f;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f86722kja0 = 1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private double f86723f7l8;

    /* JADX INFO: renamed from: g */
    private double f38701g;

    /* JADX INFO: renamed from: k */
    private long f38702k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private double f86724ld6;

    /* JADX INFO: renamed from: n */
    private zy f38703n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f86725n7h;

    /* JADX INFO: renamed from: p */
    private double f38704p;

    /* JADX INFO: renamed from: q */
    private double f38705q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private boolean f86726qrj = true;

    /* JADX INFO: renamed from: s */
    private double f38706s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f86727toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f86728x2;

    /* JADX INFO: renamed from: y */
    private double f38707y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private double f86729zy;

    public boolean f7l8(double d2, double d4) {
        return Math.abs(d2 - d4) < 1.0d;
    }

    /* JADX INFO: renamed from: g */
    public final int m24800g() {
        return (int) this.f86723f7l8;
    }

    /* JADX INFO: renamed from: k */
    public final void m24801k() {
        this.f86726qrj = true;
    }

    /* JADX INFO: renamed from: n */
    public final int m24802n() {
        return (int) this.f38701g;
    }

    /* JADX INFO: renamed from: p */
    public void m24803p(float f2, float f3, float f4, float f5, float f6) {
        this.f86726qrj = false;
        this.f86725n7h = false;
        this.f86723f7l8 = f2;
        this.f38701g = f3;
        double d2 = f4;
        this.f38706s = d2;
        this.f38704p = d2;
        this.f38705q = (int) d2;
        this.f38707y = f5;
        double d4 = f6;
        this.f86724ld6 = d4;
        if (Math.abs(d4) <= 5000.0d) {
            this.f38703n = new zy(0.9f, 0.35f);
        } else {
            this.f38703n = new zy(0.9f, 0.35f);
        }
        this.f86728x2 = Math.abs(f5 - f4) > Math.abs(f3 - f2) ? 2 : 1;
        this.f38702k = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: q */
    public final int m24804q() {
        return (int) this.f38705q;
    }

    /* JADX INFO: renamed from: s */
    public void m24805s(int i2) {
        this.f38701g = i2;
        this.f86726qrj = false;
    }

    public boolean toq() {
        if (this.f38703n == null || this.f86726qrj) {
            return false;
        }
        if (this.f86725n7h) {
            this.f86726qrj = true;
            this.f38705q = this.f38707y;
            this.f86729zy = this.f38701g;
            return true;
        }
        this.f86727toq = AnimationUtils.currentAnimationTimeMillis();
        float f2 = (r2 - this.f38702k) / 1000.0f;
        float f3 = f86721ki;
        float fMin = Math.min(f2, f86721ki);
        if (fMin != 0.0f) {
            f3 = fMin;
        }
        this.f38702k = this.f86727toq;
        if (this.f86728x2 == 2) {
            double dM24807k = this.f38703n.m24807k(this.f86724ld6, f3, this.f38707y, this.f38706s);
            double d2 = this.f38706s + (((double) f3) * dM24807k);
            this.f38705q = d2;
            this.f86724ld6 = dM24807k;
            if (f7l8(d2, this.f38707y)) {
                this.f86725n7h = true;
            } else {
                this.f38706s = this.f38705q;
            }
        } else {
            double dM24807k2 = this.f38703n.m24807k(this.f86724ld6, f3, this.f38701g, this.f86723f7l8);
            double d4 = this.f86723f7l8 + (((double) f3) * dM24807k2);
            this.f86729zy = d4;
            this.f86724ld6 = dM24807k2;
            if (f7l8(d4, this.f38701g)) {
                this.f86725n7h = true;
            } else {
                this.f86723f7l8 = this.f86729zy;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m24806y() {
        return this.f86726qrj;
    }

    public final int zy() {
        return (int) this.f86729zy;
    }
}
