package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import ij.C6095k;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    @dd
    private Drawable f67639ab;
    protected boolean an;
    private final Rect bb;
    private final Rect bp;
    private int bv;
    boolean id;

    public ForegroundLinearLayout(@lvui Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(@lvui Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f67639ab;
        if (drawable != null) {
            if (this.id) {
                this.id = false;
                Rect rect = this.bb;
                Rect rect2 = this.bp;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.an) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.bv, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @hyr(21)
    @TargetApi(21)
    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f67639ab;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f67639ab;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f67639ab.setState(getDrawableState());
    }

    @Override // android.view.View
    @dd
    public Drawable getForeground() {
        return this.f67639ab;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.bv;
    }

    @Override // android.view.ViewGroup, android.view.View
    @hyr(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f67639ab;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.id = z2 | this.id;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.id = true;
    }

    @Override // android.view.View
    public void setForeground(@dd Drawable drawable) {
        Drawable drawable2 = this.f67639ab;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f67639ab);
            }
            this.f67639ab = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.bv == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i2) {
        if (this.bv != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= androidx.core.view.qrj.f50865toq;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.bv = i2;
            if (i2 == 119 && this.f67639ab != null) {
                this.f67639ab.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f67639ab;
    }

    public ForegroundLinearLayout(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.bb = new Rect();
        this.bp = new Rect();
        this.bv = 119;
        this.an = true;
        this.id = false;
        TypedArray typedArrayM14534p = cdj.m14534p(context, attributeSet, C6095k.kja0.gm3, i2, 0, new int[0]);
        this.bv = typedArrayM14534p.getInt(C6095k.kja0.v7p, this.bv);
        Drawable drawable = typedArrayM14534p.getDrawable(C6095k.kja0.ik8);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.an = typedArrayM14534p.getBoolean(C6095k.kja0.k8s, true);
        typedArrayM14534p.recycle();
    }
}
