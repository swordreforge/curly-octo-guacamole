package com.google.common.collect;

import com.google.common.base.C4280z;
import com.google.common.math.C4723q;
import com.google.common.primitives.C4746s;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: Lists.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class wlev {

    /* JADX INFO: compiled from: Lists.java */
    private static class f7l8<E> extends zy<E> implements RandomAccess {
        f7l8(List<E> list) {
            super(list);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.wlev$g */
    /* JADX INFO: compiled from: Lists.java */
    private static class C4557g<T> extends AbstractList<List<T>> {

        /* JADX INFO: renamed from: k */
        final List<T> f26667k;

        /* JADX INFO: renamed from: q */
        final int f26668q;

        C4557g(List<T> list, int i2) {
            this.f26667k = list;
            this.f26668q = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f26667k.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public List<T> get(int i2) {
            com.google.common.base.jk.mcp(i2, size());
            int i3 = this.f26668q;
            int i4 = i2 * i3;
            return this.f26667k.subList(i4, Math.min(i3 + i4, this.f26667k.size()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return C4723q.f7l8(this.f26667k.size(), this.f26668q, RoundingMode.CEILING);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.wlev$k */
    /* JADX INFO: compiled from: Lists.java */
    static class C4558k<E> extends f7l8<E> {

        /* JADX INFO: renamed from: q */
        private static final long f26669q = 0;

        C4558k(List list) {
            super(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i2) {
            return this.f26678k.listIterator(i2);
        }
    }

    /* JADX INFO: compiled from: Lists.java */
    private static final class ld6 extends se<Character> {
        private final String string;

        ld6(String str) {
            this.string = str;
        }

        @Override // com.google.common.collect.se, java.util.List
        public int indexOf(@NullableDecl Object obj) {
            if (obj instanceof Character) {
                return this.string.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.se, java.util.List
        public int lastIndexOf(@NullableDecl Object obj) {
            if (obj instanceof Character) {
                return this.string.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.string.length();
        }

        @Override // java.util.List
        public Character get(int i2) {
            com.google.common.base.jk.mcp(i2, size());
            return Character.valueOf(this.string.charAt(i2));
        }

        @Override // com.google.common.collect.se, java.util.List
        public se<Character> subList(int i2, int i3) {
            com.google.common.base.jk.ek5k(i2, i3, size());
            return wlev.f7l8(this.string.substring(i2, i3));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.wlev$n */
    /* JADX INFO: compiled from: Lists.java */
    private static class C4559n<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        @NullableDecl
        final E first;
        final E[] rest;

        C4559n(@NullableDecl E e2, E[] eArr) {
            this.first = e2;
            this.rest = (E[]) ((Object[]) com.google.common.base.jk.a9(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i2) {
            com.google.common.base.jk.mcp(i2, size());
            return i2 == 0 ? this.first : this.rest[i2 - 1];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return C4723q.m16543i(this.rest.length, 1);
        }
    }

    /* JADX INFO: compiled from: Lists.java */
    private static class n7h<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        @NullableDecl
        final E first;
        final E[] rest;

        @NullableDecl
        final E second;

        n7h(@NullableDecl E e2, @NullableDecl E e3, E[] eArr) {
            this.first = e2;
            this.second = e3;
            this.rest = (E[]) ((Object[]) com.google.common.base.jk.a9(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i2) {
            if (i2 == 0) {
                return this.first;
            }
            if (i2 == 1) {
                return this.second;
            }
            com.google.common.base.jk.mcp(i2, size());
            return this.rest[i2 - 2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return C4723q.m16543i(this.rest.length, 2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.wlev$p */
    /* JADX INFO: compiled from: Lists.java */
    private static class C4560p<T> extends AbstractList<T> {

        /* JADX INFO: renamed from: k */
        private final List<T> f26670k;

        /* JADX INFO: renamed from: com.google.common.collect.wlev$p$k */
        /* JADX INFO: compiled from: Lists.java */
        class k implements ListIterator<T> {

            /* JADX INFO: renamed from: k */
            boolean f26671k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ ListIterator f26673q;

            k(ListIterator listIterator) {
                this.f26673q = listIterator;
            }

            @Override // java.util.ListIterator
            public void add(T t2) {
                this.f26673q.add(t2);
                this.f26673q.previous();
                this.f26671k = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f26673q.hasPrevious();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f26673q.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f26671k = true;
                return (T) this.f26673q.previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return C4560p.this.m16068n(this.f26673q.nextIndex());
            }

            @Override // java.util.ListIterator
            public T previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f26671k = true;
                return (T) this.f26673q.next();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                C4524t.m15984n(this.f26671k);
                this.f26673q.remove();
                this.f26671k = false;
            }

            @Override // java.util.ListIterator
            public void set(T t2) {
                com.google.common.base.jk.yz(this.f26671k);
                this.f26673q.set(t2);
            }
        }

        C4560p(List<T> list) {
            this.f26670k = (List) com.google.common.base.jk.a9(list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public int m16068n(int i2) {
            int size = size();
            com.google.common.base.jk.m15381o(i2, size);
            return size - i2;
        }

        private int zy(int i2) {
            int size = size();
            com.google.common.base.jk.mcp(i2, size);
            return (size - 1) - i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i2, @NullableDecl T t2) {
            this.f26670k.add(m16068n(i2), t2);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f26670k.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i2) {
            return this.f26670k.get(zy(i2));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i2) {
            return new k(this.f26670k.listIterator(m16068n(i2)));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i2) {
            return this.f26670k.remove(zy(i2));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i2, int i3) {
            subList(i2, i3).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T set(int i2, @NullableDecl T t2) {
            return this.f26670k.set(zy(i2), t2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f26670k.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i2, int i3) {
            com.google.common.base.jk.ek5k(i2, i3, size());
            return wlev.m16063t(this.f26670k.subList(m16068n(i3), m16068n(i2)));
        }

        List<T> toq() {
            return this.f26670k;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.wlev$q */
    /* JADX INFO: compiled from: Lists.java */
    private static final class C4561q extends AbstractList<Character> {

        /* JADX INFO: renamed from: k */
        private final CharSequence f26674k;

        C4561q(CharSequence charSequence) {
            this.f26674k = charSequence;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Character get(int i2) {
            com.google.common.base.jk.mcp(i2, size());
            return Character.valueOf(this.f26674k.charAt(i2));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f26674k.length();
        }
    }

    /* JADX INFO: compiled from: Lists.java */
    private static class qrj<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final com.google.common.base.t8r<? super F, ? extends T> function;

        /* JADX INFO: renamed from: com.google.common.collect.wlev$qrj$k */
        /* JADX INFO: compiled from: Lists.java */
        class C4562k extends xtb7<F, T> {
            C4562k(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.pnt2
            /* JADX INFO: renamed from: k */
            T mo15580k(F f2) {
                return qrj.this.function.apply(f2);
            }
        }

        qrj(List<F> list, com.google.common.base.t8r<? super F, ? extends T> t8rVar) {
            this.fromList = (List) com.google.common.base.jk.a9(list);
            this.function = (com.google.common.base.t8r) com.google.common.base.jk.a9(t8rVar);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.fromList.clear();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i2) {
            return new C4562k(this.fromList.listIterator(i2));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.wlev$s */
    /* JADX INFO: compiled from: Lists.java */
    private static class C4563s<T> extends C4560p<T> implements RandomAccess {
        C4563s(List<T> list) {
            super(list);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: compiled from: Lists.java */
    static class toq<E> extends zy<E> {

        /* JADX INFO: renamed from: q */
        private static final long f26676q = 0;

        toq(List list) {
            super(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i2) {
            return this.f26678k.listIterator(i2);
        }
    }

    /* JADX INFO: compiled from: Lists.java */
    private static class x2<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final com.google.common.base.t8r<? super F, ? extends T> function;

        /* JADX INFO: renamed from: com.google.common.collect.wlev$x2$k */
        /* JADX INFO: compiled from: Lists.java */
        class C4564k extends xtb7<F, T> {
            C4564k(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.pnt2
            /* JADX INFO: renamed from: k */
            T mo15580k(F f2) {
                return x2.this.function.apply(f2);
            }
        }

        x2(List<F> list, com.google.common.base.t8r<? super F, ? extends T> t8rVar) {
            this.fromList = (List) com.google.common.base.jk.a9(list);
            this.function = (com.google.common.base.t8r) com.google.common.base.jk.a9(t8rVar);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.fromList.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i2) {
            return this.function.apply(this.fromList.get(i2));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i2) {
            return new C4564k(this.fromList.listIterator(i2));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i2) {
            return this.function.apply(this.fromList.remove(i2));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.wlev$y */
    /* JADX INFO: compiled from: Lists.java */
    private static class C4565y<T> extends C4557g<T> implements RandomAccess {
        C4565y(List<T> list, int i2) {
            super(list, i2);
        }
    }

    /* JADX INFO: compiled from: Lists.java */
    private static class zy<E> extends AbstractList<E> {

        /* JADX INFO: renamed from: k */
        final List<E> f26678k;

        zy(List<E> list) {
            this.f26678k = (List) com.google.common.base.jk.a9(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i2, E e2) {
            this.f26678k.add(i2, e2);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i2, Collection<? extends E> collection) {
            return this.f26678k.addAll(i2, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f26678k.contains(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i2) {
            return this.f26678k.get(i2);
        }

        @Override // java.util.AbstractList, java.util.List
        public E remove(int i2) {
            return this.f26678k.remove(i2);
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int i2, E e2) {
            return this.f26678k.set(i2, e2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f26678k.size();
        }
    }

    private wlev() {
    }

    @wlev.toq(serializable = true)
    public static <E> ArrayList<E> cdj() {
        return new ArrayList<>();
    }

    public static se<Character> f7l8(String str) {
        return new ld6((String) com.google.common.base.jk.a9(str));
    }

    @wlev.toq(serializable = true)
    public static <E> ArrayList<E> fn3e(int i2) {
        C4524t.toq(i2, "initialArraySize");
        return new ArrayList<>(i2);
    }

    @wlev.zy
    public static <E> CopyOnWriteArrayList<E> fu4(Iterable<? extends E> iterable) {
        return new CopyOnWriteArrayList<>(iterable instanceof Collection ? mcp.toq(iterable) : ki(iterable));
    }

    /* JADX INFO: renamed from: g */
    static <T> List<T> m16055g(Iterable<T> iterable) {
        return (List) iterable;
    }

    /* JADX INFO: renamed from: h */
    static <E> ListIterator<E> m16056h(List<E> list, int i2) {
        return new zy(list).listIterator(i2);
    }

    @SafeVarargs
    @wlev.toq(serializable = true)
    /* JADX INFO: renamed from: i */
    public static <E> ArrayList<E> m16057i(E... eArr) {
        com.google.common.base.jk.a9(eArr);
        ArrayList<E> arrayList = new ArrayList<>(m16062s(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <F, T> List<T> jk(List<F> list, com.google.common.base.t8r<? super F, ? extends T> t8rVar) {
        return list instanceof RandomAccess ? new x2(list, t8rVar) : new qrj(list, t8rVar);
    }

    /* JADX INFO: renamed from: k */
    static <E> boolean m16058k(List<E> list, int i2, Iterable<? extends E> iterable) {
        ListIterator<E> listIterator = list.listIterator(i2);
        Iterator<? extends E> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            listIterator.add(it.next());
            z2 = true;
        }
        return z2;
    }

    @wlev.toq(serializable = true)
    public static <E> ArrayList<E> ki(Iterable<? extends E> iterable) {
        com.google.common.base.jk.a9(iterable);
        return iterable instanceof Collection ? new ArrayList<>(mcp.toq(iterable)) : t8r(iterable.iterator());
    }

    private static int kja0(List<?> list, @NullableDecl Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    static int ld6(List<?> list) {
        Iterator<?> it = list.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i2 = ~(~((i2 * 31) + (next == null ? 0 : next.hashCode())));
        }
        return i2;
    }

    static <E> List<E> mcp(List<E> list, int i2, int i3) {
        return (list instanceof RandomAccess ? new C4558k(list) : new toq(list)).subList(i2, i3);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: n */
    public static <B> List<List<B>> m16059n(List<? extends B>... listArr) {
        return m16061q(Arrays.asList(listArr));
    }

    static int n7h(List<?> list, @NullableDecl Object obj) {
        if (list instanceof RandomAccess) {
            return kja0(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C4280z.m15455k(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @wlev.zy
    public static <E> CopyOnWriteArrayList<E> ni7() {
        return new CopyOnWriteArrayList<>();
    }

    @wlev.toq(serializable = true)
    public static <E> LinkedList<E> o1t(Iterable<? extends E> iterable) {
        LinkedList<E> linkedListM16065z = m16065z();
        nsb.m15905k(linkedListM16065z, iterable);
        return linkedListM16065z;
    }

    /* JADX INFO: renamed from: p */
    static boolean m16060p(List<?> list, @NullableDecl Object obj) {
        if (obj == com.google.common.base.jk.a9(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return zwy.m16123i(list.iterator(), list2.iterator());
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!C4280z.m15455k(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static <B> List<List<B>> m16061q(List<? extends List<? extends B>> list) {
        return o1t.zy(list);
    }

    private static int qrj(List<?> list, @NullableDecl Object obj) {
        int size = list.size();
        int i2 = 0;
        if (obj == null) {
            while (i2 < size) {
                if (list.get(i2) == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        while (i2 < size) {
            if (obj.equals(list.get(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @InterfaceC7732q
    /* JADX INFO: renamed from: s */
    static int m16062s(int i2) {
        C4524t.toq(i2, "arraySize");
        return C4746s.fu4(((long) i2) + 5 + ((long) (i2 / 10)));
    }

    /* JADX INFO: renamed from: t */
    public static <T> List<T> m16063t(List<T> list) {
        return list instanceof se ? ((se) list).reverse() : list instanceof C4560p ? ((C4560p) list).toq() : list instanceof RandomAccess ? new C4563s(list) : new C4560p(list);
    }

    @wlev.toq(serializable = true)
    public static <E> ArrayList<E> t8r(Iterator<? extends E> it) {
        ArrayList<E> arrayListCdj = cdj();
        zwy.m16125k(arrayListCdj, it);
        return arrayListCdj;
    }

    public static <E> List<E> toq(@NullableDecl E e2, @NullableDecl E e3, E[] eArr) {
        return new n7h(e2, e3, eArr);
    }

    public static <T> List<List<T>> wvg(List<T> list, int i2) {
        com.google.common.base.jk.a9(list);
        com.google.common.base.jk.m15383q(i2 > 0);
        return list instanceof RandomAccess ? new C4565y(list, i2) : new C4557g(list, i2);
    }

    static int x2(List<?> list, @NullableDecl Object obj) {
        if (list instanceof RandomAccess) {
            return qrj(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C4280z.m15455k(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: y */
    public static List<Character> m16064y(CharSequence charSequence) {
        return new C4561q((CharSequence) com.google.common.base.jk.a9(charSequence));
    }

    @wlev.toq(serializable = true)
    /* JADX INFO: renamed from: z */
    public static <E> LinkedList<E> m16065z() {
        return new LinkedList<>();
    }

    @wlev.toq(serializable = true)
    public static <E> ArrayList<E> zurt(int i2) {
        return new ArrayList<>(m16062s(i2));
    }

    public static <E> List<E> zy(@NullableDecl E e2, E[] eArr) {
        return new C4559n(e2, eArr);
    }
}
