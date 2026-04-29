package com.android.thememanager.v9;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: renamed from: com.android.thememanager.v9.h */
/* JADX INFO: compiled from: ThemeSettingsDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2860h extends RecyclerView.kja0 {

    /* JADX INFO: renamed from: k */
    private int f17113k;

    public C2860h(int space) {
        this.f17113k = space;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: n */
    public void mo4711n(Rect outRect, View view, RecyclerView parent, RecyclerView.mcp state) {
        StaggeredGridLayoutManager.zy zyVar = (StaggeredGridLayoutManager.zy) view.getLayoutParams();
        outRect.setEmpty();
        int iM4926p = zyVar.m4926p();
        if (zyVar.ld6()) {
            outRect.top = 0;
            outRect.bottom = 0;
            outRect.right = 0;
            outRect.left = 0;
            return;
        }
        if (iM4926p % 2 == 0) {
            int i2 = this.f17113k;
            outRect.left = i2 * 2;
            outRect.right = i2;
        } else {
            int i3 = this.f17113k;
            outRect.left = i3;
            outRect.right = i3 * 2;
        }
        int i4 = this.f17113k;
        outRect.bottom = i4;
        outRect.top = i4;
    }
}
