package com.android.thememanager.recommend.view.listview.decoration;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1819o;

/* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.decoration.k */
/* JADX INFO: compiled from: FoldItemDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2362k extends RecyclerView.kja0 {

    /* JADX INFO: renamed from: g */
    private String f13736g;

    /* JADX INFO: renamed from: k */
    private int f13737k;

    /* JADX INFO: renamed from: n */
    private int f13738n;

    /* JADX INFO: renamed from: q */
    private int f13739q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f60667toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f60668zy;

    public C2362k(Context context, int columnCount, int itemWidth, int screenWidth) {
        this.f13737k = context.getResources().getDimensionPixelSize(R.dimen.pad_theme_thumb_blank_edge);
        this.f60667toq = context.getResources().getDimensionPixelSize(R.dimen.pad_theme_thumb_blank_bottom);
        this.f13738n = columnCount;
        this.f60668zy = itemWidth;
        this.f13739q = screenWidth;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: n */
    public void mo4711n(Rect outRect, View view, RecyclerView parent, RecyclerView.mcp state) {
        int width = parent.getWidth();
        if (width <= 0) {
            width = this.f13739q;
        }
        if (width == 0) {
            return;
        }
        int i2 = this.f60668zy;
        int i3 = this.f13738n;
        int i4 = ((width - (i2 * i3)) - (this.f13737k * 2)) / (i3 - 1);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM4787q = layoutParams instanceof GridLayoutManager.toq ? ((GridLayoutManager.toq) layoutParams).m4787q() : ((StaggeredGridLayoutManager.zy) layoutParams).m4787q();
        if (!p029m.zy.toq(this.f13736g) && "icons".equals(this.f13736g)) {
            if (iM4787q == 0) {
                return;
            } else {
                iM4787q--;
            }
        }
        outRect.top = 0;
        outRect.bottom = this.f60667toq;
        int i5 = this.f13738n;
        int i6 = iM4787q % i5;
        int i7 = (width / i5) * i6;
        int i8 = this.f13737k + ((this.f60668zy + i4) * i6);
        int i9 = i7 - i8;
        if (C1819o.x9kr()) {
            if (i6 == 0) {
                outRect.left = -i8;
                outRect.right = i8;
                return;
            } else {
                outRect.left = i9;
                outRect.right = -i9;
                return;
            }
        }
        if (i6 == 0) {
            outRect.left = i8;
            outRect.right = -i8;
        } else {
            outRect.left = -i9;
            outRect.right = i9;
        }
    }

    /* JADX INFO: renamed from: p */
    public int m8552p() {
        return this.f60668zy;
    }

    public C2362k(Context context, int columnCount, int itemWidth, int screenWidth, String resCode, int edgePadding) {
        this.f13737k = edgePadding;
        this.f60667toq = context.getResources().getDimensionPixelSize(R.dimen.pad_theme_thumb_blank_bottom);
        this.f13738n = columnCount;
        this.f60668zy = itemWidth;
        this.f13739q = screenWidth;
        this.f13736g = resCode;
    }
}
