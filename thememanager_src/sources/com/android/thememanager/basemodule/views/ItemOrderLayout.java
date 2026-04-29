package com.android.thememanager.basemodule.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ItemOrderLayout<T> extends ViewGroup {

    /* JADX INFO: renamed from: k */
    private InterfaceC1845k f10564k;

    /* JADX INFO: renamed from: q */
    protected int f10565q;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.ItemOrderLayout$k */
    public interface InterfaceC1845k<T> {
        /* JADX INFO: renamed from: k */
        View mo7319k(T data, ViewGroup parent);
    }

    protected static class toq extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: k */
        int f10566k;

        /* JADX INFO: renamed from: q */
        int f10567q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f57834toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f57835zy;

        public toq() {
            super(-1, -1);
        }

        /* JADX INFO: renamed from: k */
        public static toq m7320k(int left, int top, int right, int bottom) {
            toq toqVar = new toq();
            toqVar.f10566k = left;
            toqVar.f57834toq = top;
            toqVar.f57835zy = right;
            toqVar.f10567q = bottom;
            return toqVar;
        }

        public toq(Context c2, AttributeSet attrs) {
            super(c2, attrs);
        }
    }

    public ItemOrderLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: k */
    private int m7318k(int width, int startX, int childWidth) {
        return getLayoutDirection() == 1 ? (width - startX) - childWidth : startX;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            toq toqVar = (toq) childAt.getLayoutParams();
            childAt.layout(getPaddingLeft() + toqVar.f10566k, getPaddingTop() + toqVar.f57834toq, getPaddingLeft() + toqVar.f57835zy, getPaddingTop() + toqVar.f10567q);
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
                int iM7318k = m7318k(size2, i2, iMin);
                childAt.setLayoutParams(toq.m7320k(iM7318k, i3, iM7318k + iMin, i5));
                i2 += iMin + this.f10565q;
                iMax2 = Math.max(iMax2, measuredHeight);
            } else if (size == -1 || i3 + iMax2 + measuredHeight + this.f10565q <= size) {
                i3 += iMax2 + this.f10565q;
                i2 = 0;
                iMax2 = 0;
                int i52 = i3 + measuredHeight;
                iMax = Math.max(iMax, i52);
                int iM7318k2 = m7318k(size2, i2, iMin);
                childAt.setLayoutParams(toq.m7320k(iM7318k2, i3, iM7318k2 + iMin, i52));
                i2 += iMin + this.f10565q;
                iMax2 = Math.max(iMax2, measuredHeight);
            } else {
                childAt.setLayoutParams(toq.m7320k(0, 0, 0, 0));
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(widthSpec), iMax + getPaddingTop() + getPaddingBottom());
    }

    public void setGap(int gap) {
        this.f10565q = gap;
    }

    public void setItemFactory(InterfaceC1845k itemFactory) {
        this.f10564k = itemFactory;
    }

    public void toq(List<T> datas) {
        if (datas == null || datas.isEmpty() || this.f10564k == null) {
            return;
        }
        removeAllViews();
        Iterator<T> it = datas.iterator();
        while (it.hasNext()) {
            View viewMo7319k = this.f10564k.mo7319k(it.next(), this);
            if (viewMo7319k != null) {
                addView(viewMo7319k);
            }
        }
    }

    public ItemOrderLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ItemOrderLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
