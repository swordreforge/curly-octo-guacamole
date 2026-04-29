package com.airbnb.lottie.model.content;

import android.graphics.Path;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.content.C1417y;
import com.airbnb.lottie.model.animatable.C1442g;
import com.airbnb.lottie.model.animatable.C1446q;
import zy.dd;

/* JADX INFO: renamed from: com.airbnb.lottie.model.content.n */
/* JADX INFO: compiled from: GradientFill.java */
/* JADX INFO: loaded from: classes.dex */
public class C1454n implements zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final String f56005f7l8;

    /* JADX INFO: renamed from: g */
    private final C1442g f8016g;

    /* JADX INFO: renamed from: k */
    private final f7l8 f8017k;

    /* JADX INFO: renamed from: n */
    private final C1442g f8018n;

    /* JADX INFO: renamed from: p */
    private final boolean f8019p;

    /* JADX INFO: renamed from: q */
    private final C1446q f8020q;

    /* JADX INFO: renamed from: s */
    @dd
    private final com.airbnb.lottie.model.animatable.toq f8021s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Path.FillType f56006toq;

    /* JADX INFO: renamed from: y */
    @dd
    private final com.airbnb.lottie.model.animatable.toq f8022y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.zy f56007zy;

    public C1454n(String str, f7l8 f7l8Var, Path.FillType fillType, com.airbnb.lottie.model.animatable.zy zyVar, C1446q c1446q, C1442g c1442g, C1442g c1442g2, com.airbnb.lottie.model.animatable.toq toqVar, com.airbnb.lottie.model.animatable.toq toqVar2, boolean z2) {
        this.f8017k = f7l8Var;
        this.f56006toq = fillType;
        this.f56007zy = zyVar;
        this.f8020q = c1446q;
        this.f8018n = c1442g;
        this.f8016g = c1442g2;
        this.f56005f7l8 = str;
        this.f8022y = toqVar;
        this.f8021s = toqVar2;
        this.f8019p = z2;
    }

    public C1446q f7l8() {
        return this.f8020q;
    }

    /* JADX INFO: renamed from: g */
    public String m6028g() {
        return this.f56005f7l8;
    }

    @Override // com.airbnb.lottie.model.content.zy
    /* JADX INFO: renamed from: k */
    public com.airbnb.lottie.animation.content.zy mo6000k(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar) {
        return new C1417y(c1504r, toqVar, this);
    }

    /* JADX INFO: renamed from: n */
    public f7l8 m6029n() {
        return this.f8017k;
    }

    /* JADX INFO: renamed from: q */
    public com.airbnb.lottie.model.animatable.zy m6030q() {
        return this.f56007zy;
    }

    /* JADX INFO: renamed from: s */
    public boolean m6031s() {
        return this.f8019p;
    }

    public C1442g toq() {
        return this.f8016g;
    }

    /* JADX INFO: renamed from: y */
    public C1442g m6032y() {
        return this.f8018n;
    }

    public Path.FillType zy() {
        return this.f56006toq;
    }
}
