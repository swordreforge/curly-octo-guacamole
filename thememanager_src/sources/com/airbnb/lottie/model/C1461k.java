package com.airbnb.lottie.model;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: com.airbnb.lottie.model.k */
/* JADX INFO: compiled from: CubicCurveData.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public class C1461k {

    /* JADX INFO: renamed from: k */
    private final PointF f8051k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final PointF f56027toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final PointF f56028zy;

    public C1461k() {
        this.f8051k = new PointF();
        this.f56027toq = new PointF();
        this.f56028zy = new PointF();
    }

    public void f7l8(float f2, float f3) {
        this.f56028zy.set(f2, f3);
    }

    /* JADX INFO: renamed from: g */
    public void m6060g(C1461k c1461k) {
        PointF pointF = c1461k.f56028zy;
        f7l8(pointF.x, pointF.y);
        PointF pointF2 = c1461k.f8051k;
        m6063q(pointF2.x, pointF2.y);
        PointF pointF3 = c1461k.f56027toq;
        m6062n(pointF3.x, pointF3.y);
    }

    /* JADX INFO: renamed from: k */
    public PointF m6061k() {
        return this.f8051k;
    }

    /* JADX INFO: renamed from: n */
    public void m6062n(float f2, float f3) {
        this.f56027toq.set(f2, f3);
    }

    /* JADX INFO: renamed from: q */
    public void m6063q(float f2, float f3) {
        this.f8051k.set(f2, f3);
    }

    @lvui
    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f56028zy.x), Float.valueOf(this.f56028zy.y), Float.valueOf(this.f8051k.x), Float.valueOf(this.f8051k.y), Float.valueOf(this.f56027toq.x), Float.valueOf(this.f56027toq.y));
    }

    public PointF toq() {
        return this.f56027toq;
    }

    public PointF zy() {
        return this.f56028zy;
    }

    public C1461k(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f8051k = pointF;
        this.f56027toq = pointF2;
        this.f56028zy = pointF3;
    }
}
