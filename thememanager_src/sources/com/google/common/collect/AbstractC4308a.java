package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.collect.a */
/* JADX INFO: compiled from: FluentIterable.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public abstract class AbstractC4308a<E> implements Iterable<E> {

    /* JADX INFO: renamed from: k */
    private final com.google.common.base.o1t<Iterable<E>> f25924k;

    /* JADX INFO: renamed from: com.google.common.collect.a$k */
    /* JADX INFO: compiled from: FluentIterable.java */
    static class k extends AbstractC4308a<E> {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Iterable f25925q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Iterable iterable, Iterable iterable2) {
            super(iterable);
            this.f25925q = iterable2;
        }

        @Override // java.lang.Iterable
        public Iterator<E> iterator() {
            return this.f25925q.iterator();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.a$q */
    /* JADX INFO: compiled from: FluentIterable.java */
    private static class q<E> implements com.google.common.base.t8r<Iterable<E>, AbstractC4308a<E>> {
        private q() {
        }

        @Override // com.google.common.base.t8r
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public AbstractC4308a<E> apply(Iterable<E> iterable) {
            return AbstractC4308a.t8r(iterable);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.a$toq */
    /* JADX INFO: compiled from: FluentIterable.java */
    static class toq<T> extends AbstractC4308a<T> {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Iterable f25926q;

        toq(Iterable iterable) {
            this.f25926q = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return zwy.m16133s(zwy.m16124j(this.f25926q.iterator(), nsb.n5r1()));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.collect.a$zy */
    /* JADX INFO: compiled from: FluentIterable.java */
    static class zy<T> extends AbstractC4308a<T> {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Iterable[] f25927q;

        /* JADX INFO: renamed from: com.google.common.collect.a$zy$k */
        /* JADX INFO: compiled from: FluentIterable.java */
        class k extends com.google.common.collect.toq<Iterator<? extends T>> {
            k(int i2) {
                super(i2);
            }

            @Override // com.google.common.collect.toq
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public Iterator<? extends T> mo15538k(int i2) {
                return zy.this.f25927q[i2].iterator();
            }
        }

        zy(Iterable[] iterableArr) {
            this.f25927q = iterableArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return zwy.m16133s(new k(this.f25927q.length));
        }
    }

    protected AbstractC4308a() {
        this.f25924k = com.google.common.base.o1t.absent();
    }

    @InterfaceC7731k
    public static <T> AbstractC4308a<T> f7l8(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return ld6(iterable, iterable2);
    }

    private Iterable<E> fn3e() {
        return this.f25924k.or(this);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: g */
    public static <T> AbstractC4308a<T> m15527g(Iterable<? extends Iterable<? extends T>> iterable) {
        com.google.common.base.jk.a9(iterable);
        return new toq(iterable);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: i */
    public static <E> AbstractC4308a<E> m15528i(E[] eArr) {
        return t8r(Arrays.asList(eArr));
    }

    @Deprecated
    public static <E> AbstractC4308a<E> ki(AbstractC4308a<E> abstractC4308a) {
        return (AbstractC4308a) com.google.common.base.jk.a9(abstractC4308a);
    }

    private static <T> AbstractC4308a<T> ld6(Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> iterable : iterableArr) {
            com.google.common.base.jk.a9(iterable);
        }
        return new zy(iterableArr);
    }

    @InterfaceC7731k
    public static <E> AbstractC4308a<E> o1t() {
        return t8r(se.of());
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: p */
    public static <T> AbstractC4308a<T> m15529p(Iterable<? extends T>... iterableArr) {
        return ld6((Iterable[]) Arrays.copyOf(iterableArr, iterableArr.length));
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: s */
    public static <T> AbstractC4308a<T> m15530s(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return ld6(iterable, iterable2, iterable3, iterable4);
    }

    public static <E> AbstractC4308a<E> t8r(Iterable<E> iterable) {
        return iterable instanceof AbstractC4308a ? (AbstractC4308a) iterable : new k(iterable, iterable);
    }

    @InterfaceC7731k
    public static <E> AbstractC4308a<E> wvg(@NullableDecl E e2, E... eArr) {
        return t8r(wlev.zy(e2, eArr));
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: y */
    public static <T> AbstractC4308a<T> m15531y(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return ld6(iterable, iterable2, iterable3);
    }

    public final <V> zkd<E, V> a9(com.google.common.base.t8r<? super E, V> t8rVar) {
        return vy.bo(fn3e(), t8rVar);
    }

    public final com.google.common.base.o1t<E> cdj(com.google.common.base.a9<? super E> a9Var) {
        return nsb.m15900c(fn3e(), a9Var);
    }

    public final boolean contains(@NullableDecl Object obj) {
        return nsb.ld6(fn3e(), obj);
    }

    public final <K> zkd<K, E> d2ok(com.google.common.base.t8r<? super E, K> t8rVar) {
        return vy.vq(fn3e(), t8rVar);
    }

    public final ixz<E> d3(Comparator<? super E> comparator) {
        return ixz.copyOf(comparator, fn3e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> AbstractC4308a<T> eqxt(com.google.common.base.t8r<? super E, ? extends Iterable<? extends T>> t8rVar) {
        return m15527g(oc(t8rVar));
    }

    public final b3e<E> fti() {
        return b3e.copyOf(fn3e());
    }

    public final com.google.common.base.o1t<E> fu4() {
        E next;
        Iterable<E> iterableFn3e = fn3e();
        if (iterableFn3e instanceof List) {
            List list = (List) iterableFn3e;
            return list.isEmpty() ? com.google.common.base.o1t.absent() : com.google.common.base.o1t.of(list.get(list.size() - 1));
        }
        Iterator<E> it = iterableFn3e.iterator();
        if (!it.hasNext()) {
            return com.google.common.base.o1t.absent();
        }
        if (iterableFn3e instanceof SortedSet) {
            return com.google.common.base.o1t.of(((SortedSet) iterableFn3e).last());
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return com.google.common.base.o1t.of(next);
    }

    public final E get(int i2) {
        return (E) nsb.m15904i(fn3e(), i2);
    }

    public final se<E> gvn7(Comparator<? super E> comparator) {
        return kx3.from(comparator).immutableSortedCopy(fn3e());
    }

    /* JADX INFO: renamed from: h */
    public final com.google.common.base.o1t<E> m15532h() {
        Iterator<E> it = fn3e().iterator();
        return it.hasNext() ? com.google.common.base.o1t.of(it.next()) : com.google.common.base.o1t.absent();
    }

    public final boolean isEmpty() {
        return !fn3e().iterator().hasNext();
    }

    public final se<E> jk() {
        return se.copyOf(fn3e());
    }

    public final vep5<E> jp0y() {
        return vep5.copyOf(fn3e());
    }

    /* JADX INFO: renamed from: k */
    public final boolean m15533k(com.google.common.base.a9<? super E> a9Var) {
        return nsb.toq(fn3e(), a9Var);
    }

    @wlev.zy
    public final <T> AbstractC4308a<T> kja0(Class<T> cls) {
        return t8r(nsb.m15903h(fn3e(), cls));
    }

    @wlev.zy
    public final E[] mcp(Class<E> cls) {
        return (E[]) nsb.ncyb(fn3e(), cls);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: n */
    public final AbstractC4308a<E> m15534n(E... eArr) {
        return f7l8(fn3e(), Arrays.asList(eArr));
    }

    public final AbstractC4308a<E> n7h(com.google.common.base.a9<? super E> a9Var) {
        return t8r(nsb.kja0(fn3e(), a9Var));
    }

    @InterfaceC7731k
    public final String ni7(com.google.common.base.ni7 ni7Var) {
        return ni7Var.ld6(this);
    }

    public final <T> AbstractC4308a<T> oc(com.google.common.base.t8r<? super E, T> t8rVar) {
        return t8r(nsb.m15901f(fn3e(), t8rVar));
    }

    public final AbstractC4308a<E> qrj() {
        return t8r(nsb.x2(fn3e()));
    }

    public final int size() {
        return nsb.lvui(fn3e());
    }

    /* JADX INFO: renamed from: t */
    public final AbstractC4308a<E> m15535t(int i2) {
        return t8r(nsb.m15910r(fn3e(), i2));
    }

    public String toString() {
        return nsb.hyr(fn3e());
    }

    public final boolean toq(com.google.common.base.a9<? super E> a9Var) {
        return nsb.zy(fn3e(), a9Var);
    }

    @CanIgnoreReturnValue
    public final <C extends Collection<? super E>> C x2(C c2) {
        com.google.common.base.jk.a9(c2);
        Iterable<E> iterableFn3e = fn3e();
        if (iterableFn3e instanceof Collection) {
            c2.addAll(mcp.toq(iterableFn3e));
        } else {
            Iterator<E> it = iterableFn3e.iterator();
            while (it.hasNext()) {
                c2.add(it.next());
            }
        }
        return c2;
    }

    /* JADX INFO: renamed from: z */
    public final AbstractC4308a<E> m15536z(int i2) {
        return t8r(nsb.jk(fn3e(), i2));
    }

    public final <K> gc3c<K, E> zurt(com.google.common.base.t8r<? super E, K> t8rVar) {
        return oki.ki(fn3e(), t8rVar);
    }

    @InterfaceC7731k
    public final AbstractC4308a<E> zy(Iterable<? extends E> iterable) {
        return f7l8(fn3e(), iterable);
    }

    AbstractC4308a(Iterable<E> iterable) {
        com.google.common.base.jk.a9(iterable);
        this.f25924k = com.google.common.base.o1t.fromNullable(this == iterable ? null : iterable);
    }
}
