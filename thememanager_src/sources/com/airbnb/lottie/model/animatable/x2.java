package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.keyframe.C1420h;
import zy.dd;

/* JADX INFO: compiled from: AnimatableTransform.java */
/* JADX INFO: loaded from: classes.dex */
public class x2 implements com.airbnb.lottie.animation.content.qrj, com.airbnb.lottie.model.content.zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @dd
    private final toq f55984f7l8;

    /* JADX INFO: renamed from: g */
    @dd
    private final toq f7981g;

    /* JADX INFO: renamed from: k */
    @dd
    private final C1444n f7982k;

    /* JADX INFO: renamed from: n */
    @dd
    private final C1446q f7983n;

    /* JADX INFO: renamed from: q */
    @dd
    private final toq f7984q;

    /* JADX INFO: renamed from: s */
    @dd
    private final toq f7985s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private final qrj<PointF, PointF> f55985toq;

    /* JADX INFO: renamed from: y */
    @dd
    private final toq f7986y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    private final f7l8 f55986zy;

    public x2() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @dd
    public toq f7l8() {
        return this.f7984q;
    }

    @dd
    /* JADX INFO: renamed from: g */
    public qrj<PointF, PointF> m5999g() {
        return this.f55985toq;
    }

    @Override // com.airbnb.lottie.model.content.zy
    @dd
    /* JADX INFO: renamed from: k */
    public com.airbnb.lottie.animation.content.zy mo6000k(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar) {
        return null;
    }

    @dd
    public toq ld6() {
        return this.f7986y;
    }

    @dd
    /* JADX INFO: renamed from: n */
    public C1446q m6001n() {
        return this.f7983n;
    }

    @dd
    /* JADX INFO: renamed from: p */
    public toq m6002p() {
        return this.f55984f7l8;
    }

    @dd
    /* JADX INFO: renamed from: q */
    public toq m6003q() {
        return this.f7985s;
    }

    @dd
    /* JADX INFO: renamed from: s */
    public toq m6004s() {
        return this.f7981g;
    }

    public C1420h toq() {
        return new C1420h(this);
    }

    @dd
    /* JADX INFO: renamed from: y */
    public f7l8 m6005y() {
        return this.f55986zy;
    }

    @dd
    public C1444n zy() {
        return this.f7982k;
    }

    public x2(@dd C1444n c1444n, @dd qrj<PointF, PointF> qrjVar, @dd f7l8 f7l8Var, @dd toq toqVar, @dd C1446q c1446q, @dd toq toqVar2, @dd toq toqVar3, @dd toq toqVar4, @dd toq toqVar5) {
        this.f7982k = c1444n;
        this.f55985toq = qrjVar;
        this.f55986zy = f7l8Var;
        this.f7984q = toqVar;
        this.f7983n = c1446q;
        this.f7986y = toqVar2;
        this.f7985s = toqVar3;
        this.f7981g = toqVar4;
        this.f55984f7l8 = toqVar5;
    }
}
