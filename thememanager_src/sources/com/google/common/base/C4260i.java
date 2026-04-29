package com.google.common.base;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.base.i */
/* JADX INFO: compiled from: FunctionalEquivalence.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
@InterfaceC7731k
final class C4260i<F, T> extends x2<F> implements Serializable {
    private static final long serialVersionUID = 0;
    private final t8r<F, ? extends T> function;
    private final x2<T> resultEquivalence;

    C4260i(t8r<F, ? extends T> t8rVar, x2<T> x2Var) {
        this.function = (t8r) jk.a9(t8rVar);
        this.resultEquivalence = (x2) jk.a9(x2Var);
    }

    @Override // com.google.common.base.x2
    protected boolean doEquivalent(F f2, F f3) {
        return this.resultEquivalence.equivalent(this.function.apply(f2), this.function.apply(f3));
    }

    @Override // com.google.common.base.x2
    protected int doHash(F f2) {
        return this.resultEquivalence.hash(this.function.apply(f2));
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4260i)) {
            return false;
        }
        C4260i c4260i = (C4260i) obj;
        return this.function.equals(c4260i.function) && this.resultEquivalence.equals(c4260i.resultEquivalence);
    }

    public int hashCode() {
        return C4280z.toq(this.function, this.resultEquivalence);
    }

    public String toString() {
        return this.resultEquivalence + ".onResultOf(" + this.function + ")";
    }
}
