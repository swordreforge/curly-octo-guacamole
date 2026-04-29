package com.google.common.graph;

import com.google.common.graph.wvg;

/* JADX INFO: renamed from: com.google.common.graph.s */
/* JADX INFO: compiled from: ConfigurableMutableGraph.java */
/* JADX INFO: loaded from: classes2.dex */
final class C4643s<N> extends fn3e<N> implements d3<N> {

    /* JADX INFO: renamed from: k */
    private final eqxt<N, wvg.EnumC4647k> f26957k;

    C4643s(AbstractC4641q<? super N> abstractC4641q) {
        this.f26957k = new ld6(abstractC4641q);
    }

    @Override // com.google.common.graph.d3
    public boolean cdj(N n2, N n3) {
        return this.f26957k.cdj(n2, n3) != null;
    }

    @Override // com.google.common.graph.d3
    public boolean fti(N n2, N n3) {
        return this.f26957k.eqxt(n2, n3, wvg.EnumC4647k.EDGE_EXISTS) == null;
    }

    @Override // com.google.common.graph.d3
    /* JADX INFO: renamed from: h */
    public boolean mo16210h(N n2) {
        return this.f26957k.mo16211h(n2);
    }

    @Override // com.google.common.graph.d3
    public boolean ki(t8r<N> t8rVar) {
        dd(t8rVar);
        return cdj(t8rVar.m16309n(), t8rVar.m16307g());
    }

    @Override // com.google.common.graph.d3
    public boolean kja0(N n2) {
        return this.f26957k.kja0(n2);
    }

    @Override // com.google.common.graph.d3
    public boolean wvg(t8r<N> t8rVar) {
        dd(t8rVar);
        return fti(t8rVar.m16309n(), t8rVar.m16307g());
    }

    @Override // com.google.common.graph.fn3e
    protected InterfaceC4648y<N> x9kr() {
        return this.f26957k;
    }
}
