package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.C0498q;
import androidx.core.graphics.drawable.zy;
import androidx.core.view.C0683f;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.cdj;
import ij.C6095k;
import zy.InterfaceC7829h;
import zy.InterfaceC7833l;
import zy.dd;
import zy.lvui;
import zy.n7h;
import zy.x2;

/* JADX INFO: renamed from: com.google.android.material.divider.k */
/* JADX INFO: compiled from: MaterialDividerItemDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class C4018k extends RecyclerView.kja0 {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f67575ld6 = C6095k.n7h.lq96;

    /* JADX INFO: renamed from: p */
    public static final int f24396p = 1;

    /* JADX INFO: renamed from: s */
    public static final int f24397s = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f67576f7l8;

    /* JADX INFO: renamed from: g */
    private int f24398g;

    /* JADX INFO: renamed from: k */
    @lvui
    private Drawable f24399k;

    /* JADX INFO: renamed from: n */
    private int f24400n;

    /* JADX INFO: renamed from: q */
    private int f24401q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f67577toq;

    /* JADX INFO: renamed from: y */
    private final Rect f24402y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @x2
    private int f67578zy;

    public C4018k(@lvui Context context, int i2) {
        this(context, null, i2);
    }

    private void ld6(@lvui Canvas canvas, @lvui RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        boolean z2 = C0683f.m3159e(recyclerView) == 1;
        int i2 = paddingLeft + (z2 ? this.f24398g : this.f24400n);
        int i3 = width - (z2 ? this.f24400n : this.f24398g);
        int childCount = recyclerView.getChildCount();
        if (!this.f67576f7l8) {
            childCount--;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f24402y);
            int iRound = this.f24402y.bottom + Math.round(childAt.getTranslationY());
            this.f24399k.setBounds(i2, (iRound - this.f24399k.getIntrinsicHeight()) - this.f67577toq, i3, iRound);
            this.f24399k.draw(canvas);
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: p */
    private void m14446p(@lvui Canvas canvas, @lvui RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int i2 = paddingTop + this.f24400n;
        int i3 = height - this.f24398g;
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f24402y);
            int iRound = this.f24402y.right + Math.round(childAt.getTranslationX());
            this.f24399k.setBounds((iRound - this.f24399k.getIntrinsicWidth()) - this.f67577toq, i2, iRound, i3);
            this.f24399k.draw(canvas);
        }
        canvas.restore();
    }

    public boolean cdj() {
        return this.f67576f7l8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    public void f7l8(@lvui Canvas canvas, @lvui RecyclerView recyclerView, @lvui RecyclerView.mcp mcpVar) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.f24401q == 1) {
            ld6(canvas, recyclerView);
        } else {
            m14446p(canvas, recyclerView);
        }
    }

    public void fn3e(@lvui Context context, @InterfaceC7829h int i2) {
        m14448i(context.getResources().getDimensionPixelOffset(i2));
    }

    public void fu4(@InterfaceC7833l int i2) {
        this.f67577toq = i2;
    }

    /* JADX INFO: renamed from: h */
    public int m14447h() {
        return this.f24401q;
    }

    /* JADX INFO: renamed from: i */
    public void m14448i(@InterfaceC7833l int i2) {
        this.f24398g = i2;
    }

    public void ki(@x2 int i2) {
        this.f67578zy = i2;
        Drawable drawableKi = zy.ki(this.f24399k);
        this.f24399k = drawableKi;
        zy.n7h(drawableKi, i2);
    }

    @InterfaceC7833l
    public int kja0() {
        return this.f67577toq;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: n */
    public void mo4711n(@lvui Rect rect, @lvui View view, @lvui RecyclerView recyclerView, @lvui RecyclerView.mcp mcpVar) {
        rect.set(0, 0, 0, 0);
        if (this.f24401q == 1) {
            rect.bottom = this.f24399k.getIntrinsicHeight() + this.f67577toq;
        } else {
            rect.right = this.f24399k.getIntrinsicWidth() + this.f67577toq;
        }
    }

    @InterfaceC7833l
    public int n7h() {
        return this.f24400n;
    }

    public void ni7(@lvui Context context, @InterfaceC7829h int i2) {
        zurt(context.getResources().getDimensionPixelOffset(i2));
    }

    public void o1t(boolean z2) {
        this.f67576f7l8 = z2;
    }

    @InterfaceC7833l
    public int qrj() {
        return this.f24398g;
    }

    public void t8r(@lvui Context context, @n7h int i2) {
        ki(C0498q.m2252g(context, i2));
    }

    public void wvg(int i2) {
        if (i2 == 0 || i2 == 1) {
            this.f24401q = i2;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i2 + ". It should be either HORIZONTAL or VERTICAL");
    }

    @x2
    public int x2() {
        return this.f67578zy;
    }

    /* JADX INFO: renamed from: z */
    public void m14449z(@lvui Context context, @InterfaceC7829h int i2) {
        fu4(context.getResources().getDimensionPixelSize(i2));
    }

    public void zurt(@InterfaceC7833l int i2) {
        this.f24400n = i2;
    }

    public C4018k(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, C6095k.zy.lbeq, i2);
    }

    public C4018k(@lvui Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        this.f24402y = new Rect();
        TypedArray typedArrayM14534p = cdj.m14534p(context, attributeSet, C6095k.kja0.qf, i2, f67575ld6, new int[0]);
        this.f67578zy = com.google.android.material.resources.zy.m14753k(context, typedArrayM14534p, C6095k.kja0.dgf).getDefaultColor();
        this.f67577toq = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.vc7p, context.getResources().getDimensionPixelSize(C6095k.g.p6));
        this.f24400n = typedArrayM14534p.getDimensionPixelOffset(C6095k.kja0.ny6p, 0);
        this.f24398g = typedArrayM14534p.getDimensionPixelOffset(C6095k.kja0.upj2, 0);
        this.f67576f7l8 = typedArrayM14534p.getBoolean(C6095k.kja0.t146, true);
        typedArrayM14534p.recycle();
        this.f24399k = new ShapeDrawable();
        ki(this.f67578zy);
        wvg(i3);
    }
}
