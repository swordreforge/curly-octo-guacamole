package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: Multimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public interface lw<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(@NullableDecl @CompatibleWith("K") Object obj, @NullableDecl @CompatibleWith("V") Object obj2);

    boolean containsKey(@NullableDecl @CompatibleWith("K") Object obj);

    boolean containsValue(@NullableDecl @CompatibleWith("V") Object obj);

    Collection<Map.Entry<K, V>> entries();

    boolean equals(@NullableDecl Object obj);

    Collection<V> get(@NullableDecl K k2);

    int hashCode();

    boolean isEmpty();

    Set<K> keySet();

    o05<K> keys();

    @CanIgnoreReturnValue
    boolean put(@NullableDecl K k2, @NullableDecl V v2);

    @CanIgnoreReturnValue
    boolean putAll(lw<? extends K, ? extends V> lwVar);

    @CanIgnoreReturnValue
    boolean putAll(@NullableDecl K k2, Iterable<? extends V> iterable);

    @CanIgnoreReturnValue
    boolean remove(@NullableDecl @CompatibleWith("K") Object obj, @NullableDecl @CompatibleWith("V") Object obj2);

    @CanIgnoreReturnValue
    Collection<V> removeAll(@NullableDecl @CompatibleWith("K") Object obj);

    @CanIgnoreReturnValue
    Collection<V> replaceValues(@NullableDecl K k2, Iterable<? extends V> iterable);

    int size();

    Collection<V> values();
}
