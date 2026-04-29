package com.google.common.graph;

import com.google.common.collect.zkd;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.common.graph.l */
/* JADX INFO: compiled from: UndirectedGraphConnections.java */
/* JADX INFO: loaded from: classes2.dex */
final class C4630l<N, V> implements o1t<N, V> {

    /* JADX INFO: renamed from: k */
    private final Map<N, V> f26900k;

    private C4630l(Map<N, V> map) {
        this.f26900k = (Map) com.google.common.base.jk.a9(map);
    }

    /* JADX INFO: renamed from: p */
    static <N, V> C4630l<N, V> m16251p(Map<N, V> map) {
        return new C4630l<>(zkd.copyOf((Map) map));
    }

    /* JADX INFO: renamed from: s */
    static <N, V> C4630l<N, V> m16252s() {
        return new C4630l<>(new HashMap(2, 1.0f));
    }

    @Override // com.google.common.graph.o1t
    public V f7l8(N n2, V v2) {
        return this.f26900k.put(n2, v2);
    }

    @Override // com.google.common.graph.o1t
    /* JADX INFO: renamed from: g */
    public void mo16253g(N n2) {
        mo16255n(n2);
    }

    @Override // com.google.common.graph.o1t
    /* JADX INFO: renamed from: k */
    public Set<N> mo16254k() {
        return zy();
    }

    @Override // com.google.common.graph.o1t
    /* JADX INFO: renamed from: n */
    public V mo16255n(N n2) {
        return this.f26900k.remove(n2);
    }

    @Override // com.google.common.graph.o1t
    /* JADX INFO: renamed from: q */
    public V mo16256q(N n2) {
        return this.f26900k.get(n2);
    }

    @Override // com.google.common.graph.o1t
    public Set<N> toq() {
        return zy();
    }

    @Override // com.google.common.graph.o1t
    /* JADX INFO: renamed from: y */
    public void mo16257y(N n2, V v2) {
        f7l8(n2, v2);
    }

    @Override // com.google.common.graph.o1t
    public Set<N> zy() {
        return Collections.unmodifiableSet(this.f26900k.keySet());
    }
}
