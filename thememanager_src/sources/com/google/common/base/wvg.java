package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: PairwiseEquivalence.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(serializable = true)
final class wvg<T> extends x2<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 1;
    final x2<? super T> elementEquivalence;

    wvg(x2<? super T> x2Var) {
        this.elementEquivalence = (x2) jk.a9(x2Var);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof wvg) {
            return this.elementEquivalence.equals(((wvg) obj).elementEquivalence);
        }
        return false;
    }

    public int hashCode() {
        return this.elementEquivalence.hashCode() ^ 1185147655;
    }

    public String toString() {
        return this.elementEquivalence + ".pairwise()";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.base.x2
    public boolean doEquivalent(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it = iterable.iterator();
        Iterator<T> it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.elementEquivalence.equivalent(it.next(), it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.base.x2
    public int doHash(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        int iHash = 78721;
        while (it.hasNext()) {
            iHash = (iHash * 24943) + this.elementEquivalence.hash(it.next());
        }
        return iHash;
    }
}
