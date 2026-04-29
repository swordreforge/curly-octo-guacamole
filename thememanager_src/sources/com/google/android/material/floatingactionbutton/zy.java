package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.C0541p;
import com.google.android.material.shape.C4103h;
import com.google.android.material.shape.kja0;
import zy.a9;
import zy.cdj;
import zy.dd;
import zy.lvui;
import zy.uv6;
import zy.x2;

/* JADX INFO: compiled from: BorderDrawable.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
class zy extends Drawable {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final float f67629cdj = 1.3333f;

    /* JADX INFO: renamed from: h */
    @dd
    private ColorStateList f24494h;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private kja0 f67631kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @x2
    private int f67632ld6;

    /* JADX INFO: renamed from: p */
    @x2
    private int f24497p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @x2
    private int f67634qrj;

    /* JADX INFO: renamed from: s */
    @x2
    private int f24499s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final Paint f67635toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @x2
    private int f67636x2;

    /* JADX INFO: renamed from: y */
    @cdj
    float f24500y;

    /* JADX INFO: renamed from: k */
    private final C4103h f24495k = C4103h.ld6();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Path f67637zy = new Path();

    /* JADX INFO: renamed from: q */
    private final Rect f24498q = new Rect();

    /* JADX INFO: renamed from: n */
    private final RectF f24496n = new RectF();

    /* JADX INFO: renamed from: g */
    private final RectF f24493g = new RectF();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final toq f67630f7l8 = new toq();

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f67633n7h = true;

    /* JADX INFO: compiled from: BorderDrawable.java */
    private class toq extends Drawable.ConstantState {
        private toq() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable() {
            return zy.this;
        }
    }

    zy(kja0 kja0Var) {
        this.f67631kja0 = kja0Var;
        Paint paint = new Paint(1);
        this.f67635toq = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @lvui
    /* JADX INFO: renamed from: k */
    private Shader m14517k() {
        copyBounds(this.f24498q);
        float fHeight = this.f24500y / r0.height();
        return new LinearGradient(0.0f, r0.top, 0.0f, r0.bottom, new int[]{C0541p.m2536i(this.f24499s, this.f67634qrj), C0541p.m2536i(this.f24497p, this.f67634qrj), C0541p.m2536i(C0541p.m2542t(this.f24497p, 0), this.f67634qrj), C0541p.m2536i(C0541p.m2542t(this.f67636x2, 0), this.f67634qrj), C0541p.m2536i(this.f67636x2, this.f67634qrj), C0541p.m2536i(this.f67632ld6, this.f67634qrj)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@lvui Canvas canvas) {
        if (this.f67633n7h) {
            this.f67635toq.setShader(m14517k());
            this.f67633n7h = false;
        }
        float strokeWidth = this.f67635toq.getStrokeWidth() / 2.0f;
        copyBounds(this.f24498q);
        this.f24496n.set(this.f24498q);
        float fMin = Math.min(this.f67631kja0.ki().mo14816k(toq()), this.f24496n.width() / 2.0f);
        if (this.f67631kja0.fn3e(toq())) {
            this.f24496n.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f24496n, fMin, fMin, this.f67635toq);
        }
    }

    public void f7l8(kja0 kja0Var) {
        this.f67631kja0 = kja0Var;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    void m14518g(@x2 int i2, @x2 int i3, @x2 int i4, @x2 int i5) {
        this.f24499s = i2;
        this.f24497p = i3;
        this.f67632ld6 = i4;
        this.f67636x2 = i5;
    }

    @Override // android.graphics.drawable.Drawable
    @dd
    public Drawable.ConstantState getConstantState() {
        return this.f67630f7l8;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f24500y > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@lvui Outline outline) {
        if (this.f67631kja0.fn3e(toq())) {
            outline.setRoundRect(getBounds(), this.f67631kja0.ki().mo14816k(toq()));
            return;
        }
        copyBounds(this.f24498q);
        this.f24496n.set(this.f24498q);
        this.f24495k.m14814q(this.f67631kja0, 1.0f, this.f24496n, this.f67637zy);
        if (this.f67637zy.isConvex()) {
            outline.setConvexPath(this.f67637zy);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@lvui Rect rect) {
        if (!this.f67631kja0.fn3e(toq())) {
            return true;
        }
        int iRound = Math.round(this.f24500y);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f24494h;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* JADX INFO: renamed from: n */
    public void m14519n(@cdj float f2) {
        if (this.f24500y != f2) {
            this.f24500y = f2;
            this.f67635toq.setStrokeWidth(f2 * f67629cdj);
            this.f67633n7h = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f67633n7h = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f24494h;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f67634qrj)) != this.f67634qrj) {
            this.f67633n7h = true;
            this.f67634qrj = colorForState;
        }
        if (this.f67633n7h) {
            invalidateSelf();
        }
        return this.f67633n7h;
    }

    /* JADX INFO: renamed from: q */
    void m14520q(@dd ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f67634qrj = colorStateList.getColorForState(getState(), this.f67634qrj);
        }
        this.f24494h = colorStateList;
        this.f67633n7h = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@a9(from = 0, to = 255) int i2) {
        this.f67635toq.setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@dd ColorFilter colorFilter) {
        this.f67635toq.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @lvui
    protected RectF toq() {
        this.f24493g.set(getBounds());
        return this.f24493g;
    }

    public kja0 zy() {
        return this.f67631kja0;
    }
}
