package com.android.thememanager.settings.personalize.view;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.android.thememanager.settings.personalize.view.y */
/* JADX INFO: compiled from: WallperListItemDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2596y extends RecyclerView.kja0 {

    /* JADX INFO: renamed from: k */
    private int f15354k;

    public C2596y(int top) {
        this.f15354k = top;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: n */
    public void mo4711n(Rect outRect, View view, RecyclerView parent, RecyclerView.mcp state) {
        if (parent.getChildAdapterPosition(view) < 3) {
            outRect.set(0, this.f15354k, 0, 0);
        }
    }
}
