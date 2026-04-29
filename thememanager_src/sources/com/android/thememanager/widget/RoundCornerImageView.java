package com.android.thememanager.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class RoundCornerImageView extends ImageView {

    /* JADX INFO: renamed from: g */
    private Bitmap f17784g;

    /* JADX INFO: renamed from: k */
    private int f17785k;

    /* JADX INFO: renamed from: n */
    private RectF f17786n;

    /* JADX INFO: renamed from: q */
    private Paint f17787q;

    /* JADX INFO: renamed from: s */
    private Matrix f17788s;

    /* JADX INFO: renamed from: y */
    private BitmapShader f17789y;

    public RoundCornerImageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private Bitmap m10493k(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (!(drawable instanceof ColorDrawable)) {
            return null;
        }
        Rect bounds = drawable.getBounds();
        int i2 = bounds.right - bounds.left;
        int i3 = bounds.bottom - bounds.top;
        int color = ((ColorDrawable) drawable).getColor();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getContext().getResources().getDisplayMetrics(), i2, i3, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawARGB(Color.alpha(color), Color.red(color), Color.green(color), Color.blue(color));
        return bitmapCreateBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap bitmapM10493k = m10493k(getDrawable());
        if (bitmapM10493k == null) {
            super.onDraw(canvas);
            return;
        }
        int width = getWidth();
        int height = getHeight();
        if (this.f17789y == null || !bitmapM10493k.equals(this.f17784g)) {
            this.f17784g = bitmapM10493k;
            Bitmap bitmap = this.f17784g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f17789y = new BitmapShader(bitmap, tileMode, tileMode);
        }
        float f2 = width;
        float f3 = height;
        float fMin = Math.min((f2 * 1.0f) / bitmapM10493k.getWidth(), (1.0f * f3) / bitmapM10493k.getHeight());
        this.f17788s.setScale(fMin, fMin);
        this.f17789y.setLocalMatrix(this.f17788s);
        this.f17787q.setShader(this.f17789y);
        this.f17786n.set(0.0f, 0.0f, f2, f3);
        RectF rectF = this.f17786n;
        int i2 = this.f17785k;
        canvas.drawRoundRect(rectF, i2, i2, this.f17787q);
    }

    public void setRectRoundRadius(int radius) {
        this.f17785k = radius;
        invalidate();
    }

    public RoundCornerImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RoundCornerImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f17785k = 100;
        this.f17787q = new Paint(1);
        this.f17786n = new RectF();
        this.f17788s = new Matrix();
    }
}
