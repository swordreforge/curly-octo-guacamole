package com.google.common.collect;

import com.google.common.collect.zkd;
import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ImmutableEnumMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
final class kcsr<K extends Enum<K>, V> extends zkd.zy<K, V> {

    /* JADX INFO: renamed from: y */
    private final transient EnumMap<K, V> f26275y;

    /* JADX INFO: compiled from: ImmutableEnumMap.java */
    private static class toq<K extends Enum<K>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final EnumMap<K, V> delegate;

        toq(EnumMap<K, V> enumMap) {
            this.delegate = enumMap;
        }

        Object readResolve() {
            return new kcsr(this.delegate);
        }
    }

    static <K extends Enum<K>, V> zkd<K, V> asImmutable(EnumMap<K, V> enumMap) {
        int size = enumMap.size();
        if (size == 0) {
            return zkd.of();
        }
        if (size != 1) {
            return new kcsr(enumMap);
        }
        Map.Entry entry = (Map.Entry) nsb.o1t(enumMap.entrySet());
        return zkd.of(entry.getKey(), entry.getValue());
    }

    @Override // com.google.common.collect.zkd, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return this.f26275y.containsKey(obj);
    }

    @Override // com.google.common.collect.zkd.zy
    ab<Map.Entry<K, V>> entryIterator() {
        return vy.tfm(this.f26275y.entrySet().iterator());
    }

    @Override // com.google.common.collect.zkd, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kcsr) {
            obj = ((kcsr) obj).f26275y;
        }
        return this.f26275y.equals(obj);
    }

    @Override // com.google.common.collect.zkd, java.util.Map
    public V get(Object obj) {
        return this.f26275y.get(obj);
    }

    @Override // com.google.common.collect.zkd
    boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.zkd
    ab<K> keyIterator() {
        return zwy.ek5k(this.f26275y.keySet().iterator());
    }

    @Override // java.util.Map
    public int size() {
        return this.f26275y.size();
    }

    @Override // com.google.common.collect.zkd
    Object writeReplace() {
        return new toq(this.f26275y);
    }

    private kcsr(EnumMap<K, V> enumMap) {
        this.f26275y = enumMap;
        com.google.common.base.jk.m15383q(!enumMap.isEmpty());
    }
}
