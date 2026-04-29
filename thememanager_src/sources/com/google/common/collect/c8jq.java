package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ForwardingList.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class c8jq<E> extends AbstractC4572x<E> implements List<E> {
    protected c8jq() {
    }

    @Override // java.util.List
    public void add(int i2, E e2) {
        delegate().add(i2, e2);
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    public boolean addAll(int i2, Collection<? extends E> collection) {
        return delegate().addAll(i2, collection);
    }

    protected ListIterator<E> cdj() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@NullableDecl Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @InterfaceC7731k
    protected List<E> fn3e(int i2, int i3) {
        return wlev.mcp(this, i2, i3);
    }

    @Override // java.util.List
    public E get(int i2) {
        return delegate().get(i2);
    }

    /* JADX INFO: renamed from: h */
    protected int m15586h(@NullableDecl Object obj) {
        return wlev.n7h(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return delegate().hashCode();
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: i */
    protected ListIterator<E> m15587i(int i2) {
        return wlev.m16056h(this, i2);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return delegate().indexOf(obj);
    }

    protected int kja0(@NullableDecl Object obj) {
        return wlev.x2(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return delegate().lastIndexOf(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
    /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
    public abstract List<E> delegate();

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return delegate().listIterator();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    public E remove(int i2) {
        return delegate().remove(i2);
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    public E set(int i2, E e2) {
        return delegate().set(i2, e2);
    }

    protected boolean standardAdd(E e2) {
        add(size(), e2);
        return true;
    }

    @InterfaceC7731k
    protected boolean standardEquals(@NullableDecl Object obj) {
        return wlev.m16060p(this, obj);
    }

    @InterfaceC7731k
    protected int standardHashCode() {
        return wlev.ld6(this);
    }

    protected Iterator<E> standardIterator() {
        return listIterator();
    }

    @Override // java.util.List
    public List<E> subList(int i2, int i3) {
        return delegate().subList(i2, i3);
    }

    protected boolean x2(int i2, Iterable<? extends E> iterable) {
        return wlev.m16058k(this, i2, iterable);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i2) {
        return delegate().listIterator(i2);
    }
}
