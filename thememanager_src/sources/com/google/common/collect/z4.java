package com.google.common.collect;

import com.google.common.collect.se;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ImmutableCollection.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public abstract class z4<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: k */
    private static final Object[] f26748k = new Object[0];

    /* JADX INFO: renamed from: com.google.common.collect.z4$k */
    /* JADX INFO: compiled from: ImmutableCollection.java */
    static abstract class AbstractC4582k<E> extends toq<E> {

        /* JADX INFO: renamed from: q */
        boolean f26749q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        Object[] f68238toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f68239zy;

        AbstractC4582k(int i2) {
            C4524t.toq(i2, "initialCapacity");
            this.f68238toq = new Object[i2];
            this.f68239zy = 0;
        }

        /* JADX INFO: renamed from: y */
        private void m16102y(int i2) {
            Object[] objArr = this.f68238toq;
            if (objArr.length < i2) {
                this.f68238toq = Arrays.copyOf(objArr, toq.m16103g(objArr.length, i2));
                this.f26749q = false;
            } else if (this.f26749q) {
                this.f68238toq = (Object[]) objArr.clone();
                this.f26749q = false;
            }
        }

        @Override // com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: f7l8 */
        public AbstractC4582k<E> mo15569k(E e2) {
            com.google.common.base.jk.a9(e2);
            m16102y(this.f68239zy + 1);
            Object[] objArr = this.f68238toq;
            int i2 = this.f68239zy;
            this.f68239zy = i2 + 1;
            objArr[i2] = e2;
            return this;
        }

        @Override // com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        public toq<E> toq(E... eArr) {
            r25n.toq(eArr);
            m16102y(this.f68239zy + eArr.length);
            System.arraycopy(eArr, 0, this.f68238toq, this.f68239zy, eArr.length);
            this.f68239zy += eArr.length;
            return this;
        }

        @Override // com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        public toq<E> zy(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                m16102y(this.f68239zy + collection.size());
                if (collection instanceof z4) {
                    this.f68239zy = ((z4) collection).copyIntoArray(this.f68238toq, this.f68239zy);
                    return this;
                }
            }
            super.zy(iterable);
            return this;
        }
    }

    /* JADX INFO: compiled from: ImmutableCollection.java */
    public static abstract class toq<E> {

        /* JADX INFO: renamed from: k */
        static final int f26750k = 4;

        toq() {
        }

        /* JADX INFO: renamed from: g */
        static int m16103g(int i2, int i3) {
            if (i3 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i2 + (i2 >> 1) + 1;
            if (iHighestOneBit < i3) {
                iHighestOneBit = Integer.highestOneBit(i3 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: k */
        public abstract toq<E> mo15569k(E e2);

        /* JADX INFO: renamed from: n */
        public abstract z4<E> mo15570n();

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: q */
        public toq<E> mo15572q(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo15569k(it.next());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public toq<E> toq(E... eArr) {
            for (E e2 : eArr) {
                mo15569k(e2);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public toq<E> zy(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                mo15569k(it.next());
            }
            return this;
        }
    }

    z4() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public se<E> asList() {
        return isEmpty() ? se.of() : se.asImmutableList(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public abstract boolean contains(@NullableDecl Object obj);

    @CanIgnoreReturnValue
    int copyIntoArray(Object[] objArr, int i2) {
        ab<E> it = iterator();
        while (it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
        return i2;
    }

    Object[] internalArray() {
        return null;
    }

    int internalArrayEnd() {
        throw new UnsupportedOperationException();
    }

    int internalArrayStart() {
        throw new UnsupportedOperationException();
    }

    abstract boolean isPartialView();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
    public abstract ab<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f26748k);
    }

    Object writeReplace() {
        return new se.C4522q(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        com.google.common.base.jk.a9(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrInternalArray = internalArray();
            if (objArrInternalArray != null) {
                return (T[]) m2t.m15827k(objArrInternalArray, internalArrayStart(), internalArrayEnd(), tArr);
            }
            tArr = (T[]) r25n.m15975p(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        copyIntoArray(tArr, 0);
        return tArr;
    }
}
