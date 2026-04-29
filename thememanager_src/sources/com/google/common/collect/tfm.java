package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ForwardingSetMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class tfm<K, V> extends ikck<K, V> implements wt<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ikck, com.google.common.collect.qkj8
    public abstract wt<K, V> delegate();

    @Override // com.google.common.collect.ikck, com.google.common.collect.lw
    public Set<Map.Entry<K, V>> entries() {
        return delegate().entries();
    }

    @Override // com.google.common.collect.ikck, com.google.common.collect.lw
    public Set<V> get(@NullableDecl K k2) {
        return delegate().get((Object) k2);
    }

    @Override // com.google.common.collect.ikck, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public Set<V> removeAll(@NullableDecl Object obj) {
        return delegate().removeAll(obj);
    }

    @Override // com.google.common.collect.ikck, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public Set<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        return delegate().replaceValues((Object) k2, (Iterable) iterable);
    }
}
