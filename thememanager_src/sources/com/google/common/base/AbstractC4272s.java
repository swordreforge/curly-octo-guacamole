package com.google.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.base.s */
/* JADX INFO: compiled from: Converter.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class AbstractC4272s<A, B> implements t8r<A, B> {
    private final boolean handleNullAutomatically;

    /* JADX INFO: renamed from: k */
    @LazyInit
    @MonotonicNonNullDecl
    private transient AbstractC4272s<B, A> f25739k;

    /* JADX INFO: renamed from: com.google.common.base.s$k */
    /* JADX INFO: compiled from: Converter.java */
    class k implements Iterable<B> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Iterable f25740k;

        /* JADX INFO: renamed from: com.google.common.base.s$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Converter.java */
        class C7982k implements Iterator<B> {

            /* JADX INFO: renamed from: k */
            private final Iterator<? extends A> f25742k;

            C7982k() {
                this.f25742k = k.this.f25740k.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f25742k.hasNext();
            }

            @Override // java.util.Iterator
            public B next() {
                return (B) AbstractC4272s.this.convert(this.f25742k.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f25742k.remove();
            }
        }

        k(Iterable iterable) {
            this.f25740k = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<B> iterator() {
            return new C7982k();
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.s$n */
    /* JADX INFO: compiled from: Converter.java */
    private static final class n<A, B> extends AbstractC4272s<B, A> implements Serializable {
        private static final long serialVersionUID = 0;
        final AbstractC4272s<A, B> original;

        n(AbstractC4272s<A, B> abstractC4272s) {
            this.original = abstractC4272s;
        }

        @Override // com.google.common.base.AbstractC4272s
        @NullableDecl
        B correctedDoBackward(@NullableDecl A a2) {
            return this.original.correctedDoForward(a2);
        }

        @Override // com.google.common.base.AbstractC4272s
        @NullableDecl
        A correctedDoForward(@NullableDecl B b2) {
            return this.original.correctedDoBackward(b2);
        }

        @Override // com.google.common.base.AbstractC4272s
        protected B doBackward(A a2) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.AbstractC4272s
        protected A doForward(B b2) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.AbstractC4272s, com.google.common.base.t8r
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof n) {
                return this.original.equals(((n) obj).original);
            }
            return false;
        }

        public int hashCode() {
            return ~this.original.hashCode();
        }

        @Override // com.google.common.base.AbstractC4272s
        public AbstractC4272s<A, B> reverse() {
            return this.original;
        }

        public String toString() {
            return this.original + ".reverse()";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.s$q */
    /* JADX INFO: compiled from: Converter.java */
    private static final class q<T> extends AbstractC4272s<T, T> implements Serializable {
        static final q INSTANCE = new q();
        private static final long serialVersionUID = 0;

        private q() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.AbstractC4272s
        <S> AbstractC4272s<T, S> doAndThen(AbstractC4272s<T, S> abstractC4272s) {
            return (AbstractC4272s) jk.fti(abstractC4272s, "otherConverter");
        }

        @Override // com.google.common.base.AbstractC4272s
        protected T doBackward(T t2) {
            return t2;
        }

        @Override // com.google.common.base.AbstractC4272s
        protected T doForward(T t2) {
            return t2;
        }

        @Override // com.google.common.base.AbstractC4272s
        public q<T> reverse() {
            return this;
        }

        public String toString() {
            return "Converter.identity()";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.s$toq */
    /* JADX INFO: compiled from: Converter.java */
    private static final class toq<A, B, C> extends AbstractC4272s<A, C> implements Serializable {
        private static final long serialVersionUID = 0;
        final AbstractC4272s<A, B> first;
        final AbstractC4272s<B, C> second;

        toq(AbstractC4272s<A, B> abstractC4272s, AbstractC4272s<B, C> abstractC4272s2) {
            this.first = abstractC4272s;
            this.second = abstractC4272s2;
        }

        @Override // com.google.common.base.AbstractC4272s
        @NullableDecl
        A correctedDoBackward(@NullableDecl C c2) {
            return (A) this.first.correctedDoBackward(this.second.correctedDoBackward(c2));
        }

        @Override // com.google.common.base.AbstractC4272s
        @NullableDecl
        C correctedDoForward(@NullableDecl A a2) {
            return (C) this.second.correctedDoForward(this.first.correctedDoForward(a2));
        }

        @Override // com.google.common.base.AbstractC4272s
        protected A doBackward(C c2) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.AbstractC4272s
        protected C doForward(A a2) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.AbstractC4272s, com.google.common.base.t8r
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof toq)) {
                return false;
            }
            toq toqVar = (toq) obj;
            return this.first.equals(toqVar.first) && this.second.equals(toqVar.second);
        }

        public int hashCode() {
            return (this.first.hashCode() * 31) + this.second.hashCode();
        }

        public String toString() {
            return this.first + ".andThen(" + this.second + ")";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.s$zy */
    /* JADX INFO: compiled from: Converter.java */
    private static final class zy<A, B> extends AbstractC4272s<A, B> implements Serializable {
        private final t8r<? super B, ? extends A> backwardFunction;
        private final t8r<? super A, ? extends B> forwardFunction;

        /* synthetic */ zy(t8r t8rVar, t8r t8rVar2, k kVar) {
            this(t8rVar, t8rVar2);
        }

        @Override // com.google.common.base.AbstractC4272s
        protected A doBackward(B b2) {
            return this.backwardFunction.apply(b2);
        }

        @Override // com.google.common.base.AbstractC4272s
        protected B doForward(A a2) {
            return this.forwardFunction.apply(a2);
        }

        @Override // com.google.common.base.AbstractC4272s, com.google.common.base.t8r
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof zy)) {
                return false;
            }
            zy zyVar = (zy) obj;
            return this.forwardFunction.equals(zyVar.forwardFunction) && this.backwardFunction.equals(zyVar.backwardFunction);
        }

        public int hashCode() {
            return (this.forwardFunction.hashCode() * 31) + this.backwardFunction.hashCode();
        }

        public String toString() {
            return "Converter.from(" + this.forwardFunction + ", " + this.backwardFunction + ")";
        }

        private zy(t8r<? super A, ? extends B> t8rVar, t8r<? super B, ? extends A> t8rVar2) {
            this.forwardFunction = (t8r) jk.a9(t8rVar);
            this.backwardFunction = (t8r) jk.a9(t8rVar2);
        }
    }

    protected AbstractC4272s() {
        this(true);
    }

    public static <A, B> AbstractC4272s<A, B> from(t8r<? super A, ? extends B> t8rVar, t8r<? super B, ? extends A> t8rVar2) {
        return new zy(t8rVar, t8rVar2, null);
    }

    public static <T> AbstractC4272s<T, T> identity() {
        return q.INSTANCE;
    }

    public final <C> AbstractC4272s<A, C> andThen(AbstractC4272s<B, C> abstractC4272s) {
        return doAndThen(abstractC4272s);
    }

    @Override // com.google.common.base.t8r
    @CanIgnoreReturnValue
    @NullableDecl
    @Deprecated
    public final B apply(@NullableDecl A a2) {
        return convert(a2);
    }

    @CanIgnoreReturnValue
    @NullableDecl
    public final B convert(@NullableDecl A a2) {
        return correctedDoForward(a2);
    }

    @CanIgnoreReturnValue
    public Iterable<B> convertAll(Iterable<? extends A> iterable) {
        jk.fti(iterable, "fromIterable");
        return new k(iterable);
    }

    @NullableDecl
    A correctedDoBackward(@NullableDecl B b2) {
        if (!this.handleNullAutomatically) {
            return doBackward(b2);
        }
        if (b2 == null) {
            return null;
        }
        return (A) jk.a9(doBackward(b2));
    }

    @NullableDecl
    B correctedDoForward(@NullableDecl A a2) {
        if (!this.handleNullAutomatically) {
            return doForward(a2);
        }
        if (a2 == null) {
            return null;
        }
        return (B) jk.a9(doForward(a2));
    }

    <C> AbstractC4272s<A, C> doAndThen(AbstractC4272s<B, C> abstractC4272s) {
        return new toq(this, (AbstractC4272s) jk.a9(abstractC4272s));
    }

    @ForOverride
    protected abstract A doBackward(B b2);

    @ForOverride
    protected abstract B doForward(A a2);

    @Override // com.google.common.base.t8r
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @CanIgnoreReturnValue
    public AbstractC4272s<B, A> reverse() {
        AbstractC4272s<B, A> abstractC4272s = this.f25739k;
        if (abstractC4272s != null) {
            return abstractC4272s;
        }
        n nVar = new n(this);
        this.f25739k = nVar;
        return nVar;
    }

    AbstractC4272s(boolean z2) {
        this.handleNullAutomatically = z2;
    }
}
