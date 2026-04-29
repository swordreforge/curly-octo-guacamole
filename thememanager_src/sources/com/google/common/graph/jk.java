package com.google.common.graph;

import androidx.exifinterface.media.C0846k;
import com.google.common.collect.vy;
import com.google.common.collect.zkd;
import com.google.errorprone.annotations.Immutable;
import java.util.Map;
import java.util.Set;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ImmutableNetwork.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable(containerOf = {"N", C0846k.d9i})
@InterfaceC7731k
public final class jk<N, E> extends x2<N, E> {

    /* JADX INFO: renamed from: com.google.common.graph.jk$k */
    /* JADX INFO: compiled from: ImmutableNetwork.java */
    static class C4625k implements com.google.common.base.t8r<E, N> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ d2ok f26881k;

        C4625k(d2ok d2okVar) {
            this.f26881k = d2okVar;
        }

        @Override // com.google.common.base.t8r
        public N apply(E e2) {
            return this.f26881k.a9(e2).mo16310p();
        }
    }

    /* JADX INFO: compiled from: ImmutableNetwork.java */
    static class toq implements com.google.common.base.t8r<E, N> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ d2ok f26882k;

        toq(d2ok d2okVar) {
            this.f26882k = d2okVar;
        }

        @Override // com.google.common.base.t8r
        public N apply(E e2) {
            return this.f26882k.a9(e2).ld6();
        }
    }

    /* JADX INFO: compiled from: ImmutableNetwork.java */
    static class zy implements com.google.common.base.t8r<E, N> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ d2ok f26883k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Object f26884q;

        zy(d2ok d2okVar, Object obj) {
            this.f26883k = d2okVar;
            this.f26884q = obj;
        }

        @Override // com.google.common.base.t8r
        public N apply(E e2) {
            return this.f26883k.a9(e2).m16308k(this.f26884q);
        }
    }

    private jk(d2ok<N, E> d2okVar) {
        super(lvui.m16262s(d2okVar), nn86(d2okVar), m16235e(d2okVar));
    }

    /* JADX INFO: renamed from: e */
    private static <N, E> Map<E, N> m16235e(d2ok<N, E> d2okVar) {
        zkd.toq toqVarBuilder = zkd.builder();
        for (E e2 : d2okVar.zy()) {
            toqVarBuilder.mo15592q(e2, d2okVar.a9(e2).m16309n());
        }
        return toqVarBuilder.mo15589k();
    }

    /* JADX INFO: renamed from: f */
    private static <N, E> com.google.common.base.t8r<E, N> m16236f(d2ok<N, E> d2okVar, N n2) {
        return new zy(d2okVar, n2);
    }

    private static <N, E> com.google.common.base.t8r<E, N> hb(d2ok<N, E> d2okVar) {
        return new C4625k(d2okVar);
    }

    /* JADX INFO: renamed from: j */
    private static <N, E> com.google.common.base.t8r<E, N> m16237j(d2ok<N, E> d2okVar) {
        return new toq(d2okVar);
    }

    private static <N, E> InterfaceC4642r<N, E> lrht(d2ok<N, E> d2okVar, N n2) {
        if (!d2okVar.mo16205n()) {
            Map mapM16023p = vy.m16023p(d2okVar.x2(n2), m16236f(d2okVar, n2));
            return d2okVar.fu4() ? n5r1.cdj(mapM16023p) : hyr.n7h(mapM16023p);
        }
        Map mapM16023p2 = vy.m16023p(d2okVar.oc(n2), hb(d2okVar));
        Map mapM16023p3 = vy.m16023p(d2okVar.fn3e(n2), m16237j(d2okVar));
        int size = d2okVar.ni7(n2, n2).size();
        return d2okVar.fu4() ? kja0.cdj(mapM16023p2, mapM16023p3, size) : C4623h.kja0(mapM16023p2, mapM16023p3, size);
    }

    private static <N, E> Map<N, InterfaceC4642r<N, E>> nn86(d2ok<N, E> d2okVar) {
        zkd.toq toqVarBuilder = zkd.builder();
        for (N n2 : d2okVar.qrj()) {
            toqVarBuilder.mo15592q(n2, lrht(d2okVar, n2));
        }
        return toqVarBuilder.mo15589k();
    }

    @Deprecated
    public static <N, E> jk<N, E> uv6(jk<N, E> jkVar) {
        return (jk) com.google.common.base.jk.a9(jkVar);
    }

    public static <N, E> jk<N, E> vyq(d2ok<N, E> d2okVar) {
        return d2okVar instanceof jk ? (jk) d2okVar : new jk<>(d2okVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.x2, com.google.common.graph.d2ok
    public /* bridge */ /* synthetic */ t8r a9(Object obj) {
        return super.a9(obj);
    }

    @Override // com.google.common.graph.AbstractC4631n, com.google.common.graph.d2ok
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public mcp<N> t8r() {
        return new mcp<>(super.t8r());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.x2, com.google.common.graph.d2ok
    public /* bridge */ /* synthetic */ Set fn3e(Object obj) {
        return super.fn3e(obj);
    }

    @Override // com.google.common.graph.x2, com.google.common.graph.d2ok
    public /* bridge */ /* synthetic */ boolean fu4() {
        return super.fu4();
    }

    @Override // com.google.common.graph.x2, com.google.common.graph.d2ok
    public /* bridge */ /* synthetic */ ki jp0y() {
        return super.jp0y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.x2, com.google.common.graph.d2ok, com.google.common.graph.dd, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ Set mo16192k(Object obj) {
        return super.mo16192k(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.x2, com.google.common.graph.d2ok
    public /* bridge */ /* synthetic */ Set ld6(Object obj) {
        return super.ld6(obj);
    }

    @Override // com.google.common.graph.x2, com.google.common.graph.d2ok
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ boolean mo16205n() {
        return super.mo16205n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.x2, com.google.common.graph.AbstractC4631n, com.google.common.graph.d2ok
    public /* bridge */ /* synthetic */ Set ni7(Object obj, Object obj2) {
        return super.ni7(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.x2, com.google.common.graph.d2ok
    public /* bridge */ /* synthetic */ Set oc(Object obj) {
        return super.oc(obj);
    }

    @Override // com.google.common.graph.x2, com.google.common.graph.d2ok
    /* JADX INFO: renamed from: p */
    public /* bridge */ /* synthetic */ boolean mo16206p() {
        return super.mo16206p();
    }

    @Override // com.google.common.graph.x2, com.google.common.graph.d2ok
    public /* bridge */ /* synthetic */ Set qrj() {
        return super.qrj();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.x2, com.google.common.graph.d2ok, com.google.common.graph.x9kr, com.google.common.graph.InterfaceC4618f
    public /* bridge */ /* synthetic */ Set toq(Object obj) {
        return super.toq(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.x2, com.google.common.graph.d2ok
    public /* bridge */ /* synthetic */ Set x2(Object obj) {
        return super.x2(obj);
    }

    @Override // com.google.common.graph.x2, com.google.common.graph.d2ok
    /* JADX INFO: renamed from: y */
    public /* bridge */ /* synthetic */ ki mo16209y() {
        return super.mo16209y();
    }

    @Override // com.google.common.graph.x2, com.google.common.graph.d2ok
    public /* bridge */ /* synthetic */ Set zy() {
        return super.zy();
    }
}
