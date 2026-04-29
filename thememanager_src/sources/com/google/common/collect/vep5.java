package com.google.common.collect;

import com.google.common.collect.z4;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: ImmutableSet.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
public abstract class vep5<E> extends z4<E> implements Set<E> {
    static final int MAX_TABLE_SIZE = 1073741824;

    /* JADX INFO: renamed from: g */
    private static final int f26603g = 751619276;

    /* JADX INFO: renamed from: n */
    private static final double f26604n = 0.7d;

    /* JADX INFO: renamed from: q */
    @RetainedWith
    @NullableDecl
    @LazyInit
    private transient se<E> f26605q;

    /* JADX INFO: renamed from: com.google.common.collect.vep5$k */
    /* JADX INFO: compiled from: ImmutableSet.java */
    public static class C4532k<E> extends z4.AbstractC4582k<E> {

        /* JADX INFO: renamed from: g */
        private int f26606g;

        /* JADX INFO: renamed from: n */
        @InterfaceC7732q
        @NullableDecl
        Object[] f26607n;

        public C4532k() {
            super(4);
        }

        private void qrj(E e2) {
            int length = this.f26607n.length - 1;
            int iHashCode = e2.hashCode();
            int iZy = etdu.zy(iHashCode);
            while (true) {
                int i2 = iZy & length;
                Object[] objArr = this.f26607n;
                Object obj = objArr[i2];
                if (obj == null) {
                    objArr[i2] = e2;
                    this.f26606g += iHashCode;
                    super.mo15569k(e2);
                    return;
                } else if (obj.equals(e2)) {
                    return;
                } else {
                    iZy = i2 + 1;
                }
            }
        }

        @Override // com.google.common.collect.z4.AbstractC4582k, com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public C4532k<E> zy(Iterable<? extends E> iterable) {
            com.google.common.base.jk.a9(iterable);
            if (this.f26607n != null) {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    f7l8(it.next());
                }
            } else {
                super.zy(iterable);
            }
            return this;
        }

        @Override // com.google.common.collect.z4.toq
        /* JADX INFO: renamed from: n7h, reason: merged with bridge method [inline-methods] */
        public vep5<E> mo15570n() {
            vep5<E> vep5VarM16004k;
            int i2 = this.f68239zy;
            if (i2 == 0) {
                return vep5.of();
            }
            if (i2 == 1) {
                return vep5.of(this.f68238toq[0]);
            }
            if (this.f26607n == null || vep5.chooseTableSize(i2) != this.f26607n.length) {
                vep5VarM16004k = vep5.m16004k(this.f68239zy, this.f68238toq);
                this.f68239zy = vep5VarM16004k.size();
            } else {
                Object[] objArrCopyOf = vep5.toq(this.f68239zy, this.f68238toq.length) ? Arrays.copyOf(this.f68238toq, this.f68239zy) : this.f68238toq;
                vep5VarM16004k = new yw<>(objArrCopyOf, this.f26606g, this.f26607n, r5.length - 1, this.f68239zy);
            }
            this.f26749q = true;
            this.f26607n = null;
            return vep5VarM16004k;
        }

        @Override // com.google.common.collect.z4.AbstractC4582k, com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public C4532k<E> toq(E... eArr) {
            if (this.f26607n != null) {
                for (E e2 : eArr) {
                    f7l8(e2);
                }
            } else {
                super.toq(eArr);
            }
            return this;
        }

        @Override // com.google.common.collect.z4.AbstractC4582k, com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public C4532k<E> mo15569k(E e2) {
            com.google.common.base.jk.a9(e2);
            if (this.f26607n != null && vep5.chooseTableSize(this.f68239zy) <= this.f26607n.length) {
                qrj(e2);
                return this;
            }
            this.f26607n = null;
            super.mo15569k(e2);
            return this;
        }

        @Override // com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public C4532k<E> mo15572q(Iterator<? extends E> it) {
            com.google.common.base.jk.a9(it);
            while (it.hasNext()) {
                f7l8(it.next());
            }
            return this;
        }

        C4532k(int i2) {
            super(i2);
            this.f26607n = new Object[vep5.chooseTableSize(i2)];
        }
    }

    /* JADX INFO: compiled from: ImmutableSet.java */
    private static class toq implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        toq(Object[] objArr) {
            this.elements = objArr;
        }

        Object readResolve() {
            return vep5.copyOf(this.elements);
        }
    }

    vep5() {
    }

    public static <E> C4532k<E> builder() {
        return new C4532k<>();
    }

    @InterfaceC7731k
    public static <E> C4532k<E> builderWithExpectedSize(int i2) {
        C4524t.toq(i2, "expectedSize");
        return new C4532k<>(i2);
    }

    @InterfaceC7732q
    static int chooseTableSize(int i2) {
        int iMax = Math.max(i2, 2);
        if (iMax >= f26603g) {
            com.google.common.base.jk.m15380n(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * f26604n < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static <E> vep5<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof vep5) && !(collection instanceof SortedSet)) {
            vep5<E> vep5Var = (vep5) collection;
            if (!vep5Var.isPartialView()) {
                return vep5Var;
            }
        }
        Object[] array = collection.toArray();
        return m16004k(array.length, array);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static <E> vep5<E> m16004k(int i2, Object... objArr) {
        if (i2 == 0) {
            return of();
        }
        if (i2 == 1) {
            return of(objArr[0]);
        }
        int iChooseTableSize = chooseTableSize(i2);
        Object[] objArr2 = new Object[iChooseTableSize];
        int i3 = iChooseTableSize - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object objM15973k = r25n.m15973k(objArr[i6], i6);
            int iHashCode = objM15973k.hashCode();
            int iZy = etdu.zy(iHashCode);
            while (true) {
                int i7 = iZy & i3;
                Object obj = objArr2[i7];
                if (obj == null) {
                    objArr[i5] = objM15973k;
                    objArr2[i7] = objM15973k;
                    i4 += iHashCode;
                    i5++;
                    break;
                }
                if (obj.equals(objM15973k)) {
                    break;
                }
                iZy++;
            }
        }
        Arrays.fill(objArr, i5, i2, (Object) null);
        if (i5 == 1) {
            return new imd(objArr[0], i4);
        }
        if (chooseTableSize(i5) < iChooseTableSize / 2) {
            return m16004k(i5, objArr);
        }
        if (toq(i5, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new yw(objArr, i4, objArr2, i3, i5);
    }

    public static <E> vep5<E> of() {
        return yw.EMPTY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean toq(int i2, int i3) {
        return i2 < (i3 >> 1) + (i3 >> 2);
    }

    @Override // com.google.common.collect.z4
    public se<E> asList() {
        se<E> seVar = this.f26605q;
        if (seVar != null) {
            return seVar;
        }
        se<E> seVarCreateAsList = createAsList();
        this.f26605q = seVarCreateAsList;
        return seVarCreateAsList;
    }

    se<E> createAsList() {
        return se.asImmutableList(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof vep5) && isHashCodeFast() && ((vep5) obj).isHashCodeFast() && hashCode() != obj.hashCode()) {
            return false;
        }
        return g0ad.f7l8(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return g0ad.ld6(this);
    }

    boolean isHashCodeFast() {
        return false;
    }

    @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
    public abstract ab<E> iterator();

    @Override // com.google.common.collect.z4
    Object writeReplace() {
        return new toq(toArray());
    }

    public static <E> vep5<E> of(E e2) {
        return new imd(e2);
    }

    public static <E> vep5<E> of(E e2, E e3) {
        return m16004k(2, e2, e3);
    }

    public static <E> vep5<E> of(E e2, E e3, E e4) {
        return m16004k(3, e2, e3, e4);
    }

    public static <E> vep5<E> of(E e2, E e3, E e4, E e6) {
        return m16004k(4, e2, e3, e4, e6);
    }

    public static <E> vep5<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> vep5<E> of(E e2, E e3, E e4, E e6, E e7) {
        return m16004k(5, e2, e3, e4, e6, e7);
    }

    @SafeVarargs
    public static <E> vep5<E> of(E e2, E e3, E e4, E e6, E e7, E e8, E... eArr) {
        com.google.common.base.jk.m15380n(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e2;
        objArr[1] = e3;
        objArr[2] = e4;
        objArr[3] = e6;
        objArr[4] = e7;
        objArr[5] = e8;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return m16004k(length, objArr);
    }

    public static <E> vep5<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        return new C4532k().f7l8(next).mo15572q(it).mo15570n();
    }

    public static <E> vep5<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return of();
        }
        if (length != 1) {
            return m16004k(eArr.length, (Object[]) eArr.clone());
        }
        return of((Object) eArr[0]);
    }
}
