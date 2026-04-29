package com.google.common.collect;

import com.google.common.base.C4280z;
import com.google.common.collect.vy;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ForwardingMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class xwq3<K, V> extends qkj8 implements Map<K, V> {

    /* JADX INFO: renamed from: com.google.common.collect.xwq3$k */
    /* JADX INFO: compiled from: ForwardingMap.java */
    @InterfaceC7731k
    protected abstract class AbstractC4573k extends vy.t8r<K, V> {
        public AbstractC4573k() {
        }

        @Override // com.google.common.collect.vy.t8r
        /* JADX INFO: renamed from: k */
        Map<K, V> mo15823k() {
            return xwq3.this;
        }
    }

    /* JADX INFO: compiled from: ForwardingMap.java */
    @InterfaceC7731k
    protected class toq extends vy.C4550t<K, V> {
        public toq() {
            super(xwq3.this);
        }
    }

    /* JADX INFO: compiled from: ForwardingMap.java */
    @InterfaceC7731k
    protected class zy extends vy.ncyb<K, V> {
        public zy() {
            super(xwq3.this);
        }
    }

    protected xwq3() {
    }

    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return delegate().containsValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.qkj8
    public abstract Map<K, V> delegate();

    public Set<Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(@NullableDecl Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public V get(@NullableDecl Object obj) {
        return delegate().get(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    @CanIgnoreReturnValue
    public V put(K k2, V v2) {
        return delegate().put(k2, v2);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    @CanIgnoreReturnValue
    public V remove(Object obj) {
        return delegate().remove(obj);
    }

    public int size() {
        return delegate().size();
    }

    protected void standardClear() {
        zwy.m16135y(entrySet().iterator());
    }

    @InterfaceC7731k
    protected boolean standardContainsKey(@NullableDecl Object obj) {
        return vy.cdj(this, obj);
    }

    protected boolean standardContainsValue(@NullableDecl Object obj) {
        return vy.ki(this, obj);
    }

    protected boolean standardEquals(@NullableDecl Object obj) {
        return vy.ni7(this, obj);
    }

    protected int standardHashCode() {
        return g0ad.ld6(entrySet());
    }

    protected boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    protected void standardPutAll(Map<? extends K, ? extends V> map) {
        vy.bf2(this, map);
    }

    @InterfaceC7731k
    protected V standardRemove(@NullableDecl Object obj) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (C4280z.m15455k(next.getKey(), obj)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    protected String standardToString() {
        return vy.c8jq(this);
    }

    public Collection<V> values() {
        return delegate().values();
    }
}
