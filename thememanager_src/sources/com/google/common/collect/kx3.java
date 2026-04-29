package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: Ordering.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class kx3<T> implements Comparator<T> {
    static final int LEFT_IS_GREATER = 1;
    static final int RIGHT_IS_GREATER = -1;

    /* JADX INFO: renamed from: com.google.common.collect.kx3$k */
    /* JADX INFO: compiled from: Ordering.java */
    @InterfaceC7732q
    static class C4436k extends kx3<Object> {

        /* JADX INFO: renamed from: k */
        private final AtomicInteger f26289k = new AtomicInteger(0);

        /* JADX INFO: renamed from: q */
        private final ConcurrentMap<Object, Integer> f26290q = m2t.ld6(new e5()).m15642s();

        C4436k() {
        }

        /* JADX INFO: renamed from: k */
        private Integer m15782k(Object obj) {
            Integer num = this.f26290q.get(obj);
            if (num != null) {
                return num;
            }
            Integer numValueOf = Integer.valueOf(this.f26289k.getAndIncrement());
            Integer numPutIfAbsent = this.f26290q.putIfAbsent(obj, numValueOf);
            return numPutIfAbsent != null ? numPutIfAbsent : numValueOf;
        }

        @Override // com.google.common.collect.kx3, java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int qVar = toq(obj);
            int qVar2 = toq(obj2);
            if (qVar != qVar2) {
                return qVar < qVar2 ? -1 : 1;
            }
            int iCompareTo = m15782k(obj).compareTo(m15782k(obj2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            throw new AssertionError();
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }

        int toq(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    /* JADX INFO: compiled from: Ordering.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        static final kx3<Object> f26291k = new C4436k();

        private toq() {
        }
    }

    /* JADX INFO: compiled from: Ordering.java */
    @InterfaceC7732q
    static class zy extends ClassCastException {
        private static final long serialVersionUID = 0;
        final Object value;

        zy(Object obj) {
            super("Cannot compare value: " + obj);
            this.value = obj;
        }
    }

    protected kx3() {
    }

    @wlev.toq(serializable = true)
    public static kx3<Object> allEqual() {
        return ki.INSTANCE;
    }

    public static kx3<Object> arbitrary() {
        return toq.f26291k;
    }

    @wlev.toq(serializable = true)
    public static <T> kx3<T> explicit(List<T> list) {
        return new C4481o(list);
    }

    @wlev.toq(serializable = true)
    public static <T> kx3<T> from(Comparator<T> comparator) {
        return comparator instanceof kx3 ? (kx3) comparator : new gvn7(comparator);
    }

    @wlev.toq(serializable = true)
    public static <C extends Comparable> kx3<C> natural() {
        return b9ub.INSTANCE;
    }

    @wlev.toq(serializable = true)
    public static kx3<Object> usingToString() {
        return f3f.INSTANCE;
    }

    @Deprecated
    public int binarySearch(List<? extends T> list, @NullableDecl T t2) {
        return Collections.binarySearch(list, t2, this);
    }

    @Override // java.util.Comparator
    @CanIgnoreReturnValue
    public abstract int compare(@NullableDecl T t2, @NullableDecl T t3);

    @wlev.toq(serializable = true)
    public <U extends T> kx3<U> compound(Comparator<? super U> comparator) {
        return new eqxt(this, (Comparator) com.google.common.base.jk.a9(comparator));
    }

    public <E extends T> List<E> greatestOf(Iterable<E> iterable, int i2) {
        return reverse().leastOf(iterable, i2);
    }

    public <E extends T> se<E> immutableSortedCopy(Iterable<E> iterable) {
        return se.sortedCopyOf(this, iterable);
    }

    public boolean isOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public <E extends T> List<E> leastOf(Iterable<E> iterable, int i2) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= ((long) i2) * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i2) {
                    array = Arrays.copyOf(array, i2);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return leastOf(iterable.iterator(), i2);
    }

    @wlev.toq(serializable = true)
    public <S extends T> kx3<Iterable<S>> lexicographical() {
        return new n2t(this);
    }

    public <E extends T> E max(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) max(next, it.next());
        }
        return next;
    }

    public <E extends T> E min(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) min(next, it.next());
        }
        return next;
    }

    @wlev.toq(serializable = true)
    public <S extends T> kx3<S> nullsFirst() {
        return new b8(this);
    }

    @wlev.toq(serializable = true)
    public <S extends T> kx3<S> nullsLast() {
        return new nme(this);
    }

    <T2 extends T> kx3<Map.Entry<T2, ?>> onKeys() {
        return (kx3<Map.Entry<T2, ?>>) onResultOf(vy.m16019l());
    }

    @wlev.toq(serializable = true)
    public <F> kx3<F> onResultOf(com.google.common.base.t8r<F, ? extends T> t8rVar) {
        return new C4581z(t8rVar, this);
    }

    @wlev.toq(serializable = true)
    public <S extends T> kx3<S> reverse() {
        return new yp31(this);
    }

    public <E extends T> List<E> sortedCopy(Iterable<E> iterable) {
        Object[] objArrX9kr = nsb.x9kr(iterable);
        Arrays.sort(objArrX9kr, this);
        return wlev.ki(Arrays.asList(objArrX9kr));
    }

    @wlev.toq(serializable = true)
    public static <T> kx3<T> compound(Iterable<? extends Comparator<? super T>> iterable) {
        return new eqxt(iterable);
    }

    @wlev.toq(serializable = true)
    public static <T> kx3<T> explicit(T t2, T... tArr) {
        return explicit(wlev.zy(t2, tArr));
    }

    @wlev.toq(serializable = true)
    @Deprecated
    public static <T> kx3<T> from(kx3<T> kx3Var) {
        return (kx3) com.google.common.base.jk.a9(kx3Var);
    }

    public <E extends T> List<E> greatestOf(Iterator<E> it, int i2) {
        return reverse().leastOf(it, i2);
    }

    public <E extends T> E max(Iterable<E> iterable) {
        return (E) max(iterable.iterator());
    }

    public <E extends T> E min(Iterable<E> iterable) {
        return (E) min(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends T> E max(@NullableDecl E e2, @NullableDecl E e3) {
        return compare(e2, e3) >= 0 ? e2 : e3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends T> E min(@NullableDecl E e2, @NullableDecl E e3) {
        return compare(e2, e3) <= 0 ? e2 : e3;
    }

    public <E extends T> E max(@NullableDecl E e2, @NullableDecl E e3, @NullableDecl E e4, E... eArr) {
        E e6 = (E) max(max(e2, e3), e4);
        for (E e7 : eArr) {
            e6 = (E) max(e6, e7);
        }
        return e6;
    }

    public <E extends T> E min(@NullableDecl E e2, @NullableDecl E e3, @NullableDecl E e4, E... eArr) {
        E e6 = (E) min(min(e2, e3), e4);
        for (E e7 : eArr) {
            e6 = (E) min(e6, e7);
        }
        return e6;
    }

    public <E extends T> List<E> leastOf(Iterator<E> it, int i2) {
        com.google.common.base.jk.a9(it);
        C4524t.toq(i2, "k");
        if (i2 == 0 || !it.hasNext()) {
            return Collections.emptyList();
        }
        if (i2 >= 1073741823) {
            ArrayList arrayListT8r = wlev.t8r(it);
            Collections.sort(arrayListT8r, this);
            if (arrayListT8r.size() > i2) {
                arrayListT8r.subList(i2, arrayListT8r.size()).clear();
            }
            arrayListT8r.trimToSize();
            return Collections.unmodifiableList(arrayListT8r);
        }
        xblq xblqVarM16076q = xblq.m16076q(i2, this);
        xblqVarM16076q.f7l8(it);
        return xblqVarM16076q.m16081p();
    }
}
