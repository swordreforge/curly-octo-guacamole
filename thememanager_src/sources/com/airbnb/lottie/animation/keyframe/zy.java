package com.airbnb.lottie.animation.keyframe;

import android.graphics.Color;
import android.graphics.Paint;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.parser.C1494p;
import com.airbnb.lottie.value.C1517p;
import zy.dd;

/* JADX INFO: compiled from: DropShadowKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class zy implements AbstractC1421k.toq {

    /* JADX INFO: renamed from: y */
    private static final double f7913y = 0.017453292519943295d;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f55937f7l8 = true;

    /* JADX INFO: renamed from: g */
    private final AbstractC1421k<Float, Float> f7914g;

    /* JADX INFO: renamed from: k */
    private final AbstractC1421k.toq f7915k;

    /* JADX INFO: renamed from: n */
    private final AbstractC1421k<Float, Float> f7916n;

    /* JADX INFO: renamed from: q */
    private final AbstractC1421k<Float, Float> f7917q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final AbstractC1421k<Integer, Integer> f55938toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final AbstractC1421k<Float, Float> f55939zy;

    /* JADX INFO: renamed from: com.airbnb.lottie.animation.keyframe.zy$k */
    /* JADX INFO: compiled from: DropShadowKeyframeAnimation.java */
    class C1428k extends C1517p<Float> {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ C1517p f7919q;

        C1428k(C1517p c1517p) {
            this.f7919q = c1517p;
        }

        @Override // com.airbnb.lottie.value.C1517p
        @dd
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Float mo5884k(com.airbnb.lottie.value.toq<Float> toqVar) {
            Float f2 = (Float) this.f7919q.mo5884k(toqVar);
            if (f2 == null) {
                return null;
            }
            return Float.valueOf(f2.floatValue() * 2.55f);
        }
    }

    public zy(AbstractC1421k.toq toqVar, com.airbnb.lottie.model.layer.toq toqVar2, C1494p c1494p) {
        this.f7915k = toqVar;
        AbstractC1421k<Integer, Integer> abstractC1421kMo5997k = c1494p.m6187k().mo5997k();
        this.f55938toq = abstractC1421kMo5997k;
        abstractC1421kMo5997k.m5922k(this);
        toqVar2.m6084s(abstractC1421kMo5997k);
        AbstractC1421k<Float, Float> abstractC1421kMo5997k2 = c1494p.m6189q().mo5997k();
        this.f55939zy = abstractC1421kMo5997k2;
        abstractC1421kMo5997k2.m5922k(this);
        toqVar2.m6084s(abstractC1421kMo5997k2);
        AbstractC1421k<Float, Float> abstractC1421kMo5997k3 = c1494p.toq().mo5997k();
        this.f7917q = abstractC1421kMo5997k3;
        abstractC1421kMo5997k3.m5922k(this);
        toqVar2.m6084s(abstractC1421kMo5997k3);
        AbstractC1421k<Float, Float> abstractC1421kMo5997k4 = c1494p.zy().mo5997k();
        this.f7916n = abstractC1421kMo5997k4;
        abstractC1421kMo5997k4.m5922k(this);
        toqVar2.m6084s(abstractC1421kMo5997k4);
        AbstractC1421k<Float, Float> abstractC1421kMo5997k5 = c1494p.m6188n().mo5997k();
        this.f7914g = abstractC1421kMo5997k5;
        abstractC1421kMo5997k5.m5922k(this);
        toqVar2.m6084s(abstractC1421kMo5997k5);
    }

    public void f7l8(@dd C1517p<Float> c1517p) {
        this.f7914g.n7h(c1517p);
    }

    /* JADX INFO: renamed from: g */
    public void m5943g(@dd C1517p<Float> c1517p) {
        if (c1517p == null) {
            this.f55939zy.n7h(null);
        } else {
            this.f55939zy.n7h(new C1428k(c1517p));
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.toq
    /* JADX INFO: renamed from: k */
    public void mo5887k() {
        this.f55937f7l8 = true;
        this.f7915k.mo5887k();
    }

    /* JADX INFO: renamed from: n */
    public void m5944n(@dd C1517p<Float> c1517p) {
        this.f7916n.n7h(c1517p);
    }

    /* JADX INFO: renamed from: q */
    public void m5945q(@dd C1517p<Float> c1517p) {
        this.f7917q.n7h(c1517p);
    }

    public void toq(Paint paint) {
        if (this.f55937f7l8) {
            this.f55937f7l8 = false;
            double dFloatValue = ((double) this.f7917q.mo5912y().floatValue()) * f7913y;
            float fFloatValue = this.f7916n.mo5912y().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.f55938toq.mo5912y().intValue();
            paint.setShadowLayer(this.f7914g.mo5912y().floatValue(), fSin, fCos, Color.argb(Math.round(this.f55939zy.mo5912y().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public void zy(@dd C1517p<Integer> c1517p) {
        this.f55938toq.n7h(c1517p);
    }
}
