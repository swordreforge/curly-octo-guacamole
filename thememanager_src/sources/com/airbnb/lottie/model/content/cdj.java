package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.model.animatable.C1448y;

/* JADX INFO: compiled from: ShapePath.java */
/* JADX INFO: loaded from: classes.dex */
public class cdj implements zy {

    /* JADX INFO: renamed from: k */
    private final String f7987k;

    /* JADX INFO: renamed from: q */
    private final boolean f7988q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f55987toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final C1448y f55988zy;

    public cdj(String str, int i2, C1448y c1448y, boolean z2) {
        this.f7987k = str;
        this.f55987toq = i2;
        this.f55988zy = c1448y;
        this.f7988q = z2;
    }

    @Override // com.airbnb.lottie.model.content.zy
    /* JADX INFO: renamed from: k */
    public com.airbnb.lottie.animation.content.zy mo6000k(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar) {
        return new com.airbnb.lottie.animation.content.t8r(c1504r, toqVar, this);
    }

    /* JADX INFO: renamed from: q */
    public boolean m6007q() {
        return this.f7988q;
    }

    public String toString() {
        return "ShapePath{name=" + this.f7987k + ", index=" + this.f55987toq + '}';
    }

    public String toq() {
        return this.f7987k;
    }

    public C1448y zy() {
        return this.f55988zy;
    }
}
