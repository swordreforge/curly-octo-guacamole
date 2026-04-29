package com.google.common.collect;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* JADX INFO: compiled from: NaturalOrdering.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(serializable = true)
final class b9ub extends kx3<Comparable> implements Serializable {
    static final b9ub INSTANCE = new b9ub();
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: k */
    @MonotonicNonNullDecl
    private transient kx3<Comparable> f25971k;

    /* JADX INFO: renamed from: q */
    @MonotonicNonNullDecl
    private transient kx3<Comparable> f25972q;

    private b9ub() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // com.google.common.collect.kx3
    public <S extends Comparable> kx3<S> nullsFirst() {
        kx3<S> kx3Var = (kx3<S>) this.f25971k;
        if (kx3Var != null) {
            return kx3Var;
        }
        kx3<S> kx3VarNullsFirst = super.nullsFirst();
        this.f25971k = kx3VarNullsFirst;
        return kx3VarNullsFirst;
    }

    @Override // com.google.common.collect.kx3
    public <S extends Comparable> kx3<S> nullsLast() {
        kx3<S> kx3Var = (kx3<S>) this.f25972q;
        if (kx3Var != null) {
            return kx3Var;
        }
        kx3<S> kx3VarNullsLast = super.nullsLast();
        this.f25972q = kx3VarNullsLast;
        return kx3VarNullsLast;
    }

    @Override // com.google.common.collect.kx3
    public <S extends Comparable> kx3<S> reverse() {
        return r6ty.INSTANCE;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.common.collect.kx3, java.util.Comparator
    public int compare(Comparable comparable, Comparable comparable2) {
        com.google.common.base.jk.a9(comparable);
        com.google.common.base.jk.a9(comparable2);
        return comparable.compareTo(comparable2);
    }
}
