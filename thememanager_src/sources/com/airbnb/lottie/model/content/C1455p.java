package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C1504r;

/* JADX INFO: renamed from: com.airbnb.lottie.model.content.p */
/* JADX INFO: compiled from: PolystarShape.java */
/* JADX INFO: loaded from: classes.dex */
public class C1455p implements zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.toq f56010f7l8;

    /* JADX INFO: renamed from: g */
    private final com.airbnb.lottie.model.animatable.toq f8024g;

    /* JADX INFO: renamed from: k */
    private final String f8025k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final boolean f56011ld6;

    /* JADX INFO: renamed from: n */
    private final com.airbnb.lottie.model.animatable.toq f8026n;

    /* JADX INFO: renamed from: p */
    private final boolean f8027p;

    /* JADX INFO: renamed from: q */
    private final com.airbnb.lottie.model.animatable.qrj<PointF, PointF> f8028q;

    /* JADX INFO: renamed from: s */
    private final com.airbnb.lottie.model.animatable.toq f8029s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final k f56012toq;

    /* JADX INFO: renamed from: y */
    private final com.airbnb.lottie.model.animatable.toq f8030y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.toq f56013zy;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.content.p$k */
    /* JADX INFO: compiled from: PolystarShape.java */
    public enum k {
        STAR(1),
        POLYGON(2);

        private final int value;

        k(int i2) {
            this.value = i2;
        }

        public static k forValue(int i2) {
            for (k kVar : values()) {
                if (kVar.value == i2) {
                    return kVar;
                }
            }
            return null;
        }
    }

    public C1455p(String str, k kVar, com.airbnb.lottie.model.animatable.toq toqVar, com.airbnb.lottie.model.animatable.qrj<PointF, PointF> qrjVar, com.airbnb.lottie.model.animatable.toq toqVar2, com.airbnb.lottie.model.animatable.toq toqVar3, com.airbnb.lottie.model.animatable.toq toqVar4, com.airbnb.lottie.model.animatable.toq toqVar5, com.airbnb.lottie.model.animatable.toq toqVar6, boolean z2, boolean z3) {
        this.f8025k = str;
        this.f56012toq = kVar;
        this.f56013zy = toqVar;
        this.f8028q = qrjVar;
        this.f8026n = toqVar2;
        this.f8024g = toqVar3;
        this.f56010f7l8 = toqVar4;
        this.f8030y = toqVar5;
        this.f8029s = toqVar6;
        this.f8027p = z2;
        this.f56011ld6 = z3;
    }

    public com.airbnb.lottie.model.animatable.toq f7l8() {
        return this.f56013zy;
    }

    /* JADX INFO: renamed from: g */
    public com.airbnb.lottie.model.animatable.toq m6037g() {
        return this.f8029s;
    }

    @Override // com.airbnb.lottie.model.content.zy
    /* JADX INFO: renamed from: k */
    public com.airbnb.lottie.animation.content.zy mo6000k(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar) {
        return new com.airbnb.lottie.animation.content.kja0(c1504r, toqVar, this);
    }

    public boolean ld6() {
        return this.f8027p;
    }

    /* JADX INFO: renamed from: n */
    public com.airbnb.lottie.model.animatable.toq m6038n() {
        return this.f56010f7l8;
    }

    /* JADX INFO: renamed from: p */
    public k m6039p() {
        return this.f56012toq;
    }

    /* JADX INFO: renamed from: q */
    public String m6040q() {
        return this.f8025k;
    }

    /* JADX INFO: renamed from: s */
    public com.airbnb.lottie.model.animatable.toq m6041s() {
        return this.f8026n;
    }

    public com.airbnb.lottie.model.animatable.toq toq() {
        return this.f8024g;
    }

    public boolean x2() {
        return this.f56011ld6;
    }

    /* JADX INFO: renamed from: y */
    public com.airbnb.lottie.model.animatable.qrj<PointF, PointF> m6042y() {
        return this.f8028q;
    }

    public com.airbnb.lottie.model.animatable.toq zy() {
        return this.f8030y;
    }
}
