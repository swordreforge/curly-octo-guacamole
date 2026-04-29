package com.google.common.collect;

import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: AbstractSequentialIterator.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class x2<T> extends ab<T> {

    /* JADX INFO: renamed from: k */
    @NullableDecl
    private T f26694k;

    protected x2(@NullableDecl T t2) {
        this.f26694k = t2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26694k != null;
    }

    @NullableDecl
    /* JADX INFO: renamed from: k */
    protected abstract T mo15494k(T t2);

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            T t2 = this.f26694k;
            this.f26694k = mo15494k(t2);
            return t2;
        } catch (Throwable th) {
            this.f26694k = mo15494k(this.f26694k);
            throw th;
        }
    }
}
