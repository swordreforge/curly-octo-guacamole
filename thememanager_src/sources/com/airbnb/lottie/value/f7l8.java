package com.airbnb.lottie.value;

import zy.lvui;

/* JADX INFO: compiled from: LottieRelativeFloatValueCallback.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 extends C1517p<Float> {
    public f7l8() {
    }

    @Override // com.airbnb.lottie.value.C1517p
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Float mo5884k(toq<Float> toqVar) {
        return Float.valueOf(com.airbnb.lottie.utils.f7l8.ld6(toqVar.f7l8().floatValue(), toqVar.toq().floatValue(), toqVar.zy()) + m6276n(toqVar).floatValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public Float m6276n(toq<Float> toqVar) {
        T t2 = this.f56204zy;
        if (t2 != 0) {
            return (Float) t2;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    public f7l8(@lvui Float f2) {
        super(f2);
    }
}
