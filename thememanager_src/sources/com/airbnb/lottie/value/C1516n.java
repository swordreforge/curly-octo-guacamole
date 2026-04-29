package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: com.airbnb.lottie.value.n */
/* JADX INFO: compiled from: LottieInterpolatedPointValue.java */
/* JADX INFO: loaded from: classes.dex */
public class C1516n extends AbstractC1514g<PointF> {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final PointF f56202f7l8;

    public C1516n(PointF pointF, PointF pointF2) {
        super(pointF, pointF2);
        this.f56202f7l8 = new PointF();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.value.AbstractC1514g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public PointF mo6277n(PointF pointF, PointF pointF2, float f2) {
        this.f56202f7l8.set(com.airbnb.lottie.utils.f7l8.ld6(pointF.x, pointF2.x, f2), com.airbnb.lottie.utils.f7l8.ld6(pointF.y, pointF2.y, f2));
        return this.f56202f7l8;
    }

    @Override // com.airbnb.lottie.value.AbstractC1514g, com.airbnb.lottie.value.C1517p
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ Object mo5884k(toq toqVar) {
        return super.mo5884k(toqVar);
    }

    public C1516n(PointF pointF, PointF pointF2, Interpolator interpolator) {
        super(pointF, pointF2, interpolator);
        this.f56202f7l8 = new PointF();
    }
}
