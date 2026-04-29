package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.view.C0683f;
import androidx.vectordrawable.graphics.drawable.toq;
import com.google.android.material.color.kja0;
import com.google.android.material.internal.cdj;
import com.google.android.material.progressindicator.toq;
import h4b.C6070k;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import zy.InterfaceC7828g;
import zy.InterfaceC7833l;
import zy.dd;
import zy.hb;
import zy.lvui;
import zy.uv6;
import zy.yz;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseProgressIndicator<S extends com.google.android.material.progressindicator.toq> extends ProgressBar {

    /* JADX INFO: renamed from: a */
    static final int f24760a = C6095k.n7h.yir;

    /* JADX INFO: renamed from: b */
    public static final int f24761b = 2;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    static final int f67737bo = 1000;

    /* JADX INFO: renamed from: c */
    public static final int f24762c = 0;

    /* JADX INFO: renamed from: e */
    public static final int f24763e = 1;

    /* JADX INFO: renamed from: j */
    public static final int f24764j = 2;

    /* JADX INFO: renamed from: m */
    public static final int f24765m = 1;

    /* JADX INFO: renamed from: o */
    public static final int f24766o = 0;

    /* JADX INFO: renamed from: u */
    static final int f24767u = 255;

    /* JADX INFO: renamed from: x */
    static final float f24768x = 0.2f;

    /* JADX INFO: renamed from: f */
    private final toq.AbstractC1258k f24769f;

    /* JADX INFO: renamed from: g */
    private boolean f24770g;

    /* JADX INFO: renamed from: h */
    C4081k f24771h;

    /* JADX INFO: renamed from: i */
    private boolean f24772i;

    /* JADX INFO: renamed from: k */
    S f24773k;

    /* JADX INFO: renamed from: l */
    private final toq.AbstractC1258k f24774l;

    /* JADX INFO: renamed from: n */
    private boolean f24775n;

    /* JADX INFO: renamed from: p */
    private long f24776p;

    /* JADX INFO: renamed from: q */
    private int f24777q;

    /* JADX INFO: renamed from: r */
    private final Runnable f24778r;

    /* JADX INFO: renamed from: s */
    private final int f24779s;

    /* JADX INFO: renamed from: t */
    private final Runnable f24780t;

    /* JADX INFO: renamed from: y */
    private final int f24781y;

    /* JADX INFO: renamed from: z */
    private int f24782z;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$g */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface InterfaceC4073g {
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$k */
    class RunnableC4074k implements Runnable {
        RunnableC4074k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseProgressIndicator.this.x2();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$n */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface InterfaceC4075n {
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$q */
    class C4076q extends toq.AbstractC1258k {
        C4076q() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.toq.AbstractC1258k
        public void toq(Drawable drawable) {
            super.toq(drawable);
            if (BaseProgressIndicator.this.f24772i) {
                return;
            }
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setVisibility(baseProgressIndicator.f24782z);
        }
    }

    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseProgressIndicator.this.ld6();
            BaseProgressIndicator.this.f24776p = -1L;
        }
    }

    class zy extends toq.AbstractC1258k {
        zy() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.toq.AbstractC1258k
        public void toq(Drawable drawable) {
            BaseProgressIndicator.this.setIndeterminate(false);
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setProgressCompat(baseProgressIndicator.f24777q, BaseProgressIndicator.this.f24775n);
        }
    }

    protected BaseProgressIndicator(@lvui Context context, @dd AttributeSet attributeSet, @InterfaceC7828g int i2, @hb int i3) {
        super(C6070k.zy(context, attributeSet, i2, f24760a), attributeSet, i2);
        this.f24776p = -1L;
        this.f24772i = false;
        this.f24782z = 4;
        this.f24780t = new RunnableC4074k();
        this.f24778r = new toq();
        this.f24774l = new zy();
        this.f24769f = new C4076q();
        Context context2 = getContext();
        this.f24773k = (S) mo14685s(context2, attributeSet);
        TypedArray typedArrayM14534p = cdj.m14534p(context2, attributeSet, C6095k.kja0.ybb, i2, i3, new int[0]);
        this.f24781y = typedArrayM14534p.getInt(C6095k.kja0.c2, -1);
        this.f24779s = Math.min(typedArrayM14534p.getInt(C6095k.kja0.cp, -1), 1000);
        typedArrayM14534p.recycle();
        this.f24771h = new C4081k();
        this.f24770g = true;
    }

    private void cdj() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().zy(this.f24769f);
            getIndeterminateDrawable().m14709z().mo14717y();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().zy(this.f24769f);
        }
    }

    @dd
    private AbstractC4088y<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().o1t();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().m14699t();
    }

    private void kja0() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m14709z().mo14716q(this.f24774l);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().toq(this.f24769f);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().toq(this.f24769f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ld6() {
        ((f7l8) getCurrentDrawable()).fn3e(false, false, true);
        if (n7h()) {
            setVisibility(4);
        }
    }

    private boolean n7h() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x2() {
        if (this.f24779s > 0) {
            this.f24776p = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    @Override // android.widget.ProgressBar
    @dd
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f24773k.f24846g;
    }

    @lvui
    public int[] getIndicatorColor() {
        return this.f24773k.f67767zy;
    }

    public int getShowAnimationBehavior() {
        return this.f24773k.f24848n;
    }

    @zy.x2
    public int getTrackColor() {
        return this.f24773k.f24849q;
    }

    @InterfaceC7833l
    public int getTrackCornerRadius() {
        return this.f24773k.f67766toq;
    }

    @InterfaceC7833l
    public int getTrackThickness() {
        return this.f24773k.f24847k;
    }

    /* JADX INFO: renamed from: h */
    public void m14683h() {
        if (this.f24781y <= 0) {
            this.f24780t.run();
        } else {
            removeCallbacks(this.f24780t);
            postDelayed(this.f24780t, this.f24781y);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    boolean ki() {
        return C0683f.zsr0(this) && getWindowVisibility() == 0 && qrj();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        kja0();
        if (ki()) {
            x2();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f24778r);
        removeCallbacks(this.f24780t);
        ((f7l8) getCurrentDrawable()).ld6();
        cdj();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(@lvui Canvas canvas) {
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        AbstractC4088y<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        int iMo14705n = currentDrawingDelegate.mo14705n();
        int iMo14706q = currentDrawingDelegate.mo14706q();
        setMeasuredDimension(iMo14705n < 0 ? getMeasuredWidth() : iMo14705n + getPaddingLeft() + getPaddingRight(), iMo14706q < 0 ? getMeasuredHeight() : iMo14706q + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@lvui View view, int i2) {
        super.onVisibilityChanged(view, i2);
        m14686y(i2 == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        m14686y(false);
    }

    /* JADX INFO: renamed from: p */
    public void m14684p() {
        if (getVisibility() != 0) {
            removeCallbacks(this.f24780t);
            return;
        }
        removeCallbacks(this.f24778r);
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f24776p;
        int i2 = this.f24779s;
        if (jUptimeMillis >= ((long) i2)) {
            this.f24778r.run();
        } else {
            postDelayed(this.f24778r, ((long) i2) - jUptimeMillis);
        }
    }

    boolean qrj() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    abstract S mo14685s(@lvui Context context, @lvui AttributeSet attributeSet);

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    @yz
    public void setAnimatorDurationScaleProvider(@lvui C4081k c4081k) {
        this.f24771h = c4081k;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f24800n = c4081k;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f24800n = c4081k;
        }
    }

    public void setHideAnimationBehavior(int i2) {
        this.f24773k.f24846g = i2;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z2) {
        if (z2 == isIndeterminate()) {
            return;
        }
        f7l8 f7l8Var = (f7l8) getCurrentDrawable();
        if (f7l8Var != null) {
            f7l8Var.ld6();
        }
        super.setIndeterminate(z2);
        f7l8 f7l8Var2 = (f7l8) getCurrentDrawable();
        if (f7l8Var2 != null) {
            f7l8Var2.fn3e(ki(), false, false);
        }
        if ((f7l8Var2 instanceof C4083p) && ki()) {
            ((C4083p) f7l8Var2).m14709z().f7l8();
        }
        this.f24772i = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@dd Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof C4083p)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((f7l8) drawable).ld6();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(@zy.x2 int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{kja0.toq(getContext(), C6095k.zy.f80219kz28, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f24773k.f67767zy = iArr;
        getIndeterminateDrawable().m14709z().zy();
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i2) {
        if (isIndeterminate()) {
            return;
        }
        setProgressCompat(i2, false);
    }

    public void setProgressCompat(int i2, boolean z2) {
        if (!isIndeterminate()) {
            super.setProgress(i2);
            if (getProgressDrawable() == null || z2) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f24777q = i2;
            this.f24775n = z2;
            this.f24772i = true;
            if (!getIndeterminateDrawable().isVisible() || this.f24771h.m14703k(getContext().getContentResolver()) == 0.0f) {
                this.f24774l.toq(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().m14709z().mo14713g();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@dd Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof C4080g)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            C4080g c4080g = (C4080g) drawable;
            c4080g.ld6();
            super.setProgressDrawable(c4080g);
            c4080g.jp0y(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i2) {
        this.f24773k.f24848n = i2;
        invalidate();
    }

    public void setTrackColor(@zy.x2 int i2) {
        S s2 = this.f24773k;
        if (s2.f24849q != i2) {
            s2.f24849q = i2;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@InterfaceC7833l int i2) {
        S s2 = this.f24773k;
        if (s2.f67766toq != i2) {
            s2.f67766toq = Math.min(i2, s2.f24847k / 2);
        }
    }

    public void setTrackThickness(@InterfaceC7833l int i2) {
        S s2 = this.f24773k;
        if (s2.f24847k != i2) {
            s2.f24847k = i2;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i2) {
        if (i2 != 0 && i2 != 4 && i2 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f24782z = i2;
    }

    /* JADX INFO: renamed from: y */
    protected void m14686y(boolean z2) {
        if (this.f24770g) {
            ((f7l8) getCurrentDrawable()).fn3e(ki(), false, z2);
        }
    }

    @Override // android.widget.ProgressBar
    @dd
    public C4083p<S> getIndeterminateDrawable() {
        return (C4083p) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    @dd
    public C4080g<S> getProgressDrawable() {
        return (C4080g) super.getProgressDrawable();
    }
}
