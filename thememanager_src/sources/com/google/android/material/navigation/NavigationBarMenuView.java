package com.google.android.material.navigation;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.C0130p;
import androidx.appcompat.view.menu.f7l8;
import androidx.appcompat.view.menu.kja0;
import androidx.core.util.qrj;
import androidx.core.view.C0683f;
import androidx.core.view.accessibility.ki;
import androidx.transition.zy;
import bap7.C1366k;
import com.google.android.material.animation.C3910k;
import com.google.android.material.badge.C3933k;
import com.google.android.material.shape.C4108p;
import ij.C6095k;
import java.util.HashSet;
import p023g.C6045k;
import p030n.C7397k;
import zy.InterfaceC7833l;
import zy.cdj;
import zy.dd;
import zy.hb;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public abstract class NavigationBarMenuView extends ViewGroup implements kja0 {
    private static final int bb = 5;
    private static final int bp = -1;

    /* JADX INFO: renamed from: a */
    private int f24683a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private f7l8 f67734ab;

    /* JADX INFO: renamed from: b */
    private boolean f24684b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private com.google.android.material.shape.kja0 f67735bo;

    /* JADX INFO: renamed from: c */
    private Drawable f24685c;

    /* JADX INFO: renamed from: d */
    private ColorStateList f24686d;

    /* JADX INFO: renamed from: e */
    private int f24687e;

    /* JADX INFO: renamed from: f */
    @hb
    private int f24688f;

    /* JADX INFO: renamed from: g */
    @lvui
    private final SparseArray<View.OnTouchListener> f24689g;

    /* JADX INFO: renamed from: h */
    private int f24690h;

    /* JADX INFO: renamed from: i */
    @dd
    private ColorStateList f24691i;

    /* JADX INFO: renamed from: j */
    @lvui
    private final SparseArray<C3933k> f24692j;

    /* JADX INFO: renamed from: k */
    @dd
    private final androidx.transition.dd f24693k;

    /* JADX INFO: renamed from: l */
    @hb
    private int f24694l;

    /* JADX INFO: renamed from: m */
    private int f24695m;

    /* JADX INFO: renamed from: n */
    private final qrj.InterfaceC0641k<NavigationBarItemView> f24696n;

    /* JADX INFO: renamed from: o */
    private int f24697o;

    /* JADX INFO: renamed from: p */
    private int f24698p;

    /* JADX INFO: renamed from: q */
    @lvui
    private final View.OnClickListener f24699q;

    /* JADX INFO: renamed from: r */
    @dd
    private final ColorStateList f24700r;

    /* JADX INFO: renamed from: s */
    @dd
    private NavigationBarItemView[] f24701s;

    /* JADX INFO: renamed from: t */
    private ColorStateList f24702t;

    /* JADX INFO: renamed from: u */
    private int f24703u;

    /* JADX INFO: renamed from: v */
    private boolean f24704v;

    /* JADX INFO: renamed from: w */
    private NavigationBarPresenter f24705w;

    /* JADX INFO: renamed from: x */
    private int f24706x;

    /* JADX INFO: renamed from: y */
    private int f24707y;

    /* JADX INFO: renamed from: z */
    @cdj
    private int f24708z;
    private static final int[] bv = {R.attr.state_checked};
    private static final int[] an = {-16842910};

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarMenuView$k */
    class ViewOnClickListenerC4063k implements View.OnClickListener {
        ViewOnClickListenerC4063k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0130p itemData = ((NavigationBarItemView) view).getItemData();
            if (NavigationBarMenuView.this.f67734ab.x9kr(itemData, NavigationBarMenuView.this.f24705w, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public NavigationBarMenuView(@lvui Context context) {
        super(context);
        this.f24696n = new qrj.zy(5);
        this.f24689g = new SparseArray<>(5);
        this.f24698p = 0;
        this.f24690h = 0;
        this.f24692j = new SparseArray<>(5);
        this.f24697o = -1;
        this.f24695m = -1;
        this.f24704v = false;
        this.f24700r = m14650n(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.f24693k = null;
        } else {
            zy zyVar = new zy();
            this.f24693k = zyVar;
            zyVar.w831(0);
            zyVar.gyi(C1366k.m5800q(getContext(), C6095k.zy.e10, getResources().getInteger(C6095k.s.f79883fti)));
            zyVar.xwq3(C1366k.m5799n(getContext(), C6095k.zy.ia, C3910k.f67312toq));
            zyVar.g1(new com.google.android.material.internal.kja0());
        }
        this.f24699q = new ViewOnClickListenerC4063k();
        C0683f.o05(this, 1);
    }

    @dd
    /* JADX INFO: renamed from: g */
    private Drawable m14647g() {
        if (this.f67735bo == null || this.f24686d == null) {
            return null;
        }
        C4108p c4108p = new C4108p(this.f67735bo);
        c4108p.m14867x(this.f24686d);
        return c4108p;
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView navigationBarItemViewMo2983k = this.f24696n.mo2983k();
        return navigationBarItemViewMo2983k == null ? f7l8(getContext()) : navigationBarItemViewMo2983k;
    }

    private void kja0() {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < this.f67734ab.size(); i2++) {
            hashSet.add(Integer.valueOf(this.f67734ab.getItem(i2).getItemId()));
        }
        for (int i3 = 0; i3 < this.f24692j.size(); i3++) {
            int iKeyAt = this.f24692j.keyAt(i3);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.f24692j.delete(iKeyAt);
            }
        }
    }

    private boolean qrj(int i2) {
        return i2 != -1;
    }

    private void setBadgeIfNeeded(@lvui NavigationBarItemView navigationBarItemView) {
        C3933k c3933k;
        int id = navigationBarItemView.getId();
        if (qrj(id) && (c3933k = this.f24692j.get(id)) != null) {
            navigationBarItemView.setBadge(c3933k);
        }
    }

    private void t8r(int i2) {
        if (qrj(i2)) {
            return;
        }
        throw new IllegalArgumentException(i2 + " is not a valid view id");
    }

    void cdj(int i2) {
        int size = this.f67734ab.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = this.f67734ab.getItem(i3);
            if (i2 == item.getItemId()) {
                this.f24698p = i2;
                this.f24690h = i3;
                item.setChecked(true);
                return;
            }
        }
    }

    @lvui
    protected abstract NavigationBarItemView f7l8(@lvui Context context);

    SparseArray<C3933k> getBadgeDrawables() {
        return this.f24692j;
    }

    @dd
    public ColorStateList getIconTintList() {
        return this.f24691i;
    }

    @dd
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f24686d;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f24684b;
    }

    @InterfaceC7833l
    public int getItemActiveIndicatorHeight() {
        return this.f24706x;
    }

    @InterfaceC7833l
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f24703u;
    }

    @dd
    public com.google.android.material.shape.kja0 getItemActiveIndicatorShapeAppearance() {
        return this.f67735bo;
    }

    @InterfaceC7833l
    public int getItemActiveIndicatorWidth() {
        return this.f24683a;
    }

    @dd
    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        return (navigationBarItemViewArr == null || navigationBarItemViewArr.length <= 0) ? this.f24685c : navigationBarItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f24687e;
    }

    @cdj
    public int getItemIconSize() {
        return this.f24708z;
    }

    @InterfaceC7833l
    public int getItemPaddingBottom() {
        return this.f24695m;
    }

    @InterfaceC7833l
    public int getItemPaddingTop() {
        return this.f24697o;
    }

    @hb
    public int getItemTextAppearanceActive() {
        return this.f24688f;
    }

    @hb
    public int getItemTextAppearanceInactive() {
        return this.f24694l;
    }

    @dd
    public ColorStateList getItemTextColor() {
        return this.f24702t;
    }

    public int getLabelVisibilityMode() {
        return this.f24707y;
    }

    @dd
    protected f7l8 getMenu() {
        return this.f67734ab;
    }

    public int getSelectedItemId() {
        return this.f24698p;
    }

    protected int getSelectedItemPosition() {
        return this.f24690h;
    }

    @Override // androidx.appcompat.view.menu.kja0
    public int getWindowAnimations() {
        return 0;
    }

    /* JADX INFO: renamed from: h */
    void m14649h(SparseArray<C3933k> sparseArray) {
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            if (this.f24692j.indexOfKey(iKeyAt) < 0) {
                this.f24692j.append(iKeyAt, sparseArray.get(iKeyAt));
            }
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setBadge(this.f24692j.get(navigationBarItemView.getId()));
            }
        }
    }

    public void ki() {
        androidx.transition.dd ddVar;
        f7l8 f7l8Var = this.f67734ab;
        if (f7l8Var == null || this.f24701s == null) {
            return;
        }
        int size = f7l8Var.size();
        if (size != this.f24701s.length) {
            m14652q();
            return;
        }
        int i2 = this.f24698p;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = this.f67734ab.getItem(i3);
            if (item.isChecked()) {
                this.f24698p = item.getItemId();
                this.f24690h = i3;
            }
        }
        if (i2 != this.f24698p && (ddVar = this.f24693k) != null) {
            androidx.transition.lvui.toq(this, ddVar);
        }
        boolean zX2 = x2(this.f24707y, this.f67734ab.gvn7().size());
        for (int i4 = 0; i4 < size; i4++) {
            this.f24705w.n7h(true);
            this.f24701s[i4].setLabelVisibilityMode(this.f24707y);
            this.f24701s[i4].setShifting(zX2);
            this.f24701s[i4].mo309g((C0130p) this.f67734ab.getItem(i4), 0);
            this.f24705w.n7h(false);
        }
    }

    protected boolean ld6() {
        return this.f24704v;
    }

    @dd
    /* JADX INFO: renamed from: n */
    public ColorStateList m14650n(int i2) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM22274k = C6045k.m22274k(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C7397k.toq.f92982wo, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = colorStateListM22274k.getDefaultColor();
        int[] iArr = an;
        return new ColorStateList(new int[][]{iArr, bv, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListM22274k.getColorForState(iArr, defaultColor), i3, defaultColor});
    }

    void n7h(int i2) {
        t8r(i2);
        C3933k c3933k = this.f24692j.get(i2);
        NavigationBarItemView navigationBarItemViewM14654y = m14654y(i2);
        if (navigationBarItemViewM14654y != null) {
            navigationBarItemViewM14654y.kja0();
        }
        if (c3933k != null) {
            this.f24692j.remove(i2);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@lvui AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ki.r25n(accessibilityNodeInfo).w831(ki.toq.m3069g(1, this.f67734ab.gvn7().size(), false, 1));
    }

    /* JADX INFO: renamed from: p */
    C3933k m14651p(int i2) {
        t8r(i2);
        C3933k c3933kM14085q = this.f24692j.get(i2);
        if (c3933kM14085q == null) {
            c3933kM14085q = C3933k.m14085q(getContext());
            this.f24692j.put(i2, c3933kM14085q);
        }
        NavigationBarItemView navigationBarItemViewM14654y = m14654y(i2);
        if (navigationBarItemViewM14654y != null) {
            navigationBarItemViewM14654y.setBadge(c3933kM14085q);
        }
        return c3933kM14085q;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: q */
    public void m14652q() {
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.f24696n.toq(navigationBarItemView);
                    navigationBarItemView.m14644s();
                }
            }
        }
        if (this.f67734ab.size() == 0) {
            this.f24698p = 0;
            this.f24690h = 0;
            this.f24701s = null;
            return;
        }
        kja0();
        this.f24701s = new NavigationBarItemView[this.f67734ab.size()];
        boolean zX2 = x2(this.f24707y, this.f67734ab.gvn7().size());
        for (int i2 = 0; i2 < this.f67734ab.size(); i2++) {
            this.f24705w.n7h(true);
            this.f67734ab.getItem(i2).setCheckable(true);
            this.f24705w.n7h(false);
            NavigationBarItemView newItem = getNewItem();
            this.f24701s[i2] = newItem;
            newItem.setIconTintList(this.f24691i);
            newItem.setIconSize(this.f24708z);
            newItem.setTextColor(this.f24700r);
            newItem.setTextAppearanceInactive(this.f24694l);
            newItem.setTextAppearanceActive(this.f24688f);
            newItem.setTextColor(this.f24702t);
            int i3 = this.f24697o;
            if (i3 != -1) {
                newItem.setItemPaddingTop(i3);
            }
            int i4 = this.f24695m;
            if (i4 != -1) {
                newItem.setItemPaddingBottom(i4);
            }
            newItem.setActiveIndicatorWidth(this.f24683a);
            newItem.setActiveIndicatorHeight(this.f24706x);
            newItem.setActiveIndicatorMarginHorizontal(this.f24703u);
            newItem.setActiveIndicatorDrawable(m14647g());
            newItem.setActiveIndicatorResizeable(this.f24704v);
            newItem.setActiveIndicatorEnabled(this.f24684b);
            Drawable drawable = this.f24685c;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f24687e);
            }
            newItem.setShifting(zX2);
            newItem.setLabelVisibilityMode(this.f24707y);
            C0130p c0130p = (C0130p) this.f67734ab.getItem(i2);
            newItem.mo309g(c0130p, 0);
            newItem.setItemPosition(i2);
            int itemId = c0130p.getItemId();
            newItem.setOnTouchListener(this.f24689g.get(itemId));
            newItem.setOnClickListener(this.f24699q);
            int i5 = this.f24698p;
            if (i5 != 0 && itemId == i5) {
                this.f24690h = i2;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.f67734ab.size() - 1, this.f24690h);
        this.f24690h = iMin;
        this.f67734ab.getItem(iMin).setChecked(true);
    }

    @dd
    /* JADX INFO: renamed from: s */
    public C3933k m14653s(int i2) {
        return this.f24692j.get(i2);
    }

    public void setIconTintList(@dd ColorStateList colorStateList) {
        this.f24691i = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(@dd ColorStateList colorStateList) {
        this.f24686d = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(m14647g());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z2) {
        this.f24684b = z2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorEnabled(z2);
            }
        }
    }

    public void setItemActiveIndicatorHeight(@InterfaceC7833l int i2) {
        this.f24706x = i2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorHeight(i2);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@InterfaceC7833l int i2) {
        this.f24703u = i2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorMarginHorizontal(i2);
            }
        }
    }

    protected void setItemActiveIndicatorResizeable(boolean z2) {
        this.f24704v = z2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorResizeable(z2);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@dd com.google.android.material.shape.kja0 kja0Var) {
        this.f67735bo = kja0Var;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(m14647g());
            }
        }
    }

    public void setItemActiveIndicatorWidth(@InterfaceC7833l int i2) {
        this.f24683a = i2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorWidth(i2);
            }
        }
    }

    public void setItemBackground(@dd Drawable drawable) {
        this.f24685c = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i2) {
        this.f24687e = i2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(i2);
            }
        }
    }

    public void setItemIconSize(@cdj int i2) {
        this.f24708z = i2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconSize(i2);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i2, @dd View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.f24689g.remove(i2);
        } else {
            this.f24689g.put(i2, onTouchListener);
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView.getItemData().getItemId() == i2) {
                    navigationBarItemView.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemPaddingBottom(@InterfaceC7833l int i2) {
        this.f24695m = i2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingBottom(i2);
            }
        }
    }

    public void setItemPaddingTop(@InterfaceC7833l int i2) {
        this.f24697o = i2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingTop(i2);
            }
        }
    }

    public void setItemTextAppearanceActive(@hb int i2) {
        this.f24688f = i2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i2);
                ColorStateList colorStateList = this.f24702t;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@hb int i2) {
        this.f24694l = i2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i2);
                ColorStateList colorStateList = this.f24702t;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(@dd ColorStateList colorStateList) {
        this.f24702t = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i2) {
        this.f24707y = i2;
    }

    public void setPresenter(@lvui NavigationBarPresenter navigationBarPresenter) {
        this.f24705w = navigationBarPresenter;
    }

    protected boolean x2(int i2, int i3) {
        if (i2 == -1) {
            if (i3 > 3) {
                return true;
            }
        } else if (i2 == 0) {
            return true;
        }
        return false;
    }

    @dd
    /* JADX INFO: renamed from: y */
    public NavigationBarItemView m14654y(int i2) {
        t8r(i2);
        NavigationBarItemView[] navigationBarItemViewArr = this.f24701s;
        if (navigationBarItemViewArr == null) {
            return null;
        }
        for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
            if (navigationBarItemView.getId() == i2) {
                return navigationBarItemView;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.kja0
    public void zy(@lvui f7l8 f7l8Var) {
        this.f67734ab = f7l8Var;
    }
}
