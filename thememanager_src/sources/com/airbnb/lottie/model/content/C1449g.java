package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.content.C1415s;
import com.airbnb.lottie.model.animatable.C1442g;
import com.airbnb.lottie.model.animatable.C1446q;
import com.airbnb.lottie.model.content.ki;
import java.util.List;
import zy.dd;

/* JADX INFO: renamed from: com.airbnb.lottie.model.content.g */
/* JADX INFO: compiled from: GradientStroke.java */
/* JADX INFO: loaded from: classes.dex */
public class C1449g implements zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.toq f55989f7l8;

    /* JADX INFO: renamed from: g */
    private final C1442g f7990g;

    /* JADX INFO: renamed from: k */
    private final String f7991k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.animatable.toq> f55990ld6;

    /* JADX INFO: renamed from: n */
    private final C1442g f7992n;

    /* JADX INFO: renamed from: p */
    private final float f7993p;

    /* JADX INFO: renamed from: q */
    private final C1446q f7994q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final boolean f55991qrj;

    /* JADX INFO: renamed from: s */
    private final ki.zy f7995s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final f7l8 f55992toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dd
    private final com.airbnb.lottie.model.animatable.toq f55993x2;

    /* JADX INFO: renamed from: y */
    private final ki.toq f7996y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.zy f55994zy;

    public C1449g(String str, f7l8 f7l8Var, com.airbnb.lottie.model.animatable.zy zyVar, C1446q c1446q, C1442g c1442g, C1442g c1442g2, com.airbnb.lottie.model.animatable.toq toqVar, ki.toq toqVar2, ki.zy zyVar2, float f2, List<com.airbnb.lottie.model.animatable.toq> list, @dd com.airbnb.lottie.model.animatable.toq toqVar3, boolean z2) {
        this.f7991k = str;
        this.f55992toq = f7l8Var;
        this.f55994zy = zyVar;
        this.f7994q = c1446q;
        this.f7992n = c1442g;
        this.f7990g = c1442g2;
        this.f55989f7l8 = toqVar;
        this.f7996y = toqVar2;
        this.f7995s = zyVar2;
        this.f7993p = f2;
        this.f55990ld6 = list;
        this.f55993x2 = toqVar3;
        this.f55991qrj = z2;
    }

    public ki.zy f7l8() {
        return this.f7995s;
    }

    /* JADX INFO: renamed from: g */
    public f7l8 m6008g() {
        return this.f55992toq;
    }

    @Override // com.airbnb.lottie.model.content.zy
    /* JADX INFO: renamed from: k */
    public com.airbnb.lottie.animation.content.zy mo6000k(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar) {
        return new C1415s(c1504r, toqVar, this);
    }

    public C1446q ld6() {
        return this.f7994q;
    }

    /* JADX INFO: renamed from: n */
    public com.airbnb.lottie.model.animatable.zy m6009n() {
        return this.f55994zy;
    }

    public boolean n7h() {
        return this.f55991qrj;
    }

    /* JADX INFO: renamed from: p */
    public String m6010p() {
        return this.f7991k;
    }

    /* JADX INFO: renamed from: q */
    public C1442g m6011q() {
        return this.f7990g;
    }

    public com.airbnb.lottie.model.animatable.toq qrj() {
        return this.f55989f7l8;
    }

    /* JADX INFO: renamed from: s */
    public float m6012s() {
        return this.f7993p;
    }

    public ki.toq toq() {
        return this.f7996y;
    }

    public C1442g x2() {
        return this.f7992n;
    }

    /* JADX INFO: renamed from: y */
    public List<com.airbnb.lottie.model.animatable.toq> m6013y() {
        return this.f55990ld6;
    }

    @dd
    public com.airbnb.lottie.model.animatable.toq zy() {
        return this.f55993x2;
    }
}
