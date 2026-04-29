package com.android.thememanager.module.detail.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;

/* JADX INFO: compiled from: WidgetItemOffsetDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class ukdy extends RecyclerView.kja0 {

    /* JADX INFO: renamed from: k */
    private final int f13367k;

    /* JADX INFO: renamed from: q */
    private final int f13368q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f60573toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f60574zy;

    public ukdy(@zy.lvui Context context, int columnCount, int itemWidth) {
        this.f13367k = context.getResources().getDimensionPixelSize(R.dimen.default_horizontal_offset_from_screen_widget);
        this.f13368q = context.getResources().getDimensionPixelSize(R.dimen.widget_item_vertical_margin);
        this.f60573toq = columnCount;
        this.f60574zy = itemWidth;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: n */
    public void mo4711n(@zy.lvui Rect outRect, @zy.lvui View view, @zy.lvui RecyclerView parent, @zy.lvui RecyclerView.mcp state) {
        int width = parent.getWidth();
        int i2 = this.f60574zy;
        int i3 = this.f60573toq;
        int i4 = ((width - (i2 * i3)) - (this.f13367k * 2)) / i3;
        int i5 = this.f13368q;
        outRect.set(i4, i5, i4, i5);
    }
}
