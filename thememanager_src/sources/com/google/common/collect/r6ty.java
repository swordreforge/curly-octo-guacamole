package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: compiled from: ReverseNaturalOrdering.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(serializable = true)
final class r6ty extends kx3<Comparable> implements Serializable {
    static final r6ty INSTANCE = new r6ty();
    private static final long serialVersionUID = 0;

    private r6ty() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // com.google.common.collect.kx3
    public <S extends Comparable> kx3<S> reverse() {
        return kx3.natural();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // com.google.common.collect.kx3, java.util.Comparator
    public int compare(Comparable comparable, Comparable comparable2) {
        com.google.common.base.jk.a9(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.google.common.collect.kx3
    public <E extends Comparable> E max(E e2, E e3) {
        return (E) b9ub.INSTANCE.min(e2, e3);
    }

    @Override // com.google.common.collect.kx3
    public <E extends Comparable> E min(E e2, E e3) {
        return (E) b9ub.INSTANCE.max(e2, e3);
    }

    @Override // com.google.common.collect.kx3
    public <E extends Comparable> E max(E e2, E e3, E e4, E... eArr) {
        return (E) b9ub.INSTANCE.min(e2, e3, e4, eArr);
    }

    @Override // com.google.common.collect.kx3
    public <E extends Comparable> E min(E e2, E e3, E e4, E... eArr) {
        return (E) b9ub.INSTANCE.max(e2, e3, e4, eArr);
    }

    @Override // com.google.common.collect.kx3
    public <E extends Comparable> E max(Iterator<E> it) {
        return (E) b9ub.INSTANCE.min(it);
    }

    @Override // com.google.common.collect.kx3
    public <E extends Comparable> E min(Iterator<E> it) {
        return (E) b9ub.INSTANCE.max(it);
    }

    @Override // com.google.common.collect.kx3
    public <E extends Comparable> E max(Iterable<E> iterable) {
        return (E) b9ub.INSTANCE.min(iterable);
    }

    @Override // com.google.common.collect.kx3
    public <E extends Comparable> E min(Iterable<E> iterable) {
        return (E) b9ub.INSTANCE.max(iterable);
    }
}
