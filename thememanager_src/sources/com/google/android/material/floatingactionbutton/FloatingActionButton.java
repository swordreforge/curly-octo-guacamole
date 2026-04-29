package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.cdj;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.util.n7h;
import androidx.core.view.C0683f;
import androidx.core.view.InterfaceC0704l;
import androidx.core.widget.InterfaceC0763t;
import com.google.android.material.animation.C3915y;
import com.google.android.material.animation.ld6;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C4032q;
import com.google.android.material.internal.C4052q;
import com.google.android.material.internal.C4058z;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.shape.kja0;
import com.google.android.material.shape.t8r;
import com.google.android.material.stateful.ExtendableSavedState;
import h4b.C6070k;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import ngy.InterfaceC7402k;
import zy.InterfaceC7829h;
import zy.InterfaceC7833l;
import zy.InterfaceC7843t;
import zy.dd;
import zy.fn3e;
import zy.hyr;
import zy.lvui;
import zy.uv6;
import zy.x2;
import zy.yz;

/* JADX INFO: loaded from: classes2.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements InterfaceC0704l, InterfaceC0763t, InterfaceC7402k, t8r, CoordinatorLayout.toq {

    /* JADX INFO: renamed from: a */
    public static final int f24417a = 1;

    /* JADX INFO: renamed from: b */
    private static final int f24418b = C6095k.n7h.wz6j;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final int f67586bo = 0;

    /* JADX INFO: renamed from: m */
    private static final String f24419m = "expandableWidgetHelper";

    /* JADX INFO: renamed from: o */
    private static final String f24420o = "FloatingActionButton";

    /* JADX INFO: renamed from: u */
    public static final int f24421u = -1;

    /* JADX INFO: renamed from: v */
    private static final int f24422v = 470;

    /* JADX INFO: renamed from: x */
    public static final int f24423x = 0;

    /* JADX INFO: renamed from: c */
    @lvui
    private final cdj f24424c;

    /* JADX INFO: renamed from: e */
    @lvui
    private final ngy.zy f24425e;

    /* JADX INFO: renamed from: f */
    private final Rect f24426f;

    /* JADX INFO: renamed from: g */
    @dd
    private ColorStateList f24427g;

    /* JADX INFO: renamed from: h */
    private int f24428h;

    /* JADX INFO: renamed from: i */
    private int f24429i;

    /* JADX INFO: renamed from: j */
    private C4032q f24430j;

    /* JADX INFO: renamed from: l */
    final Rect f24431l;

    /* JADX INFO: renamed from: n */
    @dd
    private PorterDuff.Mode f24432n;

    /* JADX INFO: renamed from: p */
    private int f24433p;

    /* JADX INFO: renamed from: q */
    @dd
    private ColorStateList f24434q;

    /* JADX INFO: renamed from: r */
    boolean f24435r;

    /* JADX INFO: renamed from: s */
    @dd
    private ColorStateList f24436s;

    /* JADX INFO: renamed from: t */
    private int f24437t;

    /* JADX INFO: renamed from: y */
    @dd
    private PorterDuff.Mode f24438y;

    /* JADX INFO: renamed from: z */
    private int f24439z;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: d2ok */
        public /* bridge */ /* synthetic */ boolean qrj(@lvui CoordinatorLayout coordinatorLayout, @lvui FloatingActionButton floatingActionButton, int i2) {
            return super.qrj(coordinatorLayout, floatingActionButton, i2);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: eqxt */
        public /* bridge */ /* synthetic */ boolean mo1757s(CoordinatorLayout coordinatorLayout, @lvui FloatingActionButton floatingActionButton, View view) {
            return super.mo1757s(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean gvn7() {
            return super.gvn7();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: jp0y */
        public /* bridge */ /* synthetic */ boolean toq(@lvui CoordinatorLayout coordinatorLayout, @lvui FloatingActionButton floatingActionButton, @lvui Rect rect) {
            return super.toq(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void lvui(boolean z2) {
            super.lvui(z2);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        @yz
        /* JADX INFO: renamed from: r */
        public /* bridge */ /* synthetic */ void mo14484r(toq toqVar) {
            super.mo14484r(toqVar);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: y */
        public /* bridge */ /* synthetic */ void mo1759y(@lvui CoordinatorLayout.f7l8 f7l8Var) {
            super.mo1759y(f7l8Var);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$k */
    class C4026k implements C4032q.ld6 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ toq f24442k;

        C4026k(toq toqVar) {
            this.f24442k = toqVar;
        }

        @Override // com.google.android.material.floatingactionbutton.C4032q.ld6
        /* JADX INFO: renamed from: k */
        public void mo14485k() {
            this.f24442k.toq(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.C4032q.ld6
        public void toq() {
            this.f24442k.mo14127k(FloatingActionButton.this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$n */
    class C4027n<T extends FloatingActionButton> implements C4032q.p {

        /* JADX INFO: renamed from: k */
        @lvui
        private final ld6<T> f24443k;

        C4027n(@lvui ld6<T> ld6Var) {
            this.f24443k = ld6Var;
        }

        public boolean equals(@dd Object obj) {
            return (obj instanceof C4027n) && ((C4027n) obj).f24443k.equals(this.f24443k);
        }

        public int hashCode() {
            return this.f24443k.hashCode();
        }

        @Override // com.google.android.material.floatingactionbutton.C4032q.p
        /* JADX INFO: renamed from: k */
        public void mo14486k() {
            this.f24443k.toq(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.C4032q.p
        public void toq() {
            this.f24443k.mo13981k(FloatingActionButton.this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$q */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface InterfaceC4028q {
    }

    public static abstract class toq {
        /* JADX INFO: renamed from: k */
        public void mo14127k(FloatingActionButton floatingActionButton) {
        }

        public void toq(FloatingActionButton floatingActionButton) {
        }
    }

    private class zy implements com.google.android.material.shadow.zy {
        zy() {
        }

        @Override // com.google.android.material.shadow.zy
        /* JADX INFO: renamed from: k */
        public void mo14487k(int i2, int i3, int i4, int i5) {
            FloatingActionButton.this.f24431l.set(i2, i3, i4, i5);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i2 + floatingActionButton.f24439z, i3 + FloatingActionButton.this.f24439z, i4 + FloatingActionButton.this.f24439z, i5 + FloatingActionButton.this.f24439z);
        }

        @Override // com.google.android.material.shadow.zy
        public void setBackgroundDrawable(@dd Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // com.google.android.material.shadow.zy
        public boolean toq() {
            return FloatingActionButton.this.f24435r;
        }

        @Override // com.google.android.material.shadow.zy
        public float zy() {
            return FloatingActionButton.this.getSizeDimension() / 2.0f;
        }
    }

    public FloatingActionButton(@lvui Context context) {
        this(context, null);
    }

    private static int fu4(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i2, size);
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    private C4032q getImpl() {
        if (this.f24430j == null) {
            this.f24430j = m14475p();
        }
        return this.f24430j;
    }

    /* JADX INFO: renamed from: i */
    private void m14473i() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f24427g;
        if (colorStateList == null) {
            androidx.core.graphics.drawable.zy.zy(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f24438y;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(androidx.appcompat.widget.ld6.m629n(colorForState, mode));
    }

    @dd
    private C4032q.ld6 mcp(@dd toq toqVar) {
        if (toqVar == null) {
            return null;
        }
        return new C4026k(toqVar);
    }

    @lvui
    /* JADX INFO: renamed from: p */
    private C4032q m14475p() {
        return new C4031n(this, new zy());
    }

    private int qrj(int i2) {
        int i3 = this.f24429i;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        return i2 != -1 ? i2 != 1 ? resources.getDimensionPixelSize(C6095k.g.f78931ktq) : resources.getDimensionPixelSize(C6095k.g.f78922jz5) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < f24422v ? qrj(1) : qrj(0);
    }

    private void t8r(@lvui Rect rect) {
        int i2 = rect.left;
        Rect rect2 = this.f24431l;
        rect.left = i2 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public boolean cdj() {
        return getImpl().m14513z();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().a9(getDrawableState());
    }

    public void f7l8(@lvui Animator.AnimatorListener animatorListener) {
        getImpl().m14506g(animatorListener);
    }

    public void fn3e(@lvui Animator.AnimatorListener animatorListener) {
        getImpl().eqxt(animatorListener);
    }

    /* JADX INFO: renamed from: g */
    public void m14477g(@lvui Animator.AnimatorListener animatorListener) {
        getImpl().m14511n(animatorListener);
    }

    @Override // android.view.View
    @dd
    public ColorStateList getBackgroundTintList() {
        return this.f24434q;
    }

    @Override // android.view.View
    @dd
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f24432n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.toq
    @lvui
    public CoordinatorLayout.zy<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().n7h();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().cdj();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().m14508i();
    }

    @dd
    public Drawable getContentBackground() {
        return getImpl().qrj();
    }

    @InterfaceC7833l
    public int getCustomSize() {
        return this.f24429i;
    }

    @Override // ngy.InterfaceC7402k
    public int getExpandedComponentIdHint() {
        return this.f24425e.toq();
    }

    @dd
    public C3915y getHideMotionSpec() {
        return getImpl().m14507h();
    }

    @x2
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f24436s;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @dd
    public ColorStateList getRippleColorStateList() {
        return this.f24436s;
    }

    @Override // com.google.android.material.shape.t8r
    @lvui
    public kja0 getShapeAppearanceModel() {
        return (kja0) n7h.x2(getImpl().fn3e());
    }

    @dd
    public C3915y getShowMotionSpec() {
        return getImpl().zurt();
    }

    public int getSize() {
        return this.f24428h;
    }

    int getSizeDimension() {
        return qrj(this.f24428h);
    }

    @Override // androidx.core.view.InterfaceC0704l
    @dd
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.view.InterfaceC0704l
    @dd
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.InterfaceC0763t
    @dd
    public ColorStateList getSupportImageTintList() {
        return this.f24427g;
    }

    @Override // androidx.core.widget.InterfaceC0763t
    @dd
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f24438y;
    }

    public boolean getUseCompatPadding() {
        return this.f24435r;
    }

    /* JADX INFO: renamed from: h */
    void m14478h(@dd toq toqVar, boolean z2) {
        getImpl().ni7(mcp(toqVar), z2);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().wvg();
    }

    @Override // ngy.toq
    /* JADX INFO: renamed from: k */
    public boolean mo14479k(boolean z2) {
        return this.f24425e.m26801g(z2);
    }

    public boolean ki() {
        return getImpl().o1t();
    }

    public void kja0(@dd toq toqVar) {
        m14478h(toqVar, true);
    }

    @Deprecated
    public boolean ld6(@lvui Rect rect) {
        if (!C0683f.v0af(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        t8r(rect);
        return true;
    }

    public void n7h() {
        kja0(null);
    }

    public void ni7(@lvui ld6<? extends FloatingActionButton> ld6Var) {
        getImpl().lvui(new C4027n(ld6Var));
    }

    public void o1t() {
        wvg(null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m14512t();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().jk();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i2, int i3) {
        int sizeDimension = getSizeDimension();
        this.f24439z = (sizeDimension - this.f24437t) / 2;
        getImpl().m14502b();
        int iMin = Math.min(fu4(sizeDimension, i2), fu4(sizeDimension, i3));
        Rect rect = this.f24431l;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.getSuperState());
        this.f24425e.m26803q((Bundle) n7h.x2(extendableSavedState.f25125q.get(f24419m)));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        extendableSavedState.f25125q.put(f24419m, this.f24425e.m26802n());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@lvui MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && ld6(this.f24426f) && !this.f24426f.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: s */
    public void m14480s() {
        setCustomSize(0);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.i(f24420o, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i(f24420o, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        Log.i(f24420o, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@dd ColorStateList colorStateList) {
        if (this.f24434q != colorStateList) {
            this.f24434q = colorStateList;
            getImpl().dd(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@dd PorterDuff.Mode mode) {
        if (this.f24432n != mode) {
            this.f24432n = mode;
            getImpl().x9kr(mode);
        }
    }

    public void setCompatElevation(float f2) {
        getImpl().ncyb(f2);
    }

    public void setCompatElevationResource(@InterfaceC7829h int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        getImpl().hyr(f2);
    }

    public void setCompatHoveredFocusedTranslationZResource(@InterfaceC7829h int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        getImpl().uv6(f2);
    }

    public void setCompatPressedTranslationZResource(@InterfaceC7829h int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(@InterfaceC7833l int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i2 != this.f24429i) {
            this.f24429i = i2;
            requestLayout();
        }
    }

    @Override // android.view.View
    @hyr(21)
    public void setElevation(float f2) {
        super.setElevation(f2);
        getImpl().bf2(f2);
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        if (z2 != getImpl().kja0()) {
            getImpl().m14509l(z2);
            requestLayout();
        }
    }

    @Override // ngy.InterfaceC7402k
    public void setExpandedComponentIdHint(@InterfaceC7843t int i2) {
        this.f24425e.f7l8(i2);
    }

    public void setHideMotionSpec(@dd C3915y c3915y) {
        getImpl().n5r1(c3915y);
    }

    public void setHideMotionSpecResource(@zy.toq int i2) {
        setHideMotionSpec(C3915y.m13992q(getContext(), i2));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@dd Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().y9n();
            if (this.f24427g != null) {
                m14473i();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@fn3e int i2) {
        this.f24424c.m568s(i2);
        m14473i();
    }

    public void setMaxImageSize(int i2) {
        this.f24437t = i2;
        getImpl().m14503c(i2);
    }

    public void setRippleColor(@x2 int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    @Override // android.view.View
    public void setScaleX(float f2) {
        super.setScaleX(f2);
        getImpl().d3();
    }

    @Override // android.view.View
    public void setScaleY(float f2) {
        super.setScaleY(f2);
        getImpl().d3();
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    @yz
    public void setShadowPaddingEnabled(boolean z2) {
        getImpl().m14504e(z2);
    }

    @Override // com.google.android.material.shape.t8r
    public void setShapeAppearanceModel(@lvui kja0 kja0Var) {
        getImpl().nn86(kja0Var);
    }

    public void setShowMotionSpec(@dd C3915y c3915y) {
        getImpl().hb(c3915y);
    }

    public void setShowMotionSpecResource(@zy.toq int i2) {
        setShowMotionSpec(C3915y.m13992q(getContext(), i2));
    }

    public void setSize(int i2) {
        this.f24429i = 0;
        if (i2 != this.f24428h) {
            this.f24428h = i2;
            requestLayout();
        }
    }

    @Override // androidx.core.view.InterfaceC0704l
    public void setSupportBackgroundTintList(@dd ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // androidx.core.view.InterfaceC0704l
    public void setSupportBackgroundTintMode(@dd PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.InterfaceC0763t
    public void setSupportImageTintList(@dd ColorStateList colorStateList) {
        if (this.f24427g != colorStateList) {
            this.f24427g = colorStateList;
            m14473i();
        }
    }

    @Override // androidx.core.widget.InterfaceC0763t
    public void setSupportImageTintMode(@dd PorterDuff.Mode mode) {
        if (this.f24438y != mode) {
            this.f24438y = mode;
            m14473i();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        getImpl().oc();
    }

    @Override // android.view.View
    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        getImpl().oc();
    }

    @Override // android.view.View
    public void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        getImpl().oc();
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.f24435r != z2) {
            this.f24435r = z2;
            getImpl().mcp();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    /* JADX INFO: renamed from: t */
    void m14481t(@dd toq toqVar, boolean z2) {
        getImpl().ek5k(mcp(toqVar), z2);
    }

    @Override // ngy.toq
    public boolean toq() {
        return this.f24425e.zy();
    }

    public void wvg(@dd toq toqVar) {
        m14481t(toqVar, true);
    }

    public void x2(@lvui Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        t8r(rect);
    }

    /* JADX INFO: renamed from: y */
    public void m14482y(@lvui ld6<? extends FloatingActionButton> ld6Var) {
        getImpl().f7l8(new C4027n(ld6Var));
    }

    /* JADX INFO: renamed from: z */
    public boolean m14483z() {
        return getImpl().kja0();
    }

    public void zurt(@lvui Animator.AnimatorListener animatorListener) {
        getImpl().d2ok(animatorListener);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.zy<T> {

        /* JADX INFO: renamed from: q */
        private static final boolean f24440q = true;

        /* JADX INFO: renamed from: k */
        private Rect f24441k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private toq f67587toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f67588zy;

        public BaseBehavior() {
            this.f67588zy = true;
        }

        private static boolean d3(@lvui View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f7l8) {
                return ((CoordinatorLayout.f7l8) layoutParams).m1740g() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean dd(@lvui View view, @lvui FloatingActionButton floatingActionButton) {
            return this.f67588zy && ((CoordinatorLayout.f7l8) floatingActionButton.getLayoutParams()).m1744n() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean ncyb(@lvui View view, @lvui FloatingActionButton floatingActionButton) {
            if (!dd(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f7l8) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m14478h(this.f67587toq, false);
                return true;
            }
            floatingActionButton.m14481t(this.f67587toq, false);
            return true;
        }

        private void oc(@lvui CoordinatorLayout coordinatorLayout, @lvui FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f24431l;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f7l8 f7l8Var = (CoordinatorLayout.f7l8) floatingActionButton.getLayoutParams();
            int i2 = 0;
            int i3 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) f7l8Var).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) f7l8Var).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) f7l8Var).bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) f7l8Var).topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                C0683f.zkd(floatingActionButton, i2);
            }
            if (i3 != 0) {
                C0683f.gc3c(floatingActionButton, i3);
            }
        }

        private boolean x9kr(CoordinatorLayout coordinatorLayout, @lvui AppBarLayout appBarLayout, @lvui FloatingActionButton floatingActionButton) {
            if (!dd(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f24441k == null) {
                this.f24441k = new Rect();
            }
            Rect rect = this.f24441k;
            C4052q.m14583k(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m14478h(this.f67587toq, false);
                return true;
            }
            floatingActionButton.m14481t(this.f67587toq, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: d2ok, reason: merged with bridge method [inline-methods] */
        public boolean qrj(@lvui CoordinatorLayout coordinatorLayout, @lvui FloatingActionButton floatingActionButton, int i2) {
            List<View> listM1736i = coordinatorLayout.m1736i(floatingActionButton);
            int size = listM1736i.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = listM1736i.get(i3);
                if (!(view instanceof AppBarLayout)) {
                    if (d3(view) && ncyb(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (x9kr(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m1738r(floatingActionButton, i2);
            oc(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: eqxt, reason: merged with bridge method [inline-methods] */
        public boolean mo1757s(CoordinatorLayout coordinatorLayout, @lvui FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                x9kr(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!d3(view)) {
                return false;
            }
            ncyb(view, floatingActionButton);
            return false;
        }

        public boolean gvn7() {
            return this.f67588zy;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: jp0y, reason: merged with bridge method [inline-methods] */
        public boolean toq(@lvui CoordinatorLayout coordinatorLayout, @lvui FloatingActionButton floatingActionButton, @lvui Rect rect) {
            Rect rect2 = floatingActionButton.f24431l;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public void lvui(boolean z2) {
            this.f67588zy = z2;
        }

        @yz
        /* JADX INFO: renamed from: r */
        public void mo14484r(toq toqVar) {
            this.f67587toq = toqVar;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: y */
        public void mo1759y(@lvui CoordinatorLayout.f7l8 f7l8Var) {
            if (f7l8Var.f3089y == 0) {
                f7l8Var.f3089y = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6095k.kja0.ktm);
            this.f67588zy = typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.hze4, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.kho);
    }

    public void setRippleColor(@dd ColorStateList colorStateList) {
        if (this.f24436s != colorStateList) {
            this.f24436s = colorStateList;
            getImpl().vyq(this.f24436s);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        int i3 = f24418b;
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        this.f24431l = new Rect();
        this.f24426f = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM14534p = com.google.android.material.internal.cdj.m14534p(context2, attributeSet, C6095k.kja0.a77c, i2, i3, new int[0]);
        this.f24434q = com.google.android.material.resources.zy.m14753k(context2, typedArrayM14534p, C6095k.kja0.b37y);
        this.f24432n = C4058z.x2(typedArrayM14534p.getInt(C6095k.kja0.gvs2, -1), null);
        this.f24436s = com.google.android.material.resources.zy.m14753k(context2, typedArrayM14534p, C6095k.kja0.trbh);
        this.f24428h = typedArrayM14534p.getInt(C6095k.kja0.tdsa, -1);
        this.f24429i = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.jn, 0);
        this.f24433p = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.q5aq, 0);
        float dimension = typedArrayM14534p.getDimension(C6095k.kja0.krop, 0.0f);
        float dimension2 = typedArrayM14534p.getDimension(C6095k.kja0.wc6, 0.0f);
        float dimension3 = typedArrayM14534p.getDimension(C6095k.kja0.ax, 0.0f);
        this.f24435r = typedArrayM14534p.getBoolean(C6095k.kja0.m6t, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C6095k.g.nrys);
        setMaxImageSize(typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.e2, 0));
        C3915y c3915yZy = C3915y.zy(context2, typedArrayM14534p, C6095k.kja0.wjzm);
        C3915y c3915yZy2 = C3915y.zy(context2, typedArrayM14534p, C6095k.kja0.ru);
        kja0 kja0VarQrj = kja0.f7l8(context2, attributeSet, i2, i3, kja0.f67832qrj).qrj();
        boolean z2 = typedArrayM14534p.getBoolean(C6095k.kja0.w3, false);
        setEnabled(typedArrayM14534p.getBoolean(C6095k.kja0.tma, true));
        typedArrayM14534p.recycle();
        cdj cdjVar = new cdj(this);
        this.f24424c = cdjVar;
        cdjVar.f7l8(attributeSet, i2);
        this.f24425e = new ngy.zy(this);
        getImpl().nn86(kja0VarQrj);
        getImpl().fu4(this.f24434q, this.f24432n, this.f24436s, this.f24433p);
        getImpl().lrht(dimensionPixelSize);
        getImpl().ncyb(dimension);
        getImpl().hyr(dimension2);
        getImpl().uv6(dimension3);
        getImpl().hb(c3915yZy);
        getImpl().n5r1(c3915yZy2);
        getImpl().m14509l(z2);
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
