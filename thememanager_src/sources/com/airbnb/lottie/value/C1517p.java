package com.airbnb.lottie.value;

import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import zy.dd;
import zy.uv6;

/* JADX INFO: renamed from: com.airbnb.lottie.value.p */
/* JADX INFO: compiled from: LottieValueCallback.java */
/* JADX INFO: loaded from: classes.dex */
public class C1517p<T> {

    /* JADX INFO: renamed from: k */
    private final toq<T> f8308k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private AbstractC1421k<?, ?> f56203toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    protected T f56204zy;

    public C1517p() {
        this.f8308k = new toq<>();
        this.f56204zy = null;
    }

    @dd
    /* JADX INFO: renamed from: k */
    public T mo5884k(toq<T> toqVar) {
        return this.f56204zy;
    }

    /* JADX INFO: renamed from: q */
    public final void m6286q(@dd T t2) {
        this.f56204zy = t2;
        AbstractC1421k<?, ?> abstractC1421k = this.f56203toq;
        if (abstractC1421k != null) {
            abstractC1421k.ld6();
        }
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY})
    public final T toq(float f2, float f3, T t2, T t3, float f4, float f5, float f6) {
        return mo5884k(this.f8308k.m6294y(f2, f3, t2, t3, f4, f5, f6));
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    public final void zy(@dd AbstractC1421k<?, ?> abstractC1421k) {
        this.f56203toq = abstractC1421k;
    }

    public C1517p(@dd T t2) {
        this.f8308k = new toq<>();
        this.f56204zy = t2;
    }
}
