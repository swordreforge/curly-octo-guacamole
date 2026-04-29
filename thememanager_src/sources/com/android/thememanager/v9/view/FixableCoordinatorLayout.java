package com.android.thememanager.v9.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.n5r1;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.v9.view.AbstractC2876k;
import com.google.android.material.appbar.AppBarLayout;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class FixableCoordinatorLayout extends CoordinatorLayout {
    private static final int ad = 800;

    @dd
    private RecyclerView ac;
    private VelocityTracker an;
    private int as;
    private boolean ax;
    private float az;
    private float ba;
    private int bg;
    private int bl;
    private boolean bq;
    private AppBarLayout id;
    private AbstractC2876k.k in;

    /* JADX INFO: renamed from: com.android.thememanager.v9.view.FixableCoordinatorLayout$k */
    class C2874k extends AbstractC2876k {
        C2874k() {
        }

        @Override // com.android.thememanager.v9.view.AbstractC2876k
        public void toq() {
            FixableCoordinatorLayout.this.in = AbstractC2876k.k.COLLAPSED;
        }

        @Override // com.android.thememanager.v9.view.AbstractC2876k
        public void zy() {
            FixableCoordinatorLayout.this.in = AbstractC2876k.k.EXPANDED;
        }
    }

    public FixableCoordinatorLayout(Context context) {
        this(context, null);
    }

    private void getView() {
        this.ac = (RecyclerView) findViewById(R.id.recyclerView);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) childAt;
                this.id = appBarLayout;
                appBarLayout.m14003n(new C2874k());
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private int m10208m(float dx, float dy) {
        return Math.abs(dx) > Math.abs(dy) ? dx > 0.0f ? 114 : 108 : dy > 0.0f ? 98 : 116;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getView();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent event) {
        if (this.ax) {
            return true;
        }
        return super.onInterceptHoverEvent(event);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (this.an == null) {
            this.an = VelocityTracker.obtain();
        }
        this.an.addMovement(ev);
        if (ev.getAction() == 0) {
            this.az = ev.getX();
            this.ba = ev.getY();
            this.an.clear();
            this.bq = false;
        } else if (ev.getAction() == 2) {
            float x3 = ev.getX() - this.az;
            float y3 = ev.getY() - this.ba;
            if (Math.abs(x3) > 8.0f || Math.abs(y3) > 8.0f) {
                int iM10208m = m10208m(x3, y3);
                if (iM10208m != 98) {
                    if (iM10208m != 108 && iM10208m != 114) {
                        if (iM10208m == 116) {
                            if (!this.ax && Math.abs(y3) > this.bl && this.in == AbstractC2876k.k.EXPANDED) {
                                this.id.setExpanded(false, true);
                                this.bq = true;
                                return true;
                            }
                        }
                    }
                    return false;
                }
                RecyclerView recyclerView = this.ac;
                if (recyclerView != null && recyclerView.canScrollVertically(-1)) {
                    return super.onInterceptTouchEvent(ev);
                }
                if (this.ax || Math.abs(y3) <= this.bl || y3 <= 0.0f) {
                    return false;
                }
                this.id.setExpanded(true, true);
                this.bq = true;
                return true;
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        if (this.in == AbstractC2876k.k.COLLAPSED) {
            return super.onNestedPreFling(target, velocityX, velocityY);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
        if (this.ax) {
            return false;
        }
        return super.onStartNestedScroll(child, target, nestedScrollAxes);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        char cM10208m;
        if (this.ax || this.bq) {
            return true;
        }
        if (this.an == null) {
            this.an = VelocityTracker.obtain();
        }
        this.an.addMovement(ev);
        if (ev.getAction() == 0) {
            this.an.clear();
        } else if (ev.getAction() == 3 || ev.getAction() == 1) {
            this.an.computeCurrentVelocity(1000, this.as);
            int qVar = (int) n5r1.toq(this.an, 0);
            this.an.clear();
            float x3 = ev.getX() - this.az;
            float y3 = ev.getY() - this.ba;
            if (Math.abs(x3) > 8.0f && Math.abs(y3) > 8.0f && (((cM10208m = (char) m10208m(x3, y3)) == 'b' || cM10208m == 't') && (Math.abs(y3) > this.bl || qVar > this.bg))) {
                if (y3 > 0.0f) {
                    this.id.setExpanded(true, true);
                } else {
                    this.id.setExpanded(false, true);
                }
                return false;
            }
        }
        return super.onTouchEvent(ev);
    }

    public void setFixable(boolean fixable) {
        this.ax = fixable;
    }

    public FixableCoordinatorLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FixableCoordinatorLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.in = AbstractC2876k.k.EXPANDED;
        this.ax = false;
        this.bq = false;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.bl = (int) (80.0f * f2);
        this.bg = (int) (f2 * 800.0f);
        this.as = viewConfiguration.getScaledMaximumFlingVelocity();
    }
}
