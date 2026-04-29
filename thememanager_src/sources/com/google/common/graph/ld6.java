package com.google.common.graph;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;

/* JADX INFO: compiled from: ConfigurableMutableValueGraph.java */
/* JADX INFO: loaded from: classes2.dex */
final class ld6<N, V> extends qrj<N, V> implements eqxt<N, V> {
    ld6(AbstractC4641q<? super N> abstractC4641q) {
        super(abstractC4641q);
    }

    /* JADX INFO: renamed from: c */
    private o1t<N, V> m16258c() {
        return mo16193n() ? n7h.m16272h() : C4630l.m16252s();
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: f */
    private o1t<N, V> m16259f(N n2) {
        o1t<N, V> o1tVarM16258c = m16258c();
        com.google.common.base.jk.yz(this.f26956q.m16220s(n2, o1tVarM16258c) == null);
        return o1tVarM16258c;
    }

    @Override // com.google.common.graph.eqxt
    @CanIgnoreReturnValue
    public V cdj(N n2, N n3) {
        com.google.common.base.jk.fti(n2, "nodeU");
        com.google.common.base.jk.fti(n3, "nodeV");
        o1t<N, V> o1tVarMo16216g = this.f26956q.mo16216g(n2);
        o1t<N, V> o1tVarMo16216g2 = this.f26956q.mo16216g(n3);
        if (o1tVarMo16216g == null || o1tVarMo16216g2 == null) {
            return null;
        }
        V vMo16255n = o1tVarMo16216g.mo16255n(n3);
        if (vMo16255n != null) {
            o1tVarMo16216g2.mo16253g(n2);
            long j2 = this.f26955n - 1;
            this.f26955n = j2;
            C4644t.zy(j2);
        }
        return vMo16255n;
    }

    @Override // com.google.common.graph.eqxt
    @CanIgnoreReturnValue
    public V eqxt(N n2, N n3, V v2) {
        com.google.common.base.jk.fti(n2, "nodeU");
        com.google.common.base.jk.fti(n3, "nodeV");
        com.google.common.base.jk.fti(v2, "value");
        if (!mo16194p()) {
            com.google.common.base.jk.fn3e(!n2.equals(n3), "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", n2);
        }
        o1t<N, V> o1tVarMo16216g = this.f26956q.mo16216g(n2);
        if (o1tVarMo16216g == null) {
            o1tVarMo16216g = m16259f(n2);
        }
        V vF7l8 = o1tVarMo16216g.f7l8(n3, v2);
        o1t<N, V> o1tVarMo16216g2 = this.f26956q.mo16216g(n3);
        if (o1tVarMo16216g2 == null) {
            o1tVarMo16216g2 = m16259f(n3);
        }
        o1tVarMo16216g2.mo16257y(n2, v2);
        if (vF7l8 == null) {
            long j2 = this.f26955n + 1;
            this.f26955n = j2;
            C4644t.m16297n(j2);
        }
        return vF7l8;
    }

    @Override // com.google.common.graph.eqxt
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: h */
    public boolean mo16211h(N n2) {
        com.google.common.base.jk.fti(n2, "node");
        if (m16292l(n2)) {
            return false;
        }
        m16259f(n2);
        return true;
    }

    @Override // com.google.common.graph.eqxt
    @CanIgnoreReturnValue
    public V ki(t8r<N> t8rVar) {
        dd(t8rVar);
        return cdj(t8rVar.m16309n(), t8rVar.m16307g());
    }

    @Override // com.google.common.graph.eqxt
    @CanIgnoreReturnValue
    public boolean kja0(N n2) {
        com.google.common.base.jk.fti(n2, "node");
        o1t<N, V> o1tVarMo16216g = this.f26956q.mo16216g(n2);
        if (o1tVarMo16216g == null) {
            return false;
        }
        if (mo16194p() && o1tVarMo16216g.mo16255n(n2) != null) {
            o1tVarMo16216g.mo16253g(n2);
            this.f26955n--;
        }
        Iterator<N> it = o1tVarMo16216g.mo16254k().iterator();
        while (it.hasNext()) {
            this.f26956q.m16221y(it.next()).mo16253g(n2);
            this.f26955n--;
        }
        if (mo16193n()) {
            Iterator<N> it2 = o1tVarMo16216g.toq().iterator();
            while (it2.hasNext()) {
                com.google.common.base.jk.yz(this.f26956q.m16221y(it2.next()).mo16255n(n2) != null);
                this.f26955n--;
            }
        }
        this.f26956q.m16218p(n2);
        C4644t.zy(this.f26955n);
        return true;
    }

    @Override // com.google.common.graph.eqxt
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: t */
    public V mo16212t(t8r<N> t8rVar, V v2) {
        dd(t8rVar);
        return eqxt(t8rVar.m16309n(), t8rVar.m16307g(), v2);
    }
}
