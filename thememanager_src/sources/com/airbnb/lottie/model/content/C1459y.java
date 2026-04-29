package com.airbnb.lottie.model.content;

import com.airbnb.lottie.model.animatable.C1446q;
import com.airbnb.lottie.model.animatable.C1448y;

/* JADX INFO: renamed from: com.airbnb.lottie.model.content.y */
/* JADX INFO: compiled from: Mask.java */
/* JADX INFO: loaded from: classes.dex */
public class C1459y {

    /* JADX INFO: renamed from: k */
    private final k f8047k;

    /* JADX INFO: renamed from: q */
    private final boolean f8048q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C1448y f56024toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final C1446q f56025zy;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.content.y$k */
    /* JADX INFO: compiled from: Mask.java */
    public enum k {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public C1459y(k kVar, C1448y c1448y, C1446q c1446q, boolean z2) {
        this.f8047k = kVar;
        this.f56024toq = c1448y;
        this.f56025zy = c1446q;
        this.f8048q = z2;
    }

    /* JADX INFO: renamed from: k */
    public k m6055k() {
        return this.f8047k;
    }

    /* JADX INFO: renamed from: q */
    public boolean m6056q() {
        return this.f8048q;
    }

    public C1448y toq() {
        return this.f56024toq;
    }

    public C1446q zy() {
        return this.f56025zy;
    }
}
