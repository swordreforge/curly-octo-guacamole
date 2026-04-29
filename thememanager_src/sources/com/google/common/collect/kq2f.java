package com.google.common.collect;

import com.google.common.collect.m58i;
import com.google.common.collect.o05;
import com.google.j2objc.annotations.Weak;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: SortedMultisets.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
final class kq2f {

    /* JADX INFO: renamed from: com.google.common.collect.kq2f$k */
    /* JADX INFO: compiled from: SortedMultisets.java */
    static class C4430k<E> extends m58i.AbstractC4459y<E> implements SortedSet<E> {

        /* JADX INFO: renamed from: k */
        @Weak
        private final gb<E> f26278k;

        C4430k(gb<E> gbVar) {
            this.f26278k = gbVar;
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return mo15598k().comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) kq2f.m15780q(mo15598k().firstEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e2) {
            return mo15598k().headMultiset(e2, fu4.OPEN).elementSet();
        }

        @Override // com.google.common.collect.m58i.AbstractC4459y, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return m58i.m15842y(mo15598k().entrySet().iterator());
        }

        @Override // java.util.SortedSet
        public E last() {
            return (E) kq2f.m15780q(mo15598k().lastEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e2, E e3) {
            return mo15598k().subMultiset(e2, fu4.CLOSED, e3, fu4.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e2) {
            return mo15598k().tailMultiset(e2, fu4.CLOSED).elementSet();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.m58i.AbstractC4459y
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public final gb<E> mo15598k() {
            return this.f26278k;
        }
    }

    /* JADX INFO: compiled from: SortedMultisets.java */
    @wlev.zy
    static class toq<E> extends C4430k<E> implements NavigableSet<E> {
        toq(gb<E> gbVar) {
            super(gbVar);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e2) {
            return (E) kq2f.zy(mo15598k().tailMultiset(e2, fu4.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return new toq(mo15598k().descendingMultiset());
        }

        @Override // java.util.NavigableSet
        public E floor(E e2) {
            return (E) kq2f.zy(mo15598k().headMultiset(e2, fu4.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e2, boolean z2) {
            return new toq(mo15598k().headMultiset(e2, fu4.forBoolean(z2)));
        }

        @Override // java.util.NavigableSet
        public E higher(E e2) {
            return (E) kq2f.zy(mo15598k().tailMultiset(e2, fu4.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        public E lower(E e2) {
            return (E) kq2f.zy(mo15598k().headMultiset(e2, fu4.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            return (E) kq2f.zy(mo15598k().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            return (E) kq2f.zy(mo15598k().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e2, boolean z2, E e3, boolean z3) {
            return new toq(mo15598k().subMultiset(e2, fu4.forBoolean(z2), e3, fu4.forBoolean(z3)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e2, boolean z2) {
            return new toq(mo15598k().tailMultiset(e2, fu4.forBoolean(z2)));
        }
    }

    private kq2f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static <E> E m15780q(o05.InterfaceC4482k<E> interfaceC4482k) {
        if (interfaceC4482k != null) {
            return interfaceC4482k.getElement();
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> E zy(@NullableDecl o05.InterfaceC4482k<E> interfaceC4482k) {
        if (interfaceC4482k == null) {
            return null;
        }
        return interfaceC4482k.getElement();
    }
}
