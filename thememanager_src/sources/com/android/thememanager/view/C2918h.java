package com.android.thememanager.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import zy.InterfaceC7829h;

/* JADX INFO: renamed from: com.android.thememanager.view.h */
/* JADX INFO: compiled from: ItemOffsetDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2918h extends RecyclerView.kja0 {

    /* JADX INFO: renamed from: k */
    protected int f17544k;

    public C2918h(int itemOffset) {
        this.f17544k = itemOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: n */
    public void mo4711n(@zy.lvui Rect outRect, @zy.lvui View view, @zy.lvui RecyclerView parent, @zy.lvui RecyclerView.mcp state) {
        int i2 = this.f17544k;
        outRect.set(i2, i2, i2, i2);
    }

    public C2918h(@zy.lvui Context context, @InterfaceC7829h int itemOffsetId) {
        this(context.getResources().getDimensionPixelSize(itemOffsetId));
    }
}
