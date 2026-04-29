package com.google.common.collect;

import com.google.common.math.C4723q;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Collections2.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class mcp {

    /* JADX INFO: renamed from: com.google.common.collect.mcp$g */
    /* JADX INFO: compiled from: Collections2.java */
    static class C4462g<F, T> extends AbstractCollection<T> {

        /* JADX INFO: renamed from: k */
        final Collection<F> f26404k;

        /* JADX INFO: renamed from: q */
        final com.google.common.base.t8r<? super F, ? extends T> f26405q;

        C4462g(Collection<F> collection, com.google.common.base.t8r<? super F, ? extends T> t8rVar) {
            this.f26404k = (Collection) com.google.common.base.jk.a9(collection);
            this.f26405q = (com.google.common.base.t8r) com.google.common.base.jk.a9(t8rVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f26404k.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f26404k.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return zwy.m16124j(this.f26404k.iterator(), this.f26405q);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f26404k.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.mcp$k */
    /* JADX INFO: compiled from: Collections2.java */
    static class C4463k<E> extends AbstractCollection<E> {

        /* JADX INFO: renamed from: k */
        final Collection<E> f26406k;

        /* JADX INFO: renamed from: q */
        final com.google.common.base.a9<? super E> f26407q;

        C4463k(Collection<E> collection, com.google.common.base.a9<? super E> a9Var) {
            this.f26406k = collection;
            this.f26407q = a9Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e2) {
            com.google.common.base.jk.m15383q(this.f26407q.apply(e2));
            return this.f26406k.add(e2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                com.google.common.base.jk.m15383q(this.f26407q.apply(it.next()));
            }
            return this.f26406k.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            nsb.oc(this.f26406k, this.f26407q);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            if (mcp.ld6(this.f26406k, obj)) {
                return this.f26407q.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return mcp.zy(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !nsb.zy(this.f26406k, this.f26407q);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return zwy.fu4(this.f26406k.iterator(), this.f26407q);
        }

        /* JADX INFO: renamed from: k */
        C4463k<E> m15864k(com.google.common.base.a9<? super E> a9Var) {
            return new C4463k<>(this.f26406k, com.google.common.base.fti.m15348q(this.f26407q, a9Var));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f26406k.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f26406k.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f26407q.apply(next) && collection.contains(next)) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f26406k.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f26407q.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f26406k.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (this.f26407q.apply(it.next())) {
                    i2++;
                }
            }
            return i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return wlev.t8r(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) wlev.t8r(iterator()).toArray(tArr);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.mcp$n */
    /* JADX INFO: compiled from: Collections2.java */
    private static class C4464n<E> extends com.google.common.collect.zy<List<E>> {

        /* JADX INFO: renamed from: g */
        final int[] f26408g;

        /* JADX INFO: renamed from: n */
        final List<E> f26409n;

        /* JADX INFO: renamed from: s */
        int f26410s;

        /* JADX INFO: renamed from: y */
        final int[] f26411y;

        C4464n(List<E> list) {
            this.f26409n = new ArrayList(list);
            int size = list.size();
            int[] iArr = new int[size];
            this.f26408g = iArr;
            int[] iArr2 = new int[size];
            this.f26411y = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 1);
            this.f26410s = Integer.MAX_VALUE;
        }

        /* JADX INFO: renamed from: g */
        void m15865g() {
            int[] iArr = this.f26411y;
            int i2 = this.f26410s;
            iArr[i2] = -iArr[i2];
            this.f26410s = i2 - 1;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.zy
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public List<E> mo15703k() {
            if (this.f26410s <= 0) {
                return toq();
            }
            se seVarCopyOf = se.copyOf((Collection) this.f26409n);
            m15867q();
            return seVarCopyOf;
        }

        /* JADX INFO: renamed from: q */
        void m15867q() {
            int size = this.f26409n.size() - 1;
            this.f26410s = size;
            if (size == -1) {
                return;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f26408g;
                int i3 = this.f26410s;
                int i4 = iArr[i3];
                int i5 = this.f26411y[i3] + i4;
                if (i5 < 0) {
                    m15865g();
                } else if (i5 != i3 + 1) {
                    Collections.swap(this.f26409n, (i3 - i4) + i2, (i3 - i5) + i2);
                    this.f26408g[this.f26410s] = i5;
                    return;
                } else {
                    if (i3 == 0) {
                        return;
                    }
                    i2++;
                    m15865g();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.mcp$q */
    /* JADX INFO: compiled from: Collections2.java */
    private static final class C4465q<E> extends AbstractCollection<List<E>> {

        /* JADX INFO: renamed from: k */
        final se<E> f26412k;

        C4465q(se<E> seVar) {
            this.f26412k = seVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return mcp.m15857g(this.f26412k, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new C4464n(this.f26412k);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C4723q.m16549y(this.f26412k.size());
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "permutations(" + this.f26412k + ")";
        }
    }

    /* JADX INFO: compiled from: Collections2.java */
    private static final class toq<E> extends AbstractCollection<List<E>> {

        /* JADX INFO: renamed from: k */
        final se<E> f26413k;

        /* JADX INFO: renamed from: n */
        final int f26414n;

        /* JADX INFO: renamed from: q */
        final Comparator<? super E> f26415q;

        toq(Iterable<E> iterable, Comparator<? super E> comparator) {
            se<E> seVarSortedCopyOf = se.sortedCopyOf(comparator, iterable);
            this.f26413k = seVarSortedCopyOf;
            this.f26415q = comparator;
            this.f26414n = m15868k(seVarSortedCopyOf, comparator);
        }

        /* JADX INFO: renamed from: k */
        private static <E> int m15868k(List<E> list, Comparator<? super E> comparator) {
            int i2 = 1;
            int iFn3e = 1;
            int i3 = 1;
            while (i2 < list.size()) {
                if (comparator.compare(list.get(i2 - 1), list.get(i2)) < 0) {
                    iFn3e = C4723q.fn3e(iFn3e, C4723q.m16544k(i2, i3));
                    i3 = 0;
                    if (iFn3e == Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                }
                i2++;
                i3++;
            }
            return C4723q.fn3e(iFn3e, C4723q.m16544k(i2, i3));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return mcp.m15857g(this.f26413k, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new zy(this.f26413k, this.f26415q);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f26414n;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "orderedPermutationCollection(" + this.f26413k + ")";
        }
    }

    /* JADX INFO: compiled from: Collections2.java */
    private static final class zy<E> extends com.google.common.collect.zy<List<E>> {

        /* JADX INFO: renamed from: g */
        final Comparator<? super E> f26416g;

        /* JADX INFO: renamed from: n */
        @NullableDecl
        List<E> f26417n;

        zy(List<E> list, Comparator<? super E> comparator) {
            this.f26417n = wlev.ki(list);
            this.f26416g = comparator;
        }

        int f7l8(int i2) {
            E e2 = this.f26417n.get(i2);
            for (int size = this.f26417n.size() - 1; size > i2; size--) {
                if (this.f26416g.compare(e2, this.f26417n.get(size)) < 0) {
                    return size;
                }
            }
            throw new AssertionError("this statement should be unreachable");
        }

        /* JADX INFO: renamed from: g */
        int m15869g() {
            for (int size = this.f26417n.size() - 2; size >= 0; size--) {
                if (this.f26416g.compare(this.f26417n.get(size), this.f26417n.get(size + 1)) < 0) {
                    return size;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.zy
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public List<E> mo15703k() {
            List<E> list = this.f26417n;
            if (list == null) {
                return toq();
            }
            se seVarCopyOf = se.copyOf((Collection) list);
            m15871q();
            return seVarCopyOf;
        }

        /* JADX INFO: renamed from: q */
        void m15871q() {
            int iM15869g = m15869g();
            if (iM15869g == -1) {
                this.f26417n = null;
                return;
            }
            Collections.swap(this.f26417n, iM15869g, f7l8(iM15869g));
            Collections.reverse(this.f26417n.subList(iM15869g + 1, this.f26417n.size()));
        }
    }

    private mcp() {
    }

    static StringBuilder f7l8(int i2) {
        C4524t.toq(i2, "size");
        return new StringBuilder((int) Math.min(((long) i2) * 8, 1073741824L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static boolean m15857g(List<?> list, List<?> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        ew ewVarM15861q = m15861q(list);
        ew ewVarM15861q2 = m15861q(list2);
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (ewVarM15861q.x2(i2) != ewVarM15861q2.f7l8(ewVarM15861q.m15662p(i2))) {
                return false;
            }
        }
        return true;
    }

    static boolean ld6(Collection<?> collection, @NullableDecl Object obj) {
        com.google.common.base.jk.a9(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static <E> Collection<E> m15859n(Collection<E> collection, com.google.common.base.a9<? super E> a9Var) {
        return collection instanceof C4463k ? ((C4463k) collection).m15864k(a9Var) : new C4463k((Collection) com.google.common.base.jk.a9(collection), (com.google.common.base.a9) com.google.common.base.jk.a9(a9Var));
    }

    public static <F, T> Collection<T> n7h(Collection<F> collection, com.google.common.base.t8r<? super F, T> t8rVar) {
        return new C4462g(collection, t8rVar);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: p */
    public static <E> Collection<List<E>> m15860p(Collection<E> collection) {
        return new C4465q(se.copyOf((Collection) collection));
    }

    /* JADX INFO: renamed from: q */
    private static <E> ew<E> m15861q(Collection<E> collection) {
        ew<E> ewVar = new ew<>();
        for (E e2 : collection) {
            ewVar.zurt(e2, ewVar.f7l8(e2) + 1);
        }
        return ewVar;
    }

    static String qrj(Collection<?> collection) {
        StringBuilder sbF7l8 = f7l8(collection.size());
        sbF7l8.append('[');
        boolean z2 = true;
        for (Object obj : collection) {
            if (!z2) {
                sbF7l8.append(", ");
            }
            z2 = false;
            if (obj == collection) {
                sbF7l8.append("(this Collection)");
            } else {
                sbF7l8.append(obj);
            }
        }
        sbF7l8.append(']');
        return sbF7l8.toString();
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: s */
    public static <E> Collection<List<E>> m15862s(Iterable<E> iterable, Comparator<? super E> comparator) {
        return new toq(iterable, comparator);
    }

    static <T> Collection<T> toq(Iterable<T> iterable) {
        return (Collection) iterable;
    }

    static boolean x2(Collection<?> collection, @NullableDecl Object obj) {
        com.google.common.base.jk.a9(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: y */
    public static <E extends Comparable<? super E>> Collection<List<E>> m15863y(Iterable<E> iterable) {
        return m15862s(iterable, kx3.natural());
    }

    static boolean zy(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }
}
