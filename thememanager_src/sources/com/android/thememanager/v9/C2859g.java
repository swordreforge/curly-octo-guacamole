package com.android.thememanager.v9;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: renamed from: com.android.thememanager.v9.g */
/* JADX INFO: compiled from: HomePageRecommendationDividerDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2859g extends RecyclerView.kja0 {

    /* JADX INFO: renamed from: k */
    private int f17112k;

    public C2859g(int space) {
        this.f17112k = space;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: n */
    public void mo4711n(Rect outRect, View view, RecyclerView parent, RecyclerView.mcp state) {
        StaggeredGridLayoutManager.zy zyVar = (StaggeredGridLayoutManager.zy) view.getLayoutParams();
        outRect.setEmpty();
        if (zyVar.ld6()) {
            return;
        }
        int i2 = this.f17112k;
        outRect.top = i2;
        outRect.bottom = i2;
        outRect.right = i2;
        outRect.left = i2;
    }
}
