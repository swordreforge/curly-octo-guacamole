package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ForwardingMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class ikck<K, V> extends qkj8 implements lw<K, V> {
    protected ikck() {
    }

    @Override // com.google.common.collect.lw, com.google.common.collect.h4b
    public Map<K, Collection<V>> asMap() {
        return delegate().asMap();
    }

    @Override // com.google.common.collect.lw
    public void clear() {
        delegate().clear();
    }

    @Override // com.google.common.collect.lw
    public boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return delegate().containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.lw
    public boolean containsKey(@NullableDecl Object obj) {
        return delegate().containsKey(obj);
    }

    @Override // com.google.common.collect.lw
    public boolean containsValue(@NullableDecl Object obj) {
        return delegate().containsValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.qkj8
    public abstract lw<K, V> delegate();

    @Override // com.google.common.collect.lw
    public Collection<Map.Entry<K, V>> entries() {
        return delegate().entries();
    }

    @Override // com.google.common.collect.lw, com.google.common.collect.h4b
    public boolean equals(@NullableDecl Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public Collection<V> get(@NullableDecl K k2) {
        return delegate().get(k2);
    }

    @Override // com.google.common.collect.lw
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // com.google.common.collect.lw
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @Override // com.google.common.collect.lw
    public Set<K> keySet() {
        return delegate().keySet();
    }

    @Override // com.google.common.collect.lw
    public o05<K> keys() {
        return delegate().keys();
    }

    @Override // com.google.common.collect.lw
    @CanIgnoreReturnValue
    public boolean put(K k2, V v2) {
        return delegate().put(k2, v2);
    }

    @Override // com.google.common.collect.lw
    @CanIgnoreReturnValue
    public boolean putAll(K k2, Iterable<? extends V> iterable) {
        return delegate().putAll(k2, iterable);
    }

    @Override // com.google.common.collect.lw
    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return delegate().remove(obj, obj2);
    }

    @CanIgnoreReturnValue
    public Collection<V> removeAll(@NullableDecl Object obj) {
        return delegate().removeAll(obj);
    }

    @CanIgnoreReturnValue
    public Collection<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        return delegate().replaceValues(k2, iterable);
    }

    @Override // com.google.common.collect.lw
    public int size() {
        return delegate().size();
    }

    @Override // com.google.common.collect.lw
    public Collection<V> values() {
        return delegate().values();
    }

    @Override // com.google.common.collect.lw
    @CanIgnoreReturnValue
    public boolean putAll(lw<? extends K, ? extends V> lwVar) {
        return delegate().putAll(lwVar);
    }
}
