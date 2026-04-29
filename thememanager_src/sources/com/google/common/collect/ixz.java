package com.google.common.collect;

import com.google.common.collect.vep5;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ImmutableSortedSet.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
public abstract class ixz<E> extends Cdo<E> implements NavigableSet<E>, f1bi<E> {
    final transient Comparator<? super E> comparator;

    @wlev.zy
    @LazyInit
    transient ixz<E> descendingSet;

    /* JADX INFO: renamed from: com.google.common.collect.ixz$k */
    /* JADX INFO: compiled from: ImmutableSortedSet.java */
    public static final class C4416k<E> extends vep5.C4532k<E> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final Comparator<? super E> f68219f7l8;

        public C4416k(Comparator<? super E> comparator) {
            this.f68219f7l8 = (Comparator) com.google.common.base.jk.a9(comparator);
        }

        @Override // com.google.common.collect.vep5.C4532k, com.google.common.collect.z4.AbstractC4582k, com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: cdj, reason: merged with bridge method [inline-methods] */
        public C4416k<E> zy(Iterable<? extends E> iterable) {
            super.zy(iterable);
            return this;
        }

        @Override // com.google.common.collect.vep5.C4532k, com.google.common.collect.z4.AbstractC4582k, com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C4416k<E> toq(E... eArr) {
            super.toq(eArr);
            return this;
        }

        @Override // com.google.common.collect.vep5.C4532k
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
        public C4416k<E> mo15572q(Iterator<? extends E> it) {
            super.mo15572q(it);
            return this;
        }

        @Override // com.google.common.collect.vep5.C4532k
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public C4416k<E> f7l8(E e2) {
            super.f7l8(e2);
            return this;
        }

        @Override // com.google.common.collect.vep5.C4532k
        /* JADX INFO: renamed from: t8r, reason: merged with bridge method [inline-methods] */
        public ixz<E> mo15570n() {
            ixz<E> ixzVarConstruct = ixz.construct(this.f68219f7l8, this.f68239zy, this.f68238toq);
            this.f68239zy = ixzVarConstruct.size();
            this.f26749q = true;
            return ixzVarConstruct;
        }
    }

    /* JADX INFO: compiled from: ImmutableSortedSet.java */
    private static class toq<E> implements Serializable {
        private static final long serialVersionUID = 0;
        final Comparator<? super E> comparator;
        final Object[] elements;

        public toq(Comparator<? super E> comparator, Object[] objArr) {
            this.comparator = comparator;
            this.elements = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object readResolve() {
            return new C4416k(this.comparator).toq(this.elements).mo15570n();
        }
    }

    ixz(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> ixz<E> construct(Comparator<? super E> comparator, int i2, E... eArr) {
        if (i2 == 0) {
            return emptySet(comparator);
        }
        r25n.zy(eArr, i2);
        Arrays.sort(eArr, 0, i2, comparator);
        int i3 = 1;
        for (int i4 = 1; i4 < i2; i4++) {
            a98o.zy zyVar = (Object) eArr[i4];
            if (comparator.compare(zyVar, (Object) eArr[i3 - 1]) != 0) {
                eArr[i3] = zyVar;
                i3++;
            }
        }
        Arrays.fill(eArr, i3, i2, (Object) null);
        if (i3 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i3);
        }
        return new l05(se.asImmutableList(eArr, i3), comparator);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ixz<TE;>; */
    public static ixz copyOf(Comparable[] comparableArr) {
        return construct(kx3.natural(), comparableArr.length, (Object[]) comparableArr.clone());
    }

    public static <E> ixz<E> copyOfSorted(SortedSet<E> sortedSet) {
        Comparator comparatorM15986k = tww7.m15986k(sortedSet);
        se seVarCopyOf = se.copyOf((Collection) sortedSet);
        return seVarCopyOf.isEmpty() ? emptySet(comparatorM15986k) : new l05(seVarCopyOf, comparatorM15986k);
    }

    static <E> l05<E> emptySet(Comparator<? super E> comparator) {
        return kx3.natural().equals(comparator) ? (l05<E>) l05.NATURAL_EMPTY_SET : new l05<>(se.of(), comparator);
    }

    public static <E extends Comparable<?>> C4416k<E> naturalOrder() {
        return new C4416k<>(kx3.natural());
    }

    public static <E> ixz<E> of() {
        return l05.NATURAL_EMPTY_SET;
    }

    public static <E> C4416k<E> orderedBy(Comparator<E> comparator) {
        return new C4416k<>(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<?>> C4416k<E> reverseOrder() {
        return new C4416k<>(Collections.reverseOrder());
    }

    @wlev.zy
    public E ceiling(E e2) {
        return (E) nsb.zurt(tailSet((Object) e2, true), null);
    }

    @Override // java.util.SortedSet, com.google.common.collect.f1bi
    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    @wlev.zy
    abstract ixz<E> createDescendingSet();

    @Override // java.util.NavigableSet
    @wlev.zy
    public abstract ab<E> descendingIterator();

    @Override // java.util.SortedSet
    public E first() {
        return iterator().next();
    }

    @wlev.zy
    public E floor(E e2) {
        return (E) zwy.oc(headSet((Object) e2, true).descendingIterator(), null);
    }

    abstract ixz<E> headSetImpl(E e2, boolean z2);

    @wlev.zy
    public E higher(E e2) {
        return (E) nsb.zurt(tailSet((Object) e2, false), null);
    }

    abstract int indexOf(@NullableDecl Object obj);

    @Override // com.google.common.collect.vep5, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
    public abstract ab<E> iterator();

    @Override // java.util.SortedSet
    public E last() {
        return descendingIterator().next();
    }

    @wlev.zy
    public E lower(E e2) {
        return (E) zwy.oc(headSet((Object) e2, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @CanIgnoreReturnValue
    @wlev.zy
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @CanIgnoreReturnValue
    @wlev.zy
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    abstract ixz<E> subSetImpl(E e2, boolean z2, E e3, boolean z3);

    abstract ixz<E> tailSetImpl(E e2, boolean z2);

    int unsafeCompare(Object obj, Object obj2) {
        return unsafeCompare(this.comparator, obj, obj2);
    }

    @Override // com.google.common.collect.vep5, com.google.common.collect.z4
    Object writeReplace() {
        return new toq(this.comparator, toArray());
    }

    public static <E> ixz<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(kx3.natural(), iterable);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ixz<TE;>; */
    public static ixz of(Comparable comparable) {
        return new l05(se.of(comparable), kx3.natural());
    }

    static int unsafeCompare(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    @Override // java.util.NavigableSet
    @wlev.zy
    public ixz<E> descendingSet() {
        ixz<E> ixzVar = this.descendingSet;
        if (ixzVar != null) {
            return ixzVar;
        }
        ixz<E> ixzVarCreateDescendingSet = createDescendingSet();
        this.descendingSet = ixzVarCreateDescendingSet;
        ixzVarCreateDescendingSet.descendingSet = this;
        return ixzVarCreateDescendingSet;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ixz<TE;>; */
    public static ixz of(Comparable comparable, Comparable comparable2) {
        return construct(kx3.natural(), 2, comparable, comparable2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public ixz<E> headSet(E e2) {
        return headSet((Object) e2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public ixz<E> subSet(E e2, E e3) {
        return subSet((Object) e2, true, (Object) e3, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public ixz<E> tailSet(E e2) {
        return tailSet((Object) e2, true);
    }

    public static <E> ixz<E> copyOf(Collection<? extends E> collection) {
        return copyOf((Comparator) kx3.natural(), (Collection) collection);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ixz<TE;>; */
    public static ixz of(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return construct(kx3.natural(), 3, comparable, comparable2, comparable3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    @wlev.zy
    public ixz<E> headSet(E e2, boolean z2) {
        return headSetImpl(com.google.common.base.jk.a9(e2), z2);
    }

    @Override // java.util.NavigableSet
    @wlev.zy
    public ixz<E> subSet(E e2, boolean z2, E e3, boolean z3) {
        com.google.common.base.jk.a9(e2);
        com.google.common.base.jk.a9(e3);
        com.google.common.base.jk.m15383q(this.comparator.compare(e2, e3) <= 0);
        return subSetImpl(e2, z2, e3, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    @wlev.zy
    public ixz<E> tailSet(E e2, boolean z2) {
        return tailSetImpl(com.google.common.base.jk.a9(e2), z2);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ixz<TE;>; */
    public static ixz of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return construct(kx3.natural(), 4, comparable, comparable2, comparable3, comparable4);
    }

    public static <E> ixz<E> copyOf(Iterator<? extends E> it) {
        return copyOf(kx3.natural(), it);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ixz<TE;>; */
    public static ixz of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return construct(kx3.natural(), 5, comparable, comparable2, comparable3, comparable4, comparable5);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ixz<TE;>; */
    public static ixz of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        int length = comparableArr.length + 6;
        Comparable[] comparableArr2 = new Comparable[length];
        comparableArr2[0] = comparable;
        comparableArr2[1] = comparable2;
        comparableArr2[2] = comparable3;
        comparableArr2[3] = comparable4;
        comparableArr2[4] = comparable5;
        comparableArr2[5] = comparable6;
        System.arraycopy(comparableArr, 0, comparableArr2, 6, comparableArr.length);
        return construct(kx3.natural(), length, comparableArr2);
    }

    public static <E> ixz<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        return new C4416k(comparator).mo15572q(it).mo15570n();
    }

    public static <E> ixz<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        com.google.common.base.jk.a9(comparator);
        if (tww7.toq(comparator, iterable) && (iterable instanceof ixz)) {
            ixz<E> ixzVar = (ixz) iterable;
            if (!ixzVar.isPartialView()) {
                return ixzVar;
            }
        }
        Object[] objArrX9kr = nsb.x9kr(iterable);
        return construct(comparator, objArrX9kr.length, objArrX9kr);
    }

    public static <E> ixz<E> copyOf(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return copyOf((Comparator) comparator, (Iterable) collection);
    }
}
