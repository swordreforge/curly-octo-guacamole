package com.android.thememanager.recommend.view.listview.decoration;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.thememanager.R;

/* JADX INFO: compiled from: HybridDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends RecyclerView.kja0 {

    /* JADX INFO: renamed from: k */
    private int f13749k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f60674toq;

    public zy(Context context) {
        this.f13749k = context.getResources().getDimensionPixelSize(R.dimen.stagger_divider);
        this.f60674toq = context.getResources().getDimensionPixelSize(R.dimen.stagger_divider_bottom);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: n */
    public void mo4711n(Rect outRect, View view, RecyclerView parent, RecyclerView.mcp state) {
        StaggeredGridLayoutManager.zy zyVar = (StaggeredGridLayoutManager.zy) view.getLayoutParams();
        outRect.setEmpty();
        if (zyVar.ld6()) {
            return;
        }
        int i2 = this.f13749k;
        outRect.right = i2;
        outRect.left = i2;
        outRect.bottom = this.f60674toq;
    }
}
