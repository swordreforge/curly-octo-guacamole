package com.android.thememanager.basemodule.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class FilledListView extends ListView {

    /* JADX INFO: renamed from: h */
    public static final int f10552h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f10553i = 2;

    /* JADX INFO: renamed from: p */
    public static final int f10554p = 0;

    /* JADX INFO: renamed from: z */
    public static final int f10555z = 3;

    /* JADX INFO: renamed from: g */
    private final int f10556g;

    /* JADX INFO: renamed from: k */
    private int f10557k;

    /* JADX INFO: renamed from: n */
    private int f10558n;

    /* JADX INFO: renamed from: q */
    private int f10559q;

    /* JADX INFO: renamed from: s */
    protected TextView f10560s;

    /* JADX INFO: renamed from: y */
    private final Map<Integer, Integer> f10561y;

    public FilledListView(Context context) {
        super(context);
        this.f10557k = 0;
        this.f10559q = 1073741824;
        this.f10558n = 0;
        this.f10556g = 5;
        this.f10561y = new HashMap();
    }

    /* JADX INFO: renamed from: k */
    private int m7317k(int beginIndex, int endIndex, int maxHeight, boolean useSeeingViewMeasure) {
        View childAt;
        int iMin = Math.min(getCount(), endIndex);
        int dividerHeight = (getDividerHeight() <= 0 || getDivider() == null) ? 0 : getDividerHeight();
        int listPaddingTop = getListPaddingTop() + getListPaddingBottom();
        View view = null;
        for (int iMax = Math.max(0, beginIndex); iMax < iMin; iMax++) {
            if (iMax > 0) {
                listPaddingTop += dividerHeight;
            }
            if (!this.f10561y.containsKey(Integer.valueOf(iMax))) {
                ListAdapter adapter = getAdapter();
                if ((adapter instanceof HeaderViewListAdapter) && iMax <= ((HeaderViewListAdapter) adapter).getHeadersCount()) {
                    view = null;
                }
                view = getAdapter().getView(iMax, view, null);
                if (view != null) {
                    if (((AbsListView.LayoutParams) view.getLayoutParams()) == null) {
                        view.setLayoutParams((AbsListView.LayoutParams) generateDefaultLayoutParams());
                    }
                    view.measure(this.f10559q, 0);
                    this.f10561y.put(Integer.valueOf(iMax), Integer.valueOf(view.getMeasuredHeight()));
                }
            }
            int iIntValue = this.f10561y.containsKey(Integer.valueOf(iMax)) ? this.f10561y.get(Integer.valueOf(iMax)).intValue() : 0;
            if (getHeaderViewsCount() <= iMax && iMax < getCount() - getFooterViewsCount() && useSeeingViewMeasure && (childAt = getChildAt(iMax - getFirstVisiblePosition())) != null) {
                childAt.measure(this.f10559q, 0);
                iIntValue = childAt.getMeasuredHeight();
            }
            listPaddingTop += iIntValue;
            if (listPaddingTop > maxHeight) {
                break;
            }
        }
        return listPaddingTop;
    }

    protected int getScrollDistance() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (getFirstVisiblePosition() >= 5) {
            return Integer.MAX_VALUE;
        }
        return (-getChildAt(0).getTop()) + m7317k(0, getFirstVisiblePosition(), Integer.MAX_VALUE, true);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode;
        this.f10559q = widthMeasureSpec;
        this.f10561y.clear();
        if (this.f10557k != 0 && ((mode = View.MeasureSpec.getMode(heightMeasureSpec)) == 1073741824 || mode == Integer.MIN_VALUE)) {
            int headerViewsCount = this.f10557k == 2 ? getHeaderViewsCount() : 0;
            int size = View.MeasureSpec.getSize(heightMeasureSpec) + (this.f10557k == 3 ? this.f10558n : 0);
            int iM7317k = m7317k(headerViewsCount, getCount() - 1, size, false);
            if (iM7317k <= size) {
                this.f10560s.setHeight(size - iM7317k);
                setVerticalScrollBarEnabled(false);
            } else {
                this.f10560s.setHeight(0);
                setVerticalScrollBarEnabled(true);
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public void setExceedPixel(int exceedPixel) {
        this.f10558n = exceedPixel;
        setFillMode(3);
    }

    public void setFillMode(int fillMode) {
        this.f10557k = fillMode;
        if (fillMode != 0) {
            TextView textView = this.f10560s;
            if (textView != null) {
                removeFooterView(textView);
            }
            TextView textView2 = new TextView(getContext());
            this.f10560s = textView2;
            textView2.setHeight(0);
            addFooterView(this.f10560s);
        }
    }

    public FilledListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f10557k = 0;
        this.f10559q = 1073741824;
        this.f10558n = 0;
        this.f10556g = 5;
        this.f10561y = new HashMap();
    }

    public FilledListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f10557k = 0;
        this.f10559q = 1073741824;
        this.f10558n = 0;
        this.f10556g = 5;
        this.f10561y = new HashMap();
    }
}
