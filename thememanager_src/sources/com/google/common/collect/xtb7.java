package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: compiled from: TransformedListIterator.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
abstract class xtb7<F, T> extends pnt2<F, T> implements ListIterator<T> {
    xtb7(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private ListIterator<? extends F> toq() {
        return zwy.m16121g(this.f26572k);
    }

    @Override // java.util.ListIterator
    public void add(T t2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return toq().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return toq().nextIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return mo15580k(toq().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return toq().previousIndex();
    }

    public void set(T t2) {
        throw new UnsupportedOperationException();
    }
}
