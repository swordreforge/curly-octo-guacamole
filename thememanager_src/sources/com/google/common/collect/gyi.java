package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ListIterator;

/* JADX INFO: compiled from: ForwardingListIterator.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class gyi<E> extends y2<E> implements ListIterator<E> {
    protected gyi() {
    }

    @Override // java.util.ListIterator
    public void add(E e2) {
        delegate().add(e2);
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return delegate().hasPrevious();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return delegate().nextIndex();
    }

    @Override // java.util.ListIterator
    @CanIgnoreReturnValue
    public E previous() {
        return delegate().previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return delegate().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(E e2) {
        delegate().set(e2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.y2
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public abstract ListIterator<E> delegate();
}
