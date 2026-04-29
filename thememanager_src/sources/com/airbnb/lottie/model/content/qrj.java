package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C1504r;
import zy.dd;

/* JADX INFO: compiled from: RoundedCorners.java */
/* JADX INFO: loaded from: classes.dex */
public class qrj implements zy {

    /* JADX INFO: renamed from: k */
    private final String f8033k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.qrj<Float, Float> f56015toq;

    public qrj(String str, com.airbnb.lottie.model.animatable.qrj<Float, Float> qrjVar) {
        this.f8033k = str;
        this.f56015toq = qrjVar;
    }

    @Override // com.airbnb.lottie.model.content.zy
    @dd
    /* JADX INFO: renamed from: k */
    public com.airbnb.lottie.animation.content.zy mo6000k(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar) {
        return new com.airbnb.lottie.animation.content.ki(c1504r, toqVar, this);
    }

    public com.airbnb.lottie.model.animatable.qrj<Float, Float> toq() {
        return this.f56015toq;
    }

    public String zy() {
        return this.f8033k;
    }
}
