package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.value.C1515k;
import com.airbnb.lottie.value.C1517p;
import java.util.Collections;
import zy.dd;

/* JADX INFO: compiled from: SplitDimensionPathKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class n7h extends AbstractC1421k<PointF, PointF> {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final AbstractC1421k<Float, Float> f55927ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @dd
    protected C1517p<Float> f55928n7h;

    /* JADX INFO: renamed from: p */
    private final PointF f7904p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @dd
    protected C1517p<Float> f55929qrj;

    /* JADX INFO: renamed from: s */
    private final PointF f7905s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final AbstractC1421k<Float, Float> f55930x2;

    public n7h(AbstractC1421k<Float, Float> abstractC1421k, AbstractC1421k<Float, Float> abstractC1421k2) {
        super(Collections.emptyList());
        this.f7905s = new PointF();
        this.f7904p = new PointF();
        this.f55927ld6 = abstractC1421k;
        this.f55930x2 = abstractC1421k2;
        qrj(m5921g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k
    /* JADX INFO: renamed from: cdj, reason: merged with bridge method [inline-methods] */
    public PointF mo5911s(C1515k<PointF> c1515k, float f2) {
        Float qVar;
        C1515k<Float> qVar2;
        C1515k<Float> qVar3;
        Float qVar4 = null;
        if (this.f55929qrj == null || (qVar3 = this.f55927ld6.toq()) == null) {
            qVar = null;
        } else {
            float fM5925q = this.f55927ld6.m5925q();
            Float f3 = qVar3.f8306y;
            C1517p<Float> c1517p = this.f55929qrj;
            float f4 = qVar3.f56193f7l8;
            qVar = c1517p.toq(f4, f3 == null ? f4 : f3.floatValue(), qVar3.f56198toq, qVar3.f56200zy, f2, f2, fM5925q);
        }
        if (this.f55928n7h != null && (qVar2 = this.f55930x2.toq()) != null) {
            float fM5925q2 = this.f55930x2.m5925q();
            Float f5 = qVar2.f8306y;
            C1517p<Float> c1517p2 = this.f55928n7h;
            float f6 = qVar2.f56193f7l8;
            qVar4 = c1517p2.toq(f6, f5 == null ? f6 : f5.floatValue(), qVar2.f56198toq, qVar2.f56200zy, f2, f2, fM5925q2);
        }
        if (qVar == null) {
            this.f7904p.set(this.f7905s.x, 0.0f);
        } else {
            this.f7904p.set(qVar.floatValue(), 0.0f);
        }
        if (qVar4 == null) {
            PointF pointF = this.f7904p;
            pointF.set(pointF.x, this.f7905s.y);
        } else {
            PointF pointF2 = this.f7904p;
            pointF2.set(pointF2.x, qVar4.floatValue());
        }
        return this.f7904p;
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public PointF mo5912y() {
        return mo5911s(null, 0.0f);
    }

    public void ki(@dd C1517p<Float> c1517p) {
        C1517p<Float> c1517p2 = this.f55929qrj;
        if (c1517p2 != null) {
            c1517p2.zy(null);
        }
        this.f55929qrj = c1517p;
        if (c1517p != null) {
            c1517p.zy(this);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k
    public void qrj(float f2) {
        this.f55927ld6.qrj(f2);
        this.f55930x2.qrj(f2);
        this.f7905s.set(this.f55927ld6.mo5912y().floatValue(), this.f55930x2.mo5912y().floatValue());
        for (int i2 = 0; i2 < this.f7892k.size(); i2++) {
            this.f7892k.get(i2).mo5887k();
        }
    }

    public void t8r(@dd C1517p<Float> c1517p) {
        C1517p<Float> c1517p2 = this.f55928n7h;
        if (c1517p2 != null) {
            c1517p2.zy(null);
        }
        this.f55928n7h = c1517p;
        if (c1517p != null) {
            c1517p.zy(this);
        }
    }
}
