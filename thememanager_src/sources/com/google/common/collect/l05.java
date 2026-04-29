package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: RegularImmutableSortedSet.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
final class l05<E> extends ixz<E> {
    static final l05<Comparable> NATURAL_EMPTY_SET = new l05<>(se.of(), kx3.natural());

    @InterfaceC7732q
    final transient se<E> elements;

    l05(se<E> seVar, Comparator<? super E> comparator) {
        super(comparator);
        this.elements = seVar;
    }

    private int zy(Object obj) throws ClassCastException {
        return Collections.binarySearch(this.elements, obj, unsafeComparator());
    }

    @Override // com.google.common.collect.vep5, com.google.common.collect.z4
    public se<E> asList() {
        return this.elements;
    }

    @Override // com.google.common.collect.ixz, java.util.NavigableSet
    public E ceiling(E e2) {
        int iTailIndex = tailIndex(e2, true);
        if (iTailIndex == size()) {
            return null;
        }
        return this.elements.get(iTailIndex);
    }

    @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public boolean contains(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return zy(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof o05) {
            collection = ((o05) collection).elementSet();
        }
        if (!tww7.toq(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        ab<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int iUnsafeCompare = unsafeCompare(next2, next);
                if (iUnsafeCompare < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iUnsafeCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iUnsafeCompare > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.common.collect.z4
    int copyIntoArray(Object[] objArr, int i2) {
        return this.elements.copyIntoArray(objArr, i2);
    }

    @Override // com.google.common.collect.ixz
    ixz<E> createDescendingSet() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.comparator);
        return isEmpty() ? ixz.emptySet(comparatorReverseOrder) : new l05(this.elements.reverse(), comparatorReverseOrder);
    }

    @Override // com.google.common.collect.vep5, java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!tww7.toq(this.comparator, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            ab<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || unsafeCompare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.ixz, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.elements.get(0);
    }

    @Override // com.google.common.collect.ixz, java.util.NavigableSet
    public E floor(E e2) {
        int iHeadIndex = headIndex(e2, true) - 1;
        if (iHeadIndex == -1) {
            return null;
        }
        return this.elements.get(iHeadIndex);
    }

    l05<E> getSubSet(int i2, int i3) {
        return (i2 == 0 && i3 == size()) ? this : i2 < i3 ? new l05<>(this.elements.subList(i2, i3), this.comparator) : ixz.emptySet(this.comparator);
    }

    int headIndex(E e2, boolean z2) {
        int iBinarySearch = Collections.binarySearch(this.elements, com.google.common.base.jk.a9(e2), comparator());
        return iBinarySearch >= 0 ? z2 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    @Override // com.google.common.collect.ixz
    ixz<E> headSetImpl(E e2, boolean z2) {
        return getSubSet(0, headIndex(e2, z2));
    }

    @Override // com.google.common.collect.ixz, java.util.NavigableSet
    public E higher(E e2) {
        int iTailIndex = tailIndex(e2, false);
        if (iTailIndex == size()) {
            return null;
        }
        return this.elements.get(iTailIndex);
    }

    @Override // com.google.common.collect.ixz
    int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int iBinarySearch = Collections.binarySearch(this.elements, obj, unsafeComparator());
            if (iBinarySearch >= 0) {
                return iBinarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    @Override // com.google.common.collect.z4
    Object[] internalArray() {
        return this.elements.internalArray();
    }

    @Override // com.google.common.collect.z4
    int internalArrayEnd() {
        return this.elements.internalArrayEnd();
    }

    @Override // com.google.common.collect.z4
    int internalArrayStart() {
        return this.elements.internalArrayStart();
    }

    @Override // com.google.common.collect.z4
    boolean isPartialView() {
        return this.elements.isPartialView();
    }

    @Override // com.google.common.collect.ixz, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.elements.get(size() - 1);
    }

    @Override // com.google.common.collect.ixz, java.util.NavigableSet
    public E lower(E e2) {
        int iHeadIndex = headIndex(e2, false) - 1;
        if (iHeadIndex == -1) {
            return null;
        }
        return this.elements.get(iHeadIndex);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.elements.size();
    }

    @Override // com.google.common.collect.ixz
    ixz<E> subSetImpl(E e2, boolean z2, E e3, boolean z3) {
        return tailSetImpl(e2, z2).headSetImpl(e3, z3);
    }

    int tailIndex(E e2, boolean z2) {
        int iBinarySearch = Collections.binarySearch(this.elements, com.google.common.base.jk.a9(e2), comparator());
        return iBinarySearch >= 0 ? z2 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    @Override // com.google.common.collect.ixz
    ixz<E> tailSetImpl(E e2, boolean z2) {
        return getSubSet(tailIndex(e2, z2), size());
    }

    Comparator<Object> unsafeComparator() {
        return this.comparator;
    }

    @Override // com.google.common.collect.ixz, java.util.NavigableSet
    @wlev.zy
    public ab<E> descendingIterator() {
        return this.elements.reverse().iterator();
    }

    @Override // com.google.common.collect.ixz, com.google.common.collect.vep5, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
    public ab<E> iterator() {
        return this.elements.iterator();
    }
}
