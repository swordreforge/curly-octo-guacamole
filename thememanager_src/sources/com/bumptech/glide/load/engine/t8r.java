package com.bumptech.glide.load.engine;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import zy.yz;

/* JADX INFO: compiled from: Jobs.java */
/* JADX INFO: loaded from: classes2.dex */
final class t8r {

    /* JADX INFO: renamed from: k */
    private final Map<com.bumptech.glide.load.f7l8, x2<?>> f18467k = new HashMap();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Map<com.bumptech.glide.load.f7l8, x2<?>> f62811toq = new HashMap();

    t8r() {
    }

    private Map<com.bumptech.glide.load.f7l8, x2<?>> zy(boolean z2) {
        return z2 ? this.f62811toq : this.f18467k;
    }

    /* JADX INFO: renamed from: k */
    x2<?> m10811k(com.bumptech.glide.load.f7l8 f7l8Var, boolean z2) {
        return zy(z2).get(f7l8Var);
    }

    /* JADX INFO: renamed from: n */
    void m10812n(com.bumptech.glide.load.f7l8 f7l8Var, x2<?> x2Var) {
        Map<com.bumptech.glide.load.f7l8, x2<?>> mapZy = zy(x2Var.cdj());
        if (x2Var.equals(mapZy.get(f7l8Var))) {
            mapZy.remove(f7l8Var);
        }
    }

    /* JADX INFO: renamed from: q */
    void m10813q(com.bumptech.glide.load.f7l8 f7l8Var, x2<?> x2Var) {
        zy(x2Var.cdj()).put(f7l8Var, x2Var);
    }

    @yz
    Map<com.bumptech.glide.load.f7l8, x2<?>> toq() {
        return Collections.unmodifiableMap(this.f18467k);
    }
}
