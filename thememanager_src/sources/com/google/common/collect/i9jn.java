package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: HashBasedTable.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(serializable = true)
public class i9jn<R, C, V> extends ovdh<R, C, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: com.google.common.collect.i9jn$k */
    /* JADX INFO: compiled from: HashBasedTable.java */
    private static class C4413k<C, V> implements com.google.common.base.lvui<Map<C, V>>, Serializable {
        private static final long serialVersionUID = 0;
        final int expectedSize;

        C4413k(int i2) {
            this.expectedSize = i2;
        }

        @Override // com.google.common.base.lvui
        public Map<C, V> get() {
            return vy.m16020m(this.expectedSize);
        }
    }

    i9jn(Map<R, Map<C, V>> map, C4413k<C, V> c4413k) {
        super(map, c4413k);
    }

    public static <R, C, V> i9jn<R, C, V> create() {
        return new i9jn<>(new LinkedHashMap(), new C4413k(0));
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ Set cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ovdh, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return super.column(obj);
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return super.columnKeySet();
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ Map columnMap() {
        return super.columnMap();
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.contains(obj, obj2);
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public boolean containsColumn(@NullableDecl Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public boolean containsRow(@NullableDecl Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public boolean containsValue(@NullableDecl Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return (V) super.get(obj, obj2);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2, Object obj3) {
        return super.put(obj, obj2, obj3);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ void putAll(qh4d qh4dVar) {
        super.putAll(qh4dVar);
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return (V) super.remove(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ovdh, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ Map row(Object obj) {
        return super.row(obj);
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ Set rowKeySet() {
        return super.rowKeySet();
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ Map rowMap() {
        return super.rowMap();
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.cdj
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <R, C, V> i9jn<R, C, V> create(int i2, int i3) {
        C4524t.toq(i3, "expectedCellsPerRow");
        return new i9jn<>(vy.m16020m(i2), new C4413k(i3));
    }

    public static <R, C, V> i9jn<R, C, V> create(qh4d<? extends R, ? extends C, ? extends V> qh4dVar) {
        i9jn<R, C, V> i9jnVarCreate = create();
        i9jnVarCreate.putAll(qh4dVar);
        return i9jnVarCreate;
    }
}
