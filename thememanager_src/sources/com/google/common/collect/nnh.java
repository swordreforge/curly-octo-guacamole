package com.google.common.collect;

import java.lang.Comparable;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: RangeSet.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public interface nnh<C extends Comparable> {
    void add(ps<C> psVar);

    void addAll(nnh<C> nnhVar);

    void addAll(Iterable<ps<C>> iterable);

    Set<ps<C>> asDescendingSetOfRanges();

    Set<ps<C>> asRanges();

    void clear();

    nnh<C> complement();

    boolean contains(C c2);

    boolean encloses(ps<C> psVar);

    boolean enclosesAll(nnh<C> nnhVar);

    boolean enclosesAll(Iterable<ps<C>> iterable);

    boolean equals(@NullableDecl Object obj);

    int hashCode();

    boolean intersects(ps<C> psVar);

    boolean isEmpty();

    ps<C> rangeContaining(C c2);

    void remove(ps<C> psVar);

    void removeAll(nnh<C> nnhVar);

    void removeAll(Iterable<ps<C>> iterable);

    ps<C> span();

    nnh<C> subRangeSet(ps<C> psVar);

    String toString();
}
