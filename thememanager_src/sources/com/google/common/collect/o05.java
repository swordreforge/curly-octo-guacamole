package com.google.common.collect;

import androidx.exifinterface.media.C0846k;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: Multiset.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public interface o05<E> extends Collection<E> {

    /* JADX INFO: renamed from: com.google.common.collect.o05$k */
    /* JADX INFO: compiled from: Multiset.java */
    public interface InterfaceC4482k<E> {
        boolean equals(Object obj);

        int getCount();

        E getElement();

        int hashCode();

        String toString();
    }

    @CanIgnoreReturnValue
    int add(@NullableDecl E e2, int i2);

    @Override // java.util.Collection
    @CanIgnoreReturnValue
    boolean add(E e2);

    boolean contains(@NullableDecl Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    int count(@NullableDecl @CompatibleWith(C0846k.d9i) Object obj);

    Set<E> elementSet();

    Set<InterfaceC4482k<E>> entrySet();

    boolean equals(@NullableDecl Object obj);

    int hashCode();

    Iterator<E> iterator();

    @CanIgnoreReturnValue
    int remove(@NullableDecl @CompatibleWith(C0846k.d9i) Object obj, int i2);

    @Override // java.util.Collection
    @CanIgnoreReturnValue
    boolean remove(@NullableDecl Object obj);

    @Override // java.util.Collection
    @CanIgnoreReturnValue
    boolean removeAll(Collection<?> collection);

    @Override // java.util.Collection
    @CanIgnoreReturnValue
    boolean retainAll(Collection<?> collection);

    @CanIgnoreReturnValue
    int setCount(E e2, int i2);

    @CanIgnoreReturnValue
    boolean setCount(E e2, int i2, int i3);

    int size();

    String toString();
}
