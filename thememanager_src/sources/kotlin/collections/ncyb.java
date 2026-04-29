package kotlin.collections;

import cyoe.InterfaceC5981k;
import java.util.Iterator;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ncyb<T> implements Iterable<x9kr<? extends T>>, InterfaceC7625k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final InterfaceC5981k<Iterator<T>> f36181k;

    /* JADX WARN: Multi-variable type inference failed */
    public ncyb(@InterfaceC7396q InterfaceC5981k<? extends Iterator<? extends T>> iteratorFactory) {
        kotlin.jvm.internal.d2ok.m23075h(iteratorFactory, "iteratorFactory");
        this.f36181k = iteratorFactory;
    }

    @Override // java.lang.Iterable
    @InterfaceC7396q
    public Iterator<x9kr<T>> iterator() {
        return new C6153l(this.f36181k.invoke());
    }
}
