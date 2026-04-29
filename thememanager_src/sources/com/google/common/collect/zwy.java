package com.google.common.collect;

import com.google.common.base.C4280z;
import com.google.common.primitives.C4746s;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Iterators.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class zwy {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterators.java */
    static class f7l8<T> extends com.google.common.collect.zy<T> {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ com.google.common.base.a9 f26785g;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Iterator f26786n;

        f7l8(Iterator it, com.google.common.base.a9 a9Var) {
            this.f26786n = it;
            this.f26785g = a9Var;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.zy
        /* JADX INFO: renamed from: k */
        protected T mo15703k() {
            while (this.f26786n.hasNext()) {
                T t2 = (T) this.f26786n.next();
                if (this.f26785g.apply(t2)) {
                    return t2;
                }
            }
            return toq();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.zwy$g */
    /* JADX INFO: compiled from: Iterators.java */
    static class C4589g<T> extends ab<List<T>> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Iterator f26787k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ boolean f26788n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f26789q;

        C4589g(Iterator it, int i2, boolean z2) {
            this.f26787k = it;
            this.f26789q = i2;
            this.f26788n = z2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26787k.hasNext();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public List<T> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = new Object[this.f26789q];
            int i2 = 0;
            while (i2 < this.f26789q && this.f26787k.hasNext()) {
                objArr[i2] = this.f26787k.next();
                i2++;
            }
            for (int i3 = i2; i3 < this.f26789q; i3++) {
                objArr[i3] = null;
            }
            List<T> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
            return (this.f26788n || i2 == this.f26789q) ? listUnmodifiableList : listUnmodifiableList.subList(0, i2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.zwy$h */
    /* JADX INFO: compiled from: Iterators.java */
    private static class C4590h<E> implements InterfaceC4555w<E> {

        /* JADX INFO: renamed from: k */
        private final Iterator<? extends E> f26790k;

        /* JADX INFO: renamed from: n */
        @NullableDecl
        private E f26791n;

        /* JADX INFO: renamed from: q */
        private boolean f26792q;

        public C4590h(Iterator<? extends E> it) {
            this.f26790k = (Iterator) com.google.common.base.jk.a9(it);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26792q || this.f26790k.hasNext();
        }

        @Override // com.google.common.collect.InterfaceC4555w, java.util.Iterator
        public E next() {
            if (!this.f26792q) {
                return this.f26790k.next();
            }
            E e2 = this.f26791n;
            this.f26792q = false;
            this.f26791n = null;
            return e2;
        }

        @Override // com.google.common.collect.InterfaceC4555w
        public E peek() {
            if (!this.f26792q) {
                this.f26791n = this.f26790k.next();
                this.f26792q = true;
            }
            return this.f26791n;
        }

        @Override // com.google.common.collect.InterfaceC4555w, java.util.Iterator
        public void remove() {
            com.google.common.base.jk.y9n(!this.f26792q, "Can't remove after you've peeked at next");
            this.f26790k.remove();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.zwy$k */
    /* JADX INFO: compiled from: Iterators.java */
    static class C4591k<T> extends ab<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Enumeration f26793k;

        C4591k(Enumeration enumeration) {
            this.f26793k = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26793k.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return (T) this.f26793k.nextElement();
        }
    }

    /* JADX INFO: compiled from: Iterators.java */
    private static class kja0<T> extends ab<T> {

        /* JADX INFO: renamed from: k */
        final Queue<InterfaceC4555w<T>> f26794k;

        /* JADX INFO: renamed from: com.google.common.collect.zwy$kja0$k */
        /* JADX INFO: compiled from: Iterators.java */
        class C4592k implements Comparator<InterfaceC4555w<T>> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Comparator f26795k;

            C4592k(Comparator comparator) {
                this.f26795k = comparator;
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public int compare(InterfaceC4555w<T> interfaceC4555w, InterfaceC4555w<T> interfaceC4555w2) {
                return this.f26795k.compare(interfaceC4555w.peek(), interfaceC4555w2.peek());
            }
        }

        public kja0(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
            this.f26794k = new PriorityQueue(2, new C4592k(comparator));
            for (Iterator<? extends T> it : iterable) {
                if (it.hasNext()) {
                    this.f26794k.add(zwy.hyr(it));
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f26794k.isEmpty();
        }

        @Override // java.util.Iterator
        public T next() {
            InterfaceC4555w<T> interfaceC4555wRemove = this.f26794k.remove();
            T next = interfaceC4555wRemove.next();
            if (interfaceC4555wRemove.hasNext()) {
                this.f26794k.add(interfaceC4555wRemove);
            }
            return next;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterators.java */
    static class ld6<T> extends ab<T> {

        /* JADX INFO: renamed from: k */
        boolean f26797k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Object f26798q;

        ld6(Object obj) {
            this.f26798q = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f26797k;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f26797k) {
                throw new NoSuchElementException();
            }
            this.f26797k = true;
            return (T) this.f26798q;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.zwy$n */
    /* JADX INFO: compiled from: Iterators.java */
    static class C4593n<T> extends ab<T> {

        /* JADX INFO: renamed from: k */
        int f26799k = 0;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Object[] f26800q;

        C4593n(Object[] objArr) {
            this.f26800q = objArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26799k < this.f26800q.length;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = this.f26800q;
            int i2 = this.f26799k;
            T t2 = (T) objArr[i2];
            objArr[i2] = null;
            this.f26799k = i2 + 1;
            return t2;
        }
    }

    /* JADX INFO: compiled from: Iterators.java */
    private enum n7h implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            C4524t.m15984n(false);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.zwy$p */
    /* JADX INFO: compiled from: Iterators.java */
    static class C4594p<T> extends ab<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Iterator f26802k;

        C4594p(Iterator it) {
            this.f26802k = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26802k.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            T t2 = (T) this.f26802k.next();
            this.f26802k.remove();
            return t2;
        }

        public String toString() {
            return "Iterators.consumingIterator(...)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.zwy$q */
    /* JADX INFO: compiled from: Iterators.java */
    static class C4595q<T> implements Iterator<T> {

        /* JADX INFO: renamed from: k */
        Iterator<T> f26803k = zwy.ni7();

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Iterable f26804q;

        C4595q(Iterable iterable) {
            this.f26804q = iterable;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26803k.hasNext() || this.f26804q.iterator().hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f26803k.hasNext()) {
                Iterator<T> it = this.f26804q.iterator();
                this.f26803k = it;
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
            }
            return this.f26803k.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f26803k.remove();
        }
    }

    /* JADX INFO: compiled from: Iterators.java */
    private static class qrj<T> implements Iterator<T> {

        /* JADX INFO: renamed from: g */
        @NullableDecl
        private Deque<Iterator<? extends Iterator<? extends T>>> f26805g;

        /* JADX INFO: renamed from: k */
        @NullableDecl
        private Iterator<? extends T> f26806k;

        /* JADX INFO: renamed from: n */
        private Iterator<? extends Iterator<? extends T>> f26807n;

        /* JADX INFO: renamed from: q */
        private Iterator<? extends T> f26808q = zwy.fn3e();

        qrj(Iterator<? extends Iterator<? extends T>> it) {
            this.f26807n = (Iterator) com.google.common.base.jk.a9(it);
        }

        @NullableDecl
        /* JADX INFO: renamed from: k */
        private Iterator<? extends Iterator<? extends T>> m16139k() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.f26807n;
                if (it != null && it.hasNext()) {
                    return this.f26807n;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.f26805g;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f26807n = this.f26805g.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) com.google.common.base.jk.a9(this.f26808q)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> itM16139k = m16139k();
                this.f26807n = itM16139k;
                if (itM16139k == null) {
                    return false;
                }
                Iterator<? extends T> next = itM16139k.next();
                this.f26808q = next;
                if (next instanceof qrj) {
                    qrj qrjVar = (qrj) next;
                    this.f26808q = qrjVar.f26808q;
                    if (this.f26805g == null) {
                        this.f26805g = new ArrayDeque();
                    }
                    this.f26805g.addFirst(this.f26807n);
                    if (qrjVar.f26805g != null) {
                        while (!qrjVar.f26805g.isEmpty()) {
                            this.f26805g.addFirst(qrjVar.f26805g.removeLast());
                        }
                    }
                    this.f26807n = qrjVar.f26807n;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends T> it = this.f26808q;
            this.f26806k = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            C4524t.m15984n(this.f26806k != null);
            this.f26806k.remove();
            this.f26806k = null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.zwy$s */
    /* JADX INFO: compiled from: Iterators.java */
    static class C4596s<T> implements Iterator<T> {

        /* JADX INFO: renamed from: k */
        private int f26809k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Iterator f26810n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f26811q;

        C4596s(int i2, Iterator it) {
            this.f26811q = i2;
            this.f26810n = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26809k < this.f26811q && this.f26810n.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f26809k++;
            return (T) this.f26810n.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f26810n.remove();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterators.java */
    static class toq<T> implements Enumeration<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Iterator f26812k;

        toq(Iterator it) {
            this.f26812k = it;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f26812k.hasNext();
        }

        @Override // java.util.Enumeration
        public T nextElement() {
            return (T) this.f26812k.next();
        }
    }

    /* JADX INFO: compiled from: Iterators.java */
    private static final class x2<T> extends com.google.common.collect.toq<T> {

        /* JADX INFO: renamed from: y */
        static final c25<Object> f26813y = new x2(new Object[0], 0, 0, 0);

        /* JADX INFO: renamed from: g */
        private final int f26814g;

        /* JADX INFO: renamed from: n */
        private final T[] f26815n;

        x2(T[] tArr, int i2, int i3, int i4) {
            super(i3, i4);
            this.f26815n = tArr;
            this.f26814g = i2;
        }

        @Override // com.google.common.collect.toq
        /* JADX INFO: renamed from: k */
        protected T mo15538k(int i2) {
            return this.f26815n[this.f26814g + i2];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, F] */
    /* JADX INFO: renamed from: com.google.common.collect.zwy$y */
    /* JADX INFO: compiled from: Iterators.java */
    static class C4597y<F, T> extends pnt2<F, T> {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ com.google.common.base.t8r f26816q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4597y(Iterator it, com.google.common.base.t8r t8rVar) {
            super(it);
            this.f26816q = t8rVar;
        }

        @Override // com.google.common.collect.pnt2
        /* JADX INFO: renamed from: k */
        T mo15580k(F f2) {
            return (T) this.f26816q.apply(f2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterators.java */
    static class zy<T> extends ab<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Iterator f26817k;

        zy(Iterator it) {
            this.f26817k = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26817k.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return (T) this.f26817k.next();
        }
    }

    private zwy() {
    }

    public static int a9(Iterator<?> it, @NullableDecl Object obj) {
        int i2 = 0;
        while (cdj(it, obj)) {
            i2++;
        }
        return i2;
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: c */
    public static boolean m16118c(Iterator<?> it, Collection<?> collection) {
        com.google.common.base.jk.a9(collection);
        boolean z2 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean cdj(Iterator<?> it, @NullableDecl Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    @NullableDecl
    public static <T> T d2ok(Iterator<? extends T> it, @NullableDecl T t2) {
        return it.hasNext() ? (T) eqxt(it) : t2;
    }

    @NullableDecl
    public static <T> T d3(Iterator<? extends T> it, @NullableDecl T t2) {
        return it.hasNext() ? (T) gvn7(it) : t2;
    }

    @InterfaceC7731k
    public static <T> ab<T> dd(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        com.google.common.base.jk.fti(iterable, "iterators");
        com.google.common.base.jk.fti(comparator, "comparator");
        return new kja0(iterable, comparator);
    }

    /* JADX INFO: renamed from: e */
    public static int m16119e(Iterator<?> it) {
        long j2 = 0;
        while (it.hasNext()) {
            it.next();
            j2++;
        }
        return C4746s.fu4(j2);
    }

    public static <T> ab<T> ek5k(Iterator<? extends T> it) {
        com.google.common.base.jk.a9(it);
        return it instanceof ab ? (ab) it : new zy(it);
    }

    public static <T> T eqxt(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i2 = 0; i2 < 4 && it.hasNext(); i2++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append(kotlin.text.eqxt.f36668g);
        throw new IllegalArgumentException(sb.toString());
    }

    @NullableDecl
    /* JADX INFO: renamed from: f */
    static <T> T m16120f(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    static void f7l8(int i2) {
        if (i2 >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("position (" + i2 + ") must not be negative");
    }

    static <T> ab<T> fn3e() {
        return zurt();
    }

    public static <T> T fti(Iterator<T> it, int i2) {
        f7l8(i2);
        int qVar = toq(it, i2);
        if (it.hasNext()) {
            return it.next();
        }
        throw new IndexOutOfBoundsException("position (" + i2 + ") must be less than the number of elements that remained (" + qVar + ")");
    }

    public static <T> ab<T> fu4(Iterator<T> it, com.google.common.base.a9<? super T> a9Var) {
        com.google.common.base.jk.a9(it);
        com.google.common.base.jk.a9(a9Var);
        return new f7l8(it, a9Var);
    }

    /* JADX INFO: renamed from: g */
    static <T> ListIterator<T> m16121g(Iterator<T> it) {
        return (ListIterator) it;
    }

    public static <T> T gvn7(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* JADX INFO: renamed from: h */
    public static <T> Iterator<T> m16122h(Iterator<T> it) {
        com.google.common.base.jk.a9(it);
        return new C4594p(it);
    }

    public static String hb(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z2 = true;
        while (it.hasNext()) {
            if (!z2) {
                sb.append(", ");
            }
            z2 = false;
            sb.append(it.next());
        }
        sb.append(']');
        return sb.toString();
    }

    public static <T> InterfaceC4555w<T> hyr(Iterator<? extends T> it) {
        return it instanceof C4590h ? (C4590h) it : new C4590h(it);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m16123i(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !C4280z.m15455k(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* JADX INFO: renamed from: j */
    public static <F, T> Iterator<T> m16124j(Iterator<F> it, com.google.common.base.t8r<? super F, ? extends T> t8rVar) {
        com.google.common.base.jk.a9(t8rVar);
        return new C4597y(it, t8rVar);
    }

    public static <T> ab<T> jk(Enumeration<T> enumeration) {
        com.google.common.base.jk.a9(enumeration);
        return new C4591k(enumeration);
    }

    @NullableDecl
    public static <T> T jp0y(Iterator<? extends T> it, int i2, @NullableDecl T t2) {
        f7l8(i2);
        toq(it, i2);
        return (T) oc(it, t2);
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: k */
    public static <T> boolean m16125k(Collection<T> collection, Iterator<? extends T> it) {
        com.google.common.base.jk.a9(collection);
        com.google.common.base.jk.a9(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static <T> Iterator<T> ki(Iterable<T> iterable) {
        com.google.common.base.jk.a9(iterable);
        return new C4595q(iterable);
    }

    private static <T> Iterator<T> kja0(T... tArr) {
        return new C4593n(tArr);
    }

    /* JADX INFO: renamed from: l */
    private static <T> ab<List<T>> m16126l(Iterator<T> it, int i2, boolean z2) {
        com.google.common.base.jk.a9(it);
        com.google.common.base.jk.m15383q(i2 > 0);
        return new C4589g(it, i2, z2);
    }

    public static <T> Iterator<T> ld6(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3) {
        com.google.common.base.jk.a9(it);
        com.google.common.base.jk.a9(it2);
        com.google.common.base.jk.a9(it3);
        return m16133s(kja0(it, it2, it3));
    }

    @CanIgnoreReturnValue
    public static <T> boolean lrht(Iterator<T> it, com.google.common.base.a9<? super T> a9Var) {
        com.google.common.base.jk.a9(a9Var);
        boolean z2 = false;
        while (it.hasNext()) {
            if (a9Var.apply(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static <T> int lvui(Iterator<T> it, com.google.common.base.a9<? super T> a9Var) {
        com.google.common.base.jk.fti(a9Var, "predicate");
        int i2 = 0;
        while (it.hasNext()) {
            if (a9Var.apply(it.next())) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public static <T> ab<T> m16127m(ab<T> abVar) {
        return (ab) com.google.common.base.jk.a9(abVar);
    }

    static <T> c25<T> mcp(T[] tArr, int i2, int i3, int i4) {
        com.google.common.base.jk.m15383q(i3 >= 0);
        com.google.common.base.jk.ek5k(i2, i2 + i3, tArr.length);
        com.google.common.base.jk.m15381o(i4, i3);
        return i3 == 0 ? zurt() : new x2(tArr, i2, i3, i4);
    }

    /* JADX INFO: renamed from: n */
    public static <T> Enumeration<T> m16128n(Iterator<T> it) {
        com.google.common.base.jk.a9(it);
        return new toq(it);
    }

    @Deprecated
    public static <T> InterfaceC4555w<T> n5r1(InterfaceC4555w<T> interfaceC4555w) {
        return (InterfaceC4555w) com.google.common.base.jk.a9(interfaceC4555w);
    }

    static <T> Iterator<T> n7h(Iterator<? extends T>... itArr) {
        for (Iterator it : (Iterator[]) com.google.common.base.jk.a9(itArr)) {
            com.google.common.base.jk.a9(it);
        }
        return m16133s(kja0(itArr));
    }

    public static <T> ab<List<T>> ncyb(Iterator<T> it, int i2) {
        return m16126l(it, i2, false);
    }

    static <T> Iterator<T> ni7() {
        return n7h.INSTANCE;
    }

    @wlev.zy
    public static <T> T[] nn86(Iterator<? extends T> it, Class<T> cls) {
        return (T[]) nsb.ncyb(wlev.t8r(it), cls);
    }

    /* JADX INFO: renamed from: o */
    public static <T> com.google.common.base.o1t<T> m16129o(Iterator<T> it, com.google.common.base.a9<? super T> a9Var) {
        com.google.common.base.jk.a9(it);
        com.google.common.base.jk.a9(a9Var);
        while (it.hasNext()) {
            T next = it.next();
            if (a9Var.apply(next)) {
                return com.google.common.base.o1t.of(next);
            }
        }
        return com.google.common.base.o1t.absent();
    }

    public static <T> T o1t(Iterator<T> it, com.google.common.base.a9<? super T> a9Var) {
        com.google.common.base.jk.a9(it);
        com.google.common.base.jk.a9(a9Var);
        while (it.hasNext()) {
            T next = it.next();
            if (a9Var.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @NullableDecl
    public static <T> T oc(Iterator<? extends T> it, @NullableDecl T t2) {
        return it.hasNext() ? it.next() : t2;
    }

    /* JADX INFO: renamed from: p */
    public static <T> Iterator<T> m16130p(Iterator<? extends T> it, Iterator<? extends T> it2) {
        com.google.common.base.jk.a9(it);
        com.google.common.base.jk.a9(it2);
        return m16133s(kja0(it, it2));
    }

    /* JADX INFO: renamed from: q */
    public static <T> boolean m16131q(Iterator<T> it, com.google.common.base.a9<? super T> a9Var) {
        return lvui(it, a9Var) != -1;
    }

    public static <T> Iterator<T> qrj(Iterator<? extends T>... itArr) {
        return n7h((Iterator[]) Arrays.copyOf(itArr, itArr.length));
    }

    /* JADX INFO: renamed from: r */
    public static <T> Iterator<T> m16132r(Iterator<T> it, int i2) {
        com.google.common.base.jk.a9(it);
        com.google.common.base.jk.m15380n(i2 >= 0, "limit is negative");
        return new C4596s(i2, it);
    }

    /* JADX INFO: renamed from: s */
    public static <T> Iterator<T> m16133s(Iterator<? extends Iterator<? extends T>> it) {
        return new qrj(it);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: t */
    public static <T> ab<T> m16134t(T... tArr) {
        return mcp(tArr, 0, tArr.length, 0);
    }

    @SafeVarargs
    public static <T> Iterator<T> t8r(T... tArr) {
        return ki(wlev.m16057i(tArr));
    }

    @CanIgnoreReturnValue
    public static int toq(Iterator<?> it, int i2) {
        com.google.common.base.jk.a9(it);
        int i3 = 0;
        com.google.common.base.jk.m15380n(i2 >= 0, "numberToAdvance must be nonnegative");
        while (i3 < i2 && it.hasNext()) {
            it.next();
            i3++;
        }
        return i3;
    }

    @CanIgnoreReturnValue
    public static boolean uv6(Iterator<?> it, Collection<?> collection) {
        com.google.common.base.jk.a9(collection);
        boolean z2 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static <T> ab<T> vyq(@NullableDecl T t2) {
        return new ld6(t2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @NullableDecl
    public static <T> T wvg(Iterator<? extends T> it, com.google.common.base.a9<? super T> a9Var, @NullableDecl T t2) {
        com.google.common.base.jk.a9(it);
        com.google.common.base.jk.a9(a9Var);
        while (it.hasNext()) {
            T next = it.next();
            if (a9Var.apply(next)) {
                return next;
            }
        }
        return t2;
    }

    public static <T> Iterator<T> x2(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4) {
        com.google.common.base.jk.a9(it);
        com.google.common.base.jk.a9(it2);
        com.google.common.base.jk.a9(it3);
        com.google.common.base.jk.a9(it4);
        return m16133s(kja0(it, it2, it3, it4));
    }

    public static <T> ab<List<T>> x9kr(Iterator<T> it, int i2) {
        return m16126l(it, i2, true);
    }

    /* JADX INFO: renamed from: y */
    static void m16135y(Iterator<?> it) {
        com.google.common.base.jk.a9(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @wlev.zy
    /* JADX INFO: renamed from: z */
    public static <T> ab<T> m16136z(Iterator<?> it, Class<T> cls) {
        return fu4(it, com.google.common.base.fti.kja0(cls));
    }

    static <T> c25<T> zurt() {
        return (c25<T>) x2.f26813y;
    }

    public static <T> boolean zy(Iterator<T> it, com.google.common.base.a9<? super T> a9Var) {
        com.google.common.base.jk.a9(a9Var);
        while (it.hasNext()) {
            if (!a9Var.apply(it.next())) {
                return false;
            }
        }
        return true;
    }
}
