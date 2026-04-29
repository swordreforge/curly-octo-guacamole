package com.android.thememanager.v9;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.android.thememanager.v9.p */
/* JADX INFO: compiled from: RecyclerViewDivider.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2871p extends RecyclerView.kja0 {

    /* JADX INFO: renamed from: n */
    public static final int f17178n = 1;

    /* JADX INFO: renamed from: q */
    public static final int f17179q = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int[] f61486zy = {R.attr.listDivider};

    /* JADX INFO: renamed from: k */
    private Drawable f17180k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f61487toq;

    public C2871p(Context context, int orientation) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f61486zy);
        this.f17180k = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        qrj(orientation);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: g */
    public void mo4814g(Canvas c2, RecyclerView parent) {
        if (this.f61487toq == 1) {
            ld6(c2, parent);
        } else {
            m10202p(c2, parent);
        }
    }

    public void ld6(Canvas c2, RecyclerView parent) {
        int paddingLeft = parent.getPaddingLeft();
        int width = parent.getWidth() - parent.getPaddingRight();
        int childCount = parent.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = parent.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.cdj) childAt.getLayoutParams())).bottomMargin;
                this.f17180k.setBounds(paddingLeft, bottom, width, this.f17180k.getIntrinsicHeight() + bottom);
                this.f17180k.draw(c2);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m10202p(Canvas c2, RecyclerView parent) {
        int paddingTop = parent.getPaddingTop();
        int height = parent.getHeight() - parent.getPaddingBottom();
        int childCount = parent.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = parent.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.cdj) childAt.getLayoutParams())).rightMargin;
                this.f17180k.setBounds(right, paddingTop, this.f17180k.getIntrinsicHeight() + right, height);
                this.f17180k.draw(c2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: q */
    public void mo4815q(Rect outRect, int itemPosition, RecyclerView parent) {
        if (this.f61487toq == 1) {
            outRect.set(0, 0, 0, this.f17180k.getIntrinsicHeight());
        } else {
            outRect.set(0, 0, this.f17180k.getIntrinsicWidth(), 0);
        }
    }

    public void qrj(int orientation) {
        if (orientation != 0 && orientation != 1) {
            throw new IllegalArgumentException("invalid orientation");
        }
        this.f61487toq = orientation;
    }

    public void x2(Drawable divider) {
        this.f17180k = divider;
    }
}
