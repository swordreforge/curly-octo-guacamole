package com.google.common.collect;

import com.google.common.collect.g0ad;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ForwardingNavigableSet.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public abstract class vq<E> extends g1<E> implements NavigableSet<E> {

    /* JADX INFO: renamed from: com.google.common.collect.vq$k */
    /* JADX INFO: compiled from: ForwardingNavigableSet.java */
    @InterfaceC7731k
    protected class C4533k extends g0ad.f7l8<E> {
        public C4533k() {
            super(vq.this);
        }
    }

    protected vq() {
    }

    protected E cdj(E e2) {
        return (E) zwy.oc(headSet(e2, true).descendingIterator(), null);
    }

    public E ceiling(E e2) {
        return delegate().ceiling(e2);
    }

    public Iterator<E> descendingIterator() {
        return delegate().descendingIterator();
    }

    public NavigableSet<E> descendingSet() {
        return delegate().descendingSet();
    }

    public E floor(E e2) {
        return delegate().floor(e2);
    }

    protected E fn3e(E e2) {
        return (E) zwy.oc(tailSet(e2, false).iterator(), null);
    }

    protected E fu4() {
        return (E) zwy.m16120f(iterator());
    }

    /* JADX INFO: renamed from: h */
    protected E m16005h() {
        return iterator().next();
    }

    public NavigableSet<E> headSet(E e2, boolean z2) {
        return delegate().headSet(e2, z2);
    }

    public E higher(E e2) {
        return delegate().higher(e2);
    }

    /* JADX INFO: renamed from: i */
    protected SortedSet<E> m16006i(E e2) {
        return headSet(e2, false);
    }

    protected E kja0(E e2) {
        return (E) zwy.oc(tailSet(e2, true).iterator(), null);
    }

    public E lower(E e2) {
        return delegate().lower(e2);
    }

    protected E ni7(E e2) {
        return (E) zwy.oc(headSet(e2, false).descendingIterator(), null);
    }

    @InterfaceC7731k
    protected NavigableSet<E> o1t(E e2, boolean z2, E e3, boolean z3) {
        return tailSet(e2, z2).headSet(e3, z3);
    }

    public E pollFirst() {
        return delegate().pollFirst();
    }

    public E pollLast() {
        return delegate().pollLast();
    }

    @Override // com.google.common.collect.g1
    protected SortedSet<E> standardSubSet(E e2, E e3) {
        return subSet(e2, true, e3, false);
    }

    public NavigableSet<E> subSet(E e2, boolean z2, E e3, boolean z3) {
        return delegate().subSet(e2, z2, e3, z3);
    }

    public NavigableSet<E> tailSet(E e2, boolean z2) {
        return delegate().tailSet(e2, z2);
    }

    protected SortedSet<E> wvg(E e2) {
        return tailSet(e2, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.g1, com.google.common.collect.qo, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
    /* JADX INFO: renamed from: x2 */
    public abstract NavigableSet<E> delegate();

    /* JADX INFO: renamed from: z */
    protected E m16007z() {
        return (E) zwy.m16120f(descendingIterator());
    }

    protected E zurt() {
        return descendingIterator().next();
    }
}
