package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0683f;
import ki.C6116k;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.appbar.k */
/* JADX INFO: compiled from: HeaderBehavior.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3929k<V extends View> extends zy<V> {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f67347ld6 = -1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f67348f7l8;

    /* JADX INFO: renamed from: g */
    private boolean f23865g;

    /* JADX INFO: renamed from: n */
    OverScroller f23866n;

    /* JADX INFO: renamed from: p */
    @dd
    private VelocityTracker f23867p;

    /* JADX INFO: renamed from: q */
    @dd
    private Runnable f23868q;

    /* JADX INFO: renamed from: s */
    private int f23869s;

    /* JADX INFO: renamed from: y */
    private int f23870y;

    /* JADX INFO: renamed from: com.google.android.material.appbar.k$k */
    /* JADX INFO: compiled from: HeaderBehavior.java */
    private class k implements Runnable {

        /* JADX INFO: renamed from: k */
        private final CoordinatorLayout f23871k;

        /* JADX INFO: renamed from: q */
        private final V f23873q;

        k(CoordinatorLayout coordinatorLayout, V v2) {
            this.f23871k = coordinatorLayout;
            this.f23873q = v2;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f23873q == null || (overScroller = AbstractC3929k.this.f23866n) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                AbstractC3929k.this.mo14015c(this.f23871k, this.f23873q);
                return;
            }
            AbstractC3929k abstractC3929k = AbstractC3929k.this;
            abstractC3929k.uv6(this.f23871k, this.f23873q, abstractC3929k.f23866n.getCurrY());
            C0683f.mbx(this.f23873q, this);
        }
    }

    public AbstractC3929k() {
        this.f67348f7l8 = -1;
        this.f23869s = -1;
    }

    private void ncyb() {
        if (this.f23867p == null) {
            this.f23867p = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a9(@zy.lvui androidx.coordinatorlayout.widget.CoordinatorLayout r12, @zy.lvui V r13, @zy.lvui android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = r2
            goto L1c
        L1b:
            r12 = r3
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f67348f7l8 = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f23870y = r12
            goto L4c
        L2d:
            int r0 = r11.f67348f7l8
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f23870y
            int r7 = r1 - r0
            r11.f23870y = r0
            int r8 = r11.n5r1(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.lrht(r5, r6, r7, r8, r9)
        L4c:
            r12 = r3
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f23867p
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f23867p
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f23867p
            int r4 = r11.f67348f7l8
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.hyr(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.m14049l(r6, r7, r8, r9, r10)
            r12 = r2
            goto L73
        L72:
            r12 = r3
        L73:
            r11.f23865g = r3
            r11.f67348f7l8 = r1
            android.view.VelocityTracker r13 = r11.f23867p
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f23867p = r13
        L81:
            android.view.VelocityTracker r13 = r11.f23867p
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f23865g
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = r3
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC3929k.a9(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: c */
    void mo14015c(CoordinatorLayout coordinatorLayout, V v2) {
    }

    /* JADX INFO: renamed from: f */
    int mo14017f() {
        return gvn7();
    }

    int hyr(@lvui V v2) {
        return v2.getHeight();
    }

    /* JADX INFO: renamed from: l */
    final boolean m14049l(CoordinatorLayout coordinatorLayout, @lvui V v2, int i2, int i3, float f2) {
        Runnable runnable = this.f23868q;
        if (runnable != null) {
            v2.removeCallbacks(runnable);
            this.f23868q = null;
        }
        if (this.f23866n == null) {
            this.f23866n = new OverScroller(v2.getContext());
        }
        this.f23866n.fling(0, gvn7(), 0, Math.round(f2), 0, 0, i2, i3);
        if (!this.f23866n.computeScrollOffset()) {
            mo14015c(coordinatorLayout, v2);
            return false;
        }
        k kVar = new k(coordinatorLayout, v2);
        this.f23868q = kVar;
        C0683f.mbx(v2, kVar);
        return true;
    }

    final int lrht(CoordinatorLayout coordinatorLayout, V v2, int i2, int i3, int i4) {
        return vyq(coordinatorLayout, v2, mo14017f() - i2, i3, i4);
    }

    int n5r1(@lvui V v2) {
        return -v2.getHeight();
    }

    int uv6(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        return vyq(coordinatorLayout, v2, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int vyq(CoordinatorLayout coordinatorLayout, V v2, int i2, int i3, int i4) {
        int iM22394n;
        int iGvn7 = gvn7();
        if (i3 == 0 || iGvn7 < i3 || iGvn7 > i4 || iGvn7 == (iM22394n = C6116k.m22394n(i2, i3, i4))) {
            return 0;
        }
        mo14023r(iM22394n);
        return iGvn7 - iM22394n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    public boolean x2(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f23869s < 0) {
            this.f23869s = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f23865g) {
            int i2 = this.f67348f7l8;
            if (i2 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i2)) == -1) {
                return false;
            }
            int y3 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y3 - this.f23870y) > this.f23869s) {
                this.f23870y = y3;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f67348f7l8 = -1;
            int x3 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            boolean z2 = x9kr(v2) && coordinatorLayout.jp0y(v2, x3, y4);
            this.f23865g = z2;
            if (z2) {
                this.f23870y = y4;
                this.f67348f7l8 = motionEvent.getPointerId(0);
                ncyb();
                OverScroller overScroller = this.f23866n;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f23866n.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f23867p;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    boolean x9kr(V v2) {
        return false;
    }

    public AbstractC3929k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67348f7l8 = -1;
        this.f23869s = -1;
    }
}
