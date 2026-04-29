package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import x2.C7748k;
import zy.dd;

/* JADX INFO: compiled from: RoundRectDrawableWithShadow.java */
/* JADX INFO: loaded from: classes.dex */
class f7l8 extends Drawable {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final double f47014cdj = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final float f47015ki = 1.5f;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    static InterfaceC0240k f47016t8r;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private Path f47017f7l8;

    /* JADX INFO: renamed from: g */
    private float f1299g;

    /* JADX INFO: renamed from: k */
    private final int f1301k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private ColorStateList f47019ld6;

    /* JADX INFO: renamed from: n */
    private final RectF f1302n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final int f47020n7h;

    /* JADX INFO: renamed from: p */
    private float f1303p;

    /* JADX INFO: renamed from: q */
    private Paint f1304q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final int f47021qrj;

    /* JADX INFO: renamed from: s */
    private float f1305s;

    /* JADX INFO: renamed from: y */
    private float f1306y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Paint f47024zy;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f47023x2 = true;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private boolean f47018kja0 = true;

    /* JADX INFO: renamed from: h */
    private boolean f1300h = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Paint f47022toq = new Paint(5);

    /* JADX INFO: renamed from: androidx.cardview.widget.f7l8$k */
    /* JADX INFO: compiled from: RoundRectDrawableWithShadow.java */
    interface InterfaceC0240k {
        /* JADX INFO: renamed from: k */
        void mo797k(Canvas canvas, RectF rectF, float f2, Paint paint);
    }

    f7l8(Resources resources, ColorStateList colorStateList, float f2, float f3, float f4) {
        this.f47021qrj = resources.getColor(C7748k.toq.f45628q);
        this.f47020n7h = resources.getColor(C7748k.toq.f99920zy);
        this.f1301k = resources.getDimensionPixelSize(C7748k.zy.f45629k);
        n7h(colorStateList);
        Paint paint = new Paint(5);
        this.f47024zy = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1299g = (int) (f2 + 0.5f);
        this.f1302n = new RectF();
        Paint paint2 = new Paint(this.f47024zy);
        this.f1304q = paint2;
        paint2.setAntiAlias(false);
        t8r(f3, f4);
    }

    /* JADX INFO: renamed from: i */
    private int m788i(float f2) {
        int i2 = (int) (f2 + 0.5f);
        return i2 % 2 == 1 ? i2 - 1 : i2;
    }

    /* JADX INFO: renamed from: k */
    private void m789k(Rect rect) {
        float f2 = this.f1306y;
        float f3 = 1.5f * f2;
        this.f1302n.set(rect.left + f2, rect.top + f3, rect.right - f2, rect.bottom - f3);
        toq();
    }

    /* JADX INFO: renamed from: n */
    private void m790n(Canvas canvas) {
        float f2 = this.f1299g;
        float f3 = (-f2) - this.f1305s;
        float f4 = f2 + this.f1301k + (this.f1303p / 2.0f);
        float f5 = f4 * 2.0f;
        boolean z2 = this.f1302n.width() - f5 > 0.0f;
        boolean z3 = this.f1302n.height() - f5 > 0.0f;
        int iSave = canvas.save();
        RectF rectF = this.f1302n;
        canvas.translate(rectF.left + f4, rectF.top + f4);
        canvas.drawPath(this.f47017f7l8, this.f47024zy);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f1302n.width() - f5, -this.f1299g, this.f1304q);
        }
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        RectF rectF2 = this.f1302n;
        canvas.translate(rectF2.right - f4, rectF2.bottom - f4);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f47017f7l8, this.f47024zy);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f1302n.width() - f5, (-this.f1299g) + this.f1305s, this.f1304q);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        RectF rectF3 = this.f1302n;
        canvas.translate(rectF3.left + f4, rectF3.bottom - f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f47017f7l8, this.f47024zy);
        if (z3) {
            canvas.drawRect(0.0f, f3, this.f1302n.height() - f5, -this.f1299g, this.f1304q);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        RectF rectF4 = this.f1302n;
        canvas.translate(rectF4.right - f4, rectF4.top + f4);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f47017f7l8, this.f47024zy);
        if (z3) {
            canvas.drawRect(0.0f, f3, this.f1302n.height() - f5, -this.f1299g, this.f1304q);
        }
        canvas.restoreToCount(iSave4);
    }

    private void n7h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f47019ld6 = colorStateList;
        this.f47022toq.setColor(colorStateList.getColorForState(getState(), this.f47019ld6.getDefaultColor()));
    }

    /* JADX INFO: renamed from: q */
    static float m791q(float f2, float f3, boolean z2) {
        return z2 ? (float) (((double) (f2 * 1.5f)) + ((1.0d - f47014cdj) * ((double) f3))) : f2 * 1.5f;
    }

    private void t8r(float f2, float f3) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f2 + ". Must be >= 0");
        }
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f3 + ". Must be >= 0");
        }
        float fM788i = m788i(f2);
        float fM788i2 = m788i(f3);
        if (fM788i > fM788i2) {
            if (!this.f1300h) {
                this.f1300h = true;
            }
            fM788i = fM788i2;
        }
        if (this.f1303p == fM788i && this.f1306y == fM788i2) {
            return;
        }
        this.f1303p = fM788i;
        this.f1306y = fM788i2;
        this.f1305s = (int) ((fM788i * 1.5f) + this.f1301k + 0.5f);
        this.f47023x2 = true;
        invalidateSelf();
    }

    private void toq() {
        float f2 = this.f1299g;
        RectF rectF = new RectF(-f2, -f2, f2, f2);
        RectF rectF2 = new RectF(rectF);
        float f3 = this.f1305s;
        rectF2.inset(-f3, -f3);
        Path path = this.f47017f7l8;
        if (path == null) {
            this.f47017f7l8 = new Path();
        } else {
            path.reset();
        }
        this.f47017f7l8.setFillType(Path.FillType.EVEN_ODD);
        this.f47017f7l8.moveTo(-this.f1299g, 0.0f);
        this.f47017f7l8.rLineTo(-this.f1305s, 0.0f);
        this.f47017f7l8.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f47017f7l8.arcTo(rectF, 270.0f, -90.0f, false);
        this.f47017f7l8.close();
        float f4 = this.f1299g;
        float f5 = f4 / (this.f1305s + f4);
        Paint paint = this.f47024zy;
        float f6 = this.f1299g + this.f1305s;
        int i2 = this.f47021qrj;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{i2, i2, this.f47020n7h}, new float[]{0.0f, f5, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f1304q;
        float f7 = this.f1299g;
        float f8 = this.f1305s;
        int i3 = this.f47021qrj;
        paint2.setShader(new LinearGradient(0.0f, (-f7) + f8, 0.0f, (-f7) - f8, new int[]{i3, i3, this.f47020n7h}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f1304q.setAntiAlias(false);
    }

    static float zy(float f2, float f3, boolean z2) {
        return z2 ? (float) (((double) f2) + ((1.0d - f47014cdj) * ((double) f3))) : f2;
    }

    void cdj(float f2) {
        t8r(this.f1303p, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f47023x2) {
            m789k(getBounds());
            this.f47023x2 = false;
        }
        canvas.translate(0.0f, this.f1303p / 2.0f);
        m790n(canvas);
        canvas.translate(0.0f, (-this.f1303p) / 2.0f);
        f47016t8r.mo797k(canvas, this.f1302n, this.f1299g, this.f47022toq);
    }

    float f7l8() {
        return this.f1299g;
    }

    /* JADX INFO: renamed from: g */
    ColorStateList m792g() {
        return this.f47019ld6;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(m791q(this.f1306y, this.f1299g, this.f47018kja0));
        int iCeil2 = (int) Math.ceil(zy(this.f1306y, this.f1299g, this.f47018kja0));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    /* JADX INFO: renamed from: h */
    void m793h(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f2 + ". Must be >= 0");
        }
        float f3 = (int) (f2 + 0.5f);
        if (this.f1299g == f3) {
            return;
        }
        this.f1299g = f3;
        this.f47023x2 = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f47019ld6;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    void ki(float f2) {
        t8r(f2, this.f1306y);
    }

    void kja0(@dd ColorStateList colorStateList) {
        n7h(colorStateList);
        invalidateSelf();
    }

    float ld6() {
        float f2 = this.f1306y;
        return (Math.max(f2, this.f1299g + this.f1301k + (f2 / 2.0f)) * 2.0f) + ((this.f1306y + this.f1301k) * 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f47023x2 = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f47019ld6;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f47022toq.getColor() == colorForState) {
            return false;
        }
        this.f47022toq.setColor(colorForState);
        this.f47023x2 = true;
        invalidateSelf();
        return true;
    }

    /* JADX INFO: renamed from: p */
    float m794p() {
        float f2 = this.f1306y;
        return (Math.max(f2, this.f1299g + this.f1301k + ((f2 * 1.5f) / 2.0f)) * 2.0f) + (((this.f1306y * 1.5f) + this.f1301k) * 2.0f);
    }

    void qrj(boolean z2) {
        this.f47018kja0 = z2;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: s */
    float m795s() {
        return this.f1306y;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f47022toq.setAlpha(i2);
        this.f47024zy.setAlpha(i2);
        this.f1304q.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f47022toq.setColorFilter(colorFilter);
    }

    float x2() {
        return this.f1303p;
    }

    /* JADX INFO: renamed from: y */
    void m796y(Rect rect) {
        getPadding(rect);
    }
}
