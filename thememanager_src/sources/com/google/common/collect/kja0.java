package com.google.common.collect;

import com.google.common.collect.kq2f;
import com.google.common.collect.o05;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: AbstractSortedMultiset.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
abstract class kja0<E> extends AbstractC4519s<E> implements gb<E> {

    @py
    final Comparator<? super E> comparator;

    /* JADX INFO: renamed from: n */
    @MonotonicNonNullDecl
    private transient gb<E> f26276n;

    /* JADX INFO: renamed from: com.google.common.collect.kja0$k */
    /* JADX INFO: compiled from: AbstractSortedMultiset.java */
    class C4429k extends AbstractC4369f<E> {
        C4429k() {
        }

        @Override // com.google.common.collect.AbstractC4369f, com.google.common.collect.AbstractC4572x, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return kja0.this.descendingIterator();
        }

        @Override // com.google.common.collect.AbstractC4369f
        gb<E> kja0() {
            return kja0.this;
        }

        @Override // com.google.common.collect.AbstractC4369f
        Iterator<o05.InterfaceC4482k<E>> x2() {
            return kja0.this.descendingEntryIterator();
        }
    }

    kja0() {
        this(kx3.natural());
    }

    @Override // com.google.common.collect.gb, com.google.common.collect.f1bi
    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    gb<E> createDescendingMultiset() {
        return new C4429k();
    }

    abstract Iterator<o05.InterfaceC4482k<E>> descendingEntryIterator();

    Iterator<E> descendingIterator() {
        return m58i.n7h(descendingMultiset());
    }

    @Override // com.google.common.collect.gb
    public gb<E> descendingMultiset() {
        gb<E> gbVar = this.f26276n;
        if (gbVar != null) {
            return gbVar;
        }
        gb<E> gbVarCreateDescendingMultiset = createDescendingMultiset();
        this.f26276n = gbVarCreateDescendingMultiset;
        return gbVarCreateDescendingMultiset;
    }

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> firstEntry() {
        Iterator<o05.InterfaceC4482k<E>> itEntryIterator = entryIterator();
        if (itEntryIterator.hasNext()) {
            return itEntryIterator.next();
        }
        return null;
    }

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> lastEntry() {
        Iterator<o05.InterfaceC4482k<E>> itDescendingEntryIterator = descendingEntryIterator();
        if (itDescendingEntryIterator.hasNext()) {
            return itDescendingEntryIterator.next();
        }
        return null;
    }

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> pollFirstEntry() {
        Iterator<o05.InterfaceC4482k<E>> itEntryIterator = entryIterator();
        if (!itEntryIterator.hasNext()) {
            return null;
        }
        o05.InterfaceC4482k<E> next = itEntryIterator.next();
        o05.InterfaceC4482k<E> interfaceC4482kLd6 = m58i.ld6(next.getElement(), next.getCount());
        itEntryIterator.remove();
        return interfaceC4482kLd6;
    }

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> pollLastEntry() {
        Iterator<o05.InterfaceC4482k<E>> itDescendingEntryIterator = descendingEntryIterator();
        if (!itDescendingEntryIterator.hasNext()) {
            return null;
        }
        o05.InterfaceC4482k<E> next = itDescendingEntryIterator.next();
        o05.InterfaceC4482k<E> interfaceC4482kLd6 = m58i.ld6(next.getElement(), next.getCount());
        itDescendingEntryIterator.remove();
        return interfaceC4482kLd6;
    }

    @Override // com.google.common.collect.gb
    public gb<E> subMultiset(@NullableDecl E e2, fu4 fu4Var, @NullableDecl E e3, fu4 fu4Var2) {
        com.google.common.base.jk.a9(fu4Var);
        com.google.common.base.jk.a9(fu4Var2);
        return tailMultiset(e2, fu4Var).headMultiset(e3, fu4Var2);
    }

    kja0(Comparator<? super E> comparator) {
        this.comparator = (Comparator) com.google.common.base.jk.a9(comparator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC4519s
    public NavigableSet<E> createElementSet() {
        return new kq2f.toq(this);
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }
}
