package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.content.C1407g;
import com.airbnb.lottie.model.animatable.C1442g;

/* JADX INFO: compiled from: CircleShape.java */
/* JADX INFO: loaded from: classes.dex */
public class toq implements zy {

    /* JADX INFO: renamed from: k */
    private final String f8041k;

    /* JADX INFO: renamed from: n */
    private final boolean f8042n;

    /* JADX INFO: renamed from: q */
    private final boolean f8043q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.qrj<PointF, PointF> f56020toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final C1442g f56021zy;

    public toq(String str, com.airbnb.lottie.model.animatable.qrj<PointF, PointF> qrjVar, C1442g c1442g, boolean z2, boolean z3) {
        this.f8041k = str;
        this.f56020toq = qrjVar;
        this.f56021zy = c1442g;
        this.f8043q = z2;
        this.f8042n = z3;
    }

    /* JADX INFO: renamed from: g */
    public boolean m6049g() {
        return this.f8043q;
    }

    @Override // com.airbnb.lottie.model.content.zy
    /* JADX INFO: renamed from: k */
    public com.airbnb.lottie.animation.content.zy mo6000k(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar) {
        return new C1407g(c1504r, toqVar, this);
    }

    /* JADX INFO: renamed from: n */
    public boolean m6050n() {
        return this.f8042n;
    }

    /* JADX INFO: renamed from: q */
    public C1442g m6051q() {
        return this.f56021zy;
    }

    public String toq() {
        return this.f8041k;
    }

    public com.airbnb.lottie.model.animatable.qrj<PointF, PointF> zy() {
        return this.f56020toq;
    }
}
