package com.android.thememanager.settings.personalize;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.settings.personalize.s */
/* JADX INFO: compiled from: PersonalizeBottomItemDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2581s extends RecyclerView.kja0 {

    /* JADX INFO: renamed from: k */
    private int f15301k;

    /* JADX INFO: renamed from: q */
    private boolean f15302q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f60827toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f60828zy;

    public C2581s(int columnCount, int horizontalOffset, int verticalOffset, boolean isRightToLeft) {
        this.f15301k = columnCount;
        this.f60827toq = horizontalOffset;
        this.f60828zy = verticalOffset;
        this.f15302q = isRightToLeft;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: n */
    public void mo4711n(@lvui Rect outRect, @lvui View view, @lvui RecyclerView parent, @lvui RecyclerView.mcp state) {
        if (this.f15301k <= 1) {
            super.mo4711n(outRect, view, parent, state);
        }
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i2 = this.f15301k;
        if (childAdapterPosition / i2 > 0) {
            outRect.top = this.f60828zy;
        } else {
            outRect.top = 0;
        }
        int i3 = childAdapterPosition % i2;
        int i4 = this.f60827toq;
        int i5 = (int) (((i2 - 1.0f) / i2) * i4);
        int i6 = (int) ((1.0f / i2) * i4);
        if (this.f15302q) {
            if (i3 == 0) {
                outRect.left = i5;
                outRect.right = 0;
                return;
            } else if (i3 == i2 - 1) {
                outRect.left = 0;
                outRect.right = i5;
                return;
            } else {
                outRect.left = i6;
                outRect.right = i6;
                return;
            }
        }
        if (i3 == 0) {
            outRect.left = 0;
            outRect.right = i5;
        } else if (i3 == i2 - 1) {
            outRect.left = i5;
            outRect.right = 0;
        } else {
            outRect.left = i6;
            outRect.right = i6;
        }
    }
}
