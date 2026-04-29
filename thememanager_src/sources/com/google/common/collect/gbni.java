package com.google.common.collect;

import com.google.common.collect.qh4d;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: ForwardingTable.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class gbni<R, C, V> extends qkj8 implements qh4d<R, C, V> {
    protected gbni() {
    }

    @Override // com.google.common.collect.qh4d
    public Set<qh4d.InterfaceC4517k<R, C, V>> cellSet() {
        return delegate().cellSet();
    }

    @Override // com.google.common.collect.qh4d
    public void clear() {
        delegate().clear();
    }

    @Override // com.google.common.collect.qh4d
    public Map<R, V> column(C c2) {
        return delegate().column(c2);
    }

    @Override // com.google.common.collect.qh4d
    public Set<C> columnKeySet() {
        return delegate().columnKeySet();
    }

    @Override // com.google.common.collect.qh4d
    public Map<C, Map<R, V>> columnMap() {
        return delegate().columnMap();
    }

    @Override // com.google.common.collect.qh4d
    public boolean contains(Object obj, Object obj2) {
        return delegate().contains(obj, obj2);
    }

    @Override // com.google.common.collect.qh4d
    public boolean containsColumn(Object obj) {
        return delegate().containsColumn(obj);
    }

    @Override // com.google.common.collect.qh4d
    public boolean containsRow(Object obj) {
        return delegate().containsRow(obj);
    }

    @Override // com.google.common.collect.qh4d
    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.qkj8
    public abstract qh4d<R, C, V> delegate();

    @Override // com.google.common.collect.qh4d
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // com.google.common.collect.qh4d
    public V get(Object obj, Object obj2) {
        return delegate().get(obj, obj2);
    }

    @Override // com.google.common.collect.qh4d
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // com.google.common.collect.qh4d
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @Override // com.google.common.collect.qh4d
    @CanIgnoreReturnValue
    public V put(R r2, C c2, V v2) {
        return delegate().put(r2, c2, v2);
    }

    @Override // com.google.common.collect.qh4d
    public void putAll(qh4d<? extends R, ? extends C, ? extends V> qh4dVar) {
        delegate().putAll(qh4dVar);
    }

    @Override // com.google.common.collect.qh4d
    @CanIgnoreReturnValue
    public V remove(Object obj, Object obj2) {
        return delegate().remove(obj, obj2);
    }

    @Override // com.google.common.collect.qh4d
    public Map<C, V> row(R r2) {
        return delegate().row(r2);
    }

    @Override // com.google.common.collect.qh4d
    public Set<R> rowKeySet() {
        return delegate().rowKeySet();
    }

    @Override // com.google.common.collect.qh4d
    public Map<R, Map<C, V>> rowMap() {
        return delegate().rowMap();
    }

    @Override // com.google.common.collect.qh4d
    public int size() {
        return delegate().size();
    }

    @Override // com.google.common.collect.qh4d
    public Collection<V> values() {
        return delegate().values();
    }
}
