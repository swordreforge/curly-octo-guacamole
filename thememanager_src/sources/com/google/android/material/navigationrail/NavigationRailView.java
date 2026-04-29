package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C0184b;
import androidx.core.view.C0683f;
import androidx.core.view.tfm;
import com.google.android.material.internal.C4058z;
import com.google.android.material.internal.cdj;
import com.google.android.material.navigation.NavigationBarView;
import ij.C6095k;
import zy.InterfaceC7833l;
import zy.dd;
import zy.gvn7;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationRailView extends NavigationBarView {

    /* JADX INFO: renamed from: b */
    static final int f24751b = -1;

    /* JADX INFO: renamed from: j */
    static final int f24752j = 49;

    /* JADX INFO: renamed from: m */
    private static final int f24753m = 49;

    /* JADX INFO: renamed from: o */
    static final int f24754o = 7;

    /* JADX INFO: renamed from: c */
    @dd
    private Boolean f24755c;

    /* JADX INFO: renamed from: e */
    @dd
    private Boolean f24756e;

    /* JADX INFO: renamed from: f */
    @dd
    private View f24757f;

    /* JADX INFO: renamed from: l */
    private final int f24758l;

    /* JADX INFO: renamed from: com.google.android.material.navigationrail.NavigationRailView$k */
    class C4071k implements C4058z.n {
        C4071k() {
        }

        @Override // com.google.android.material.internal.C4058z.n
        @lvui
        /* JADX INFO: renamed from: k */
        public tfm mo14130k(View view, @lvui tfm tfmVar, @lvui C4058z.g gVar) {
            NavigationRailView navigationRailView = NavigationRailView.this;
            if (navigationRailView.m14676i(navigationRailView.f24755c)) {
                gVar.f67725toq += tfmVar.m3466g(tfm.qrj.m3498s()).f50489toq;
            }
            NavigationRailView navigationRailView2 = NavigationRailView.this;
            if (navigationRailView2.m14676i(navigationRailView2.f24756e)) {
                gVar.f24639q += tfmVar.m3466g(tfm.qrj.m3498s()).f3601q;
            }
            boolean z2 = C0683f.m3159e(view) == 1;
            int iM3467h = tfmVar.m3467h();
            int iCdj = tfmVar.cdj();
            int i2 = gVar.f24638k;
            if (z2) {
                iM3467h = iCdj;
            }
            gVar.f24638k = i2 + iM3467h;
            gVar.m14629k(view);
            return tfmVar;
        }
    }

    public NavigationRailView(@lvui Context context) {
        this(context, null);
    }

    private boolean cdj() {
        View view = this.f24757f;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public boolean m14676i(Boolean bool) {
        return bool != null ? bool.booleanValue() : C0683f.m3160f(this);
    }

    private int ki(int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i2) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i2;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
    }

    private void kja0() {
        C4058z.m14626q(this, new C4071k());
    }

    @dd
    public View getHeaderView() {
        return this.f24757f;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.navigation.NavigationBarView
    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public NavigationRailMenuView mo14138q(@lvui Context context) {
        return new NavigationRailMenuView(context);
    }

    public void n7h(@lvui View view) {
        t8r();
        this.f24757f = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.f24758l;
        addView(view, 0, layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        int i6 = 0;
        if (cdj()) {
            int bottom = this.f24757f.getBottom() + this.f24758l;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i6 = bottom - top;
            }
        } else if (navigationRailMenuView.m14675i()) {
            i6 = this.f24758l;
        }
        if (i6 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i6, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i6);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int iKi = ki(i2);
        super.onMeasure(iKi, i3);
        if (cdj()) {
            measureChild(getNavigationRailMenuView(), iKi, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f24757f.getMeasuredHeight()) - this.f24758l, Integer.MIN_VALUE));
        }
    }

    public void qrj(@gvn7 int i2) {
        n7h(LayoutInflater.from(getContext()).inflate(i2, (ViewGroup) this, false));
    }

    public void setItemMinimumHeight(@InterfaceC7833l int i2) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i2);
    }

    public void setMenuGravity(int i2) {
        getNavigationRailMenuView().setMenuGravity(i2);
    }

    public void t8r() {
        View view = this.f24757f;
        if (view != null) {
            removeView(view);
            this.f24757f = null;
        }
    }

    public NavigationRailView(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.z75m);
    }

    public NavigationRailView(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, C6095k.n7h.y0yf);
    }

    public NavigationRailView(@lvui Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f24755c = null;
        this.f24756e = null;
        this.f24758l = getResources().getDimensionPixelSize(C6095k.g.i8gn);
        C0184b c0184bLd6 = cdj.ld6(getContext(), attributeSet, C6095k.kja0.ba7, i2, i3, new int[0]);
        int iFn3e = c0184bLd6.fn3e(C6095k.kja0.lj, 0);
        if (iFn3e != 0) {
            qrj(iFn3e);
        }
        setMenuGravity(c0184bLd6.kja0(C6095k.kja0.h8, 49));
        int i4 = C6095k.kja0.bb8;
        if (c0184bLd6.mcp(i4)) {
            setItemMinimumHeight(c0184bLd6.f7l8(i4, -1));
        }
        int i5 = C6095k.kja0.blj;
        if (c0184bLd6.mcp(i5)) {
            this.f24755c = Boolean.valueOf(c0184bLd6.m547k(i5, false));
        }
        int i6 = C6095k.kja0.a0;
        if (c0184bLd6.mcp(i6)) {
            this.f24756e = Boolean.valueOf(c0184bLd6.m547k(i6, false));
        }
        c0184bLd6.d3();
        kja0();
    }
}
