package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: EmptyContiguousSet.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
final class lrht<C extends Comparable> extends dd<C> {

    /* JADX INFO: compiled from: EmptyContiguousSet.java */
    @wlev.zy
    private static final class toq<C extends Comparable> implements Serializable {
        private static final long serialVersionUID = 0;
        private final AbstractC4324c<C> domain;

        private Object readResolve() {
            return new lrht(this.domain);
        }

        private toq(AbstractC4324c<C> abstractC4324c) {
            this.domain = abstractC4324c;
        }
    }

    lrht(AbstractC4324c<C> abstractC4324c) {
        super(abstractC4324c);
    }

    @Override // com.google.common.collect.vep5, com.google.common.collect.z4
    public se<C> asList() {
        return se.of();
    }

    @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public boolean contains(Object obj) {
        return false;
    }

    @Override // com.google.common.collect.dd, com.google.common.collect.ixz
    @wlev.zy
    ixz<C> createDescendingSet() {
        return ixz.emptySet(kx3.natural().reverse());
    }

    @Override // com.google.common.collect.vep5, java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    @Override // com.google.common.collect.vep5, java.util.Collection, java.util.Set
    public int hashCode() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.dd, com.google.common.collect.ixz
    public dd<C> headSetImpl(C c2, boolean z2) {
        return this;
    }

    @Override // com.google.common.collect.ixz
    @wlev.zy
    int indexOf(Object obj) {
        return -1;
    }

    @Override // com.google.common.collect.dd
    public dd<C> intersection(dd<C> ddVar) {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return true;
    }

    @Override // com.google.common.collect.vep5
    @wlev.zy
    boolean isHashCodeFast() {
        return true;
    }

    @Override // com.google.common.collect.z4
    boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.dd
    public ps<C> range() {
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.dd, com.google.common.collect.ixz
    public dd<C> subSetImpl(C c2, boolean z2, C c3, boolean z3) {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.dd, com.google.common.collect.ixz
    public dd<C> tailSetImpl(C c2, boolean z2) {
        return this;
    }

    @Override // com.google.common.collect.dd, java.util.AbstractCollection
    public String toString() {
        return okhttp3.zurt.f43629h;
    }

    @Override // com.google.common.collect.ixz, com.google.common.collect.vep5, com.google.common.collect.z4
    @wlev.zy
    Object writeReplace() {
        return new toq(this.domain);
    }

    @Override // com.google.common.collect.ixz, java.util.NavigableSet
    @wlev.zy
    public ab<C> descendingIterator() {
        return zwy.fn3e();
    }

    @Override // com.google.common.collect.ixz, java.util.SortedSet
    public C first() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ixz, com.google.common.collect.vep5, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
    public ab<C> iterator() {
        return zwy.fn3e();
    }

    @Override // com.google.common.collect.ixz, java.util.SortedSet
    public C last() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.dd
    public ps<C> range(fu4 fu4Var, fu4 fu4Var2) {
        throw new NoSuchElementException();
    }
}
