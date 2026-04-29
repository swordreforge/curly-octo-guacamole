package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.content.C1414q;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.airbnb.lottie.model.content.h */
/* JADX INFO: compiled from: ShapeGroup.java */
/* JADX INFO: loaded from: classes.dex */
public class C1450h implements zy {

    /* JADX INFO: renamed from: k */
    private final String f7997k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final List<zy> f55995toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final boolean f55996zy;

    public C1450h(String str, List<zy> list, boolean z2) {
        this.f7997k = str;
        this.f55995toq = list;
        this.f55996zy = z2;
    }

    @Override // com.airbnb.lottie.model.content.zy
    /* JADX INFO: renamed from: k */
    public com.airbnb.lottie.animation.content.zy mo6000k(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar) {
        return new C1414q(c1504r, toqVar, this);
    }

    /* JADX INFO: renamed from: q */
    public boolean m6014q() {
        return this.f55996zy;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f7997k + "' Shapes: " + Arrays.toString(this.f55995toq.toArray()) + '}';
    }

    public List<zy> toq() {
        return this.f55995toq;
    }

    public String zy() {
        return this.f7997k;
    }
}
