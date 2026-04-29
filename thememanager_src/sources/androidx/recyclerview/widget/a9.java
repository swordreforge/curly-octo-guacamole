package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import androidx.core.view.C0683f;
import androidx.core.view.C0720t;
import androidx.recyclerview.widget.RecyclerView;
import i3x9.toq;
import miuix.animation.utils.VelocityMonitor;

/* JADX INFO: compiled from: RemixRecyclerView.java */
/* JADX INFO: loaded from: classes.dex */
abstract class a9 extends RecyclerView {

    /* JADX INFO: renamed from: p */
    private static final int f5805p = 5;

    /* JADX INFO: renamed from: s */
    private static final int f5806s = -1;

    /* JADX INFO: renamed from: g */
    private boolean f5807g;

    /* JADX INFO: renamed from: k */
    private final VelocityMonitor[] f5808k;

    /* JADX INFO: renamed from: n */
    private boolean f5809n;

    /* JADX INFO: renamed from: q */
    private int f5810q;

    /* JADX INFO: renamed from: y */
    private long f5811y;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a9$k */
    /* JADX INFO: compiled from: RemixRecyclerView.java */
    class C1069k extends RecyclerView.a9 {

        /* JADX INFO: renamed from: c */
        int f5812c;

        /* JADX INFO: renamed from: e */
        int f5813e;

        /* JADX INFO: renamed from: f */
        private boolean f5814f;

        /* JADX INFO: renamed from: h */
        private int f5815h;

        /* JADX INFO: renamed from: i */
        private int f5816i;

        /* JADX INFO: renamed from: j */
        boolean f5817j;

        /* JADX INFO: renamed from: l */
        private boolean f5818l;

        /* JADX INFO: renamed from: o */
        private miuix.util.toq f5820o;

        /* JADX INFO: renamed from: r */
        private boolean f5821r;

        /* JADX INFO: renamed from: t */
        Interpolator f5822t;

        /* JADX INFO: renamed from: z */
        miuix.overscroller.widget.zy f5823z;

        C1069k() {
            super();
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f5822t = interpolator;
            this.f5821r = false;
            this.f5818l = false;
            this.f5812c = 0;
            this.f5813e = 0;
            this.f5817j = false;
            this.f5823z = new miuix.overscroller.widget.zy(a9.this.getContext(), interpolator);
        }

        private int f7l8(int i2, int i3, int i4, int i5) {
            int iRound;
            int iAbs = Math.abs(i2);
            int iAbs2 = Math.abs(i3);
            boolean z2 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt((i4 * i4) + (i5 * i5));
            int iSqrt2 = (int) Math.sqrt((i2 * i2) + (i3 * i3));
            a9 a9Var = a9.this;
            int width = z2 ? a9Var.getWidth() : a9Var.getHeight();
            int i6 = width / 2;
            float f2 = width;
            float f3 = i6;
            float fM4935y = f3 + (m4935y(Math.min(1.0f, (iSqrt2 * 1.0f) / f2)) * f3);
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fM4935y / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z2) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f2) + 1.0f) * 300.0f);
            }
            return Math.min(iRound, 2000);
        }

        /* JADX INFO: renamed from: p */
        private float m4933p(int i2) {
            if (a9.this.f5810q == -1) {
                return 0.0f;
            }
            int i3 = a9.this.f5810q % 5;
            a9.this.f7l8(i3);
            return a9.this.f5808k[i3].getVelocity(i2);
        }

        /* JADX INFO: renamed from: s */
        private miuix.util.toq m4934s() {
            if (this.f5820o == null) {
                this.f5820o = new miuix.util.toq(a9.this.getContext());
            }
            return this.f5820o;
        }

        /* JADX INFO: renamed from: y */
        private float m4935y(float f2) {
            return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
        }

        private void zy() {
            a9.this.removeCallbacks(this);
            C0683f.mbx(a9.this, this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a9
        /* JADX INFO: renamed from: g */
        public void mo4781g() {
            a9.this.removeCallbacks(this);
            this.f5823z.m26263k();
        }

        void ld6() {
            this.f5816i = 0;
            this.f5815h = 0;
            this.f5823z.ni7();
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
        @Override // androidx.recyclerview.widget.RecyclerView.a9
        /* JADX INFO: renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo4782n(int r9, int r10, int r11, @zy.dd android.view.animation.Interpolator r12) {
            /*
                r8 = this;
                androidx.recyclerview.widget.a9 r0 = androidx.recyclerview.widget.a9.this
                boolean r0 = r0.mo4880y()
                if (r0 == 0) goto L9
                return
            L9:
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = 0
                if (r11 != r0) goto L11
                r8.f7l8(r9, r10, r1, r1)
            L11:
                if (r12 != 0) goto L15
                android.view.animation.Interpolator r12 = androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator
            L15:
                miuix.overscroller.widget.zy r11 = r8.f5823z
                int r11 = r11.kja0()
                r0 = 2
                if (r11 != r0) goto L34
                boolean r11 = r8.f5817j
                if (r11 != 0) goto L34
                miuix.overscroller.widget.zy r11 = r8.f5823z
                float r11 = r11.m26267s()
                int r11 = (int) r11
                r8.f5813e = r11
                miuix.overscroller.widget.zy r11 = r8.f5823z
                float r11 = r11.m26269y()
                int r11 = (int) r11
                r8.f5812c = r11
            L34:
                androidx.recyclerview.widget.a9 r11 = androidx.recyclerview.widget.a9.this
                androidx.recyclerview.widget.RecyclerView$h r11 = r11.mLayout
                androidx.recyclerview.widget.RecyclerView$t r11 = r11.mSmoothScroller
                boolean r2 = r11 instanceof androidx.recyclerview.widget.t8r
                if (r2 == 0) goto L5a
                r2 = 1067030938(0x3f99999a, float:1.2)
                r3 = r11
                androidx.recyclerview.widget.t8r r3 = (androidx.recyclerview.widget.t8r) r3
                int r3 = r3.f52309kja0
                float r3 = (float) r3
                float r3 = r3 * r2
                androidx.recyclerview.widget.t8r r11 = (androidx.recyclerview.widget.t8r) r11
                int r11 = r11.f6103h
                float r11 = (float) r11
                float r11 = r11 * r2
                float r2 = (float) r9
                int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r2 != 0) goto L5a
                float r2 = (float) r10
                int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r11 != 0) goto L5a
                r11 = 1
                goto L5b
            L5a:
                r11 = r1
            L5b:
                r8.f5817j = r11
                android.view.animation.Interpolator r11 = r8.f5822t
                if (r11 == r12) goto L70
                r8.f5822t = r12
                miuix.overscroller.widget.zy r11 = new miuix.overscroller.widget.zy
                androidx.recyclerview.widget.a9 r2 = androidx.recyclerview.widget.a9.this
                android.content.Context r2 = r2.getContext()
                r11.<init>(r2, r12)
                r8.f5823z = r11
            L70:
                r8.f5816i = r1
                r8.f5815h = r1
                androidx.recyclerview.widget.a9 r11 = androidx.recyclerview.widget.a9.this
                r11.setScrollState(r0)
                miuix.overscroller.widget.zy r1 = r8.f5823z
                r2 = 0
                r3 = 0
                int r6 = r8.f5812c
                int r7 = r8.f5813e
                r4 = r9
                r5 = r10
                r1.jp0y(r2, r3, r4, r5, r6, r7)
                r8.mo4783q()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a9.C1069k.mo4782n(int, int, int, android.view.animation.Interpolator):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a9
        /* JADX INFO: renamed from: q */
        void mo4783q() {
            if (this.f5821r) {
                this.f5818l = true;
            } else {
                zy();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:119:0x020f  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0219  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x0224  */
        @Override // androidx.recyclerview.widget.RecyclerView.a9, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 610
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a9.C1069k.run():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v15 */
        /* JADX WARN: Type inference failed for: r13v16 */
        /* JADX WARN: Type inference failed for: r13v5 */
        @Override // androidx.recyclerview.widget.RecyclerView.a9
        public void toq(int i2, int i3) {
            a9.this.setScrollState(2);
            this.f5816i = 0;
            this.f5815h = 0;
            Interpolator interpolator = this.f5822t;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f5822t = interpolator2;
                this.f5823z = new miuix.overscroller.widget.zy(a9.this.getContext(), interpolator2);
            }
            if (i2 != 0) {
                i2 = -((int) m4933p(0));
            }
            int i4 = i2;
            if (i3 != 0) {
                i3 = -((int) m4933p(1));
            }
            int i5 = i3;
            boolean zCanScrollHorizontally = a9.this.mLayout.canScrollHorizontally();
            ?? r13 = zCanScrollHorizontally;
            if (a9.this.mLayout.canScrollVertically()) {
                r13 = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            if (r13 == 2) {
                this.f5814f = true ^ a9.this.canScrollVertically(i5 > 0 ? 1 : -1);
            } else if (r13 == 1) {
                this.f5814f = true ^ a9.this.canScrollHorizontally(i4 > 0 ? 1 : -1);
            }
            this.f5823z.m26266q(0, 0, i4, i5, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo4783q();
        }
    }

    public a9(@zy.lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f7l8(int i2) {
        VelocityMonitor[] velocityMonitorArr = this.f5808k;
        if (velocityMonitorArr[i2] == null) {
            velocityMonitorArr[i2] = new VelocityMonitor();
        }
    }

    private void ld6(MotionEvent motionEvent, int i2) {
        int pointerId = motionEvent.getPointerId(i2) % 5;
        f7l8(pointerId);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f5808k[pointerId].update(motionEvent.getRawX(i2), motionEvent.getRawY(i2));
        } else {
            this.f5808k[pointerId].update(motionEvent.getRawX(), motionEvent.getRawY());
        }
    }

    /* JADX INFO: renamed from: p */
    private void m4930p(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.f5810q = motionEvent.getPointerId(0);
            m4932s(motionEvent, actionIndex);
            ld6(motionEvent, actionIndex);
            return;
        }
        if (actionMasked != 1 && actionMasked != 2) {
            if (actionMasked == 5) {
                this.f5810q = motionEvent.getPointerId(actionIndex);
                m4932s(motionEvent, actionIndex);
                ld6(motionEvent, actionIndex);
                return;
            } else if (actionMasked != 6) {
                return;
            }
        }
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            ld6(motionEvent, i2);
        }
    }

    /* JADX INFO: renamed from: s */
    private void m4932s(MotionEvent motionEvent, int i2) {
        int pointerId = motionEvent.getPointerId(i2) % 5;
        f7l8(pointerId);
        this.f5808k[pointerId].clear();
    }

    public boolean getSpringEnabled() {
        return this.f5809n && (!this.f5807g || (((System.currentTimeMillis() - this.f5811y) > 10L ? 1 : ((System.currentTimeMillis() - this.f5811y) == 10L ? 0 : -1)) > 0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean zX2 = C0720t.x2(motionEvent, 8194);
        this.f5807g = zX2;
        if (zX2) {
            this.f5811y = System.currentTimeMillis();
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m4930p(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zX2 = C0720t.x2(motionEvent, 8194);
        this.f5807g = zX2;
        if (zX2) {
            this.f5811y = System.currentTimeMillis();
        }
        m4930p(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOverScrollMode(int i2) {
        super.setOverScrollMode(i2);
        if (i2 == 2) {
            this.f5809n = false;
        }
    }

    public void setSpringEnabled(boolean z2) {
        this.f5809n = z2;
    }

    /* JADX INFO: renamed from: y */
    protected boolean mo4880y() {
        return false;
    }

    public a9(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, toq.C6088k.f78537eqxt);
    }

    public a9(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f5808k = new VelocityMonitor[5];
        this.f5810q = -1;
        this.f5809n = true;
        this.f5807g = false;
        this.f5811y = 0L;
    }
}
