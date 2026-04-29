package com.google.common.graph;

import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.graph.f */
/* JADX INFO: compiled from: ValueGraph.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public interface InterfaceC4618f<N, V> extends InterfaceC4648y<N> {
    boolean equals(@NullableDecl Object obj);

    @Override // com.google.common.graph.InterfaceC4648y
    int f7l8(N n2);

    /* JADX INFO: renamed from: g */
    boolean mo16190g(t8r<N> t8rVar);

    int hashCode();

    @NullableDecl
    /* JADX INFO: renamed from: i */
    V mo16191i(t8r<N> t8rVar, @NullableDecl V v2);

    /* JADX INFO: renamed from: k */
    Set<N> mo16192k(N n2);

    Set<N> ld6(N n2);

    /* JADX INFO: renamed from: n */
    boolean mo16193n();

    @Override // com.google.common.graph.InterfaceC4648y
    int n7h(N n2);

    /* JADX INFO: renamed from: p */
    boolean mo16194p();

    /* JADX INFO: renamed from: q */
    boolean mo16195q(N n2, N n3);

    Set<N> qrj();

    @Override // com.google.common.graph.InterfaceC4648y
    /* JADX INFO: renamed from: s */
    int mo16213s(N n2);

    fu4<N> t8r();

    Set<N> toq(N n2);

    @Override // com.google.common.graph.InterfaceC4648y
    Set<t8r<N>> x2(N n2);

    /* JADX INFO: renamed from: y */
    ki<N> mo16196y();

    @NullableDecl
    /* JADX INFO: renamed from: z */
    V mo16197z(N n2, N n3, @NullableDecl V v2);

    @Override // com.google.common.graph.InterfaceC4648y
    Set<t8r<N>> zy();
}
