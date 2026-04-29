package com.android.thememanager.recommend.view.listview.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.decoration.q */
/* JADX INFO: compiled from: SimpleItemDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2364q extends RecyclerView.kja0 {

    /* JADX INFO: renamed from: g */
    boolean f13744g;

    /* JADX INFO: renamed from: k */
    private int f13745k;

    /* JADX INFO: renamed from: n */
    private int f13746n;

    /* JADX INFO: renamed from: q */
    private int f13747q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f60671toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f60672zy;

    public C2364q(int itemCount, int edgePadding, int centerPadding, int bottomPadding, boolean isRightToLeft) {
        this(itemCount, edgePadding, centerPadding, bottomPadding, 0);
        this.f13744g = isRightToLeft;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: n */
    public void mo4711n(Rect outRect, View view, RecyclerView parent, RecyclerView.mcp state) {
        int childAdapterPosition = parent.getChildAdapterPosition(view) - this.f13746n;
        if (childAdapterPosition < 0) {
            return;
        }
        int i2 = this.f13747q;
        int i3 = childAdapterPosition % i2;
        if (this.f13744g) {
            if (i3 == 0) {
                outRect.set(this.f60671toq / 2, 0, this.f13745k, this.f60672zy);
                return;
            } else if (i3 == i2 - 1) {
                outRect.set(this.f13745k, 0, this.f60671toq / 2, this.f60672zy);
                return;
            } else {
                int i4 = this.f60671toq;
                outRect.set(i4 / 2, 0, i4 / 2, this.f60672zy);
                return;
            }
        }
        if (i3 == 0) {
            outRect.set(this.f13745k, 0, this.f60671toq / 2, this.f60672zy);
        } else if (i3 == i2 - 1) {
            outRect.set(this.f60671toq / 2, 0, this.f13745k, this.f60672zy);
        } else {
            int i5 = this.f60671toq;
            outRect.set(i5 / 2, 0, i5 / 2, this.f60672zy);
        }
    }

    public C2364q(int itemCount, int edgePadding, int centerPadding, int bottomPadding, int headerCount) {
        this.f13745k = edgePadding;
        this.f60671toq = centerPadding;
        this.f60672zy = bottomPadding;
        this.f13747q = itemCount;
        this.f13746n = headerCount;
    }
}
