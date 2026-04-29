package com.android.thememanager.view.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.core.view.C0683f;
import androidx.core.view.fti;
import androidx.core.view.mcp;

/* JADX INFO: loaded from: classes2.dex */
public class NestedScrollWebView extends ScrollWebView implements mcp {

    /* JADX INFO: renamed from: g */
    private final int[] f17706g;

    /* JADX INFO: renamed from: h */
    private int f17707h;

    /* JADX INFO: renamed from: i */
    private int f17708i;

    /* JADX INFO: renamed from: p */
    private VelocityTracker f17709p;

    /* JADX INFO: renamed from: r */
    private final fti f17710r;

    /* JADX INFO: renamed from: s */
    private int f17711s;

    /* JADX INFO: renamed from: t */
    private int f17712t;

    /* JADX INFO: renamed from: y */
    private final int[] f17713y;

    /* JADX INFO: renamed from: z */
    private OverScroller f17714z;

    public NestedScrollWebView(Context context) {
        this(context, null);
    }

    private void toq() {
        if (this.f17709p == null) {
            this.f17709p = VelocityTracker.obtain();
        }
    }

    private void zy() {
        VelocityTracker velocityTracker = this.f17709p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f17709p = null;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
        int i2;
        int i3;
        super.computeScroll();
        if (!this.f17714z.computeScrollOffset()) {
            if (hasNestedScrollingParent(1)) {
                stopNestedScroll(1);
            }
            this.f17712t = 0;
            return;
        }
        int currY = this.f17714z.getCurrY();
        int i4 = currY - this.f17712t;
        if (i4 != 0) {
            int scrollY = getScrollY();
            if (scrollY == 0) {
                i3 = 0;
                i2 = i4;
            } else {
                int i5 = scrollY + i4;
                if (i5 < 0) {
                    i3 = -scrollY;
                    i2 = i5;
                } else {
                    i2 = 0;
                    i3 = i4;
                }
            }
            dispatchNestedScroll(0, i3, 0, i2, null, 1);
        }
        this.f17712t = currY;
        C0683f.h7am(this);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        return this.f17710r.mo3266k(velocityX, velocityY, consumed);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        return this.f17710r.toq(velocityX, velocityY);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return this.f17710r.zy(dx, dy, consumed, offsetInWindow);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return this.f17710r.mo3263g(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean hasNestedScrollingParent() {
        return this.f17710r.ld6();
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean isNestedScrollingEnabled() {
        return this.f17710r.qrj();
    }

    /* JADX INFO: renamed from: k */
    public void m10439k(int velocityY) {
        startNestedScroll(2, 1);
        this.f17714z.fling(getScrollX(), getScrollY(), 0, velocityY, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
        this.f17712t = getScrollY();
        C0683f.h7am(this);
    }

    @Override // android.webkit.WebView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        int i2;
        toq();
        MotionEvent motionEventObtain = MotionEvent.obtain(event);
        int action = event.getAction();
        if (action != 0) {
            if (action == 1) {
                VelocityTracker velocityTracker = this.f17709p;
                velocityTracker.computeCurrentVelocity(50, this.f17708i);
                int yVelocity = (int) velocityTracker.getYVelocity();
                if (Math.abs(yVelocity) > this.f17707h) {
                    m10439k(-yVelocity);
                }
            } else if (action == 2) {
                int rawY = (int) event.getRawY();
                int i3 = this.f17711s - rawY;
                if (dispatchNestedPreScroll(0, i3, this.f17706g, this.f17713y)) {
                    motionEventObtain.offsetLocation(0.0f, this.f17706g[1]);
                }
                this.f17711s = rawY;
                int scrollY = getScrollY();
                if (scrollY == 0) {
                    i2 = i3;
                } else {
                    int i4 = scrollY + i3;
                    if (i4 < 0) {
                        motionEventObtain.offsetLocation(0.0f, -i4);
                        i2 = i4;
                    } else {
                        i2 = 0;
                    }
                }
                this.f17709p.addMovement(motionEventObtain);
                dispatchNestedScroll(0, i3 - i2, 0, i2, this.f17713y);
            } else if (action == 3) {
            }
            stopNestedScroll();
            zy();
        } else {
            this.f17711s = (int) event.getRawY();
            startNestedScroll(2);
            this.f17709p.addMovement(motionEventObtain);
            this.f17714z.computeScrollOffset();
            if (!this.f17714z.isFinished()) {
                this.f17714z.abortAnimation();
            }
        }
        return super.onTouchEvent(motionEventObtain);
    }

    @Override // android.view.View, androidx.core.view.a9
    public void setNestedScrollingEnabled(boolean enabled) {
        this.f17710r.mo3264h(enabled);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean startNestedScroll(int axes) {
        return this.f17710r.ki(axes);
    }

    @Override // android.view.View, androidx.core.view.a9
    public void stopNestedScroll() {
        this.f17710r.mo3265i();
    }

    public NestedScrollWebView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    @Override // androidx.core.view.mcp
    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        return this.f17710r.mo3268q(dx, dy, consumed, offsetInWindow, type);
    }

    @Override // androidx.core.view.mcp
    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        return this.f17710r.f7l8(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type);
    }

    @Override // androidx.core.view.mcp
    public boolean hasNestedScrollingParent(int type) {
        return this.f17710r.x2(type);
    }

    @Override // androidx.core.view.mcp
    public boolean startNestedScroll(int axes, int type) {
        return this.f17710r.t8r(axes, type);
    }

    @Override // androidx.core.view.mcp
    public void stopNestedScroll(int type) {
        this.f17710r.fn3e(type);
    }

    public NestedScrollWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f17706g = new int[2];
        this.f17713y = new int[2];
        this.f17710r = new fti(this);
        setNestedScrollingEnabled(true);
        this.f17714z = new OverScroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f17707h = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f17708i = viewConfiguration.getScaledMaximumFlingVelocity();
    }
}
