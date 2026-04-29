package com.google.common.graph;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Set;

/* JADX INFO: renamed from: com.google.common.graph.r */
/* JADX INFO: compiled from: NetworkConnections.java */
/* JADX INFO: loaded from: classes2.dex */
interface InterfaceC4642r<N, E> {
    Set<E> f7l8();

    /* JADX INFO: renamed from: g */
    void mo16223g(E e2, N n2, boolean z2);

    /* JADX INFO: renamed from: k */
    Set<N> mo16224k();

    Set<E> ld6();

    /* JADX INFO: renamed from: n */
    void mo16225n(E e2, N n2);

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: p */
    N mo16226p(E e2);

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: q */
    N mo16227q(E e2, boolean z2);

    /* JADX INFO: renamed from: s */
    Set<E> mo16228s();

    Set<N> toq();

    Set<E> x2(N n2);

    /* JADX INFO: renamed from: y */
    N mo16229y(E e2);

    Set<N> zy();
}
