package com.airbnb.lottie.utils;

import android.view.Choreographer;
import com.airbnb.lottie.C1476n;
import com.airbnb.lottie.ld6;
import zy.dd;
import zy.oc;
import zy.yz;
import zy.zurt;

/* JADX INFO: renamed from: com.airbnb.lottie.utils.n */
/* JADX INFO: compiled from: LottieValueAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public class ChoreographerFrameCallbackC1509n extends AbstractC1508k implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: z */
    @dd
    private ld6 f8286z;

    /* JADX INFO: renamed from: n */
    private float f8281n = 1.0f;

    /* JADX INFO: renamed from: g */
    private boolean f8278g = false;

    /* JADX INFO: renamed from: y */
    private long f8285y = 0;

    /* JADX INFO: renamed from: s */
    private float f8283s = 0.0f;

    /* JADX INFO: renamed from: p */
    private int f8282p = 0;

    /* JADX INFO: renamed from: h */
    private float f8279h = -2.1474836E9f;

    /* JADX INFO: renamed from: i */
    private float f8280i = 2.1474836E9f;

    /* JADX INFO: renamed from: t */
    @yz
    protected boolean f8284t = false;

    private float cdj() {
        ld6 ld6Var = this.f8286z;
        if (ld6Var == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / ld6Var.m5978s()) / Math.abs(this.f8281n);
    }

    private void d3() {
        if (this.f8286z == null) {
            return;
        }
        float f2 = this.f8283s;
        if (f2 < this.f8279h || f2 > this.f8280i) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f8279h), Float.valueOf(this.f8280i), Float.valueOf(this.f8283s)));
        }
    }

    private boolean fn3e() {
        return m6249i() < 0.0f;
    }

    public void a9(float f2) {
        fti(this.f8279h, f2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @oc
    public void cancel() {
        mo6245k();
        m6252z();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j2) {
        fu4();
        if (this.f8286z == null || !isRunning()) {
            return;
        }
        C1476n.m6103k("LottieValueAnimator#doFrame");
        float fCdj = (this.f8285y != 0 ? j2 - r1 : 0L) / cdj();
        float f2 = this.f8283s;
        if (fn3e()) {
            fCdj = -fCdj;
        }
        float f3 = f2 + fCdj;
        this.f8283s = f3;
        boolean z2 = !f7l8.m6238n(f3, t8r(), ki());
        this.f8283s = f7l8.zy(this.f8283s, t8r(), ki());
        this.f8285y = j2;
        m6248y();
        if (z2) {
            if (getRepeatCount() == -1 || this.f8282p < getRepeatCount()) {
                m6246n();
                this.f8282p++;
                if (getRepeatMode() == 2) {
                    this.f8278g = !this.f8278g;
                    m6251t();
                } else {
                    this.f8283s = fn3e() ? ki() : t8r();
                }
                this.f8285y = j2;
            } else {
                this.f8283s = this.f8281n < 0.0f ? t8r() : ki();
                m6252z();
                m6247q(fn3e());
            }
        }
        d3();
        C1476n.toq("LottieValueAnimator#doFrame");
    }

    public void fti(float f2, float f3) {
        if (f2 > f3) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f2), Float.valueOf(f3)));
        }
        ld6 ld6Var = this.f8286z;
        float fKi = ld6Var == null ? -3.4028235E38f : ld6Var.ki();
        ld6 ld6Var2 = this.f8286z;
        float fM5971g = ld6Var2 == null ? Float.MAX_VALUE : ld6Var2.m5971g();
        float fZy = f7l8.zy(f2, fKi, fM5971g);
        float fZy2 = f7l8.zy(f3, fKi, fM5971g);
        if (fZy == this.f8279h && fZy2 == this.f8280i) {
            return;
        }
        this.f8279h = fZy;
        this.f8280i = fZy2;
        jk((int) f7l8.zy(this.f8283s, fZy, fZy2));
    }

    protected void fu4() {
        if (isRunning()) {
            o1t(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator
    @zurt(from = 0.0d, to = 1.0d)
    public float getAnimatedFraction() {
        float fT8r;
        float fKi;
        float fT8r2;
        if (this.f8286z == null) {
            return 0.0f;
        }
        if (fn3e()) {
            fT8r = ki() - this.f8283s;
            fKi = ki();
            fT8r2 = t8r();
        } else {
            fT8r = this.f8283s - t8r();
            fKi = ki();
            fT8r2 = t8r();
        }
        return fT8r / (fKi - fT8r2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(n7h());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        ld6 ld6Var = this.f8286z;
        if (ld6Var == null) {
            return 0L;
        }
        return (long) ld6Var.m5977q();
    }

    public void gvn7(float f2) {
        this.f8281n = f2;
    }

    /* JADX INFO: renamed from: i */
    public float m6249i() {
        return this.f8281n;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f8284t;
    }

    public void jk(float f2) {
        if (this.f8283s == f2) {
            return;
        }
        this.f8283s = f7l8.zy(f2, t8r(), ki());
        this.f8285y = 0L;
        m6248y();
    }

    public void jp0y(int i2) {
        fti(i2, (int) this.f8280i);
    }

    @Override // com.airbnb.lottie.utils.AbstractC1508k
    /* JADX INFO: renamed from: k */
    void mo6245k() {
        super.mo6245k();
        m6247q(fn3e());
    }

    public float ki() {
        ld6 ld6Var = this.f8286z;
        if (ld6Var == null) {
            return 0.0f;
        }
        float f2 = this.f8280i;
        return f2 == 2.1474836E9f ? ld6Var.m5971g() : f2;
    }

    public float kja0() {
        return this.f8283s;
    }

    public void mcp(ld6 ld6Var) {
        boolean z2 = this.f8286z == null;
        this.f8286z = ld6Var;
        if (z2) {
            fti((int) Math.max(this.f8279h, ld6Var.ki()), (int) Math.min(this.f8280i, ld6Var.m5971g()));
        } else {
            fti((int) ld6Var.ki(), (int) ld6Var.m5971g());
        }
        float f2 = this.f8283s;
        this.f8283s = 0.0f;
        jk((int) f2);
        m6248y();
    }

    @zurt(from = 0.0d, to = 1.0d)
    public float n7h() {
        ld6 ld6Var = this.f8286z;
        if (ld6Var == null) {
            return 0.0f;
        }
        return (this.f8283s - ld6Var.ki()) / (this.f8286z.m5971g() - this.f8286z.ki());
    }

    @oc
    public void ni7() {
        this.f8284t = true;
        m6244g(fn3e());
        jk((int) (fn3e() ? ki() : t8r()));
        this.f8285y = 0L;
        this.f8282p = 0;
        fu4();
    }

    @oc
    protected void o1t(boolean z2) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z2) {
            this.f8284t = false;
        }
    }

    @oc
    public void qrj() {
        m6252z();
        m6247q(fn3e());
    }

    /* JADX INFO: renamed from: s */
    public void m6250s() {
        this.f8286z = null;
        this.f8279h = -2.1474836E9f;
        this.f8280i = 2.1474836E9f;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i2) {
        super.setRepeatMode(i2);
        if (i2 == 2 || !this.f8278g) {
            return;
        }
        this.f8278g = false;
        m6251t();
    }

    /* JADX INFO: renamed from: t */
    public void m6251t() {
        gvn7(-m6249i());
    }

    public float t8r() {
        ld6 ld6Var = this.f8286z;
        if (ld6Var == null) {
            return 0.0f;
        }
        float f2 = this.f8279h;
        return f2 == -2.1474836E9f ? ld6Var.ki() : f2;
    }

    @oc
    public void wvg() {
        this.f8284t = true;
        fu4();
        this.f8285y = 0L;
        if (fn3e() && kja0() == t8r()) {
            this.f8283s = ki();
        } else {
            if (fn3e() || kja0() != ki()) {
                return;
            }
            this.f8283s = t8r();
        }
    }

    @oc
    /* JADX INFO: renamed from: z */
    protected void m6252z() {
        o1t(true);
    }

    @oc
    public void zurt() {
        m6252z();
    }
}
