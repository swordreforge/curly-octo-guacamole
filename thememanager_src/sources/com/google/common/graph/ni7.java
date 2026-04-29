package com.google.common.graph;

import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ForwardingValueGraph.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class ni7<N, V> extends f7l8<N, V> {
    ni7() {
    }

    @Override // com.google.common.graph.f7l8, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
    public int f7l8(N n2) {
        return ncyb().f7l8(n2);
    }

    @Override // com.google.common.graph.f7l8, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: g */
    public boolean mo16190g(t8r<N> t8rVar) {
        return ncyb().mo16190g(t8rVar);
    }

    @Override // com.google.common.graph.InterfaceC4618f
    @NullableDecl
    /* JADX INFO: renamed from: i */
    public V mo16191i(t8r<N> t8rVar, @NullableDecl V v2) {
        return ncyb().mo16191i(t8rVar, v2);
    }

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    public Set<N> ld6(N n2) {
        return ncyb().ld6(n2);
    }

    @Override // com.google.common.graph.AbstractC4627k
    protected long lvui() {
        return ncyb().zy().size();
    }

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: n */
    public boolean mo16193n() {
        return ncyb().mo16193n();
    }

    @Override // com.google.common.graph.f7l8, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
    public int n7h(N n2) {
        return ncyb().n7h(n2);
    }

    protected abstract InterfaceC4618f<N, V> ncyb();

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: p */
    public boolean mo16194p() {
        return ncyb().mo16194p();
    }

    @Override // com.google.common.graph.f7l8, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: q */
    public boolean mo16195q(N n2, N n3) {
        return ncyb().mo16195q(n2, n3);
    }

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    public Set<N> qrj() {
        return ncyb().qrj();
    }

    @Override // com.google.common.graph.f7l8, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
    /* JADX INFO: renamed from: s */
    public int mo16213s(N n2) {
        return ncyb().mo16213s(n2);
    }

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: y */
    public ki<N> mo16196y() {
        return ncyb().mo16196y();
    }

    @Override // com.google.common.graph.InterfaceC4618f
    @NullableDecl
    /* JADX INFO: renamed from: z */
    public V mo16197z(N n2, N n3, @NullableDecl V v2) {
        return ncyb().mo16197z(n2, n3, v2);
    }

    @Override // com.google.common.graph.dd, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: k */
    public Set<N> mo16192k(N n2) {
        return ncyb().mo16192k((Object) n2);
    }

    @Override // com.google.common.graph.x9kr, com.google.common.graph.InterfaceC4618f
    public Set<N> toq(N n2) {
        return ncyb().toq((Object) n2);
    }
}
