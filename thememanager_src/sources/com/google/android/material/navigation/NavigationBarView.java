package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f7l8;
import androidx.appcompat.widget.C0184b;
import androidx.core.view.C0683f;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.badge.C3933k;
import com.google.android.material.internal.cdj;
import com.google.android.material.shape.C4108p;
import com.google.android.material.shape.kja0;
import com.google.android.material.shape.ld6;
import h4b.C6070k;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.InterfaceC7828g;
import zy.InterfaceC7829h;
import zy.InterfaceC7833l;
import zy.InterfaceC7843t;
import zy.dd;
import zy.fn3e;
import zy.hb;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* JADX INFO: renamed from: h */
    public static final int f24716h = -1;

    /* JADX INFO: renamed from: i */
    public static final int f24717i = 0;

    /* JADX INFO: renamed from: r */
    private static final int f24718r = 1;

    /* JADX INFO: renamed from: t */
    public static final int f24719t = 2;

    /* JADX INFO: renamed from: z */
    public static final int f24720z = 1;

    /* JADX INFO: renamed from: g */
    @dd
    private ColorStateList f24721g;

    /* JADX INFO: renamed from: k */
    @lvui
    private final C4070k f24722k;

    /* JADX INFO: renamed from: n */
    @lvui
    private final NavigationBarPresenter f24723n;

    /* JADX INFO: renamed from: p */
    private zy f24724p;

    /* JADX INFO: renamed from: q */
    @lvui
    private final NavigationBarMenuView f24725q;

    /* JADX INFO: renamed from: s */
    private InterfaceC4067q f24726s;

    /* JADX INFO: renamed from: y */
    private MenuInflater f24727y;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarView.SavedState.1
            @Override // android.os.Parcelable.Creator
            @dd
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
        @dd
        Bundle f24728q;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX INFO: renamed from: k */
        private void m14662k(@lvui Parcel parcel, ClassLoader classLoader) {
            this.f24728q = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@lvui Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeBundle(this.f24728q);
        }

        public SavedState(@lvui Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m14662k(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarView$k */
    class C4066k implements f7l8.InterfaceC0118k {
        C4066k() {
        }

        @Override // androidx.appcompat.view.menu.f7l8.InterfaceC0118k
        /* JADX INFO: renamed from: k */
        public boolean mo117k(f7l8 f7l8Var, @lvui MenuItem menuItem) {
            if (NavigationBarView.this.f24724p == null || menuItem.getItemId() != NavigationBarView.this.getSelectedItemId()) {
                return (NavigationBarView.this.f24726s == null || NavigationBarView.this.f24726s.m14664k(menuItem)) ? false : true;
            }
            NavigationBarView.this.f24724p.m14665k(menuItem);
            return true;
        }

        @Override // androidx.appcompat.view.menu.f7l8.InterfaceC0118k
        public void toq(f7l8 f7l8Var) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarView$q */
    public interface InterfaceC4067q {
        /* JADX INFO: renamed from: k */
        boolean m14664k(@lvui MenuItem menuItem);
    }

    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface toq {
    }

    public interface zy {
        /* JADX INFO: renamed from: k */
        void m14665k(@lvui MenuItem menuItem);
    }

    public NavigationBarView(@lvui Context context, @dd AttributeSet attributeSet, @InterfaceC7828g int i2, @hb int i3) {
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f24723n = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = C6095k.kja0.ta9a;
        int i4 = C6095k.kja0.me;
        int i5 = C6095k.kja0.im;
        C0184b c0184bLd6 = cdj.ld6(context2, attributeSet, iArr, i2, i3, i4, i5);
        C4070k c4070k = new C4070k(context2, getClass(), getMaxItemCount());
        this.f24722k = c4070k;
        NavigationBarMenuView navigationBarMenuViewMo14138q = mo14138q(context2);
        this.f24725q = navigationBarMenuViewMo14138q;
        navigationBarPresenter.qrj(navigationBarMenuViewMo14138q);
        navigationBarPresenter.m14655g(1);
        navigationBarMenuViewMo14138q.setPresenter(navigationBarPresenter);
        c4070k.toq(navigationBarPresenter);
        navigationBarPresenter.x2(getContext(), c4070k);
        int i6 = C6095k.kja0.b1ty;
        if (c0184bLd6.mcp(i6)) {
            navigationBarMenuViewMo14138q.setIconTintList(c0184bLd6.m550q(i6));
        } else {
            navigationBarMenuViewMo14138q.setIconTintList(navigationBarMenuViewMo14138q.m14650n(R.attr.textColorSecondary));
        }
        setItemIconSize(c0184bLd6.f7l8(C6095k.kja0.tpl, getResources().getDimensionPixelSize(C6095k.g.y76)));
        if (c0184bLd6.mcp(i4)) {
            setItemTextAppearanceInactive(c0184bLd6.fn3e(i4, 0));
        }
        if (c0184bLd6.mcp(i5)) {
            setItemTextAppearanceActive(c0184bLd6.fn3e(i5, 0));
        }
        int i7 = C6095k.kja0.eov;
        if (c0184bLd6.mcp(i7)) {
            setItemTextColor(c0184bLd6.m550q(i7));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C0683f.wlev(this, zy(context2));
        }
        int i8 = C6095k.kja0.jk2;
        if (c0184bLd6.mcp(i8)) {
            setItemPaddingTop(c0184bLd6.f7l8(i8, 0));
        }
        int i9 = C6095k.kja0.khz;
        if (c0184bLd6.mcp(i9)) {
            setItemPaddingBottom(c0184bLd6.f7l8(i9, 0));
        }
        if (c0184bLd6.mcp(C6095k.kja0.tn4)) {
            setElevation(c0184bLd6.f7l8(r12, 0));
        }
        androidx.core.graphics.drawable.zy.kja0(getBackground().mutate(), com.google.android.material.resources.zy.toq(context2, c0184bLd6, C6095k.kja0.v5fy));
        setLabelVisibilityMode(c0184bLd6.m545h(C6095k.kja0.pkq2, -1));
        int iFn3e = c0184bLd6.fn3e(C6095k.kja0.x9e, 0);
        if (iFn3e != 0) {
            navigationBarMenuViewMo14138q.setItemBackgroundRes(iFn3e);
        } else {
            setItemRippleColor(com.google.android.material.resources.zy.toq(context2, c0184bLd6, C6095k.kja0.dqa));
        }
        int iFn3e2 = c0184bLd6.fn3e(C6095k.kja0.hx5d, 0);
        if (iFn3e2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iFn3e2, C6095k.kja0.tdq);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(C6095k.kja0.i55, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(C6095k.kja0.wjj2, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C6095k.kja0.a4, 0));
            setItemActiveIndicatorColor(com.google.android.material.resources.zy.m14753k(context2, typedArrayObtainStyledAttributes, C6095k.kja0.vqy));
            setItemActiveIndicatorShapeAppearance(kja0.toq(context2, typedArrayObtainStyledAttributes.getResourceId(C6095k.kja0.j8wd, 0), 0).qrj());
            typedArrayObtainStyledAttributes.recycle();
        }
        int i10 = C6095k.kja0.rr7;
        if (c0184bLd6.mcp(i10)) {
            f7l8(c0184bLd6.fn3e(i10, 0));
        }
        c0184bLd6.d3();
        addView(navigationBarMenuViewMo14138q);
        c4070k.uv6(new C4066k());
    }

    private MenuInflater getMenuInflater() {
        if (this.f24727y == null) {
            this.f24727y = new androidx.appcompat.view.f7l8(getContext());
        }
        return this.f24727y;
    }

    @lvui
    private C4108p zy(Context context) {
        C4108p c4108p = new C4108p();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            c4108p.m14867x(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        c4108p.m14856e(context);
        return c4108p;
    }

    public void f7l8(int i2) {
        this.f24723n.n7h(true);
        getMenuInflater().inflate(i2, this.f24722k);
        this.f24723n.n7h(false);
        this.f24723n.mo355q(true);
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public C3933k m14658g(int i2) {
        return this.f24725q.m14651p(i2);
    }

    @dd
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f24725q.getItemActiveIndicatorColor();
    }

    @InterfaceC7833l
    public int getItemActiveIndicatorHeight() {
        return this.f24725q.getItemActiveIndicatorHeight();
    }

    @InterfaceC7833l
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f24725q.getItemActiveIndicatorMarginHorizontal();
    }

    @dd
    public kja0 getItemActiveIndicatorShapeAppearance() {
        return this.f24725q.getItemActiveIndicatorShapeAppearance();
    }

    @InterfaceC7833l
    public int getItemActiveIndicatorWidth() {
        return this.f24725q.getItemActiveIndicatorWidth();
    }

    @dd
    public Drawable getItemBackground() {
        return this.f24725q.getItemBackground();
    }

    @Deprecated
    @fn3e
    public int getItemBackgroundResource() {
        return this.f24725q.getItemBackgroundRes();
    }

    @zy.cdj
    public int getItemIconSize() {
        return this.f24725q.getItemIconSize();
    }

    @dd
    public ColorStateList getItemIconTintList() {
        return this.f24725q.getIconTintList();
    }

    @InterfaceC7833l
    public int getItemPaddingBottom() {
        return this.f24725q.getItemPaddingBottom();
    }

    @InterfaceC7833l
    public int getItemPaddingTop() {
        return this.f24725q.getItemPaddingTop();
    }

    @dd
    public ColorStateList getItemRippleColor() {
        return this.f24721g;
    }

    @hb
    public int getItemTextAppearanceActive() {
        return this.f24725q.getItemTextAppearanceActive();
    }

    @hb
    public int getItemTextAppearanceInactive() {
        return this.f24725q.getItemTextAppearanceInactive();
    }

    @dd
    public ColorStateList getItemTextColor() {
        return this.f24725q.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f24725q.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @lvui
    public Menu getMenu() {
        return this.f24722k;
    }

    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public androidx.appcompat.view.menu.kja0 getMenuView() {
        return this.f24725q;
    }

    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public NavigationBarPresenter getPresenter() {
        return this.f24723n;
    }

    @InterfaceC7843t
    public int getSelectedItemId() {
        return this.f24725q.getSelectedItemId();
    }

    @dd
    /* JADX INFO: renamed from: n */
    public C3933k m14659n(int i2) {
        return this.f24725q.m14653s(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ld6.m14843n(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(@dd Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f24722k.m327f(savedState.f24728q);
    }

    @Override // android.view.View
    @lvui
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f24728q = bundle;
        this.f24722k.lrht(bundle);
        return savedState;
    }

    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: q */
    protected abstract NavigationBarMenuView mo14138q(@lvui Context context);

    /* JADX INFO: renamed from: s */
    public void m14660s(int i2) {
        this.f24725q.n7h(i2);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        ld6.m14844q(this, f2);
    }

    public void setItemActiveIndicatorColor(@dd ColorStateList colorStateList) {
        this.f24725q.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z2) {
        this.f24725q.setItemActiveIndicatorEnabled(z2);
    }

    public void setItemActiveIndicatorHeight(@InterfaceC7833l int i2) {
        this.f24725q.setItemActiveIndicatorHeight(i2);
    }

    public void setItemActiveIndicatorMarginHorizontal(@InterfaceC7833l int i2) {
        this.f24725q.setItemActiveIndicatorMarginHorizontal(i2);
    }

    public void setItemActiveIndicatorShapeAppearance(@dd kja0 kja0Var) {
        this.f24725q.setItemActiveIndicatorShapeAppearance(kja0Var);
    }

    public void setItemActiveIndicatorWidth(@InterfaceC7833l int i2) {
        this.f24725q.setItemActiveIndicatorWidth(i2);
    }

    public void setItemBackground(@dd Drawable drawable) {
        this.f24725q.setItemBackground(drawable);
        this.f24721g = null;
    }

    public void setItemBackgroundResource(@fn3e int i2) {
        this.f24725q.setItemBackgroundRes(i2);
        this.f24721g = null;
    }

    public void setItemIconSize(@zy.cdj int i2) {
        this.f24725q.setItemIconSize(i2);
    }

    public void setItemIconSizeRes(@InterfaceC7829h int i2) {
        setItemIconSize(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconTintList(@dd ColorStateList colorStateList) {
        this.f24725q.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i2, @dd View.OnTouchListener onTouchListener) {
        this.f24725q.setItemOnTouchListener(i2, onTouchListener);
    }

    public void setItemPaddingBottom(@InterfaceC7833l int i2) {
        this.f24725q.setItemPaddingBottom(i2);
    }

    public void setItemPaddingTop(@InterfaceC7833l int i2) {
        this.f24725q.setItemPaddingTop(i2);
    }

    public void setItemRippleColor(@dd ColorStateList colorStateList) {
        if (this.f24721g == colorStateList) {
            if (colorStateList != null || this.f24725q.getItemBackground() == null) {
                return;
            }
            this.f24725q.setItemBackground(null);
            return;
        }
        this.f24721g = colorStateList;
        if (colorStateList == null) {
            this.f24725q.setItemBackground(null);
        } else {
            this.f24725q.setItemBackground(new RippleDrawable(com.google.android.material.ripple.toq.m14761k(colorStateList), null, null));
        }
    }

    public void setItemTextAppearanceActive(@hb int i2) {
        this.f24725q.setItemTextAppearanceActive(i2);
    }

    public void setItemTextAppearanceInactive(@hb int i2) {
        this.f24725q.setItemTextAppearanceInactive(i2);
    }

    public void setItemTextColor(@dd ColorStateList colorStateList) {
        this.f24725q.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i2) {
        if (this.f24725q.getLabelVisibilityMode() != i2) {
            this.f24725q.setLabelVisibilityMode(i2);
            this.f24723n.mo355q(false);
        }
    }

    public void setOnItemReselectedListener(@dd zy zyVar) {
        this.f24724p = zyVar;
    }

    public void setOnItemSelectedListener(@dd InterfaceC4067q interfaceC4067q) {
        this.f24726s = interfaceC4067q;
    }

    public void setSelectedItemId(@InterfaceC7843t int i2) {
        MenuItem menuItemFindItem = this.f24722k.findItem(i2);
        if (menuItemFindItem == null || this.f24722k.x9kr(menuItemFindItem, this.f24723n, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    /* JADX INFO: renamed from: y */
    public boolean m14661y() {
        return this.f24725q.getItemActiveIndicatorEnabled();
    }
}
