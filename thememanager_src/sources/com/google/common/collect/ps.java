package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: Range.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class ps<C extends Comparable> extends v5yj implements com.google.common.base.a9<C>, Serializable {

    /* JADX INFO: renamed from: k */
    private static final ps<Comparable> f26573k = new ps<>(ncyb.belowAll(), ncyb.aboveAll());
    private static final long serialVersionUID = 0;
    final ncyb<C> lowerBound;
    final ncyb<C> upperBound;

    /* JADX INFO: renamed from: com.google.common.collect.ps$k */
    /* JADX INFO: compiled from: Range.java */
    static /* synthetic */ class C4514k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f26574k;

        static {
            int[] iArr = new int[fu4.values().length];
            f26574k = iArr;
            try {
                iArr[fu4.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26574k[fu4.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ps$q */
    /* JADX INFO: compiled from: Range.java */
    static class C4515q implements com.google.common.base.t8r<ps, ncyb> {

        /* JADX INFO: renamed from: k */
        static final C4515q f26575k = new C4515q();

        C4515q() {
        }

        @Override // com.google.common.base.t8r
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ncyb apply(ps psVar) {
            return psVar.upperBound;
        }
    }

    /* JADX INFO: compiled from: Range.java */
    static class toq implements com.google.common.base.t8r<ps, ncyb> {

        /* JADX INFO: renamed from: k */
        static final toq f26576k = new toq();

        toq() {
        }

        @Override // com.google.common.base.t8r
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ncyb apply(ps psVar) {
            return psVar.lowerBound;
        }
    }

    /* JADX INFO: compiled from: Range.java */
    private static class zy extends kx3<ps<?>> implements Serializable {
        static final kx3<ps<?>> INSTANCE = new zy();
        private static final long serialVersionUID = 0;

        private zy() {
        }

        @Override // com.google.common.collect.kx3, java.util.Comparator
        public int compare(ps<?> psVar, ps<?> psVar2) {
            return oc.n7h().mo15927s(psVar.lowerBound, psVar2.lowerBound).mo15927s(psVar.upperBound, psVar2.upperBound).qrj();
        }
    }

    private ps(ncyb<C> ncybVar, ncyb<C> ncybVar2) {
        this.lowerBound = (ncyb) com.google.common.base.jk.a9(ncybVar);
        this.upperBound = (ncyb) com.google.common.base.jk.a9(ncybVar2);
        if (ncybVar.compareTo((ncyb) ncybVar2) > 0 || ncybVar == ncyb.aboveAll() || ncybVar2 == ncyb.belowAll()) {
            throw new IllegalArgumentException("Invalid range: " + toq(ncybVar, ncybVar2));
        }
    }

    public static <C extends Comparable<?>> ps<C> all() {
        return (ps<C>) f26573k;
    }

    public static <C extends Comparable<?>> ps<C> atLeast(C c2) {
        return create(ncyb.belowValue(c2), ncyb.aboveAll());
    }

    public static <C extends Comparable<?>> ps<C> atMost(C c2) {
        return create(ncyb.belowAll(), ncyb.aboveValue(c2));
    }

    public static <C extends Comparable<?>> ps<C> closed(C c2, C c3) {
        return create(ncyb.belowValue(c2), ncyb.aboveValue(c3));
    }

    public static <C extends Comparable<?>> ps<C> closedOpen(C c2, C c3) {
        return create(ncyb.belowValue(c2), ncyb.belowValue(c3));
    }

    static int compareOrThrow(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    static <C extends Comparable<?>> ps<C> create(ncyb<C> ncybVar, ncyb<C> ncybVar2) {
        return new ps<>(ncybVar, ncybVar2);
    }

    public static <C extends Comparable<?>> ps<C> downTo(C c2, fu4 fu4Var) {
        int i2 = C4514k.f26574k[fu4Var.ordinal()];
        if (i2 == 1) {
            return greaterThan(c2);
        }
        if (i2 == 2) {
            return atLeast(c2);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> ps<C> encloseAll(Iterable<C> iterable) {
        com.google.common.base.jk.a9(iterable);
        if (iterable instanceof SortedSet) {
            SortedSet sortedSetM15969k = m15969k(iterable);
            Comparator comparator = sortedSetM15969k.comparator();
            if (kx3.natural().equals(comparator) || comparator == null) {
                return closed((Comparable) sortedSetM15969k.first(), (Comparable) sortedSetM15969k.last());
            }
        }
        Iterator<C> it = iterable.iterator();
        Comparable comparable = (Comparable) com.google.common.base.jk.a9(it.next());
        Comparable comparable2 = comparable;
        while (it.hasNext()) {
            Comparable comparable3 = (Comparable) com.google.common.base.jk.a9(it.next());
            comparable = (Comparable) kx3.natural().min(comparable, comparable3);
            comparable2 = (Comparable) kx3.natural().max(comparable2, comparable3);
        }
        return closed(comparable, comparable2);
    }

    public static <C extends Comparable<?>> ps<C> greaterThan(C c2) {
        return create(ncyb.aboveValue(c2), ncyb.aboveAll());
    }

    /* JADX INFO: renamed from: k */
    private static <T> SortedSet<T> m15969k(Iterable<T> iterable) {
        return (SortedSet) iterable;
    }

    public static <C extends Comparable<?>> ps<C> lessThan(C c2) {
        return create(ncyb.belowAll(), ncyb.belowValue(c2));
    }

    static <C extends Comparable<?>> com.google.common.base.t8r<ps<C>, ncyb<C>> lowerBoundFn() {
        return toq.f26576k;
    }

    public static <C extends Comparable<?>> ps<C> open(C c2, C c3) {
        return create(ncyb.aboveValue(c2), ncyb.belowValue(c3));
    }

    public static <C extends Comparable<?>> ps<C> openClosed(C c2, C c3) {
        return create(ncyb.aboveValue(c2), ncyb.aboveValue(c3));
    }

    public static <C extends Comparable<?>> ps<C> range(C c2, fu4 fu4Var, C c3, fu4 fu4Var2) {
        com.google.common.base.jk.a9(fu4Var);
        com.google.common.base.jk.a9(fu4Var2);
        fu4 fu4Var3 = fu4.OPEN;
        return create(fu4Var == fu4Var3 ? ncyb.aboveValue(c2) : ncyb.belowValue(c2), fu4Var2 == fu4Var3 ? ncyb.belowValue(c3) : ncyb.aboveValue(c3));
    }

    static <C extends Comparable<?>> kx3<ps<C>> rangeLexOrdering() {
        return (kx3<ps<C>>) zy.INSTANCE;
    }

    public static <C extends Comparable<?>> ps<C> singleton(C c2) {
        return closed(c2, c2);
    }

    private static String toq(ncyb<?> ncybVar, ncyb<?> ncybVar2) {
        StringBuilder sb = new StringBuilder(16);
        ncybVar.describeAsLowerBound(sb);
        sb.append("..");
        ncybVar2.describeAsUpperBound(sb);
        return sb.toString();
    }

    public static <C extends Comparable<?>> ps<C> upTo(C c2, fu4 fu4Var) {
        int i2 = C4514k.f26574k[fu4Var.ordinal()];
        if (i2 == 1) {
            return lessThan(c2);
        }
        if (i2 == 2) {
            return atMost(c2);
        }
        throw new AssertionError();
    }

    static <C extends Comparable<?>> com.google.common.base.t8r<ps<C>, ncyb<C>> upperBoundFn() {
        return C4515q.f26575k;
    }

    public ps<C> canonical(AbstractC4324c<C> abstractC4324c) {
        com.google.common.base.jk.a9(abstractC4324c);
        ncyb<C> ncybVarCanonical = this.lowerBound.canonical(abstractC4324c);
        ncyb<C> ncybVarCanonical2 = this.upperBound.canonical(abstractC4324c);
        return (ncybVarCanonical == this.lowerBound && ncybVarCanonical2 == this.upperBound) ? this : create(ncybVarCanonical, ncybVarCanonical2);
    }

    public boolean contains(C c2) {
        com.google.common.base.jk.a9(c2);
        return this.lowerBound.isLessThan(c2) && !this.upperBound.isLessThan(c2);
    }

    public boolean containsAll(Iterable<? extends C> iterable) {
        if (nsb.mcp(iterable)) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSetM15969k = m15969k(iterable);
            Comparator comparator = sortedSetM15969k.comparator();
            if (kx3.natural().equals(comparator) || comparator == null) {
                return contains((Comparable) sortedSetM15969k.first()) && contains((Comparable) sortedSetM15969k.last());
            }
        }
        Iterator<? extends C> it = iterable.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean encloses(ps<C> psVar) {
        return this.lowerBound.compareTo((ncyb) psVar.lowerBound) <= 0 && this.upperBound.compareTo((ncyb) psVar.upperBound) >= 0;
    }

    @Override // com.google.common.base.a9
    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof ps)) {
            return false;
        }
        ps psVar = (ps) obj;
        return this.lowerBound.equals(psVar.lowerBound) && this.upperBound.equals(psVar.upperBound);
    }

    public ps<C> gap(ps<C> psVar) {
        boolean z2 = this.lowerBound.compareTo((ncyb) psVar.lowerBound) < 0;
        ps<C> psVar2 = z2 ? this : psVar;
        if (!z2) {
            psVar = this;
        }
        return create(psVar2.upperBound, psVar.lowerBound);
    }

    public boolean hasLowerBound() {
        return this.lowerBound != ncyb.belowAll();
    }

    public boolean hasUpperBound() {
        return this.upperBound != ncyb.aboveAll();
    }

    public int hashCode() {
        return (this.lowerBound.hashCode() * 31) + this.upperBound.hashCode();
    }

    public ps<C> intersection(ps<C> psVar) {
        int iCompareTo = this.lowerBound.compareTo((ncyb) psVar.lowerBound);
        int iCompareTo2 = this.upperBound.compareTo((ncyb) psVar.upperBound);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo > 0 || iCompareTo2 < 0) {
            return create(iCompareTo >= 0 ? this.lowerBound : psVar.lowerBound, iCompareTo2 <= 0 ? this.upperBound : psVar.upperBound);
        }
        return psVar;
    }

    public boolean isConnected(ps<C> psVar) {
        return this.lowerBound.compareTo((ncyb) psVar.upperBound) <= 0 && psVar.lowerBound.compareTo((ncyb) this.upperBound) <= 0;
    }

    public boolean isEmpty() {
        return this.lowerBound.equals(this.upperBound);
    }

    public fu4 lowerBoundType() {
        return this.lowerBound.typeAsLowerBound();
    }

    public C lowerEndpoint() {
        return (C) this.lowerBound.endpoint();
    }

    Object readResolve() {
        return equals(f26573k) ? all() : this;
    }

    public ps<C> span(ps<C> psVar) {
        int iCompareTo = this.lowerBound.compareTo((ncyb) psVar.lowerBound);
        int iCompareTo2 = this.upperBound.compareTo((ncyb) psVar.upperBound);
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return this;
        }
        if (iCompareTo < 0 || iCompareTo2 > 0) {
            return create(iCompareTo <= 0 ? this.lowerBound : psVar.lowerBound, iCompareTo2 >= 0 ? this.upperBound : psVar.upperBound);
        }
        return psVar;
    }

    public String toString() {
        return toq(this.lowerBound, this.upperBound);
    }

    public fu4 upperBoundType() {
        return this.upperBound.typeAsUpperBound();
    }

    public C upperEndpoint() {
        return (C) this.upperBound.endpoint();
    }

    @Override // com.google.common.base.a9
    @Deprecated
    public boolean apply(C c2) {
        return contains(c2);
    }
}
