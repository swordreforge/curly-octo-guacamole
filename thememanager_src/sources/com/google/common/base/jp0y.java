package com.google.common.base;

import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: Present.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
final class jp0y<T> extends o1t<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    jp0y(T t2) {
        this.reference = t2;
    }

    @Override // com.google.common.base.o1t
    public Set<T> asSet() {
        return Collections.singleton(this.reference);
    }

    @Override // com.google.common.base.o1t
    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof jp0y) {
            return this.reference.equals(((jp0y) obj).reference);
        }
        return false;
    }

    @Override // com.google.common.base.o1t
    public T get() {
        return this.reference;
    }

    @Override // com.google.common.base.o1t
    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    @Override // com.google.common.base.o1t
    public boolean isPresent() {
        return true;
    }

    @Override // com.google.common.base.o1t
    public T or(T t2) {
        jk.fti(t2, "use Optional.orNull() instead of Optional.or(null)");
        return this.reference;
    }

    @Override // com.google.common.base.o1t
    public T orNull() {
        return this.reference;
    }

    @Override // com.google.common.base.o1t
    public String toString() {
        return "Optional.of(" + this.reference + ")";
    }

    @Override // com.google.common.base.o1t
    public <V> o1t<V> transform(t8r<? super T, V> t8rVar) {
        return new jp0y(jk.fti(t8rVar.apply(this.reference), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.google.common.base.o1t
    public o1t<T> or(o1t<? extends T> o1tVar) {
        jk.a9(o1tVar);
        return this;
    }

    @Override // com.google.common.base.o1t
    public T or(lvui<? extends T> lvuiVar) {
        jk.a9(lvuiVar);
        return this.reference;
    }
}
