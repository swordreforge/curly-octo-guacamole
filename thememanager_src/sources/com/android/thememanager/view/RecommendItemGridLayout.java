package com.android.thememanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.model.RecommendItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public class RecommendItemGridLayout extends ViewGroup {

    /* JADX INFO: renamed from: f */
    private int f17377f;

    /* JADX INFO: renamed from: g */
    private int f17378g;

    /* JADX INFO: renamed from: h */
    private int f17379h;

    /* JADX INFO: renamed from: i */
    private int f17380i;

    /* JADX INFO: renamed from: k */
    private a9 f17381k;

    /* JADX INFO: renamed from: l */
    private int f17382l;

    /* JADX INFO: renamed from: n */
    private HashMap<View, Integer> f17383n;

    /* JADX INFO: renamed from: p */
    private int f17384p;

    /* JADX INFO: renamed from: q */
    private ArrayList<View> f17385q;

    /* JADX INFO: renamed from: r */
    private TreeSet<Integer> f17386r;

    /* JADX INFO: renamed from: s */
    private int f17387s;

    /* JADX INFO: renamed from: t */
    private int f17388t;

    /* JADX INFO: renamed from: y */
    private int f17389y;

    /* JADX INFO: renamed from: z */
    private int f17390z;

    /* JADX INFO: renamed from: com.android.thememanager.view.RecommendItemGridLayout$k */
    private static class C2894k extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: k */
        int f17391k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f61497toq;

        public C2894k() {
            super(-1, -1);
        }

        /* JADX INFO: renamed from: k */
        public static C2894k m10285k(int widthCount, int heightCount) {
            C2894k c2894k = new C2894k();
            c2894k.f17391k = widthCount;
            c2894k.f61497toq = heightCount;
            return c2894k;
        }

        public C2894k(Context c2, AttributeSet attrs) {
            super(c2, attrs);
        }
    }

    public RecommendItemGridLayout(Context context) {
        super(context);
        this.f17385q = new ArrayList<>();
        this.f17383n = new HashMap<>();
        this.f17386r = new TreeSet<>();
        this.f17382l = 0;
        m10283y();
    }

    private int f7l8(int position) {
        return (position / this.f17378g) * (this.f17388t + this.f17389y);
    }

    /* JADX INFO: renamed from: g */
    private int m10278g(int position) {
        return (position % this.f17378g) * (this.f17390z + this.f17389y);
    }

    /* JADX INFO: renamed from: k */
    private void m10279k(View view, int widthCount, int heightCount) {
        if (view == null) {
            return;
        }
        int i2 = this.f17387s;
        if (widthCount > i2) {
            widthCount = i2;
        } else if (widthCount < 1) {
            widthCount = 1;
        }
        int i3 = this.f17384p;
        if (heightCount > i3) {
            heightCount = i3;
        } else if (heightCount < 1) {
            heightCount = 1;
        }
        view.setLayoutParams(C2894k.m10285k(widthCount, heightCount));
        this.f17385q.add(view);
    }

    private void ld6(int position, int widthCount, int heightCount) {
        int i2 = ((position / this.f17378g) + heightCount) - 1;
        int i3 = this.f17382l;
        while (true) {
            int i4 = 0;
            if (i3 > i2) {
                break;
            }
            while (true) {
                int i5 = this.f17378g;
                if (i4 < i5) {
                    this.f17386r.add(Integer.valueOf((i5 * i3) + i4));
                    i4++;
                }
            }
            i3++;
        }
        if (this.f17382l <= i2) {
            this.f17382l = i2 + 1;
        }
        for (int i6 = 0; i6 < heightCount; i6++) {
            for (int i7 = 0; i7 < widthCount; i7++) {
                this.f17386r.remove(Integer.valueOf((this.f17378g * i6) + position + i7));
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private void m10280p() {
        removeAllViews();
        this.f17383n.clear();
        this.f17386r.clear();
        this.f17382l = 0;
        for (View view : this.f17385q) {
            C2894k c2894k = (C2894k) view.getLayoutParams();
            this.f17383n.put(view, Integer.valueOf(toq(c2894k.f17391k, c2894k.f61497toq)));
            addView(view);
        }
    }

    /* JADX INFO: renamed from: q */
    private int m10281q(int position, int width) {
        return m10278g(position) + width;
    }

    /* JADX INFO: renamed from: s */
    private boolean m10282s(int position, int widthCount, int heightCount) {
        int i2 = this.f17378g;
        if (i2 - (position % i2) < widthCount) {
            return false;
        }
        for (int i3 = 0; i3 < heightCount; i3++) {
            for (int i4 = 0; i4 < widthCount; i4++) {
                int i5 = this.f17378g;
                int i6 = (i5 * i3) + position + i4;
                if (i6 / i5 >= this.f17382l) {
                    return true;
                }
                if (!this.f17386r.contains(Integer.valueOf(i6))) {
                    return false;
                }
            }
        }
        return true;
    }

    private int toq(int widthCount, int heightCount) {
        for (Integer num : this.f17386r) {
            if (m10282s(num.intValue(), widthCount, heightCount)) {
                ld6(num.intValue(), widthCount, heightCount);
                return num.intValue();
            }
        }
        int i2 = this.f17382l * this.f17378g;
        ld6(i2, widthCount, heightCount);
        return i2;
    }

    /* JADX INFO: renamed from: y */
    private void m10283y() {
        this.f17378g = 2;
        this.f17389y = 0;
        this.f17387s = 2;
        this.f17384p = 2;
        this.f17379h = 5;
        this.f17380i = 3;
    }

    private int zy(int position, int height) {
        return f7l8(position) + height;
    }

    public int getCurrentCols() {
        return this.f17378g;
    }

    public int getCurrentRows() {
        return this.f17382l;
    }

    public int getIndex() {
        return this.f17377f;
    }

    /* JADX INFO: renamed from: n */
    public int m10284n(View child) {
        Integer num = this.f17383n.get(child);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int iM10281q;
        int iM10281q2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int iIntValue = this.f17383n.get(childAt).intValue();
            int i3 = this.f17378g;
            int i4 = (this.f17390z * i3) + ((i3 - 1) * this.f17389y);
            if (getLayoutDirection() == 1) {
                iM10281q2 = i4 - m10281q(iIntValue, measuredWidth);
                iM10281q = i4 - m10278g(iIntValue);
            } else {
                int iM10278g = m10278g(iIntValue);
                iM10281q = m10281q(iIntValue, measuredWidth);
                iM10281q2 = iM10278g;
            }
            childAt.layout(getPaddingLeft() + iM10281q2, getPaddingTop() + f7l8(iIntValue), getPaddingLeft() + iM10281q, getPaddingTop() + zy(iIntValue, measuredHeight));
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthSpec, int heightSpec) {
        int size = View.MeasureSpec.getSize(widthSpec);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i2 = this.f17378g;
        int i3 = (paddingLeft - ((i2 - 1) * this.f17389y)) / i2;
        this.f17390z = i3;
        this.f17388t = (i3 * this.f17380i) / this.f17379h;
        int iMax = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            C2894k c2894k = (C2894k) childAt.getLayoutParams();
            int i5 = c2894k.f17391k;
            int i6 = c2894k.f61497toq;
            int i7 = this.f17390z * i5;
            int i8 = this.f17389y;
            int i9 = i7 + ((i5 - 1) * i8);
            int i10 = (this.f17388t * i6) + ((i6 - 1) * i8);
            int iIntValue = this.f17383n.get(childAt).intValue();
            childAt.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
            iMax = Math.max(iMax, zy(iIntValue, i10));
        }
        setMeasuredDimension(size, iMax + getPaddingTop() + getPaddingBottom());
    }

    public void qrj(List<RecommendItem> datas) {
        if (datas == null || datas.isEmpty() || this.f17381k == null) {
            return;
        }
        this.f17385q.clear();
        for (RecommendItem recommendItem : datas) {
            View viewMo7319k = this.f17381k.mo7319k(recommendItem, this);
            if (viewMo7319k != null) {
                m10279k(viewMo7319k, recommendItem.getWidthCount(), recommendItem.getHeightCount());
            }
        }
        m10280p();
    }

    public void setColumnCount(int columnCount) {
        if (columnCount > 0) {
            this.f17378g = columnCount;
        }
    }

    public void setGridItemGap(int gridItemGap) {
        if (gridItemGap >= 0) {
            this.f17389y = gridItemGap;
        }
    }

    public void setGridItemMaxSize(int maxWidth, int maxHeight) {
        if (maxWidth <= 0 || maxHeight <= 0) {
            return;
        }
        this.f17387s = maxWidth;
        this.f17384p = maxHeight;
    }

    public void setGridItemRatio(int width, int height) {
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f17379h = width;
        this.f17380i = height;
    }

    public void setIndex(int index) {
        this.f17377f = index;
    }

    public void setRecommendItemFactory(a9 recommendItemFactory) {
        this.f17381k = recommendItemFactory;
    }

    public void x2() {
        m10280p();
    }
}
