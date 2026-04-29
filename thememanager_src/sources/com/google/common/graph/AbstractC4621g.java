package com.google.common.graph;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.common.graph.g */
/* JADX INFO: compiled from: AbstractUndirectedNetworkConnections.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4621g<N, E> implements InterfaceC4642r<N, E> {

    /* JADX INFO: renamed from: k */
    protected final Map<E, N> f26871k;

    protected AbstractC4621g(Map<E, N> map) {
        this.f26871k = (Map) com.google.common.base.jk.a9(map);
    }

    @Override // com.google.common.graph.InterfaceC4642r
    public Set<E> f7l8() {
        return Collections.unmodifiableSet(this.f26871k.keySet());
    }

    @Override // com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: g */
    public void mo16223g(E e2, N n2, boolean z2) {
        if (z2) {
            return;
        }
        mo16225n(e2, n2);
    }

    @Override // com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: k */
    public Set<N> mo16224k() {
        return zy();
    }

    @Override // com.google.common.graph.InterfaceC4642r
    public Set<E> ld6() {
        return f7l8();
    }

    @Override // com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: n */
    public void mo16225n(E e2, N n2) {
        com.google.common.base.jk.yz(this.f26871k.put(e2, n2) == null);
    }

    @Override // com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: p */
    public N mo16226p(E e2) {
        return (N) com.google.common.base.jk.a9(this.f26871k.remove(e2));
    }

    @Override // com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: q */
    public N mo16227q(E e2, boolean z2) {
        if (z2) {
            return null;
        }
        return mo16226p(e2);
    }

    @Override // com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: s */
    public Set<E> mo16228s() {
        return f7l8();
    }

    @Override // com.google.common.graph.InterfaceC4642r
    public Set<N> toq() {
        return zy();
    }

    @Override // com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: y */
    public N mo16229y(E e2) {
        return (N) com.google.common.base.jk.a9(this.f26871k.get(e2));
    }
}
