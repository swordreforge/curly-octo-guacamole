package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: TransformedIterator.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
abstract class pnt2<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: k */
    final Iterator<? extends F> f26572k;

    pnt2(Iterator<? extends F> it) {
        this.f26572k = (Iterator) com.google.common.base.jk.a9(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26572k.hasNext();
    }

    /* JADX INFO: renamed from: k */
    abstract T mo15580k(F f2);

    @Override // java.util.Iterator
    public final T next() {
        return mo15580k(this.f26572k.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f26572k.remove();
    }
}
