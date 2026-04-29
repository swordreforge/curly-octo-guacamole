package com.google.common.collect;

import com.google.common.base.C4280z;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.collect.x */
/* JADX INFO: compiled from: ForwardingCollection.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class AbstractC4572x<E> extends qkj8 implements Collection<E> {
    protected AbstractC4572x() {
    }

    @CanIgnoreReturnValue
    public boolean add(E e2) {
        return delegate().add(e2);
    }

    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        return delegate().addAll(collection);
    }

    public void clear() {
        delegate().clear();
    }

    public boolean contains(Object obj) {
        return delegate().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return delegate().containsAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.qkj8
    public abstract Collection<E> delegate();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Iterator<E> iterator() {
        return delegate().iterator();
    }

    @CanIgnoreReturnValue
    public boolean remove(Object obj) {
        return delegate().remove(obj);
    }

    @CanIgnoreReturnValue
    public boolean removeAll(Collection<?> collection) {
        return delegate().removeAll(collection);
    }

    @CanIgnoreReturnValue
    public boolean retainAll(Collection<?> collection) {
        return delegate().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return delegate().size();
    }

    protected boolean standardAddAll(Collection<? extends E> collection) {
        return zwy.m16125k(this, collection.iterator());
    }

    protected void standardClear() {
        zwy.m16135y(iterator());
    }

    protected boolean standardContains(@NullableDecl Object obj) {
        return zwy.cdj(iterator(), obj);
    }

    protected boolean standardContainsAll(Collection<?> collection) {
        return mcp.zy(this, collection);
    }

    protected boolean standardIsEmpty() {
        return !iterator().hasNext();
    }

    protected boolean standardRemove(@NullableDecl Object obj) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (C4280z.m15455k(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    protected boolean standardRemoveAll(Collection<?> collection) {
        return zwy.m16118c(iterator(), collection);
    }

    protected boolean standardRetainAll(Collection<?> collection) {
        return zwy.uv6(iterator(), collection);
    }

    protected Object[] standardToArray() {
        return toArray(new Object[size()]);
    }

    protected String standardToString() {
        return mcp.qrj(this);
    }

    public Object[] toArray() {
        return delegate().toArray();
    }

    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        return (T[]) delegate().toArray(tArr);
    }

    protected <T> T[] standardToArray(T[] tArr) {
        return (T[]) r25n.qrj(this, tArr);
    }
}
