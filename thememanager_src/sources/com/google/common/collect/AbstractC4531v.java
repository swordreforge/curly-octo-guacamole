package com.google.common.collect;

import com.google.common.base.C4280z;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.collect.v */
/* JADX INFO: compiled from: ForwardingMapEntry.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class AbstractC4531v<K, V> extends qkj8 implements Map.Entry<K, V> {
    protected AbstractC4531v() {
    }

    public boolean equals(@NullableDecl Object obj) {
        return delegate().equals(obj);
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return delegate().getKey();
    }

    public V getValue() {
        return delegate().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return delegate().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.qkj8
    /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
    public abstract Map.Entry<K, V> delegate();

    public V setValue(V v2) {
        return delegate().setValue(v2);
    }

    protected boolean standardEquals(@NullableDecl Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C4280z.m15455k(getKey(), entry.getKey()) && C4280z.m15455k(getValue(), entry.getValue());
    }

    protected int standardHashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @InterfaceC7731k
    protected String standardToString() {
        return getKey() + "=" + getValue();
    }
}
