package com.android.thememanager.view;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.android.thememanager.view.k */
/* JADX INFO: compiled from: AnimatedRotateDrawable.java */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableC2920k extends Drawable implements Drawable.Callback, Runnable, Animatable {

    /* JADX INFO: renamed from: g */
    private float f17549g;

    /* JADX INFO: renamed from: k */
    private toq f17550k;

    /* JADX INFO: renamed from: n */
    private float f17551n;

    /* JADX INFO: renamed from: q */
    private boolean f17552q;

    /* JADX INFO: renamed from: y */
    private boolean f17553y;

    /* JADX INFO: renamed from: com.android.thememanager.view.k$toq */
    /* JADX INFO: compiled from: AnimatedRotateDrawable.java */
    static final class toq extends Drawable.ConstantState {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        int f61515f7l8;

        /* JADX INFO: renamed from: g */
        float f17554g;

        /* JADX INFO: renamed from: k */
        Drawable f17555k;

        /* JADX INFO: renamed from: n */
        boolean f17556n;

        /* JADX INFO: renamed from: p */
        private boolean f17557p;

        /* JADX INFO: renamed from: q */
        float f17558q;

        /* JADX INFO: renamed from: s */
        private boolean f17559s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f61516toq;

        /* JADX INFO: renamed from: y */
        int f17560y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f61517zy;

        public toq(toq source, RunnableC2920k owner, Resources res) {
            if (source != null) {
                if (res != null) {
                    this.f17555k = source.f17555k.getConstantState().newDrawable(res);
                } else {
                    this.f17555k = source.f17555k.getConstantState().newDrawable();
                }
                this.f17555k.setCallback(owner);
                this.f61517zy = source.f61517zy;
                this.f17558q = source.f17558q;
                this.f17556n = source.f17556n;
                this.f17554g = source.f17554g;
                this.f17560y = source.f17560y;
                this.f61515f7l8 = source.f61515f7l8;
                this.f17557p = true;
                this.f17559s = true;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f61516toq;
        }

        /* JADX INFO: renamed from: k */
        public boolean m10363k() {
            if (!this.f17557p) {
                this.f17559s = this.f17555k.getConstantState() != null;
                this.f17557p = true;
            }
            return this.f17559s;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new RunnableC2920k(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources res) {
            return new RunnableC2920k(this, res);
        }
    }

    /* JADX INFO: renamed from: n */
    private void m10359n() {
        unscheduleSelf(this);
        scheduleSelf(this, SystemClock.uptimeMillis() + ((long) this.f17550k.f61515f7l8));
    }

    /* JADX INFO: renamed from: q */
    private void m10360q() {
        toq toqVar = this.f17550k;
        this.f17549g = 360.0f / toqVar.f17560y;
        Drawable drawable = toqVar.f17555k;
        if (drawable != null) {
            drawable.setFilterBitmap(true);
            if (drawable instanceof BitmapDrawable) {
                ((BitmapDrawable) drawable).setAntiAlias(true);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        toq toqVar = this.f17550k;
        Drawable drawable = toqVar.f17555k;
        Rect bounds = drawable.getBounds();
        int i2 = bounds.right;
        int i3 = bounds.left;
        int i4 = i2 - i3;
        int i5 = bounds.bottom;
        canvas.rotate(this.f17551n, (toqVar.f61517zy ? i4 * toqVar.f17558q : toqVar.f17558q) + i3, (toqVar.f17556n ? (i5 - r3) * toqVar.f17554g : toqVar.f17554g) + bounds.top);
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public void f7l8(int framesDuration) {
        this.f17550k.f61515f7l8 = framesDuration;
    }

    /* JADX INFO: renamed from: g */
    public void m10361g(int framesCount) {
        this.f17550k.f17560y = framesCount;
        this.f17549g = 360.0f / framesCount;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f17550k.f17555k.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        toq toqVar = this.f17550k;
        return changingConfigurations | toqVar.f61516toq | toqVar.f17555k.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (!this.f17550k.m10363k()) {
            return null;
        }
        this.f17550k.f61516toq = getChangingConfigurations();
        return this.f17550k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f17550k.f17555k.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f17550k.f17555k.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f17550k.f17555k.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        return this.f17550k.f17555k.getPadding(padding);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f17553y;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f17550k.f17555k.isStateful();
    }

    /* JADX INFO: renamed from: k */
    public Drawable m10362k() {
        return this.f17550k.f17555k;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f17552q && super.mutate() == this) {
            this.f17550k.f17555k.mutate();
            this.f17552q = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        this.f17550k.f17555k.setBounds(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }

    @Override // java.lang.Runnable
    public void run() {
        float f2 = this.f17551n;
        float f3 = this.f17549g;
        float f4 = f2 + f3;
        this.f17551n = f4;
        if (f4 > 360.0f - f3) {
            this.f17551n = 0.0f;
        }
        invalidateSelf();
        m10359n();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, what, when);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.f17550k.f17555k.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter cf) {
        this.f17550k.f17555k.setColorFilter(cf);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
        this.f17550k.f17555k.setVisible(visible, restart);
        boolean visible2 = super.setVisible(visible, restart);
        if (!visible) {
            unscheduleSelf(this);
        } else if (visible2 || restart) {
            this.f17551n = 0.0f;
            m10359n();
        }
        return visible2;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f17553y) {
            return;
        }
        this.f17553y = true;
        m10359n();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f17553y = false;
        unscheduleSelf(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable who, Runnable what) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, what);
        }
    }

    private RunnableC2920k(toq rotateState, Resources res) {
        this.f17550k = new toq(rotateState, this, res);
        m10360q();
    }

    public RunnableC2920k(Resources res, int drawableResId) {
        this.f17550k = new toq(null, this, res);
        m10361g(12);
        f7l8(150);
        Drawable drawable = res.getDrawable(drawableResId);
        toq toqVar = this.f17550k;
        toqVar.f17555k = drawable;
        toqVar.f61517zy = true;
        toqVar.f17558q = 0.5f;
        toqVar.f17556n = true;
        toqVar.f17554g = 0.5f;
        m10360q();
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }
}
