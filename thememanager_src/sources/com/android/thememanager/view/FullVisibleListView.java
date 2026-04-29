package com.android.thememanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

/* JADX INFO: loaded from: classes2.dex */
public class FullVisibleListView extends ListView {
    public FullVisibleListView(Context context) {
        super(context);
    }

    public int getTotalHeightOfListView() {
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return 0;
        }
        int measuredHeight = 0;
        for (int i2 = 0; i2 < adapter.getCount(); i2++) {
            View view = adapter.getView(i2, null, this);
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight += view.getMeasuredHeight();
        }
        return measuredHeight + getPaddingTop() + getPaddingBottom() + (getDividerHeight() * (adapter.getCount() - 1));
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(getTotalHeightOfListView(), 1073741824));
    }

    public FullVisibleListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FullVisibleListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
