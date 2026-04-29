package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.C0683f;
import androidx.core.view.accessibility.ki;
import androidx.customview.widget.AbstractC0778k;
import com.google.android.material.animation.C3915y;
import com.google.android.material.chip.C3975k;
import com.google.android.material.internal.C4058z;
import com.google.android.material.internal.InterfaceC4057y;
import com.google.android.material.resources.AbstractC4089g;
import com.google.android.material.resources.C4092q;
import com.google.android.material.shape.kja0;
import com.google.android.material.shape.ld6;
import com.google.android.material.shape.t8r;
import h4b.C6070k;
import ij.C6095k;
import java.util.List;
import zy.InterfaceC7829h;
import zy.InterfaceC7833l;
import zy.InterfaceC7842s;
import zy.InterfaceC7845y;
import zy.cdj;
import zy.dd;
import zy.fn3e;
import zy.hb;
import zy.hyr;
import zy.lvui;
import zy.n7h;
import zy.nn86;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
public class Chip extends AppCompatCheckBox implements C3975k.k, t8r, InterfaceC4057y<Chip> {
    private static final int an = 48;
    private static final String as = "android.view.View";
    private static final String bl = "android.widget.RadioButton";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f67473bo = "Chip";
    private static final String bv = "http://schemas.android.com/apk/res/android";

    /* JADX INFO: renamed from: d */
    private static final int f24118d = 0;
    private static final String id = "android.widget.Button";
    private static final String in = "android.widget.CompoundButton";

    /* JADX INFO: renamed from: w */
    private static final int f24120w = 1;

    /* JADX INFO: renamed from: a */
    private final Rect f24121a;

    /* JADX INFO: renamed from: b */
    private boolean f24122b;

    /* JADX INFO: renamed from: c */
    private boolean f24123c;

    /* JADX INFO: renamed from: e */
    private int f24124e;

    /* JADX INFO: renamed from: f */
    private boolean f24125f;

    /* JADX INFO: renamed from: h */
    @dd
    private View.OnClickListener f24126h;

    /* JADX INFO: renamed from: i */
    @dd
    private CompoundButton.OnCheckedChangeListener f24127i;

    /* JADX INFO: renamed from: j */
    @cdj(unit = 1)
    private int f24128j;

    /* JADX INFO: renamed from: l */
    private boolean f24129l;

    /* JADX INFO: renamed from: m */
    @lvui
    private final C3970q f24130m;

    /* JADX INFO: renamed from: o */
    @dd
    private CharSequence f24131o;

    /* JADX INFO: renamed from: p */
    @dd
    private RippleDrawable f24132p;

    /* JADX INFO: renamed from: r */
    private boolean f24133r;

    /* JADX INFO: renamed from: s */
    @dd
    private InsetDrawable f24134s;

    /* JADX INFO: renamed from: t */
    private boolean f24135t;

    /* JADX INFO: renamed from: u */
    private final AbstractC4089g f24136u;

    /* JADX INFO: renamed from: x */
    private final RectF f24137x;

    /* JADX INFO: renamed from: y */
    @dd
    private C3975k f24138y;

    /* JADX INFO: renamed from: z */
    @dd
    private InterfaceC4057y.k<Chip> f24139z;

    /* JADX INFO: renamed from: v */
    private static final int f24119v = C6095k.n7h.olea;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final Rect f67472ab = new Rect();
    private static final int[] bb = {R.attr.state_selected};
    private static final int[] bp = {R.attr.state_checkable};

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$k */
    class C3969k extends AbstractC4089g {
        C3969k() {
        }

        @Override // com.google.android.material.resources.AbstractC4089g
        /* JADX INFO: renamed from: k */
        public void mo14231k(int i2) {
        }

        @Override // com.google.android.material.resources.AbstractC4089g
        public void toq(@lvui Typeface typeface, boolean z2) {
            Chip chip = Chip.this;
            chip.setText(chip.f24138y.vg() ? Chip.this.f24138y.gcp() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$q */
    private class C3970q extends AbstractC0778k {
        C3970q(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.AbstractC0778k
        protected int getVirtualViewAt(float f2, float f3) {
            return (Chip.this.m14222h() && Chip.this.getCloseIconTouchBounds().contains(f2, f3)) ? 1 : 0;
        }

        @Override // androidx.customview.widget.AbstractC0778k
        protected void getVisibleVirtualViews(@lvui List<Integer> list) {
            list.add(0);
            if (Chip.this.m14222h() && Chip.this.o1t() && Chip.this.f24126h != null) {
                list.add(1);
            }
        }

        @Override // androidx.customview.widget.AbstractC0778k
        protected boolean onPerformActionForVirtualView(int i2, int i3, Bundle bundle) {
            if (i3 != 16) {
                return false;
            }
            if (i2 == 0) {
                return Chip.this.performClick();
            }
            if (i2 == 1) {
                return Chip.this.wvg();
            }
            return false;
        }

        @Override // androidx.customview.widget.AbstractC0778k
        protected void onPopulateNodeForHost(@lvui ki kiVar) {
            kiVar.v0af(Chip.this.m14228i());
            kiVar.cfr(Chip.this.isClickable());
            kiVar.sok(Chip.this.getAccessibilityClassName());
            kiVar.dxef(Chip.this.getText());
        }

        @Override // androidx.customview.widget.AbstractC0778k
        protected void onPopulateNodeForVirtualView(int i2, @lvui ki kiVar) {
            if (i2 != 1) {
                kiVar.yqrt("");
                kiVar.ltg8(Chip.f67472ab);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                kiVar.yqrt(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int i3 = C6095k.qrj.f79815ikck;
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                kiVar.yqrt(context.getString(i3, objArr).trim());
            }
            kiVar.ltg8(Chip.this.getCloseIconTouchBoundsInt());
            kiVar.toq(ki.C0656k.f3942p);
            kiVar.bz2(Chip.this.isEnabled());
        }

        @Override // androidx.customview.widget.AbstractC0778k
        protected void onVirtualViewKeyboardFocusChanged(int i2, boolean z2) {
            if (i2 == 1) {
                Chip.this.f24125f = z2;
                Chip.this.refreshDrawableState();
            }
        }
    }

    class toq implements CompoundButton.OnCheckedChangeListener {
        toq() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
            if (Chip.this.f24139z != null) {
                Chip.this.f24139z.mo14551k(Chip.this, z2);
            }
            if (Chip.this.f24127i != null) {
                Chip.this.f24127i.onCheckedChanged(compoundButton, z2);
            }
        }
    }

    class zy extends ViewOutlineProvider {
        zy() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, @lvui Outline outline) {
            if (Chip.this.f24138y != null) {
                Chip.this.f24138y.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    private void a9() {
        if (m14222h() && o1t() && this.f24126h != null) {
            C0683f.zwy(this, this.f24130m);
            this.f24122b = true;
        } else {
            C0683f.zwy(this, null);
            this.f24122b = false;
        }
    }

    private void cdj(Context context, @dd AttributeSet attributeSet, int i2) {
        TypedArray typedArrayM14534p = com.google.android.material.internal.cdj.m14534p(context, attributeSet, C6095k.kja0.ff8y, i2, f24119v, new int[0]);
        this.f24123c = typedArrayM14534p.getBoolean(C6095k.kja0.fm, false);
        this.f24128j = (int) Math.ceil(typedArrayM14534p.getDimension(C6095k.kja0.yh8z, (float) Math.ceil(C4058z.m14624n(getContext(), 48))));
        typedArrayM14534p.recycle();
    }

    private void d3() {
        TextPaint paint = getPaint();
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            paint.drawableState = c3975k.getState();
        }
        C4092q textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n7h(getContext(), paint, this.f24136u);
        }
    }

    private void fti() {
        if (com.google.android.material.ripple.toq.f24883k) {
            jp0y();
            return;
        }
        this.f24138y.k4jz(true);
        C0683f.wlev(this, getBackgroundDrawable());
        gvn7();
        kja0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @lvui
    public RectF getCloseIconTouchBounds() {
        this.f24137x.setEmpty();
        if (m14222h() && this.f24126h != null) {
            this.f24138y.lh(this.f24137x);
        }
        return this.f24137x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @lvui
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f24121a.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f24121a;
    }

    @dd
    private C4092q getTextAppearance() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.oki();
        }
        return null;
    }

    private void gvn7() {
        C3975k c3975k;
        if (TextUtils.isEmpty(getText()) || (c3975k = this.f24138y) == null) {
            return;
        }
        int iMbx = (int) (c3975k.mbx() + this.f24138y.o05() + this.f24138y.etdu());
        int iIxz = (int) (this.f24138y.ixz() + this.f24138y.m58i() + this.f24138y.ltg8());
        if (this.f24134s != null) {
            Rect rect = new Rect();
            this.f24134s.getPadding(rect);
            iIxz += rect.left;
            iMbx += rect.right;
        }
        C0683f.u38j(this, iIxz, getPaddingTop(), iMbx, getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public boolean m14222h() {
        C3975k c3975k = this.f24138y;
        return (c3975k == null || c3975k.pc() == null) ? false : true;
    }

    private void jk(@dd C3975k c3975k) {
        if (c3975k != null) {
            c3975k.m8(null);
        }
    }

    private void jp0y() {
        this.f24132p = new RippleDrawable(com.google.android.material.ripple.toq.m14763q(this.f24138y.a5id()), getBackgroundDrawable(), null);
        this.f24138y.k4jz(false);
        C0683f.wlev(this, this.f24132p);
        gvn7();
    }

    private void ki() {
        setOutlineProvider(new zy());
    }

    private void kja0() {
        if (getBackgroundDrawable() == this.f24134s && this.f24138y.getCallback() == null) {
            this.f24138y.setCallback(this.f24134s);
        }
    }

    private void oc(@dd AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue(bv, "background") != null) {
            Log.w(f67473bo, "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue(bv, "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue(bv, "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue(bv, "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue(bv, "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue(bv, "singleLine", true) || attributeSet.getAttributeIntValue(bv, "lines", 1) != 1 || attributeSet.getAttributeIntValue(bv, "minLines", 1) != 1 || attributeSet.getAttributeIntValue(bv, "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue(bv, "gravity", 8388627) != 8388627) {
            Log.w(f67473bo, "Chip text must be vertically center and start aligned");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    @lvui
    private int[] qrj() {
        ?? IsEnabled = isEnabled();
        int i2 = IsEnabled;
        if (this.f24125f) {
            i2 = IsEnabled + 1;
        }
        int i3 = i2;
        if (this.f24129l) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (this.f24133r) {
            i4 = i3 + 1;
        }
        int i5 = i4;
        if (isChecked()) {
            i5 = i4 + 1;
        }
        int[] iArr = new int[i5];
        int i6 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i6 = 1;
        }
        if (this.f24125f) {
            iArr[i6] = 16842908;
            i6++;
        }
        if (this.f24129l) {
            iArr[i6] = 16843623;
            i6++;
        }
        if (this.f24133r) {
            iArr[i6] = 16842919;
            i6++;
        }
        if (isChecked()) {
            iArr[i6] = 16842913;
        }
        return iArr;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f24129l != z2) {
            this.f24129l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f24133r != z2) {
            this.f24133r = z2;
            refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: t */
    private void m14226t() {
        if (this.f24134s != null) {
            this.f24134s = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            fti();
        }
    }

    private void t8r(int i2, int i3, int i4, int i5) {
        this.f24134s = new InsetDrawable((Drawable) this.f24138y, i2, i3, i4, i5);
    }

    private void x2(@lvui C3975k c3975k) {
        c3975k.m8(this);
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(@lvui MotionEvent motionEvent) {
        return !this.f24122b ? super.dispatchHoverEvent(motionEvent) : this.f24130m.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f24122b) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f24130m.dispatchKeyEvent(keyEvent) || this.f24130m.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C3975k c3975k = this.f24138y;
        if ((c3975k == null || !c3975k.m2t()) ? false : this.f24138y.kz28(qrj())) {
            invalidate();
        }
    }

    @Deprecated
    public boolean fn3e() {
        return zurt();
    }

    public boolean fu4() {
        C3975k c3975k = this.f24138y;
        return c3975k != null && c3975k.kx3();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @lvui
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f24131o)) {
            return this.f24131o;
        }
        if (!m14228i()) {
            return isClickable() ? id : as;
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).ld6()) ? bl : in;
    }

    @dd
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f24134s;
        return insetDrawable == null ? this.f24138y : insetDrawable;
    }

    @dd
    public Drawable getCheckedIcon() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.bek6();
        }
        return null;
    }

    @dd
    public ColorStateList getCheckedIconTint() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.cv06();
        }
        return null;
    }

    @dd
    public ColorStateList getChipBackgroundColor() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.h7am();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return Math.max(0.0f, c3975k.vep5());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f24138y;
    }

    public float getChipEndPadding() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.mbx();
        }
        return 0.0f;
    }

    @dd
    public Drawable getChipIcon() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.jbh();
        }
        return null;
    }

    public float getChipIconSize() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.yl();
        }
        return 0.0f;
    }

    @dd
    public ColorStateList getChipIconTint() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.uc();
        }
        return null;
    }

    public float getChipMinHeight() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.wx16();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.ixz();
        }
        return 0.0f;
    }

    @dd
    public ColorStateList getChipStrokeColor() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.m28268do();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.ukdy();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @dd
    public Drawable getCloseIcon() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.pc();
        }
        return null;
    }

    @dd
    public CharSequence getCloseIconContentDescription() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.ij();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.nsb();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.zwy();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.n2t();
        }
        return 0.0f;
    }

    @dd
    public ColorStateList getCloseIconTint() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.ngy();
        }
        return null;
    }

    @Override // android.widget.TextView
    @dd
    public TextUtils.TruncateAt getEllipsize() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.wlev();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@lvui Rect rect) {
        if (this.f24122b && (this.f24130m.getKeyboardFocusedVirtualViewId() == 1 || this.f24130m.getAccessibilityFocusedVirtualViewId() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    @dd
    public C3915y getHideMotionSpec() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.ga();
        }
        return null;
    }

    public float getIconEndPadding() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.e5();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.dxef();
        }
        return 0.0f;
    }

    @dd
    public ColorStateList getRippleColor() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.a5id();
        }
        return null;
    }

    @Override // com.google.android.material.shape.t8r
    @lvui
    public kja0 getShapeAppearanceModel() {
        return this.f24138y.getShapeAppearanceModel();
    }

    @dd
    public C3915y getShowMotionSpec() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.lw();
        }
        return null;
    }

    public float getTextEndPadding() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.o05();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            return c3975k.m58i();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: i */
    public boolean m14228i() {
        C3975k c3975k = this.f24138y;
        return c3975k != null && c3975k.nme();
    }

    @Override // com.google.android.material.chip.C3975k.k
    /* JADX INFO: renamed from: k */
    public void mo14229k() {
        n7h(this.f24128j);
        requestLayout();
        invalidateOutline();
    }

    public boolean mcp() {
        return this.f24123c;
    }

    public boolean n7h(@cdj int i2) {
        this.f24128j = i2;
        if (!mcp()) {
            if (this.f24134s != null) {
                m14226t();
            } else {
                fti();
            }
            return false;
        }
        int iMax = Math.max(0, i2 - this.f24138y.getIntrinsicHeight());
        int iMax2 = Math.max(0, i2 - this.f24138y.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f24134s != null) {
                m14226t();
            } else {
                fti();
            }
            return false;
        }
        int i3 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i4 = iMax > 0 ? iMax / 2 : 0;
        if (this.f24134s != null) {
            Rect rect = new Rect();
            this.f24134s.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                fti();
                return true;
            }
        }
        if (getMinHeight() != i2) {
            setMinHeight(i2);
        }
        if (getMinWidth() != i2) {
            setMinWidth(i2);
        }
        t8r(i3, i4, i3, i4);
        fti();
        return true;
    }

    @Deprecated
    public boolean ni7() {
        return fu4();
    }

    public boolean o1t() {
        C3975k c3975k = this.f24138y;
        return c3975k != null && c3975k.u38j();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ld6.m14841g(this, this.f24138y);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, bb);
        }
        if (m14228i()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, bp);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (this.f24122b) {
            this.f24130m.onFocusChanged(z2, i2, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(@lvui MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@lvui AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(m14228i());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            ki.r25n(accessibilityNodeInfo).z4(ki.zy.m3073y(chipGroup.toq(this), 1, chipGroup.zy() ? chipGroup.m14235s(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    @dd
    public PointerIcon onResolvePointerIcon(@lvui MotionEvent motionEvent, int i2) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.f24124e != i2) {
            this.f24124e = i2;
            gvn7();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@zy.lvui android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f24133r
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.f24133r
            if (r0 == 0) goto L34
            r5.wvg()
            r0 = r3
            goto L35
        L34:
            r0 = r2
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = r3
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = r3
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(@dd CharSequence charSequence) {
        this.f24131o = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f24132p) {
            super.setBackground(drawable);
        } else {
            Log.w(f67473bo, "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.w(f67473bo, "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f24132p) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w(f67473bo, "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i2) {
        Log.w(f67473bo, "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@dd ColorStateList colorStateList) {
        Log.w(f67473bo, "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@dd PorterDuff.Mode mode) {
        Log.w(f67473bo, "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.bih(z2);
        }
    }

    public void setCheckableResource(@InterfaceC7845y int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.ec(i2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        C3975k c3975k = this.f24138y;
        if (c3975k == null) {
            this.f24135t = z2;
        } else if (c3975k.nme()) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(@dd Drawable drawable) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.o5(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@InterfaceC7845y int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(@fn3e int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.l05(i2);
        }
    }

    public void setCheckedIconTint(@dd ColorStateList colorStateList) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.cyoe(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@n7h int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.r6ty(i2);
        }
    }

    public void setCheckedIconVisible(@InterfaceC7845y int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.yp31(i2);
        }
    }

    public void setChipBackgroundColor(@dd ColorStateList colorStateList) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.el(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@n7h int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.wt(i2);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.g0ad(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@InterfaceC7829h int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.imd(i2);
        }
    }

    public void setChipDrawable(@lvui C3975k c3975k) {
        C3975k c3975k2 = this.f24138y;
        if (c3975k2 != c3975k) {
            jk(c3975k2);
            this.f24138y = c3975k;
            c3975k.fh(false);
            x2(this.f24138y);
            n7h(this.f24128j);
        }
    }

    public void setChipEndPadding(float f2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.bqie(f2);
        }
    }

    public void setChipEndPaddingResource(@InterfaceC7829h int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.f1bi(i2);
        }
    }

    public void setChipIcon(@dd Drawable drawable) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.tww7(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(@InterfaceC7845y int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(@fn3e int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.gb(i2);
        }
    }

    public void setChipIconSize(float f2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.btvn(f2);
        }
    }

    public void setChipIconSizeResource(@InterfaceC7829h int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.kq2f(i2);
        }
    }

    public void setChipIconTint(@dd ColorStateList colorStateList) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.xm(colorStateList);
        }
    }

    public void setChipIconTintResource(@n7h int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.mj(i2);
        }
    }

    public void setChipIconVisible(@InterfaceC7845y int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.cn02(i2);
        }
    }

    public void setChipMinHeight(float f2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.exv8(f2);
        }
    }

    public void setChipMinHeightResource(@InterfaceC7829h int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.qh4d(i2);
        }
    }

    public void setChipStartPadding(float f2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.hyow(f2);
        }
    }

    public void setChipStartPaddingResource(@InterfaceC7829h int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.xblq(i2);
        }
    }

    public void setChipStrokeColor(@dd ColorStateList colorStateList) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.pnt2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@n7h int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.xtb7(i2);
        }
    }

    public void setChipStrokeWidth(float f2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.mi1u(f2);
        }
    }

    public void setChipStrokeWidthResource(@InterfaceC7829h int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.vwb(i2);
        }
    }

    @Deprecated
    public void setChipText(@dd CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@nn86 int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(@dd Drawable drawable) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.z617(drawable);
        }
        a9();
    }

    public void setCloseIconContentDescription(@dd CharSequence charSequence) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.xzl(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@InterfaceC7845y int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.c25(f2);
        }
    }

    public void setCloseIconEndPaddingResource(@InterfaceC7829h int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.tjz5(i2);
        }
    }

    public void setCloseIconResource(@fn3e int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.f3f(i2);
        }
        a9();
    }

    public void setCloseIconSize(float f2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.i3x9(f2);
        }
    }

    public void setCloseIconSizeResource(@InterfaceC7829h int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.nyj(i2);
        }
    }

    public void setCloseIconStartPadding(float f2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.vss1(f2);
        }
    }

    public void setCloseIconStartPaddingResource(@InterfaceC7829h int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.z4j7(i2);
        }
    }

    public void setCloseIconTint(@dd ColorStateList colorStateList) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.kt06(colorStateList);
        }
    }

    public void setCloseIconTintResource(@n7h int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.d1ts(i2);
        }
    }

    public void setCloseIconVisible(@InterfaceC7845y int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@dd Drawable drawable, @dd Drawable drawable2, @dd Drawable drawable3, @dd Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@dd Drawable drawable, @dd Drawable drawable2, @dd Drawable drawable3, @dd Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.view.View
    @hyr(21)
    public void setElevation(float f2) {
        super.setElevation(f2);
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.zp(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f24138y == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.ula6(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f24123c = z2;
        n7h(this.f24128j);
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w(f67473bo, "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(@dd C3915y c3915y) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.wwp(c3915y);
        }
    }

    public void setHideMotionSpecResource(@zy.toq int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.zuf(i2);
        }
    }

    public void setIconEndPadding(float f2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.sc(f2);
        }
    }

    public void setIconEndPaddingResource(@InterfaceC7829h int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.b7(i2);
        }
    }

    public void setIconStartPadding(float f2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.kl7m(f2);
        }
    }

    public void setIconStartPaddingResource(@InterfaceC7829h int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.oph(i2);
        }
    }

    @Override // com.google.android.material.internal.InterfaceC4057y
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@dd InterfaceC4057y.k<Chip> kVar) {
        this.f24139z = kVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        if (this.f24138y == null) {
            return;
        }
        super.setLayoutDirection(i2);
    }

    @Override // android.widget.TextView
    public void setLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@InterfaceC7833l int i2) {
        super.setMaxWidth(i2);
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.le7(i2);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i2);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@dd CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f24127i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f24126h = onClickListener;
        a9();
    }

    public void setRippleColor(@dd ColorStateList colorStateList) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.mub(colorStateList);
        }
        if (this.f24138y.b9ub()) {
            return;
        }
        jp0y();
    }

    public void setRippleColorResource(@n7h int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.f7z0(i2);
            if (this.f24138y.b9ub()) {
                return;
            }
            jp0y();
        }
    }

    @Override // com.google.android.material.shape.t8r
    public void setShapeAppearanceModel(@lvui kja0 kja0Var) {
        this.f24138y.setShapeAppearanceModel(kja0Var);
    }

    public void setShowMotionSpec(@dd C3915y c3915y) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.kq(c3915y);
        }
    }

    public void setShowMotionSpecResource(@zy.toq int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.anhx(i2);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C3975k c3975k = this.f24138y;
        if (c3975k == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c3975k.vg() ? null : charSequence, bufferType);
        C3975k c3975k2 = this.f24138y;
        if (c3975k2 != null) {
            c3975k2.j3y2(charSequence);
        }
    }

    public void setTextAppearance(@dd C4092q c4092q) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.ge(c4092q);
        }
        d3();
    }

    public void setTextAppearanceResource(@hb int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.z8(f2);
        }
    }

    public void setTextEndPaddingResource(@InterfaceC7829h int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.sb1e(i2);
        }
    }

    public void setTextStartPadding(float f2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.kjd(f2);
        }
    }

    public void setTextStartPaddingResource(@InterfaceC7829h int i2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.m28(i2);
        }
    }

    @InterfaceC7842s
    public boolean wvg() {
        boolean z2 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f24126h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z2 = true;
        }
        if (this.f24122b) {
            this.f24130m.sendEventForVirtualView(1, 1);
        }
        return z2;
    }

    @Deprecated
    /* JADX INFO: renamed from: z */
    public boolean m14230z() {
        return o1t();
    }

    public boolean zurt() {
        C3975k c3975k = this.f24138y;
        return c3975k != null && c3975k.ew();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.f80263ps);
    }

    public void setCloseIconVisible(boolean z2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.uo(z2);
        }
        a9();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f24119v;
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        this.f24121a = new Rect();
        this.f24137x = new RectF();
        this.f24136u = new C3969k();
        Context context2 = getContext();
        oc(attributeSet);
        C3975k c3975kYqrt = C3975k.yqrt(context2, attributeSet, i2, i3);
        cdj(context2, attributeSet, i2);
        setChipDrawable(c3975kYqrt);
        c3975kYqrt.zp(C0683f.m3166l(this));
        TypedArray typedArrayM14534p = com.google.android.material.internal.cdj.m14534p(context2, attributeSet, C6095k.kja0.ff8y, i2, i3, new int[0]);
        boolean zHasValue = typedArrayM14534p.hasValue(C6095k.kja0.zalf);
        typedArrayM14534p.recycle();
        this.f24130m = new C3970q(this);
        a9();
        if (!zHasValue) {
            ki();
        }
        setChecked(this.f24135t);
        setText(c3975kYqrt.gcp());
        setEllipsize(c3975kYqrt.wlev());
        d3();
        if (!this.f24138y.vg()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        gvn7();
        if (mcp()) {
            setMinHeight(this.f24128j);
        }
        this.f24124e = C0683f.m3159e(this);
        super.setOnCheckedChangeListener(new toq());
    }

    public void setCheckedIconVisible(boolean z2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.zff0(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.ovdh(z2);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@dd Drawable drawable, @dd Drawable drawable2, @dd Drawable drawable3, @dd Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@dd Drawable drawable, @dd Drawable drawable2, @dd Drawable drawable3, @dd Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.z5(i2);
        }
        d3();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        C3975k c3975k = this.f24138y;
        if (c3975k != null) {
            c3975k.z5(i2);
        }
        d3();
    }
}
