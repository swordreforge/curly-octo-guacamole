package miuix.smooth;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import miuix.smooth.toq;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class SmoothFrameLayout2 extends FrameLayout {

    /* JADX INFO: renamed from: r */
    private static final String f41659r = "SmoothFrameLayout2";

    /* JADX INFO: renamed from: g */
    private Paint f41660g;

    /* JADX INFO: renamed from: h */
    private float[] f41661h;

    /* JADX INFO: renamed from: i */
    private float[] f41662i;

    /* JADX INFO: renamed from: k */
    private RectF f41663k;

    /* JADX INFO: renamed from: n */
    private Paint f41664n;

    /* JADX INFO: renamed from: p */
    private Path f41665p;

    /* JADX INFO: renamed from: q */
    private float f41666q;

    /* JADX INFO: renamed from: s */
    private int f41667s;

    /* JADX INFO: renamed from: t */
    private boolean f41668t;

    /* JADX INFO: renamed from: y */
    private int f41669y;

    /* JADX INFO: renamed from: z */
    private boolean f41670z;

    public SmoothFrameLayout2(@lvui Context context) {
        this(context, null);
    }

    private void f7l8() {
        invalidateOutline();
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    private void m26595g(Canvas canvas) {
        this.f41665p.reset();
        float f2 = this.f41669y * 0.5f;
        float[] fArr = this.f41661h;
        if (fArr == null) {
            Path path = this.f41665p;
            RectF rectF = this.f41663k;
            float f3 = rectF.left + f2;
            float f4 = rectF.top + f2;
            float f5 = rectF.right - f2;
            float f6 = rectF.bottom - f2;
            float f7 = this.f41666q;
            path.addRoundRect(f3, f4, f5, f6, f7 + f2, f7 + f2, Path.Direction.CW);
        } else {
            float[] fArr2 = (float[]) fArr.clone();
            this.f41662i = fArr2;
            float[] fArr3 = this.f41661h;
            fArr2[0] = fArr3[0] + f2;
            fArr2[1] = fArr3[1] + f2;
            fArr2[2] = fArr3[2] + f2;
            fArr2[3] = fArr3[3] + f2;
            Path path2 = this.f41665p;
            RectF rectF2 = this.f41663k;
            path2.addRoundRect(rectF2.left + f2, rectF2.top + f2, rectF2.right - f2, rectF2.bottom - f2, fArr2, Path.Direction.CW);
        }
        canvas.drawPath(this.f41665p, this.f41660g);
    }

    /* JADX INFO: renamed from: n */
    private void m26596n(Canvas canvas) {
        this.f41665p.reset();
        float[] fArr = this.f41661h;
        if (fArr == null) {
            Path path = this.f41665p;
            RectF rectF = this.f41663k;
            float f2 = this.f41666q;
            path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        } else {
            this.f41665p.addRoundRect(this.f41663k, fArr, Path.Direction.CW);
        }
        canvas.clipPath(this.f41665p);
    }

    /* JADX INFO: renamed from: q */
    private void m26597q(Canvas canvas) {
        this.f41665p.reset();
        float f2 = this.f41669y * 0.5f;
        float[] fArr = this.f41661h;
        if (fArr == null) {
            Path path = this.f41665p;
            RectF rectF = this.f41663k;
            float f3 = rectF.left + f2;
            float f4 = rectF.top + f2;
            float f5 = rectF.right - f2;
            float f6 = rectF.bottom - f2;
            float f7 = this.f41666q;
            path.addRoundRect(f3, f4, f5, f6, f7 + f2, f7 + f2, Path.Direction.CW);
        } else {
            float[] fArr2 = (float[]) fArr.clone();
            this.f41662i = fArr2;
            float[] fArr3 = this.f41661h;
            fArr2[0] = fArr3[0] + f2;
            fArr2[1] = fArr3[1] + f2;
            fArr2[2] = fArr3[2] + f2;
            fArr2[3] = fArr3[3] + f2;
            Path path2 = this.f41665p;
            RectF rectF2 = this.f41663k;
            path2.addRoundRect(rectF2.left + f2, rectF2.top + f2, rectF2.right - f2, rectF2.bottom - f2, fArr2, Path.Direction.CW);
        }
        canvas.clipPath(this.f41665p);
    }

    private void setSmoothCornerEnable(boolean z2) {
        C7334n.m26604g(this, z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        int iSave = canvas.save();
        if (!this.f41668t) {
            m26596n(canvas);
        }
        if (this.f41669y > 0) {
            int iSave2 = canvas.save();
            m26597q(canvas);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave2);
        } else {
            super.dispatchDraw(canvas);
        }
        if (!this.f41668t && this.f41669y > 0) {
            m26595g(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        m26596n(canvas);
        this.f41668t = true;
        if (this.f41669y > 0) {
            int iSave2 = canvas.save();
            m26597q(canvas);
            super.draw(canvas);
            canvas.restoreToCount(iSave2);
        } else {
            super.draw(canvas);
        }
        if (this.f41669y > 0) {
            m26595g(canvas);
        }
        this.f41668t = false;
        canvas.restoreToCount(iSave);
    }

    public float[] getCornerRadii() {
        return (float[]) this.f41661h.clone();
    }

    public float getCornerRadius() {
        return this.f41666q;
    }

    public int getStrokeColor() {
        return this.f41667s;
    }

    public int getStrokeWidth() {
        return this.f41669y;
    }

    public boolean getUseSmooth() {
        return this.f41670z;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f41663k.set(0.0f, 0.0f, i2, i3);
    }

    public void setCornerRadii(float[] fArr) {
        this.f41661h = fArr;
        f7l8();
    }

    public void setCornerRadius(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.f41666q = f2;
        this.f41661h = null;
        f7l8();
    }

    public void setStrokeColor(int i2) {
        this.f41667s = i2;
        f7l8();
    }

    public void setStrokeWidth(int i2) {
        this.f41669y = i2;
        f7l8();
    }

    public void setUseSmooth(boolean z2) {
        this.f41670z = z2;
        setSmoothCornerEnable(z2);
    }

    public SmoothFrameLayout2(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SmoothFrameLayout2(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f41663k = new RectF();
        this.f41665p = new Path();
        this.f41668t = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.C7340p.f90272sok);
        this.f41666q = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.C7340p.f90214cfr, 0);
        int i3 = toq.C7340p.f90283w831;
        if (typedArrayObtainStyledAttributes.hasValue(i3) || typedArrayObtainStyledAttributes.hasValue(toq.C7340p.f90294z4) || typedArrayObtainStyledAttributes.hasValue(toq.C7340p.f90245kcsr) || typedArrayObtainStyledAttributes.hasValue(toq.C7340p.f90292yqrt)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i3, 0);
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.C7340p.f90294z4, 0);
            float dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.C7340p.f90245kcsr, 0);
            float dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.C7340p.f90292yqrt, 0);
            setCornerRadii(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize4});
        }
        this.f41669y = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.C7340p.f90295zkd, 0);
        this.f41667s = typedArrayObtainStyledAttributes.getColor(toq.C7340p.f90232gc3c, 0);
        this.f41670z = typedArrayObtainStyledAttributes.getBoolean(toq.C7340p.f90284was, true);
        Boolean bool = C7334n.f41680k;
        if (bool != null) {
            this.f41670z = bool.booleanValue();
        }
        if (this.f41670z) {
            setSmoothCornerEnable(true);
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f41664n = paint;
        paint.setFlags(1);
        Paint paint2 = new Paint();
        this.f41660g = paint2;
        paint2.setFlags(1);
        this.f41660g.setStyle(Paint.Style.STROKE);
        this.f41660g.setStrokeWidth(this.f41669y);
        this.f41660g.setColor(this.f41667s);
    }
}
