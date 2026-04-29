package com.google.common.collect;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: NullsFirstOrdering.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(serializable = true)
final class b8<T> extends kx3<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final kx3<? super T> ordering;

    b8(kx3<? super T> kx3Var) {
        this.ordering = kx3Var;
    }

    @Override // com.google.common.collect.kx3, java.util.Comparator
    public int compare(@NullableDecl T t2, @NullableDecl T t3) {
        if (t2 == t3) {
            return 0;
        }
        if (t2 == null) {
            return -1;
        }
        if (t3 == null) {
            return 1;
        }
        return this.ordering.compare(t2, t3);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b8) {
            return this.ordering.equals(((b8) obj).ordering);
        }
        return false;
    }

    public int hashCode() {
        return this.ordering.hashCode() ^ 957692532;
    }

    @Override // com.google.common.collect.kx3
    public <S extends T> kx3<S> nullsFirst() {
        return this;
    }

    @Override // com.google.common.collect.kx3
    public <S extends T> kx3<S> nullsLast() {
        return this.ordering.nullsLast();
    }

    @Override // com.google.common.collect.kx3
    public <S extends T> kx3<S> reverse() {
        return this.ordering.reverse().nullsLast();
    }

    public String toString() {
        return this.ordering + ".nullsFirst()";
    }
}
