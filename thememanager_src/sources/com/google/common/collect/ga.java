package com.google.common.collect;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: MapDifference.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public interface ga<K, V> {

    /* JADX INFO: renamed from: com.google.common.collect.ga$k */
    /* JADX INFO: compiled from: MapDifference.java */
    public interface InterfaceC4387k<V> {
        boolean equals(@NullableDecl Object obj);

        int hashCode();

        /* JADX INFO: renamed from: k */
        V mo15709k();

        V toq();
    }

    boolean equals(@NullableDecl Object obj);

    int hashCode();

    /* JADX INFO: renamed from: k */
    Map<K, V> mo15706k();

    /* JADX INFO: renamed from: n */
    boolean mo15707n();

    /* JADX INFO: renamed from: q */
    Map<K, V> mo15708q();

    Map<K, V> toq();

    Map<K, InterfaceC4387k<V>> zy();
}
