package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import zy.dd;
import zy.hyr;

/* JADX INFO: renamed from: androidx.cardview.widget.g */
/* JADX INFO: compiled from: RoundRectDrawable.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(21)
class C0241g extends Drawable {

    /* JADX INFO: renamed from: k */
    private float f1308k;

    /* JADX INFO: renamed from: n */
    private float f1309n;

    /* JADX INFO: renamed from: p */
    private ColorStateList f1310p;

    /* JADX INFO: renamed from: q */
    private final Rect f1311q;

    /* JADX INFO: renamed from: s */
    private PorterDuffColorFilter f1312s;

    /* JADX INFO: renamed from: y */
    private ColorStateList f1313y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final RectF f47028zy;

    /* JADX INFO: renamed from: g */
    private boolean f1307g = false;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f47025f7l8 = true;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private PorterDuff.Mode f47026ld6 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Paint f47027toq = new Paint(5);

    C0241g(ColorStateList colorStateList, float f2) {
        this.f1308k = f2;
        m799n(colorStateList);
        this.f47028zy = new RectF();
        this.f1311q = new Rect();
    }

    /* JADX INFO: renamed from: k */
    private PorterDuffColorFilter m798k(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: n */
    private void m799n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1313y = colorStateList;
        this.f47027toq.setColor(colorStateList.getColorForState(getState(), this.f1313y.getDefaultColor()));
    }

    /* JADX INFO: renamed from: s */
    private void m800s(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f47028zy.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1311q.set(rect);
        if (this.f1307g) {
            this.f1311q.inset((int) Math.ceil(f7l8.zy(this.f1309n, this.f1308k, this.f47025f7l8)), (int) Math.ceil(f7l8.m791q(this.f1309n, this.f1308k, this.f47025f7l8)));
            this.f47028zy.set(this.f1311q);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z2;
        Paint paint = this.f47027toq;
        if (this.f1312s == null || paint.getColorFilter() != null) {
            z2 = false;
        } else {
            paint.setColorFilter(this.f1312s);
            z2 = true;
        }
        RectF rectF = this.f47028zy;
        float f2 = this.f1308k;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z2) {
            paint.setColorFilter(null);
        }
    }

    void f7l8(float f2, boolean z2, boolean z3) {
        if (f2 == this.f1309n && this.f1307g == z2 && this.f47025f7l8 == z3) {
            return;
        }
        this.f1309n = f2;
        this.f1307g = z2;
        this.f47025f7l8 = z3;
        m800s(null);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    public void m801g(@dd ColorStateList colorStateList) {
        m799n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1311q, this.f1308k);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1310p;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1313y) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m800s(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1313y;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z2 = colorForState != this.f47027toq.getColor();
        if (z2) {
            this.f47027toq.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1310p;
        if (colorStateList2 == null || (mode = this.f47026ld6) == null) {
            return z2;
        }
        this.f1312s = m798k(colorStateList2, mode);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public float m802q() {
        return this.f1308k;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f47027toq.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f47027toq.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1310p = colorStateList;
        this.f1312s = m798k(colorStateList, this.f47026ld6);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f47026ld6 = mode;
        this.f1312s = m798k(this.f1310p, mode);
        invalidateSelf();
    }

    public ColorStateList toq() {
        return this.f1313y;
    }

    /* JADX INFO: renamed from: y */
    void m803y(float f2) {
        if (f2 == this.f1308k) {
            return;
        }
        this.f1308k = f2;
        m800s(null);
        invalidateSelf();
    }

    float zy() {
        return this.f1309n;
    }
}
