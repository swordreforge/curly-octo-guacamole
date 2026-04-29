package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: compiled from: ForwardingDeque.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public abstract class nmn5<E> extends fnq8<E> implements Deque<E> {
    protected nmn5() {
    }

    @Override // java.util.Deque
    public void addFirst(E e2) {
        delegate().addFirst(e2);
    }

    @Override // java.util.Deque
    public void addLast(E e2) {
        delegate().addLast(e2);
    }

    @Override // java.util.Deque
    public Iterator<E> descendingIterator() {
        return delegate().descendingIterator();
    }

    @Override // java.util.Deque
    public E getFirst() {
        return delegate().getFirst();
    }

    @Override // java.util.Deque
    public E getLast() {
        return delegate().getLast();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.fnq8, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
    /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
    public abstract Deque<E> delegate();

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean offerFirst(E e2) {
        return delegate().offerFirst(e2);
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean offerLast(E e2) {
        return delegate().offerLast(e2);
    }

    @Override // java.util.Deque
    public E peekFirst() {
        return delegate().peekFirst();
    }

    @Override // java.util.Deque
    public E peekLast() {
        return delegate().peekLast();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E pollFirst() {
        return delegate().pollFirst();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E pollLast() {
        return delegate().pollLast();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E pop() {
        return delegate().pop();
    }

    @Override // java.util.Deque
    public void push(E e2) {
        delegate().push(e2);
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E removeFirst() {
        return delegate().removeFirst();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean removeFirstOccurrence(Object obj) {
        return delegate().removeFirstOccurrence(obj);
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E removeLast() {
        return delegate().removeLast();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean removeLastOccurrence(Object obj) {
        return delegate().removeLastOccurrence(obj);
    }
}
