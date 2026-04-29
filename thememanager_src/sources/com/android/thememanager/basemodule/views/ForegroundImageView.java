package com.android.thememanager.basemodule.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.android.thememanager.basemodule.imageloader.NinePatchImageView;
import com.android.thememanager.fn3e;

/* JADX INFO: loaded from: classes.dex */
public class ForegroundImageView extends NinePatchImageView {

    /* JADX INFO: renamed from: g */
    private static boolean f10562g = true;

    /* JADX INFO: renamed from: n */
    private Drawable f10563n;

    public ForegroundImageView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        if (f10562g || (drawable = this.f10563n) == null) {
            return;
        }
        drawable.draw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        Drawable drawable;
        super.drawableStateChanged();
        if (f10562g || (drawable = this.f10563n) == null || !drawable.isStateful()) {
            return;
        }
        this.f10563n.setState(getDrawableState());
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        Drawable drawable;
        super.jumpDrawablesToCurrentState();
        if (f10562g || (drawable = this.f10563n) == null) {
            return;
        }
        drawable.jumpToCurrentState();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Drawable drawable;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (f10562g || (drawable = this.f10563n) == null) {
            return;
        }
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        Drawable drawable;
        super.onSizeChanged(w2, h2, oldw, oldh);
        if (f10562g || (drawable = this.f10563n) == null) {
            return;
        }
        drawable.setBounds(0, 0, w2, h2);
        invalidate();
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        if (f10562g) {
            super.setForeground(drawable);
            return;
        }
        Drawable drawable2 = this.f10563n;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f10563n);
        }
        this.f10563n = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
        requestLayout();
        invalidate();
    }

    public void setForegroundResource(int drawableResId) {
        setForeground(getContext().getResources().getDrawable(drawableResId));
    }

    @Override // android.widget.ImageView, android.view.View
    protected boolean verifyDrawable(Drawable who) {
        return f10562g ? super.verifyDrawable(who) : super.verifyDrawable(who) || who == this.f10563n;
    }

    public ForegroundImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (f10562g) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, fn3e.C2036i.v5);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
