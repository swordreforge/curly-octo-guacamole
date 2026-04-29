package com.google.common.collect;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: NullsLastOrdering.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(serializable = true)
final class nme<T> extends kx3<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final kx3<? super T> ordering;

    nme(kx3<? super T> kx3Var) {
        this.ordering = kx3Var;
    }

    @Override // com.google.common.collect.kx3, java.util.Comparator
    public int compare(@NullableDecl T t2, @NullableDecl T t3) {
        if (t2 == t3) {
            return 0;
        }
        if (t2 == null) {
            return 1;
        }
        if (t3 == null) {
            return -1;
        }
        return this.ordering.compare(t2, t3);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nme) {
            return this.ordering.equals(((nme) obj).ordering);
        }
        return false;
    }

    public int hashCode() {
        return this.ordering.hashCode() ^ (-921210296);
    }

    @Override // com.google.common.collect.kx3
    public <S extends T> kx3<S> nullsFirst() {
        return this.ordering.nullsFirst();
    }

    @Override // com.google.common.collect.kx3
    public <S extends T> kx3<S> nullsLast() {
        return this;
    }

    @Override // com.google.common.collect.kx3
    public <S extends T> kx3<S> reverse() {
        return this.ordering.reverse().nullsFirst();
    }

    public String toString() {
        return this.ordering + ".nullsLast()";
    }
}
