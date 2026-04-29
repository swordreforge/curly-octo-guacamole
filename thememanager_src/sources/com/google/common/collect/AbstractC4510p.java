package com.google.common.collect;

import com.google.common.collect.vy;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.collect.p */
/* JADX INFO: compiled from: AbstractNavigableMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
abstract class AbstractC4510p<K, V> extends vy.wvg<K, V> implements NavigableMap<K, V> {

    /* JADX INFO: renamed from: com.google.common.collect.p$toq */
    /* JADX INFO: compiled from: AbstractNavigableMap.java */
    private final class toq extends vy.cdj<K, V> {
        private toq() {
        }

        @Override // com.google.common.collect.vy.cdj
        NavigableMap<K, V> kja0() {
            return AbstractC4510p.this;
        }

        @Override // com.google.common.collect.vy.cdj
        Iterator<Map.Entry<K, V>> x2() {
            return AbstractC4510p.this.toq();
        }
    }

    AbstractC4510p() {
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> ceilingEntry(K k2) {
        return tailMap(k2, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k2) {
        return (K) vy.hyr(ceilingEntry(k2));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return new toq();
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> firstEntry() {
        return (Map.Entry) zwy.oc(mo15684k(), null);
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        Map.Entry<K, V> entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> floorEntry(K k2) {
        return headMap(k2, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k2) {
        return (K) vy.hyr(floorEntry(k2));
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> headMap(K k2) {
        return headMap(k2, false);
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> higherEntry(K k2) {
        return tailMap(k2, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k2) {
        return (K) vy.hyr(higherEntry(k2));
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set<K> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> lastEntry() {
        return (Map.Entry) zwy.oc(toq(), null);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        Map.Entry<K, V> entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> lowerEntry(K k2) {
        return headMap(k2, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k2) {
        return (K) vy.hyr(lowerEntry(k2));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return new vy.a9(this);
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> pollFirstEntry() {
        return (Map.Entry) zwy.m16120f(mo15684k());
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> pollLastEntry() {
        return (Map.Entry) zwy.m16120f(toq());
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> subMap(K k2, K k3) {
        return subMap(k2, true, k3, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> tailMap(K k2) {
        return tailMap(k2, true);
    }

    abstract Iterator<Map.Entry<K, V>> toq();
}
