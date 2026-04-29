package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ForwardingListMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class dr<K, V> extends ikck<K, V> implements h4b<K, V> {
    protected dr() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ikck, com.google.common.collect.qkj8
    public abstract h4b<K, V> delegate();

    @Override // com.google.common.collect.ikck, com.google.common.collect.lw
    public List<V> get(@NullableDecl K k2) {
        return delegate().get((Object) k2);
    }

    @Override // com.google.common.collect.ikck, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public List<V> removeAll(@NullableDecl Object obj) {
        return delegate().removeAll(obj);
    }

    @Override // com.google.common.collect.ikck, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public List<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        return delegate().replaceValues((Object) k2, (Iterable) iterable);
    }
}
