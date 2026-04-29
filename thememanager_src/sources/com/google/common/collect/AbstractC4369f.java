package com.google.common.collect;

import com.google.common.collect.kq2f;
import com.google.common.collect.m58i;
import com.google.common.collect.o05;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* JADX INFO: renamed from: com.google.common.collect.f */
/* JADX INFO: compiled from: DescendingMultiset.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
abstract class AbstractC4369f<E> extends AbstractC4333d<E> implements gb<E> {

    /* JADX INFO: renamed from: k */
    @MonotonicNonNullDecl
    private transient Comparator<? super E> f26113k;

    /* JADX INFO: renamed from: n */
    @MonotonicNonNullDecl
    private transient Set<o05.InterfaceC4482k<E>> f26114n;

    /* JADX INFO: renamed from: q */
    @MonotonicNonNullDecl
    private transient NavigableSet<E> f26115q;

    /* JADX INFO: renamed from: com.google.common.collect.f$k */
    /* JADX INFO: compiled from: DescendingMultiset.java */
    class k extends m58i.AbstractC4457s<E> {
        k() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<o05.InterfaceC4482k<E>> iterator() {
            return AbstractC4369f.this.x2();
        }

        @Override // com.google.common.collect.m58i.AbstractC4457s
        /* JADX INFO: renamed from: k */
        o05<E> mo15679k() {
            return AbstractC4369f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC4369f.this.kja0().entrySet().size();
        }
    }

    AbstractC4369f() {
    }

    @Override // com.google.common.collect.gb, com.google.common.collect.f1bi
    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.f26113k;
        if (comparator != null) {
            return comparator;
        }
        kx3 kx3VarReverse = kx3.from(kja0().comparator()).reverse();
        this.f26113k = kx3VarReverse;
        return kx3VarReverse;
    }

    @Override // com.google.common.collect.gb
    public gb<E> descendingMultiset() {
        return kja0();
    }

    @Override // com.google.common.collect.AbstractC4333d, com.google.common.collect.o05
    public Set<o05.InterfaceC4482k<E>> entrySet() {
        Set<o05.InterfaceC4482k<E>> set = this.f26114n;
        if (set != null) {
            return set;
        }
        Set<o05.InterfaceC4482k<E>> setLd6 = ld6();
        this.f26114n = setLd6;
        return setLd6;
    }

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> firstEntry() {
        return kja0().lastEntry();
    }

    @Override // com.google.common.collect.gb
    public gb<E> headMultiset(E e2, fu4 fu4Var) {
        return kja0().tailMultiset(e2, fu4Var).descendingMultiset();
    }

    @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m58i.n7h(this);
    }

    abstract gb<E> kja0();

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> lastEntry() {
        return kja0().firstEntry();
    }

    Set<o05.InterfaceC4482k<E>> ld6() {
        return new k();
    }

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> pollFirstEntry() {
        return kja0().pollLastEntry();
    }

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> pollLastEntry() {
        return kja0().pollFirstEntry();
    }

    @Override // com.google.common.collect.gb
    public gb<E> subMultiset(E e2, fu4 fu4Var, E e3, fu4 fu4Var2) {
        return kja0().subMultiset(e3, fu4Var2, e2, fu4Var).descendingMultiset();
    }

    @Override // com.google.common.collect.gb
    public gb<E> tailMultiset(E e2, fu4 fu4Var) {
        return kja0().headMultiset(e2, fu4Var).descendingMultiset();
    }

    @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return standardToArray();
    }

    @Override // com.google.common.collect.qkj8, com.google.common.collect.o05
    public String toString() {
        return entrySet().toString();
    }

    abstract Iterator<o05.InterfaceC4482k<E>> x2();

    @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) standardToArray(tArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.AbstractC4333d, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
    public o05<E> delegate() {
        return kja0();
    }

    @Override // com.google.common.collect.AbstractC4333d, com.google.common.collect.o05
    public NavigableSet<E> elementSet() {
        NavigableSet<E> navigableSet = this.f26115q;
        if (navigableSet != null) {
            return navigableSet;
        }
        kq2f.toq toqVar = new kq2f.toq(this);
        this.f26115q = toqVar;
        return toqVar;
    }
}
