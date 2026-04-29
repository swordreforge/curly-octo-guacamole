package com.android.thememanager.basemodule.views;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.t8r;

/* JADX INFO: loaded from: classes.dex */
public class FastScrollStaggeredGridLayoutManager extends StaggeredGridLayoutManager {

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.FastScrollStaggeredGridLayoutManager$k */
    class C1844k extends t8r {
        C1844k(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1058t
        /* JADX INFO: renamed from: k */
        public PointF mo4863k(int targetPosition) {
            return FastScrollStaggeredGridLayoutManager.this.computeScrollVectorForPosition(targetPosition);
        }

        @Override // androidx.recyclerview.widget.t8r
        protected float ni7(DisplayMetrics displayMetrics) {
            return 9.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.t8r
        /* JADX INFO: renamed from: z */
        protected int mo5122z(int dx) {
            return super.mo5122z(dx);
        }
    }

    public FastScrollStaggeredGridLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.mcp state, int position) {
        C1844k c1844k = new C1844k(recyclerView.getContext());
        c1844k.cdj(position);
        startSmoothScroll(c1844k);
    }

    public FastScrollStaggeredGridLayoutManager(int spanCount, int orientation) {
        super(spanCount, orientation);
    }
}
