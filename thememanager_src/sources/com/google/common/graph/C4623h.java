package com.google.common.graph;

import com.google.common.collect.cfr;
import com.google.common.collect.ltg8;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.common.graph.h */
/* JADX INFO: compiled from: DirectedNetworkConnections.java */
/* JADX INFO: loaded from: classes2.dex */
final class C4623h<N, E> extends toq<N, E> {
    protected C4623h(Map<E, N> map, Map<E, N> map2, int i2) {
        super(map, map2, i2);
    }

    static <N, E> C4623h<N, E> kja0(Map<E, N> map, Map<E, N> map2, int i2) {
        return new C4623h<>(cfr.copyOf((Map) map), cfr.copyOf((Map) map2), i2);
    }

    static <N, E> C4623h<N, E> n7h() {
        return new C4623h<>(ltg8.create(2), ltg8.create(2), 0);
    }

    @Override // com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: k */
    public Set<N> mo16224k() {
        return Collections.unmodifiableSet(((com.google.common.collect.ni7) this.f68283toq).values());
    }

    @Override // com.google.common.graph.InterfaceC4642r
    public Set<N> toq() {
        return Collections.unmodifiableSet(((com.google.common.collect.ni7) this.f26964k).values());
    }

    @Override // com.google.common.graph.InterfaceC4642r
    public Set<E> x2(N n2) {
        return new cdj(((com.google.common.collect.ni7) this.f68283toq).inverse(), n2);
    }
}
