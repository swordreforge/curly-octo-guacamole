package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.C0324y;
import androidx.constraintlayout.core.state.InterfaceC0319n;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0345y;

/* JADX INFO: renamed from: androidx.constraintlayout.core.state.helpers.g */
/* JADX INFO: compiled from: GuidelineReference.java */
/* JADX INFO: loaded from: classes.dex */
public class C0312g implements InterfaceC0314n, InterfaceC0319n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private Object f47614f7l8;

    /* JADX INFO: renamed from: k */
    final C0324y f1896k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f47615toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private C0345y f47616zy;

    /* JADX INFO: renamed from: q */
    private int f1898q = -1;

    /* JADX INFO: renamed from: n */
    private int f1897n = -1;

    /* JADX INFO: renamed from: g */
    private float f1895g = 0.0f;

    public C0312g(C0324y c0324y) {
        this.f1896k = c0324y;
    }

    @Override // androidx.constraintlayout.core.state.helpers.InterfaceC0314n
    public void apply() {
        this.f47616zy.tww7(this.f47615toq);
        int i2 = this.f1898q;
        if (i2 != -1) {
            this.f47616zy.wt(i2);
            return;
        }
        int i3 = this.f1897n;
        if (i3 != -1) {
            this.f47616zy.g0ad(i3);
        } else {
            this.f47616zy.imd(this.f1895g);
        }
    }

    public C0312g f7l8(float f2) {
        this.f1898q = -1;
        this.f1897n = -1;
        this.f1895g = f2;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public int m1184g() {
        return this.f47615toq;
    }

    @Override // androidx.constraintlayout.core.state.InterfaceC0319n
    public Object getKey() {
        return this.f47614f7l8;
    }

    @Override // androidx.constraintlayout.core.state.helpers.InterfaceC0314n, androidx.constraintlayout.core.state.InterfaceC0319n
    /* JADX INFO: renamed from: k */
    public C0341n mo1185k() {
        if (this.f47616zy == null) {
            this.f47616zy = new C0345y();
        }
        return this.f47616zy;
    }

    /* JADX INFO: renamed from: n */
    public C0312g m1186n(Object obj) {
        this.f1898q = -1;
        this.f1897n = this.f1896k.m1235g(obj);
        this.f1895g = 0.0f;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.InterfaceC0319n
    /* JADX INFO: renamed from: q */
    public InterfaceC0314n mo1187q() {
        return null;
    }

    /* JADX INFO: renamed from: s */
    public C0312g m1188s(Object obj) {
        this.f1898q = this.f1896k.m1235g(obj);
        this.f1897n = -1;
        this.f1895g = 0.0f;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.InterfaceC0319n
    public void toq(C0341n c0341n) {
        if (c0341n instanceof C0345y) {
            this.f47616zy = (C0345y) c0341n;
        } else {
            this.f47616zy = null;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m1189y(int i2) {
        this.f47615toq = i2;
    }

    @Override // androidx.constraintlayout.core.state.InterfaceC0319n
    public void zy(Object obj) {
        this.f47614f7l8 = obj;
    }
}
