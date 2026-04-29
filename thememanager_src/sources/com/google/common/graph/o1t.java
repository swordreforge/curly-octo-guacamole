package com.google.common.graph;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: GraphConnections.java */
/* JADX INFO: loaded from: classes2.dex */
interface o1t<N, V> {
    @CanIgnoreReturnValue
    V f7l8(N n2, V v2);

    /* JADX INFO: renamed from: g */
    void mo16253g(N n2);

    /* JADX INFO: renamed from: k */
    Set<N> mo16254k();

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: n */
    V mo16255n(N n2);

    @NullableDecl
    /* JADX INFO: renamed from: q */
    V mo16256q(N n2);

    Set<N> toq();

    /* JADX INFO: renamed from: y */
    void mo16257y(N n2, V v2);

    Set<N> zy();
}
