package com.google.common.collect;

import com.google.common.collect.ob;
import com.google.common.collect.se;
import com.google.common.primitives.C4746s;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ImmutableRangeSet.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class h7am<C extends Comparable> extends ld6<C> implements Serializable {

    /* JADX INFO: renamed from: k */
    private final transient se<ps<C>> f26188k;

    /* JADX INFO: renamed from: q */
    @LazyInit
    private transient h7am<C> f26189q;

    /* JADX INFO: renamed from: n */
    private static final h7am<Comparable<?>> f26187n = new h7am<>(se.of());

    /* JADX INFO: renamed from: g */
    private static final h7am<Comparable<?>> f26186g = new h7am<>(se.of(ps.all()));

    /* JADX INFO: renamed from: com.google.common.collect.h7am$g */
    /* JADX INFO: compiled from: ImmutableRangeSet.java */
    private static final class C4401g<C extends Comparable> implements Serializable {
        private final se<ps<C>> ranges;

        C4401g(se<ps<C>> seVar) {
            this.ranges = seVar;
        }

        Object readResolve() {
            return this.ranges.isEmpty() ? h7am.of() : this.ranges.equals(se.of(ps.all())) ? h7am.all() : new h7am(this.ranges);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.h7am$k */
    /* JADX INFO: compiled from: ImmutableRangeSet.java */
    class C4402k extends se<ps<C>> {
        final /* synthetic */ int val$fromIndex;
        final /* synthetic */ int val$length;
        final /* synthetic */ ps val$range;

        C4402k(int i2, int i3, ps psVar) {
            this.val$length = i2;
            this.val$fromIndex = i3;
            this.val$range = psVar;
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.val$length;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public ps<C> get(int i2) {
            com.google.common.base.jk.mcp(i2, this.val$length);
            return (i2 == 0 || i2 == this.val$length + (-1)) ? ((ps) h7am.this.f26188k.get(i2 + this.val$fromIndex)).intersection(this.val$range) : (ps) h7am.this.f26188k.get(i2 + this.val$fromIndex);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.h7am$n */
    /* JADX INFO: compiled from: ImmutableRangeSet.java */
    private final class C4403n extends se<ps<C>> {
        private final boolean positiveBoundedAbove;
        private final boolean positiveBoundedBelow;
        private final int size;

        /* JADX WARN: Multi-variable type inference failed */
        C4403n() {
            boolean zHasLowerBound = ((ps) h7am.this.f26188k.get(0)).hasLowerBound();
            this.positiveBoundedBelow = zHasLowerBound;
            boolean zHasUpperBound = ((ps) nsb.ni7(h7am.this.f26188k)).hasUpperBound();
            this.positiveBoundedAbove = zHasUpperBound;
            int size = h7am.this.f26188k.size() - 1;
            size = zHasLowerBound ? size + 1 : size;
            this.size = zHasUpperBound ? size + 1 : size;
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.size;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public ps<C> get(int i2) {
            com.google.common.base.jk.mcp(i2, this.size);
            return ps.create(this.positiveBoundedBelow ? i2 == 0 ? ncyb.belowAll() : ((ps) h7am.this.f26188k.get(i2 - 1)).upperBound : ((ps) h7am.this.f26188k.get(i2)).upperBound, (this.positiveBoundedAbove && i2 == this.size + (-1)) ? ncyb.aboveAll() : ((ps) h7am.this.f26188k.get(i2 + (!this.positiveBoundedBelow ? 1 : 0))).lowerBound);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.h7am$q */
    /* JADX INFO: compiled from: ImmutableRangeSet.java */
    public static class C4404q<C extends Comparable<?>> {

        /* JADX INFO: renamed from: k */
        private final List<ps<C>> f26190k = wlev.cdj();

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: k */
        public C4404q<C> m15736k(ps<C> psVar) {
            com.google.common.base.jk.fn3e(!psVar.isEmpty(), "range must not be empty, but was %s", psVar);
            this.f26190k.add(psVar);
            return this;
        }

        /* JADX INFO: renamed from: q */
        public h7am<C> m15737q() {
            se.C4520k c4520k = new se.C4520k(this.f26190k.size());
            Collections.sort(this.f26190k, ps.rangeLexOrdering());
            InterfaceC4555w interfaceC4555wHyr = zwy.hyr(this.f26190k.iterator());
            while (interfaceC4555wHyr.hasNext()) {
                ps psVarSpan = (ps) interfaceC4555wHyr.next();
                while (interfaceC4555wHyr.hasNext()) {
                    ps<C> psVar = (ps) interfaceC4555wHyr.peek();
                    if (psVarSpan.isConnected(psVar)) {
                        com.google.common.base.jk.m15391z(psVarSpan.intersection(psVar).isEmpty(), "Overlapping ranges not permitted but found %s overlapping %s", psVarSpan, psVar);
                        psVarSpan = psVarSpan.span((ps) interfaceC4555wHyr.next());
                    }
                }
                c4520k.mo15569k(psVarSpan);
            }
            se seVarMo15570n = c4520k.mo15570n();
            return seVarMo15570n.isEmpty() ? h7am.of() : (seVarMo15570n.size() == 1 && ((ps) nsb.o1t(seVarMo15570n)).equals(ps.all())) ? h7am.all() : new h7am<>(seVarMo15570n);
        }

        @CanIgnoreReturnValue
        public C4404q<C> toq(nnh<C> nnhVar) {
            return zy(nnhVar.asRanges());
        }

        @CanIgnoreReturnValue
        public C4404q<C> zy(Iterable<ps<C>> iterable) {
            Iterator<ps<C>> it = iterable.iterator();
            while (it.hasNext()) {
                m15736k(it.next());
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: ImmutableRangeSet.java */
    private final class toq extends ixz<C> {
        private final AbstractC4324c<C> domain;

        /* JADX INFO: renamed from: y */
        @MonotonicNonNullDecl
        private transient Integer f26191y;

        /* JADX INFO: renamed from: com.google.common.collect.h7am$toq$k */
        /* JADX INFO: compiled from: ImmutableRangeSet.java */
        class C4405k extends com.google.common.collect.zy<C> {

            /* JADX INFO: renamed from: g */
            Iterator<C> f26192g = zwy.fn3e();

            /* JADX INFO: renamed from: n */
            final Iterator<ps<C>> f26193n;

            C4405k() {
                this.f26193n = h7am.this.f26188k.iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public C mo15703k() {
                while (!this.f26192g.hasNext()) {
                    if (!this.f26193n.hasNext()) {
                        return (C) toq();
                    }
                    this.f26192g = dd.create(this.f26193n.next(), toq.this.domain).iterator();
                }
                return this.f26192g.next();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.h7am$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ImmutableRangeSet.java */
        class C7988toq extends com.google.common.collect.zy<C> {

            /* JADX INFO: renamed from: g */
            Iterator<C> f26195g = zwy.fn3e();

            /* JADX INFO: renamed from: n */
            final Iterator<ps<C>> f26196n;

            C7988toq() {
                this.f26196n = h7am.this.f26188k.reverse().iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public C mo15703k() {
                while (!this.f26195g.hasNext()) {
                    if (!this.f26196n.hasNext()) {
                        return (C) toq();
                    }
                    this.f26195g = dd.create(this.f26196n.next(), toq.this.domain).descendingIterator();
                }
                return this.f26195g.next();
            }
        }

        toq(AbstractC4324c<C> abstractC4324c) {
            super(kx3.natural());
            this.domain = abstractC4324c;
        }

        @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
        public boolean contains(@NullableDecl Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return h7am.this.contains((Comparable) obj);
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // com.google.common.collect.ixz
        ixz<C> createDescendingSet() {
            return new hyr(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ixz
        int indexOf(Object obj) {
            if (!contains(obj)) {
                return -1;
            }
            Comparable comparable = (Comparable) obj;
            long size = 0;
            ab it = h7am.this.f26188k.iterator();
            while (it.hasNext()) {
                ps psVar = (ps) it.next();
                if (psVar.contains(comparable)) {
                    return C4746s.fu4(size + ((long) dd.create(psVar, this.domain).indexOf(comparable)));
                }
                size += (long) dd.create(psVar, this.domain).size();
            }
            throw new AssertionError("impossible");
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return h7am.this.f26188k.isPartialView();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Integer numValueOf = this.f26191y;
            if (numValueOf == null) {
                long size = 0;
                ab it = h7am.this.f26188k.iterator();
                while (it.hasNext()) {
                    size += (long) dd.create((ps) it.next(), this.domain).size();
                    if (size >= 2147483647L) {
                        break;
                    }
                }
                numValueOf = Integer.valueOf(C4746s.fu4(size));
                this.f26191y = numValueOf;
            }
            return numValueOf.intValue();
        }

        ixz<C> subSet(ps<C> psVar) {
            return h7am.this.subRangeSet((ps) psVar).asSet(this.domain);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return h7am.this.f26188k.toString();
        }

        @Override // com.google.common.collect.ixz, com.google.common.collect.vep5, com.google.common.collect.z4
        Object writeReplace() {
            return new zy(h7am.this.f26188k, this.domain);
        }

        @Override // com.google.common.collect.ixz, java.util.NavigableSet
        @wlev.zy("NavigableSet")
        public ab<C> descendingIterator() {
            return new C7988toq();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ixz
        public ixz<C> headSetImpl(C c2, boolean z2) {
            return subSet(ps.upTo(c2, fu4.forBoolean(z2)));
        }

        @Override // com.google.common.collect.ixz, com.google.common.collect.vep5, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
        public ab<C> iterator() {
            return new C4405k();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ixz
        public ixz<C> subSetImpl(C c2, boolean z2, C c3, boolean z3) {
            return (z2 || z3 || ps.compareOrThrow(c2, c3) != 0) ? subSet(ps.range(c2, fu4.forBoolean(z2), c3, fu4.forBoolean(z3))) : ixz.of();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ixz
        public ixz<C> tailSetImpl(C c2, boolean z2) {
            return subSet(ps.downTo(c2, fu4.forBoolean(z2)));
        }
    }

    /* JADX INFO: compiled from: ImmutableRangeSet.java */
    private static class zy<C extends Comparable> implements Serializable {
        private final AbstractC4324c<C> domain;
        private final se<ps<C>> ranges;

        zy(se<ps<C>> seVar, AbstractC4324c<C> abstractC4324c) {
            this.ranges = seVar;
            this.domain = abstractC4324c;
        }

        Object readResolve() {
            return new h7am(this.ranges).asSet(this.domain);
        }
    }

    h7am(se<ps<C>> seVar) {
        this.f26188k = seVar;
    }

    static <C extends Comparable> h7am<C> all() {
        return f26186g;
    }

    public static <C extends Comparable<?>> C4404q<C> builder() {
        return new C4404q<>();
    }

    public static <C extends Comparable> h7am<C> copyOf(nnh<C> nnhVar) {
        com.google.common.base.jk.a9(nnhVar);
        if (nnhVar.isEmpty()) {
            return of();
        }
        if (nnhVar.encloses(ps.all())) {
            return all();
        }
        if (nnhVar instanceof h7am) {
            h7am<C> h7amVar = (h7am) nnhVar;
            if (!h7amVar.isPartialView()) {
                return h7amVar;
            }
        }
        return new h7am<>(se.copyOf((Collection) nnhVar.asRanges()));
    }

    /* JADX INFO: renamed from: k */
    private se<ps<C>> m15735k(ps<C> psVar) {
        if (this.f26188k.isEmpty() || psVar.isEmpty()) {
            return se.of();
        }
        if (psVar.encloses(span())) {
            return this.f26188k;
        }
        int iM15920k = psVar.hasLowerBound() ? ob.m15920k(this.f26188k, ps.upperBoundFn(), psVar.lowerBound, ob.zy.FIRST_AFTER, ob.toq.NEXT_HIGHER) : 0;
        int iM15920k2 = (psVar.hasUpperBound() ? ob.m15920k(this.f26188k, ps.lowerBoundFn(), psVar.upperBound, ob.zy.FIRST_PRESENT, ob.toq.NEXT_HIGHER) : this.f26188k.size()) - iM15920k;
        return iM15920k2 == 0 ? se.of() : new C4402k(iM15920k2, iM15920k, psVar);
    }

    public static <C extends Comparable> h7am<C> of() {
        return f26187n;
    }

    public static <C extends Comparable<?>> h7am<C> unionOf(Iterable<ps<C>> iterable) {
        return copyOf(xzl.create(iterable));
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    @Deprecated
    public void add(ps<C> psVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    @Deprecated
    public void addAll(nnh<C> nnhVar) {
        throw new UnsupportedOperationException();
    }

    public ixz<C> asSet(AbstractC4324c<C> abstractC4324c) {
        com.google.common.base.jk.a9(abstractC4324c);
        if (isEmpty()) {
            return ixz.of();
        }
        ps<C> psVarCanonical = span().canonical(abstractC4324c);
        if (!psVarCanonical.hasLowerBound()) {
            throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
        }
        if (!psVarCanonical.hasUpperBound()) {
            try {
                abstractC4324c.maxValue();
            } catch (NoSuchElementException unused) {
                throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
            }
        }
        return new toq(abstractC4324c);
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    public h7am<C> difference(nnh<C> nnhVar) {
        xzl xzlVarCreate = xzl.create(this);
        xzlVarCreate.removeAll(nnhVar);
        return copyOf(xzlVarCreate);
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public boolean encloses(ps<C> psVar) {
        int qVar = ob.toq(this.f26188k, ps.lowerBoundFn(), psVar.lowerBound, kx3.natural(), ob.zy.ANY_PRESENT, ob.toq.NEXT_LOWER);
        return qVar != -1 && this.f26188k.get(qVar).encloses(psVar);
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public /* bridge */ /* synthetic */ boolean enclosesAll(nnh nnhVar) {
        return super.enclosesAll(nnhVar);
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public h7am<C> intersection(nnh<C> nnhVar) {
        xzl xzlVarCreate = xzl.create(this);
        xzlVarCreate.removeAll(nnhVar.complement());
        return copyOf(xzlVarCreate);
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public boolean intersects(ps<C> psVar) {
        int qVar = ob.toq(this.f26188k, ps.lowerBoundFn(), psVar.lowerBound, kx3.natural(), ob.zy.ANY_PRESENT, ob.toq.NEXT_HIGHER);
        if (qVar < this.f26188k.size() && this.f26188k.get(qVar).isConnected(psVar) && !this.f26188k.get(qVar).intersection(psVar).isEmpty()) {
            return true;
        }
        if (qVar > 0) {
            int i2 = qVar - 1;
            if (this.f26188k.get(i2).isConnected(psVar) && !this.f26188k.get(i2).intersection(psVar).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public boolean isEmpty() {
        return this.f26188k.isEmpty();
    }

    boolean isPartialView() {
        return this.f26188k.isPartialView();
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public ps<C> rangeContaining(C c2) {
        int qVar = ob.toq(this.f26188k, ps.lowerBoundFn(), ncyb.belowValue(c2), kx3.natural(), ob.zy.ANY_PRESENT, ob.toq.NEXT_LOWER);
        if (qVar == -1) {
            return null;
        }
        ps<C> psVar = this.f26188k.get(qVar);
        if (psVar.contains(c2)) {
            return psVar;
        }
        return null;
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    @Deprecated
    public void remove(ps<C> psVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    @Deprecated
    public void removeAll(nnh<C> nnhVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.nnh
    public ps<C> span() {
        if (this.f26188k.isEmpty()) {
            throw new NoSuchElementException();
        }
        return ps.create(this.f26188k.get(0).lowerBound, this.f26188k.get(r1.size() - 1).upperBound);
    }

    public h7am<C> union(nnh<C> nnhVar) {
        return unionOf(nsb.m15902g(asRanges(), nnhVar.asRanges()));
    }

    Object writeReplace() {
        return new C4401g(this.f26188k);
    }

    public static <C extends Comparable> h7am<C> of(ps<C> psVar) {
        com.google.common.base.jk.a9(psVar);
        return psVar.isEmpty() ? of() : psVar.equals(ps.all()) ? all() : new h7am<>(se.of(psVar));
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    @Deprecated
    public void addAll(Iterable<ps<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.nnh
    public vep5<ps<C>> asDescendingSetOfRanges() {
        return this.f26188k.isEmpty() ? vep5.of() : new l05(this.f26188k.reverse(), ps.rangeLexOrdering().reverse());
    }

    @Override // com.google.common.collect.nnh
    public vep5<ps<C>> asRanges() {
        return this.f26188k.isEmpty() ? vep5.of() : new l05(this.f26188k, ps.rangeLexOrdering());
    }

    @Override // com.google.common.collect.nnh
    public h7am<C> complement() {
        h7am<C> h7amVar = this.f26189q;
        if (h7amVar != null) {
            return h7amVar;
        }
        if (this.f26188k.isEmpty()) {
            h7am<C> h7amVarAll = all();
            this.f26189q = h7amVarAll;
            return h7amVarAll;
        }
        if (this.f26188k.size() == 1 && this.f26188k.get(0).equals(ps.all())) {
            h7am<C> h7amVarOf = of();
            this.f26189q = h7amVarOf;
            return h7amVarOf;
        }
        h7am<C> h7amVar2 = new h7am<>(new C4403n(), this);
        this.f26189q = h7amVar2;
        return h7amVar2;
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    @Deprecated
    public void removeAll(Iterable<ps<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.nnh
    public h7am<C> subRangeSet(ps<C> psVar) {
        if (!isEmpty()) {
            ps<C> psVarSpan = span();
            if (psVar.encloses(psVarSpan)) {
                return this;
            }
            if (psVar.isConnected(psVarSpan)) {
                return new h7am<>(m15735k(psVar));
            }
        }
        return of();
    }

    private h7am(se<ps<C>> seVar, h7am<C> h7amVar) {
        this.f26188k = seVar;
        this.f26189q = h7amVar;
    }

    public static <C extends Comparable<?>> h7am<C> copyOf(Iterable<ps<C>> iterable) {
        return new C4404q().zy(iterable).m15737q();
    }
}
