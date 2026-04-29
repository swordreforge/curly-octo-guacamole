package com.google.common.graph;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ConfigurableValueGraph.java */
/* JADX INFO: loaded from: classes2.dex */
class qrj<N, V> extends f7l8<N, V> {

    /* JADX INFO: renamed from: k */
    private final boolean f26954k;

    /* JADX INFO: renamed from: n */
    protected long f26955n;

    /* JADX INFO: renamed from: q */
    protected final fti<N, o1t<N, V>> f26956q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f68281toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final ki<N> f68282zy;

    qrj(AbstractC4641q<? super N> abstractC4641q) {
        this(abstractC4641q, abstractC4641q.f68280zy.zy(abstractC4641q.f26953q.or(10).intValue()), 0L);
    }

    @Override // com.google.common.graph.f7l8, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: g */
    public boolean mo16190g(t8r<N> t8rVar) {
        com.google.common.base.jk.a9(t8rVar);
        return m16239r(t8rVar) && hyr(t8rVar.m16309n(), t8rVar.m16307g());
    }

    protected final boolean hyr(N n2, N n3) {
        o1t<N, V> o1tVarMo16216g = this.f26956q.mo16216g(n2);
        return o1tVarMo16216g != null && o1tVarMo16216g.mo16254k().contains(n3);
    }

    @NullableDecl
    /* JADX INFO: renamed from: i */
    public V mo16191i(t8r<N> t8rVar, @NullableDecl V v2) {
        dd(t8rVar);
        return n5r1(t8rVar.m16309n(), t8rVar.m16307g(), v2);
    }

    /* JADX INFO: renamed from: l */
    protected final boolean m16292l(@NullableDecl N n2) {
        return this.f26956q.m16217n(n2);
    }

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    public Set<N> ld6(N n2) {
        return ncyb(n2).zy();
    }

    @Override // com.google.common.graph.AbstractC4627k
    protected long lvui() {
        return this.f26955n;
    }

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: n */
    public boolean mo16193n() {
        return this.f26954k;
    }

    protected final V n5r1(N n2, N n3, V v2) {
        o1t<N, V> o1tVarMo16216g = this.f26956q.mo16216g(n2);
        V vMo16256q = o1tVarMo16216g == null ? null : o1tVarMo16216g.mo16256q(n3);
        return vMo16256q == null ? v2 : vMo16256q;
    }

    protected final o1t<N, V> ncyb(N n2) {
        o1t<N, V> o1tVarMo16216g = this.f26956q.mo16216g(n2);
        if (o1tVarMo16216g != null) {
            return o1tVarMo16216g;
        }
        com.google.common.base.jk.a9(n2);
        throw new IllegalArgumentException("Node " + n2 + " is not an element of this graph.");
    }

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: p */
    public boolean mo16194p() {
        return this.f68281toq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.f7l8, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: q */
    public boolean mo16195q(N n2, N n3) {
        return hyr(com.google.common.base.jk.a9(n2), com.google.common.base.jk.a9(n3));
    }

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    public Set<N> qrj() {
        return this.f26956q.ld6();
    }

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: y */
    public ki<N> mo16196y() {
        return this.f68282zy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NullableDecl
    /* JADX INFO: renamed from: z */
    public V mo16197z(N n2, N n3, @NullableDecl V v2) {
        return (V) n5r1(com.google.common.base.jk.a9(n2), com.google.common.base.jk.a9(n3), v2);
    }

    @Override // com.google.common.graph.dd, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: k */
    public Set<N> mo16192k(N n2) {
        return ncyb(n2).toq();
    }

    @Override // com.google.common.graph.x9kr, com.google.common.graph.InterfaceC4618f
    public Set<N> toq(N n2) {
        return ncyb(n2).mo16254k();
    }

    qrj(AbstractC4641q<? super N> abstractC4641q, Map<N, o1t<N, V>> map, long j2) {
        this.f26954k = abstractC4641q.f26952k;
        this.f68281toq = abstractC4641q.f68279toq;
        this.f68282zy = (ki<N>) abstractC4641q.f68280zy.m16249k();
        this.f26956q = map instanceof TreeMap ? new jp0y<>(map) : new fti<>(map);
        this.f26955n = C4644t.zy(j2);
    }
}
