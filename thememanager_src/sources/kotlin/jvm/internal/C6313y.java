package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: renamed from: kotlin.jvm.internal.y */
/* JADX INFO: compiled from: ArrayIterator.kt */
/* JADX INFO: loaded from: classes3.dex */
final class C6313y<T> implements Iterator<T>, InterfaceC7625k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final T[] f36455k;

    /* JADX INFO: renamed from: q */
    private int f36456q;

    public C6313y(@InterfaceC7396q T[] array) {
        d2ok.m23075h(array, "array");
        this.f36455k = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36456q < this.f36455k.length;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final T[] m23163k() {
        return this.f36455k;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f36455k;
            int i2 = this.f36456q;
            this.f36456q = i2 + 1;
            return tArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f36456q--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
