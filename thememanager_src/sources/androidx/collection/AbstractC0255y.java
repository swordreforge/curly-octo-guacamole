package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.collection.y */
/* JADX INFO: compiled from: IndexBasedArrayIterator.java */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0255y<T> implements Iterator<T> {

    /* JADX INFO: renamed from: k */
    private int f1371k;

    /* JADX INFO: renamed from: n */
    private boolean f1372n;

    /* JADX INFO: renamed from: q */
    private int f1373q;

    AbstractC0255y(int i2) {
        this.f1371k = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1373q < this.f1371k;
    }

    /* JADX INFO: renamed from: k */
    protected abstract T mo825k(int i2);

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tMo825k = mo825k(this.f1373q);
        this.f1373q++;
        this.f1372n = true;
        return tMo825k;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f1372n) {
            throw new IllegalStateException();
        }
        int i2 = this.f1373q - 1;
        this.f1373q = i2;
        toq(i2);
        this.f1371k--;
        this.f1372n = false;
    }

    protected abstract void toq(int i2);
}
