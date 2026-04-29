package com.google.common.collect;

import com.google.common.collect.ixz;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ContiguousSet.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public abstract class dd<C extends Comparable> extends ixz<C> {
    final AbstractC4324c<C> domain;

    dd(AbstractC4324c<C> abstractC4324c) {
        super(kx3.natural());
        this.domain = abstractC4324c;
    }

    @Deprecated
    public static <E> ixz.C4416k<E> builder() {
        throw new UnsupportedOperationException();
    }

    @InterfaceC7731k
    public static dd<Integer> closed(int i2, int i3) {
        return create(ps.closed(Integer.valueOf(i2), Integer.valueOf(i3)), AbstractC4324c.integers());
    }

    @InterfaceC7731k
    public static dd<Integer> closedOpen(int i2, int i3) {
        return create(ps.closedOpen(Integer.valueOf(i2), Integer.valueOf(i3)), AbstractC4324c.integers());
    }

    public static <C extends Comparable> dd<C> create(ps<C> psVar, AbstractC4324c<C> abstractC4324c) {
        com.google.common.base.jk.a9(psVar);
        com.google.common.base.jk.a9(abstractC4324c);
        try {
            ps<C> psVarIntersection = !psVar.hasLowerBound() ? psVar.intersection(ps.atLeast(abstractC4324c.minValue())) : psVar;
            if (!psVar.hasUpperBound()) {
                psVarIntersection = psVarIntersection.intersection(ps.atMost(abstractC4324c.maxValue()));
            }
            return psVarIntersection.isEmpty() || ps.compareOrThrow(psVar.lowerBound.leastValueAbove(abstractC4324c), psVar.upperBound.greatestValueBelow(abstractC4324c)) > 0 ? new lrht(abstractC4324c) : new uf(psVarIntersection, abstractC4324c);
        } catch (NoSuchElementException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // com.google.common.collect.ixz
    @wlev.zy
    ixz<C> createDescendingSet() {
        return new hyr(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ixz
    public abstract dd<C> headSetImpl(C c2, boolean z2);

    public abstract dd<C> intersection(dd<C> ddVar);

    public abstract ps<C> range();

    public abstract ps<C> range(fu4 fu4Var, fu4 fu4Var2);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ixz
    public abstract dd<C> subSetImpl(C c2, boolean z2, C c3, boolean z3);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ixz
    public abstract dd<C> tailSetImpl(C c2, boolean z2);

    @Override // java.util.AbstractCollection
    public String toString() {
        return range().toString();
    }

    @InterfaceC7731k
    public static dd<Long> closed(long j2, long j3) {
        return create(ps.closed(Long.valueOf(j2), Long.valueOf(j3)), AbstractC4324c.longs());
    }

    @InterfaceC7731k
    public static dd<Long> closedOpen(long j2, long j3) {
        return create(ps.closedOpen(Long.valueOf(j2), Long.valueOf(j3)), AbstractC4324c.longs());
    }

    @Override // com.google.common.collect.ixz, java.util.NavigableSet, java.util.SortedSet
    public dd<C> headSet(C c2) {
        return headSetImpl((Comparable) com.google.common.base.jk.a9(c2), false);
    }

    @Override // com.google.common.collect.ixz, java.util.NavigableSet, java.util.SortedSet
    public dd<C> subSet(C c2, C c3) {
        com.google.common.base.jk.a9(c2);
        com.google.common.base.jk.a9(c3);
        com.google.common.base.jk.m15383q(comparator().compare(c2, c3) <= 0);
        return subSetImpl((Comparable) c2, true, (Comparable) c3, false);
    }

    @Override // com.google.common.collect.ixz, java.util.NavigableSet, java.util.SortedSet
    public dd<C> tailSet(C c2) {
        return tailSetImpl((Comparable) com.google.common.base.jk.a9(c2), true);
    }

    @Override // com.google.common.collect.ixz, java.util.NavigableSet
    @wlev.zy
    public dd<C> headSet(C c2, boolean z2) {
        return headSetImpl((Comparable) com.google.common.base.jk.a9(c2), z2);
    }

    @Override // com.google.common.collect.ixz, java.util.NavigableSet
    @wlev.zy
    public dd<C> tailSet(C c2, boolean z2) {
        return tailSetImpl((Comparable) com.google.common.base.jk.a9(c2), z2);
    }

    @Override // com.google.common.collect.ixz, java.util.NavigableSet
    @wlev.zy
    public dd<C> subSet(C c2, boolean z2, C c3, boolean z3) {
        com.google.common.base.jk.a9(c2);
        com.google.common.base.jk.a9(c3);
        com.google.common.base.jk.m15383q(comparator().compare(c2, c3) <= 0);
        return subSetImpl((Comparable) c2, z2, (Comparable) c3, z3);
    }
}
