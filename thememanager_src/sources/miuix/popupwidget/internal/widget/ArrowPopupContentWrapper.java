package miuix.popupwidget.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import c25.toq;

/* JADX INFO: loaded from: classes3.dex */
public class ArrowPopupContentWrapper extends LinearLayout {

    /* JADX INFO: renamed from: g */
    private Bitmap f40974g;

    /* JADX INFO: renamed from: k */
    private Paint f40975k;

    /* JADX INFO: renamed from: n */
    private Bitmap f40976n;

    /* JADX INFO: renamed from: q */
    private Bitmap f40977q;

    /* JADX INFO: renamed from: y */
    private Bitmap f40978y;

    public ArrowPopupContentWrapper(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.dispatchDraw(canvas);
        canvas.drawBitmap(this.f40977q, getPaddingLeft() + 0, getPaddingTop() + 0, this.f40975k);
        canvas.drawBitmap(this.f40976n, (getWidth() - this.f40976n.getWidth()) - getPaddingRight(), getPaddingTop() + 0, this.f40975k);
        canvas.drawBitmap(this.f40974g, getPaddingLeft() + 0, (getHeight() - this.f40974g.getHeight()) - getPaddingBottom(), this.f40975k);
        canvas.drawBitmap(this.f40978y, (getWidth() - this.f40978y.getWidth()) - getPaddingRight(), (getHeight() - this.f40978y.getHeight()) - getPaddingBottom(), this.f40975k);
        canvas.restore();
    }

    public ArrowPopupContentWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ArrowPopupContentWrapper(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Paint paint = new Paint();
        this.f40975k = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f40975k.setAntiAlias(true);
        Resources resources = getResources();
        this.f40977q = BitmapFactory.decodeResource(resources, toq.f7l8.j3y2);
        this.f40976n = BitmapFactory.decodeResource(resources, toq.f7l8.ge);
        this.f40974g = BitmapFactory.decodeResource(resources, toq.f7l8.z5);
        this.f40978y = BitmapFactory.decodeResource(resources, toq.f7l8.b2);
    }
}
