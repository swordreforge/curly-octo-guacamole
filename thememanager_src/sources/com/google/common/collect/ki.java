package com.google.common.collect;

import java.io.Serializable;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: AllEqualOrdering.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(serializable = true)
final class ki extends kx3<Object> implements Serializable {
    static final ki INSTANCE = new ki();
    private static final long serialVersionUID = 0;

    ki() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // com.google.common.collect.kx3, java.util.Comparator
    public int compare(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return 0;
    }

    @Override // com.google.common.collect.kx3
    public <E> se<E> immutableSortedCopy(Iterable<E> iterable) {
        return se.copyOf(iterable);
    }

    @Override // com.google.common.collect.kx3
    public <S> kx3<S> reverse() {
        return this;
    }

    @Override // com.google.common.collect.kx3
    public <E> List<E> sortedCopy(Iterable<E> iterable) {
        return wlev.ki(iterable);
    }

    public String toString() {
        return "Ordering.allEqual()";
    }
}
