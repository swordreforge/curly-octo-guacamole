package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.C0498q;
import androidx.core.view.C0683f;
import com.google.android.material.internal.cdj;
import com.google.android.material.resources.zy;
import com.google.android.material.shape.C4108p;
import h4b.C6070k;
import ij.C6095k;
import zy.InterfaceC7829h;
import zy.InterfaceC7833l;
import zy.dd;
import zy.lvui;
import zy.n7h;
import zy.x2;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: s */
    private static final int f24390s = C6095k.n7h.lq96;

    /* JADX INFO: renamed from: g */
    private int f24391g;

    /* JADX INFO: renamed from: k */
    @lvui
    private final C4108p f24392k;

    /* JADX INFO: renamed from: n */
    @x2
    private int f24393n;

    /* JADX INFO: renamed from: q */
    private int f24394q;

    /* JADX INFO: renamed from: y */
    private int f24395y;

    public MaterialDivider(@lvui Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.f24393n;
    }

    @InterfaceC7833l
    public int getDividerInsetEnd() {
        return this.f24395y;
    }

    @InterfaceC7833l
    public int getDividerInsetStart() {
        return this.f24391g;
    }

    public int getDividerThickness() {
        return this.f24394q;
    }

    @Override // android.view.View
    protected void onDraw(@lvui Canvas canvas) {
        int width;
        int i2;
        super.onDraw(canvas);
        boolean z2 = C0683f.m3159e(this) == 1;
        int i3 = z2 ? this.f24395y : this.f24391g;
        if (z2) {
            width = getWidth();
            i2 = this.f24391g;
        } else {
            width = getWidth();
            i2 = this.f24395y;
        }
        this.f24392k.setBounds(i3, 0, width - i2, getBottom() - getTop());
        this.f24392k.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i4 = this.f24394q;
            if (i4 > 0 && measuredHeight != i4) {
                measuredHeight = i4;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@x2 int i2) {
        if (this.f24393n != i2) {
            this.f24393n = i2;
            this.f24392k.m14867x(ColorStateList.valueOf(i2));
            invalidate();
        }
    }

    public void setDividerColorResource(@n7h int i2) {
        setDividerColor(C0498q.m2252g(getContext(), i2));
    }

    public void setDividerInsetEnd(@InterfaceC7833l int i2) {
        this.f24395y = i2;
    }

    public void setDividerInsetEndResource(@InterfaceC7829h int i2) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i2));
    }

    public void setDividerInsetStart(@InterfaceC7833l int i2) {
        this.f24391g = i2;
    }

    public void setDividerInsetStartResource(@InterfaceC7829h int i2) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i2));
    }

    public void setDividerThickness(@InterfaceC7833l int i2) {
        if (this.f24394q != i2) {
            this.f24394q = i2;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@InterfaceC7829h int i2) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i2));
    }

    public MaterialDivider(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.lbeq);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        int i3 = f24390s;
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        this.f24392k = new C4108p();
        TypedArray typedArrayM14534p = cdj.m14534p(context2, attributeSet, C6095k.kja0.qf, i2, i3, new int[0]);
        this.f24394q = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.vc7p, getResources().getDimensionPixelSize(C6095k.g.p6));
        this.f24391g = typedArrayM14534p.getDimensionPixelOffset(C6095k.kja0.ny6p, 0);
        this.f24395y = typedArrayM14534p.getDimensionPixelOffset(C6095k.kja0.upj2, 0);
        setDividerColor(zy.m14753k(context2, typedArrayM14534p, C6095k.kja0.dgf).getDefaultColor());
        typedArrayM14534p.recycle();
    }
}
