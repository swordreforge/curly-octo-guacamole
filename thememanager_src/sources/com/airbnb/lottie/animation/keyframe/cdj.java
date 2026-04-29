package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.value.C1515k;
import com.airbnb.lottie.value.C1517p;
import java.util.Collections;
import zy.dd;

/* JADX INFO: compiled from: ValueCallbackKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class cdj<K, A> extends AbstractC1421k<K, A> {

    /* JADX INFO: renamed from: s */
    private final A f7883s;

    public cdj(C1517p<A> c1517p) {
        this(c1517p, null);
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k
    public void ld6() {
        if (this.f7893n != null) {
            super.ld6();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k
    public void qrj(float f2) {
        this.f7894q = f2;
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k
    /* JADX INFO: renamed from: s */
    A mo5911s(C1515k<K> c1515k, float f2) {
        return mo5912y();
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k
    /* JADX INFO: renamed from: y */
    public A mo5912y() {
        C1517p<A> c1517p = this.f7893n;
        A a2 = this.f7883s;
        return c1517p.toq(0.0f, 0.0f, a2, a2, m5921g(), m5921g(), m5921g());
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k
    float zy() {
        return 1.0f;
    }

    public cdj(C1517p<A> c1517p, @dd A a2) {
        super(Collections.emptyList());
        n7h(c1517p);
        this.f7883s = a2;
    }
}
