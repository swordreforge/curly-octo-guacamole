package com.google.common.base;

import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.base.k */
/* JADX INFO: compiled from: Absent.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
final class C4261k<T> extends o1t<T> {
    static final C4261k<Object> INSTANCE = new C4261k<>();
    private static final long serialVersionUID = 0;

    private C4261k() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    static <T> o1t<T> withType() {
        return INSTANCE;
    }

    @Override // com.google.common.base.o1t
    public Set<T> asSet() {
        return Collections.emptySet();
    }

    @Override // com.google.common.base.o1t
    public boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    @Override // com.google.common.base.o1t
    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.o1t
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.google.common.base.o1t
    public boolean isPresent() {
        return false;
    }

    @Override // com.google.common.base.o1t
    public T or(T t2) {
        return (T) jk.fti(t2, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // com.google.common.base.o1t
    @NullableDecl
    public T orNull() {
        return null;
    }

    @Override // com.google.common.base.o1t
    public String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.common.base.o1t
    public <V> o1t<V> transform(t8r<? super T, V> t8rVar) {
        jk.a9(t8rVar);
        return o1t.absent();
    }

    @Override // com.google.common.base.o1t
    public o1t<T> or(o1t<? extends T> o1tVar) {
        return (o1t) jk.a9(o1tVar);
    }

    @Override // com.google.common.base.o1t
    public T or(lvui<? extends T> lvuiVar) {
        return (T) jk.fti(lvuiVar.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }
}
