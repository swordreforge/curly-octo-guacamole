package com.android.thememanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;

/* JADX INFO: loaded from: classes2.dex */
public class FixedHeightGridView extends GridView {

    /* JADX INFO: renamed from: k */
    private int f17271k;

    /* JADX INFO: renamed from: com.android.thememanager.view.FixedHeightGridView$k */
    public static abstract class AbstractC2884k extends BaseAdapter {

        /* JADX INFO: renamed from: k */
        FixedHeightGridView f17272k;

        public AbstractC2884k(FixedHeightGridView fg) {
            this.f17272k = fg;
        }

        @Override // android.widget.Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            View viewMo10232k = mo10232k(position, convertView, parent);
            if (viewMo10232k != null && this.f17272k.getChildMaxHeight() != 0) {
                ViewGroup.LayoutParams layoutParams = viewMo10232k.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new AbsListView.LayoutParams(-1, -2, 0);
                    viewMo10232k.setLayoutParams(layoutParams);
                }
                layoutParams.height = this.f17272k.getChildMaxHeight();
            }
            return viewMo10232k;
        }

        /* JADX INFO: renamed from: k */
        public abstract View mo10232k(int position, View convertView, ViewGroup parent);
    }

    public FixedHeightGridView(Context context) {
        super(context);
        this.f17271k = 0;
    }

    public int getChildMaxHeight() {
        return this.f17271k;
    }

    /* JADX INFO: renamed from: k */
    public void m10239k() {
        this.f17271k = 0;
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    protected void layoutChildren() {
        super.layoutChildren();
        toq();
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public void toq() {
        int iMax = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            iMax = Math.max(iMax, getChildAt(i2).getHeight());
        }
        if (iMax != this.f17271k) {
            this.f17271k = iMax;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.height = this.f17271k;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public FixedHeightGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f17271k = 0;
    }

    public FixedHeightGridView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f17271k = 0;
    }
}
