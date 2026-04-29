package com.google.common.collect;

import com.google.common.collect.b3e;
import com.google.common.collect.o05;
import com.google.common.collect.se;
import com.google.common.math.C4723q;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: ImmutableSortedMultiset.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public abstract class uc<E> extends wx16<E> implements gb<E> {

    @LazyInit
    transient uc<E> descendingMultiset;

    /* JADX INFO: renamed from: com.google.common.collect.uc$k */
    /* JADX INFO: compiled from: ImmutableSortedMultiset.java */
    public static class C4526k<E> extends b3e.toq<E> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int[] f68229f7l8;

        /* JADX INFO: renamed from: g */
        @InterfaceC7732q
        E[] f26594g;

        /* JADX INFO: renamed from: n */
        private final Comparator<? super E> f26595n;

        /* JADX INFO: renamed from: s */
        private boolean f26596s;

        /* JADX INFO: renamed from: y */
        private int f26597y;

        public C4526k(Comparator<? super E> comparator) {
            super(true);
            this.f26595n = (Comparator) com.google.common.base.jk.a9(comparator);
            this.f26594g = (E[]) new Object[4];
            this.f68229f7l8 = new int[4];
        }

        private void fn3e(boolean z2) {
            int i2 = this.f26597y;
            if (i2 == 0) {
                return;
            }
            Object[] objArr = (E[]) Arrays.copyOf(this.f26594g, i2);
            Arrays.sort(objArr, this.f26595n);
            int i3 = 1;
            for (int i4 = 1; i4 < objArr.length; i4++) {
                if (this.f26595n.compare((Object) objArr[i3 - 1], (Object) objArr[i4]) < 0) {
                    objArr[i3] = objArr[i4];
                    i3++;
                }
            }
            Arrays.fill(objArr, i3, this.f26597y, (Object) null);
            if (z2) {
                int i5 = i3 * 4;
                int i6 = this.f26597y;
                if (i5 > i6 * 3) {
                    objArr = (E[]) Arrays.copyOf(objArr, C4723q.m16543i(i6, (i6 / 2) + 1));
                }
            }
            int[] iArr = new int[objArr.length];
            for (int i7 = 0; i7 < this.f26597y; i7++) {
                int iBinarySearch = Arrays.binarySearch(objArr, 0, i3, this.f26594g[i7], this.f26595n);
                int i8 = this.f68229f7l8[i7];
                if (i8 >= 0) {
                    iArr[iBinarySearch] = iArr[iBinarySearch] + i8;
                } else {
                    iArr[iBinarySearch] = ~i8;
                }
            }
            this.f26594g = (E[]) objArr;
            this.f68229f7l8 = iArr;
            this.f26597y = i3;
        }

        private void ni7() {
            int i2 = this.f26597y;
            E[] eArr = this.f26594g;
            if (i2 == eArr.length) {
                fn3e(true);
            } else if (this.f26596s) {
                this.f26594g = (E[]) Arrays.copyOf(eArr, eArr.length);
            }
            this.f26596s = false;
        }

        private void zurt() {
            fn3e(false);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f26597y;
                if (i2 >= i4) {
                    Arrays.fill(this.f26594g, i3, i4, (Object) null);
                    Arrays.fill(this.f68229f7l8, i3, this.f26597y, 0);
                    this.f26597y = i3;
                    return;
                }
                int[] iArr = this.f68229f7l8;
                int i5 = iArr[i2];
                if (i5 > 0) {
                    E[] eArr = this.f26594g;
                    eArr[i3] = eArr[i2];
                    iArr[i3] = i5;
                    i3++;
                }
                i2++;
            }
        }

        @Override // com.google.common.collect.b3e.toq, com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: cdj, reason: merged with bridge method [inline-methods] */
        public C4526k<E> zy(Iterable<? extends E> iterable) {
            if (iterable instanceof o05) {
                for (o05.InterfaceC4482k<E> interfaceC4482k : ((o05) iterable).entrySet()) {
                    ld6(interfaceC4482k.getElement(), interfaceC4482k.getCount());
                }
            } else {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    mo15569k(it.next());
                }
            }
            return this;
        }

        @Override // com.google.common.collect.b3e.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: fu4, reason: merged with bridge method [inline-methods] */
        public C4526k<E> qrj(E e2, int i2) {
            com.google.common.base.jk.a9(e2);
            C4524t.toq(i2, "count");
            ni7();
            E[] eArr = this.f26594g;
            int i3 = this.f26597y;
            eArr[i3] = e2;
            this.f68229f7l8[i3] = ~i2;
            this.f26597y = i3 + 1;
            return this;
        }

        @Override // com.google.common.collect.b3e.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C4526k<E> toq(E... eArr) {
            for (E e2 : eArr) {
                mo15569k(e2);
            }
            return this;
        }

        @Override // com.google.common.collect.b3e.toq
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public uc<E> mo15570n() {
            zurt();
            int i2 = this.f26597y;
            if (i2 == 0) {
                return uc.emptyMultiset(this.f26595n);
            }
            l05 l05Var = (l05) ixz.construct(this.f26595n, i2, this.f26594g);
            long[] jArr = new long[this.f26597y + 1];
            int i3 = 0;
            while (i3 < this.f26597y) {
                int i4 = i3 + 1;
                jArr[i4] = jArr[i3] + ((long) this.f68229f7l8[i3]);
                i3 = i4;
            }
            this.f26596s = true;
            return new rp(l05Var, jArr, 0, this.f26597y);
        }

        @Override // com.google.common.collect.b3e.toq, com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
        public C4526k<E> mo15572q(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo15569k(it.next());
            }
            return this;
        }

        @Override // com.google.common.collect.b3e.toq, com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public C4526k<E> f7l8(E e2) {
            return ld6(e2, 1);
        }

        @Override // com.google.common.collect.b3e.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: t8r, reason: merged with bridge method [inline-methods] */
        public C4526k<E> ld6(E e2, int i2) {
            com.google.common.base.jk.a9(e2);
            C4524t.toq(i2, "occurrences");
            if (i2 == 0) {
                return this;
            }
            ni7();
            E[] eArr = this.f26594g;
            int i3 = this.f26597y;
            eArr[i3] = e2;
            this.f68229f7l8[i3] = i2;
            this.f26597y = i3 + 1;
            return this;
        }
    }

    /* JADX INFO: compiled from: ImmutableSortedMultiset.java */
    private static final class toq<E> implements Serializable {
        final Comparator<? super E> comparator;
        final int[] counts;
        final E[] elements;

        toq(gb<E> gbVar) {
            this.comparator = gbVar.comparator();
            int size = gbVar.entrySet().size();
            this.elements = (E[]) new Object[size];
            this.counts = new int[size];
            int i2 = 0;
            for (o05.InterfaceC4482k<E> interfaceC4482k : gbVar.entrySet()) {
                this.elements[i2] = interfaceC4482k.getElement();
                this.counts[i2] = interfaceC4482k.getCount();
                i2++;
            }
        }

        Object readResolve() {
            int length = this.elements.length;
            C4526k c4526k = new C4526k(this.comparator);
            for (int i2 = 0; i2 < length; i2++) {
                c4526k.ld6(this.elements[i2], this.counts[i2]);
            }
            return c4526k.mo15570n();
        }
    }

    uc() {
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/uc<TE;>; */
    public static uc copyOf(Comparable[] comparableArr) {
        return copyOf(kx3.natural(), Arrays.asList(comparableArr));
    }

    public static <E> uc<E> copyOfSorted(gb<E> gbVar) {
        return zy(gbVar.comparator(), wlev.ki(gbVar.entrySet()));
    }

    static <E> uc<E> emptyMultiset(Comparator<? super E> comparator) {
        return kx3.natural().equals(comparator) ? (uc<E>) rp.NATURAL_EMPTY_MULTISET : new rp(comparator);
    }

    public static <E extends Comparable<?>> C4526k<E> naturalOrder() {
        return new C4526k<>(kx3.natural());
    }

    public static <E> uc<E> of() {
        return (uc<E>) rp.NATURAL_EMPTY_MULTISET;
    }

    public static <E> C4526k<E> orderedBy(Comparator<E> comparator) {
        return new C4526k<>(comparator);
    }

    public static <E extends Comparable<?>> C4526k<E> reverseOrder() {
        return new C4526k<>(kx3.natural().reverse());
    }

    private static <E> uc<E> zy(Comparator<? super E> comparator, Collection<o05.InterfaceC4482k<E>> collection) {
        if (collection.isEmpty()) {
            return emptyMultiset(comparator);
        }
        se.C4520k c4520k = new se.C4520k(collection.size());
        long[] jArr = new long[collection.size() + 1];
        int i2 = 0;
        for (o05.InterfaceC4482k<E> interfaceC4482k : collection) {
            c4520k.mo15569k(interfaceC4482k.getElement());
            int i3 = i2 + 1;
            jArr[i3] = jArr[i2] + ((long) interfaceC4482k.getCount());
            i2 = i3;
        }
        return new rp(new l05(c4520k.mo15570n(), comparator), jArr, 0, collection.size());
    }

    @Override // com.google.common.collect.gb, com.google.common.collect.f1bi
    public final Comparator<? super E> comparator() {
        return elementSet().comparator();
    }

    @Override // com.google.common.collect.b3e, com.google.common.collect.o05
    public abstract ixz<E> elementSet();

    @Override // com.google.common.collect.gb
    public abstract uc<E> headMultiset(E e2, fu4 fu4Var);

    @Override // com.google.common.collect.gb
    @CanIgnoreReturnValue
    @Deprecated
    public final o05.InterfaceC4482k<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.gb
    @CanIgnoreReturnValue
    @Deprecated
    public final o05.InterfaceC4482k<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.gb
    public abstract uc<E> tailMultiset(E e2, fu4 fu4Var);

    @Override // com.google.common.collect.b3e, com.google.common.collect.z4
    Object writeReplace() {
        return new toq(this);
    }

    public static <E> uc<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(kx3.natural(), iterable);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/uc<TE;>; */
    public static uc of(Comparable comparable) {
        return new rp((l05) ixz.of(comparable), new long[]{0, 1}, 0, 1);
    }

    @Override // com.google.common.collect.gb
    public uc<E> descendingMultiset() {
        uc<E> ucVarEmptyMultiset = this.descendingMultiset;
        if (ucVarEmptyMultiset == null) {
            ucVarEmptyMultiset = isEmpty() ? emptyMultiset(kx3.from(comparator()).reverse()) : new n5r1<>(this);
            this.descendingMultiset = ucVarEmptyMultiset;
        }
        return ucVarEmptyMultiset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.gb
    public uc<E> subMultiset(E e2, fu4 fu4Var, E e3, fu4 fu4Var2) {
        com.google.common.base.jk.m15391z(comparator().compare(e2, e3) <= 0, "Expected lowerBound <= upperBound but %s > %s", e2, e3);
        return tailMultiset((Object) e2, fu4Var).headMultiset((Object) e3, fu4Var2);
    }

    public static <E> uc<E> copyOf(Iterator<? extends E> it) {
        return copyOf(kx3.natural(), it);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/uc<TE;>; */
    public static uc of(Comparable comparable, Comparable comparable2) {
        return copyOf(kx3.natural(), Arrays.asList(comparable, comparable2));
    }

    public static <E> uc<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        com.google.common.base.jk.a9(comparator);
        return new C4526k(comparator).mo15572q(it).mo15570n();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/uc<TE;>; */
    public static uc of(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return copyOf(kx3.natural(), Arrays.asList(comparable, comparable2, comparable3));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/uc<TE;>; */
    public static uc of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return copyOf(kx3.natural(), Arrays.asList(comparable, comparable2, comparable3, comparable4));
    }

    public static <E> uc<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        if (iterable instanceof uc) {
            uc<E> ucVar = (uc) iterable;
            if (comparator.equals(ucVar.comparator())) {
                return ucVar.isPartialView() ? zy(comparator, ucVar.entrySet().asList()) : ucVar;
            }
        }
        return new C4526k(comparator).zy(iterable).mo15570n();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/uc<TE;>; */
    public static uc of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return copyOf(kx3.natural(), Arrays.asList(comparable, comparable2, comparable3, comparable4, comparable5));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/uc<TE;>; */
    public static uc of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        ArrayList arrayListFn3e = wlev.fn3e(comparableArr.length + 6);
        Collections.addAll(arrayListFn3e, comparable, comparable2, comparable3, comparable4, comparable5, comparable6);
        Collections.addAll(arrayListFn3e, comparableArr);
        return copyOf(kx3.natural(), arrayListFn3e);
    }
}
