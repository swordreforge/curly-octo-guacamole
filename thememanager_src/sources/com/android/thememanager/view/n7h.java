package com.android.thememanager.view;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.util.gc3c;

/* JADX INFO: compiled from: GridSpacingItemDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class n7h extends RecyclerView.kja0 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f61524f7l8;

    /* JADX INFO: renamed from: g */
    private boolean f17635g;

    /* JADX INFO: renamed from: k */
    private boolean f17636k;

    /* JADX INFO: renamed from: n */
    private int f17637n;

    /* JADX INFO: renamed from: q */
    private int f17638q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f61525toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f61526zy;

    public n7h(int spanCount, int spacing, int edge, boolean includeEdge) {
        this(spanCount, spacing, edge, includeEdge, gc3c.x2());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: n */
    public void mo4711n(@zy.lvui Rect outRect, @zy.lvui View view, @zy.lvui RecyclerView parent, @zy.lvui RecyclerView.mcp state) {
        int i2;
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i3 = this.f61525toq;
        int i4 = childAdapterPosition % i3;
        int i5 = (this.f61524f7l8 / i3) * i4;
        if (this.f17635g) {
            if (i4 == 0) {
                i2 = this.f17638q;
            } else {
                int i6 = this.f61526zy;
                i2 = i6 - (i5 - ((this.f17638q + (this.f17637n * i4)) + ((i4 - 1) * i6)));
            }
            if (this.f17636k) {
                outRect.right = i2;
            } else {
                outRect.left = i2;
            }
        } else {
            int i7 = this.f61526zy;
            outRect.left = (i4 * i7) / i3;
            outRect.right = i7 - (((i4 + 1) * i7) / i3);
        }
        if (childAdapterPosition >= i3) {
            outRect.top = this.f61526zy;
        }
    }

    public n7h(int spanCount, int spacing, int edge, boolean includeEdge, int screenWidth) {
        this.f17636k = false;
        this.f61525toq = spanCount;
        this.f61526zy = spacing;
        this.f17638q = edge;
        this.f17635g = includeEdge;
        this.f61524f7l8 = screenWidth;
        this.f17637n = ((screenWidth - (edge * 2)) - ((spanCount - 1) * spacing)) / spanCount;
        this.f17636k = C1819o.x9kr();
    }
}
