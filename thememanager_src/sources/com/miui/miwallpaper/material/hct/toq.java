package com.miui.miwallpaper.material.hct;

import com.miui.miwallpaper.material.utils.C5283k;

/* JADX INFO: compiled from: Hct.java */
/* JADX INFO: loaded from: classes3.dex */
public final class toq {

    /* JADX INFO: renamed from: k */
    private double f29505k;

    /* JADX INFO: renamed from: q */
    private int f29506q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private double f72148toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private double f72149zy;

    private toq(int i2) {
        m17885s(i2);
    }

    /* JADX INFO: renamed from: k */
    public static toq m17884k(double d2, double d4, double d5) {
        return new toq(zy.ki(d2, d4, d5));
    }

    /* JADX INFO: renamed from: s */
    private void m17885s(int i2) {
        this.f29506q = i2;
        C5275k qVar = C5275k.toq(i2);
        this.f29505k = qVar.x2();
        this.f72148toq = qVar.ld6();
        this.f72149zy = C5283k.kja0(i2);
    }

    public static toq toq(int i2) {
        return new toq(i2);
    }

    public void f7l8(double d2) {
        m17885s(zy.ki(this.f29505k, d2, this.f72149zy));
    }

    /* JADX INFO: renamed from: g */
    public toq m17886g(C5276q c5276q) {
        double[] dArrM17873i = C5275k.toq(ld6()).m17873i(c5276q, null);
        C5275k c5275kM17871y = C5275k.m17871y(dArrM17873i[0], dArrM17873i[1], dArrM17873i[2], C5276q.f72144ld6);
        return m17884k(c5275kM17871y.x2(), c5275kM17871y.ld6(), C5283k.m17954h(dArrM17873i[1]));
    }

    public int ld6() {
        return this.f29506q;
    }

    /* JADX INFO: renamed from: n */
    public double m17887n() {
        return this.f72149zy;
    }

    /* JADX INFO: renamed from: p */
    public void m17888p(double d2) {
        m17885s(zy.ki(this.f29505k, this.f72148toq, d2));
    }

    /* JADX INFO: renamed from: q */
    public double m17889q() {
        return this.f29505k;
    }

    /* JADX INFO: renamed from: y */
    public void m17890y(double d2) {
        m17885s(zy.ki(d2, this.f72148toq, this.f72149zy));
    }

    public double zy() {
        return this.f72148toq;
    }
}
