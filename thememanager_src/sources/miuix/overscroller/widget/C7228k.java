package miuix.overscroller.widget;

import android.content.Context;
import android.view.animation.AnimationUtils;
import miuix.overscroller.internal.dynamicanimation.animation.C7216n;
import miuix.overscroller.internal.dynamicanimation.animation.C7226y;
import miuix.overscroller.internal.dynamicanimation.animation.f7l8;
import miuix.overscroller.internal.dynamicanimation.animation.toq;
import miuix.overscroller.internal.dynamicanimation.animation.zy;
import miuix.overscroller.widget.zy;

/* JADX INFO: renamed from: miuix.overscroller.widget.k */
/* JADX INFO: compiled from: DynamicScroller.java */
/* JADX INFO: loaded from: classes3.dex */
class C7228k extends zy.C7229k implements zy.toq {

    /* JADX INFO: renamed from: l */
    private static final float f40759l = 0.5f;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private static final float f87937ncyb = 8000.0f;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private miuix.overscroller.internal.dynamicanimation.animation.zy f87938dd;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private C7216n f87939lvui;

    /* JADX INFO: renamed from: r */
    private f7l8 f40760r;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private toq f87940x9kr;

    /* JADX INFO: renamed from: miuix.overscroller.widget.k$k */
    /* JADX INFO: compiled from: DynamicScroller.java */
    class k implements toq.InterfaceC8106toq {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f40761k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ int f87941toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ int f87942zy;

        k(int i2, int i3, int i4) {
            this.f40761k = i2;
            this.f87941toq = i3;
            this.f87942zy = i4;
        }

        @Override // miuix.overscroller.widget.C7228k.toq.InterfaceC8106toq
        /* JADX INFO: renamed from: k */
        public boolean mo26250k(float f2, float f3) {
            miuix.overscroller.widget.toq.toq("fling finished: value(%f), velocity(%f), scroller boundary(%d, %d)", Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(this.f40761k), Integer.valueOf(this.f87941toq));
            C7228k.this.f87938dd.t8r(C7228k.this.f87940x9kr.f40763g);
            C7228k.this.f87938dd.mo26199i(C7228k.this.f87940x9kr.f40765n);
            float fM26240t = C7228k.this.f87938dd.m26240t();
            if (((int) f2) == 0 || (fM26240t <= this.f87941toq && fM26240t >= this.f40761k)) {
                miuix.overscroller.widget.toq.m26258k("fling finished, no more work.");
                return false;
            }
            miuix.overscroller.widget.toq.m26258k("fling destination beyound boundary, start spring");
            C7228k.this.m26248m();
            C7228k c7228k = C7228k.this;
            c7228k.m26249o(2, c7228k.t8r(), C7228k.this.ki(), C7228k.this.zurt(), this.f87942zy);
            return true;
        }
    }

    /* JADX INFO: renamed from: miuix.overscroller.widget.k$toq */
    /* JADX INFO: compiled from: DynamicScroller.java */
    private static class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private InterfaceC8106toq f87943f7l8;

        /* JADX INFO: renamed from: g */
        int f40763g;

        /* JADX INFO: renamed from: k */
        miuix.overscroller.internal.dynamicanimation.animation.toq<?> f40764k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private k f87944ld6 = new k(this, null);

        /* JADX INFO: renamed from: n */
        float f40765n;

        /* JADX INFO: renamed from: p */
        private long f40766p;

        /* JADX INFO: renamed from: q */
        private final int f40767q;

        /* JADX INFO: renamed from: s */
        private float f40768s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f87945toq;

        /* JADX INFO: renamed from: y */
        private float f40769y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f87946zy;

        /* JADX INFO: renamed from: miuix.overscroller.widget.k$toq$k */
        /* JADX INFO: compiled from: DynamicScroller.java */
        private class k implements toq.ki {
            private k() {
            }

            @Override // miuix.overscroller.internal.dynamicanimation.animation.toq.ki
            /* JADX INFO: renamed from: k */
            public void mo26208k(miuix.overscroller.internal.dynamicanimation.animation.toq toqVar, float f2, float f3) {
                toq toqVar2 = toq.this;
                toqVar2.f40765n = f3;
                toqVar2.f40763g = toqVar2.f87945toq + ((int) f2);
                miuix.overscroller.widget.toq.m26259q("%s updating value(%f), velocity(%f), min(%f), max(%f)", toqVar.getClass().getSimpleName(), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(toq.this.f40769y), Float.valueOf(toq.this.f40768s));
            }

            /* synthetic */ k(toq toqVar, k kVar) {
                this();
            }
        }

        /* JADX INFO: renamed from: miuix.overscroller.widget.k$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DynamicScroller.java */
        interface InterfaceC8106toq {
            /* JADX INFO: renamed from: k */
            boolean mo26250k(float f2, float f3);
        }

        toq(miuix.overscroller.internal.dynamicanimation.animation.toq<?> toqVar, int i2, float f2) {
            this.f40764k = toqVar;
            toqVar.mo26198h(-3.4028235E38f);
            this.f40764k.kja0(Float.MAX_VALUE);
            this.f87945toq = i2;
            this.f40765n = f2;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            if (i2 > 0) {
                i4 = Integer.MIN_VALUE + i2;
            } else if (i2 < 0) {
                i3 = Integer.MAX_VALUE + i2;
            }
            this.f87946zy = i4;
            this.f40767q = i3;
            this.f40764k.t8r(0.0f);
            this.f40764k.mo26199i(f2);
        }

        void f7l8(int i2) {
            int i3 = this.f40767q;
            if (i2 > i3) {
                i2 = i3;
            }
            float fMax = Math.max(i2 - this.f87945toq, 0);
            this.f40764k.kja0(fMax);
            this.f40768s = fMax;
        }

        /* JADX INFO: renamed from: g */
        int m26252g(int i2) {
            return i2 - this.f87945toq;
        }

        boolean ld6() {
            long j2 = this.f40766p;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (jCurrentAnimationTimeMillis == j2) {
                miuix.overscroller.widget.toq.zy("update done in this frame, dropping current update request");
                return !this.f40764k.m26201p();
            }
            boolean zDoAnimationFrame = this.f40764k.doAnimationFrame(jCurrentAnimationTimeMillis);
            if (zDoAnimationFrame) {
                miuix.overscroller.widget.toq.m26259q("%s finishing value(%d) velocity(%f)", this.f40764k.getClass().getSimpleName(), Integer.valueOf(this.f40763g), Float.valueOf(this.f40765n));
                this.f40764k.n7h(this.f87944ld6);
                this.f40766p = 0L;
            }
            this.f40766p = jCurrentAnimationTimeMillis;
            return zDoAnimationFrame;
        }

        /* JADX INFO: renamed from: n */
        miuix.overscroller.internal.dynamicanimation.animation.toq<?> m26253n() {
            return this.f40764k;
        }

        /* JADX INFO: renamed from: p */
        void m26254p() {
            this.f40764k.toq(this.f87944ld6);
            this.f40764k.ni7(true);
            this.f40766p = 0L;
        }

        /* JADX INFO: renamed from: q */
        boolean m26255q() {
            InterfaceC8106toq interfaceC8106toq = this.f87943f7l8;
            if (interfaceC8106toq != null) {
                return interfaceC8106toq.mo26250k(this.f40763g, this.f40765n);
            }
            return false;
        }

        /* JADX INFO: renamed from: s */
        void m26256s(InterfaceC8106toq interfaceC8106toq) {
            this.f87943f7l8 = interfaceC8106toq;
        }

        /* JADX INFO: renamed from: y */
        void m26257y(int i2) {
            int i3 = this.f87946zy;
            if (i2 < i3) {
                i2 = i3;
            }
            float fMin = Math.min(i2 - this.f87945toq, 0);
            this.f40764k.mo26198h(fMin);
            this.f40769y = fMin;
        }

        void zy() {
            this.f40766p = 0L;
            this.f40764k.zy();
            this.f40764k.n7h(this.f87944ld6);
        }
    }

    C7228k(Context context) {
        super(context);
        this.f87939lvui = new C7216n();
        f7l8 f7l8Var = new f7l8(this.f87939lvui);
        this.f40760r = f7l8Var;
        f7l8Var.jk(new C7226y());
        this.f40760r.cdj(0.5f);
        this.f40760r.m26184t().m26236n(0.97f);
        this.f40760r.m26184t().f7l8(130.5f);
        this.f40760r.m26184t().m26239y(1000.0d);
        miuix.overscroller.internal.dynamicanimation.animation.zy zyVar = new miuix.overscroller.internal.dynamicanimation.animation.zy(this.f87939lvui, this);
        this.f87938dd = zyVar;
        zyVar.cdj(0.5f);
        this.f87938dd.a9(0.4761905f);
    }

    private void ek5k(int i2, int i3, int i4, int i5, int i6) {
        boolean z2 = false;
        miuix.overscroller.widget.toq.toq("startAfterEdge: start(%d) velocity(%d) boundary(%d, %d) over(%d)", Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i6));
        if (i2 > i3 && i2 < i4) {
            d2ok(true);
            return;
        }
        boolean z3 = i2 > i4;
        int i7 = z3 ? i4 : i3;
        int i8 = i2 - i7;
        if (i5 != 0 && Integer.signum(i8) * i5 >= 0) {
            z2 = true;
        }
        if (z2) {
            miuix.overscroller.widget.toq.m26258k("spring forward");
            m26249o(2, i2, i5, i7, i6);
            return;
        }
        this.f87938dd.t8r(i2);
        float f2 = i5;
        this.f87938dd.mo26199i(f2);
        float fM26240t = this.f87938dd.m26240t();
        if ((!z3 || fM26240t >= i4) && (z3 || fM26240t <= i3)) {
            miuix.overscroller.widget.toq.m26258k("spring backward");
            m26249o(1, i2, f2, i7, i6);
        } else {
            miuix.overscroller.widget.toq.m26258k("fling to content");
            m26247j(i2, i5, i3, i4, i6);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m26247j(int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int iWvg;
        this.f87938dd.t8r(0.0f);
        float f2 = i3;
        this.f87938dd.mo26199i(f2);
        long jM26240t = ((long) i2) + ((long) this.f87938dd.m26240t());
        if (jM26240t > i5) {
            iWvg = (int) this.f87938dd.mcp(i5 - i2);
            i7 = i5;
        } else if (jM26240t < i4) {
            iWvg = (int) this.f87938dd.mcp(i4 - i2);
            i7 = i4;
        } else {
            i7 = (int) jM26240t;
            iWvg = (int) this.f87938dd.wvg();
        }
        d2ok(false);
        jp0y(f2);
        dd(AnimationUtils.currentAnimationTimeMillis());
        gvn7(i2);
        m26283r(i2);
        d3(iWvg);
        oc(i7);
        x9kr(0);
        int iMin = Math.min(i4, i2);
        int iMax = Math.max(i5, i2);
        toq toqVar = new toq(this.f87938dd, i2, f2);
        this.f87940x9kr = toqVar;
        toqVar.m26256s(new k(i4, i5, i6));
        this.f87940x9kr.m26257y(iMin);
        this.f87940x9kr.f7l8(iMax);
        this.f87940x9kr.m26254p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m26248m() {
        if (this.f87940x9kr != null) {
            miuix.overscroller.widget.toq.toq("resetting current handler: state(%d), anim(%s), value(%d), velocity(%f)", Integer.valueOf(m26284t()), this.f87940x9kr.m26253n().getClass().getSimpleName(), Integer.valueOf(this.f87940x9kr.f40763g), Float.valueOf(this.f87940x9kr.f40765n));
            this.f87940x9kr.zy();
            this.f87940x9kr = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m26249o(int i2, int i3, float f2, int i4, int i5) {
        if (f2 > f87937ncyb) {
            miuix.overscroller.widget.toq.toq("%f is too fast for spring, slow down", Float.valueOf(f2));
            f2 = 8000.0f;
        }
        d2ok(false);
        jp0y(f2);
        dd(AnimationUtils.currentAnimationTimeMillis());
        gvn7(i3);
        m26283r(i3);
        d3(Integer.MAX_VALUE);
        oc(i4);
        x9kr(i2);
        this.f87940x9kr = new toq(this.f40760r, i3, f2);
        this.f40760r.m26184t().m26234g(this.f87940x9kr.m26252g(i4));
        if (i5 != 0) {
            if (f2 < 0.0f) {
                this.f87940x9kr.m26257y(i4 - i5);
                this.f87940x9kr.f7l8(Math.max(i4, i3));
            } else {
                this.f87940x9kr.m26257y(Math.min(i4, i3));
                this.f87940x9kr.f7l8(i4 + i5);
            }
        }
        this.f87940x9kr.m26254p();
    }

    @Override // miuix.overscroller.widget.zy.C7229k
    void a9(int i2, int i3, int i4) {
        if (m26284t() == 0) {
            if (this.f87940x9kr != null) {
                m26248m();
            }
            ek5k(i2, i3, i3, (int) ki(), i4);
        }
    }

    @Override // miuix.overscroller.widget.zy.C7229k
    void cdj(int i2, int i3, int i4, int i5, int i6) {
        miuix.overscroller.widget.toq.toq("FLING: start(%d) velocity(%d) boundary(%d, %d) over(%d)", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
        m26248m();
        if (i3 == 0) {
            gvn7(i2);
            m26283r(i2);
            oc(i2);
            d3(0);
            d2ok(true);
            return;
        }
        yz(i3);
        if (i2 > i5 || i2 < i4) {
            ek5k(i2, i4, i5, i3, i6);
        } else {
            m26247j(i2, i3, i4, i5, i6);
        }
    }

    @Override // miuix.overscroller.widget.zy.C7229k
    void eqxt(int i2) {
        super.eqxt(i2);
    }

    @Override // miuix.overscroller.internal.dynamicanimation.animation.zy.toq
    /* JADX INFO: renamed from: k */
    public void mo26245k(int i2) {
        eqxt(o1t() + i2);
    }

    @Override // miuix.overscroller.widget.zy.C7229k
    void kja0() {
        miuix.overscroller.widget.toq.m26258k("finish scroller");
        gvn7(zurt());
        d2ok(true);
        m26248m();
    }

    @Override // miuix.overscroller.widget.zy.C7229k
    boolean lrht() {
        toq toqVar = this.f87940x9kr;
        if (toqVar == null) {
            miuix.overscroller.widget.toq.m26258k("no handler found, aborting");
            return false;
        }
        boolean zLd6 = toqVar.ld6();
        gvn7(this.f87940x9kr.f40763g);
        jp0y(this.f87940x9kr.f40765n);
        if (m26284t() == 2 && Math.signum(this.f87940x9kr.f40763g) * Math.signum(this.f87940x9kr.f40765n) < 0.0f) {
            miuix.overscroller.widget.toq.m26258k("State Changed: BALLISTIC -> CUBIC");
            x9kr(1);
        }
        return !zLd6;
    }

    @Override // miuix.overscroller.widget.zy.C7229k
    void lvui(float f2) {
        this.f87938dd.a9(f2);
    }

    @Override // miuix.overscroller.widget.zy.C7229k
    void n7h(int i2) {
        super.n7h(i2);
    }

    @Override // miuix.overscroller.widget.zy.C7229k
    boolean ncyb(int i2, int i3, int i4) {
        miuix.overscroller.widget.toq.toq("SPRING_BACK start(%d) boundary(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        if (this.f87940x9kr != null) {
            m26248m();
        }
        if (i2 < i3) {
            m26249o(1, i2, 0.0f, i3, 0);
        } else if (i2 > i4) {
            m26249o(1, i2, 0.0f, i4, 0);
        } else {
            gvn7(i2);
            m26283r(i2);
            oc(i2);
            d3(0);
            d2ok(true);
        }
        return !jk();
    }

    @Override // miuix.overscroller.widget.zy.C7229k
    boolean qrj() {
        toq toqVar = this.f87940x9kr;
        if (toqVar == null || !toqVar.m26255q()) {
            return false;
        }
        miuix.overscroller.widget.toq.m26258k("checking have more work when finish");
        lrht();
        return true;
    }

    public void yz(double d2) {
        if (Math.abs(d2) <= 5000.0d) {
            this.f40760r.m26184t().f7l8(246.7f);
        } else {
            this.f40760r.m26184t().f7l8(130.5f);
        }
    }
}
