package miuix.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import gb.toq;
import java.util.Arrays;
import miuix.smooth.C7334n;

/* JADX INFO: loaded from: classes3.dex */
public class RoundFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: g */
    private Region f40452g;

    /* JADX INFO: renamed from: h */
    private int f40453h;

    /* JADX INFO: renamed from: i */
    private boolean f40454i;

    /* JADX INFO: renamed from: k */
    private float[] f40455k;

    /* JADX INFO: renamed from: n */
    private Paint f40456n;

    /* JADX INFO: renamed from: p */
    private float f40457p;

    /* JADX INFO: renamed from: q */
    private Path f40458q;

    /* JADX INFO: renamed from: s */
    private float f40459s;

    /* JADX INFO: renamed from: y */
    private RectF f40460y;

    public RoundFrameLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: n */
    private void m26023n() {
        if (this.f40455k == null) {
            return;
        }
        int iWidth = (int) this.f40460y.width();
        int iHeight = (int) this.f40460y.height();
        RectF rectF = new RectF();
        rectF.left = getPaddingLeft();
        rectF.top = getPaddingTop();
        rectF.right = iWidth - getPaddingRight();
        rectF.bottom = iHeight - getPaddingBottom();
        this.f40458q.reset();
        this.f40458q.addRoundRect(rectF, this.f40455k, Path.Direction.CW);
        this.f40452g.setPath(this.f40458q, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
    }

    private void toq() {
        float dimensionPixelSize = getContext().getResources().getDimensionPixelSize(toq.f7l8.b972);
        this.f40459s = dimensionPixelSize;
        this.f40455k = new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize};
        this.f40460y = new RectF();
        this.f40454i = true;
        C7334n.m26604g(this, true);
        this.f40458q = new Path();
        this.f40452g = new Region();
        Paint paint = new Paint();
        this.f40456n = paint;
        paint.setColor(-1);
        this.f40456n.setAntiAlias(true);
    }

    private void zy(Canvas canvas) {
        if (this.f40455k == null || this.f40457p == 0.0f || Color.alpha(this.f40453h) == 0) {
            return;
        }
        int iWidth = (int) this.f40460y.width();
        int iHeight = (int) this.f40460y.height();
        RectF rectF = new RectF();
        float f2 = this.f40457p / 2.0f;
        rectF.left = getPaddingLeft() + f2;
        rectF.top = getPaddingTop() + f2;
        rectF.right = (iWidth - getPaddingRight()) - f2;
        rectF.bottom = (iHeight - getPaddingBottom()) - f2;
        this.f40456n.reset();
        this.f40456n.setAntiAlias(true);
        this.f40456n.setColor(this.f40453h);
        this.f40456n.setStyle(Paint.Style.STROKE);
        this.f40456n.setStrokeWidth(this.f40457p);
        float f3 = this.f40459s - (f2 * 2.0f);
        canvas.drawRoundRect(rectF, f3, f3, this.f40456n);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m26025q(canvas);
        super.dispatchDraw(canvas);
        zy(canvas);
    }

    /* JADX INFO: renamed from: k */
    public void m26024k(boolean z2) {
        this.f40454i = z2;
        C7334n.m26604g(this, z2);
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f40460y.set(0.0f, 0.0f, i2, i3);
        m26023n();
    }

    /* JADX INFO: renamed from: q */
    public void m26025q(Canvas canvas) {
        if (this.f40455k == null) {
            return;
        }
        canvas.clipPath(this.f40458q);
    }

    public void setBorder(float f2, int i2) {
        this.f40457p = f2;
        this.f40453h = i2;
        invalidate();
    }

    public void setRadius(float f2) {
        this.f40459s = f2;
        setRadius(new float[]{f2, f2, f2, f2, f2, f2, f2, f2});
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        toq();
    }

    public void setRadius(float[] fArr) {
        if (Arrays.equals(this.f40455k, fArr)) {
            return;
        }
        this.f40455k = fArr;
        invalidate();
    }
}
