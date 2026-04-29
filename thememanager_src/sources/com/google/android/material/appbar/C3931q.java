package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.C0683f;

/* JADX INFO: renamed from: com.google.android.material.appbar.q */
/* JADX INFO: compiled from: ViewOffsetHelper.java */
/* JADX INFO: loaded from: classes2.dex */
class C3931q {

    /* JADX INFO: renamed from: k */
    private final View f23876k;

    /* JADX INFO: renamed from: n */
    private int f23877n;

    /* JADX INFO: renamed from: q */
    private int f23878q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f67350toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f67351zy;

    /* JADX INFO: renamed from: g */
    private boolean f23875g = true;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f67349f7l8 = true;

    public C3931q(View view) {
        this.f23876k = view;
    }

    public boolean f7l8() {
        return this.f23875g;
    }

    /* JADX INFO: renamed from: g */
    public boolean m14051g() {
        return this.f67349f7l8;
    }

    /* JADX INFO: renamed from: k */
    void m14052k() {
        View view = this.f23876k;
        C0683f.zkd(view, this.f23878q - (view.getTop() - this.f67350toq));
        View view2 = this.f23876k;
        C0683f.gc3c(view2, this.f23877n - (view2.getLeft() - this.f67351zy));
    }

    public boolean ld6(int i2) {
        if (!this.f23875g || this.f23878q == i2) {
            return false;
        }
        this.f23878q = i2;
        m14052k();
        return true;
    }

    /* JADX INFO: renamed from: n */
    public int m14053n() {
        return this.f23878q;
    }

    /* JADX INFO: renamed from: p */
    public boolean m14054p(int i2) {
        if (!this.f67349f7l8 || this.f23877n == i2) {
            return false;
        }
        this.f23877n = i2;
        m14052k();
        return true;
    }

    /* JADX INFO: renamed from: q */
    public int m14055q() {
        return this.f23877n;
    }

    /* JADX INFO: renamed from: s */
    public void m14056s(boolean z2) {
        this.f67349f7l8 = z2;
    }

    public int toq() {
        return this.f67351zy;
    }

    public void x2(boolean z2) {
        this.f23875g = z2;
    }

    /* JADX INFO: renamed from: y */
    void m14057y() {
        this.f67350toq = this.f23876k.getTop();
        this.f67351zy = this.f23876k.getLeft();
    }

    public int zy() {
        return this.f67350toq;
    }
}
