package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.content.C1408h;

/* JADX INFO: compiled from: RectangleShape.java */
/* JADX INFO: loaded from: classes.dex */
public class ld6 implements zy {

    /* JADX INFO: renamed from: k */
    private final String f8013k;

    /* JADX INFO: renamed from: n */
    private final boolean f8014n;

    /* JADX INFO: renamed from: q */
    private final com.airbnb.lottie.model.animatable.toq f8015q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.qrj<PointF, PointF> f56003toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.qrj<PointF, PointF> f56004zy;

    public ld6(String str, com.airbnb.lottie.model.animatable.qrj<PointF, PointF> qrjVar, com.airbnb.lottie.model.animatable.qrj<PointF, PointF> qrjVar2, com.airbnb.lottie.model.animatable.toq toqVar, boolean z2) {
        this.f8013k = str;
        this.f56003toq = qrjVar;
        this.f56004zy = qrjVar2;
        this.f8015q = toqVar;
        this.f8014n = z2;
    }

    /* JADX INFO: renamed from: g */
    public boolean m6025g() {
        return this.f8014n;
    }

    @Override // com.airbnb.lottie.model.content.zy
    /* JADX INFO: renamed from: k */
    public com.airbnb.lottie.animation.content.zy mo6000k(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar) {
        return new C1408h(c1504r, toqVar, this);
    }

    /* JADX INFO: renamed from: n */
    public com.airbnb.lottie.model.animatable.qrj<PointF, PointF> m6026n() {
        return this.f56004zy;
    }

    /* JADX INFO: renamed from: q */
    public com.airbnb.lottie.model.animatable.qrj<PointF, PointF> m6027q() {
        return this.f56003toq;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f56003toq + ", size=" + this.f56004zy + '}';
    }

    public com.airbnb.lottie.model.animatable.toq toq() {
        return this.f8015q;
    }

    public String zy() {
        return this.f8013k;
    }
}
