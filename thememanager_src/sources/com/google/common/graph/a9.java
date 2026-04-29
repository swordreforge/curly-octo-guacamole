package com.google.common.graph;

import com.google.common.collect.vy;
import com.google.common.collect.zkd;
import com.google.errorprone.annotations.Immutable;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ImmutableValueGraph.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable(containerOf = {"N", "V"})
@InterfaceC7731k
public final class a9<N, V> extends qrj<N, V> {

    /* JADX INFO: renamed from: com.google.common.graph.a9$k */
    /* JADX INFO: compiled from: ImmutableValueGraph.java */
    static class C4616k implements com.google.common.base.t8r<N, V> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC4618f f26861k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Object f26862q;

        C4616k(InterfaceC4618f interfaceC4618f, Object obj) {
            this.f26861k = interfaceC4618f;
            this.f26862q = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.base.t8r
        public V apply(N n2) {
            return (V) this.f26861k.mo16197z(this.f26862q, n2, null);
        }
    }

    private a9(InterfaceC4618f<N, V> interfaceC4618f) {
        super(C4617c.m16198g(interfaceC4618f), vyq(interfaceC4618f), interfaceC4618f.zy().size());
    }

    /* JADX INFO: renamed from: c */
    private static <N, V> o1t<N, V> m16188c(InterfaceC4618f<N, V> interfaceC4618f, N n2) {
        C4616k c4616k = new C4616k(interfaceC4618f, n2);
        return interfaceC4618f.mo16193n() ? n7h.cdj(interfaceC4618f.mo16192k((Object) n2), vy.m16023p(interfaceC4618f.toq((Object) n2), c4616k)) : C4630l.m16251p(vy.m16023p(interfaceC4618f.ld6(n2), c4616k));
    }

    @Deprecated
    public static <N, V> a9<N, V> lrht(a9<N, V> a9Var) {
        return (a9) com.google.common.base.jk.a9(a9Var);
    }

    public static <N, V> a9<N, V> uv6(InterfaceC4618f<N, V> interfaceC4618f) {
        return interfaceC4618f instanceof a9 ? (a9) interfaceC4618f : new a9<>(interfaceC4618f);
    }

    private static <N, V> zkd<N, o1t<N, V>> vyq(InterfaceC4618f<N, V> interfaceC4618f) {
        zkd.toq toqVarBuilder = zkd.builder();
        for (N n2 : interfaceC4618f.qrj()) {
            toqVarBuilder.mo15592q(n2, m16188c(interfaceC4618f, n2));
        }
        return toqVarBuilder.mo15589k();
    }

    @Override // com.google.common.graph.f7l8, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public mcp<N> t8r() {
        return new mcp<>(this);
    }

    @Override // com.google.common.graph.qrj, com.google.common.graph.f7l8, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ boolean mo16190g(t8r t8rVar) {
        return super.mo16190g(t8rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.qrj, com.google.common.graph.InterfaceC4618f
    @NullableDecl
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ Object mo16191i(t8r t8rVar, @NullableDecl Object obj) {
        return super.mo16191i(t8rVar, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.qrj, com.google.common.graph.InterfaceC4648y, com.google.common.graph.dd, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ Set mo16192k(Object obj) {
        return super.mo16192k(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.qrj, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    public /* bridge */ /* synthetic */ Set ld6(Object obj) {
        return super.ld6(obj);
    }

    @Override // com.google.common.graph.qrj, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ boolean mo16193n() {
        return super.mo16193n();
    }

    @Override // com.google.common.graph.qrj, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: p */
    public /* bridge */ /* synthetic */ boolean mo16194p() {
        return super.mo16194p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.qrj, com.google.common.graph.f7l8, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: q */
    public /* bridge */ /* synthetic */ boolean mo16195q(Object obj, Object obj2) {
        return super.mo16195q(obj, obj2);
    }

    @Override // com.google.common.graph.qrj, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    public /* bridge */ /* synthetic */ Set qrj() {
        return super.qrj();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.qrj, com.google.common.graph.InterfaceC4648y, com.google.common.graph.x9kr, com.google.common.graph.InterfaceC4618f
    public /* bridge */ /* synthetic */ Set toq(Object obj) {
        return super.toq(obj);
    }

    @Override // com.google.common.graph.qrj, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: y */
    public /* bridge */ /* synthetic */ ki mo16196y() {
        return super.mo16196y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.qrj, com.google.common.graph.InterfaceC4618f
    @NullableDecl
    /* JADX INFO: renamed from: z */
    public /* bridge */ /* synthetic */ Object mo16197z(Object obj, Object obj2, @NullableDecl Object obj3) {
        return super.mo16197z(obj, obj2, obj3);
    }
}
