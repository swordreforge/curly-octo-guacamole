package miuix.smooth;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import miuix.smooth.toq;
import uo.C7699k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class SmoothFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: g */
    private static final PorterDuffXfermode f41655g = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);

    /* JADX INFO: renamed from: k */
    private C7699k f41656k;

    /* JADX INFO: renamed from: n */
    private RectF f41657n;

    /* JADX INFO: renamed from: q */
    private Rect f41658q;

    public SmoothFrameLayout(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m26594k() {
        toq();
        invalidateOutline();
        invalidate();
    }

    private void toq() {
        this.f41656k.m28093p(this.f41658q);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        int iSaveLayer = getLayerType() != 2 ? canvas.saveLayer(this.f41657n, null, 31) : -1;
        super.dispatchDraw(canvas);
        this.f41656k.m28091k(canvas, f41655g);
        if (getLayerType() != 2) {
            canvas.restoreToCount(iSaveLayer);
        }
        this.f41656k.toq(canvas);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int iSaveLayer = getLayerType() != 2 ? canvas.saveLayer(this.f41657n, null, 31) : -1;
        super.draw(canvas);
        this.f41656k.m28091k(canvas, f41655g);
        if (getLayerType() != 2) {
            canvas.restoreToCount(iSaveLayer);
        }
        this.f41656k.toq(canvas);
    }

    public float[] getCornerRadii() {
        if (this.f41656k.m28094q() == null) {
            return null;
        }
        return (float[]) this.f41656k.m28094q().clone();
    }

    public float getCornerRadius() {
        return this.f41656k.m28092n();
    }

    public int getStrokeColor() {
        return this.f41656k.m28096y();
    }

    public int getStrokeWidth() {
        return this.f41656k.m28095s();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f41658q.set(0, 0, i2, i3);
        this.f41657n.set(0.0f, 0.0f, i2, i3);
        toq();
    }

    public void setCornerRadii(float[] fArr) {
        this.f41656k.x2(fArr);
        if (fArr == null) {
            this.f41656k.qrj(0.0f);
        }
        m26594k();
    }

    public void setCornerRadius(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.f41656k.qrj(f2);
        this.f41656k.x2(null);
        m26594k();
    }

    public void setStrokeColor(int i2) {
        if (this.f41656k.m28096y() != i2) {
            this.f41656k.n7h(i2);
            m26594k();
        }
    }

    public void setStrokeWidth(int i2) {
        if (this.f41656k.m28095s() != i2) {
            this.f41656k.kja0(i2);
            m26594k();
        }
    }

    public SmoothFrameLayout(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SmoothFrameLayout(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f41658q = new Rect();
        this.f41657n = new RectF();
        this.f41656k = new C7699k();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.C7340p.f90231gbni);
        setCornerRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.C7340p.f90297zsr0, 0));
        int i3 = toq.C7340p.f90266py;
        if (typedArrayObtainStyledAttributes.hasValue(i3) || typedArrayObtainStyledAttributes.hasValue(toq.C7340p.f90239i9jn) || typedArrayObtainStyledAttributes.hasValue(toq.C7340p.f90270r8s8) || typedArrayObtainStyledAttributes.hasValue(toq.C7340p.f90251ltg8)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i3, 0);
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.C7340p.f90239i9jn, 0);
            float dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.C7340p.f90270r8s8, 0);
            float dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.C7340p.f90251ltg8, 0);
            setCornerRadii(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize4});
        }
        setStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.C7340p.f90224etdu, 0));
        setStrokeColor(typedArrayObtainStyledAttributes.getColor(toq.C7340p.f90279v0af, 0));
        setLayerType(typedArrayObtainStyledAttributes.getColor(toq.C7340p.f90254m4, 2), null);
        typedArrayObtainStyledAttributes.recycle();
    }
}
