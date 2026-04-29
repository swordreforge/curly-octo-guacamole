package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Iterables.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class nsb {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.java */
    static class f7l8<T> extends AbstractC4308a<T> {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ int f26475n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Iterable f26476q;

        /* JADX INFO: renamed from: com.google.common.collect.nsb$f7l8$k */
        /* JADX INFO: compiled from: Iterables.java */
        class C4473k implements Iterator<T> {

            /* JADX INFO: renamed from: k */
            boolean f26477k = true;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ Iterator f26479q;

            C4473k(Iterator it) {
                this.f26479q = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f26479q.hasNext();
            }

            @Override // java.util.Iterator
            public T next() {
                T t2 = (T) this.f26479q.next();
                this.f26477k = false;
                return t2;
            }

            @Override // java.util.Iterator
            public void remove() {
                C4524t.m15984n(!this.f26477k);
                this.f26479q.remove();
            }
        }

        f7l8(Iterable iterable, int i2) {
            this.f26476q = iterable;
            this.f26475n = i2;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f26476q;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), this.f26475n), list.size()).iterator();
            }
            Iterator<T> it = iterable.iterator();
            zwy.toq(it, this.f26475n);
            return new C4473k(it);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.nsb$g */
    /* JADX INFO: compiled from: Iterables.java */
    static class C4474g<T> extends AbstractC4308a<T> {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ com.google.common.base.t8r f26480n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Iterable f26481q;

        C4474g(Iterable iterable, com.google.common.base.t8r t8rVar) {
            this.f26481q = iterable;
            this.f26480n = t8rVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return zwy.m16124j(this.f26481q.iterator(), this.f26480n);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.nsb$k */
    /* JADX INFO: compiled from: Iterables.java */
    static class C4475k<T> implements com.google.common.base.t8r<Iterable<? extends T>, Iterator<? extends T>> {
        C4475k() {
        }

        @Override // com.google.common.base.t8r
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Iterator<? extends T> apply(Iterable<? extends T> iterable) {
            return iterable.iterator();
        }
    }

    /* JADX INFO: compiled from: Iterables.java */
    private static final class ld6<T> extends AbstractC4308a<T> {

        /* JADX INFO: renamed from: q */
        private final Iterable<? extends T> f26482q;

        /* synthetic */ ld6(Iterable iterable, toq toqVar) {
            this(iterable);
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return zwy.ek5k(this.f26482q.iterator());
        }

        @Override // com.google.common.collect.AbstractC4308a
        public String toString() {
            return this.f26482q.toString();
        }

        private ld6(Iterable<? extends T> iterable) {
            this.f26482q = iterable;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.nsb$n */
    /* JADX INFO: compiled from: Iterables.java */
    static class C4476n<T> extends AbstractC4308a<T> {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ com.google.common.base.a9 f26483n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Iterable f26484q;

        C4476n(Iterable iterable, com.google.common.base.a9 a9Var) {
            this.f26484q = iterable;
            this.f26483n = a9Var;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return zwy.fu4(this.f26484q.iterator(), this.f26483n);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.nsb$p */
    /* JADX INFO: compiled from: Iterables.java */
    static class C4477p<T> extends AbstractC4308a<T> {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Comparator f26485n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Iterable f26486q;

        C4477p(Iterable iterable, Comparator comparator) {
            this.f26486q = iterable;
            this.f26485n = comparator;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return zwy.dd(nsb.m15901f(this.f26486q, nsb.n5r1()), this.f26485n);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.nsb$q */
    /* JADX INFO: compiled from: Iterables.java */
    static class C4478q<T> extends AbstractC4308a<List<T>> {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ int f26487n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Iterable f26488q;

        C4478q(Iterable iterable, int i2) {
            this.f26488q = iterable;
            this.f26487n = i2;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return zwy.x9kr(this.f26488q.iterator(), this.f26487n);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.nsb$s */
    /* JADX INFO: compiled from: Iterables.java */
    static class C4479s<T> extends AbstractC4308a<T> {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Iterable f26489q;

        C4479s(Iterable iterable) {
            this.f26489q = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f26489q;
            return iterable instanceof Queue ? new C4518r((Queue) iterable) : zwy.m16122h(iterable.iterator());
        }

        @Override // com.google.common.collect.AbstractC4308a
        public String toString() {
            return "Iterables.consumingIterable(...)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.java */
    static class toq<T> extends AbstractC4308a<T> {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Iterable f26490q;

        toq(Iterable iterable) {
            this.f26490q = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return zwy.ki(this.f26490q);
        }

        @Override // com.google.common.collect.AbstractC4308a
        public String toString() {
            return this.f26490q.toString() + " (cycled)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.nsb$y */
    /* JADX INFO: compiled from: Iterables.java */
    static class C4480y<T> extends AbstractC4308a<T> {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ int f26491n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Iterable f26492q;

        C4480y(Iterable iterable, int i2) {
            this.f26492q = iterable;
            this.f26491n = i2;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return zwy.m16132r(this.f26492q.iterator(), this.f26491n);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.java */
    static class zy<T> extends AbstractC4308a<List<T>> {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ int f26493n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Iterable f26494q;

        zy(Iterable iterable, int i2) {
            this.f26494q = iterable;
            this.f26493n = i2;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return zwy.ncyb(this.f26494q.iterator(), this.f26493n);
        }
    }

    private nsb() {
    }

    @InterfaceC7731k
    public static <T> Iterable<T> a9(Iterable<? extends Iterable<? extends T>> iterable, Comparator<? super T> comparator) {
        com.google.common.base.jk.fti(iterable, "iterables");
        com.google.common.base.jk.fti(comparator, "comparator");
        return new ld6(new C4477p(iterable, comparator), null);
    }

    /* JADX INFO: renamed from: c */
    public static <T> com.google.common.base.o1t<T> m15900c(Iterable<T> iterable, com.google.common.base.a9<? super T> a9Var) {
        return zwy.m16129o(iterable.iterator(), a9Var);
    }

    public static <T> T cdj(Iterable<T> iterable, com.google.common.base.a9<? super T> a9Var) {
        return (T) zwy.o1t(iterable.iterator(), a9Var);
    }

    @CanIgnoreReturnValue
    public static boolean d2ok(Iterable<?> iterable, Collection<?> collection) {
        return iterable instanceof Collection ? ((Collection) iterable).retainAll((Collection) com.google.common.base.jk.a9(collection)) : zwy.uv6(iterable.iterator(), collection);
    }

    @NullableDecl
    static <T> T d3(Iterable<T> iterable, com.google.common.base.a9<? super T> a9Var) {
        com.google.common.base.jk.a9(a9Var);
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (a9Var.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    private static <T> void dd(List<T> list, com.google.common.base.a9<? super T> a9Var, int i2, int i3) {
        for (int size = list.size() - 1; size > i3; size--) {
            if (a9Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            list.remove(i4);
        }
    }

    private static <T> boolean eqxt(List<T> list, com.google.common.base.a9<? super T> a9Var) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            T t2 = list.get(i2);
            if (!a9Var.apply(t2)) {
                if (i2 > i3) {
                    try {
                        list.set(i3, t2);
                    } catch (IllegalArgumentException unused) {
                        dd(list, a9Var, i3, i2);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        dd(list, a9Var, i3, i2);
                        return true;
                    }
                }
                i3++;
            }
            i2++;
        }
        list.subList(i3, list.size()).clear();
        return i2 != i3;
    }

    /* JADX INFO: renamed from: f */
    public static <F, T> Iterable<T> m15901f(Iterable<F> iterable, com.google.common.base.t8r<? super F, ? extends T> t8rVar) {
        com.google.common.base.jk.a9(iterable);
        com.google.common.base.jk.a9(t8rVar);
        return new C4474g(iterable, t8rVar);
    }

    public static <T> Iterable<T> f7l8(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return AbstractC4308a.m15531y(iterable, iterable2, iterable3);
    }

    @NullableDecl
    public static <T> T fn3e(Iterable<? extends T> iterable, int i2, @NullableDecl T t2) {
        com.google.common.base.jk.a9(iterable);
        zwy.f7l8(i2);
        if (iterable instanceof List) {
            List listM16055g = wlev.m16055g(iterable);
            return i2 < listM16055g.size() ? (T) listM16055g.get(i2) : t2;
        }
        Iterator<? extends T> it = iterable.iterator();
        zwy.toq(it, i2);
        return (T) zwy.oc(it, t2);
    }

    public static <T> Iterable<List<T>> fti(Iterable<T> iterable, int i2) {
        com.google.common.base.jk.a9(iterable);
        com.google.common.base.jk.m15383q(i2 > 0);
        return new C4478q(iterable, i2);
    }

    @NullableDecl
    public static <T> T fu4(Iterable<? extends T> iterable, @NullableDecl T t2) {
        if (iterable instanceof Collection) {
            if (mcp.toq(iterable).isEmpty()) {
                return t2;
            }
            if (iterable instanceof List) {
                return (T) m15914z(wlev.m16055g(iterable));
            }
        }
        return (T) zwy.d3(iterable.iterator(), t2);
    }

    /* JADX INFO: renamed from: g */
    public static <T> Iterable<T> m15902g(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return AbstractC4308a.f7l8(iterable, iterable2);
    }

    @CanIgnoreReturnValue
    public static boolean gvn7(Iterable<?> iterable, Collection<?> collection) {
        return iterable instanceof Collection ? ((Collection) iterable).removeAll((Collection) com.google.common.base.jk.a9(collection)) : zwy.m16118c(iterable.iterator(), collection);
    }

    @wlev.zy
    /* JADX INFO: renamed from: h */
    public static <T> Iterable<T> m15903h(Iterable<?> iterable, Class<T> cls) {
        com.google.common.base.jk.a9(iterable);
        com.google.common.base.jk.a9(cls);
        return kja0(iterable, com.google.common.base.fti.kja0(cls));
    }

    public static String hyr(Iterable<?> iterable) {
        return zwy.hb(iterable.iterator());
    }

    /* JADX INFO: renamed from: i */
    public static <T> T m15904i(Iterable<T> iterable, int i2) {
        com.google.common.base.jk.a9(iterable);
        return iterable instanceof List ? (T) ((List) iterable).get(i2) : (T) zwy.fti(iterable.iterator(), i2);
    }

    public static <T> Iterable<T> jk(Iterable<T> iterable, int i2) {
        com.google.common.base.jk.a9(iterable);
        com.google.common.base.jk.m15380n(i2 >= 0, "limit is negative");
        return new C4480y(iterable, i2);
    }

    public static <T> Iterable<List<T>> jp0y(Iterable<T> iterable, int i2) {
        com.google.common.base.jk.a9(iterable);
        com.google.common.base.jk.m15383q(i2 > 0);
        return new zy(iterable, i2);
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: k */
    public static <T> boolean m15905k(Collection<T> collection, Iterable<? extends T> iterable) {
        return iterable instanceof Collection ? collection.addAll(mcp.toq(iterable)) : zwy.m16125k(collection, ((Iterable) com.google.common.base.jk.a9(iterable)).iterator());
    }

    @NullableDecl
    public static <T> T ki(Iterable<? extends T> iterable, com.google.common.base.a9<? super T> a9Var, @NullableDecl T t2) {
        return (T) zwy.wvg(iterable.iterator(), a9Var, t2);
    }

    public static <T> Iterable<T> kja0(Iterable<T> iterable, com.google.common.base.a9<? super T> a9Var) {
        com.google.common.base.jk.a9(iterable);
        com.google.common.base.jk.a9(a9Var);
        return new C4476n(iterable, a9Var);
    }

    /* JADX INFO: renamed from: l */
    static <T> T[] m15906l(Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) m15909q(iterable).toArray(tArr);
    }

    public static boolean ld6(Iterable<?> iterable, @NullableDecl Object obj) {
        return iterable instanceof Collection ? mcp.ld6((Collection) iterable, obj) : zwy.cdj(iterable.iterator(), obj);
    }

    @Deprecated
    public static <E> Iterable<E> lrht(z4<E> z4Var) {
        return (Iterable) com.google.common.base.jk.a9(z4Var);
    }

    public static int lvui(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : zwy.m16119e(iterable.iterator());
    }

    public static boolean mcp(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    /* JADX INFO: renamed from: n */
    public static <T> Iterable<T> m15907n(Iterable<? extends Iterable<? extends T>> iterable) {
        return AbstractC4308a.m15527g(iterable);
    }

    static <T> com.google.common.base.t8r<Iterable<? extends T>, Iterator<? extends T>> n5r1() {
        return new C4475k();
    }

    public static boolean n7h(Iterable<?> iterable, Iterable<?> iterable2) {
        if ((iterable instanceof Collection) && (iterable2 instanceof Collection) && ((Collection) iterable).size() != ((Collection) iterable2).size()) {
            return false;
        }
        return zwy.m16123i(iterable.iterator(), iterable2.iterator());
    }

    @wlev.zy
    public static <T> T[] ncyb(Iterable<? extends T> iterable, Class<T> cls) {
        return (T[]) m15906l(iterable, r25n.m15977s(cls, 0));
    }

    public static <T> T ni7(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) zwy.gvn7(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) m15914z(list);
    }

    public static <T> T o1t(Iterable<T> iterable) {
        return (T) zwy.eqxt(iterable.iterator());
    }

    @CanIgnoreReturnValue
    public static <T> boolean oc(Iterable<T> iterable, com.google.common.base.a9<? super T> a9Var) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? eqxt((List) iterable, (com.google.common.base.a9) com.google.common.base.jk.a9(a9Var)) : zwy.lrht(iterable.iterator(), a9Var);
    }

    /* JADX INFO: renamed from: p */
    public static <T> Iterable<T> m15908p(Iterable<T> iterable) {
        com.google.common.base.jk.a9(iterable);
        return new C4479s(iterable);
    }

    /* JADX INFO: renamed from: q */
    private static <E> Collection<E> m15909q(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : wlev.t8r(iterable.iterator());
    }

    @SafeVarargs
    public static <T> Iterable<T> qrj(T... tArr) {
        return x2(wlev.m16057i(tArr));
    }

    /* JADX INFO: renamed from: r */
    public static <T> Iterable<T> m15910r(Iterable<T> iterable, int i2) {
        com.google.common.base.jk.a9(iterable);
        com.google.common.base.jk.m15380n(i2 >= 0, "number to skip cannot be negative");
        return new f7l8(iterable, i2);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: s */
    public static <T> Iterable<T> m15911s(Iterable<? extends T>... iterableArr) {
        return AbstractC4308a.m15529p(iterableArr);
    }

    /* JADX INFO: renamed from: t */
    public static <T> int m15912t(Iterable<T> iterable, com.google.common.base.a9<? super T> a9Var) {
        return zwy.lvui(iterable.iterator(), a9Var);
    }

    public static int t8r(Iterable<?> iterable, @NullableDecl Object obj) {
        return iterable instanceof o05 ? ((o05) iterable).count(obj) : iterable instanceof Set ? ((Set) iterable).contains(obj) ? 1 : 0 : zwy.a9(iterable.iterator(), obj);
    }

    public static <T> boolean toq(Iterable<T> iterable, com.google.common.base.a9<? super T> a9Var) {
        return zwy.zy(iterable.iterator(), a9Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Iterable<T> uv6(Iterable<? extends T> iterable) {
        com.google.common.base.jk.a9(iterable);
        return ((iterable instanceof ld6) || (iterable instanceof z4)) ? iterable : new ld6(iterable, null);
    }

    @NullableDecl
    public static <T> T wvg(Iterable<? extends T> iterable, @NullableDecl T t2) {
        return (T) zwy.d2ok(iterable.iterator(), t2);
    }

    public static <T> Iterable<T> x2(Iterable<T> iterable) {
        com.google.common.base.jk.a9(iterable);
        return new toq(iterable);
    }

    static Object[] x9kr(Iterable<?> iterable) {
        return m15909q(iterable).toArray();
    }

    /* JADX INFO: renamed from: y */
    public static <T> Iterable<T> m15913y(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return AbstractC4308a.m15530s(iterable, iterable2, iterable3, iterable4);
    }

    /* JADX INFO: renamed from: z */
    private static <T> T m15914z(List<T> list) {
        return list.get(list.size() - 1);
    }

    @NullableDecl
    public static <T> T zurt(Iterable<? extends T> iterable, @NullableDecl T t2) {
        return (T) zwy.oc(iterable.iterator(), t2);
    }

    public static <T> boolean zy(Iterable<T> iterable, com.google.common.base.a9<? super T> a9Var) {
        return zwy.m16131q(iterable.iterator(), a9Var);
    }
}
