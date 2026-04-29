package com.google.common.collect;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: DescendingImmutableSortedSet.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
final class hyr<E> extends ixz<E> {
    private final ixz<E> forward;

    hyr(ixz<E> ixzVar) {
        super(kx3.from(ixzVar.comparator()).reverse());
        this.forward = ixzVar;
    }

    @Override // com.google.common.collect.ixz, java.util.NavigableSet
    public E ceiling(E e2) {
        return this.forward.floor(e2);
    }

    @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public boolean contains(@NullableDecl Object obj) {
        return this.forward.contains(obj);
    }

    @Override // com.google.common.collect.ixz
    @wlev.zy("NavigableSet")
    ixz<E> createDescendingSet() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ixz, java.util.NavigableSet
    public E floor(E e2) {
        return this.forward.ceiling(e2);
    }

    @Override // com.google.common.collect.ixz
    ixz<E> headSetImpl(E e2, boolean z2) {
        return this.forward.tailSet((Object) e2, z2).descendingSet();
    }

    @Override // com.google.common.collect.ixz, java.util.NavigableSet
    public E higher(E e2) {
        return this.forward.lower(e2);
    }

    @Override // com.google.common.collect.ixz
    int indexOf(@NullableDecl Object obj) {
        int iIndexOf = this.forward.indexOf(obj);
        return iIndexOf == -1 ? iIndexOf : (size() - 1) - iIndexOf;
    }

    @Override // com.google.common.collect.z4
    boolean isPartialView() {
        return this.forward.isPartialView();
    }

    @Override // com.google.common.collect.ixz, java.util.NavigableSet
    public E lower(E e2) {
        return this.forward.higher(e2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.forward.size();
    }

    @Override // com.google.common.collect.ixz
    ixz<E> subSetImpl(E e2, boolean z2, E e3, boolean z3) {
        return this.forward.subSet((Object) e3, z3, (Object) e2, z2).descendingSet();
    }

    @Override // com.google.common.collect.ixz
    ixz<E> tailSetImpl(E e2, boolean z2) {
        return this.forward.headSet((Object) e2, z2).descendingSet();
    }

    @Override // com.google.common.collect.ixz, java.util.NavigableSet
    @wlev.zy("NavigableSet")
    public ab<E> descendingIterator() {
        return this.forward.iterator();
    }

    @Override // com.google.common.collect.ixz, java.util.NavigableSet
    @wlev.zy("NavigableSet")
    public ixz<E> descendingSet() {
        return this.forward;
    }

    @Override // com.google.common.collect.ixz, com.google.common.collect.vep5, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
    public ab<E> iterator() {
        return this.forward.descendingIterator();
    }
}
