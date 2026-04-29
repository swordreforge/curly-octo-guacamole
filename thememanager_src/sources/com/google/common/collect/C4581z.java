package com.google.common.collect;

import com.google.common.base.C4280z;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.collect.z */
/* JADX INFO: compiled from: ByFunctionOrdering.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(serializable = true)
final class C4581z<F, T> extends kx3<F> implements Serializable {
    private static final long serialVersionUID = 0;
    final com.google.common.base.t8r<F, ? extends T> function;
    final kx3<T> ordering;

    C4581z(com.google.common.base.t8r<F, ? extends T> t8rVar, kx3<T> kx3Var) {
        this.function = (com.google.common.base.t8r) com.google.common.base.jk.a9(t8rVar);
        this.ordering = (kx3) com.google.common.base.jk.a9(kx3Var);
    }

    @Override // com.google.common.collect.kx3, java.util.Comparator
    public int compare(F f2, F f3) {
        return this.ordering.compare(this.function.apply(f2), this.function.apply(f3));
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4581z)) {
            return false;
        }
        C4581z c4581z = (C4581z) obj;
        return this.function.equals(c4581z.function) && this.ordering.equals(c4581z.ordering);
    }

    public int hashCode() {
        return C4280z.toq(this.function, this.ordering);
    }

    public String toString() {
        return this.ordering + ".onResultOf(" + this.function + ")";
    }
}
