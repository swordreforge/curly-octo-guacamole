package com.google.common.graph;

import com.google.common.collect.ab;
import com.google.common.collect.g0ad;
import com.google.common.collect.vep5;
import com.google.common.collect.zwy;
import com.google.common.math.C4723q;
import com.google.common.primitives.C4746s;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.graph.k */
/* JADX INFO: compiled from: AbstractBaseGraph.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4627k<N> implements InterfaceC4648y<N> {

    /* JADX INFO: renamed from: com.google.common.graph.k$k */
    /* JADX INFO: compiled from: AbstractBaseGraph.java */
    class k extends AbstractSet<t8r<N>> {
        k() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof t8r)) {
                return false;
            }
            t8r<?> t8rVar = (t8r) obj;
            return AbstractC4627k.this.m16239r(t8rVar) && AbstractC4627k.this.qrj().contains(t8rVar.m16309n()) && AbstractC4627k.this.toq(t8rVar.m16309n()).contains(t8rVar.m16307g());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ab<t8r<N>> iterator() {
            return AbstractC4624i.m16231n(AbstractC4627k.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C4746s.fu4(AbstractC4627k.this.lvui());
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.k$toq */
    /* JADX INFO: compiled from: AbstractBaseGraph.java */
    private static abstract class toq<N> extends AbstractSet<t8r<N>> {

        /* JADX INFO: renamed from: k */
        protected final N f26888k;

        /* JADX INFO: renamed from: q */
        protected final InterfaceC4648y<N> f26889q;

        /* JADX INFO: renamed from: com.google.common.graph.k$toq$k */
        /* JADX INFO: compiled from: AbstractBaseGraph.java */
        private static final class k<N> extends toq<N> {

            /* JADX INFO: renamed from: com.google.common.graph.k$toq$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: AbstractBaseGraph.java */
            class C8003k implements com.google.common.base.t8r<N, t8r<N>> {
                C8003k() {
                }

                @Override // com.google.common.base.t8r
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public t8r<N> apply(N n2) {
                    return t8r.m16305s(n2, k.this.f26888k);
                }
            }

            /* JADX INFO: renamed from: com.google.common.graph.k$toq$k$toq, reason: collision with other inner class name */
            /* JADX INFO: compiled from: AbstractBaseGraph.java */
            class C8004toq implements com.google.common.base.t8r<N, t8r<N>> {
                C8004toq() {
                }

                @Override // com.google.common.base.t8r
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public t8r<N> apply(N n2) {
                    return t8r.m16305s(k.this.f26888k, n2);
                }
            }

            /* synthetic */ k(InterfaceC4648y interfaceC4648y, Object obj, k kVar) {
                this(interfaceC4648y, obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@NullableDecl Object obj) {
                if (!(obj instanceof t8r)) {
                    return false;
                }
                t8r t8rVar = (t8r) obj;
                if (!t8rVar.toq()) {
                    return false;
                }
                Object objMo16310p = t8rVar.mo16310p();
                Object objLd6 = t8rVar.ld6();
                return (this.f26888k.equals(objMo16310p) && this.f26889q.toq((Object) this.f26888k).contains(objLd6)) || (this.f26888k.equals(objLd6) && this.f26889q.mo16192k((Object) this.f26888k).contains(objMo16310p));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return (this.f26889q.n7h(this.f26888k) + this.f26889q.mo16213s(this.f26888k)) - (this.f26889q.toq((Object) this.f26888k).contains(this.f26888k) ? 1 : 0);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public ab<t8r<N>> iterator() {
                return zwy.ek5k(zwy.m16130p(zwy.m16124j(this.f26889q.mo16192k((Object) this.f26888k).iterator(), new C8003k()), zwy.m16124j(g0ad.m15689g(this.f26889q.toq((Object) this.f26888k), vep5.of(this.f26888k)).iterator(), new C8004toq())));
            }

            private k(InterfaceC4648y<N> interfaceC4648y, N n2) {
                super(interfaceC4648y, n2, null);
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.k$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractBaseGraph.java */
        private static final class C8005toq<N> extends toq<N> {

            /* JADX INFO: renamed from: com.google.common.graph.k$toq$toq$k */
            /* JADX INFO: compiled from: AbstractBaseGraph.java */
            class k implements com.google.common.base.t8r<N, t8r<N>> {
                k() {
                }

                @Override // com.google.common.base.t8r
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public t8r<N> apply(N n2) {
                    return t8r.x2(C8005toq.this.f26888k, n2);
                }
            }

            /* synthetic */ C8005toq(InterfaceC4648y interfaceC4648y, Object obj, k kVar) {
                this(interfaceC4648y, obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@NullableDecl Object obj) {
                if (!(obj instanceof t8r)) {
                    return false;
                }
                t8r t8rVar = (t8r) obj;
                if (t8rVar.toq()) {
                    return false;
                }
                Set<N> setLd6 = this.f26889q.ld6(this.f26888k);
                Object objM16309n = t8rVar.m16309n();
                Object objM16307g = t8rVar.m16307g();
                return (this.f26888k.equals(objM16307g) && setLd6.contains(objM16309n)) || (this.f26888k.equals(objM16309n) && setLd6.contains(objM16307g));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.f26889q.ld6(this.f26888k).size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public ab<t8r<N>> iterator() {
                return zwy.ek5k(zwy.m16124j(this.f26889q.ld6(this.f26888k).iterator(), new k()));
            }

            private C8005toq(InterfaceC4648y<N> interfaceC4648y, N n2) {
                super(interfaceC4648y, n2, null);
            }
        }

        /* synthetic */ toq(InterfaceC4648y interfaceC4648y, Object obj, k kVar) {
            this(interfaceC4648y, obj);
        }

        /* JADX INFO: renamed from: k */
        public static <N> toq<N> m16241k(InterfaceC4648y<N> interfaceC4648y, N n2) {
            k kVar = null;
            return interfaceC4648y.mo16193n() ? new k(interfaceC4648y, n2, kVar) : new C8005toq(interfaceC4648y, n2, kVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        private toq(InterfaceC4648y<N> interfaceC4648y, N n2) {
            this.f26889q = interfaceC4648y;
            this.f26888k = n2;
        }
    }

    AbstractC4627k() {
    }

    protected final void dd(t8r<?> t8rVar) {
        com.google.common.base.jk.a9(t8rVar);
        com.google.common.base.jk.m15380n(m16239r(t8rVar), "Mismatch: unordered endpoints cannot be used with directed graphs");
    }

    @Override // com.google.common.graph.InterfaceC4648y
    public int f7l8(N n2) {
        if (mo16193n()) {
            return C4723q.m16543i(mo16192k((Object) n2).size(), toq((Object) n2).size());
        }
        Set<N> setLd6 = ld6(n2);
        return C4723q.m16543i(setLd6.size(), (mo16194p() && setLd6.contains(n2)) ? 1 : 0);
    }

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: g */
    public boolean mo16190g(t8r<N> t8rVar) {
        com.google.common.base.jk.a9(t8rVar);
        if (!m16239r(t8rVar)) {
            return false;
        }
        N nM16309n = t8rVar.m16309n();
        return qrj().contains(nM16309n) && toq((Object) nM16309n).contains(t8rVar.m16307g());
    }

    protected long lvui() {
        Iterator<N> it = qrj().iterator();
        long jF7l8 = 0;
        while (it.hasNext()) {
            jF7l8 += (long) f7l8(it.next());
        }
        com.google.common.base.jk.yz((1 & jF7l8) == 0);
        return jF7l8 >>> 1;
    }

    @Override // com.google.common.graph.InterfaceC4648y
    public int n7h(N n2) {
        return mo16193n() ? mo16192k((Object) n2).size() : f7l8(n2);
    }

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: q */
    public boolean mo16195q(N n2, N n3) {
        com.google.common.base.jk.a9(n2);
        com.google.common.base.jk.a9(n3);
        return qrj().contains(n2) && toq((Object) n2).contains(n3);
    }

    /* JADX INFO: renamed from: r */
    protected final boolean m16239r(t8r<?> t8rVar) {
        return t8rVar.toq() || !mo16193n();
    }

    @Override // com.google.common.graph.InterfaceC4648y
    /* JADX INFO: renamed from: s */
    public int mo16213s(N n2) {
        return mo16193n() ? toq((Object) n2).size() : f7l8(n2);
    }

    @Override // com.google.common.graph.InterfaceC4648y
    public Set<t8r<N>> x2(N n2) {
        com.google.common.base.jk.a9(n2);
        com.google.common.base.jk.fn3e(qrj().contains(n2), "Node %s is not an element of this graph.", n2);
        return toq.m16241k(this, n2);
    }

    @Override // com.google.common.graph.InterfaceC4648y
    public Set<t8r<N>> zy() {
        return new k();
    }
}
