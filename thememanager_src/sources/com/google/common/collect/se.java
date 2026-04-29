package com.google.common.collect;

import com.google.common.collect.z4;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ImmutableList.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
public abstract class se<E> extends z4<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: q */
    private static final c25<Object> f26587q = new toq(bih.EMPTY, 0);

    /* JADX INFO: renamed from: com.google.common.collect.se$k */
    /* JADX INFO: compiled from: ImmutableList.java */
    public static final class C4520k<E> extends z4.AbstractC4582k<E> {
        public C4520k() {
            this(4);
        }

        @Override // com.google.common.collect.z4.AbstractC4582k, com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public C4520k<E> zy(Iterable<? extends E> iterable) {
            super.zy(iterable);
            return this;
        }

        @Override // com.google.common.collect.z4.AbstractC4582k, com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public C4520k<E> toq(E... eArr) {
            super.toq(eArr);
            return this;
        }

        @Override // com.google.common.collect.z4.toq
        /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
        public se<E> mo15570n() {
            this.f26749q = true;
            return se.asImmutableList(this.f68238toq, this.f68239zy);
        }

        @Override // com.google.common.collect.z4.AbstractC4582k, com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public C4520k<E> mo15569k(E e2) {
            super.mo15569k(e2);
            return this;
        }

        @Override // com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public C4520k<E> mo15572q(Iterator<? extends E> it) {
            super.mo15572q(it);
            return this;
        }

        C4520k(int i2) {
            super(i2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.se$n */
    /* JADX INFO: compiled from: ImmutableList.java */
    class C4521n extends se<E> {
        final transient int length;
        final transient int offset;

        C4521n(int i2, int i3) {
            this.offset = i2;
            this.length = i3;
        }

        @Override // java.util.List
        public E get(int i2) {
            com.google.common.base.jk.mcp(i2, this.length);
            return se.this.get(i2 + this.offset);
        }

        @Override // com.google.common.collect.z4
        Object[] internalArray() {
            return se.this.internalArray();
        }

        @Override // com.google.common.collect.z4
        int internalArrayEnd() {
            return se.this.internalArrayStart() + this.offset + this.length;
        }

        @Override // com.google.common.collect.z4
        int internalArrayStart() {
            return se.this.internalArrayStart() + this.offset;
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.se, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.se, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.length;
        }

        @Override // com.google.common.collect.se, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
            return super.listIterator(i2);
        }

        @Override // com.google.common.collect.se, java.util.List
        public se<E> subList(int i2, int i3) {
            com.google.common.base.jk.ek5k(i2, i3, this.length);
            se seVar = se.this;
            int i4 = this.offset;
            return seVar.subList(i2 + i4, i3 + i4);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.se$q */
    /* JADX INFO: compiled from: ImmutableList.java */
    static class C4522q implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        C4522q(Object[] objArr) {
            this.elements = objArr;
        }

        Object readResolve() {
            return se.copyOf(this.elements);
        }
    }

    /* JADX INFO: compiled from: ImmutableList.java */
    static class toq<E> extends com.google.common.collect.toq<E> {

        /* JADX INFO: renamed from: n */
        private final se<E> f26588n;

        toq(se<E> seVar, int i2) {
            super(seVar.size(), i2);
            this.f26588n = seVar;
        }

        @Override // com.google.common.collect.toq
        /* JADX INFO: renamed from: k */
        protected E mo15538k(int i2) {
            return this.f26588n.get(i2);
        }
    }

    /* JADX INFO: compiled from: ImmutableList.java */
    private static class zy<E> extends se<E> {

        /* JADX INFO: renamed from: n */
        private final transient se<E> f26589n;

        zy(se<E> seVar) {
            this.f26589n = seVar;
        }

        private int toq(int i2) {
            return (size() - 1) - i2;
        }

        private int zy(int i2) {
            return size() - i2;
        }

        @Override // com.google.common.collect.se, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
        public boolean contains(@NullableDecl Object obj) {
            return this.f26589n.contains(obj);
        }

        @Override // java.util.List
        public E get(int i2) {
            com.google.common.base.jk.mcp(i2, size());
            return this.f26589n.get(toq(i2));
        }

        @Override // com.google.common.collect.se, java.util.List
        public int indexOf(@NullableDecl Object obj) {
            int iLastIndexOf = this.f26589n.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return toq(iLastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return this.f26589n.isPartialView();
        }

        @Override // com.google.common.collect.se, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.se, java.util.List
        public int lastIndexOf(@NullableDecl Object obj) {
            int iIndexOf = this.f26589n.indexOf(obj);
            if (iIndexOf >= 0) {
                return toq(iIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.se, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.se
        public se<E> reverse() {
            return this.f26589n;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f26589n.size();
        }

        @Override // com.google.common.collect.se, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
            return super.listIterator(i2);
        }

        @Override // com.google.common.collect.se, java.util.List
        public se<E> subList(int i2, int i3) {
            com.google.common.base.jk.ek5k(i2, i3, size());
            return this.f26589n.subList(zy(i3), zy(i2)).reverse();
        }
    }

    se() {
    }

    static <E> se<E> asImmutableList(Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    public static <E> C4520k<E> builder() {
        return new C4520k<>();
    }

    @InterfaceC7731k
    public static <E> C4520k<E> builderWithExpectedSize(int i2) {
        C4524t.toq(i2, "expectedSize");
        return new C4520k<>(i2);
    }

    public static <E> se<E> copyOf(Iterable<? extends E> iterable) {
        com.google.common.base.jk.a9(iterable);
        return iterable instanceof Collection ? copyOf((Collection) iterable) : copyOf(iterable.iterator());
    }

    /* JADX INFO: renamed from: k */
    private static <E> se<E> m15980k(Object... objArr) {
        return asImmutableList(r25n.toq(objArr));
    }

    public static <E> se<E> of() {
        return (se<E>) bih.EMPTY;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<? super E>> se<E> sortedCopyOf(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) nsb.m15906l(iterable, new Comparable[0]);
        r25n.toq(comparableArr);
        Arrays.sort(comparableArr);
        return asImmutableList(comparableArr);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.z4
    public final se<E> asList() {
        return this;
    }

    @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.common.collect.z4
    int copyIntoArray(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@NullableDecl Object obj) {
        return wlev.m16060p(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = ~(~((i2 * 31) + get(i3).hashCode()));
        }
        return i2;
    }

    @Override // java.util.List
    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        return wlev.x2(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        return wlev.n7h(this, obj);
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final E remove(int i2) {
        throw new UnsupportedOperationException();
    }

    public se<E> reverse() {
        return size() <= 1 ? this : new zy(this);
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final E set(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    se<E> subListUnchecked(int i2, int i3) {
        return new C4521n(i2, i3 - i2);
    }

    @Override // com.google.common.collect.z4
    Object writeReplace() {
        return new C4522q(toArray());
    }

    static <E> se<E> asImmutableList(Object[] objArr, int i2) {
        return i2 == 0 ? of() : new bih(objArr, i2);
    }

    public static <E> se<E> of(E e2) {
        return m15980k(e2);
    }

    @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
    public ab<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public se<E> subList(int i2, int i3) {
        com.google.common.base.jk.ek5k(i2, i3, size());
        int i4 = i3 - i2;
        return i4 == size() ? this : i4 == 0 ? of() : subListUnchecked(i2, i3);
    }

    public static <E> se<E> of(E e2, E e3) {
        return m15980k(e2, e3);
    }

    @Override // java.util.List
    public c25<E> listIterator() {
        return listIterator(0);
    }

    public static <E> se<E> of(E e2, E e3, E e4) {
        return m15980k(e2, e3, e4);
    }

    @Override // java.util.List
    public c25<E> listIterator(int i2) {
        com.google.common.base.jk.m15381o(i2, size());
        if (isEmpty()) {
            return (c25<E>) f26587q;
        }
        return new toq(this, i2);
    }

    public static <E> se<E> copyOf(Collection<? extends E> collection) {
        if (collection instanceof z4) {
            se<E> seVarAsList = ((z4) collection).asList();
            return seVarAsList.isPartialView() ? asImmutableList(seVarAsList.toArray()) : seVarAsList;
        }
        return m15980k(collection.toArray());
    }

    public static <E> se<E> of(E e2, E e3, E e4, E e6) {
        return m15980k(e2, e3, e4, e6);
    }

    public static <E> se<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        com.google.common.base.jk.a9(comparator);
        Object[] objArrX9kr = nsb.x9kr(iterable);
        r25n.toq(objArrX9kr);
        Arrays.sort(objArrX9kr, comparator);
        return asImmutableList(objArrX9kr);
    }

    public static <E> se<E> of(E e2, E e3, E e4, E e6, E e7) {
        return m15980k(e2, e3, e4, e6, e7);
    }

    public static <E> se<E> of(E e2, E e3, E e4, E e6, E e7, E e8) {
        return m15980k(e2, e3, e4, e6, e7, e8);
    }

    public static <E> se<E> of(E e2, E e3, E e4, E e6, E e7, E e8, E e9) {
        return m15980k(e2, e3, e4, e6, e7, e8, e9);
    }

    public static <E> se<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        return new C4520k().mo15569k(next).mo15572q(it).mo15570n();
    }

    public static <E> se<E> of(E e2, E e3, E e4, E e6, E e7, E e8, E e9, E e10) {
        return m15980k(e2, e3, e4, e6, e7, e8, e9, e10);
    }

    public static <E> se<E> of(E e2, E e3, E e4, E e6, E e7, E e8, E e9, E e10, E e11) {
        return m15980k(e2, e3, e4, e6, e7, e8, e9, e10, e11);
    }

    public static <E> se<E> of(E e2, E e3, E e4, E e6, E e7, E e8, E e9, E e10, E e11, E e12) {
        return m15980k(e2, e3, e4, e6, e7, e8, e9, e10, e11, e12);
    }

    public static <E> se<E> of(E e2, E e3, E e4, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E e13) {
        return m15980k(e2, e3, e4, e6, e7, e8, e9, e10, e11, e12, e13);
    }

    @SafeVarargs
    public static <E> se<E> of(E e2, E e3, E e4, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E e13, E e14, E... eArr) {
        com.google.common.base.jk.m15380n(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e2;
        objArr[1] = e3;
        objArr[2] = e4;
        objArr[3] = e6;
        objArr[4] = e7;
        objArr[5] = e8;
        objArr[6] = e9;
        objArr[7] = e10;
        objArr[8] = e11;
        objArr[9] = e12;
        objArr[10] = e13;
        objArr[11] = e14;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return m15980k(objArr);
    }

    public static <E> se<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return of();
        }
        return m15980k((Object[]) eArr.clone());
    }
}
