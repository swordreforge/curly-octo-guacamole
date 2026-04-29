package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: Table.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public interface qh4d<R, C, V> {

    /* JADX INFO: renamed from: com.google.common.collect.qh4d$k */
    /* JADX INFO: compiled from: Table.java */
    public interface InterfaceC4517k<R, C, V> {
        boolean equals(@NullableDecl Object obj);

        @NullableDecl
        C getColumnKey();

        @NullableDecl
        R getRowKey();

        @NullableDecl
        V getValue();

        int hashCode();
    }

    Set<InterfaceC4517k<R, C, V>> cellSet();

    void clear();

    Map<R, V> column(C c2);

    Set<C> columnKeySet();

    Map<C, Map<R, V>> columnMap();

    boolean contains(@NullableDecl @CompatibleWith("R") Object obj, @NullableDecl @CompatibleWith(com.market.sdk.reflect.toq.f28134q) Object obj2);

    boolean containsColumn(@NullableDecl @CompatibleWith(com.market.sdk.reflect.toq.f28134q) Object obj);

    boolean containsRow(@NullableDecl @CompatibleWith("R") Object obj);

    boolean containsValue(@NullableDecl @CompatibleWith("V") Object obj);

    boolean equals(@NullableDecl Object obj);

    V get(@NullableDecl @CompatibleWith("R") Object obj, @NullableDecl @CompatibleWith(com.market.sdk.reflect.toq.f28134q) Object obj2);

    int hashCode();

    boolean isEmpty();

    @CanIgnoreReturnValue
    @NullableDecl
    V put(R r2, C c2, V v2);

    void putAll(qh4d<? extends R, ? extends C, ? extends V> qh4dVar);

    @CanIgnoreReturnValue
    @NullableDecl
    V remove(@NullableDecl @CompatibleWith("R") Object obj, @NullableDecl @CompatibleWith(com.market.sdk.reflect.toq.f28134q) Object obj2);

    Map<C, V> row(R r2);

    Set<R> rowKeySet();

    Map<R, Map<C, V>> rowMap();

    int size();

    Collection<V> values();
}
