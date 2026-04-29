package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: RegularContiguousSet.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
final class uf<C extends Comparable> extends dd<C> {
    private static final long serialVersionUID = 0;
    private final ps<C> range;

    /* JADX INFO: renamed from: com.google.common.collect.uf$k */
    /* JADX INFO: compiled from: RegularContiguousSet.java */
    class C4527k extends x2<C> {

        /* JADX INFO: renamed from: q */
        final C f26599q;

        C4527k(Comparable comparable) {
            super(comparable);
            this.f26599q = (C) uf.this.last();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.x2
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public C mo15494k(C c2) {
            if (uf.zy(c2, this.f26599q)) {
                return null;
            }
            return (C) uf.this.domain.next(c2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.uf$q */
    /* JADX INFO: compiled from: RegularContiguousSet.java */
    @wlev.zy
    private static final class C4528q<C extends Comparable> implements Serializable {
        final AbstractC4324c<C> domain;
        final ps<C> range;

        /* synthetic */ C4528q(ps psVar, AbstractC4324c abstractC4324c, C4527k c4527k) {
            this(psVar, abstractC4324c);
        }

        private Object readResolve() {
            return new uf(this.range, this.domain);
        }

        private C4528q(ps<C> psVar, AbstractC4324c<C> abstractC4324c) {
            this.range = psVar;
            this.domain = abstractC4324c;
        }
    }

    /* JADX INFO: compiled from: RegularContiguousSet.java */
    class toq extends x2<C> {

        /* JADX INFO: renamed from: q */
        final C f26601q;

        toq(Comparable comparable) {
            super(comparable);
            this.f26601q = (C) uf.this.first();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.x2
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public C mo15494k(C c2) {
            if (uf.zy(c2, this.f26601q)) {
                return null;
            }
            return (C) uf.this.domain.previous(c2);
        }
    }

    /* JADX INFO: compiled from: RegularContiguousSet.java */
    class zy extends sok<C> {
        zy() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.sok
        public ixz<C> delegateCollection() {
            return uf.this;
        }

        @Override // java.util.List
        public C get(int i2) {
            com.google.common.base.jk.mcp(i2, size());
            uf ufVar = uf.this;
            return (C) ufVar.domain.offset(ufVar.first(), i2);
        }
    }

    uf(ps<C> psVar, AbstractC4324c<C> abstractC4324c) {
        super(abstractC4324c);
        this.range = psVar;
    }

    /* JADX INFO: renamed from: n */
    private dd<C> m15998n(ps<C> psVar) {
        return this.range.isConnected(psVar) ? dd.create(this.range.intersection(psVar), this.domain) : new lrht(this.domain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zy(Comparable<?> comparable, @NullableDecl Comparable<?> comparable2) {
        return comparable2 != null && ps.compareOrThrow(comparable, comparable2) == 0;
    }

    @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public boolean contains(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.range.contains((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return mcp.zy(this, collection);
    }

    @Override // com.google.common.collect.vep5
    se<C> createAsList() {
        return this.domain.supportsFastOffset ? new zy() : super.createAsList();
    }

    @Override // com.google.common.collect.vep5, java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uf) {
            uf ufVar = (uf) obj;
            if (this.domain.equals(ufVar.domain)) {
                return first().equals(ufVar.first()) && last().equals(ufVar.last());
            }
        }
        return super.equals(obj);
    }

    @Override // com.google.common.collect.vep5, java.util.Collection, java.util.Set
    public int hashCode() {
        return g0ad.ld6(this);
    }

    @Override // com.google.common.collect.ixz
    @wlev.zy
    int indexOf(Object obj) {
        if (contains(obj)) {
            return (int) this.domain.distance(first(), (Comparable) obj);
        }
        return -1;
    }

    @Override // com.google.common.collect.dd
    public dd<C> intersection(dd<C> ddVar) {
        com.google.common.base.jk.a9(ddVar);
        com.google.common.base.jk.m15383q(this.domain.equals(ddVar.domain));
        if (ddVar.isEmpty()) {
            return ddVar;
        }
        Comparable comparable = (Comparable) kx3.natural().max(first(), ddVar.first());
        Comparable comparable2 = (Comparable) kx3.natural().min(last(), ddVar.last());
        return comparable.compareTo(comparable2) <= 0 ? dd.create(ps.closed(comparable, comparable2), this.domain) : new lrht(this.domain);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.z4
    boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.dd
    public ps<C> range() {
        fu4 fu4Var = fu4.CLOSED;
        return range(fu4Var, fu4Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        long jDistance = this.domain.distance(first(), last());
        if (jDistance >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) jDistance) + 1;
    }

    @Override // com.google.common.collect.ixz, com.google.common.collect.vep5, com.google.common.collect.z4
    @wlev.zy
    Object writeReplace() {
        return new C4528q(this.range, this.domain, null);
    }

    @Override // com.google.common.collect.ixz, java.util.NavigableSet
    @wlev.zy
    public ab<C> descendingIterator() {
        return new toq(last());
    }

    @Override // com.google.common.collect.ixz, java.util.SortedSet
    public C first() {
        return (C) this.range.lowerBound.leastValueAbove(this.domain);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.dd, com.google.common.collect.ixz
    public dd<C> headSetImpl(C c2, boolean z2) {
        return m15998n(ps.upTo(c2, fu4.forBoolean(z2)));
    }

    @Override // com.google.common.collect.ixz, com.google.common.collect.vep5, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
    public ab<C> iterator() {
        return new C4527k(first());
    }

    @Override // com.google.common.collect.ixz, java.util.SortedSet
    public C last() {
        return (C) this.range.upperBound.greatestValueBelow(this.domain);
    }

    @Override // com.google.common.collect.dd
    public ps<C> range(fu4 fu4Var, fu4 fu4Var2) {
        return ps.create(this.range.lowerBound.withLowerBoundType(fu4Var, this.domain), this.range.upperBound.withUpperBoundType(fu4Var2, this.domain));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.dd, com.google.common.collect.ixz
    public dd<C> subSetImpl(C c2, boolean z2, C c3, boolean z3) {
        return (c2.compareTo(c3) != 0 || z2 || z3) ? m15998n(ps.range(c2, fu4.forBoolean(z2), c3, fu4.forBoolean(z3))) : new lrht(this.domain);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.dd, com.google.common.collect.ixz
    public dd<C> tailSetImpl(C c2, boolean z2) {
        return m15998n(ps.downTo(c2, fu4.forBoolean(z2)));
    }
}
