package kotlin.collections;

import java.util.Iterator;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: renamed from: kotlin.collections.l */
/* JADX INFO: compiled from: Iterators.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6153l<T> implements Iterator<x9kr<? extends T>>, InterfaceC7625k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Iterator<T> f36170k;

    /* JADX INFO: renamed from: q */
    private int f36171q;

    /* JADX WARN: Multi-variable type inference failed */
    public C6153l(@InterfaceC7396q Iterator<? extends T> iterator) {
        kotlin.jvm.internal.d2ok.m23075h(iterator, "iterator");
        this.f36170k = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36170k.hasNext();
    }

    @Override // java.util.Iterator
    @InterfaceC7396q
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final x9kr<T> next() {
        int i2 = this.f36171q;
        this.f36171q = i2 + 1;
        if (i2 < 0) {
            ni7.lrht();
        }
        return new x9kr<>(i2, this.f36170k.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
