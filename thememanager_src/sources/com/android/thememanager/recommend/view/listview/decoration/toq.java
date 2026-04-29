package com.android.thememanager.recommend.view.listview.decoration;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.thememanager.R;

/* JADX INFO: compiled from: HomeAodDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq extends RecyclerView.kja0 {

    /* JADX INFO: renamed from: k */
    private int f13748k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f60673toq;

    public toq(Context context) {
        this.f13748k = context.getResources().getDimensionPixelSize(R.dimen.stagger_divider);
        this.f60673toq = context.getResources().getDimensionPixelSize(R.dimen.rc_aod_stagger_bottom_divider);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: n */
    public void mo4711n(Rect outRect, View view, RecyclerView parent, RecyclerView.mcp state) {
        StaggeredGridLayoutManager.zy zyVar = (StaggeredGridLayoutManager.zy) view.getLayoutParams();
        outRect.setEmpty();
        if (zyVar.ld6()) {
            return;
        }
        int i2 = this.f13748k;
        outRect.top = i2;
        outRect.right = i2;
        outRect.left = i2;
        outRect.bottom = this.f60673toq;
    }
}
