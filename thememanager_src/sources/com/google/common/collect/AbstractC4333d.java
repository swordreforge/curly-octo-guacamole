package com.google.common.collect;

import com.google.common.base.C4280z;
import com.google.common.collect.m58i;
import com.google.common.collect.o05;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.collect.d */
/* JADX INFO: compiled from: ForwardingMultiset.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class AbstractC4333d<E> extends AbstractC4572x<E> implements o05<E> {

    /* JADX INFO: renamed from: com.google.common.collect.d$k */
    /* JADX INFO: compiled from: ForwardingMultiset.java */
    @InterfaceC7731k
    protected class k extends m58i.AbstractC4459y<E> {
        public k() {
        }

        @Override // com.google.common.collect.m58i.AbstractC4459y, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return m58i.m15842y(mo15598k().entrySet().iterator());
        }

        @Override // com.google.common.collect.m58i.AbstractC4459y
        /* JADX INFO: renamed from: k */
        o05<E> mo15598k() {
            return AbstractC4333d.this;
        }
    }

    protected AbstractC4333d() {
    }

    @Override // com.google.common.collect.o05
    @CanIgnoreReturnValue
    public int add(E e2, int i2) {
        return delegate().add(e2, i2);
    }

    @Override // com.google.common.collect.o05
    public int count(Object obj) {
        return delegate().count(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
    public abstract o05<E> delegate();

    @Override // com.google.common.collect.o05
    public Set<E> elementSet() {
        return delegate().elementSet();
    }

    @Override // com.google.common.collect.o05
    public Set<o05.InterfaceC4482k<E>> entrySet() {
        return delegate().entrySet();
    }

    @Override // java.util.Collection, com.google.common.collect.o05
    public boolean equals(@NullableDecl Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, com.google.common.collect.o05
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // com.google.common.collect.o05
    @CanIgnoreReturnValue
    public int remove(Object obj, int i2) {
        return delegate().remove(obj, i2);
    }

    @Override // com.google.common.collect.o05
    @CanIgnoreReturnValue
    public int setCount(E e2, int i2) {
        return delegate().setCount(e2, i2);
    }

    protected boolean standardAdd(E e2) {
        add(e2, 1);
        return true;
    }

    @Override // com.google.common.collect.AbstractC4572x
    @InterfaceC7731k
    protected boolean standardAddAll(Collection<? extends E> collection) {
        return m58i.zy(this, collection);
    }

    @Override // com.google.common.collect.AbstractC4572x
    protected void standardClear() {
        zwy.m16135y(entrySet().iterator());
    }

    @Override // com.google.common.collect.AbstractC4572x
    protected boolean standardContains(@NullableDecl Object obj) {
        return count(obj) > 0;
    }

    @InterfaceC7731k
    protected int standardCount(@NullableDecl Object obj) {
        for (o05.InterfaceC4482k<E> interfaceC4482k : entrySet()) {
            if (C4280z.m15455k(interfaceC4482k.getElement(), obj)) {
                return interfaceC4482k.getCount();
            }
        }
        return 0;
    }

    protected boolean standardEquals(@NullableDecl Object obj) {
        return m58i.m15840s(this, obj);
    }

    protected int standardHashCode() {
        return entrySet().hashCode();
    }

    protected Iterator<E> standardIterator() {
        return m58i.n7h(this);
    }

    @Override // com.google.common.collect.AbstractC4572x
    protected boolean standardRemove(Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // com.google.common.collect.AbstractC4572x
    protected boolean standardRemoveAll(Collection<?> collection) {
        return m58i.m15834h(this, collection);
    }

    @Override // com.google.common.collect.AbstractC4572x
    protected boolean standardRetainAll(Collection<?> collection) {
        return m58i.t8r(this, collection);
    }

    protected int standardSetCount(E e2, int i2) {
        return m58i.zurt(this, e2, i2);
    }

    protected int standardSize() {
        return m58i.kja0(this);
    }

    @Override // com.google.common.collect.AbstractC4572x
    protected String standardToString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.o05
    @CanIgnoreReturnValue
    public boolean setCount(E e2, int i2, int i3) {
        return delegate().setCount(e2, i2, i3);
    }

    protected boolean standardSetCount(E e2, int i2, int i3) {
        return m58i.ni7(this, e2, i2, i3);
    }
}
