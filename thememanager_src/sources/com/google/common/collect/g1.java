package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ForwardingSortedSet.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class g1<E> extends qo<E> implements SortedSet<E> {
    protected g1() {
    }

    private int ld6(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Comparator<? super E> comparator = comparator();
        return comparator == null ? ((Comparable) obj).compareTo(obj2) : comparator.compare(obj, obj2);
    }

    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.qo, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
    public abstract SortedSet<E> delegate();

    public E first() {
        return delegate().first();
    }

    public SortedSet<E> headSet(E e2) {
        return delegate().headSet(e2);
    }

    public E last() {
        return delegate().last();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC4572x
    @InterfaceC7731k
    protected boolean standardContains(@NullableDecl Object obj) {
        try {
            return ld6(tailSet(obj).first(), obj) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC4572x
    @InterfaceC7731k
    protected boolean standardRemove(@NullableDecl Object obj) {
        try {
            Iterator<E> it = tailSet(obj).iterator();
            if (it.hasNext() && ld6(it.next(), obj) == 0) {
                it.remove();
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    @InterfaceC7731k
    protected SortedSet<E> standardSubSet(E e2, E e3) {
        return tailSet(e2).headSet(e3);
    }

    public SortedSet<E> subSet(E e2, E e3) {
        return delegate().subSet(e2, e3);
    }

    public SortedSet<E> tailSet(E e2) {
        return delegate().tailSet(e2);
    }
}
