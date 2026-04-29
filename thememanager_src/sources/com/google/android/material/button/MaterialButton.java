package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.C0683f;
import androidx.core.view.qrj;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C4058z;
import com.google.android.material.shape.kja0;
import com.google.android.material.shape.ld6;
import com.google.android.material.shape.t8r;
import h4b.C6070k;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p023g.C6045k;
import zy.InterfaceC7829h;
import zy.InterfaceC7833l;
import zy.cdj;
import zy.dd;
import zy.fn3e;
import zy.hyr;
import zy.lvui;
import zy.n7h;
import zy.uv6;
import zy.x2;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, t8r {

    /* JADX INFO: renamed from: a */
    public static final int f24038a = 3;

    /* JADX INFO: renamed from: b */
    public static final int f24039b = 2;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final int f67441bo = 32;

    /* JADX INFO: renamed from: m */
    public static final int f24042m = 1;

    /* JADX INFO: renamed from: u */
    public static final int f24044u = 16;

    /* JADX INFO: renamed from: v */
    private static final String f24045v = "MaterialButton";

    /* JADX INFO: renamed from: x */
    public static final int f24046x = 4;

    /* JADX INFO: renamed from: c */
    private boolean f24047c;

    /* JADX INFO: renamed from: e */
    private int f24048e;

    /* JADX INFO: renamed from: f */
    private boolean f24049f;

    /* JADX INFO: renamed from: g */
    @lvui
    private final C3966k f24050g;

    /* JADX INFO: renamed from: h */
    @dd
    private ColorStateList f24051h;

    /* JADX INFO: renamed from: i */
    @dd
    private Drawable f24052i;

    /* JADX INFO: renamed from: l */
    @InterfaceC7833l
    private int f24053l;

    /* JADX INFO: renamed from: p */
    @dd
    private PorterDuff.Mode f24054p;

    /* JADX INFO: renamed from: r */
    @InterfaceC7833l
    private int f24055r;

    /* JADX INFO: renamed from: s */
    @dd
    private zy f24056s;

    /* JADX INFO: renamed from: t */
    @InterfaceC7833l
    private int f24057t;

    /* JADX INFO: renamed from: y */
    @lvui
    private final LinkedHashSet<toq> f24058y;

    /* JADX INFO: renamed from: z */
    @InterfaceC7833l
    private int f24059z;

    /* JADX INFO: renamed from: j */
    private static final int[] f24041j = {R.attr.state_checkable};

    /* JADX INFO: renamed from: o */
    private static final int[] f24043o = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    private static final int f24040d = C6095k.n7h.szp;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.button.MaterialButton.SavedState.1
            @Override // android.os.Parcelable.Creator
            @lvui
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@lvui Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @lvui
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@lvui Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @lvui
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: q */
        boolean f24060q;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX INFO: renamed from: k */
        private void m14168k(@lvui Parcel parcel) {
            this.f24060q = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@lvui Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f24060q ? 1 : 0);
        }

        public SavedState(@lvui Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            m14168k(parcel);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$k */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3962k {
    }

    public interface toq {
        /* JADX INFO: renamed from: k */
        void m14170k(MaterialButton materialButton, boolean z2);
    }

    interface zy {
        /* JADX INFO: renamed from: k */
        void mo14171k(MaterialButton materialButton, boolean z2);
    }

    public MaterialButton(@lvui Context context) {
        this(context, null);
    }

    private boolean f7l8() {
        int i2 = this.f24048e;
        return i2 == 16 || i2 == 32;
    }

    /* JADX INFO: renamed from: g */
    private boolean m14162g() {
        int i2 = this.f24048e;
        return i2 == 1 || i2 == 2;
    }

    @lvui
    private String getA11yClassName() {
        return (zy() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & qrj.f4101q;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    private void ld6() {
        if (m14162g()) {
            androidx.core.widget.t8r.ni7(this, this.f24052i, null, null, null);
        } else if (m14163q()) {
            androidx.core.widget.t8r.ni7(this, null, null, this.f24052i, null);
        } else if (f7l8()) {
            androidx.core.widget.t8r.ni7(this, null, this.f24052i, null, null);
        }
    }

    /* JADX INFO: renamed from: q */
    private boolean m14163q() {
        int i2 = this.f24048e;
        return i2 == 3 || i2 == 4;
    }

    private void qrj(int i2, int i3) {
        if (this.f24052i == null || getLayout() == null) {
            return;
        }
        if (!m14162g() && !m14163q()) {
            if (f7l8()) {
                this.f24057t = 0;
                if (this.f24048e == 16) {
                    this.f24055r = 0;
                    x2(false);
                    return;
                }
                int intrinsicHeight = this.f24059z;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f24052i.getIntrinsicHeight();
                }
                int textHeight = (((((i3 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f24053l) - getPaddingBottom()) / 2;
                if (this.f24055r != textHeight) {
                    this.f24055r = textHeight;
                    x2(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f24055r = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.f24048e;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f24057t = 0;
            x2(false);
            return;
        }
        int intrinsicWidth = this.f24059z;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f24052i.getIntrinsicWidth();
        }
        int textWidth = ((((i2 - getTextWidth()) - C0683f.bf2(this)) - intrinsicWidth) - this.f24053l) - C0683f.i1(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textWidth /= 2;
        }
        if (m14165y() != (this.f24048e == 4)) {
            textWidth = -textWidth;
        }
        if (this.f24057t != textWidth) {
            this.f24057t = textWidth;
            x2(false);
        }
    }

    /* JADX INFO: renamed from: s */
    private boolean m14164s() {
        C3966k c3966k = this.f24050g;
        return (c3966k == null || c3966k.kja0()) ? false : true;
    }

    private void x2(boolean z2) {
        Drawable drawable = this.f24052i;
        boolean z3 = true;
        if (drawable != null) {
            Drawable drawableMutate = androidx.core.graphics.drawable.zy.ki(drawable).mutate();
            this.f24052i = drawableMutate;
            androidx.core.graphics.drawable.zy.kja0(drawableMutate, this.f24051h);
            PorterDuff.Mode mode = this.f24054p;
            if (mode != null) {
                androidx.core.graphics.drawable.zy.m2442h(this.f24052i, mode);
            }
            int intrinsicWidth = this.f24059z;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f24052i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f24059z;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f24052i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f24052i;
            int i2 = this.f24057t;
            int i3 = this.f24055r;
            drawable2.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
            this.f24052i.setVisible(true, z2);
        }
        if (z2) {
            ld6();
            return;
        }
        Drawable[] drawableArrM3689y = androidx.core.widget.t8r.m3689y(this);
        Drawable drawable3 = drawableArrM3689y[0];
        Drawable drawable4 = drawableArrM3689y[1];
        Drawable drawable5 = drawableArrM3689y[2];
        if ((!m14162g() || drawable3 == this.f24052i) && ((!m14163q() || drawable5 == this.f24052i) && (!f7l8() || drawable4 == this.f24052i))) {
            z3 = false;
        }
        if (z3) {
            ld6();
        }
    }

    /* JADX INFO: renamed from: y */
    private boolean m14165y() {
        return C0683f.m3159e(this) == 1;
    }

    @Override // android.view.View
    @dd
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @dd
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @InterfaceC7833l
    public int getCornerRadius() {
        if (m14164s()) {
            return this.f24050g.toq();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f24052i;
    }

    public int getIconGravity() {
        return this.f24048e;
    }

    @InterfaceC7833l
    public int getIconPadding() {
        return this.f24053l;
    }

    @InterfaceC7833l
    public int getIconSize() {
        return this.f24059z;
    }

    public ColorStateList getIconTint() {
        return this.f24051h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f24054p;
    }

    @cdj
    public int getInsetBottom() {
        return this.f24050g.zy();
    }

    @cdj
    public int getInsetTop() {
        return this.f24050g.m14193q();
    }

    @dd
    public ColorStateList getRippleColor() {
        if (m14164s()) {
            return this.f24050g.m14196y();
        }
        return null;
    }

    @Override // com.google.android.material.shape.t8r
    @lvui
    public kja0 getShapeAppearanceModel() {
        if (m14164s()) {
            return this.f24050g.m14194s();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m14164s()) {
            return this.f24050g.m14192p();
        }
        return null;
    }

    @InterfaceC7833l
    public int getStrokeWidth() {
        if (m14164s()) {
            return this.f24050g.ld6();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.InterfaceC0704l
    @dd
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        return m14164s() ? this.f24050g.x2() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.InterfaceC0704l
    @dd
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m14164s() ? this.f24050g.qrj() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f24049f;
    }

    /* JADX INFO: renamed from: k */
    public void m14166k(@lvui toq toqVar) {
        this.f24058y.add(toqVar);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m14164s()) {
            ld6.m14841g(this, this.f24050g.m14188g());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (zy()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24041j);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24043o);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(@lvui AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(@lvui AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(zy());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        qrj(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@dd Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f24060q);
    }

    @Override // android.widget.TextView, android.view.View
    @lvui
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f24060q = this.f24049f;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        qrj(getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX INFO: renamed from: p */
    public void m14167p(@lvui toq toqVar) {
        this.f24058y.remove(toqVar);
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f24052i != null) {
            if (this.f24052i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(@lvui Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@x2 int i2) {
        if (m14164s()) {
            this.f24050g.ki(i2);
        } else {
            super.setBackgroundColor(i2);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@lvui Drawable drawable) {
        if (!m14164s()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w(f24045v, "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f24050g.t8r();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@fn3e int i2) {
        setBackgroundDrawable(i2 != 0 ? C6045k.toq(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@dd ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@dd PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (m14164s()) {
            this.f24050g.m14190i(z2);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (zy() && isEnabled() && this.f24049f != z2) {
            this.f24049f = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m14177h(this, this.f24049f);
            }
            if (this.f24047c) {
                return;
            }
            this.f24047c = true;
            Iterator<toq> it = this.f24058y.iterator();
            while (it.hasNext()) {
                it.next().m14170k(this, this.f24049f);
            }
            this.f24047c = false;
        }
    }

    public void setCornerRadius(@InterfaceC7833l int i2) {
        if (m14164s()) {
            this.f24050g.fn3e(i2);
        }
    }

    public void setCornerRadiusResource(@InterfaceC7829h int i2) {
        if (m14164s()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // android.view.View
    @hyr(21)
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (m14164s()) {
            this.f24050g.m14188g().zp(f2);
        }
    }

    public void setIcon(@dd Drawable drawable) {
        if (this.f24052i != drawable) {
            this.f24052i = drawable;
            x2(true);
            qrj(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.f24048e != i2) {
            this.f24048e = i2;
            qrj(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@InterfaceC7833l int i2) {
        if (this.f24053l != i2) {
            this.f24053l = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(@fn3e int i2) {
        setIcon(i2 != 0 ? C6045k.toq(getContext(), i2) : null);
    }

    public void setIconSize(@InterfaceC7833l int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f24059z != i2) {
            this.f24059z = i2;
            x2(true);
        }
    }

    public void setIconTint(@dd ColorStateList colorStateList) {
        if (this.f24051h != colorStateList) {
            this.f24051h = colorStateList;
            x2(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f24054p != mode) {
            this.f24054p = mode;
            x2(false);
        }
    }

    public void setIconTintResource(@n7h int i2) {
        setIconTint(C6045k.m22274k(getContext(), i2));
    }

    public void setInsetBottom(@cdj int i2) {
        this.f24050g.zurt(i2);
    }

    public void setInsetTop(@cdj int i2) {
        this.f24050g.ni7(i2);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(@dd zy zyVar) {
        this.f24056s = zyVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        zy zyVar = this.f24056s;
        if (zyVar != null) {
            zyVar.mo14171k(this, z2);
        }
        super.setPressed(z2);
    }

    public void setRippleColor(@dd ColorStateList colorStateList) {
        if (m14164s()) {
            this.f24050g.fu4(colorStateList);
        }
    }

    public void setRippleColorResource(@n7h int i2) {
        if (m14164s()) {
            setRippleColor(C6045k.m22274k(getContext(), i2));
        }
    }

    @Override // com.google.android.material.shape.t8r
    public void setShapeAppearanceModel(@lvui kja0 kja0Var) {
        if (!m14164s()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f24050g.m14197z(kja0Var);
    }

    void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (m14164s()) {
            this.f24050g.o1t(z2);
        }
    }

    public void setStrokeColor(@dd ColorStateList colorStateList) {
        if (m14164s()) {
            this.f24050g.wvg(colorStateList);
        }
    }

    public void setStrokeColorResource(@n7h int i2) {
        if (m14164s()) {
            setStrokeColor(C6045k.m22274k(getContext(), i2));
        }
    }

    public void setStrokeWidth(@InterfaceC7833l int i2) {
        if (m14164s()) {
            this.f24050g.m14195t(i2);
        }
    }

    public void setStrokeWidthResource(@InterfaceC7829h int i2) {
        if (m14164s()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.InterfaceC0704l
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@dd ColorStateList colorStateList) {
        if (m14164s()) {
            this.f24050g.mcp(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.InterfaceC0704l
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@dd PorterDuff.Mode mode) {
        if (m14164s()) {
            this.f24050g.jk(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    @hyr(17)
    public void setTextAlignment(int i2) {
        super.setTextAlignment(i2);
        qrj(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f24049f);
    }

    public void toq() {
        this.f24058y.clear();
    }

    public boolean zy() {
        C3966k c3966k = this.f24050g;
        return c3966k != null && c3966k.m14189h();
    }

    public MaterialButton(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.ceo);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        int i3 = f24040d;
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        this.f24058y = new LinkedHashSet<>();
        this.f24049f = false;
        this.f24047c = false;
        Context context2 = getContext();
        TypedArray typedArrayM14534p = com.google.android.material.internal.cdj.m14534p(context2, attributeSet, C6095k.kja0.f2, i2, i3, new int[0]);
        this.f24053l = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.px2, 0);
        this.f24054p = C4058z.x2(typedArrayM14534p.getInt(C6095k.kja0.quc, -1), PorterDuff.Mode.SRC_IN);
        this.f24051h = com.google.android.material.resources.zy.m14753k(getContext(), typedArrayM14534p, C6095k.kja0.f12b);
        this.f24052i = com.google.android.material.resources.zy.m14754n(getContext(), typedArrayM14534p, C6095k.kja0.faab);
        this.f24048e = typedArrayM14534p.getInteger(C6095k.kja0.nhj, 1);
        this.f24059z = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.ks5, 0);
        C3966k c3966k = new C3966k(this, kja0.m14820n(context2, attributeSet, i2, i3).qrj());
        this.f24050g = c3966k;
        c3966k.cdj(typedArrayM14534p);
        typedArrayM14534p.recycle();
        setCompoundDrawablePadding(this.f24053l);
        x2(this.f24052i != null);
    }
}
