package com.google.common.base;

import com.google.errorprone.annotations.ForOverride;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: Equivalence.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class x2<T> {

    /* JADX INFO: renamed from: com.google.common.base.x2$n */
    /* JADX INFO: compiled from: Equivalence.java */
    public static final class C4276n<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final x2<? super T> equivalence;

        @NullableDecl
        private final T reference;

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C4276n)) {
                return false;
            }
            C4276n c4276n = (C4276n) obj;
            if (this.equivalence.equals(c4276n.equivalence)) {
                return this.equivalence.equivalent(this.reference, c4276n.reference);
            }
            return false;
        }

        @NullableDecl
        public T get() {
            return this.reference;
        }

        public int hashCode() {
            return this.equivalence.hash(this.reference);
        }

        public String toString() {
            return this.equivalence + ".wrap(" + this.reference + ")";
        }

        private C4276n(x2<? super T> x2Var, @NullableDecl T t2) {
            this.equivalence = (x2) jk.a9(x2Var);
            this.reference = t2;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.x2$q */
    /* JADX INFO: compiled from: Equivalence.java */
    static final class C4277q extends x2<Object> implements Serializable {
        static final C4277q INSTANCE = new C4277q();
        private static final long serialVersionUID = 1;

        C4277q() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.x2
        protected boolean doEquivalent(Object obj, Object obj2) {
            return false;
        }

        @Override // com.google.common.base.x2
        protected int doHash(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    /* JADX INFO: compiled from: Equivalence.java */
    static final class toq extends x2<Object> implements Serializable {
        static final toq INSTANCE = new toq();
        private static final long serialVersionUID = 1;

        toq() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.x2
        protected boolean doEquivalent(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.x2
        protected int doHash(Object obj) {
            return obj.hashCode();
        }
    }

    /* JADX INFO: compiled from: Equivalence.java */
    private static final class zy<T> implements a9<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final x2<T> equivalence;

        @NullableDecl
        private final T target;

        zy(x2<T> x2Var, @NullableDecl T t2) {
            this.equivalence = (x2) jk.a9(x2Var);
            this.target = t2;
        }

        @Override // com.google.common.base.a9
        public boolean apply(@NullableDecl T t2) {
            return this.equivalence.equivalent(t2, this.target);
        }

        @Override // com.google.common.base.a9
        public boolean equals(@NullableDecl Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zy)) {
                return false;
            }
            zy zyVar = (zy) obj;
            return this.equivalence.equals(zyVar.equivalence) && C4280z.m15455k(this.target, zyVar.target);
        }

        public int hashCode() {
            return C4280z.toq(this.equivalence, this.target);
        }

        public String toString() {
            return this.equivalence + ".equivalentTo(" + this.target + ")";
        }
    }

    protected x2() {
    }

    public static x2<Object> equals() {
        return toq.INSTANCE;
    }

    public static x2<Object> identity() {
        return C4277q.INSTANCE;
    }

    @ForOverride
    protected abstract boolean doEquivalent(T t2, T t3);

    @ForOverride
    protected abstract int doHash(T t2);

    public final boolean equivalent(@NullableDecl T t2, @NullableDecl T t3) {
        if (t2 == t3) {
            return true;
        }
        if (t2 == null || t3 == null) {
            return false;
        }
        return doEquivalent(t2, t3);
    }

    public final a9<T> equivalentTo(@NullableDecl T t2) {
        return new zy(this, t2);
    }

    public final int hash(@NullableDecl T t2) {
        if (t2 == null) {
            return 0;
        }
        return doHash(t2);
    }

    public final <F> x2<F> onResultOf(t8r<F, ? extends T> t8rVar) {
        return new C4260i(t8rVar, this);
    }

    @wlev.toq(serializable = true)
    public final <S extends T> x2<Iterable<S>> pairwise() {
        return new wvg(this);
    }

    public final <S extends T> C4276n<S> wrap(@NullableDecl S s2) {
        return new C4276n<>(s2);
    }
}
