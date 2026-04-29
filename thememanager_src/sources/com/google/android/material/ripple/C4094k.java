package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.n7h;
import com.google.android.material.shape.C4108p;
import com.google.android.material.shape.kja0;
import com.google.android.material.shape.t8r;
import zy.dd;
import zy.lvui;
import zy.uv6;
import zy.x2;

/* JADX INFO: renamed from: com.google.android.material.ripple.k */
/* JADX INFO: compiled from: RippleDrawableCompat.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class C4094k extends Drawable implements t8r, n7h {

    /* JADX INFO: renamed from: k */
    private toq f24880k;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        toq toqVar = this.f24880k;
        if (toqVar.f67791toq) {
            toqVar.f24881k.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @dd
    public Drawable.ConstantState getConstantState() {
        return this.f24880k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f24880k.f24881k.getOpacity();
    }

    @Override // com.google.android.material.shape.t8r
    @lvui
    public kja0 getShapeAppearanceModel() {
        return this.f24880k.f24881k.getShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    @lvui
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C4094k mutate() {
        this.f24880k = new toq(this.f24880k);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@lvui Rect rect) {
        super.onBoundsChange(rect);
        this.f24880k.f24881k.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@lvui int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f24880k.f24881k.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zM14762n = com.google.android.material.ripple.toq.m14762n(iArr);
        toq toqVar = this.f24880k;
        if (toqVar.f67791toq == zM14762n) {
            return zOnStateChange;
        }
        toqVar.f67791toq = zM14762n;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f24880k.f24881k.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@dd ColorFilter colorFilter) {
        this.f24880k.f24881k.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.shape.t8r
    public void setShapeAppearanceModel(@lvui kja0 kja0Var) {
        this.f24880k.f24881k.setShapeAppearanceModel(kja0Var);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTint(@x2 int i2) {
        this.f24880k.f24881k.setTint(i2);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTintList(@dd ColorStateList colorStateList) {
        this.f24880k.f24881k.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTintMode(@dd PorterDuff.Mode mode) {
        this.f24880k.f24881k.setTintMode(mode);
    }

    public C4094k(kja0 kja0Var) {
        this(new toq(new C4108p(kja0Var)));
    }

    /* JADX INFO: renamed from: com.google.android.material.ripple.k$toq */
    /* JADX INFO: compiled from: RippleDrawableCompat.java */
    static final class toq extends Drawable.ConstantState {

        /* JADX INFO: renamed from: k */
        @lvui
        C4108p f24881k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        boolean f67791toq;

        public toq(C4108p c4108p) {
            this.f24881k = c4108p;
            this.f67791toq = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C4094k newDrawable() {
            return new C4094k(new toq(this));
        }

        public toq(@lvui toq toqVar) {
            this.f24881k = (C4108p) toqVar.f24881k.getConstantState().newDrawable();
            this.f67791toq = toqVar.f67791toq;
        }
    }

    private C4094k(toq toqVar) {
        this.f24880k = toqVar;
    }
}
