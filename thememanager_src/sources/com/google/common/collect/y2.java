package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;

/* JADX INFO: compiled from: ForwardingIterator.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class y2<T> extends qkj8 implements Iterator<T> {
    protected y2() {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return delegate().hasNext();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.qkj8
    /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
    public abstract Iterator<T> delegate();

    @CanIgnoreReturnValue
    public T next() {
        return delegate().next();
    }

    public void remove() {
        delegate().remove();
    }
}
