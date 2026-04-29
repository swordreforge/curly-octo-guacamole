package com.android.thememanager.basemodule.guideview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class AutoLineFeed extends LinearLayout {

    /* JADX INFO: renamed from: g */
    private int f9890g;

    /* JADX INFO: renamed from: k */
    private int f9891k;

    /* JADX INFO: renamed from: n */
    private int f9892n;

    /* JADX INFO: renamed from: q */
    private int f9893q;

    /* JADX INFO: renamed from: s */
    private final int f9894s;

    /* JADX INFO: renamed from: y */
    private HashMap<View, toq> f9895y;

    private class toq {

        /* JADX INFO: renamed from: k */
        int f9896k;

        /* JADX INFO: renamed from: q */
        int f9898q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f57512toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f57513zy;

        private toq() {
        }
    }

    public AutoLineFeed(Context context) {
        super(context);
        this.f9895y = new HashMap<>();
        this.f9894s = 55;
    }

    /* JADX INFO: renamed from: k */
    private int m6730k(int childWidth, LinearLayout.LayoutParams layoutParams) {
        if (childWidth != 0) {
            return layoutParams.getMarginEnd();
        }
        return 0;
    }

    private int toq(int childWidth, LinearLayout.LayoutParams layoutParams) {
        if (childWidth != 0) {
            return layoutParams.getMarginStart();
        }
        return 0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            toq toqVar = this.f9895y.get(childAt);
            if (toqVar != null) {
                childAt.layout(toqVar.f9896k, toqVar.f57512toq, toqVar.f57513zy, toqVar.f9898q);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int childCount = getChildCount();
        this.f9891k = 0;
        this.f9893q = 0;
        this.f9892n = 0;
        this.f9890g = 0;
        measureChildren(widthMeasureSpec, heightMeasureSpec);
        int i2 = 0;
        int iM6730k = 0;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            toq toqVar = new toq();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingLeft = iM6730k + (i2 == 0 ? getPaddingLeft() : 0) + toq(measuredWidth, layoutParams);
            this.f9891k = paddingLeft;
            iM6730k = paddingLeft + measuredWidth + m6730k(measuredWidth, layoutParams);
            this.f9893q = iM6730k;
            if (iM6730k >= size) {
                int paddingLeft2 = getPaddingLeft() + toq(measuredWidth, layoutParams);
                this.f9891k = paddingLeft2;
                iM6730k = paddingLeft2 + measuredWidth + m6730k(measuredWidth, layoutParams) + 0;
                this.f9893q = iM6730k;
                this.f9892n += measuredHeight + 55;
            }
            int i3 = this.f9892n;
            int i4 = measuredHeight + i3;
            this.f9890g = i4;
            toqVar.f9896k = this.f9891k;
            toqVar.f57512toq = i3;
            toqVar.f57513zy = this.f9893q;
            toqVar.f9898q = i4;
            this.f9895y.put(childAt, toqVar);
            i2++;
        }
        setMeasuredDimension(size, this.f9890g + getPaddingBottom());
    }

    public AutoLineFeed(Context context, int horizontalSpacing, int verticalSpacing) {
        super(context);
        this.f9895y = new HashMap<>();
        this.f9894s = 55;
    }

    public AutoLineFeed(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f9895y = new HashMap<>();
        this.f9894s = 55;
    }
}
