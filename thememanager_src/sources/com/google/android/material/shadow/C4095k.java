package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0498q;
import ij.C6095k;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.shadow.k */
/* JADX INFO: compiled from: ShadowDrawableWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C4095k extends androidx.appcompat.graphics.drawable.zy {

    /* JADX INFO: renamed from: a */
    static final float f24889a = 0.5f;

    /* JADX INFO: renamed from: b */
    static final float f24890b = 0.25f;

    /* JADX INFO: renamed from: m */
    static final float f24891m = 1.5f;

    /* JADX INFO: renamed from: o */
    static final double f24892o = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: x */
    static final float f24893x = 1.0f;

    /* JADX INFO: renamed from: c */
    private boolean f24894c;

    /* JADX INFO: renamed from: e */
    private float f24895e;

    /* JADX INFO: renamed from: f */
    private final int f24896f;

    /* JADX INFO: renamed from: g */
    @lvui
    final RectF f24897g;

    /* JADX INFO: renamed from: h */
    float f24898h;

    /* JADX INFO: renamed from: i */
    float f24899i;

    /* JADX INFO: renamed from: j */
    private boolean f24900j;

    /* JADX INFO: renamed from: l */
    private final int f24901l;

    /* JADX INFO: renamed from: n */
    @lvui
    final Paint f24902n;

    /* JADX INFO: renamed from: p */
    float f24903p;

    /* JADX INFO: renamed from: q */
    @lvui
    final Paint f24904q;

    /* JADX INFO: renamed from: r */
    private final int f24905r;

    /* JADX INFO: renamed from: s */
    Path f24906s;

    /* JADX INFO: renamed from: t */
    private boolean f24907t;

    /* JADX INFO: renamed from: y */
    float f24908y;

    /* JADX INFO: renamed from: z */
    float f24909z;

    public C4095k(Context context, Drawable drawable, float f2, float f3, float f4) {
        super(drawable);
        this.f24907t = true;
        this.f24894c = true;
        this.f24900j = false;
        this.f24905r = C0498q.m2252g(context, C6095k.n.f79549xwq3);
        this.f24901l = C0498q.m2252g(context, C6095k.n.f79398dr);
        this.f24896f = C0498q.m2252g(context, C6095k.n.f79426gyi);
        Paint paint = new Paint(5);
        this.f24904q = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f24908y = Math.round(f2);
        this.f24897g = new RectF();
        Paint paint2 = new Paint(paint);
        this.f24902n = paint2;
        paint2.setAntiAlias(false);
        ki(f3, f4);
    }

    private void f7l8(@lvui Canvas canvas) {
        int i2;
        float f2;
        int i3;
        float f3;
        float f4;
        float f5;
        int iSave = canvas.save();
        canvas.rotate(this.f24895e, this.f24897g.centerX(), this.f24897g.centerY());
        float f6 = this.f24908y;
        float f7 = (-f6) - this.f24899i;
        float f8 = f6 * 2.0f;
        boolean z2 = this.f24897g.width() - f8 > 0.0f;
        boolean z3 = this.f24897g.height() - f8 > 0.0f;
        float f9 = this.f24909z;
        float f10 = f6 / ((f9 - (0.5f * f9)) + f6);
        float f11 = f6 / ((f9 - (f24890b * f9)) + f6);
        float f12 = f6 / ((f9 - (f9 * 1.0f)) + f6);
        int iSave2 = canvas.save();
        RectF rectF = this.f24897g;
        canvas.translate(rectF.left + f6, rectF.top + f6);
        canvas.scale(f10, f11);
        canvas.drawPath(this.f24906s, this.f24904q);
        if (z2) {
            canvas.scale(1.0f / f10, 1.0f);
            i2 = iSave2;
            f2 = f12;
            i3 = iSave;
            f3 = f11;
            canvas.drawRect(0.0f, f7, this.f24897g.width() - f8, -this.f24908y, this.f24902n);
        } else {
            i2 = iSave2;
            f2 = f12;
            i3 = iSave;
            f3 = f11;
        }
        canvas.restoreToCount(i2);
        int iSave3 = canvas.save();
        RectF rectF2 = this.f24897g;
        canvas.translate(rectF2.right - f6, rectF2.bottom - f6);
        float f13 = f2;
        canvas.scale(f10, f13);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f24906s, this.f24904q);
        if (z2) {
            canvas.scale(1.0f / f10, 1.0f);
            f4 = f3;
            f5 = f13;
            canvas.drawRect(0.0f, f7, this.f24897g.width() - f8, (-this.f24908y) + this.f24899i, this.f24902n);
        } else {
            f4 = f3;
            f5 = f13;
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        RectF rectF3 = this.f24897g;
        canvas.translate(rectF3.left + f6, rectF3.bottom - f6);
        canvas.scale(f10, f5);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f24906s, this.f24904q);
        if (z3) {
            canvas.scale(1.0f / f5, 1.0f);
            canvas.drawRect(0.0f, f7, this.f24897g.height() - f8, -this.f24908y, this.f24902n);
        }
        canvas.restoreToCount(iSave4);
        int iSave5 = canvas.save();
        RectF rectF4 = this.f24897g;
        canvas.translate(rectF4.right - f6, rectF4.top + f6);
        float f14 = f4;
        canvas.scale(f10, f14);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f24906s, this.f24904q);
        if (z3) {
            canvas.scale(1.0f / f14, 1.0f);
            canvas.drawRect(0.0f, f7, this.f24897g.height() - f8, -this.f24908y, this.f24902n);
        }
        canvas.restoreToCount(iSave5);
        canvas.restoreToCount(i3);
    }

    /* JADX INFO: renamed from: g */
    public static float m14764g(float f2, float f3, boolean z2) {
        return z2 ? (float) (((double) (f2 * 1.5f)) + ((1.0d - f24892o) * ((double) f3))) : f2 * 1.5f;
    }

    /* JADX INFO: renamed from: n */
    public static float m14765n(float f2, float f3, boolean z2) {
        return z2 ? (float) (((double) f2) + ((1.0d - f24892o) * ((double) f3))) : f2;
    }

    /* JADX INFO: renamed from: q */
    private void m14766q() {
        float f2 = this.f24908y;
        RectF rectF = new RectF(-f2, -f2, f2, f2);
        RectF rectF2 = new RectF(rectF);
        float f3 = this.f24899i;
        rectF2.inset(-f3, -f3);
        Path path = this.f24906s;
        if (path == null) {
            this.f24906s = new Path();
        } else {
            path.reset();
        }
        this.f24906s.setFillType(Path.FillType.EVEN_ODD);
        this.f24906s.moveTo(-this.f24908y, 0.0f);
        this.f24906s.rLineTo(-this.f24899i, 0.0f);
        this.f24906s.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f24906s.arcTo(rectF, 270.0f, -90.0f, false);
        this.f24906s.close();
        float f4 = -rectF2.top;
        if (f4 > 0.0f) {
            float f5 = this.f24908y / f4;
            this.f24904q.setShader(new RadialGradient(0.0f, 0.0f, f4, new int[]{0, this.f24905r, this.f24901l, this.f24896f}, new float[]{0.0f, f5, ((1.0f - f5) / 2.0f) + f5, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.f24902n.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f24905r, this.f24901l, this.f24896f}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f24902n.setAntiAlias(false);
    }

    private static int t8r(float f2) {
        int iRound = Math.round(f2);
        return iRound % 2 == 1 ? iRound - 1 : iRound;
    }

    private void zy(@lvui Rect rect) {
        float f2 = this.f24898h;
        float f3 = 1.5f * f2;
        this.f24897g.set(rect.left + f2, rect.top + f3, rect.right - f2, rect.bottom - f3);
        Drawable drawableM292k = m292k();
        RectF rectF = this.f24897g;
        drawableM292k.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        m14766q();
    }

    public void cdj(float f2) {
        ki(f2, this.f24898h);
    }

    @Override // androidx.appcompat.graphics.drawable.zy, android.graphics.drawable.Drawable
    public void draw(@lvui Canvas canvas) {
        if (this.f24907t) {
            zy(getBounds());
            this.f24907t = false;
        }
        f7l8(canvas);
        super.draw(canvas);
    }

    @Override // androidx.appcompat.graphics.drawable.zy, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // androidx.appcompat.graphics.drawable.zy, android.graphics.drawable.Drawable
    public boolean getPadding(@lvui Rect rect) {
        int iCeil = (int) Math.ceil(m14764g(this.f24898h, this.f24908y, this.f24894c));
        int iCeil2 = (int) Math.ceil(m14765n(this.f24898h, this.f24908y, this.f24894c));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m14767h(float f2) {
        if (this.f24895e != f2) {
            this.f24895e = f2;
            invalidateSelf();
        }
    }

    public void ki(float f2, float f3) {
        if (f2 < 0.0f || f3 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float fT8r = t8r(f2);
        float fT8r2 = t8r(f3);
        if (fT8r > fT8r2) {
            if (!this.f24900j) {
                this.f24900j = true;
            }
            fT8r = fT8r2;
        }
        if (this.f24909z == fT8r && this.f24898h == fT8r2) {
            return;
        }
        this.f24909z = fT8r;
        this.f24898h = fT8r2;
        this.f24899i = Math.round(fT8r * 1.5f);
        this.f24903p = fT8r2;
        this.f24907t = true;
        invalidateSelf();
    }

    public void kja0(float f2) {
        ki(this.f24909z, f2);
    }

    public float ld6() {
        float f2 = this.f24898h;
        return (Math.max(f2, this.f24908y + (f2 / 2.0f)) * 2.0f) + (this.f24898h * 2.0f);
    }

    public void n7h(float f2) {
        float fRound = Math.round(f2);
        if (this.f24908y == fRound) {
            return;
        }
        this.f24908y = fRound;
        this.f24907t = true;
        invalidateSelf();
    }

    @Override // androidx.appcompat.graphics.drawable.zy, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f24907t = true;
    }

    /* JADX INFO: renamed from: p */
    public float m14768p() {
        float f2 = this.f24898h;
        return (Math.max(f2, this.f24908y + ((f2 * 1.5f) / 2.0f)) * 2.0f) + (this.f24898h * 1.5f * 2.0f);
    }

    public void qrj(boolean z2) {
        this.f24894c = z2;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: s */
    public float m14769s() {
        return this.f24898h;
    }

    @Override // androidx.appcompat.graphics.drawable.zy, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        super.setAlpha(i2);
        this.f24904q.setAlpha(i2);
        this.f24902n.setAlpha(i2);
    }

    public float x2() {
        return this.f24909z;
    }

    /* JADX INFO: renamed from: y */
    public float m14770y() {
        return this.f24908y;
    }
}
