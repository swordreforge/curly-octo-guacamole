package com.google.common.collect;

import java.lang.Comparable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: AbstractRangeSet.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
abstract class ld6<C extends Comparable> implements nnh<C> {
    ld6() {
    }

    @Override // com.google.common.collect.nnh
    public void add(ps<C> psVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.nnh
    public void addAll(nnh<C> nnhVar) {
        addAll(nnhVar.asRanges());
    }

    @Override // com.google.common.collect.nnh
    public void clear() {
        remove(ps.all());
    }

    @Override // com.google.common.collect.nnh
    public boolean contains(C c2) {
        return rangeContaining(c2) != null;
    }

    @Override // com.google.common.collect.nnh
    public abstract boolean encloses(ps<C> psVar);

    @Override // com.google.common.collect.nnh
    public boolean enclosesAll(nnh<C> nnhVar) {
        return enclosesAll(nnhVar.asRanges());
    }

    @Override // com.google.common.collect.nnh
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nnh) {
            return asRanges().equals(((nnh) obj).asRanges());
        }
        return false;
    }

    @Override // com.google.common.collect.nnh
    public final int hashCode() {
        return asRanges().hashCode();
    }

    @Override // com.google.common.collect.nnh
    public boolean intersects(ps<C> psVar) {
        return !subRangeSet(psVar).isEmpty();
    }

    @Override // com.google.common.collect.nnh
    public boolean isEmpty() {
        return asRanges().isEmpty();
    }

    @Override // com.google.common.collect.nnh
    public abstract ps<C> rangeContaining(C c2);

    @Override // com.google.common.collect.nnh
    public void remove(ps<C> psVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.nnh
    public void removeAll(nnh<C> nnhVar) {
        removeAll(nnhVar.asRanges());
    }

    @Override // com.google.common.collect.nnh
    public final String toString() {
        return asRanges().toString();
    }

    @Override // com.google.common.collect.nnh
    public void addAll(Iterable<ps<C>> iterable) {
        Iterator<ps<C>> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    @Override // com.google.common.collect.nnh
    public boolean enclosesAll(Iterable<ps<C>> iterable) {
        Iterator<ps<C>> it = iterable.iterator();
        while (it.hasNext()) {
            if (!encloses(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.collect.nnh
    public void removeAll(Iterable<ps<C>> iterable) {
        Iterator<ps<C>> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }
}
