package com.google.common.graph;

import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Graph.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public interface fu4<N> extends InterfaceC4648y<N> {
    boolean equals(@NullableDecl Object obj);

    @Override // com.google.common.graph.InterfaceC4648y
    int f7l8(N n2);

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: g */
    boolean mo16190g(t8r<N> t8rVar);

    int hashCode();

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.dd, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: k */
    Set<N> mo16192k(N n2);

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    Set<N> ld6(N n2);

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: n */
    boolean mo16193n();

    @Override // com.google.common.graph.InterfaceC4648y
    int n7h(N n2);

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: p */
    boolean mo16194p();

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: q */
    boolean mo16195q(N n2, N n3);

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    Set<N> qrj();

    @Override // com.google.common.graph.InterfaceC4648y
    /* JADX INFO: renamed from: s */
    int mo16213s(N n2);

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.x9kr, com.google.common.graph.InterfaceC4618f
    Set<N> toq(N n2);

    @Override // com.google.common.graph.InterfaceC4648y
    Set<t8r<N>> x2(N n2);

    @Override // com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: y */
    ki<N> mo16196y();

    @Override // com.google.common.graph.InterfaceC4648y
    Set<t8r<N>> zy();
}
