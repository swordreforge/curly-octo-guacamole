package com.google.common.collect;

import com.google.common.math.C4723q;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: MinMaxPriorityQueue.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
@InterfaceC7731k
public final class a5id<E> extends AbstractQueue<E> {

    /* JADX INFO: renamed from: h */
    private static final int f25929h = -1431655766;

    /* JADX INFO: renamed from: i */
    private static final int f25930i = 11;

    /* JADX INFO: renamed from: p */
    private static final int f25931p = 1431655765;

    /* JADX INFO: renamed from: g */
    private Object[] f25932g;

    /* JADX INFO: renamed from: k */
    private final a5id<E>.zy f25933k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7732q
    final int f25934n;

    /* JADX INFO: renamed from: q */
    private final a5id<E>.zy f25935q;

    /* JADX INFO: renamed from: s */
    private int f25936s;

    /* JADX INFO: renamed from: y */
    private int f25937y;

    /* JADX INFO: renamed from: com.google.common.collect.a5id$n */
    /* JADX INFO: compiled from: MinMaxPriorityQueue.java */
    private class C4310n implements Iterator<E> {

        /* JADX INFO: renamed from: g */
        @MonotonicNonNullDecl
        private Queue<E> f25938g;

        /* JADX INFO: renamed from: k */
        private int f25940k;

        /* JADX INFO: renamed from: n */
        private int f25941n;

        /* JADX INFO: renamed from: p */
        private boolean f25942p;

        /* JADX INFO: renamed from: q */
        private int f25943q;

        /* JADX INFO: renamed from: s */
        @NullableDecl
        private E f25944s;

        /* JADX INFO: renamed from: y */
        @MonotonicNonNullDecl
        private List<E> f25945y;

        private C4310n() {
            this.f25940k = -1;
            this.f25943q = -1;
            this.f25941n = a5id.this.f25936s;
        }

        /* JADX INFO: renamed from: k */
        private void m15547k() {
            if (a5id.this.f25936s != this.f25941n) {
                throw new ConcurrentModificationException();
            }
        }

        /* JADX INFO: renamed from: q */
        private boolean m15548q(Object obj) {
            for (int i2 = 0; i2 < a5id.this.f25937y; i2++) {
                if (a5id.this.f25932g[i2] == obj) {
                    a5id.this.zurt(i2);
                    return true;
                }
            }
            return false;
        }

        private boolean toq(Iterable<E> iterable, E e2) {
            Iterator<E> it = iterable.iterator();
            while (it.hasNext()) {
                if (it.next() == e2) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void zy(int i2) {
            if (this.f25943q < i2) {
                if (this.f25945y != null) {
                    while (i2 < a5id.this.size() && toq(this.f25945y, a5id.this.m15546p(i2))) {
                        i2++;
                    }
                }
                this.f25943q = i2;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m15547k();
            zy(this.f25940k + 1);
            if (this.f25943q < a5id.this.size()) {
                return true;
            }
            Queue<E> queue = this.f25938g;
            return (queue == null || queue.isEmpty()) ? false : true;
        }

        @Override // java.util.Iterator
        public E next() {
            m15547k();
            zy(this.f25940k + 1);
            if (this.f25943q < a5id.this.size()) {
                int i2 = this.f25943q;
                this.f25940k = i2;
                this.f25942p = true;
                return (E) a5id.this.m15546p(i2);
            }
            if (this.f25938g != null) {
                this.f25940k = a5id.this.size();
                E ePoll = this.f25938g.poll();
                this.f25944s = ePoll;
                if (ePoll != null) {
                    this.f25942p = true;
                    return ePoll;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }

        @Override // java.util.Iterator
        public void remove() {
            C4524t.m15984n(this.f25942p);
            m15547k();
            this.f25942p = false;
            this.f25941n++;
            if (this.f25940k >= a5id.this.size()) {
                com.google.common.base.jk.yz(m15548q(this.f25944s));
                this.f25944s = null;
                return;
            }
            C4311q<E> c4311qZurt = a5id.this.zurt(this.f25940k);
            if (c4311qZurt != null) {
                if (this.f25938g == null) {
                    this.f25938g = new ArrayDeque();
                    this.f25945y = new ArrayList(3);
                }
                if (!toq(this.f25945y, c4311qZurt.f25946k)) {
                    this.f25938g.add(c4311qZurt.f25946k);
                }
                if (!toq(this.f25938g, c4311qZurt.f68179toq)) {
                    this.f25945y.add(c4311qZurt.f68179toq);
                }
            }
            this.f25940k--;
            this.f25943q--;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.a5id$q */
    /* JADX INFO: compiled from: MinMaxPriorityQueue.java */
    static class C4311q<E> {

        /* JADX INFO: renamed from: k */
        final E f25946k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final E f68179toq;

        C4311q(E e2, E e3) {
            this.f25946k = e2;
            this.f68179toq = e3;
        }
    }

    /* JADX INFO: compiled from: MinMaxPriorityQueue.java */
    @InterfaceC7731k
    public static final class toq<B> {

        /* JADX INFO: renamed from: q */
        private static final int f25947q = -1;

        /* JADX INFO: renamed from: k */
        private final Comparator<B> f25948k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f68180toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f68181zy;

        /* JADX INFO: Access modifiers changed from: private */
        public <T extends B> kx3<T> f7l8() {
            return kx3.from(this.f25948k);
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: g */
        public toq<B> m15550g(int i2) {
            com.google.common.base.jk.m15383q(i2 > 0);
            this.f68181zy = i2;
            return this;
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: n */
        public toq<B> m15551n(int i2) {
            com.google.common.base.jk.m15383q(i2 >= 0);
            this.f68180toq = i2;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public <T extends B> a5id<T> m15552q(Iterable<? extends T> iterable) {
            a5id<T> a5idVar = new a5id<>(this, a5id.m15540h(this.f68180toq, this.f68181zy, iterable));
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                a5idVar.offer(it.next());
            }
            return a5idVar;
        }

        public <T extends B> a5id<T> zy() {
            return m15552q(Collections.emptySet());
        }

        private toq(Comparator<B> comparator) {
            this.f68180toq = -1;
            this.f68181zy = Integer.MAX_VALUE;
            this.f25948k = (Comparator) com.google.common.base.jk.a9(comparator);
        }
    }

    /* JADX INFO: compiled from: MinMaxPriorityQueue.java */
    private class zy {

        /* JADX INFO: renamed from: k */
        final kx3<E> f25949k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @Weak
        @MonotonicNonNullDecl
        a5id<E>.zy f68182toq;

        zy(kx3<E> kx3Var) {
            this.f25949k = kx3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean cdj(int i2) {
            if (x2(i2) < a5id.this.f25937y && m15558q(i2, x2(i2)) > 0) {
                return false;
            }
            if (n7h(i2) < a5id.this.f25937y && m15558q(i2, n7h(i2)) > 0) {
                return false;
            }
            if (i2 <= 0 || m15558q(i2, qrj(i2)) <= 0) {
                return i2 <= 2 || m15558q(ld6(i2), i2) <= 0;
            }
            return false;
        }

        private int ld6(int i2) {
            return qrj(qrj(i2));
        }

        private int n7h(int i2) {
            return (i2 * 2) + 2;
        }

        private int qrj(int i2) {
            return (i2 - 1) / 2;
        }

        private int x2(int i2) {
            return (i2 * 2) + 1;
        }

        int f7l8(int i2) {
            while (true) {
                int iM15557p = m15557p(i2);
                if (iM15557p <= 0) {
                    return i2;
                }
                a5id.this.f25932g[i2] = a5id.this.m15546p(iM15557p);
                i2 = iM15557p;
            }
        }

        /* JADX INFO: renamed from: g */
        int m15554g(int i2, E e2) {
            int iN7h;
            if (i2 == 0) {
                a5id.this.f25932g[0] = e2;
                return 0;
            }
            int iQrj = qrj(i2);
            Object objM15546p = a5id.this.m15546p(iQrj);
            if (iQrj != 0 && (iN7h = n7h(qrj(iQrj))) != iQrj && x2(iN7h) >= a5id.this.f25937y) {
                Object objM15546p2 = a5id.this.m15546p(iN7h);
                if (this.f25949k.compare((E) objM15546p2, (E) objM15546p) < 0) {
                    iQrj = iN7h;
                    objM15546p = objM15546p2;
                }
            }
            if (this.f25949k.compare((E) objM15546p, e2) >= 0) {
                a5id.this.f25932g[i2] = e2;
                return i2;
            }
            a5id.this.f25932g[i2] = objM15546p;
            a5id.this.f25932g[iQrj] = e2;
            return iQrj;
        }

        /* JADX INFO: renamed from: h */
        C4311q<E> m15555h(int i2, int i3, E e2) {
            int iM15556n = m15556n(i3, e2);
            if (iM15556n == i3) {
                return null;
            }
            Object objM15546p = iM15556n < i2 ? a5id.this.m15546p(i2) : a5id.this.m15546p(qrj(i2));
            if (this.f68182toq.zy(iM15556n, e2) < i2) {
                return new C4311q<>(e2, objM15546p);
            }
            return null;
        }

        int kja0(E e2) {
            int iN7h;
            int iQrj = qrj(a5id.this.f25937y);
            if (iQrj != 0 && (iN7h = n7h(qrj(iQrj))) != iQrj && x2(iN7h) >= a5id.this.f25937y) {
                Object objM15546p = a5id.this.m15546p(iN7h);
                if (this.f25949k.compare((E) objM15546p, e2) < 0) {
                    a5id.this.f25932g[iN7h] = e2;
                    a5id.this.f25932g[a5id.this.f25937y] = objM15546p;
                    return iN7h;
                }
            }
            return a5id.this.f25937y;
        }

        /* JADX INFO: renamed from: n */
        int m15556n(int i2, E e2) {
            int iM15559s = m15559s(i2);
            if (iM15559s <= 0 || this.f25949k.compare((E) a5id.this.m15546p(iM15559s), e2) >= 0) {
                return m15554g(i2, e2);
            }
            a5id.this.f25932g[i2] = a5id.this.m15546p(iM15559s);
            a5id.this.f25932g[iM15559s] = e2;
            return iM15559s;
        }

        /* JADX INFO: renamed from: p */
        int m15557p(int i2) {
            int iX2 = x2(i2);
            if (iX2 < 0) {
                return -1;
            }
            return m15560y(x2(iX2), 4);
        }

        /* JADX INFO: renamed from: q */
        int m15558q(int i2, int i3) {
            return this.f25949k.compare((E) a5id.this.m15546p(i2), (E) a5id.this.m15546p(i3));
        }

        /* JADX INFO: renamed from: s */
        int m15559s(int i2) {
            return m15560y(x2(i2), 2);
        }

        void toq(int i2, E e2) {
            zy zyVar;
            int iM15554g = m15554g(i2, e2);
            if (iM15554g == i2) {
                iM15554g = i2;
                zyVar = this;
            } else {
                zyVar = this.f68182toq;
            }
            zyVar.zy(iM15554g, e2);
        }

        /* JADX INFO: renamed from: y */
        int m15560y(int i2, int i3) {
            if (i2 >= a5id.this.f25937y) {
                return -1;
            }
            com.google.common.base.jk.yz(i2 > 0);
            int iMin = Math.min(i2, a5id.this.f25937y - i3) + i3;
            for (int i4 = i2 + 1; i4 < iMin; i4++) {
                if (m15558q(i4, i2) < 0) {
                    i2 = i4;
                }
            }
            return i2;
        }

        @CanIgnoreReturnValue
        int zy(int i2, E e2) {
            while (i2 > 2) {
                int iLd6 = ld6(i2);
                Object objM15546p = a5id.this.m15546p(iLd6);
                if (this.f25949k.compare((E) objM15546p, e2) <= 0) {
                    break;
                }
                a5id.this.f25932g[i2] = objM15546p;
                i2 = iLd6;
            }
            a5id.this.f25932g[i2] = e2;
            return i2;
        }
    }

    @InterfaceC7732q
    static boolean cdj(int i2) {
        int i3 = ~(~(i2 + 1));
        com.google.common.base.jk.y9n(i3 > 0, "negative index");
        return (f25931p & i3) > (i3 & f25929h);
    }

    private E fn3e(int i2) {
        E eM15546p = m15546p(i2);
        zurt(i2);
        return eM15546p;
    }

    /* JADX INFO: renamed from: g */
    private static int m15539g(int i2, int i3) {
        return Math.min(i2 - 1, i3) + 1;
    }

    @InterfaceC7732q
    /* JADX INFO: renamed from: h */
    static int m15540h(int i2, int i3, Iterable<?> iterable) {
        if (i2 == -1) {
            i2 = 11;
        }
        if (iterable instanceof Collection) {
            i2 = Math.max(i2, ((Collection) iterable).size());
        }
        return m15539g(i2, i3);
    }

    /* JADX INFO: renamed from: i */
    public static <B> toq<B> m15541i(Comparator<B> comparator) {
        return new toq<>(comparator);
    }

    private a5id<E>.zy kja0(int i2) {
        return cdj(i2) ? this.f25933k : this.f25935q;
    }

    public static toq<Comparable> ld6(int i2) {
        return new toq(kx3.natural()).m15551n(i2);
    }

    /* JADX INFO: renamed from: n */
    private int m15543n() {
        int length = this.f25932g.length;
        return m15539g(length < 64 ? (length + 1) * 2 : C4723q.m16547q(length / 2, 3), this.f25934n);
    }

    private void n7h() {
        if (this.f25937y > this.f25932g.length) {
            Object[] objArr = new Object[m15543n()];
            Object[] objArr2 = this.f25932g;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f25932g = objArr;
        }
    }

    private int qrj() {
        int i2 = this.f25937y;
        if (i2 != 1) {
            return (i2 == 2 || this.f25935q.m15558q(1, 2) <= 0) ? 1 : 2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: s */
    public static <E extends Comparable<E>> a5id<E> m15544s(Iterable<? extends E> iterable) {
        return new toq(kx3.natural()).m15552q(iterable);
    }

    public static toq<Comparable> t8r(int i2) {
        return new toq(kx3.natural()).m15550g(i2);
    }

    private C4311q<E> x2(int i2, E e2) {
        a5id<E>.zy zyVarKja0 = kja0(i2);
        int iF7l8 = zyVarKja0.f7l8(i2);
        int iZy = zyVarKja0.zy(iF7l8, e2);
        if (iZy == iF7l8) {
            return zyVarKja0.m15555h(i2, iF7l8, e2);
        }
        if (iZy < i2) {
            return new C4311q<>(e2, m15546p(i2));
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static <E extends Comparable<E>> a5id<E> m15545y() {
        return new toq(kx3.natural()).zy();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @CanIgnoreReturnValue
    public boolean add(E e2) {
        offer(e2);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            offer(it.next());
            z2 = true;
        }
        return z2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        for (int i2 = 0; i2 < this.f25937y; i2++) {
            this.f25932g[i2] = null;
        }
        this.f25937y = 0;
    }

    public Comparator<? super E> comparator() {
        return this.f25933k.f25949k;
    }

    @InterfaceC7732q
    int f7l8() {
        return this.f25932g.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new C4310n();
    }

    @InterfaceC7732q
    boolean ki() {
        for (int i2 = 1; i2 < this.f25937y; i2++) {
            if (!kja0(i2).cdj(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public boolean offer(E e2) {
        com.google.common.base.jk.a9(e2);
        this.f25936s++;
        int i2 = this.f25937y;
        this.f25937y = i2 + 1;
        n7h();
        kja0(i2).toq(i2, e2);
        return this.f25937y <= this.f25934n || pollLast() != e2;
    }

    /* JADX INFO: renamed from: p */
    E m15546p(int i2) {
        return (E) this.f25932g[i2];
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return m15546p(0);
    }

    public E peekFirst() {
        return peek();
    }

    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return m15546p(qrj());
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return fn3e(0);
    }

    @CanIgnoreReturnValue
    public E pollFirst() {
        return poll();
    }

    @CanIgnoreReturnValue
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return fn3e(qrj());
    }

    @CanIgnoreReturnValue
    public E removeFirst() {
        return remove();
    }

    @CanIgnoreReturnValue
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return fn3e(qrj());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f25937y;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        int i2 = this.f25937y;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f25932g, 0, objArr, 0, i2);
        return objArr;
    }

    @CanIgnoreReturnValue
    @InterfaceC7732q
    C4311q<E> zurt(int i2) {
        com.google.common.base.jk.m15381o(i2, this.f25937y);
        this.f25936s++;
        int i3 = this.f25937y - 1;
        this.f25937y = i3;
        if (i3 == i2) {
            this.f25932g[i3] = null;
            return null;
        }
        E eM15546p = m15546p(i3);
        int iKja0 = kja0(this.f25937y).kja0(eM15546p);
        if (iKja0 == i2) {
            this.f25932g[this.f25937y] = null;
            return null;
        }
        E eM15546p2 = m15546p(this.f25937y);
        this.f25932g[this.f25937y] = null;
        C4311q<E> c4311qX2 = x2(i2, eM15546p2);
        return iKja0 < i2 ? c4311qX2 == null ? new C4311q<>(eM15546p, eM15546p2) : new C4311q<>(eM15546p, c4311qX2.f68179toq) : c4311qX2;
    }

    private a5id(toq<? super E> toqVar, int i2) {
        kx3 kx3VarF7l8 = toqVar.f7l8();
        a5id<E>.zy zyVar = new zy(kx3VarF7l8);
        this.f25933k = zyVar;
        a5id<E>.zy zyVar2 = new zy(kx3VarF7l8.reverse());
        this.f25935q = zyVar2;
        zyVar.f68182toq = zyVar2;
        zyVar2.f68182toq = zyVar;
        this.f25934n = ((toq) toqVar).f68181zy;
        this.f25932g = new Object[i2];
    }
}
