package com.google.common.collect;

import com.google.errorprone.annotations.concurrent.LazyInit;

/* JADX INFO: compiled from: SingletonImmutableSet.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
final class imd<E> extends vep5<E> {
    final transient E element;

    /* JADX INFO: renamed from: y */
    @LazyInit
    private transient int f26222y;

    imd(E e2) {
        this.element = (E) com.google.common.base.jk.a9(e2);
    }

    @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public boolean contains(Object obj) {
        return this.element.equals(obj);
    }

    @Override // com.google.common.collect.z4
    int copyIntoArray(Object[] objArr, int i2) {
        objArr[i2] = this.element;
        return i2 + 1;
    }

    @Override // com.google.common.collect.vep5
    se<E> createAsList() {
        return se.of((Object) this.element);
    }

    @Override // com.google.common.collect.vep5, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i2 = this.f26222y;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = this.element.hashCode();
        this.f26222y = iHashCode;
        return iHashCode;
    }

    @Override // com.google.common.collect.vep5
    boolean isHashCodeFast() {
        return this.f26222y != 0;
    }

    @Override // com.google.common.collect.z4
    boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.element.toString() + ']';
    }

    @Override // com.google.common.collect.vep5, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
    public ab<E> iterator() {
        return zwy.vyq(this.element);
    }

    imd(E e2, int i2) {
        this.element = e2;
        this.f26222y = i2;
    }
}
