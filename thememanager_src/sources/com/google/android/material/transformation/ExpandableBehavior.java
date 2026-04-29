package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0683f;
import java.util.List;
import ngy.toq;
import zy.InterfaceC7842s;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.zy<View> {

    /* JADX INFO: renamed from: q */
    private static final int f25404q = 2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f67971toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f67972zy = 1;

    /* JADX INFO: renamed from: k */
    private int f25405k;

    /* JADX INFO: renamed from: com.google.android.material.transformation.ExpandableBehavior$k */
    class ViewTreeObserverOnPreDrawListenerC4183k implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f25407k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ toq f25408n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f25409q;

        ViewTreeObserverOnPreDrawListenerC4183k(View view, int i2, toq toqVar) {
            this.f25407k = view;
            this.f25409q = i2;
            this.f25408n = toqVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f25407k.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f25405k == this.f25409q) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                toq toqVar = this.f25408n;
                expandableBehavior.eqxt((View) toqVar, this.f25407k, toqVar.toq(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f25405k = 0;
    }

    private boolean gvn7(boolean z2) {
        if (!z2) {
            return this.f25405k == 1;
        }
        int i2 = this.f25405k;
        return i2 == 0 || i2 == 2;
    }

    @dd
    public static <T extends ExpandableBehavior> T oc(@lvui View view, @lvui Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f7l8)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.zy zyVarM1740g = ((CoordinatorLayout.f7l8) layoutParams).m1740g();
        if (zyVarM1740g instanceof ExpandableBehavior) {
            return cls.cast(zyVarM1740g);
        }
        throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dd
    protected toq d3(@lvui CoordinatorLayout coordinatorLayout, @lvui View view) {
        List<View> listM1736i = coordinatorLayout.m1736i(view);
        int size = listM1736i.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = listM1736i.get(i2);
            if (mo1751g(coordinatorLayout, view, view2)) {
                return (toq) view2;
            }
        }
        return null;
    }

    protected abstract boolean eqxt(View view, View view2, boolean z2, boolean z3);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    /* JADX INFO: renamed from: g */
    public abstract boolean mo1751g(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    @InterfaceC7842s
    public boolean qrj(@lvui CoordinatorLayout coordinatorLayout, @lvui View view, int i2) {
        toq toqVarD3;
        if (C0683f.v0af(view) || (toqVarD3 = d3(coordinatorLayout, view)) == null || !gvn7(toqVarD3.toq())) {
            return false;
        }
        int i3 = toqVarD3.toq() ? 1 : 2;
        this.f25405k = i3;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC4183k(view, i3, toqVarD3));
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    @InterfaceC7842s
    /* JADX INFO: renamed from: s */
    public boolean mo1757s(CoordinatorLayout coordinatorLayout, View view, View view2) {
        toq toqVar = (toq) view2;
        if (!gvn7(toqVar.toq())) {
            return false;
        }
        this.f25405k = toqVar.toq() ? 1 : 2;
        return eqxt((View) toqVar, view, toqVar.toq(), true);
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25405k = 0;
    }
}
