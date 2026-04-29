package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0683f;
import ij.C6095k;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class FlowLayout extends ViewGroup {

    /* JADX INFO: renamed from: g */
    private int f24530g;

    /* JADX INFO: renamed from: k */
    private int f24531k;

    /* JADX INFO: renamed from: n */
    private boolean f24532n;

    /* JADX INFO: renamed from: q */
    private int f24533q;

    public FlowLayout(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private static int m14525k(int i2, int i3, int i4) {
        return i3 != Integer.MIN_VALUE ? i3 != 1073741824 ? i4 : i2 : Math.min(i4, i2);
    }

    /* JADX INFO: renamed from: q */
    private void m14526q(@lvui Context context, @dd AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C6095k.kja0.x3b5, 0, 0);
        this.f24531k = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6095k.kja0.y1e, 0);
        this.f24533q = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6095k.kja0.w1k2, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    protected int getItemSpacing() {
        return this.f24533q;
    }

    protected int getLineSpacing() {
        return this.f24531k;
    }

    protected int getRowCount() {
        return this.f24530g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int qVar;
        int iZy;
        if (getChildCount() == 0) {
            this.f24530g = 0;
            return;
        }
        this.f24530g = 1;
        boolean z3 = C0683f.m3159e(this) == 1;
        int paddingRight = z3 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z3 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i6 = (i4 - i2) - paddingLeft;
        int measuredWidth = paddingRight;
        int i7 = paddingTop;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C6095k.y.owi, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iZy = androidx.core.view.ki.zy(marginLayoutParams);
                    qVar = androidx.core.view.ki.toq(marginLayoutParams);
                } else {
                    qVar = 0;
                    iZy = 0;
                }
                int measuredWidth2 = measuredWidth + iZy + childAt.getMeasuredWidth();
                if (!this.f24532n && measuredWidth2 > i6) {
                    i7 = this.f24531k + paddingTop;
                    this.f24530g++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(C6095k.y.owi, Integer.valueOf(this.f24530g - 1));
                int i9 = measuredWidth + iZy;
                int measuredWidth3 = childAt.getMeasuredWidth() + i9;
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                if (z3) {
                    childAt.layout(i6 - measuredWidth3, i7, (i6 - measuredWidth) - iZy, measuredHeight);
                } else {
                    childAt.layout(i9, i7, measuredWidth3, measuredHeight);
                }
                measuredWidth += iZy + qVar + childAt.getMeasuredWidth() + this.f24533q;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i2, i3);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i5 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                int i10 = paddingLeft2;
                if (paddingLeft2 + i4 + childAt.getMeasuredWidth() <= paddingRight || zy()) {
                    paddingLeft = i10;
                } else {
                    paddingLeft = getPaddingLeft();
                    i7 = this.f24531k + paddingTop;
                }
                int measuredWidth = paddingLeft + i4 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i4 + i5 + childAt.getMeasuredWidth() + this.f24533q;
                if (i9 == getChildCount() - 1) {
                    i8 += i5;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m14525k(size, mode, i8 + getPaddingRight()), m14525k(size2, mode2, paddingTop + getPaddingBottom()));
    }

    protected void setItemSpacing(int i2) {
        this.f24533q = i2;
    }

    protected void setLineSpacing(int i2) {
        this.f24531k = i2;
    }

    public void setSingleLine(boolean z2) {
        this.f24532n = z2;
    }

    public int toq(@lvui View view) {
        Object tag = view.getTag(C6095k.y.owi);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean zy() {
        return this.f24532n;
    }

    public FlowLayout(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f24532n = false;
        m14526q(context, attributeSet);
    }

    @TargetApi(21)
    public FlowLayout(@lvui Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f24532n = false;
        m14526q(context, attributeSet);
    }
}
