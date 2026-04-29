package com.google.common.graph;

import com.google.common.collect.ab;
import com.google.common.collect.se;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;

/* JADX INFO: renamed from: com.google.common.graph.p */
/* JADX INFO: compiled from: ConfigurableMutableNetwork.java */
/* JADX INFO: loaded from: classes2.dex */
final class C4640p<N, E> extends x2<N, E> implements oc<N, E> {
    C4640p(lvui<? super N, ? super E> lvuiVar) {
        super(lvuiVar);
    }

    /* JADX INFO: renamed from: c */
    private InterfaceC4642r<N, E> m16290c() {
        return mo16205n() ? fu4() ? kja0.m16250h() : C4623h.n7h() : fu4() ? n5r1.m16271h() : hyr.qrj();
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: f */
    private InterfaceC4642r<N, E> m16291f(N n2) {
        InterfaceC4642r<N, E> interfaceC4642rM16290c = m16290c();
        com.google.common.base.jk.yz(this.f26974g.m16220s(n2, interfaceC4642rM16290c) == null);
        return interfaceC4642rM16290c;
    }

    @Override // com.google.common.graph.oc
    @CanIgnoreReturnValue
    public boolean d2ok(N n2, N n3, E e2) {
        com.google.common.base.jk.fti(n2, "nodeU");
        com.google.common.base.jk.fti(n3, "nodeV");
        com.google.common.base.jk.fti(e2, "edge");
        if (n5r1(e2)) {
            t8r<N> t8rVarA9 = a9(e2);
            t8r t8rVarM16306y = t8r.m16306y(this, n2, n3);
            com.google.common.base.jk.o1t(t8rVarA9.equals(t8rVarM16306y), "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.", e2, t8rVarA9, t8rVarM16306y);
            return false;
        }
        InterfaceC4642r<N, E> interfaceC4642rMo16216g = this.f26974g.mo16216g(n2);
        if (!fu4()) {
            com.google.common.base.jk.m15391z(interfaceC4642rMo16216g == null || !interfaceC4642rMo16216g.mo16224k().contains(n3), "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.", n2, n3);
        }
        boolean zEquals = n2.equals(n3);
        if (!mo16206p()) {
            com.google.common.base.jk.fn3e(!zEquals, "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", n2);
        }
        if (interfaceC4642rMo16216g == null) {
            interfaceC4642rMo16216g = m16291f(n2);
        }
        interfaceC4642rMo16216g.mo16225n(e2, n3);
        InterfaceC4642r<N, E> interfaceC4642rMo16216g2 = this.f26974g.mo16216g(n3);
        if (interfaceC4642rMo16216g2 == null) {
            interfaceC4642rMo16216g2 = m16291f(n3);
        }
        interfaceC4642rMo16216g2.mo16223g(e2, n2, zEquals);
        this.f68292f7l8.m16220s(e2, n2);
        return true;
    }

    @Override // com.google.common.graph.oc
    @CanIgnoreReturnValue
    public boolean d3(E e2) {
        com.google.common.base.jk.fti(e2, "edge");
        N nMo16216g = this.f68292f7l8.mo16216g(e2);
        boolean z2 = false;
        if (nMo16216g == null) {
            return false;
        }
        InterfaceC4642r<N, E> interfaceC4642rMo16216g = this.f26974g.mo16216g(nMo16216g);
        N nMo16229y = interfaceC4642rMo16216g.mo16229y(e2);
        InterfaceC4642r<N, E> interfaceC4642rMo16216g2 = this.f26974g.mo16216g(nMo16229y);
        interfaceC4642rMo16216g.mo16226p(e2);
        if (mo16206p() && nMo16216g.equals(nMo16229y)) {
            z2 = true;
        }
        interfaceC4642rMo16216g2.mo16227q(e2, z2);
        this.f68292f7l8.m16218p(e2);
        return true;
    }

    @Override // com.google.common.graph.oc
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: h */
    public boolean mo16289h(N n2) {
        com.google.common.base.jk.fti(n2, "node");
        if (hyr(n2)) {
            return false;
        }
        m16291f(n2);
        return true;
    }

    @Override // com.google.common.graph.oc
    @CanIgnoreReturnValue
    public boolean kja0(N n2) {
        com.google.common.base.jk.fti(n2, "node");
        InterfaceC4642r<N, E> interfaceC4642rMo16216g = this.f26974g.mo16216g(n2);
        if (interfaceC4642rMo16216g == null) {
            return false;
        }
        ab<E> it = se.copyOf((Collection) interfaceC4642rMo16216g.f7l8()).iterator();
        while (it.hasNext()) {
            d3(it.next());
        }
        this.f26974g.m16218p(n2);
        return true;
    }

    @Override // com.google.common.graph.oc
    @CanIgnoreReturnValue
    public boolean o1t(t8r<N> t8rVar, E e2) {
        x9kr(t8rVar);
        return d2ok(t8rVar.m16309n(), t8rVar.m16307g(), e2);
    }
}
