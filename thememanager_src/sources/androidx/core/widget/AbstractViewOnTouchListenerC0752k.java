package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.C0683f;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.widget.k */
/* JADX INFO: compiled from: AutoScrollHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0752k implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public static final int f4250a = 0;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final int f50973ab = 1575;
    private static final int an = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: b */
    public static final float f4251b = 0.0f;
    private static final float bb = Float.MAX_VALUE;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final int f50974bo = 0;
    private static final float bp = 0.2f;
    private static final float bv = 1.0f;

    /* JADX INFO: renamed from: d */
    private static final int f4252d = 1;
    private static final int id = 500;
    private static final int in = 500;

    /* JADX INFO: renamed from: m */
    public static final float f4253m = Float.MAX_VALUE;

    /* JADX INFO: renamed from: o */
    public static final float f4254o = 0.0f;

    /* JADX INFO: renamed from: u */
    public static final int f4255u = 2;

    /* JADX INFO: renamed from: v */
    private static final int f4256v = 1;

    /* JADX INFO: renamed from: w */
    private static final int f4257w = 315;

    /* JADX INFO: renamed from: x */
    public static final int f4258x = 1;

    /* JADX INFO: renamed from: c */
    boolean f4259c;

    /* JADX INFO: renamed from: e */
    private boolean f4260e;

    /* JADX INFO: renamed from: f */
    boolean f4261f;

    /* JADX INFO: renamed from: g */
    private Runnable f4262g;

    /* JADX INFO: renamed from: h */
    private int f4263h;

    /* JADX INFO: renamed from: j */
    private boolean f4265j;

    /* JADX INFO: renamed from: l */
    boolean f4267l;

    /* JADX INFO: renamed from: n */
    final View f4268n;

    /* JADX INFO: renamed from: p */
    private int f4269p;

    /* JADX INFO: renamed from: r */
    private boolean f4271r;

    /* JADX INFO: renamed from: k */
    final k f4266k = new k();

    /* JADX INFO: renamed from: q */
    private final Interpolator f4270q = new AccelerateInterpolator();

    /* JADX INFO: renamed from: y */
    private float[] f4274y = {0.0f, 0.0f};

    /* JADX INFO: renamed from: s */
    private float[] f4272s = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i */
    private float[] f4264i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: z */
    private float[] f4275z = {0.0f, 0.0f};

    /* JADX INFO: renamed from: t */
    private float[] f4273t = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.k$k */
    /* JADX INFO: compiled from: AutoScrollHelper.java */
    private static class k {

        /* JADX INFO: renamed from: k */
        private int f4277k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private int f50976ld6;

        /* JADX INFO: renamed from: p */
        private float f4279p;

        /* JADX INFO: renamed from: q */
        private float f4280q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f50977toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private float f50978zy;

        /* JADX INFO: renamed from: n */
        private long f4278n = Long.MIN_VALUE;

        /* JADX INFO: renamed from: s */
        private long f4281s = -1;

        /* JADX INFO: renamed from: g */
        private long f4276g = 0;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f50975f7l8 = 0;

        /* JADX INFO: renamed from: y */
        private int f4282y = 0;

        k() {
        }

        private float f7l8(float f2) {
            return ((-4.0f) * f2 * f2) + (f2 * 4.0f);
        }

        /* JADX INFO: renamed from: n */
        private float m3641n(long j2) {
            if (j2 < this.f4278n) {
                return 0.0f;
            }
            long j3 = this.f4281s;
            if (j3 < 0 || j2 < j3) {
                return AbstractViewOnTouchListenerC0752k.m3632n((j2 - r0) / this.f4277k, 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f4279p;
            return (1.0f - f2) + (f2 * AbstractViewOnTouchListenerC0752k.m3632n((j2 - j3) / this.f50976ld6, 0.0f, 1.0f));
        }

        /* JADX INFO: renamed from: g */
        public int m3642g() {
            float f2 = this.f4280q;
            return (int) (f2 / Math.abs(f2));
        }

        /* JADX INFO: renamed from: k */
        public void m3643k() {
            if (this.f4276g == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fF7l8 = f7l8(m3641n(jCurrentAnimationTimeMillis));
            long j2 = jCurrentAnimationTimeMillis - this.f4276g;
            this.f4276g = jCurrentAnimationTimeMillis;
            float f2 = j2 * fF7l8;
            this.f50975f7l8 = (int) (this.f50978zy * f2);
            this.f4282y = (int) (f2 * this.f4280q);
        }

        public void ld6(int i2) {
            this.f4277k = i2;
        }

        /* JADX INFO: renamed from: p */
        public void m3644p(int i2) {
            this.f50977toq = i2;
        }

        /* JADX INFO: renamed from: q */
        public int m3645q() {
            float f2 = this.f50978zy;
            return (int) (f2 / Math.abs(f2));
        }

        public void qrj() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f4278n = jCurrentAnimationTimeMillis;
            this.f4281s = -1L;
            this.f4276g = jCurrentAnimationTimeMillis;
            this.f4279p = 0.5f;
            this.f50975f7l8 = 0;
            this.f4282y = 0;
        }

        /* JADX INFO: renamed from: s */
        public void m3646s() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f50976ld6 = AbstractViewOnTouchListenerC0752k.m3631g((int) (jCurrentAnimationTimeMillis - this.f4278n), 0, this.f50977toq);
            this.f4279p = m3641n(jCurrentAnimationTimeMillis);
            this.f4281s = jCurrentAnimationTimeMillis;
        }

        public int toq() {
            return this.f50975f7l8;
        }

        public void x2(float f2, float f3) {
            this.f50978zy = f2;
            this.f4280q = f3;
        }

        /* JADX INFO: renamed from: y */
        public boolean m3647y() {
            return this.f4281s > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f4281s + ((long) this.f50976ld6);
        }

        public int zy() {
            return this.f4282y;
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.k$toq */
    /* JADX INFO: compiled from: AutoScrollHelper.java */
    private class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0752k abstractViewOnTouchListenerC0752k = AbstractViewOnTouchListenerC0752k.this;
            if (abstractViewOnTouchListenerC0752k.f4259c) {
                if (abstractViewOnTouchListenerC0752k.f4267l) {
                    abstractViewOnTouchListenerC0752k.f4267l = false;
                    abstractViewOnTouchListenerC0752k.f4266k.qrj();
                }
                k kVar = AbstractViewOnTouchListenerC0752k.this.f4266k;
                if (kVar.m3647y() || !AbstractViewOnTouchListenerC0752k.this.fu4()) {
                    AbstractViewOnTouchListenerC0752k.this.f4259c = false;
                    return;
                }
                AbstractViewOnTouchListenerC0752k abstractViewOnTouchListenerC0752k2 = AbstractViewOnTouchListenerC0752k.this;
                if (abstractViewOnTouchListenerC0752k2.f4261f) {
                    abstractViewOnTouchListenerC0752k2.f4261f = false;
                    abstractViewOnTouchListenerC0752k2.zy();
                }
                kVar.m3643k();
                AbstractViewOnTouchListenerC0752k.this.x2(kVar.toq(), kVar.zy());
                C0683f.mbx(AbstractViewOnTouchListenerC0752k.this.f4268n, this);
            }
        }
    }

    public AbstractViewOnTouchListenerC0752k(@lvui View view) {
        this.f4268n = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = (int) ((1575.0f * f2) + 0.5f);
        ki(f3, f3);
        float f4 = (int) ((f2 * 315.0f) + 0.5f);
        t8r(f4, f4);
        n7h(1);
        cdj(Float.MAX_VALUE, Float.MAX_VALUE);
        zurt(0.2f, 0.2f);
        ni7(1.0f, 1.0f);
        qrj(an);
        fn3e(500);
        m3637i(500);
    }

    private float f7l8(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f4269p;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f4259c && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: g */
    static int m3631g(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    private void ld6() {
        if (this.f4267l) {
            this.f4259c = false;
        } else {
            this.f4266k.m3646s();
        }
    }

    /* JADX INFO: renamed from: n */
    static float m3632n(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX INFO: renamed from: q */
    private float m3633q(int i2, float f2, float f3, float f4) {
        float fM3634y = m3634y(this.f4274y[i2], f3, this.f4272s[i2], f2);
        if (fM3634y == 0.0f) {
            return 0.0f;
        }
        float f5 = this.f4264i[i2];
        float f6 = this.f4275z[i2];
        float f7 = this.f4273t[i2];
        float f8 = f5 * f4;
        return fM3634y > 0.0f ? m3632n(fM3634y * f8, f6, f7) : -m3632n((-fM3634y) * f8, f6, f7);
    }

    /* JADX INFO: renamed from: y */
    private float m3634y(float f2, float f3, float f4, float f5) {
        float interpolation;
        float fM3632n = m3632n(f2 * f3, 0.0f, f4);
        float fF7l8 = f7l8(f3 - f5, fM3632n) - f7l8(f5, fM3632n);
        if (fF7l8 < 0.0f) {
            interpolation = -this.f4270q.getInterpolation(-fF7l8);
        } else {
            if (fF7l8 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f4270q.getInterpolation(fF7l8);
        }
        return m3632n(interpolation, -1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: z */
    private void m3635z() {
        int i2;
        if (this.f4262g == null) {
            this.f4262g = new toq();
        }
        this.f4259c = true;
        this.f4267l = true;
        if (this.f4271r || (i2 = this.f4263h) <= 0) {
            this.f4262g.run();
        } else {
            C0683f.jbh(this.f4268n, this.f4262g, i2);
        }
        this.f4271r = true;
    }

    @lvui
    public AbstractViewOnTouchListenerC0752k cdj(float f2, float f3) {
        float[] fArr = this.f4272s;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    @lvui
    public AbstractViewOnTouchListenerC0752k fn3e(int i2) {
        this.f4266k.ld6(i2);
        return this;
    }

    boolean fu4() {
        k kVar = this.f4266k;
        int iM3642g = kVar.m3642g();
        int iM3645q = kVar.m3645q();
        return (iM3642g != 0 && toq(iM3642g)) || (iM3645q != 0 && mo3638k(iM3645q));
    }

    /* JADX INFO: renamed from: h */
    public AbstractViewOnTouchListenerC0752k m3636h(boolean z2) {
        this.f4265j = z2;
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: i */
    public AbstractViewOnTouchListenerC0752k m3637i(int i2) {
        this.f4266k.m3644p(i2);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo3638k(int i2);

    @lvui
    public AbstractViewOnTouchListenerC0752k ki(float f2, float f3) {
        float[] fArr = this.f4273t;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public AbstractViewOnTouchListenerC0752k kja0(boolean z2) {
        if (this.f4260e && !z2) {
            ld6();
        }
        this.f4260e = z2;
        return this;
    }

    @lvui
    public AbstractViewOnTouchListenerC0752k n7h(int i2) {
        this.f4269p = i2;
        return this;
    }

    @lvui
    public AbstractViewOnTouchListenerC0752k ni7(float f2, float f3) {
        float[] fArr = this.f4264i;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f4260e
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.ld6()
            goto L58
        L1a:
            r5.f4261f = r2
            r5.f4271r = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f4268n
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m3633q(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f4268n
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m3633q(r2, r7, r6, r3)
            androidx.core.widget.k$k r7 = r5.f4266k
            r7.x2(r0, r6)
            boolean r6 = r5.f4259c
            if (r6 != 0) goto L58
            boolean r6 = r5.fu4()
            if (r6 == 0) goto L58
            r5.m3635z()
        L58:
            boolean r6 = r5.f4265j
            if (r6 == 0) goto L61
            boolean r6 = r5.f4259c
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractViewOnTouchListenerC0752k.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: p */
    public boolean m3639p() {
        return this.f4265j;
    }

    @lvui
    public AbstractViewOnTouchListenerC0752k qrj(int i2) {
        this.f4263h = i2;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public boolean m3640s() {
        return this.f4260e;
    }

    @lvui
    public AbstractViewOnTouchListenerC0752k t8r(float f2, float f3) {
        float[] fArr = this.f4275z;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public abstract boolean toq(int i2);

    public abstract void x2(int i2, int i3);

    @lvui
    public AbstractViewOnTouchListenerC0752k zurt(float f2, float f3) {
        float[] fArr = this.f4274y;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    void zy() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f4268n.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }
}
