package com.android.thememanager.recommend.view.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import zy.dd;
import zy.lvui;
import zy.zurt;

/* JADX INFO: loaded from: classes2.dex */
public class ReboundRecyclerViewContainer extends FrameLayout {

    /* JADX INFO: renamed from: c */
    private static final int f14542c = 7;

    /* JADX INFO: renamed from: f */
    private static final int f14543f = 60;

    /* JADX INFO: renamed from: l */
    private static final int f14544l = 500;

    /* JADX INFO: renamed from: r */
    private static final float f14545r = 0.55f;

    /* JADX INFO: renamed from: g */
    private ValueAnimator f14546g;

    /* JADX INFO: renamed from: h */
    private int f14547h;

    /* JADX INFO: renamed from: i */
    private float f14548i;

    /* JADX INFO: renamed from: k */
    private OverScroller f14549k;

    /* JADX INFO: renamed from: n */
    private RecyclerView f14550n;

    /* JADX INFO: renamed from: p */
    private int f14551p;

    /* JADX INFO: renamed from: q */
    private VelocityTracker f14552q;

    /* JADX INFO: renamed from: s */
    private int f14553s;

    /* JADX INFO: renamed from: t */
    private boolean f14554t;

    /* JADX INFO: renamed from: y */
    private Interpolator f14555y;

    /* JADX INFO: renamed from: z */
    private float f14556z;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.widget.ReboundRecyclerViewContainer$k */
    class C2459k extends RecyclerView.fn3e {
        C2459k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrollStateChanged(@lvui RecyclerView recyclerView, int newState) {
            if (newState == 0 && !recyclerView.canScrollHorizontally(-1)) {
                ReboundRecyclerViewContainer.this.f14549k.fling(ReboundRecyclerViewContainer.this.getScrollX(), ReboundRecyclerViewContainer.this.getScrollY(), (-ReboundRecyclerViewContainer.this.getXVelocity()) / 7, 0, 0, 0, 0, 0, 60, 0);
                ReboundRecyclerViewContainer.this.invalidate();
                ReboundRecyclerViewContainer.this.f7l8();
            } else if (newState == 0 && !recyclerView.canScrollHorizontally(1)) {
                ReboundRecyclerViewContainer.this.f14549k.fling(ReboundRecyclerViewContainer.this.getScrollX(), ReboundRecyclerViewContainer.this.getScrollY(), (-ReboundRecyclerViewContainer.this.getXVelocity()) / 7, 0, 0, 0, 0, 0, 60, 0);
                ReboundRecyclerViewContainer.this.invalidate();
                ReboundRecyclerViewContainer.this.f7l8();
            }
            super.onScrollStateChanged(recyclerView, newState);
        }
    }

    class toq implements ValueAnimator.AnimatorUpdateListener {
        toq() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            ReboundRecyclerViewContainer.this.scrollTo((int) ((Float) animation.getAnimatedValue()).floatValue(), 0);
        }
    }

    public ReboundRecyclerViewContainer(@lvui Context context) {
        super(context);
        this.f14548i = f14545r;
        m8837q(context, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f7l8() {
        VelocityTracker velocityTracker = this.f14552q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f14552q = null;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m8833g() {
        if (getScrollX() == 0) {
            return;
        }
        ValueAnimator valueAnimator = this.f14546g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getScrollX(), 0.0f);
        this.f14546g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(this.f14555y);
        this.f14546g.addUpdateListener(new toq());
        this.f14546g.setDuration(500L);
        this.f14546g.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getXVelocity() {
        VelocityTracker velocityTracker = this.f14552q;
        if (velocityTracker == null) {
            return 0;
        }
        velocityTracker.computeCurrentVelocity(600, this.f14551p);
        return (int) this.f14552q.getXVelocity();
    }

    /* JADX INFO: renamed from: n */
    private void m8835n(int deltaX) {
        int iComputeHorizontalScrollOffset = this.f14550n.computeHorizontalScrollOffset();
        int iComputeHorizontalScrollRange = (this.f14550n.computeHorizontalScrollRange() - iComputeHorizontalScrollOffset) - this.f14550n.getMeasuredWidth();
        int i2 = -getScrollX();
        if (deltaX < 0) {
            if (i2 < 0) {
                int iMax = Math.max(deltaX, i2);
                scrollBy((int) (iMax * this.f14548i), 0);
                deltaX -= iMax;
                if (deltaX >= 0) {
                    return;
                }
            }
            int iMax2 = Math.max(deltaX, -iComputeHorizontalScrollOffset);
            this.f14550n.scrollBy(iMax2, 0);
            int i3 = deltaX - iMax2;
            if (i3 >= 0) {
                return;
            }
            scrollBy((int) (i3 * this.f14548i), 0);
            return;
        }
        if (deltaX > 0) {
            if (i2 > 0) {
                int iMin = Math.min(deltaX, i2);
                scrollBy((int) (iMin * this.f14548i), 0);
                deltaX -= iMin;
                if (deltaX <= 0) {
                    return;
                }
            }
            int iMin2 = Math.min(deltaX, iComputeHorizontalScrollRange);
            this.f14550n.scrollBy(iMin2, 0);
            int i4 = deltaX - iMin2;
            if (i4 <= 0) {
                return;
            }
            scrollBy((int) (i4 * this.f14548i), 0);
        }
    }

    /* JADX INFO: renamed from: y */
    private void m8836y(MotionEvent event) {
        if (this.f14552q == null) {
            this.f14552q = VelocityTracker.obtain();
        }
        this.f14552q.addMovement(event);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f14549k.computeScrollOffset()) {
            scrollTo(this.f14549k.getCurrX(), this.f14549k.getCurrY());
            invalidate();
        }
    }

    public RecyclerView getRecyclerView() {
        return this.f14550n;
    }

    public float getScrollRatio() {
        return this.f14548i;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        RecyclerView recyclerView = (RecyclerView) getChildAt(0);
        this.f14550n = recyclerView;
        recyclerView.addOnScrollListener(new C2459k());
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        if (action == 0) {
            if (!this.f14554t) {
                this.f14554t = true;
            }
            if (!this.f14549k.isFinished()) {
                this.f14549k.forceFinished(true);
            }
            this.f14550n.stopScroll();
            this.f14556z = ev.getX();
        } else if (action == 1) {
            this.f14554t = false;
        } else if (action == 2) {
            if (Math.abs(this.f14556z - ev.getX()) >= this.f14547h) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r4.m8836y(r5)
            int r0 = r5.getAction()
            r1 = 1
            if (r0 == 0) goto L6e
            if (r0 == r1) goto L21
            r2 = 2
            if (r0 == r2) goto L13
            r5 = 3
            if (r0 == r5) goto L21
            goto L74
        L13:
            float r5 = r5.getX()
            float r0 = r4.f14556z
            float r0 = r0 - r5
            int r0 = (int) r0
            r4.f14556z = r5
            r4.m8835n(r0)
            goto L74
        L21:
            int r5 = r4.getXVelocity()
            int r0 = java.lang.Math.abs(r5)
            int r2 = r4.f14553s
            if (r0 <= r2) goto L6a
            androidx.recyclerview.widget.RecyclerView r0 = r4.f14550n
            int r0 = r0.computeHorizontalScrollOffset()
            androidx.recyclerview.widget.RecyclerView r2 = r4.f14550n
            int r2 = r2.computeHorizontalScrollRange()
            int r2 = r2 - r0
            androidx.recyclerview.widget.RecyclerView r3 = r4.f14550n
            int r3 = r3.getMeasuredWidth()
            int r2 = r2 - r3
            if (r5 <= 0) goto L45
            if (r0 > 0) goto L49
        L45:
            if (r5 >= 0) goto L6a
            if (r2 <= 0) goto L6a
        L49:
            int r0 = r4.getScrollX()
            r2 = 0
            if (r0 == 0) goto L53
            r4.scrollTo(r2, r2)
        L53:
            int r0 = java.lang.Math.abs(r5)
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r0 >= r3) goto L64
            androidx.recyclerview.widget.RecyclerView r0 = r4.f14550n
            int r5 = -r5
            int r5 = r5 * 5
            r0.fling(r5, r2)
            goto L6a
        L64:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f14550n
            int r5 = -r5
            r0.fling(r5, r2)
        L6a:
            r4.m8833g()
            goto L74
        L6e:
            float r5 = r5.getX()
            r4.f14556z = r5
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.recommend.view.widget.ReboundRecyclerViewContainer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: q */
    public void m8837q(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        this.f14549k = new OverScroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f14553s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f14551p = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f14547h = viewConfiguration.getScaledTouchSlop();
        this.f14555y = new PathInterpolator(0.2f, 0.2f, 0.6f, 1.0f);
    }

    public void setScrollRatio(@zurt(from = 0.0d) float scrollRatio) {
        this.f14548i = scrollRatio;
    }

    public ReboundRecyclerViewContainer(@lvui Context context, @dd AttributeSet attrs) {
        super(context, attrs);
        this.f14548i = f14545r;
        m8837q(context, attrs, 0);
    }

    public ReboundRecyclerViewContainer(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f14548i = f14545r;
        m8837q(context, attrs, defStyleAttr);
    }
}
