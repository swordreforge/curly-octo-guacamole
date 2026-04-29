package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class BaselineLayout extends ViewGroup {

    /* JADX INFO: renamed from: k */
    private int f24523k;

    public BaselineLayout(Context context) {
        super(context, null, 0);
        this.f24523k = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f24523k;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i4 - i2) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int baseline = (this.f24523k == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f24523k + paddingTop) - childAt.getBaseline();
                childAt.layout(i7, baseline, measuredWidth + i7, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int childCount = getChildCount();
        int iMax = -1;
        int iMax2 = -1;
        int iMax3 = 0;
        int iMax4 = 0;
        int iCombineMeasuredStates = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i2, i3);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    iMax = Math.max(iMax, baseline);
                    iMax2 = Math.max(iMax2, childAt.getMeasuredHeight() - baseline);
                }
                iMax4 = Math.max(iMax4, childAt.getMeasuredWidth());
                iMax3 = Math.max(iMax3, childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        if (iMax != -1) {
            iMax3 = Math.max(iMax3, Math.max(iMax2, getPaddingBottom()) + iMax);
            this.f24523k = iMax;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4, getSuggestedMinimumWidth()), i2, iCombineMeasuredStates), View.resolveSizeAndState(Math.max(iMax3, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates << 16));
    }

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f24523k = -1;
    }

    public BaselineLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f24523k = -1;
    }
}
