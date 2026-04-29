package com.android.thememanager.detail.theme.view.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

/* JADX INFO: loaded from: classes2.dex */
public class DetailTagLayout extends ViewGroup {

    /* JADX INFO: renamed from: k */
    C1981k f11223k;

    /* JADX INFO: renamed from: n */
    toq f11224n;

    /* JADX INFO: renamed from: q */
    ListAdapter f11225q;

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.DetailTagLayout$k */
    class C1981k extends DataSetObserver {
        C1981k() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            DetailTagLayout.this.m7763q();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
        }
    }

    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo7764k(DetailTagLayout parent, View view, int position);
    }

    public DetailTagLayout(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m7763q() {
        removeAllViews();
        for (final int i2 = 0; i2 < this.f11225q.getCount(); i2++) {
            final View view = this.f11225q.getView(i2, null, this);
            addView(view, new ViewGroup.MarginLayoutParams(new ViewGroup.LayoutParams(-2, -2)));
            view.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.detail.theme.view.widget.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f11365k.zy(view, i2, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zy(View view, int i2, View view2) {
        toq toqVar = this.f11224n;
        if (toqVar != null) {
            toqVar.mo7764k(this, view, i2);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new ViewGroup.MarginLayoutParams(getContext(), attrs);
    }

    public ListAdapter getAdapter() {
        return this.f11225q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        int width = getWidth();
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int i5 = marginLayoutParams.leftMargin;
                if (i2 + i5 + measuredWidth + marginLayoutParams.rightMargin > width) {
                    i3 += marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
                    i2 = 0;
                }
                int i6 = marginLayoutParams.topMargin;
                childAt.layout(i2 + i5, i3 + i6, i5 + i2 + measuredWidth, i6 + i3 + measuredHeight);
                i2 += marginLayoutParams.leftMargin + measuredWidth + marginLayoutParams.rightMargin;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        int iMax = 0;
        int i4 = 0;
        int iMax2 = 0;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            measureChild(childAt, widthMeasureSpec, heightMeasureSpec);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int i5 = size2;
            int i6 = measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i7 = measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            int i8 = i3 + i6;
            if (i8 > size) {
                iMax2 = Math.max(i3, i6);
                i4 += i7;
                i3 = i6;
                iMax = i7;
            } else {
                iMax = Math.max(iMax, i7);
                i3 = i8;
            }
            if (i2 == childCount - 1) {
                i4 += iMax;
                iMax2 = Math.max(i3, iMax2);
            }
            setMeasuredDimension(mode == 1073741824 ? size : iMax2, mode2 == 1073741824 ? i5 : i4);
            i2++;
            size2 = i5;
        }
    }

    public void setAdapter(ListAdapter adapter) {
        C1981k c1981k;
        ListAdapter listAdapter = this.f11225q;
        if (listAdapter != null && (c1981k = this.f11223k) != null) {
            listAdapter.unregisterDataSetObserver(c1981k);
        }
        removeAllViews();
        this.f11225q = adapter;
        if (adapter != null) {
            C1981k c1981k2 = new C1981k();
            this.f11223k = c1981k2;
            this.f11225q.registerDataSetObserver(c1981k2);
        }
    }

    public void setOnTagClickListener(toq onTagClickListener) {
        this.f11224n = onTagClickListener;
    }

    public DetailTagLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DetailTagLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
