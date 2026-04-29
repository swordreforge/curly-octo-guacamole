package com.google.common.util.concurrent;

import com.google.common.collect.se;
import com.google.common.util.concurrent.AbstractC4837q;
import com.google.common.util.concurrent.C4833o;
import com.google.common.util.concurrent.fn3e;
import com.google.common.util.concurrent.n5r1;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Futures.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq(emulated = true)
public final class dd extends AbstractC4817l {

    /* JADX INFO: compiled from: Futures.java */
    private static final class f7l8<T> {

        /* JADX INFO: renamed from: k */
        private boolean f27399k;

        /* JADX INFO: renamed from: n */
        private volatile int f27400n;

        /* JADX INFO: renamed from: q */
        private final InterfaceFutureC4792c<? extends T>[] f27401q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f68628toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final AtomicInteger f68629zy;

        /* synthetic */ f7l8(InterfaceFutureC4792c[] interfaceFutureC4792cArr, RunnableC4796k runnableC4796k) {
            this(interfaceFutureC4792cArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f7l8(boolean z2) {
            this.f27399k = true;
            if (!z2) {
                this.f68628toq = false;
            }
            m16919n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public void m16917g(se<AbstractC4837q<T>> seVar, int i2) {
            InterfaceFutureC4792c<? extends T>[] interfaceFutureC4792cArr = this.f27401q;
            InterfaceFutureC4792c<? extends T> interfaceFutureC4792c = interfaceFutureC4792cArr[i2];
            interfaceFutureC4792cArr[i2] = null;
            for (int i3 = this.f27400n; i3 < seVar.size(); i3++) {
                if (seVar.get(i3).a9(interfaceFutureC4792c)) {
                    m16919n();
                    this.f27400n = i3 + 1;
                    return;
                }
            }
            this.f27400n = seVar.size();
        }

        /* JADX INFO: renamed from: n */
        private void m16919n() {
            if (this.f68629zy.decrementAndGet() == 0 && this.f27399k) {
                for (InterfaceFutureC4792c<? extends T> interfaceFutureC4792c : this.f27401q) {
                    if (interfaceFutureC4792c != null) {
                        interfaceFutureC4792c.cancel(this.f68628toq);
                    }
                }
            }
        }

        private f7l8(InterfaceFutureC4792c<? extends T>[] interfaceFutureC4792cArr) {
            this.f27399k = false;
            this.f68628toq = true;
            this.f27400n = 0;
            this.f27401q = interfaceFutureC4792cArr;
            this.f68629zy = new AtomicInteger(interfaceFutureC4792cArr.length);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.dd$g */
    /* JADX INFO: compiled from: Futures.java */
    private static final class C4795g<T> extends AbstractC4837q<T> {

        /* JADX INFO: renamed from: i */
        private f7l8<T> f27402i;

        /* synthetic */ C4795g(f7l8 f7l8Var, RunnableC4796k runnableC4796k) {
            this(f7l8Var);
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q, java.util.concurrent.Future
        public boolean cancel(boolean z2) {
            f7l8<T> f7l8Var = this.f27402i;
            if (!super.cancel(z2)) {
                return false;
            }
            f7l8Var.f7l8(z2);
            return true;
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q
        /* JADX INFO: renamed from: h */
        protected void mo16921h() {
            this.f27402i = null;
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q
        protected String o1t() {
            f7l8<T> f7l8Var = this.f27402i;
            if (f7l8Var == null) {
                return null;
            }
            return "inputCount=[" + ((f7l8) f7l8Var).f27401q.length + "], remaining=[" + ((f7l8) f7l8Var).f68629zy.get() + "]";
        }

        private C4795g(f7l8<T> f7l8Var) {
            this.f27402i = f7l8Var;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.dd$k */
    /* JADX INFO: compiled from: Futures.java */
    static class RunnableC4796k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Future f27403k;

        RunnableC4796k(Future future) {
            this.f27403k = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27403k.cancel(false);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.dd$n */
    /* JADX INFO: compiled from: Futures.java */
    @wlev.toq
    @InterfaceC7731k
    @CanIgnoreReturnValue
    public static final class C4797n<V> {

        /* JADX INFO: renamed from: k */
        private final boolean f27404k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final se<InterfaceFutureC4792c<? extends V>> f68630toq;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.dd$n$k */
        /* JADX INFO: compiled from: Futures.java */
        class k implements Callable<Void> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Runnable f27405k;

            k(Runnable runnable) {
                this.f27405k = runnable;
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                this.f27405k.run();
                return null;
            }
        }

        /* synthetic */ C4797n(boolean z2, se seVar, RunnableC4796k runnableC4796k) {
            this(z2, seVar);
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: k */
        public <C> InterfaceFutureC4792c<C> m16922k(Callable<C> callable, Executor executor) {
            return new zurt(this.f68630toq, this.f27404k, executor, callable);
        }

        public <C> InterfaceFutureC4792c<C> toq(qrj<C> qrjVar, Executor executor) {
            return new zurt(this.f68630toq, this.f27404k, executor, qrjVar);
        }

        public InterfaceFutureC4792c<?> zy(Runnable runnable, Executor executor) {
            return m16922k(new k(runnable), executor);
        }

        private C4797n(boolean z2, se<InterfaceFutureC4792c<? extends V>> seVar) {
            this.f27404k = z2;
            this.f68630toq = seVar;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.dd$q */
    /* JADX INFO: compiled from: Futures.java */
    private static final class RunnableC4798q<V> implements Runnable {

        /* JADX INFO: renamed from: k */
        final Future<V> f27407k;

        /* JADX INFO: renamed from: q */
        final InterfaceC4838r<? super V> f27408q;

        RunnableC4798q(Future<V> future, InterfaceC4838r<? super V> interfaceC4838r) {
            this.f27407k = future;
            this.f27408q = interfaceC4838r;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f27408q.m17008k(dd.m16915y(this.f27407k));
            } catch (Error e2) {
                e = e2;
                this.f27408q.toq(e);
            } catch (RuntimeException e3) {
                e = e3;
                this.f27408q.toq(e);
            } catch (ExecutionException e4) {
                this.f27408q.toq(e4.getCause());
            }
        }

        public String toString() {
            return com.google.common.base.fu4.zy(this).m15357h(this.f27408q).toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.dd$s */
    /* JADX INFO: compiled from: Futures.java */
    private static final class RunnableC4799s<V> extends AbstractC4837q.p<V> implements Runnable {

        /* JADX INFO: renamed from: i */
        private InterfaceFutureC4792c<V> f27409i;

        RunnableC4799s(InterfaceFutureC4792c<V> interfaceFutureC4792c) {
            this.f27409i = interfaceFutureC4792c;
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q
        /* JADX INFO: renamed from: h */
        protected void mo16921h() {
            this.f27409i = null;
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q
        protected String o1t() {
            InterfaceFutureC4792c<V> interfaceFutureC4792c = this.f27409i;
            if (interfaceFutureC4792c == null) {
                return null;
            }
            return "delegate=[" + interfaceFutureC4792c + "]";
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceFutureC4792c<V> interfaceFutureC4792c = this.f27409i;
            if (interfaceFutureC4792c != null) {
                a9(interfaceFutureC4792c);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [O] */
    /* JADX INFO: compiled from: Futures.java */
    static class toq<O> implements Future<O> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Future f27410k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ com.google.common.base.t8r f27411q;

        toq(Future future, com.google.common.base.t8r t8rVar) {
            this.f27410k = future;
            this.f27411q = t8rVar;
        }

        /* JADX INFO: renamed from: k */
        private O m16924k(I i2) throws ExecutionException {
            try {
                return (O) this.f27411q.apply(i2);
            } catch (Throwable th) {
                throw new ExecutionException(th);
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z2) {
            return this.f27410k.cancel(z2);
        }

        @Override // java.util.concurrent.Future
        public O get() throws ExecutionException, InterruptedException {
            return m16924k(this.f27410k.get());
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f27410k.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f27410k.isDone();
        }

        @Override // java.util.concurrent.Future
        public O get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return m16924k(this.f27410k.get(j2, timeUnit));
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.dd$y */
    /* JADX INFO: compiled from: Futures.java */
    @wlev.zy
    private static class C4800y<V, X extends Exception> extends com.google.common.util.concurrent.toq<V, X> {

        /* JADX INFO: renamed from: q */
        final com.google.common.base.t8r<? super Exception, X> f27412q;

        C4800y(InterfaceFutureC4792c<V> interfaceFutureC4792c, com.google.common.base.t8r<? super Exception, X> t8rVar) {
            super(interfaceFutureC4792c);
            this.f27412q = (com.google.common.base.t8r) com.google.common.base.jk.a9(t8rVar);
        }

        @Override // com.google.common.util.concurrent.toq
        protected X kja0(Exception exc) {
            return this.f27412q.apply(exc);
        }
    }

    /* JADX INFO: compiled from: Futures.java */
    static class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ f7l8 f27413k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ int f27414n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ se f27415q;

        zy(f7l8 f7l8Var, se seVar, int i2) {
            this.f27413k = f7l8Var;
            this.f27415q = seVar;
            this.f27414n = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27413k.m16917g(this.f27415q, this.f27414n);
        }
    }

    private dd() {
    }

    @InterfaceC7731k
    @wlev.zy
    @Deprecated
    public static <V, X extends Exception> InterfaceC4813i<V, X> cdj(InterfaceFutureC4792c<V> interfaceFutureC4792c, com.google.common.base.t8r<? super Exception, X> t8rVar) {
        return new C4800y((InterfaceFutureC4792c) com.google.common.base.jk.a9(interfaceFutureC4792c), t8rVar);
    }

    @InterfaceC7731k
    @wlev.zy
    @CanIgnoreReturnValue
    public static <V, X extends Exception> V f7l8(Future<V> future, Class<X> cls, long j2, TimeUnit timeUnit) throws Exception {
        return (V) x9kr.m17030g(future, cls, j2, timeUnit);
    }

    @InterfaceC7731k
    public static <V> InterfaceFutureC4792c<List<V>> fn3e(Iterable<? extends InterfaceFutureC4792c<? extends V>> iterable) {
        return new fn3e.toq(se.copyOf(iterable), false);
    }

    @InterfaceC7731k
    public static <I, O> InterfaceFutureC4792c<O> fu4(InterfaceFutureC4792c<I> interfaceFutureC4792c, n7h<? super I, ? extends O> n7hVar, Executor executor) {
        return AbstractRunnableC4836p.x9kr(interfaceFutureC4792c, n7hVar, executor);
    }

    @InterfaceC7731k
    @wlev.zy
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: g */
    public static <V, X extends Exception> V m16906g(Future<V> future, Class<X> cls) throws Exception {
        return (V) x9kr.m17032n(future, cls);
    }

    @InterfaceC7731k
    @wlev.zy
    /* JADX INFO: renamed from: h */
    public static <I, O> Future<O> m16907h(Future<I> future, com.google.common.base.t8r<? super I, ? extends O> t8rVar) {
        com.google.common.base.jk.a9(future);
        com.google.common.base.jk.a9(t8rVar);
        return new toq(future, t8rVar);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: i */
    public static <O> InterfaceFutureC4792c<O> m16908i(qrj<O> qrjVar, Executor executor) {
        t8iq t8iqVarDd = t8iq.dd(qrjVar);
        executor.execute(t8iqVarDd);
        return t8iqVarDd;
    }

    private static void jk(Throwable th) {
        if (!(th instanceof Error)) {
            throw new bo(th);
        }
        throw new C4857z((Error) th);
    }

    /* JADX INFO: renamed from: k */
    public static <V> void m16909k(InterfaceFutureC4792c<V> interfaceFutureC4792c, InterfaceC4838r<? super V> interfaceC4838r, Executor executor) {
        com.google.common.base.jk.a9(interfaceC4838r);
        interfaceFutureC4792c.n7h(new RunnableC4798q(interfaceFutureC4792c, interfaceC4838r), executor);
    }

    @InterfaceC7731k
    public static <V> InterfaceFutureC4792c<V> ki(InterfaceFutureC4792c<V> interfaceFutureC4792c) {
        if (interfaceFutureC4792c.isDone()) {
            return interfaceFutureC4792c;
        }
        RunnableC4799s runnableC4799s = new RunnableC4799s(interfaceFutureC4792c);
        interfaceFutureC4792c.n7h(runnableC4799s, C4815j.zy());
        return runnableC4799s;
    }

    @InterfaceC7731k
    public static <T> se<InterfaceFutureC4792c<T>> kja0(Iterable<? extends InterfaceFutureC4792c<? extends T>> iterable) {
        Collection collectionCopyOf = iterable instanceof Collection ? (Collection) iterable : se.copyOf(iterable);
        InterfaceFutureC4792c[] interfaceFutureC4792cArr = (InterfaceFutureC4792c[]) collectionCopyOf.toArray(new InterfaceFutureC4792c[collectionCopyOf.size()]);
        RunnableC4796k runnableC4796k = null;
        f7l8 f7l8Var = new f7l8(interfaceFutureC4792cArr, runnableC4796k);
        se.C4520k c4520kBuilder = se.builder();
        for (int i2 = 0; i2 < interfaceFutureC4792cArr.length; i2++) {
            c4520kBuilder.mo15569k(new C4795g(f7l8Var, runnableC4796k));
        }
        se<InterfaceFutureC4792c<T>> seVarMo15570n = c4520kBuilder.mo15570n();
        for (int i3 = 0; i3 < interfaceFutureC4792cArr.length; i3++) {
            interfaceFutureC4792cArr[i3].n7h(new zy(f7l8Var, seVarMo15570n, i3), C4815j.zy());
        }
        return seVarMo15570n;
    }

    @InterfaceC7731k
    @wlev.zy
    @Deprecated
    public static <V, X extends Exception> InterfaceC4813i<V, X> ld6(@NullableDecl V v2) {
        return new n5r1.C4825q(v2);
    }

    @InterfaceC7731k
    @wlev.zy
    public static <V> InterfaceFutureC4792c<V> mcp(InterfaceFutureC4792c<V> interfaceFutureC4792c, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return interfaceFutureC4792c.isDone() ? interfaceFutureC4792c : lv5.m16976l(interfaceFutureC4792c, j2, timeUnit, scheduledExecutorService);
    }

    @C4833o.k("AVAILABLE but requires exceptionType to be Throwable.class")
    @InterfaceC7731k
    /* JADX INFO: renamed from: n */
    public static <V, X extends Throwable> InterfaceFutureC4792c<V> m16910n(InterfaceFutureC4792c<? extends V> interfaceFutureC4792c, Class<X> cls, n7h<? super X, ? extends V> n7hVar, Executor executor) {
        return AbstractRunnableC4816k.x9kr(interfaceFutureC4792c, cls, n7hVar, executor);
    }

    public static <V> InterfaceFutureC4792c<V> n7h(@NullableDecl V v2) {
        return v2 == null ? n5r1.C4824n.f27489n : new n5r1.C4824n(v2);
    }

    @InterfaceC7731k
    public static <I, O> InterfaceFutureC4792c<O> ni7(InterfaceFutureC4792c<I> interfaceFutureC4792c, com.google.common.base.t8r<? super I, ? extends O> t8rVar, Executor executor) {
        return AbstractRunnableC4836p.dd(interfaceFutureC4792c, t8rVar, executor);
    }

    @SafeVarargs
    @InterfaceC7731k
    public static <V> C4797n<V> o1t(InterfaceFutureC4792c<? extends V>... interfaceFutureC4792cArr) {
        return new C4797n<>(false, se.copyOf(interfaceFutureC4792cArr), null);
    }

    /* JADX INFO: renamed from: p */
    public static <V> InterfaceFutureC4792c<V> m16911p() {
        return new n5r1.C4823k();
    }

    @C4833o.k("AVAILABLE but requires exceptionType to be Throwable.class")
    @InterfaceC7731k
    /* JADX INFO: renamed from: q */
    public static <V, X extends Throwable> InterfaceFutureC4792c<V> m16912q(InterfaceFutureC4792c<? extends V> interfaceFutureC4792c, Class<X> cls, com.google.common.base.t8r<? super X, ? extends V> t8rVar, Executor executor) {
        return AbstractRunnableC4816k.dd(interfaceFutureC4792c, cls, t8rVar, executor);
    }

    public static <V> InterfaceFutureC4792c<V> qrj(Throwable th) {
        com.google.common.base.jk.a9(th);
        return new n5r1.zy(th);
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: s */
    public static <V> V m16913s(Future<V> future) {
        com.google.common.base.jk.a9(future);
        try {
            return (V) c8jq.m16895q(future);
        } catch (ExecutionException e2) {
            jk(e2.getCause());
            throw new AssertionError();
        }
    }

    @SafeVarargs
    @InterfaceC7731k
    /* JADX INFO: renamed from: t */
    public static <V> C4797n<V> m16914t(InterfaceFutureC4792c<? extends V>... interfaceFutureC4792cArr) {
        return new C4797n<>(true, se.copyOf(interfaceFutureC4792cArr), null);
    }

    @InterfaceC7731k
    @wlev.zy
    public static <O> InterfaceFutureC4792c<O> t8r(qrj<O> qrjVar, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        t8iq t8iqVarDd = t8iq.dd(qrjVar);
        t8iqVarDd.n7h(new RunnableC4796k(scheduledExecutorService.schedule(t8iqVarDd, j2, timeUnit)), C4815j.zy());
        return t8iqVarDd;
    }

    @InterfaceC7731k
    public static <V> InterfaceFutureC4792c<List<V>> toq(Iterable<? extends InterfaceFutureC4792c<? extends V>> iterable) {
        return new fn3e.toq(se.copyOf(iterable), true);
    }

    @InterfaceC7731k
    public static <V> C4797n<V> wvg(Iterable<? extends InterfaceFutureC4792c<? extends V>> iterable) {
        return new C4797n<>(true, se.copyOf(iterable), null);
    }

    @InterfaceC7731k
    @wlev.zy
    @Deprecated
    public static <V, X extends Exception> InterfaceC4813i<V, X> x2(X x3) {
        com.google.common.base.jk.a9(x3);
        return new n5r1.toq(x3);
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: y */
    public static <V> V m16915y(Future<V> future) throws ExecutionException {
        com.google.common.base.jk.gyi(future.isDone(), "Future was expected to be done: %s", future);
        return (V) c8jq.m16895q(future);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: z */
    public static <V> C4797n<V> m16916z(Iterable<? extends InterfaceFutureC4792c<? extends V>> iterable) {
        return new C4797n<>(false, se.copyOf(iterable), null);
    }

    @SafeVarargs
    @InterfaceC7731k
    public static <V> InterfaceFutureC4792c<List<V>> zurt(InterfaceFutureC4792c<? extends V>... interfaceFutureC4792cArr) {
        return new fn3e.toq(se.copyOf(interfaceFutureC4792cArr), false);
    }

    @SafeVarargs
    @InterfaceC7731k
    public static <V> InterfaceFutureC4792c<List<V>> zy(InterfaceFutureC4792c<? extends V>... interfaceFutureC4792cArr) {
        return new fn3e.toq(se.copyOf(interfaceFutureC4792cArr), true);
    }
}
