package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.request.target.s */
/* JADX INFO: compiled from: FixedSizeDrawable.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3183s extends Drawable {

    /* JADX INFO: renamed from: g */
    private boolean f19033g;

    /* JADX INFO: renamed from: k */
    private final Matrix f19034k;

    /* JADX INFO: renamed from: n */
    private k f19035n;

    /* JADX INFO: renamed from: q */
    private Drawable f19036q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final RectF f63047toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final RectF f63048zy;

    /* JADX INFO: renamed from: com.bumptech.glide.request.target.s$k */
    /* JADX INFO: compiled from: FixedSizeDrawable.java */
    static final class k extends Drawable.ConstantState {

        /* JADX INFO: renamed from: k */
        private final Drawable.ConstantState f19037k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final int f63049toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final int f63050zy;

        k(k kVar) {
            this(kVar.f19037k, kVar.f63049toq, kVar.f63050zy);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable() {
            return new C3183s(this, this.f19037k.newDrawable());
        }

        k(Drawable.ConstantState constantState, int i2, int i3) {
            this.f19037k = constantState;
            this.f63049toq = i2;
            this.f63050zy = i3;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable(Resources resources) {
            return new C3183s(this, this.f19037k.newDrawable(resources));
        }
    }

    public C3183s(Drawable drawable, int i2, int i3) {
        this(new k(drawable.getConstantState(), i2, i3), drawable);
    }

    /* JADX INFO: renamed from: k */
    private void m11206k() {
        this.f19034k.setRectToRect(this.f63047toq, this.f63048zy, Matrix.ScaleToFit.CENTER);
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f19036q.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@lvui Canvas canvas) {
        canvas.save();
        canvas.concat(this.f19034k);
        this.f19036q.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    @hyr(19)
    public int getAlpha() {
        return this.f19036q.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return this.f19036q.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f19036q.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f19035n;
    }

    @Override // android.graphics.drawable.Drawable
    @lvui
    public Drawable getCurrent() {
        return this.f19036q.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f19035n.f63050zy;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f19035n.f63049toq;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f19036q.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f19036q.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f19036q.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@lvui Rect rect) {
        return this.f19036q.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        this.f19036q.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @lvui
    public Drawable mutate() {
        if (!this.f19033g && super.mutate() == this) {
            this.f19036q = this.f19036q.mutate();
            this.f19035n = new k(this.f19035n);
            this.f19033g = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(@lvui Runnable runnable, long j2) {
        super.scheduleSelf(runnable, j2);
        this.f19036q.scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f19036q.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i2, int i3, int i4, int i5) {
        super.setBounds(i2, i3, i4, i5);
        this.f63048zy.set(i2, i3, i4, i5);
        m11206k();
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i2) {
        this.f19036q.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i2, @lvui PorterDuff.Mode mode) {
        this.f19036q.setColorFilter(i2, mode);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public void setDither(boolean z2) {
        this.f19036q.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z2) {
        this.f19036q.setFilterBitmap(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        return this.f19036q.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(@lvui Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f19036q.unscheduleSelf(runnable);
    }

    C3183s(k kVar, Drawable drawable) {
        this.f19035n = (k) com.bumptech.glide.util.qrj.m11262q(kVar);
        this.f19036q = (Drawable) com.bumptech.glide.util.qrj.m11262q(drawable);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f19034k = new Matrix();
        this.f63047toq = new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f63048zy = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f19036q.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@lvui Rect rect) {
        super.setBounds(rect);
        this.f63048zy.set(rect);
        m11206k();
    }
}
