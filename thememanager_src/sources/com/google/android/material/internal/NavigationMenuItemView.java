package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0130p;
import androidx.appcompat.view.menu.kja0;
import androidx.appcompat.widget.C0182a;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.C0506s;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import ij.C6095k;
import p030n.C7397k;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class NavigationMenuItemView extends ForegroundLinearLayout implements kja0.InterfaceC0124k {
    private static final int[] am = {R.attr.state_checked};
    private Drawable ac;
    private final C0701k ad;
    boolean as;
    private ColorStateList ax;
    private FrameLayout az;
    private C0130p ba;
    private final CheckedTextView bg;
    private boolean bl;
    private boolean bq;
    private int in;

    /* JADX INFO: renamed from: com.google.android.material.internal.NavigationMenuItemView$k */
    class C4038k extends C0701k {
        C4038k() {
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, @lvui androidx.core.view.accessibility.ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            kiVar.v0af(NavigationMenuItemView.this.as);
        }
    }

    public NavigationMenuItemView(@lvui Context context) {
        this(context, null);
    }

    private boolean fti() {
        return this.ba.getTitle() == null && this.ba.getIcon() == null && this.ba.getActionView() != null;
    }

    @dd
    private StateListDrawable jk() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C7397k.toq.f92859fnq8, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(am, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private void mcp() {
        if (fti()) {
            this.bg.setVisibility(8);
            FrameLayout frameLayout = this.az;
            if (frameLayout != null) {
                LinearLayoutCompat.toq toqVar = (LinearLayoutCompat.toq) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) toqVar).width = -1;
                this.az.setLayoutParams(toqVar);
                return;
            }
            return;
        }
        this.bg.setVisibility(0);
        FrameLayout frameLayout2 = this.az;
        if (frameLayout2 != null) {
            LinearLayoutCompat.toq toqVar2 = (LinearLayoutCompat.toq) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) toqVar2).width = -2;
            this.az.setLayoutParams(toqVar2);
        }
    }

    private void setActionView(@dd View view) {
        if (view != null) {
            if (this.az == null) {
                this.az = (FrameLayout) ((ViewStub) findViewById(C6095k.y.f79937bek6)).inflate();
            }
            this.az.removeAllViews();
            this.az.addView(view);
        }
    }

    public void a9() {
        FrameLayout frameLayout = this.az;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.bg.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    /* JADX INFO: renamed from: g */
    public void mo309g(@lvui C0130p c0130p, int i2) {
        this.ba = c0130p;
        if (c0130p.getItemId() > 0) {
            setId(c0130p.getItemId());
        }
        setVisibility(c0130p.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C0683f.wlev(this, jk());
        }
        setCheckable(c0130p.isCheckable());
        setChecked(c0130p.isChecked());
        setEnabled(c0130p.isEnabled());
        setTitle(c0130p.getTitle());
        setIcon(c0130p.getIcon());
        setActionView(c0130p.getActionView());
        setContentDescription(c0130p.getContentDescription());
        C0182a.m528k(this, c0130p.getTooltipText());
        mcp();
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public C0130p getItemData() {
        return this.ba;
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    /* JADX INFO: renamed from: k */
    public boolean mo310k() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        C0130p c0130p = this.ba;
        if (c0130p != null && c0130p.isCheckable() && this.ba.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, am);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.as != z2) {
            this.as = z2;
            this.ad.sendAccessibilityEvent(this.bg, 2048);
        }
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setChecked(boolean z2) {
        refreshDrawableState();
        this.bg.setChecked(z2);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, getPaddingTop(), i2, getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setIcon(@dd Drawable drawable) {
        if (drawable != null) {
            if (this.bq) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.zy.ki(drawable).mutate();
                androidx.core.graphics.drawable.zy.kja0(drawable, this.ax);
            }
            int i2 = this.in;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.bl) {
            if (this.ac == null) {
                Drawable drawableF7l8 = C0506s.f7l8(getResources(), C6095k.f7l8.f78818ukdy, getContext().getTheme());
                this.ac = drawableF7l8;
                if (drawableF7l8 != null) {
                    int i3 = this.in;
                    drawableF7l8.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.ac;
        }
        androidx.core.widget.t8r.ni7(this.bg, drawable, null, null, null);
    }

    public void setIconPadding(int i2) {
        this.bg.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(@zy.cdj int i2) {
        this.in = i2;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.ax = colorStateList;
        this.bq = colorStateList != null;
        C0130p c0130p = this.ba;
        if (c0130p != null) {
            setIcon(c0130p.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.bg.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.bl = z2;
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setShortcut(boolean z2, char c2) {
    }

    public void setTextAppearance(int i2) {
        androidx.core.widget.t8r.a9(this.bg, i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.bg.setTextColor(colorStateList);
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setTitle(CharSequence charSequence) {
        this.bg.setText(charSequence);
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public boolean toq() {
        return true;
    }

    public NavigationMenuItemView(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C4038k c4038k = new C4038k();
        this.ad = c4038k;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C6095k.ld6.f79355x9kr, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C6095k.g.f79007vep5));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C6095k.y.f79952cv06);
        this.bg = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C0683f.zwy(checkedTextView, c4038k);
    }
}
