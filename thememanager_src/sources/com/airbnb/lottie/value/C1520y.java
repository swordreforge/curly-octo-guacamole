package com.airbnb.lottie.value;

/* JADX INFO: renamed from: com.airbnb.lottie.value.y */
/* JADX INFO: compiled from: LottieRelativeIntegerValueCallback.java */
/* JADX INFO: loaded from: classes.dex */
public class C1520y extends C1517p<Integer> {
    @Override // com.airbnb.lottie.value.C1517p
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer mo5884k(toq<Integer> toqVar) {
        return Integer.valueOf(com.airbnb.lottie.utils.f7l8.x2(toqVar.f7l8().intValue(), toqVar.toq().intValue(), toqVar.zy()) + m6297n(toqVar).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public Integer m6297n(toq<Integer> toqVar) {
        T t2 = this.f56204zy;
        if (t2 != 0) {
            return (Integer) t2;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }
}
