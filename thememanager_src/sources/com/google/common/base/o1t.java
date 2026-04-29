package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Optional.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(serializable = true)
public abstract class o1t<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: com.google.common.base.o1t$k */
    /* JADX INFO: compiled from: Optional.java */
    static class C4268k implements Iterable<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Iterable f25729k;

        /* JADX INFO: renamed from: com.google.common.base.o1t$k$k */
        /* JADX INFO: compiled from: Optional.java */
        class k extends toq<T> {

            /* JADX INFO: renamed from: n */
            private final Iterator<? extends o1t<? extends T>> f25731n;

            k() {
                this.f25731n = (Iterator) jk.a9(C4268k.this.f25729k.iterator());
            }

            @Override // com.google.common.base.toq
            /* JADX INFO: renamed from: k */
            protected T mo15311k() {
                while (this.f25731n.hasNext()) {
                    o1t<? extends T> next = this.f25731n.next();
                    if (next.isPresent()) {
                        return next.get();
                    }
                }
                return toq();
            }
        }

        C4268k(Iterable iterable) {
            this.f25729k = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new k();
        }
    }

    o1t() {
    }

    public static <T> o1t<T> absent() {
        return C4261k.withType();
    }

    public static <T> o1t<T> fromNullable(@NullableDecl T t2) {
        return t2 == null ? absent() : new jp0y(t2);
    }

    public static <T> o1t<T> of(T t2) {
        return new jp0y(jk.a9(t2));
    }

    @InterfaceC7731k
    public static <T> Iterable<T> presentInstances(Iterable<? extends o1t<? extends T>> iterable) {
        jk.a9(iterable);
        return new C4268k(iterable);
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(@NullableDecl Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract o1t<T> or(o1t<? extends T> o1tVar);

    @InterfaceC7731k
    public abstract T or(lvui<? extends T> lvuiVar);

    public abstract T or(T t2);

    @NullableDecl
    public abstract T orNull();

    public abstract String toString();

    public abstract <V> o1t<V> transform(t8r<? super T, V> t8rVar);
}
