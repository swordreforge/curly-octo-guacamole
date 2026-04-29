package com.airbnb.lottie.value;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: com.airbnb.lottie.value.q */
/* JADX INFO: compiled from: LottieInterpolatedIntegerValue.java */
/* JADX INFO: loaded from: classes.dex */
public class C1518q extends AbstractC1514g<Integer> {
    public C1518q(Integer num, Integer num2) {
        super(num, num2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.value.AbstractC1514g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer mo6277n(Integer num, Integer num2, float f2) {
        return Integer.valueOf(com.airbnb.lottie.utils.f7l8.x2(num.intValue(), num2.intValue(), f2));
    }

    @Override // com.airbnb.lottie.value.AbstractC1514g, com.airbnb.lottie.value.C1517p
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ Object mo5884k(toq toqVar) {
        return super.mo5884k(toqVar);
    }

    public C1518q(Integer num, Integer num2, Interpolator interpolator) {
        super(num, num2, interpolator);
    }
}
