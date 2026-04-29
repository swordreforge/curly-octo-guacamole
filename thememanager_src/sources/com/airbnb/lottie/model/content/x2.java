package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C1504r;
import zy.dd;

/* JADX INFO: compiled from: Repeater.java */
/* JADX INFO: loaded from: classes.dex */
public class x2 implements zy {

    /* JADX INFO: renamed from: k */
    private final String f8044k;

    /* JADX INFO: renamed from: n */
    private final boolean f8045n;

    /* JADX INFO: renamed from: q */
    private final com.airbnb.lottie.model.animatable.x2 f8046q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.toq f56022toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.toq f56023zy;

    public x2(String str, com.airbnb.lottie.model.animatable.toq toqVar, com.airbnb.lottie.model.animatable.toq toqVar2, com.airbnb.lottie.model.animatable.x2 x2Var, boolean z2) {
        this.f8044k = str;
        this.f56022toq = toqVar;
        this.f56023zy = toqVar2;
        this.f8046q = x2Var;
        this.f8045n = z2;
    }

    /* JADX INFO: renamed from: g */
    public boolean m6052g() {
        return this.f8045n;
    }

    @Override // com.airbnb.lottie.model.content.zy
    @dd
    /* JADX INFO: renamed from: k */
    public com.airbnb.lottie.animation.content.zy mo6000k(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar) {
        return new com.airbnb.lottie.animation.content.cdj(c1504r, toqVar, this);
    }

    /* JADX INFO: renamed from: n */
    public com.airbnb.lottie.model.animatable.x2 m6053n() {
        return this.f8046q;
    }

    /* JADX INFO: renamed from: q */
    public com.airbnb.lottie.model.animatable.toq m6054q() {
        return this.f56023zy;
    }

    public com.airbnb.lottie.model.animatable.toq toq() {
        return this.f56022toq;
    }

    public String zy() {
        return this.f8044k;
    }
}
