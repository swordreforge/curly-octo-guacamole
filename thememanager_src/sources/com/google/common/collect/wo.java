package com.google.common.collect;

import com.google.common.collect.vy;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ForwardingSortedMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class wo<K, V> extends xwq3<K, V> implements SortedMap<K, V> {

    /* JADX INFO: renamed from: com.google.common.collect.wo$k */
    /* JADX INFO: compiled from: ForwardingSortedMap.java */
    @InterfaceC7731k
    protected class C4566k extends vy.jp0y<K, V> {
        public C4566k() {
            super(wo.this);
        }
    }

    protected wo() {
    }

    private int ld6(Object obj, Object obj2) {
        Comparator<? super K> comparator = comparator();
        return comparator == null ? ((Comparable) obj).compareTo(obj2) : comparator.compare(obj, obj2);
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return delegate().comparator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.xwq3, com.google.common.collect.qkj8
    public abstract SortedMap<K, V> delegate();

    @Override // java.util.SortedMap
    public K firstKey() {
        return delegate().firstKey();
    }

    public SortedMap<K, V> headMap(K k2) {
        return delegate().headMap(k2);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return delegate().lastKey();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.xwq3
    @InterfaceC7731k
    protected boolean standardContainsKey(@NullableDecl Object obj) {
        try {
            return ld6(tailMap(obj).firstKey(), obj) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
            return false;
        }
    }

    @InterfaceC7731k
    protected SortedMap<K, V> standardSubMap(K k2, K k3) {
        com.google.common.base.jk.m15380n(ld6(k2, k3) <= 0, "fromKey must be <= toKey");
        return tailMap(k2).headMap(k3);
    }

    public SortedMap<K, V> subMap(K k2, K k3) {
        return delegate().subMap(k2, k3);
    }

    public SortedMap<K, V> tailMap(K k2) {
        return delegate().tailMap(k2);
    }
}
