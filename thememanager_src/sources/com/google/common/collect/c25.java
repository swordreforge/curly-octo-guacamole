package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: compiled from: UnmodifiableListIterator.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class c25<E> extends ab<E> implements ListIterator<E> {
    protected c25() {
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(E e2) {
        throw new UnsupportedOperationException();
    }
}
