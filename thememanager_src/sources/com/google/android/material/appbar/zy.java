package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import zy.lvui;

/* JADX INFO: compiled from: ViewOffsetBehavior.java */
/* JADX INFO: loaded from: classes2.dex */
class zy<V extends View> extends CoordinatorLayout.zy<V> {

    /* JADX INFO: renamed from: k */
    private C3931q f23882k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f67353toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f67354zy;

    public zy() {
        this.f67353toq = 0;
        this.f67354zy = 0;
    }

    public void d2ok(boolean z2) {
        C3931q c3931q = this.f23882k;
        if (c3931q != null) {
            c3931q.m14056s(z2);
        }
    }

    public boolean d3() {
        C3931q c3931q = this.f23882k;
        return c3931q != null && c3931q.m14051g();
    }

    public void dd(boolean z2) {
        C3931q c3931q = this.f23882k;
        if (c3931q != null) {
            c3931q.x2(z2);
        }
    }

    protected void eqxt(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, int i2) {
        coordinatorLayout.m1738r(v2, i2);
    }

    public int gvn7() {
        C3931q c3931q = this.f23882k;
        if (c3931q != null) {
            return c3931q.m14053n();
        }
        return 0;
    }

    public int jp0y() {
        C3931q c3931q = this.f23882k;
        if (c3931q != null) {
            return c3931q.m14055q();
        }
        return 0;
    }

    public boolean lvui(int i2) {
        C3931q c3931q = this.f23882k;
        if (c3931q != null) {
            return c3931q.m14054p(i2);
        }
        this.f67354zy = i2;
        return false;
    }

    public boolean oc() {
        C3931q c3931q = this.f23882k;
        return c3931q != null && c3931q.f7l8();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    public boolean qrj(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, int i2) {
        eqxt(coordinatorLayout, v2, i2);
        if (this.f23882k == null) {
            this.f23882k = new C3931q(v2);
        }
        this.f23882k.m14057y();
        this.f23882k.m14052k();
        int i3 = this.f67353toq;
        if (i3 != 0) {
            this.f23882k.ld6(i3);
            this.f67353toq = 0;
        }
        int i4 = this.f67354zy;
        if (i4 == 0) {
            return true;
        }
        this.f23882k.m14054p(i4);
        this.f67354zy = 0;
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean mo14023r(int i2) {
        C3931q c3931q = this.f23882k;
        if (c3931q != null) {
            return c3931q.ld6(i2);
        }
        this.f67353toq = i2;
        return false;
    }

    public zy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67353toq = 0;
        this.f67354zy = 0;
    }
}
