package com.android.thememanager.basemodule.views;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t8r;

/* JADX INFO: loaded from: classes.dex */
public class ThemeLinearLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.ThemeLinearLayoutManager$k */
    private class C1849k extends t8r {

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        private int f57839fu4;

        C1849k(Context context, int offset) {
            super(context);
            this.f57839fu4 = offset;
        }

        @Override // androidx.recyclerview.widget.t8r
        /* JADX INFO: renamed from: i */
        public int mo5121i(int viewStart, int viewEnd, int boxStart, int boxEnd, int snapPreference) {
            return (boxStart - viewStart) + this.f57839fu4;
        }

        @Override // androidx.recyclerview.widget.t8r
        protected float ni7(DisplayMetrics displayMetrics) {
            return 10.0f / displayMetrics.densityDpi;
        }
    }

    public ThemeLinearLayoutManager(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: k */
    public void m7328k(RecyclerView recyclerView, int position, int offset) {
        C1849k c1849k = new C1849k(recyclerView.getContext(), offset);
        c1849k.cdj(position);
        startSmoothScroll(c1849k);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.mcp state, int position) {
        m7328k(recyclerView, position, 0);
    }
}
