package com.airbnb.lottie.value;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: LottieInterpolatedFloatValue.java */
/* JADX INFO: loaded from: classes.dex */
public class zy extends AbstractC1514g<Float> {
    public zy(Float f2, Float f3) {
        super(f2, f3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.value.AbstractC1514g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Float mo6277n(Float f2, Float f3, float f4) {
        return Float.valueOf(com.airbnb.lottie.utils.f7l8.ld6(f2.floatValue(), f3.floatValue(), f4));
    }

    @Override // com.airbnb.lottie.value.AbstractC1514g, com.airbnb.lottie.value.C1517p
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ Object mo5884k(toq toqVar) {
        return super.mo5884k(toqVar);
    }

    public zy(Float f2, Float f3, Interpolator interpolator) {
        super(f2, f3, interpolator);
    }
}
