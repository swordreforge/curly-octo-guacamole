package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.android.thememanager.router.app.entity.ThemeStatus;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: RoundedBitmapDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class x2 extends Drawable {

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f50450n7h = 3;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private float f50451f7l8;

    /* JADX INFO: renamed from: k */
    final Bitmap f3552k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f50452ld6;

    /* JADX INFO: renamed from: n */
    private final BitmapShader f3553n;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f50453qrj;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f50454toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f50455x2;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f50456zy = 119;

    /* JADX INFO: renamed from: q */
    private final Paint f3555q = new Paint(3);

    /* JADX INFO: renamed from: g */
    private final Matrix f3551g = new Matrix();

    /* JADX INFO: renamed from: y */
    final Rect f3557y = new Rect();

    /* JADX INFO: renamed from: s */
    private final RectF f3556s = new RectF();

    /* JADX INFO: renamed from: p */
    private boolean f3554p = true;

    x2(Resources resources, Bitmap bitmap) {
        this.f50454toq = ThemeStatus.Redeem.REDEEMING;
        if (resources != null) {
            this.f50454toq = resources.getDisplayMetrics().densityDpi;
        }
        this.f3552k = bitmap;
        if (bitmap != null) {
            m2433k();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f3553n = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.f50453qrj = -1;
            this.f50455x2 = -1;
            this.f3553n = null;
        }
    }

    /* JADX INFO: renamed from: k */
    private void m2433k() {
        this.f50455x2 = this.f3552k.getScaledWidth(this.f50454toq);
        this.f50453qrj = this.f3552k.getScaledHeight(this.f50454toq);
    }

    /* JADX INFO: renamed from: p */
    private static boolean m2434p(float f2) {
        return f2 > 0.05f;
    }

    private void t8r() {
        this.f50451f7l8 = Math.min(this.f50453qrj, this.f50455x2) / 2;
    }

    public void cdj(@lvui Canvas canvas) {
        m2435h(canvas.getDensity());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@lvui Canvas canvas) {
        Bitmap bitmap = this.f3552k;
        if (bitmap == null) {
            return;
        }
        m2436i();
        if (this.f3555q.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f3557y, this.f3555q);
            return;
        }
        RectF rectF = this.f3556s;
        float f2 = this.f50451f7l8;
        canvas.drawRoundRect(rectF, f2, f2, this.f3555q);
    }

    public boolean f7l8() {
        return this.f3555q.isAntiAlias();
    }

    /* JADX INFO: renamed from: g */
    void mo2423g(int i2, int i3, int i4, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f3555q.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f3555q.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f50453qrj;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f50455x2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.f50456zy != 119 || this.f50452ld6 || (bitmap = this.f3552k) == null || bitmap.hasAlpha() || this.f3555q.getAlpha() < 255 || m2434p(this.f50451f7l8)) ? -3 : -1;
    }

    /* JADX INFO: renamed from: h */
    public void m2435h(int i2) {
        if (this.f50454toq != i2) {
            if (i2 == 0) {
                i2 = ThemeStatus.Redeem.REDEEMING;
            }
            this.f50454toq = i2;
            if (this.f3552k != null) {
                m2433k();
            }
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: i */
    void m2436i() {
        if (this.f3554p) {
            if (this.f50452ld6) {
                int iMin = Math.min(this.f50455x2, this.f50453qrj);
                mo2423g(this.f50456zy, iMin, iMin, getBounds(), this.f3557y);
                int iMin2 = Math.min(this.f3557y.width(), this.f3557y.height());
                this.f3557y.inset(Math.max(0, (this.f3557y.width() - iMin2) / 2), Math.max(0, (this.f3557y.height() - iMin2) / 2));
                this.f50451f7l8 = iMin2 * 0.5f;
            } else {
                mo2423g(this.f50456zy, this.f50455x2, this.f50453qrj, getBounds(), this.f3557y);
            }
            this.f3556s.set(this.f3557y);
            if (this.f3553n != null) {
                Matrix matrix = this.f3551g;
                RectF rectF = this.f3556s;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f3551g.preScale(this.f3556s.width() / this.f3552k.getWidth(), this.f3556s.height() / this.f3552k.getHeight());
                this.f3553n.setLocalMatrix(this.f3551g);
                this.f3555q.setShader(this.f3553n);
            }
            this.f3554p = false;
        }
    }

    public void ki(@lvui DisplayMetrics displayMetrics) {
        m2435h(displayMetrics.densityDpi);
    }

    public void kja0(boolean z2) {
        throw new UnsupportedOperationException();
    }

    public void ld6(boolean z2) {
        this.f3555q.setAntiAlias(z2);
        invalidateSelf();
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public final Paint m2437n() {
        return this.f3555q;
    }

    public void n7h(int i2) {
        if (this.f50456zy != i2) {
            this.f50456zy = i2;
            this.f3554p = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@lvui Rect rect) {
        super.onBoundsChange(rect);
        if (this.f50452ld6) {
            t8r();
        }
        this.f3554p = true;
    }

    /* JADX INFO: renamed from: q */
    public int m2438q() {
        return this.f50456zy;
    }

    public void qrj(float f2) {
        if (this.f50451f7l8 == f2) {
            return;
        }
        this.f50452ld6 = false;
        if (m2434p(f2)) {
            this.f3555q.setShader(this.f3553n);
        } else {
            this.f3555q.setShader(null);
        }
        this.f50451f7l8 = f2;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: s */
    public boolean m2439s() {
        return this.f50452ld6;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (i2 != this.f3555q.getAlpha()) {
            this.f3555q.setAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3555q.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z2) {
        this.f3555q.setDither(z2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z2) {
        this.f3555q.setFilterBitmap(z2);
        invalidateSelf();
    }

    @dd
    public final Bitmap toq() {
        return this.f3552k;
    }

    public void x2(boolean z2) {
        this.f50452ld6 = z2;
        this.f3554p = true;
        if (!z2) {
            qrj(0.0f);
            return;
        }
        t8r();
        this.f3555q.setShader(this.f3553n);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: y */
    public boolean mo2424y() {
        throw new UnsupportedOperationException();
    }

    public float zy() {
        return this.f50451f7l8;
    }
}
