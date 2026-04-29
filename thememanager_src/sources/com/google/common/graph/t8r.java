package com.google.common.graph;

import com.google.common.base.C4280z;
import com.google.common.collect.ab;
import com.google.common.collect.zwy;
import com.google.errorprone.annotations.Immutable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: EndpointPair.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable(containerOf = {"N"})
@InterfaceC7731k
public abstract class t8r<N> implements Iterable<N> {

    /* JADX INFO: renamed from: k */
    private final N f26962k;

    /* JADX INFO: renamed from: q */
    private final N f26963q;

    /* JADX INFO: compiled from: EndpointPair.java */
    private static final class toq<N> extends t8r<N> {
        @Override // com.google.common.graph.t8r
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof t8r)) {
                return false;
            }
            t8r t8rVar = (t8r) obj;
            if (toq() != t8rVar.toq()) {
                return false;
            }
            return mo16310p().equals(t8rVar.mo16310p()) && ld6().equals(t8rVar.ld6());
        }

        @Override // com.google.common.graph.t8r
        public int hashCode() {
            return C4280z.toq(mo16310p(), ld6());
        }

        @Override // com.google.common.graph.t8r, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.graph.t8r
        public N ld6() {
            return m16307g();
        }

        @Override // com.google.common.graph.t8r
        /* JADX INFO: renamed from: p */
        public N mo16310p() {
            return m16309n();
        }

        public String toString() {
            return "<" + mo16310p() + " -> " + ld6() + ">";
        }

        @Override // com.google.common.graph.t8r
        public boolean toq() {
            return true;
        }

        private toq(N n2, N n3) {
            super(n2, n3);
        }
    }

    /* JADX INFO: compiled from: EndpointPair.java */
    private static final class zy<N> extends t8r<N> {
        @Override // com.google.common.graph.t8r
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof t8r)) {
                return false;
            }
            t8r t8rVar = (t8r) obj;
            if (toq() != t8rVar.toq()) {
                return false;
            }
            return m16309n().equals(t8rVar.m16309n()) ? m16307g().equals(t8rVar.m16307g()) : m16309n().equals(t8rVar.m16307g()) && m16307g().equals(t8rVar.m16309n());
        }

        @Override // com.google.common.graph.t8r
        public int hashCode() {
            return m16309n().hashCode() + m16307g().hashCode();
        }

        @Override // com.google.common.graph.t8r, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.graph.t8r
        public N ld6() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        @Override // com.google.common.graph.t8r
        /* JADX INFO: renamed from: p */
        public N mo16310p() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public String toString() {
            return "[" + m16309n() + ", " + m16307g() + "]";
        }

        @Override // com.google.common.graph.t8r
        public boolean toq() {
            return false;
        }

        private zy(N n2, N n3) {
            super(n2, n3);
        }
    }

    static <N> t8r<N> f7l8(fu4<?> fu4Var, N n2, N n3) {
        return fu4Var.mo16193n() ? m16305s(n2, n3) : x2(n2, n3);
    }

    /* JADX INFO: renamed from: s */
    public static <N> t8r<N> m16305s(N n2, N n3) {
        return new toq(n2, n3);
    }

    public static <N> t8r<N> x2(N n2, N n3) {
        return new zy(n3, n2);
    }

    /* JADX INFO: renamed from: y */
    static <N> t8r<N> m16306y(d2ok<?, ?> d2okVar, N n2, N n3) {
        return d2okVar.mo16205n() ? m16305s(n2, n3) : x2(n2, n3);
    }

    public abstract boolean equals(@NullableDecl Object obj);

    /* JADX INFO: renamed from: g */
    public final N m16307g() {
        return this.f26963q;
    }

    public abstract int hashCode();

    /* JADX INFO: renamed from: k */
    public final N m16308k(Object obj) {
        if (obj.equals(this.f26962k)) {
            return this.f26963q;
        }
        if (obj.equals(this.f26963q)) {
            return this.f26962k;
        }
        throw new IllegalArgumentException("EndpointPair " + this + " does not contain node " + obj);
    }

    public abstract N ld6();

    /* JADX INFO: renamed from: n */
    public final N m16309n() {
        return this.f26962k;
    }

    /* JADX INFO: renamed from: p */
    public abstract N mo16310p();

    public abstract boolean toq();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public final ab<N> iterator() {
        return zwy.m16134t(this.f26962k, this.f26963q);
    }

    private t8r(N n2, N n3) {
        this.f26962k = (N) com.google.common.base.jk.a9(n2);
        this.f26963q = (N) com.google.common.base.jk.a9(n3);
    }
}
