package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ReverseOrdering.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(serializable = true)
final class yp31<T> extends kx3<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final kx3<? super T> forwardOrder;

    yp31(kx3<? super T> kx3Var) {
        this.forwardOrder = (kx3) com.google.common.base.jk.a9(kx3Var);
    }

    @Override // com.google.common.collect.kx3, java.util.Comparator
    public int compare(T t2, T t3) {
        return this.forwardOrder.compare(t3, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yp31) {
            return this.forwardOrder.equals(((yp31) obj).forwardOrder);
        }
        return false;
    }

    public int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    @Override // com.google.common.collect.kx3
    public <E extends T> E max(E e2, E e3) {
        return (E) this.forwardOrder.min(e2, e3);
    }

    @Override // com.google.common.collect.kx3
    public <E extends T> E min(E e2, E e3) {
        return (E) this.forwardOrder.max(e2, e3);
    }

    @Override // com.google.common.collect.kx3
    public <S extends T> kx3<S> reverse() {
        return this.forwardOrder;
    }

    public String toString() {
        return this.forwardOrder + ".reverse()";
    }

    @Override // com.google.common.collect.kx3
    public <E extends T> E max(E e2, E e3, E e4, E... eArr) {
        return (E) this.forwardOrder.min(e2, e3, e4, eArr);
    }

    @Override // com.google.common.collect.kx3
    public <E extends T> E min(E e2, E e3, E e4, E... eArr) {
        return (E) this.forwardOrder.max(e2, e3, e4, eArr);
    }

    @Override // com.google.common.collect.kx3
    public <E extends T> E max(Iterator<E> it) {
        return (E) this.forwardOrder.min(it);
    }

    @Override // com.google.common.collect.kx3
    public <E extends T> E min(Iterator<E> it) {
        return (E) this.forwardOrder.max(it);
    }

    @Override // com.google.common.collect.kx3
    public <E extends T> E max(Iterable<E> iterable) {
        return (E) this.forwardOrder.min(iterable);
    }

    @Override // com.google.common.collect.kx3
    public <E extends T> E min(Iterable<E> iterable) {
        return (E) this.forwardOrder.max(iterable);
    }
}
