package com.google.common.collect;

import com.google.common.primitives.C4739k;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: Cut.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
abstract class ncyb<C extends Comparable> implements Comparable<ncyb<C>>, Serializable {
    private static final long serialVersionUID = 0;

    @NullableDecl
    final C endpoint;

    /* JADX INFO: renamed from: com.google.common.collect.ncyb$k */
    /* JADX INFO: compiled from: Cut.java */
    static /* synthetic */ class C4470k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f26471k;

        static {
            int[] iArr = new int[fu4.values().length];
            f26471k = iArr;
            try {
                iArr[fu4.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26471k[fu4.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ncyb$n */
    /* JADX INFO: compiled from: Cut.java */
    private static final class C4471n<C extends Comparable> extends ncyb<C> {
        private static final long serialVersionUID = 0;

        C4471n(C c2) {
            super((Comparable) com.google.common.base.jk.a9(c2));
        }

        @Override // com.google.common.collect.ncyb, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((ncyb) obj);
        }

        @Override // com.google.common.collect.ncyb
        void describeAsLowerBound(StringBuilder sb) {
            sb.append('[');
            sb.append(this.endpoint);
        }

        @Override // com.google.common.collect.ncyb
        void describeAsUpperBound(StringBuilder sb) {
            sb.append(this.endpoint);
            sb.append(')');
        }

        @Override // com.google.common.collect.ncyb
        C greatestValueBelow(AbstractC4324c<C> abstractC4324c) {
            return (C) abstractC4324c.previous(this.endpoint);
        }

        @Override // com.google.common.collect.ncyb
        public int hashCode() {
            return this.endpoint.hashCode();
        }

        @Override // com.google.common.collect.ncyb
        boolean isLessThan(C c2) {
            return ps.compareOrThrow(this.endpoint, c2) <= 0;
        }

        @Override // com.google.common.collect.ncyb
        C leastValueAbove(AbstractC4324c<C> abstractC4324c) {
            return this.endpoint;
        }

        public String toString() {
            return "\\" + this.endpoint + "/";
        }

        @Override // com.google.common.collect.ncyb
        fu4 typeAsLowerBound() {
            return fu4.CLOSED;
        }

        @Override // com.google.common.collect.ncyb
        fu4 typeAsUpperBound() {
            return fu4.OPEN;
        }

        @Override // com.google.common.collect.ncyb
        ncyb<C> withLowerBoundType(fu4 fu4Var, AbstractC4324c<C> abstractC4324c) {
            int i2 = C4470k.f26471k[fu4Var.ordinal()];
            if (i2 == 1) {
                return this;
            }
            if (i2 != 2) {
                throw new AssertionError();
            }
            Comparable comparablePrevious = abstractC4324c.previous(this.endpoint);
            return comparablePrevious == null ? ncyb.belowAll() : new zy(comparablePrevious);
        }

        @Override // com.google.common.collect.ncyb
        ncyb<C> withUpperBoundType(fu4 fu4Var, AbstractC4324c<C> abstractC4324c) {
            int i2 = C4470k.f26471k[fu4Var.ordinal()];
            if (i2 == 1) {
                Comparable comparablePrevious = abstractC4324c.previous(this.endpoint);
                return comparablePrevious == null ? ncyb.aboveAll() : new zy(comparablePrevious);
            }
            if (i2 == 2) {
                return this;
            }
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ncyb$q */
    /* JADX INFO: compiled from: Cut.java */
    private static final class C4472q extends ncyb<Comparable<?>> {

        /* JADX INFO: renamed from: k */
        private static final C4472q f26472k = new C4472q();
        private static final long serialVersionUID = 0;

        private C4472q() {
            super(null);
        }

        private Object readResolve() {
            return f26472k;
        }

        @Override // com.google.common.collect.ncyb
        ncyb<Comparable<?>> canonical(AbstractC4324c<Comparable<?>> abstractC4324c) {
            try {
                return ncyb.belowValue(abstractC4324c.minValue());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        @Override // com.google.common.collect.ncyb, java.lang.Comparable
        public int compareTo(ncyb<Comparable<?>> ncybVar) {
            return ncybVar == this ? 0 : -1;
        }

        @Override // com.google.common.collect.ncyb
        void describeAsLowerBound(StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // com.google.common.collect.ncyb
        void describeAsUpperBound(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.ncyb
        Comparable<?> endpoint() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.ncyb
        Comparable<?> greatestValueBelow(AbstractC4324c<Comparable<?>> abstractC4324c) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.ncyb
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.ncyb
        boolean isLessThan(Comparable<?> comparable) {
            return true;
        }

        @Override // com.google.common.collect.ncyb
        Comparable<?> leastValueAbove(AbstractC4324c<Comparable<?>> abstractC4324c) {
            return abstractC4324c.minValue();
        }

        public String toString() {
            return "-∞";
        }

        @Override // com.google.common.collect.ncyb
        fu4 typeAsLowerBound() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.ncyb
        fu4 typeAsUpperBound() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.ncyb
        ncyb<Comparable<?>> withLowerBoundType(fu4 fu4Var, AbstractC4324c<Comparable<?>> abstractC4324c) {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.ncyb
        ncyb<Comparable<?>> withUpperBoundType(fu4 fu4Var, AbstractC4324c<Comparable<?>> abstractC4324c) {
            throw new AssertionError("this statement should be unreachable");
        }
    }

    /* JADX INFO: compiled from: Cut.java */
    private static final class toq extends ncyb<Comparable<?>> {

        /* JADX INFO: renamed from: k */
        private static final toq f26473k = new toq();
        private static final long serialVersionUID = 0;

        private toq() {
            super(null);
        }

        private Object readResolve() {
            return f26473k;
        }

        @Override // com.google.common.collect.ncyb, java.lang.Comparable
        public int compareTo(ncyb<Comparable<?>> ncybVar) {
            return ncybVar == this ? 0 : 1;
        }

        @Override // com.google.common.collect.ncyb
        void describeAsLowerBound(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.ncyb
        void describeAsUpperBound(StringBuilder sb) {
            sb.append("+∞)");
        }

        @Override // com.google.common.collect.ncyb
        Comparable<?> endpoint() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.ncyb
        Comparable<?> greatestValueBelow(AbstractC4324c<Comparable<?>> abstractC4324c) {
            return abstractC4324c.maxValue();
        }

        @Override // com.google.common.collect.ncyb
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.ncyb
        boolean isLessThan(Comparable<?> comparable) {
            return false;
        }

        @Override // com.google.common.collect.ncyb
        Comparable<?> leastValueAbove(AbstractC4324c<Comparable<?>> abstractC4324c) {
            throw new AssertionError();
        }

        public String toString() {
            return "+∞";
        }

        @Override // com.google.common.collect.ncyb
        fu4 typeAsLowerBound() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.ncyb
        fu4 typeAsUpperBound() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.ncyb
        ncyb<Comparable<?>> withLowerBoundType(fu4 fu4Var, AbstractC4324c<Comparable<?>> abstractC4324c) {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.ncyb
        ncyb<Comparable<?>> withUpperBoundType(fu4 fu4Var, AbstractC4324c<Comparable<?>> abstractC4324c) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: compiled from: Cut.java */
    private static final class zy<C extends Comparable> extends ncyb<C> {
        private static final long serialVersionUID = 0;

        zy(C c2) {
            super((Comparable) com.google.common.base.jk.a9(c2));
        }

        @Override // com.google.common.collect.ncyb
        ncyb<C> canonical(AbstractC4324c<C> abstractC4324c) {
            Comparable comparableLeastValueAbove = leastValueAbove(abstractC4324c);
            return comparableLeastValueAbove != null ? ncyb.belowValue(comparableLeastValueAbove) : ncyb.aboveAll();
        }

        @Override // com.google.common.collect.ncyb, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((ncyb) obj);
        }

        @Override // com.google.common.collect.ncyb
        void describeAsLowerBound(StringBuilder sb) {
            sb.append('(');
            sb.append(this.endpoint);
        }

        @Override // com.google.common.collect.ncyb
        void describeAsUpperBound(StringBuilder sb) {
            sb.append(this.endpoint);
            sb.append(']');
        }

        @Override // com.google.common.collect.ncyb
        C greatestValueBelow(AbstractC4324c<C> abstractC4324c) {
            return this.endpoint;
        }

        @Override // com.google.common.collect.ncyb
        public int hashCode() {
            return ~this.endpoint.hashCode();
        }

        @Override // com.google.common.collect.ncyb
        boolean isLessThan(C c2) {
            return ps.compareOrThrow(this.endpoint, c2) < 0;
        }

        @Override // com.google.common.collect.ncyb
        C leastValueAbove(AbstractC4324c<C> abstractC4324c) {
            return (C) abstractC4324c.next(this.endpoint);
        }

        public String toString() {
            return "/" + this.endpoint + "\\";
        }

        @Override // com.google.common.collect.ncyb
        fu4 typeAsLowerBound() {
            return fu4.OPEN;
        }

        @Override // com.google.common.collect.ncyb
        fu4 typeAsUpperBound() {
            return fu4.CLOSED;
        }

        @Override // com.google.common.collect.ncyb
        ncyb<C> withLowerBoundType(fu4 fu4Var, AbstractC4324c<C> abstractC4324c) {
            int i2 = C4470k.f26471k[fu4Var.ordinal()];
            if (i2 == 1) {
                Comparable next = abstractC4324c.next(this.endpoint);
                return next == null ? ncyb.belowAll() : ncyb.belowValue(next);
            }
            if (i2 == 2) {
                return this;
            }
            throw new AssertionError();
        }

        @Override // com.google.common.collect.ncyb
        ncyb<C> withUpperBoundType(fu4 fu4Var, AbstractC4324c<C> abstractC4324c) {
            int i2 = C4470k.f26471k[fu4Var.ordinal()];
            if (i2 == 1) {
                return this;
            }
            if (i2 != 2) {
                throw new AssertionError();
            }
            Comparable next = abstractC4324c.next(this.endpoint);
            return next == null ? ncyb.aboveAll() : ncyb.belowValue(next);
        }
    }

    ncyb(@NullableDecl C c2) {
        this.endpoint = c2;
    }

    static <C extends Comparable> ncyb<C> aboveAll() {
        return toq.f26473k;
    }

    static <C extends Comparable> ncyb<C> aboveValue(C c2) {
        return new zy(c2);
    }

    static <C extends Comparable> ncyb<C> belowAll() {
        return C4472q.f26472k;
    }

    static <C extends Comparable> ncyb<C> belowValue(C c2) {
        return new C4471n(c2);
    }

    ncyb<C> canonical(AbstractC4324c<C> abstractC4324c) {
        return this;
    }

    abstract void describeAsLowerBound(StringBuilder sb);

    abstract void describeAsUpperBound(StringBuilder sb);

    C endpoint() {
        return this.endpoint;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ncyb)) {
            return false;
        }
        try {
            return compareTo((ncyb) obj) == 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    abstract C greatestValueBelow(AbstractC4324c<C> abstractC4324c);

    public abstract int hashCode();

    abstract boolean isLessThan(C c2);

    abstract C leastValueAbove(AbstractC4324c<C> abstractC4324c);

    abstract fu4 typeAsLowerBound();

    abstract fu4 typeAsUpperBound();

    abstract ncyb<C> withLowerBoundType(fu4 fu4Var, AbstractC4324c<C> abstractC4324c);

    abstract ncyb<C> withUpperBoundType(fu4 fu4Var, AbstractC4324c<C> abstractC4324c);

    @Override // java.lang.Comparable
    public int compareTo(ncyb<C> ncybVar) {
        if (ncybVar == belowAll()) {
            return 1;
        }
        if (ncybVar == aboveAll()) {
            return -1;
        }
        int iCompareOrThrow = ps.compareOrThrow(this.endpoint, ncybVar.endpoint);
        return iCompareOrThrow != 0 ? iCompareOrThrow : C4739k.m16649q(this instanceof zy, ncybVar instanceof zy);
    }
}
