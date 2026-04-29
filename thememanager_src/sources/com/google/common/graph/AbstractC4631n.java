package com.google.common.graph;

import com.google.common.collect.g0ad;
import com.google.common.collect.vep5;
import com.google.common.collect.vy;
import com.google.common.collect.zwy;
import com.google.common.math.C4723q;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.graph.n */
/* JADX INFO: compiled from: AbstractNetwork.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public abstract class AbstractC4631n<N, E> implements d2ok<N, E> {

    /* JADX INFO: renamed from: com.google.common.graph.n$k */
    /* JADX INFO: compiled from: AbstractNetwork.java */
    class k extends com.google.common.graph.zy<N> {

        /* JADX INFO: renamed from: com.google.common.graph.n$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractNetwork.java */
        class C8006k extends AbstractSet<t8r<N>> {

            /* JADX INFO: renamed from: com.google.common.graph.n$k$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: AbstractNetwork.java */
            class C8007k implements com.google.common.base.t8r<E, t8r<N>> {
                C8007k() {
                }

                @Override // com.google.common.base.t8r
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public t8r<N> apply(E e2) {
                    return AbstractC4631n.this.a9(e2);
                }
            }

            C8006k() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@NullableDecl Object obj) {
                if (!(obj instanceof t8r)) {
                    return false;
                }
                t8r<?> t8rVar = (t8r) obj;
                return k.this.m16239r(t8rVar) && k.this.qrj().contains(t8rVar.m16309n()) && k.this.toq(t8rVar.m16309n()).contains(t8rVar.m16307g());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<t8r<N>> iterator() {
                return zwy.m16124j(AbstractC4631n.this.zy().iterator(), new C8007k());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return AbstractC4631n.this.zy().size();
            }
        }

        k() {
        }

        @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
        public Set<N> ld6(N n2) {
            return AbstractC4631n.this.ld6(n2);
        }

        @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
        /* JADX INFO: renamed from: n */
        public boolean mo16193n() {
            return AbstractC4631n.this.mo16205n();
        }

        @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
        /* JADX INFO: renamed from: p */
        public boolean mo16194p() {
            return AbstractC4631n.this.mo16206p();
        }

        @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
        public Set<N> qrj() {
            return AbstractC4631n.this.qrj();
        }

        @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
        /* JADX INFO: renamed from: y */
        public ki<N> mo16196y() {
            return AbstractC4631n.this.mo16209y();
        }

        @Override // com.google.common.graph.zy, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
        public Set<t8r<N>> zy() {
            return AbstractC4631n.this.fu4() ? super.zy() : new C8006k();
        }

        @Override // com.google.common.graph.dd, com.google.common.graph.InterfaceC4618f
        /* JADX INFO: renamed from: k */
        public Set<N> mo16192k(N n2) {
            return AbstractC4631n.this.mo16192k((Object) n2);
        }

        @Override // com.google.common.graph.x9kr, com.google.common.graph.InterfaceC4618f
        public Set<N> toq(N n2) {
            return AbstractC4631n.this.toq((Object) n2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.n$toq */
    /* JADX INFO: compiled from: AbstractNetwork.java */
    class toq implements com.google.common.base.a9<E> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Object f26907k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Object f26909q;

        toq(Object obj, Object obj2) {
            this.f26907k = obj;
            this.f26909q = obj2;
        }

        @Override // com.google.common.base.a9
        public boolean apply(E e2) {
            return AbstractC4631n.this.a9(e2).m16308k(this.f26907k).equals(this.f26909q);
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.n$zy */
    /* JADX INFO: compiled from: AbstractNetwork.java */
    static class zy implements com.google.common.base.t8r<E, t8r<N>> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ d2ok f26910k;

        zy(d2ok d2okVar) {
            this.f26910k = d2okVar;
        }

        @Override // com.google.common.base.t8r
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public t8r<N> apply(E e2) {
            return this.f26910k.a9(e2);
        }
    }

    private com.google.common.base.a9<E> lvui(N n2, N n3) {
        return new toq(n2, n3);
    }

    /* JADX INFO: renamed from: r */
    private static <N, E> Map<E, t8r<N>> m16268r(d2ok<N, E> d2okVar) {
        return vy.m16023p(d2okVar.zy(), new zy(d2okVar));
    }

    protected final boolean dd(t8r<?> t8rVar) {
        return t8rVar.toq() || !mo16205n();
    }

    @Override // com.google.common.graph.d2ok
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d2ok)) {
            return false;
        }
        d2ok d2okVar = (d2ok) obj;
        return mo16205n() == d2okVar.mo16205n() && qrj().equals(d2okVar.qrj()) && m16268r(this).equals(m16268r(d2okVar));
    }

    @Override // com.google.common.graph.d2ok
    public int f7l8(N n2) {
        return mo16205n() ? C4723q.m16543i(oc(n2).size(), fn3e(n2).size()) : C4723q.m16543i(x2(n2).size(), ni7(n2, n2).size());
    }

    @Override // com.google.common.graph.d2ok
    /* JADX INFO: renamed from: g */
    public boolean mo16204g(t8r<N> t8rVar) {
        com.google.common.base.jk.a9(t8rVar);
        if (dd(t8rVar)) {
            return !ni7(t8rVar.m16309n(), t8rVar.m16307g()).isEmpty();
        }
        return false;
    }

    @Override // com.google.common.graph.d2ok
    @NullableDecl
    public E gvn7(t8r<N> t8rVar) {
        x9kr(t8rVar);
        return jk(t8rVar.m16309n(), t8rVar.m16307g());
    }

    @Override // com.google.common.graph.d2ok
    public final int hashCode() {
        return m16268r(this).hashCode();
    }

    @Override // com.google.common.graph.d2ok
    @NullableDecl
    public E jk(N n2, N n3) {
        Set<E> setNi7 = ni7(n2, n3);
        int size = setNi7.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return setNi7.iterator().next();
        }
        throw new IllegalArgumentException(String.format("Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.", n2, n3));
    }

    @Override // com.google.common.graph.d2ok
    public Set<E> mcp(t8r<N> t8rVar) {
        x9kr(t8rVar);
        return ni7(t8rVar.m16309n(), t8rVar.m16307g());
    }

    @Override // com.google.common.graph.d2ok
    public int n7h(N n2) {
        return mo16205n() ? oc(n2).size() : f7l8(n2);
    }

    @Override // com.google.common.graph.d2ok
    public Set<E> ni7(N n2, N n3) {
        Set<E> setFn3e = fn3e(n2);
        Set<E> setOc = oc(n3);
        return setFn3e.size() <= setOc.size() ? Collections.unmodifiableSet(g0ad.m15697s(setFn3e, lvui(n2, n3))) : Collections.unmodifiableSet(g0ad.m15697s(setOc, lvui(n3, n2)));
    }

    @Override // com.google.common.graph.d2ok
    /* JADX INFO: renamed from: q */
    public boolean mo16207q(N n2, N n3) {
        return !ni7(n2, n3).isEmpty();
    }

    @Override // com.google.common.graph.d2ok
    /* JADX INFO: renamed from: s */
    public int mo16208s(N n2) {
        return mo16205n() ? fn3e(n2).size() : f7l8(n2);
    }

    @Override // com.google.common.graph.d2ok
    public fu4<N> t8r() {
        return new k();
    }

    public String toString() {
        return "isDirected: " + mo16205n() + ", allowsParallelEdges: " + fu4() + ", allowsSelfLoops: " + mo16206p() + ", nodes: " + qrj() + ", edges: " + m16268r(this);
    }

    protected final void x9kr(t8r<?> t8rVar) {
        com.google.common.base.jk.a9(t8rVar);
        com.google.common.base.jk.m15380n(dd(t8rVar), "Mismatch: unordered endpoints cannot be used with directed graphs");
    }

    @Override // com.google.common.graph.d2ok
    public Set<E> zurt(E e2) {
        t8r<N> t8rVarA9 = a9(e2);
        return g0ad.m15689g(g0ad.m15696r(x2(t8rVarA9.m16309n()), x2(t8rVarA9.m16307g())), vep5.of((Object) e2));
    }
}
