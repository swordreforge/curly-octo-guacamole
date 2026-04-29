package com.google.common.graph;

import com.google.common.collect.vy;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: AbstractValueGraph.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public abstract class f7l8<N, V> extends AbstractC4627k<N> implements InterfaceC4618f<N, V> {

    /* JADX INFO: renamed from: com.google.common.graph.f7l8$k */
    /* JADX INFO: compiled from: AbstractValueGraph.java */
    class C4619k extends zy<N> {
        C4619k() {
        }

        @Override // com.google.common.graph.zy, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
        public int f7l8(N n2) {
            return f7l8.this.f7l8(n2);
        }

        @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
        public Set<N> ld6(N n2) {
            return f7l8.this.ld6(n2);
        }

        @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
        /* JADX INFO: renamed from: n */
        public boolean mo16193n() {
            return f7l8.this.mo16193n();
        }

        @Override // com.google.common.graph.zy, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
        public int n7h(N n2) {
            return f7l8.this.n7h(n2);
        }

        @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
        /* JADX INFO: renamed from: p */
        public boolean mo16194p() {
            return f7l8.this.mo16194p();
        }

        @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
        public Set<N> qrj() {
            return f7l8.this.qrj();
        }

        @Override // com.google.common.graph.zy, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
        /* JADX INFO: renamed from: s */
        public int mo16213s(N n2) {
            return f7l8.this.mo16213s(n2);
        }

        @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
        /* JADX INFO: renamed from: y */
        public ki<N> mo16196y() {
            return f7l8.this.mo16196y();
        }

        @Override // com.google.common.graph.zy, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
        public Set<t8r<N>> zy() {
            return f7l8.this.zy();
        }

        @Override // com.google.common.graph.dd, com.google.common.graph.InterfaceC4618f
        /* JADX INFO: renamed from: k */
        public Set<N> mo16192k(N n2) {
            return f7l8.this.mo16192k((Object) n2);
        }

        @Override // com.google.common.graph.x9kr, com.google.common.graph.InterfaceC4618f
        public Set<N> toq(N n2) {
            return f7l8.this.toq((Object) n2);
        }
    }

    /* JADX INFO: compiled from: AbstractValueGraph.java */
    static class toq implements com.google.common.base.t8r<t8r<N>, V> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC4618f f26866k;

        toq(InterfaceC4618f interfaceC4618f) {
            this.f26866k = interfaceC4618f;
        }

        @Override // com.google.common.base.t8r
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public V apply(t8r<N> t8rVar) {
            return (V) this.f26866k.mo16197z(t8rVar.m16309n(), t8rVar.m16307g(), null);
        }
    }

    private static <N, V> Map<t8r<N>, V> x9kr(InterfaceC4618f<N, V> interfaceC4618f) {
        return vy.m16023p(interfaceC4618f.zy(), new toq(interfaceC4618f));
    }

    @Override // com.google.common.graph.InterfaceC4618f
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC4618f)) {
            return false;
        }
        InterfaceC4618f interfaceC4618f = (InterfaceC4618f) obj;
        return mo16193n() == interfaceC4618f.mo16193n() && qrj().equals(interfaceC4618f.qrj()) && x9kr(this).equals(x9kr(interfaceC4618f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
    public /* bridge */ /* synthetic */ int f7l8(Object obj) {
        return super.f7l8(obj);
    }

    @Override // com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ boolean mo16190g(t8r t8rVar) {
        return super.mo16190g(t8rVar);
    }

    @Override // com.google.common.graph.InterfaceC4618f
    public final int hashCode() {
        return x9kr(this).hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
    public /* bridge */ /* synthetic */ int n7h(Object obj) {
        return super.n7h(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: q */
    public /* bridge */ /* synthetic */ boolean mo16195q(Object obj, Object obj2) {
        return super.mo16195q(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
    /* JADX INFO: renamed from: s */
    public /* bridge */ /* synthetic */ int mo16213s(Object obj) {
        return super.mo16213s(obj);
    }

    public fu4<N> t8r() {
        return new C4619k();
    }

    public String toString() {
        return "isDirected: " + mo16193n() + ", allowsSelfLoops: " + mo16194p() + ", nodes: " + qrj() + ", edges: " + x9kr(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
    public /* bridge */ /* synthetic */ Set x2(Object obj) {
        return super.x2(obj);
    }

    @Override // com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
    public /* bridge */ /* synthetic */ Set zy() {
        return super.zy();
    }
}
