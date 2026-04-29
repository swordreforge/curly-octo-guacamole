package com.google.common.collect;

import com.google.common.collect.kx3;
import java.io.Serializable;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.collect.o */
/* JADX INFO: compiled from: ExplicitOrdering.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(serializable = true)
final class C4481o<T> extends kx3<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final zkd<T, Integer> rankMap;

    C4481o(List<T> list) {
        this(vy.ncyb(list));
    }

    /* JADX INFO: renamed from: k */
    private int m15916k(T t2) {
        Integer num = this.rankMap.get(t2);
        if (num != null) {
            return num.intValue();
        }
        throw new kx3.zy(t2);
    }

    @Override // com.google.common.collect.kx3, java.util.Comparator
    public int compare(T t2, T t3) {
        return m15916k(t2) - m15916k(t3);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof C4481o) {
            return this.rankMap.equals(((C4481o) obj).rankMap);
        }
        return false;
    }

    public int hashCode() {
        return this.rankMap.hashCode();
    }

    public String toString() {
        return "Ordering.explicit(" + this.rankMap.keySet() + ")";
    }

    C4481o(zkd<T, Integer> zkdVar) {
        this.rankMap = zkdVar;
    }
}
