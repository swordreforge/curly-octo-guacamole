package com.airbnb.lottie;

import java.util.Arrays;

/* JADX INFO: compiled from: LottieResult.java */
/* JADX INFO: loaded from: classes.dex */
public final class hyr<V> {

    /* JADX INFO: renamed from: k */
    @zy.dd
    private final V f7949k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.dd
    private final Throwable f55958toq;

    public hyr(V v2) {
        this.f7949k = v2;
        this.f55958toq = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyr)) {
            return false;
        }
        hyr hyrVar = (hyr) obj;
        if (toq() != null && toq().equals(hyrVar.toq())) {
            return true;
        }
        if (m5969k() == null || hyrVar.m5969k() == null) {
            return false;
        }
        return m5969k().toString().equals(m5969k().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{toq(), m5969k()});
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    public Throwable m5969k() {
        return this.f55958toq;
    }

    @zy.dd
    public V toq() {
        return this.f7949k;
    }

    public hyr(Throwable th) {
        this.f55958toq = th;
        this.f7949k = null;
    }
}
