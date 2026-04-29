package com.android.thememanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.model.RecommendItem;
import i1.C6077k;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RecommendItemOrderLayout extends ViewGroup {

    /* JADX INFO: renamed from: k */
    private a9 f17392k;

    /* JADX INFO: renamed from: q */
    protected int f17393q;

    /* JADX INFO: renamed from: com.android.thememanager.view.RecommendItemOrderLayout$k */
    protected static class C2895k extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: k */
        int f17394k;

        /* JADX INFO: renamed from: q */
        int f17395q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f61498toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f61499zy;

        public C2895k() {
            super(-1, -1);
        }

        /* JADX INFO: renamed from: k */
        public static C2895k m10287k(int left, int top, int right, int bottom) {
            C2895k c2895k = new C2895k();
            c2895k.f17394k = left;
            c2895k.f61498toq = top;
            c2895k.f61499zy = right;
            c2895k.f17395q = bottom;
            return c2895k;
        }

        public C2895k(Context c2, AttributeSet attrs) {
            super(c2, attrs);
        }
    }

    public RecommendItemOrderLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: k */
    private int m10286k(int width, int startX, int childWidth) {
        return getLayoutDirection() == 1 ? (width - startX) - childWidth : startX;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            C2895k c2895k = (C2895k) childAt.getLayoutParams();
            childAt.layout(getPaddingLeft() + c2895k.f17394k, getPaddingTop() + c2895k.f61498toq, getPaddingLeft() + c2895k.f61499zy, getPaddingTop() + c2895k.f17395q);
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
                int iM10286k = m10286k(size2, i2, iMin);
                childAt.setLayoutParams(C2895k.m10287k(iM10286k, i3, iM10286k + iMin, i5));
                i2 += iMin + this.f17393q;
                iMax2 = Math.max(iMax2, measuredHeight);
            } else if (size == -1 || i3 + iMax2 + measuredHeight + this.f17393q <= size) {
                i3 += iMax2 + this.f17393q;
                i2 = 0;
                iMax2 = 0;
                int i52 = i3 + measuredHeight;
                iMax = Math.max(iMax, i52);
                int iM10286k2 = m10286k(size2, i2, iMin);
                childAt.setLayoutParams(C2895k.m10287k(iM10286k2, i3, iM10286k2 + iMin, i52));
                i2 += iMin + this.f17393q;
                iMax2 = Math.max(iMax2, measuredHeight);
            } else {
                childAt.setLayoutParams(C2895k.m10287k(0, 0, 0, 0));
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(widthSpec), iMax + getPaddingTop() + getPaddingBottom());
    }

    public void setGap(int gap) {
        this.f17393q = gap;
    }

    public void setRecommendItemFactory(a9 recommendItemFactory) {
        this.f17392k = recommendItemFactory;
    }

    public void toq(List<RecommendItem> datas) {
        if (datas == null || datas.isEmpty() || this.f17392k == null) {
            return;
        }
        removeAllViews();
        Iterator<RecommendItem> it = datas.iterator();
        while (it.hasNext()) {
            View viewMo7319k = this.f17392k.mo7319k(it.next(), this);
            if (viewMo7319k != null) {
                C6077k.m22369i(viewMo7319k);
                addView(viewMo7319k);
            }
        }
    }

    public RecommendItemOrderLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RecommendItemOrderLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
