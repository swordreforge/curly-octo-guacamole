package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.graphics.drawable.h */
/* JADX INFO: compiled from: WrappedDrawableApi14.java */
/* JADX INFO: loaded from: classes.dex */
class C0520h extends Drawable implements Drawable.Callback, kja0, n7h {

    /* JADX INFO: renamed from: p */
    static final PorterDuff.Mode f3541p = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: g */
    ki f3542g;

    /* JADX INFO: renamed from: k */
    private int f3543k;

    /* JADX INFO: renamed from: n */
    private boolean f3544n;

    /* JADX INFO: renamed from: q */
    private PorterDuff.Mode f3545q;

    /* JADX INFO: renamed from: s */
    Drawable f3546s;

    /* JADX INFO: renamed from: y */
    private boolean f3547y;

    C0520h(@lvui ki kiVar, @dd Resources resources) {
        this.f3542g = kiVar;
        m2418n(resources);
    }

    /* JADX INFO: renamed from: g */
    private boolean m2417g(int[] iArr) {
        if (!zy()) {
            return false;
        }
        ki kiVar = this.f3542g;
        ColorStateList colorStateList = kiVar.f50449zy;
        PorterDuff.Mode mode = kiVar.f3549q;
        if (colorStateList == null || mode == null) {
            this.f3544n = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f3544n || colorForState != this.f3543k || mode != this.f3545q) {
                setColorFilter(colorForState, mode);
                this.f3543k = colorForState;
                this.f3545q = mode;
                this.f3544n = true;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    private void m2418n(@dd Resources resources) {
        Drawable.ConstantState constantState;
        ki kiVar = this.f3542g;
        if (kiVar == null || (constantState = kiVar.f50448toq) == null) {
            return;
        }
        toq(constantState.newDrawable(resources));
    }

    @lvui
    /* JADX INFO: renamed from: q */
    private ki m2419q() {
        return new ki(this.f3542g);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@lvui Canvas canvas) {
        this.f3546s.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        ki kiVar = this.f3542g;
        return changingConfigurations | (kiVar != null ? kiVar.getChangingConfigurations() : 0) | this.f3546s.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    @dd
    public Drawable.ConstantState getConstantState() {
        ki kiVar = this.f3542g;
        if (kiVar == null || !kiVar.m2422k()) {
            return null;
        }
        this.f3542g.f3548k = getChangingConfigurations();
        return this.f3542g;
    }

    @Override // android.graphics.drawable.Drawable
    @lvui
    public Drawable getCurrent() {
        return this.f3546s.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3546s.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3546s.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @hyr(23)
    public int getLayoutDirection() {
        return zy.m2441g(this.f3546s);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f3546s.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f3546s.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f3546s.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@lvui Rect rect) {
        return this.f3546s.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @lvui
    public int[] getState() {
        return this.f3546s.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f3546s.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@lvui Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @hyr(19)
    public boolean isAutoMirrored() {
        return zy.m2448y(this.f3546s);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ki kiVar;
        ColorStateList colorStateList = (!zy() || (kiVar = this.f3542g) == null) ? null : kiVar.f50449zy;
        return (colorStateList != null && colorStateList.isStateful()) || this.f3546s.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f3546s.jumpToCurrentState();
    }

    @Override // androidx.core.graphics.drawable.kja0
    /* JADX INFO: renamed from: k */
    public final Drawable mo2420k() {
        return this.f3546s;
    }

    @Override // android.graphics.drawable.Drawable
    @lvui
    public Drawable mutate() {
        if (!this.f3547y && super.mutate() == this) {
            this.f3542g = m2419q();
            Drawable drawable = this.f3546s;
            if (drawable != null) {
                drawable.mutate();
            }
            ki kiVar = this.f3542g;
            if (kiVar != null) {
                Drawable drawable2 = this.f3546s;
                kiVar.f50448toq = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f3547y = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3546s;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @hyr(23)
    public boolean onLayoutDirectionChanged(int i2) {
        return zy.qrj(this.f3546s, i2);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        return this.f3546s.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@lvui Drawable drawable, @lvui Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f3546s.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    @hyr(19)
    public void setAutoMirrored(boolean z2) {
        zy.m2445p(this.f3546s, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i2) {
        this.f3546s.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3546s.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z2) {
        this.f3546s.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z2) {
        this.f3546s.setFilterBitmap(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@lvui int[] iArr) {
        return m2417g(iArr) || this.f3546s.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTintList(ColorStateList colorStateList) {
        this.f3542g.f50449zy = colorStateList;
        m2417g(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTintMode(@lvui PorterDuff.Mode mode) {
        this.f3542g.f3549q = mode;
        m2417g(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.f3546s.setVisible(z2, z3);
    }

    @Override // androidx.core.graphics.drawable.kja0
    public final void toq(Drawable drawable) {
        Drawable drawable2 = this.f3546s;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3546s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            ki kiVar = this.f3542g;
            if (kiVar != null) {
                kiVar.f50448toq = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@lvui Drawable drawable, @lvui Runnable runnable) {
        unscheduleSelf(runnable);
    }

    protected boolean zy() {
        return true;
    }

    C0520h(@dd Drawable drawable) {
        this.f3542g = m2419q();
        toq(drawable);
    }
}
