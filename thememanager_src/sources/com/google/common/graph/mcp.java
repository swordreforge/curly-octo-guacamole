package com.google.common.graph;

import com.google.common.collect.vy;
import com.google.common.collect.zkd;
import com.google.common.graph.wvg;
import com.google.errorprone.annotations.Immutable;
import java.util.Set;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ImmutableGraph.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable(containerOf = {"N"})
@InterfaceC7731k
public class mcp<N> extends fn3e<N> {

    /* JADX INFO: renamed from: k */
    private final InterfaceC4648y<N> f26903k;

    mcp(InterfaceC4648y<N> interfaceC4648y) {
        this.f26903k = interfaceC4648y;
    }

    private static <N> zkd<N, o1t<N, wvg.EnumC4647k>> hyr(fu4<N> fu4Var) {
        zkd.toq toqVarBuilder = zkd.builder();
        for (N n2 : fu4Var.qrj()) {
            toqVarBuilder.mo15592q(n2, ncyb(fu4Var, n2));
        }
        return toqVarBuilder.mo15589k();
    }

    /* JADX INFO: renamed from: l */
    public static <N> mcp<N> m16267l(fu4<N> fu4Var) {
        return fu4Var instanceof mcp ? (mcp) fu4Var : new mcp<>(new qrj(C4649z.m16313g(fu4Var), hyr(fu4Var), fu4Var.zy().size()));
    }

    @Deprecated
    public static <N> mcp<N> n5r1(mcp<N> mcpVar) {
        return (mcp) com.google.common.base.jk.a9(mcpVar);
    }

    private static <N> o1t<N, wvg.EnumC4647k> ncyb(fu4<N> fu4Var, N n2) {
        com.google.common.base.t8r qVar = com.google.common.base.fn3e.toq(wvg.EnumC4647k.EDGE_EXISTS);
        return fu4Var.mo16193n() ? n7h.cdj(fu4Var.mo16192k((Object) n2), vy.m16023p(fu4Var.toq((Object) n2), qVar)) : C4630l.m16251p(vy.m16023p(fu4Var.ld6(n2), qVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.fn3e, com.google.common.graph.zy, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
    public /* bridge */ /* synthetic */ int f7l8(Object obj) {
        return super.f7l8(obj);
    }

    @Override // com.google.common.graph.fn3e, com.google.common.graph.zy, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ boolean mo16190g(t8r t8rVar) {
        return super.mo16190g(t8rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.fn3e, com.google.common.graph.InterfaceC4648y, com.google.common.graph.dd, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ Set mo16192k(Object obj) {
        return super.mo16192k(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.fn3e, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    public /* bridge */ /* synthetic */ Set ld6(Object obj) {
        return super.ld6(obj);
    }

    @Override // com.google.common.graph.fn3e, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ boolean mo16193n() {
        return super.mo16193n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.fn3e, com.google.common.graph.zy, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
    public /* bridge */ /* synthetic */ int n7h(Object obj) {
        return super.n7h(obj);
    }

    @Override // com.google.common.graph.fn3e, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: p */
    public /* bridge */ /* synthetic */ boolean mo16194p() {
        return super.mo16194p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.fn3e, com.google.common.graph.zy, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: q */
    public /* bridge */ /* synthetic */ boolean mo16195q(Object obj, Object obj2) {
        return super.mo16195q(obj, obj2);
    }

    @Override // com.google.common.graph.fn3e, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    public /* bridge */ /* synthetic */ Set qrj() {
        return super.qrj();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.fn3e, com.google.common.graph.zy, com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
    /* JADX INFO: renamed from: s */
    public /* bridge */ /* synthetic */ int mo16213s(Object obj) {
        return super.mo16213s(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.fn3e, com.google.common.graph.InterfaceC4648y, com.google.common.graph.x9kr, com.google.common.graph.InterfaceC4618f
    public /* bridge */ /* synthetic */ Set toq(Object obj) {
        return super.toq(obj);
    }

    @Override // com.google.common.graph.fn3e
    protected InterfaceC4648y<N> x9kr() {
        return this.f26903k;
    }

    @Override // com.google.common.graph.fn3e, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: y */
    public /* bridge */ /* synthetic */ ki mo16196y() {
        return super.mo16196y();
    }
}
