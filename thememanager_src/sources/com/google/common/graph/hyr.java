package com.google.common.graph;

import com.google.common.collect.cfr;
import com.google.common.collect.ltg8;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: UndirectedNetworkConnections.java */
/* JADX INFO: loaded from: classes2.dex */
final class hyr<N, E> extends AbstractC4621g<N, E> {
    protected hyr(Map<E, N> map) {
        super(map);
    }

    static <N, E> hyr<N, E> n7h(Map<E, N> map) {
        return new hyr<>(cfr.copyOf((Map) map));
    }

    static <N, E> hyr<N, E> qrj() {
        return new hyr<>(ltg8.create(2));
    }

    @Override // com.google.common.graph.InterfaceC4642r
    public Set<E> x2(N n2) {
        return new cdj(((com.google.common.collect.ni7) this.f26871k).inverse(), n2);
    }

    @Override // com.google.common.graph.InterfaceC4642r
    public Set<N> zy() {
        return Collections.unmodifiableSet(((com.google.common.collect.ni7) this.f26871k).values());
    }
}
