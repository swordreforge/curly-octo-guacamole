package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.google.android.material.shape.kja0;
import com.google.android.material.shape.ld6;
import com.google.android.material.shape.t8r;
import h4b.C6070k;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p023g.C6045k;
import zy.InterfaceC7829h;
import zy.cdj;
import zy.dd;
import zy.fn3e;
import zy.lvui;
import zy.n7h;
import zy.x2;
import zy.zurt;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, t8r {

    /* JADX INFO: renamed from: a */
    public static final int f24088a = 8388659;

    /* JADX INFO: renamed from: b */
    private static final String f24089b = "androidx.cardview.widget.CardView";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final int f67456bo = 8388693;

    /* JADX INFO: renamed from: m */
    private static final String f24093m = "MaterialCardView";

    /* JADX INFO: renamed from: u */
    public static final int f24095u = 8388661;

    /* JADX INFO: renamed from: x */
    public static final int f24096x = 8388691;

    /* JADX INFO: renamed from: f */
    private toq f24097f;

    /* JADX INFO: renamed from: l */
    private boolean f24098l;

    /* JADX INFO: renamed from: r */
    private boolean f24099r;

    /* JADX INFO: renamed from: t */
    private boolean f24100t;

    /* JADX INFO: renamed from: z */
    @lvui
    private final C3968k f24101z;

    /* JADX INFO: renamed from: c */
    private static final int[] f24090c = {R.attr.state_checkable};

    /* JADX INFO: renamed from: e */
    private static final int[] f24091e = {R.attr.state_checked};

    /* JADX INFO: renamed from: j */
    private static final int[] f24092j = {C6095k.zy.w2};

    /* JADX INFO: renamed from: o */
    private static final int f24094o = C6095k.n7h.gj;

    /* JADX INFO: renamed from: com.google.android.material.card.MaterialCardView$k */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3967k {
    }

    public interface toq {
        /* JADX INFO: renamed from: k */
        void m14201k(MaterialCardView materialCardView, boolean z2);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    @lvui
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f24101z.m14217p().getBounds());
        return rectF;
    }

    /* JADX INFO: renamed from: s */
    private void m14198s() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f24101z.m14219s();
        }
    }

    @Override // androidx.cardview.widget.CardView
    @lvui
    public ColorStateList getCardBackgroundColor() {
        return this.f24101z.ld6();
    }

    @lvui
    public ColorStateList getCardForegroundColor() {
        return this.f24101z.x2();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    @dd
    public Drawable getCheckedIcon() {
        return this.f24101z.qrj();
    }

    public int getCheckedIconGravity() {
        return this.f24101z.n7h();
    }

    @cdj
    public int getCheckedIconMargin() {
        return this.f24101z.kja0();
    }

    @cdj
    public int getCheckedIconSize() {
        return this.f24101z.m14213h();
    }

    @dd
    public ColorStateList getCheckedIconTint() {
        return this.f24101z.cdj();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f24101z.wvg().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f24101z.wvg().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f24101z.wvg().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f24101z.wvg().top;
    }

    @zurt(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f24101z.fn3e();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f24101z.t8r();
    }

    public ColorStateList getRippleColor() {
        return this.f24101z.zurt();
    }

    @Override // com.google.android.material.shape.t8r
    @lvui
    public kja0 getShapeAppearanceModel() {
        return this.f24101z.ni7();
    }

    @x2
    @Deprecated
    public int getStrokeColor() {
        return this.f24101z.fu4();
    }

    @dd
    public ColorStateList getStrokeColorStateList() {
        return this.f24101z.m14220z();
    }

    @cdj
    public int getStrokeWidth() {
        return this.f24101z.o1t();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f24099r;
    }

    public boolean ld6() {
        return this.f24098l;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ld6.m14841g(this, this.f24101z.m14217p());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        if (m14200p()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24090c);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24091e);
        }
        if (ld6()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24092j);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@lvui AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f24089b);
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@lvui AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f24089b);
        accessibilityNodeInfo.setCheckable(m14200p());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.f24101z.gvn7(getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX INFO: renamed from: p */
    public boolean m14200p() {
        C3968k c3968k = this.f24101z;
        return c3968k != null && c3968k.jk();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f24100t) {
            if (!this.f24101z.mcp()) {
                Log.i(f24093m, "Setting a custom background is not supported.");
                this.f24101z.d3(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@x2 int i2) {
        this.f24101z.oc(ColorStateList.valueOf(i2));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        this.f24101z.m14216o();
    }

    public void setCardForegroundColor(@dd ColorStateList colorStateList) {
        this.f24101z.eqxt(colorStateList);
    }

    public void setCheckable(boolean z2) {
        this.f24101z.d2ok(z2);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (this.f24099r != z2) {
            toggle();
        }
    }

    public void setCheckedIcon(@dd Drawable drawable) {
        this.f24101z.m14218r(drawable);
    }

    public void setCheckedIconGravity(int i2) {
        if (this.f24101z.n7h() != i2) {
            this.f24101z.dd(i2);
        }
    }

    public void setCheckedIconMargin(@cdj int i2) {
        this.f24101z.x9kr(i2);
    }

    public void setCheckedIconMarginResource(@InterfaceC7829h int i2) {
        if (i2 != -1) {
            this.f24101z.x9kr(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setCheckedIconResource(@fn3e int i2) {
        this.f24101z.m14218r(C6045k.toq(getContext(), i2));
    }

    public void setCheckedIconSize(@cdj int i2) {
        this.f24101z.ncyb(i2);
    }

    public void setCheckedIconSizeResource(@InterfaceC7829h int i2) {
        if (i2 != 0) {
            this.f24101z.ncyb(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setCheckedIconTint(@dd ColorStateList colorStateList) {
        this.f24101z.m14215l(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z2) {
        super.setClickable(z2);
        C3968k c3968k = this.f24101z;
        if (c3968k != null) {
            c3968k.hb();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i2, int i3, int i4, int i5) {
        this.f24101z.vyq(i2, i3, i4, i5);
    }

    public void setDragged(boolean z2) {
        if (this.f24098l != z2) {
            this.f24098l = z2;
            refreshDrawableState();
            m14198s();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        this.f24101z.ek5k();
    }

    public void setOnCheckedChangeListener(@dd toq toqVar) {
        this.f24097f = toqVar;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z2) {
        super.setPreventCornerOverlap(z2);
        this.f24101z.ek5k();
        this.f24101z.m14214j();
    }

    public void setProgress(@zurt(from = 0.0d, to = 1.0d) float f2) {
        this.f24101z.hyr(f2);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f2) {
        super.setRadius(f2);
        this.f24101z.n5r1(f2);
    }

    public void setRippleColor(@dd ColorStateList colorStateList) {
        this.f24101z.m14212f(colorStateList);
    }

    public void setRippleColorResource(@n7h int i2) {
        this.f24101z.m14212f(C6045k.m22274k(getContext(), i2));
    }

    @Override // com.google.android.material.shape.t8r
    public void setShapeAppearanceModel(@lvui kja0 kja0Var) {
        setClipToOutline(kja0Var.fn3e(getBoundsAsRectF()));
        this.f24101z.m14211c(kja0Var);
    }

    public void setStrokeColor(@x2 int i2) {
        setStrokeColor(ColorStateList.valueOf(i2));
    }

    public void setStrokeWidth(@cdj int i2) {
        this.f24101z.uv6(i2);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z2) {
        super.setUseCompatPadding(z2);
        this.f24101z.ek5k();
        this.f24101z.m14214j();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m14200p() && isEnabled()) {
            this.f24099r = !this.f24099r;
            refreshDrawableState();
            m14198s();
            this.f24101z.lvui(this.f24099r);
            toq toqVar = this.f24097f;
            if (toqVar != null) {
                toqVar.m14201k(this, this.f24099r);
            }
        }
    }

    void x2(int i2, int i3, int i4, int i5) {
        super.setContentPadding(i2, i3, i4, i5);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.gb7o);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@dd ColorStateList colorStateList) {
        this.f24101z.oc(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f24101z.lrht(colorStateList);
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f24094o;
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        this.f24099r = false;
        this.f24098l = false;
        this.f24100t = true;
        TypedArray typedArrayM14534p = com.google.android.material.internal.cdj.m14534p(getContext(), attributeSet, C6095k.kja0.c7aq, i2, i3, new int[0]);
        C3968k c3968k = new C3968k(this, attributeSet, i2, i3);
        this.f24101z = c3968k;
        c3968k.oc(super.getCardBackgroundColor());
        c3968k.vyq(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c3968k.jp0y(typedArrayM14534p);
        typedArrayM14534p.recycle();
    }
}
