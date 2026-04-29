package com.google.common.graph;

import com.google.common.collect.vep5;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ConfigurableNetwork.java */
/* JADX INFO: loaded from: classes2.dex */
class x2<N, E> extends AbstractC4631n<N, E> {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    protected final fti<E, N> f68292f7l8;

    /* JADX INFO: renamed from: g */
    protected final fti<N, InterfaceC4642r<N, E>> f26974g;

    /* JADX INFO: renamed from: k */
    private final boolean f26975k;

    /* JADX INFO: renamed from: n */
    private final ki<E> f26976n;

    /* JADX INFO: renamed from: q */
    private final ki<N> f26977q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f68293toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final boolean f68294zy;

    x2(lvui<? super N, ? super E> lvuiVar) {
        this(lvuiVar, lvuiVar.f68280zy.zy(lvuiVar.f26953q.or(10).intValue()), lvuiVar.f26901g.zy(lvuiVar.f68271f7l8.or(20).intValue()));
    }

    @Override // com.google.common.graph.d2ok
    public t8r<N> a9(E e2) {
        N nM16312l = m16312l(e2);
        return t8r.m16306y(this, nM16312l, this.f26974g.mo16216g(nM16312l).mo16229y(e2));
    }

    @Override // com.google.common.graph.d2ok
    public Set<E> fn3e(N n2) {
        return ncyb(n2).ld6();
    }

    @Override // com.google.common.graph.d2ok
    public boolean fu4() {
        return this.f68293toq;
    }

    protected final boolean hyr(@NullableDecl N n2) {
        return this.f26974g.m16217n(n2);
    }

    @Override // com.google.common.graph.d2ok
    public ki<E> jp0y() {
        return this.f26976n;
    }

    /* JADX INFO: renamed from: l */
    protected final N m16312l(E e2) {
        N nMo16216g = this.f68292f7l8.mo16216g(e2);
        if (nMo16216g != null) {
            return nMo16216g;
        }
        com.google.common.base.jk.a9(e2);
        throw new IllegalArgumentException(String.format("Edge %s is not an element of this graph.", e2));
    }

    @Override // com.google.common.graph.d2ok
    public Set<N> ld6(N n2) {
        return ncyb(n2).zy();
    }

    @Override // com.google.common.graph.d2ok
    /* JADX INFO: renamed from: n */
    public boolean mo16205n() {
        return this.f26975k;
    }

    protected final boolean n5r1(@NullableDecl E e2) {
        return this.f68292f7l8.m16217n(e2);
    }

    protected final InterfaceC4642r<N, E> ncyb(N n2) {
        InterfaceC4642r<N, E> interfaceC4642rMo16216g = this.f26974g.mo16216g(n2);
        if (interfaceC4642rMo16216g != null) {
            return interfaceC4642rMo16216g;
        }
        com.google.common.base.jk.a9(n2);
        throw new IllegalArgumentException(String.format("Node %s is not an element of this graph.", n2));
    }

    @Override // com.google.common.graph.AbstractC4631n, com.google.common.graph.d2ok
    public Set<E> ni7(N n2, N n3) {
        InterfaceC4642r<N, E> interfaceC4642rNcyb = ncyb(n2);
        if (!this.f68294zy && n2 == n3) {
            return vep5.of();
        }
        com.google.common.base.jk.fn3e(hyr(n3), "Node %s is not an element of this graph.", n3);
        return interfaceC4642rNcyb.x2(n3);
    }

    @Override // com.google.common.graph.d2ok
    public Set<E> oc(N n2) {
        return ncyb(n2).mo16228s();
    }

    @Override // com.google.common.graph.d2ok
    /* JADX INFO: renamed from: p */
    public boolean mo16206p() {
        return this.f68294zy;
    }

    @Override // com.google.common.graph.d2ok
    public Set<N> qrj() {
        return this.f26974g.ld6();
    }

    @Override // com.google.common.graph.d2ok
    public Set<E> x2(N n2) {
        return ncyb(n2).f7l8();
    }

    @Override // com.google.common.graph.d2ok
    /* JADX INFO: renamed from: y */
    public ki<N> mo16209y() {
        return this.f26977q;
    }

    @Override // com.google.common.graph.d2ok
    public Set<E> zy() {
        return this.f68292f7l8.ld6();
    }

    @Override // com.google.common.graph.dd, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: k */
    public Set<N> mo16192k(N n2) {
        return ncyb(n2).toq();
    }

    @Override // com.google.common.graph.x9kr, com.google.common.graph.InterfaceC4618f
    public Set<N> toq(N n2) {
        return ncyb(n2).mo16224k();
    }

    x2(lvui<? super N, ? super E> lvuiVar, Map<N, InterfaceC4642r<N, E>> map, Map<E, N> map2) {
        this.f26975k = lvuiVar.f26952k;
        this.f68293toq = lvuiVar.f26902n;
        this.f68294zy = lvuiVar.f68279toq;
        this.f26977q = (ki<N>) lvuiVar.f68280zy.m16249k();
        this.f26976n = (ki<E>) lvuiVar.f26901g.m16249k();
        this.f26974g = map instanceof TreeMap ? new jp0y<>(map) : new fti<>(map);
        this.f68292f7l8 = new fti<>(map2);
    }
}
