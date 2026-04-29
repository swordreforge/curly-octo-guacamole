package com.android.thememanager.basemodule.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.basemodule.utils.C1819o;
import java.lang.ref.WeakReference;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class AutoScrollRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: l */
    private static final int f10468l = 400;

    /* JADX INFO: renamed from: r */
    private static final int f10469r = 1000;

    /* JADX INFO: renamed from: g */
    private int f10470g;

    /* JADX INFO: renamed from: h */
    private float f10471h;

    /* JADX INFO: renamed from: i */
    private final toq f10472i;

    /* JADX INFO: renamed from: k */
    public boolean f10473k;

    /* JADX INFO: renamed from: n */
    private final int f10474n;

    /* JADX INFO: renamed from: p */
    private double f10475p;

    /* JADX INFO: renamed from: q */
    private boolean f10476q;

    /* JADX INFO: renamed from: s */
    private int f10477s;

    /* JADX INFO: renamed from: t */
    private final LinearInterpolator f10478t;

    /* JADX INFO: renamed from: y */
    private int f10479y;

    /* JADX INFO: renamed from: z */
    private ValueAnimator f10480z;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.AutoScrollRecyclerView$k */
    class C1839k implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f10481k;

        C1839k(final int val$scrollDirection) {
            this.f10481k = val$scrollDirection;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator.getAnimatedValue() instanceof Integer) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (this.f10481k == 0) {
                    AutoScrollRecyclerView autoScrollRecyclerView = AutoScrollRecyclerView.this;
                    autoScrollRecyclerView.scrollBy(iIntValue - autoScrollRecyclerView.f10470g, 0);
                } else {
                    AutoScrollRecyclerView autoScrollRecyclerView2 = AutoScrollRecyclerView.this;
                    autoScrollRecyclerView2.scrollBy(0, iIntValue - autoScrollRecyclerView2.f10470g);
                }
                AutoScrollRecyclerView.this.f10470g = iIntValue;
            }
        }
    }

    private static class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        private final WeakReference<AutoScrollRecyclerView> f10483k;

        public toq(AutoScrollRecyclerView autoPollRecyclerView) {
            this.f10483k = new WeakReference<>(autoPollRecyclerView);
        }

        @Override // java.lang.Runnable
        public void run() {
            AutoScrollRecyclerView autoScrollRecyclerView = this.f10483k.get();
            if (autoScrollRecyclerView != null && autoScrollRecyclerView.f10476q && autoScrollRecyclerView.f10473k) {
                autoScrollRecyclerView.f7l8(autoScrollRecyclerView.f10477s, autoScrollRecyclerView.f10479y);
                autoScrollRecyclerView.removeCallbacks(this);
                autoScrollRecyclerView.postDelayed(this, 1000L);
            }
        }
    }

    public AutoScrollRecyclerView(@lvui Context context, @dd AttributeSet attrs) {
        super(context, attrs);
        this.f10470g = 0;
        this.f10477s = 10;
        this.f10475p = 1.0d;
        this.f10478t = new LinearInterpolator();
        this.f10472i = new toq(this);
        this.f10474n = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: y */
    private void m7284y() {
        if (this.f10480z != null) {
            this.f10480z = null;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        RecyclerView.AbstractC1048h layoutManager = getLayoutManager();
        return layoutManager != null && layoutManager.getLayoutDirection() == 0;
    }

    public void f7l8(int pxPerSecond, final int scrollDirection) {
        this.f10470g = 0;
        if (this.f10480z == null) {
            if (C1819o.x9kr()) {
                pxPerSecond = -pxPerSecond;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, pxPerSecond);
            this.f10480z = valueAnimatorOfInt;
            valueAnimatorOfInt.setInterpolator(this.f10478t);
            this.f10480z.setDuration(1000L);
            this.f10480z.addUpdateListener(new C1839k(scrollDirection));
        }
        this.f10480z.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int velocityX, int velocityY) {
        return super.fling((int) (((double) velocityX) * this.f10475p), velocityY);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7285p();
        m7284y();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r3) {
        /*
            r2 = this;
            int r0 = r3.getAction()
            if (r0 == 0) goto L2d
            r1 = 1
            if (r0 == r1) goto L29
            r1 = 2
            if (r0 == r1) goto L13
            r1 = 3
            if (r0 == r1) goto L29
            r1 = 4
            if (r0 == r1) goto L29
            goto L3a
        L13:
            float r0 = r3.getX()
            float r1 = r2.f10471h
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r1 = r2.f10474n
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3a
            r2.m7286s()
            goto L3a
        L29:
            r2.m7286s()
            goto L3a
        L2d:
            float r0 = r3.getX()
            r2.f10471h = r0
            boolean r0 = r2.f10473k
            if (r0 == 0) goto L3a
            r2.m7285p()
        L3a:
            boolean r3 = super.onInterceptTouchEvent(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.basemodule.views.AutoScrollRecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent e2) {
        int action = e2.getAction();
        if (action == 1 || action == 3 || action == 4) {
            m7286s();
        }
        return super.onTouchEvent(e2);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        if (visibility == 0) {
            m7286s();
        } else if (visibility == 8) {
            m7285p();
            m7284y();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m7285p() {
        if (this.f10473k) {
            if (this.f10476q) {
                this.f10473k = false;
            }
            ValueAnimator valueAnimator = this.f10480z;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f10480z.cancel();
            }
            removeCallbacks(this.f10472i);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m7286s() {
        if (!this.f10476q || this.f10473k) {
            return;
        }
        this.f10473k = true;
        postDelayed(this.f10472i, 400L);
    }

    public void setFlingScale(double scale) {
        this.f10475p = scale;
    }

    public void setOpenAutoScroll(boolean openAutoScroll) {
        this.f10476q = openAutoScroll;
    }

    public void setScrollDirection(int scrollDirection) {
        this.f10479y = scrollDirection;
    }

    public void setScrollSpeed(int pxPerSecond) {
        this.f10477s = pxPerSecond;
        ValueAnimator valueAnimator = this.f10480z;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                this.f10480z.cancel();
            }
            this.f10480z = null;
        }
    }
}
