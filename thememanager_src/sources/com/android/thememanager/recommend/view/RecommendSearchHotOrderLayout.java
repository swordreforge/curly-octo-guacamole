package com.android.thememanager.recommend.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RecommendSearchHotOrderLayout extends ViewGroup {

    /* JADX INFO: renamed from: k */
    private C2357g f13610k;

    /* JADX INFO: renamed from: q */
    protected int f13611q;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.RecommendSearchHotOrderLayout$k */
    protected static class C2347k extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: k */
        int f13612k;

        /* JADX INFO: renamed from: q */
        int f13613q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f60646toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f60647zy;

        public C2347k() {
            super(-1, -1);
        }

        /* JADX INFO: renamed from: k */
        public static C2347k m8532k(int left, int top, int right, int bottom) {
            C2347k c2347k = new C2347k();
            c2347k.f13612k = left;
            c2347k.f60646toq = top;
            c2347k.f60647zy = right;
            c2347k.f13613q = bottom;
            return c2347k;
        }

        public C2347k(Context c2, AttributeSet attrs) {
            super(c2, attrs);
        }
    }

    public RecommendSearchHotOrderLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: k */
    private int m8531k(int width, int startX, int childWidth) {
        return getLayoutDirection() == 1 ? (width - startX) - childWidth : startX;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            C2347k c2347k = (C2347k) childAt.getLayoutParams();
            childAt.layout(getPaddingLeft() + c2347k.f13612k, getPaddingTop() + c2347k.f60646toq, getPaddingLeft() + c2347k.f60647zy, getPaddingTop() + c2347k.f13613q);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthSpec, int heightSpec) {
        int size = (View.MeasureSpec.getMode(heightSpec) == 1073741824 || View.MeasureSpec.getMode(heightSpec) == Integer.MIN_VALUE) ? (View.MeasureSpec.getSize(heightSpec) - getPaddingTop()) + getPaddingBottom() : -1;
        int size2 = (View.MeasureSpec.getSize(widthSpec) - getPaddingLeft()) - getPaddingRight();
        measureChildren(0, 0);
        int iMax = 0;
        int i2 = 0;
        int i3 = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            int iMin = Math.min(childAt.getMeasuredWidth(), size2);
            int measuredHeight = childAt.getMeasuredHeight();
            if (i2 + iMin <= size2) {
                int i5 = i3 + measuredHeight;
                iMax = Math.max(iMax, i5);
                int iM8531k = m8531k(size2, i2, iMin);
                childAt.setLayoutParams(C2347k.m8532k(iM8531k, i3, iM8531k + iMin, i5));
                i2 += iMin + this.f13611q;
                iMax2 = Math.max(iMax2, measuredHeight);
            } else if (size == -1 || i3 + iMax2 + measuredHeight + this.f13611q <= size) {
                i3 += iMax2 + this.f13611q;
                i2 = 0;
                iMax2 = 0;
                int i52 = i3 + measuredHeight;
                iMax = Math.max(iMax, i52);
                int iM8531k2 = m8531k(size2, i2, iMin);
                childAt.setLayoutParams(C2347k.m8532k(iM8531k2, i3, iM8531k2 + iMin, i52));
                i2 += iMin + this.f13611q;
                iMax2 = Math.max(iMax2, measuredHeight);
            } else {
                childAt.setLayoutParams(C2347k.m8532k(0, 0, 0, 0));
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(widthSpec), iMax + getPaddingTop() + getPaddingBottom());
    }

    public void setGap(int gap) {
        this.f13611q = gap;
    }

    public void setRecommendItemFactory(C2357g recommendSearchHotView) {
        this.f13610k = recommendSearchHotView;
    }

    public void toq(List<String> titleList) {
        if (titleList == null || titleList.isEmpty() || this.f13610k == null) {
            return;
        }
        removeAllViews();
        Iterator<String> it = titleList.iterator();
        while (it.hasNext()) {
            View viewM8534k = this.f13610k.m8534k(it.next());
            if (viewM8534k != null) {
                addView(viewM8534k);
            }
        }
    }

    public RecommendSearchHotOrderLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RecommendSearchHotOrderLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
