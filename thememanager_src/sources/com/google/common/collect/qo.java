package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ForwardingSet.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class qo<E> extends AbstractC4572x<E> implements Set<E> {
    protected qo() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
    public abstract Set<E> delegate();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return delegate().hashCode();
    }

    protected boolean standardEquals(@NullableDecl Object obj) {
        return g0ad.f7l8(this, obj);
    }

    protected int standardHashCode() {
        return g0ad.ld6(this);
    }

    @Override // com.google.common.collect.AbstractC4572x
    protected boolean standardRemoveAll(Collection<?> collection) {
        return g0ad.d3(this, (Collection) com.google.common.base.jk.a9(collection));
    }
}
