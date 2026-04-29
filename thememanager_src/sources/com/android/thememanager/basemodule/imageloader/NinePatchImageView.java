package com.android.thememanager.basemodule.imageloader;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import zy.dd;

/* JADX INFO: loaded from: classes.dex */
public class NinePatchImageView extends ImageRequestRecyclableImageView {
    public NinePatchImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int l2, int t2, int r2, int b2) {
        ImageView.ScaleType scaleType = getScaleType();
        if (getDrawable() instanceof NinePatchDrawable) {
            setScaleType(ImageView.ScaleType.FIT_XY);
        }
        boolean frame = super.setFrame(l2, t2, r2, b2);
        setScaleType(scaleType);
        return frame;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@dd Drawable drawable) {
        ImageView.ScaleType scaleType = getScaleType();
        if (getDrawable() instanceof NinePatchDrawable) {
            setScaleType(ImageView.ScaleType.FIT_XY);
        }
        super.setImageDrawable(drawable);
        setScaleType(scaleType);
    }

    public NinePatchImageView(Context context, @dd AttributeSet attrs) {
        super(context, attrs);
    }

    public NinePatchImageView(Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
