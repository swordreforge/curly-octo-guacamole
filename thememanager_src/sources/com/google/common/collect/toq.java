package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: AbstractIndexedListIterator.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
abstract class toq<E> extends c25<E> {

    /* JADX INFO: renamed from: k */
    private final int f26592k;

    /* JADX INFO: renamed from: q */
    private int f26593q;

    protected toq(int i2) {
        this(i2, 0);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f26593q < this.f26592k;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f26593q > 0;
    }

    /* JADX INFO: renamed from: k */
    protected abstract E mo15538k(int i2);

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f26593q;
        this.f26593q = i2 + 1;
        return mo15538k(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f26593q;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f26593q - 1;
        this.f26593q = i2;
        return mo15538k(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f26593q - 1;
    }

    protected toq(int i2, int i3) {
        com.google.common.base.jk.m15381o(i3, i2);
        this.f26592k = i2;
        this.f26593q = i3;
    }
}
