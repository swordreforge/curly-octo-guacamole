package com.google.common.graph;

import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Network.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public interface d2ok<N, E> extends x9kr<N>, dd<N> {
    t8r<N> a9(E e2);

    boolean equals(@NullableDecl Object obj);

    int f7l8(N n2);

    Set<E> fn3e(N n2);

    boolean fu4();

    /* JADX INFO: renamed from: g */
    boolean mo16204g(t8r<N> t8rVar);

    @NullableDecl
    E gvn7(t8r<N> t8rVar);

    int hashCode();

    @NullableDecl
    E jk(N n2, N n3);

    ki<E> jp0y();

    @Override // com.google.common.graph.dd, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: k */
    Set<N> mo16192k(N n2);

    Set<N> ld6(N n2);

    Set<E> mcp(t8r<N> t8rVar);

    /* JADX INFO: renamed from: n */
    boolean mo16205n();

    int n7h(N n2);

    Set<E> ni7(N n2, N n3);

    Set<E> oc(N n2);

    /* JADX INFO: renamed from: p */
    boolean mo16206p();

    /* JADX INFO: renamed from: q */
    boolean mo16207q(N n2, N n3);

    Set<N> qrj();

    /* JADX INFO: renamed from: s */
    int mo16208s(N n2);

    fu4<N> t8r();

    @Override // com.google.common.graph.x9kr, com.google.common.graph.InterfaceC4618f
    Set<N> toq(N n2);

    Set<E> x2(N n2);

    /* JADX INFO: renamed from: y */
    ki<N> mo16209y();

    Set<E> zurt(E e2);

    Set<E> zy();
}
