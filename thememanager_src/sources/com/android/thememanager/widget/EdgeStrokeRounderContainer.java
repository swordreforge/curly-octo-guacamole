package com.android.thememanager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.thememanager.R;

/* JADX INFO: loaded from: classes2.dex */
public class EdgeStrokeRounderContainer extends FrameLayout {

    /* JADX INFO: renamed from: g */
    private boolean f17760g;

    /* JADX INFO: renamed from: k */
    private Paint f17761k;

    /* JADX INFO: renamed from: n */
    private RectF f17762n;

    /* JADX INFO: renamed from: p */
    private RoundCornerImageView f17763p;

    /* JADX INFO: renamed from: q */
    private float f17764q;

    /* JADX INFO: renamed from: s */
    private int f17765s;

    /* JADX INFO: renamed from: y */
    private float f17766y;

    public EdgeStrokeRounderContainer(Context context) {
        super(context);
        this.f17762n = new RectF();
        m10490k();
    }

    /* JADX INFO: renamed from: k */
    private void m10490k() {
        this.f17760g = true;
        this.f17765s = getContext().getResources().getColor(R.color.super_wallpaper_land_position_stroke_color);
        this.f17766y = getContext().getResources().getDimension(R.dimen.super_wallpaper_land_position_image_inner_stroke);
        this.f17764q = getContext().getResources().getDimension(R.dimen.super_wallpaper_land_position_image_inner_corner);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f17760g) {
            if (this.f17761k == null) {
                Paint paint = new Paint(1);
                this.f17761k = paint;
                paint.setColor(this.f17765s);
                this.f17761k.setStyle(Paint.Style.STROKE);
                this.f17761k.setStrokeWidth(this.f17766y);
            }
            float strokeWidth = this.f17761k.getStrokeWidth();
            Rect clipBounds = canvas.getClipBounds();
            float f2 = strokeWidth / 2.0f;
            this.f17762n.set(clipBounds.left + f2, clipBounds.top + f2, clipBounds.right - f2, clipBounds.bottom - f2);
            RectF rectF = this.f17762n;
            float f3 = this.f17764q;
            canvas.drawRoundRect(rectF, f3, f3, this.f17761k);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) findViewById(R.id.land_img);
        this.f17763p = roundCornerImageView;
        roundCornerImageView.setRectRoundRadius((int) this.f17764q);
    }

    public void setNeedDrawEdge(boolean needDrawEdge) {
        this.f17760g = needDrawEdge;
        invalidate();
    }

    public EdgeStrokeRounderContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f17762n = new RectF();
        m10490k();
    }
}
