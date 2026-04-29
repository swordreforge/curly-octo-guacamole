package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: renamed from: com.google.common.collect.j */
/* JADX INFO: compiled from: EvictingQueue.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
@InterfaceC7731k
public final class C4417j<E> extends fnq8<E> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Queue<E> delegate;

    @InterfaceC7732q
    final int maxSize;

    private C4417j(int i2) {
        com.google.common.base.jk.ld6(i2 >= 0, "maxSize (%s) must >= 0", i2);
        this.delegate = new ArrayDeque(i2);
        this.maxSize = i2;
    }

    public static <E> C4417j<E> create(int i2) {
        return new C4417j<>(i2);
    }

    @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Queue
    @CanIgnoreReturnValue
    public boolean add(E e2) {
        com.google.common.base.jk.a9(e2);
        if (this.maxSize == 0) {
            return true;
        }
        if (size() == this.maxSize) {
            this.delegate.remove();
        }
        this.delegate.add(e2);
        return true;
    }

    @Override // com.google.common.collect.AbstractC4572x, java.util.Collection
    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < this.maxSize) {
            return standardAddAll(collection);
        }
        clear();
        return nsb.m15905k(this, nsb.m15910r(collection, size - this.maxSize));
    }

    @Override // com.google.common.collect.AbstractC4572x, java.util.Collection
    public boolean contains(Object obj) {
        return delegate().contains(com.google.common.base.jk.a9(obj));
    }

    @Override // com.google.common.collect.fnq8, java.util.Queue
    @CanIgnoreReturnValue
    public boolean offer(E e2) {
        return add(e2);
    }

    public int remainingCapacity() {
        return this.maxSize - size();
    }

    @Override // com.google.common.collect.AbstractC4572x, java.util.Collection
    @CanIgnoreReturnValue
    public boolean remove(Object obj) {
        return delegate().remove(com.google.common.base.jk.a9(obj));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.fnq8, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
    public Queue<E> delegate() {
        return this.delegate;
    }
}
