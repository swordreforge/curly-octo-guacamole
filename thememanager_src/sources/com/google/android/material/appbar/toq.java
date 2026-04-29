package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0683f;
import androidx.core.view.qrj;
import androidx.core.view.tfm;
import java.util.List;
import ki.C6116k;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: HeaderScrollingViewBehavior.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class toq extends zy<View> {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f67352f7l8;

    /* JADX INFO: renamed from: g */
    private int f23879g;

    /* JADX INFO: renamed from: n */
    final Rect f23880n;

    /* JADX INFO: renamed from: q */
    final Rect f23881q;

    public toq() {
        this.f23881q = new Rect();
        this.f23880n = new Rect();
        this.f23879g = 0;
    }

    /* JADX INFO: renamed from: c */
    private static int m14058c(int i2) {
        if (i2 == 0) {
            return 8388659;
        }
        return i2;
    }

    @Override // com.google.android.material.appbar.zy
    protected void eqxt(@lvui CoordinatorLayout coordinatorLayout, @lvui View view, int i2) {
        View viewX9kr = x9kr(coordinatorLayout.m1736i(view));
        if (viewX9kr == null) {
            super.eqxt(coordinatorLayout, view, i2);
            this.f23879g = 0;
            return;
        }
        CoordinatorLayout.f7l8 f7l8Var = (CoordinatorLayout.f7l8) view.getLayoutParams();
        Rect rect = this.f23881q;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) f7l8Var).leftMargin, viewX9kr.getBottom() + ((ViewGroup.MarginLayoutParams) f7l8Var).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) f7l8Var).rightMargin, ((coordinatorLayout.getHeight() + viewX9kr.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) f7l8Var).bottomMargin);
        tfm lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && C0683f.m3160f(coordinatorLayout) && !C0683f.m3160f(view)) {
            rect.left += lastWindowInsets.m3467h();
            rect.right -= lastWindowInsets.cdj();
        }
        Rect rect2 = this.f23880n;
        qrj.toq(m14058c(f7l8Var.f50028zy), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i2);
        int iNcyb = ncyb(viewX9kr);
        view.layout(rect2.left, rect2.top - iNcyb, rect2.right, rect2.bottom - iNcyb);
        this.f23879g = rect2.top - viewX9kr.getBottom();
    }

    /* JADX INFO: renamed from: f */
    final int m14059f() {
        return this.f23879g;
    }

    int hyr(@lvui View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: l */
    float mo14025l(View view) {
        return 1.0f;
    }

    public final void lrht(int i2) {
        this.f67352f7l8 = i2;
    }

    public final int n5r1() {
        return this.f67352f7l8;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    public boolean n7h(@lvui CoordinatorLayout coordinatorLayout, @lvui View view, int i2, int i3, int i4, int i5) {
        View viewX9kr;
        tfm lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || (viewX9kr = x9kr(coordinatorLayout.m1736i(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C0683f.m3160f(viewX9kr) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.ki() + lastWindowInsets.kja0();
        }
        int iHyr = size + hyr(viewX9kr);
        int measuredHeight = viewX9kr.getMeasuredHeight();
        if (uv6()) {
            view.setTranslationY(-measuredHeight);
        } else {
            iHyr -= measuredHeight;
        }
        coordinatorLayout.dd(view, i2, i3, View.MeasureSpec.makeMeasureSpec(iHyr, i6 == -1 ? 1073741824 : Integer.MIN_VALUE), i5);
        return true;
    }

    final int ncyb(View view) {
        if (this.f67352f7l8 == 0) {
            return 0;
        }
        float fMo14025l = mo14025l(view);
        int i2 = this.f67352f7l8;
        return C6116k.m22394n((int) (fMo14025l * i2), 0, i2);
    }

    protected boolean uv6() {
        return false;
    }

    @dd
    abstract View x9kr(List<View> list);

    public toq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23881q = new Rect();
        this.f23880n = new Rect();
        this.f23879g = 0;
    }
}
