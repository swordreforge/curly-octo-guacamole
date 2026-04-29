package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p030n.C7397k;
import zy.uv6;
import zy.x2;
import zy.zurt;

/* JADX INFO: renamed from: androidx.appcompat.graphics.drawable.q */
/* JADX INFO: compiled from: DrawerArrowDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class C0111q extends Drawable {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final float f46638cdj = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: h */
    public static final int f356h = 3;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f46639kja0 = 2;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f46640n7h = 1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f46641qrj = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final Path f46642f7l8;

    /* JADX INFO: renamed from: g */
    private boolean f357g;

    /* JADX INFO: renamed from: k */
    private final Paint f358k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private float f46643ld6;

    /* JADX INFO: renamed from: n */
    private float f359n;

    /* JADX INFO: renamed from: p */
    private float f360p;

    /* JADX INFO: renamed from: q */
    private float f361q;

    /* JADX INFO: renamed from: s */
    private boolean f362s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private float f46644toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f46645x2;

    /* JADX INFO: renamed from: y */
    private final int f363y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private float f46646zy;

    /* JADX INFO: renamed from: androidx.appcompat.graphics.drawable.q$k */
    /* JADX INFO: compiled from: DrawerArrowDrawable.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface k {
    }

    public C0111q(Context context) {
        Paint paint = new Paint();
        this.f358k = paint;
        this.f46642f7l8 = new Path();
        this.f362s = false;
        this.f46645x2 = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C7397k.qrj.alcv, C7397k.toq.f92973vep5, C7397k.x2.f46314do);
        m265h(typedArrayObtainStyledAttributes.getColor(C7397k.qrj.cr3, 0));
        kja0(typedArrayObtainStyledAttributes.getDimension(C7397k.qrj.wu, 0.0f));
        m266i(typedArrayObtainStyledAttributes.getBoolean(C7397k.qrj.mla, true));
        ki(Math.round(typedArrayObtainStyledAttributes.getDimension(C7397k.qrj.l7o, 0.0f)));
        this.f363y = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7397k.qrj.bf5, 0);
        this.f46646zy = Math.round(typedArrayObtainStyledAttributes.getDimension(C7397k.qrj.brv, 0.0f));
        this.f46644toq = Math.round(typedArrayObtainStyledAttributes.getDimension(C7397k.qrj.z1r, 0.0f));
        this.f361q = typedArrayObtainStyledAttributes.getDimension(C7397k.qrj.verb, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static float ld6(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * f4);
    }

    public void cdj(int i2) {
        if (i2 != this.f46645x2) {
            this.f46645x2 = i2;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i2 = this.f46645x2;
        boolean z2 = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? androidx.core.graphics.drawable.zy.m2441g(this) == 0 : androidx.core.graphics.drawable.zy.m2441g(this) == 1))) {
            z2 = true;
        }
        float f2 = this.f46644toq;
        float fLd6 = ld6(this.f46646zy, (float) Math.sqrt(f2 * f2 * 2.0f), this.f360p);
        float fLd62 = ld6(this.f46646zy, this.f361q, this.f360p);
        float fRound = Math.round(ld6(0.0f, this.f46643ld6, this.f360p));
        float fLd63 = ld6(0.0f, f46638cdj, this.f360p);
        float fLd64 = ld6(z2 ? 0.0f : -180.0f, z2 ? 180.0f : 0.0f, this.f360p);
        double d2 = fLd6;
        double d4 = fLd63;
        boolean z3 = z2;
        float fRound2 = Math.round(Math.cos(d4) * d2);
        float fRound3 = Math.round(d2 * Math.sin(d4));
        this.f46642f7l8.rewind();
        float fLd65 = ld6(this.f359n + this.f358k.getStrokeWidth(), -this.f46643ld6, this.f360p);
        float f3 = (-fLd62) / 2.0f;
        this.f46642f7l8.moveTo(f3 + fRound, 0.0f);
        this.f46642f7l8.rLineTo(fLd62 - (fRound * 2.0f), 0.0f);
        this.f46642f7l8.moveTo(f3, fLd65);
        this.f46642f7l8.rLineTo(fRound2, fRound3);
        this.f46642f7l8.moveTo(f3, -fLd65);
        this.f46642f7l8.rLineTo(fRound2, -fRound3);
        this.f46642f7l8.close();
        canvas.save();
        float strokeWidth = this.f358k.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (2.0f * r5))) / 4) * 2) + (strokeWidth * 1.5f) + this.f359n);
        if (this.f357g) {
            canvas.rotate(fLd64 * (this.f362s ^ z3 ? -1 : 1));
        } else if (z3) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f46642f7l8, this.f358k);
        canvas.restore();
    }

    public float f7l8() {
        return this.f359n;
    }

    public void fn3e(boolean z2) {
        if (this.f362s != z2) {
            this.f362s = z2;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: g */
    public int m264g() {
        return this.f46645x2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f363y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f363y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public void m265h(@x2 int i2) {
        if (i2 != this.f358k.getColor()) {
            this.f358k.setColor(i2);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m266i(boolean z2) {
        if (this.f357g != z2) {
            this.f357g = z2;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: k */
    public float m267k() {
        return this.f46644toq;
    }

    public void ki(float f2) {
        if (f2 != this.f359n) {
            this.f359n = f2;
            invalidateSelf();
        }
    }

    public void kja0(float f2) {
        if (this.f358k.getStrokeWidth() != f2) {
            this.f358k.setStrokeWidth(f2);
            this.f46643ld6 = (float) (((double) (f2 / 2.0f)) * Math.cos(f46638cdj));
            invalidateSelf();
        }
    }

    @x2
    /* JADX INFO: renamed from: n */
    public int m268n() {
        return this.f358k.getColor();
    }

    public void n7h(float f2) {
        if (this.f46646zy != f2) {
            this.f46646zy = f2;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m269p() {
        return this.f357g;
    }

    /* JADX INFO: renamed from: q */
    public float m270q() {
        return this.f358k.getStrokeWidth();
    }

    public void qrj(float f2) {
        if (this.f361q != f2) {
            this.f361q = f2;
            invalidateSelf();
        }
    }

    @zurt(from = 0.0d, to = 1.0d)
    /* JADX INFO: renamed from: s */
    public float m271s() {
        return this.f360p;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (i2 != this.f358k.getAlpha()) {
            this.f358k.setAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f358k.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void t8r(@zurt(from = 0.0d, to = 1.0d) float f2) {
        if (this.f360p != f2) {
            this.f360p = f2;
            invalidateSelf();
        }
    }

    public float toq() {
        return this.f361q;
    }

    public void x2(float f2) {
        if (this.f46644toq != f2) {
            this.f46644toq = f2;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: y */
    public final Paint m272y() {
        return this.f358k;
    }

    public float zy() {
        return this.f46646zy;
    }
}
