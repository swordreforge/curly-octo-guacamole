package com.google.common.collect;

import com.google.common.collect.m58i;
import com.google.common.collect.o05;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.collect.s */
/* JADX INFO: compiled from: AbstractMultiset.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
abstract class AbstractC4519s<E> extends AbstractCollection<E> implements o05<E> {

    /* JADX INFO: renamed from: k */
    @MonotonicNonNullDecl
    private transient Set<E> f26583k;

    /* JADX INFO: renamed from: q */
    @MonotonicNonNullDecl
    private transient Set<o05.InterfaceC4482k<E>> f26584q;

    /* JADX INFO: renamed from: com.google.common.collect.s$k */
    /* JADX INFO: compiled from: AbstractMultiset.java */
    class k extends m58i.AbstractC4459y<E> {
        k() {
        }

        @Override // com.google.common.collect.m58i.AbstractC4459y, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return AbstractC4519s.this.elementIterator();
        }

        @Override // com.google.common.collect.m58i.AbstractC4459y
        /* JADX INFO: renamed from: k */
        o05<E> mo15598k() {
            return AbstractC4519s.this;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.s$toq */
    /* JADX INFO: compiled from: AbstractMultiset.java */
    class toq extends m58i.AbstractC4457s<E> {
        toq() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<o05.InterfaceC4482k<E>> iterator() {
            return AbstractC4519s.this.entryIterator();
        }

        @Override // com.google.common.collect.m58i.AbstractC4457s
        /* JADX INFO: renamed from: k */
        o05<E> mo15679k() {
            return AbstractC4519s.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC4519s.this.distinctElements();
        }
    }

    AbstractC4519s() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    @CanIgnoreReturnValue
    public final boolean add(@NullableDecl E e2) {
        add(e2, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean addAll(Collection<? extends E> collection) {
        return m58i.zy(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public boolean contains(@NullableDecl Object obj) {
        return count(obj) > 0;
    }

    Set<E> createElementSet() {
        return new k();
    }

    Set<o05.InterfaceC4482k<E>> createEntrySet() {
        return new toq();
    }

    abstract int distinctElements();

    abstract Iterator<E> elementIterator();

    public Set<E> elementSet() {
        Set<E> set = this.f26583k;
        if (set != null) {
            return set;
        }
        Set<E> setCreateElementSet = createElementSet();
        this.f26583k = setCreateElementSet;
        return setCreateElementSet;
    }

    abstract Iterator<o05.InterfaceC4482k<E>> entryIterator();

    public Set<o05.InterfaceC4482k<E>> entrySet() {
        Set<o05.InterfaceC4482k<E>> set = this.f26584q;
        if (set != null) {
            return set;
        }
        Set<o05.InterfaceC4482k<E>> setCreateEntrySet = createEntrySet();
        this.f26584q = setCreateEntrySet;
        return setCreateEntrySet;
    }

    @Override // java.util.Collection, com.google.common.collect.o05
    public final boolean equals(@NullableDecl Object obj) {
        return m58i.m15840s(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.o05
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    @CanIgnoreReturnValue
    public final boolean remove(@NullableDecl Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    @CanIgnoreReturnValue
    public final boolean removeAll(Collection<?> collection) {
        return m58i.m15834h(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    @CanIgnoreReturnValue
    public final boolean retainAll(Collection<?> collection) {
        return m58i.t8r(this, collection);
    }

    @CanIgnoreReturnValue
    public int setCount(@NullableDecl E e2, int i2) {
        return m58i.zurt(this, e2, i2);
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.o05
    public final String toString() {
        return entrySet().toString();
    }

    @CanIgnoreReturnValue
    public int add(@NullableDecl E e2, int i2) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    public int remove(@NullableDecl Object obj, int i2) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    public boolean setCount(@NullableDecl E e2, int i2, int i3) {
        return m58i.ni7(this, e2, i2, i3);
    }
}
