package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ComparatorOrdering.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(serializable = true)
final class gvn7<T> extends kx3<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<T> comparator;

    gvn7(Comparator<T> comparator) {
        this.comparator = (Comparator) com.google.common.base.jk.a9(comparator);
    }

    @Override // com.google.common.collect.kx3, java.util.Comparator
    public int compare(T t2, T t3) {
        return this.comparator.compare(t2, t3);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gvn7) {
            return this.comparator.equals(((gvn7) obj).comparator);
        }
        return false;
    }

    public int hashCode() {
        return this.comparator.hashCode();
    }

    public String toString() {
        return this.comparator.toString();
    }
}
