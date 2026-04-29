package com.android.thememanager.v9;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: renamed from: com.android.thememanager.v9.n */
/* JADX INFO: compiled from: DividerDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2870n extends RecyclerView.kja0 {

    /* JADX INFO: renamed from: k */
    private int f17176k;

    public C2870n(int space) {
        this.f17176k = space;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: n */
    public void mo4711n(Rect outRect, View view, RecyclerView parent, RecyclerView.mcp state) {
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        StaggeredGridLayoutManager.zy zyVar = (StaggeredGridLayoutManager.zy) view.getLayoutParams();
        int iM4926p = zyVar.m4926p();
        if (zyVar.ld6()) {
            outRect.left = 0;
            outRect.right = 0;
            if (childAdapterPosition == 0) {
                outRect.bottom = this.f17176k * 2;
                outRect.top = 0;
                return;
            } else {
                int i2 = this.f17176k;
                outRect.bottom = i2;
                outRect.top = i2;
                return;
            }
        }
        if (iM4926p % 2 == 0) {
            int i3 = this.f17176k;
            outRect.left = i3 * 2;
            outRect.right = i3;
            outRect.bottom = i3;
            outRect.top = i3;
            return;
        }
        int i4 = this.f17176k;
        outRect.left = i4;
        outRect.right = i4 * 2;
        outRect.bottom = i4;
        outRect.top = i4;
    }
}
