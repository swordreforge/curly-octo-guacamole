package com.android.thememanager.basemodule.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class CornerImageView extends ImageView {

    /* JADX INFO: renamed from: g */
    private final PorterDuffXfermode f10542g;

    /* JADX INFO: renamed from: k */
    private Path f10543k;

    /* JADX INFO: renamed from: n */
    private RectF f10544n;

    /* JADX INFO: renamed from: q */
    private float[] f10545q;

    public CornerImageView(Context context) {
        super(context);
        this.f10542g = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f10543k == null) {
            super.onDraw(canvas);
            return;
        }
        this.f10544n.set(0.0f, 0.0f, getWidth(), getHeight());
        this.f10543k.addRoundRect(this.f10544n, this.f10545q, Path.Direction.CCW);
        try {
            canvas.clipPath(this.f10543k);
        } catch (UnsupportedOperationException e2) {
            e2.printStackTrace();
        }
        super.onDraw(canvas);
    }

    public void setCorner(int corner) {
        setCorner(corner, corner, corner, corner);
    }

    public void setCorner(int cornerLeftTop, int cornerRightTop, int cornerRightBottom, int cornerLeftBottom) {
        this.f10543k = new Path();
        float f2 = cornerLeftTop;
        float f3 = cornerRightTop;
        float f4 = cornerRightBottom;
        float f5 = cornerLeftBottom;
        this.f10545q = new float[]{f2, f2, f3, f3, f4, f4, f5, f5};
        if (this.f10544n == null) {
            this.f10544n = new RectF();
        }
        invalidate();
    }

    public CornerImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f10542g = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    public CornerImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f10542g = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }
}
