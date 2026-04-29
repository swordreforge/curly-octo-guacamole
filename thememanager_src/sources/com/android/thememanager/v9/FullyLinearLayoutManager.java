package com.android.thememanager.v9;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class FullyLinearLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: k */
    private float f17001k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f61455toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int[] f61456zy;

    public FullyLinearLayoutManager(Context context) {
        super(context);
        this.f17001k = 1.0f;
        this.f61455toq = false;
        this.f61456zy = new int[2];
    }

    /* JADX INFO: renamed from: k */
    private void m10134k(RecyclerView.fu4 recycler, int position, int widthSpec, int heightSpec, int[] measuredDimension) {
        try {
            if (this.f61455toq) {
                recycler.m4796q();
            }
            View viewM4791h = recycler.m4791h(position);
            if (viewM4791h != null) {
                RecyclerView.cdj cdjVar = (RecyclerView.cdj) viewM4791h.getLayoutParams();
                viewM4791h.measure(ViewGroup.getChildMeasureSpec(widthSpec, getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cdjVar).width), ViewGroup.getChildMeasureSpec(heightSpec, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cdjVar).height));
                measuredDimension[0] = viewM4791h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cdjVar).leftMargin + ((ViewGroup.MarginLayoutParams) cdjVar).rightMargin;
                measuredDimension[1] = viewM4791h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) cdjVar).bottomMargin + ((ViewGroup.MarginLayoutParams) cdjVar).topMargin;
                recycler.mcp(viewM4791h);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onMeasure(RecyclerView.fu4 recycler, RecyclerView.mcp state, int widthSpec, int heightSpec) {
        int mode = View.MeasureSpec.getMode(widthSpec);
        int mode2 = View.MeasureSpec.getMode(heightSpec);
        int size = View.MeasureSpec.getSize(widthSpec);
        int size2 = View.MeasureSpec.getSize(heightSpec);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < getItemCount(); i4++) {
            m10134k(recycler, i4, View.MeasureSpec.makeMeasureSpec(i4, 0), View.MeasureSpec.makeMeasureSpec(i4, 0), this.f61456zy);
            if (getOrientation() == 0) {
                int[] iArr = this.f61456zy;
                i3 += iArr[0];
                if (i4 == 0) {
                    i2 = iArr[1];
                }
            } else {
                int[] iArr2 = this.f61456zy;
                i2 += iArr2[1];
                if (i4 == 0) {
                    i3 = iArr2[0];
                }
            }
        }
        if (mode != 1073741824) {
            size = i3;
        }
        if (mode2 != 1073741824) {
            size2 = i2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int scrollHorizontallyBy(int dx, RecyclerView.fu4 recycler, RecyclerView.mcp state) {
        return super.scrollHorizontallyBy((int) (dx * this.f17001k), recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int scrollVerticallyBy(int dy, RecyclerView.fu4 recycler, RecyclerView.mcp state) {
        return super.scrollVerticallyBy((int) (this.f17001k * dy), recycler, state);
    }

    public void toq(boolean clearRecyclerCache) {
        this.f61455toq = clearRecyclerCache;
    }

    public void zy(float ratio) {
        this.f17001k = ratio;
    }

    public FullyLinearLayoutManager(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
        this.f17001k = 1.0f;
        this.f61455toq = false;
        this.f61456zy = new int[2];
    }
}
