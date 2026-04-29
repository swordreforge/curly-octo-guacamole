package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.model.content.t8r;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: TrimPathContent.java */
/* JADX INFO: loaded from: classes.dex */
public class zurt implements zy, AbstractC1421k.toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final AbstractC1421k<?, Float> f55910f7l8;

    /* JADX INFO: renamed from: g */
    private final AbstractC1421k<?, Float> f7879g;

    /* JADX INFO: renamed from: k */
    private final String f7880k;

    /* JADX INFO: renamed from: n */
    private final AbstractC1421k<?, Float> f7881n;

    /* JADX INFO: renamed from: q */
    private final t8r.EnumC1458k f7882q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f55911toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final List<AbstractC1421k.toq> f55912zy = new ArrayList();

    public zurt(com.airbnb.lottie.model.layer.toq toqVar, com.airbnb.lottie.model.content.t8r t8rVar) {
        this.f7880k = t8rVar.zy();
        this.f55911toq = t8rVar.f7l8();
        this.f7882q = t8rVar.m6046g();
        AbstractC1421k<Float, Float> abstractC1421kMo5997k = t8rVar.m6047n().mo5997k();
        this.f7881n = abstractC1421kMo5997k;
        AbstractC1421k<Float, Float> abstractC1421kMo5997k2 = t8rVar.toq().mo5997k();
        this.f7879g = abstractC1421kMo5997k2;
        AbstractC1421k<Float, Float> abstractC1421kMo5997k3 = t8rVar.m6048q().mo5997k();
        this.f55910f7l8 = abstractC1421kMo5997k3;
        toqVar.m6084s(abstractC1421kMo5997k);
        toqVar.m6084s(abstractC1421kMo5997k2);
        toqVar.m6084s(abstractC1421kMo5997k3);
        abstractC1421kMo5997k.m5922k(this);
        abstractC1421kMo5997k2.m5922k(this);
        abstractC1421kMo5997k3.m5922k(this);
    }

    public AbstractC1421k<?, Float> f7l8() {
        return this.f55910f7l8;
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public String getName() {
        return this.f7880k;
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.toq
    /* JADX INFO: renamed from: k */
    public void mo5887k() {
        for (int i2 = 0; i2 < this.f55912zy.size(); i2++) {
            this.f55912zy.get(i2).mo5887k();
        }
    }

    public boolean ld6() {
        return this.f55911toq;
    }

    /* JADX INFO: renamed from: n */
    public AbstractC1421k<?, Float> m5907n() {
        return this.f7879g;
    }

    /* JADX INFO: renamed from: p */
    t8r.EnumC1458k m5908p() {
        return this.f7882q;
    }

    /* JADX INFO: renamed from: q */
    void m5909q(AbstractC1421k.toq toqVar) {
        this.f55912zy.add(toqVar);
    }

    /* JADX INFO: renamed from: s */
    public AbstractC1421k<?, Float> m5910s() {
        return this.f7881n;
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public void toq(List<zy> list, List<zy> list2) {
    }
}
