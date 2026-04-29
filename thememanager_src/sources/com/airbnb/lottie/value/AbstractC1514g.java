package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: com.airbnb.lottie.value.g */
/* JADX INFO: compiled from: LottieInterpolatedValue.java */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1514g<T> extends C1517p<T> {

    /* JADX INFO: renamed from: g */
    private final Interpolator f8296g;

    /* JADX INFO: renamed from: n */
    private final T f8297n;

    /* JADX INFO: renamed from: q */
    private final T f8298q;

    AbstractC1514g(T t2, T t3) {
        this(t2, t3, new LinearInterpolator());
    }

    @Override // com.airbnb.lottie.value.C1517p
    /* JADX INFO: renamed from: k */
    public T mo5884k(toq<T> toqVar) {
        return mo6277n(this.f8298q, this.f8297n, this.f8296g.getInterpolation(toqVar.m6292n()));
    }

    /* JADX INFO: renamed from: n */
    abstract T mo6277n(T t2, T t3, float f2);

    AbstractC1514g(T t2, T t3, Interpolator interpolator) {
        this.f8298q = t2;
        this.f8297n = t3;
        this.f8296g = interpolator;
    }
}
