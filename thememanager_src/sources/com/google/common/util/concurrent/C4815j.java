package com.google.common.util.concurrent;

import com.google.common.collect.u38j;
import com.google.common.collect.wlev;
import com.google.common.util.concurrent.AbstractC4837q;
import com.google.common.util.concurrent.eqxt;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: renamed from: com.google.common.util.concurrent.j */
/* JADX INFO: compiled from: MoreExecutors.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq(emulated = true)
public final class C4815j {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.j$g */
    /* JADX INFO: compiled from: MoreExecutors.java */
    @InterfaceC7732q
    @wlev.zy
    static class g {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.j$g$k */
        /* JADX INFO: compiled from: MoreExecutors.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ ExecutorService f27453k;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ TimeUnit f27454n;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ long f27455q;

            k(ExecutorService executorService, long j2, TimeUnit timeUnit) {
                this.f27453k = executorService;
                this.f27455q = j2;
                this.f27454n = timeUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f27453k.shutdown();
                    this.f27453k.awaitTermination(this.f27455q, this.f27454n);
                } catch (InterruptedException unused) {
                }
            }
        }

        g() {
        }

        /* JADX INFO: renamed from: g */
        final ScheduledExecutorService m16962g(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j2, TimeUnit timeUnit) {
            C4815j.zurt(scheduledThreadPoolExecutor);
            ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(scheduledThreadPoolExecutor);
            m16963k(scheduledThreadPoolExecutor, j2, timeUnit);
            return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        }

        /* JADX INFO: renamed from: k */
        final void m16963k(ExecutorService executorService, long j2, TimeUnit timeUnit) {
            com.google.common.base.jk.a9(executorService);
            com.google.common.base.jk.a9(timeUnit);
            toq(C4815j.n7h("DelayedShutdownHook-for-" + executorService, new k(executorService, j2, timeUnit)));
        }

        /* JADX INFO: renamed from: n */
        final ScheduledExecutorService m16964n(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
            return m16962g(scheduledThreadPoolExecutor, 120L, TimeUnit.SECONDS);
        }

        /* JADX INFO: renamed from: q */
        final ExecutorService m16965q(ThreadPoolExecutor threadPoolExecutor, long j2, TimeUnit timeUnit) {
            C4815j.zurt(threadPoolExecutor);
            ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
            m16963k(threadPoolExecutor, j2, timeUnit);
            return executorServiceUnconfigurableExecutorService;
        }

        @InterfaceC7732q
        void toq(Thread thread) {
            Runtime.getRuntime().addShutdownHook(thread);
        }

        final ExecutorService zy(ThreadPoolExecutor threadPoolExecutor) {
            return m16965q(threadPoolExecutor, 120L, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.j$k */
    /* JADX INFO: compiled from: MoreExecutors.java */
    static class k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ BlockingQueue f27456k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceFutureC4792c f27457q;

        k(BlockingQueue blockingQueue, InterfaceFutureC4792c interfaceFutureC4792c) {
            this.f27456k = blockingQueue;
            this.f27457q = interfaceFutureC4792c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27456k.add(this.f27457q);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.j$n */
    /* JADX INFO: compiled from: MoreExecutors.java */
    static class n implements Executor {

        /* JADX INFO: renamed from: k */
        boolean f27458k = true;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ AbstractC4837q f27459n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Executor f27460q;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.j$n$k */
        /* JADX INFO: compiled from: MoreExecutors.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Runnable f27461k;

            k(Runnable runnable) {
                this.f27461k = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                n.this.f27458k = false;
                this.f27461k.run();
            }
        }

        n(Executor executor, AbstractC4837q abstractC4837q) {
            this.f27460q = executor;
            this.f27459n = abstractC4837q;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.f27460q.execute(new k(runnable));
            } catch (RejectedExecutionException e2) {
                if (this.f27458k) {
                    this.f27459n.jk(e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.j$q */
    /* JADX INFO: compiled from: MoreExecutors.java */
    static class q extends dr {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ com.google.common.base.lvui f27463n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(ScheduledExecutorService scheduledExecutorService, com.google.common.base.lvui lvuiVar) {
            super(scheduledExecutorService);
            this.f27463n = lvuiVar;
        }

        @Override // com.google.common.util.concurrent.gyi
        /* JADX INFO: renamed from: k */
        protected Runnable mo16937k(Runnable runnable) {
            return t8r.m17017q(runnable, this.f27463n);
        }

        @Override // com.google.common.util.concurrent.gyi
        protected <T> Callable<T> toq(Callable<T> callable) {
            return t8r.m17016n(callable, this.f27463n);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.j$s */
    /* JADX INFO: compiled from: MoreExecutors.java */
    @wlev.zy
    private static final class s extends y implements nn86 {

        /* JADX INFO: renamed from: q */
        final ScheduledExecutorService f27464q;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.j$s$k */
        /* JADX INFO: compiled from: MoreExecutors.java */
        private static final class k<V> extends eqxt.AbstractC4803k<V> implements uv6<V> {

            /* JADX INFO: renamed from: q */
            private final ScheduledFuture<?> f27465q;

            public k(InterfaceFutureC4792c<V> interfaceFutureC4792c, ScheduledFuture<?> scheduledFuture) {
                super(interfaceFutureC4792c);
                this.f27465q = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.oc, java.util.concurrent.Future
            public boolean cancel(boolean z2) {
                boolean zCancel = super.cancel(z2);
                if (zCancel) {
                    this.f27465q.cancel(z2);
                }
                return zCancel;
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f27465q.getDelay(timeUnit);
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed delayed) {
                return this.f27465q.compareTo(delayed);
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.j$s$toq */
        /* JADX INFO: compiled from: MoreExecutors.java */
        @wlev.zy
        private static final class toq extends AbstractC4837q.p<Void> implements Runnable {

            /* JADX INFO: renamed from: i */
            private final Runnable f27466i;

            public toq(Runnable runnable) {
                this.f27466i = (Runnable) com.google.common.base.jk.a9(runnable);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f27466i.run();
                } catch (Throwable th) {
                    jk(th);
                    throw com.google.common.base.dd.cdj(th);
                }
            }
        }

        s(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f27464q = (ScheduledExecutorService) com.google.common.base.jk.a9(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public uv6<?> scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            toq toqVar = new toq(runnable);
            return new k(toqVar, this.f27464q.scheduleAtFixedRate(toqVar, j2, j3, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public uv6<?> scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            toq toqVar = new toq(runnable);
            return new k(toqVar, this.f27464q.scheduleWithFixedDelay(toqVar, j2, j3, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public uv6<?> schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
            t8iq t8iqVarX9kr = t8iq.x9kr(runnable, null);
            return new k(t8iqVarX9kr, this.f27464q.schedule(t8iqVarX9kr, j2, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public <V> uv6<V> schedule(Callable<V> callable, long j2, TimeUnit timeUnit) {
            t8iq t8iqVarNcyb = t8iq.ncyb(callable);
            return new k(t8iqVarNcyb, this.f27464q.schedule(t8iqVarNcyb, j2, timeUnit));
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.j$toq */
    /* JADX INFO: compiled from: MoreExecutors.java */
    static class toq implements Executor {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Executor f27467k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ com.google.common.base.lvui f27468q;

        toq(Executor executor, com.google.common.base.lvui lvuiVar) {
            this.f27467k = executor;
            this.f27468q = lvuiVar;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f27467k.execute(t8r.m17017q(runnable, this.f27468q));
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.j$y */
    /* JADX INFO: compiled from: MoreExecutors.java */
    @wlev.zy
    private static class y extends com.google.common.util.concurrent.f7l8 {

        /* JADX INFO: renamed from: k */
        private final ExecutorService f27469k;

        y(ExecutorService executorService) {
            this.f27469k = (ExecutorService) com.google.common.base.jk.a9(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
            return this.f27469k.awaitTermination(j2, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f27469k.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f27469k.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f27469k.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f27469k.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f27469k.shutdownNow();
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.j$zy */
    /* JADX INFO: compiled from: MoreExecutors.java */
    static class zy extends gyi {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ com.google.common.base.lvui f27470q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(ExecutorService executorService, com.google.common.base.lvui lvuiVar) {
            super(executorService);
            this.f27470q = lvuiVar;
        }

        @Override // com.google.common.util.concurrent.gyi
        /* JADX INFO: renamed from: k */
        protected Runnable mo16937k(Runnable runnable) {
            return t8r.m17017q(runnable, this.f27470q);
        }

        @Override // com.google.common.util.concurrent.gyi
        protected <T> Callable<T> toq(Callable<T> callable) {
            return t8r.m17016n(callable, this.f27470q);
        }
    }

    private C4815j() {
    }

    @wlev.zy
    static Executor cdj(Executor executor, com.google.common.base.lvui<String> lvuiVar) {
        com.google.common.base.jk.a9(executor);
        com.google.common.base.jk.a9(lvuiVar);
        return m16959s() ? executor : new toq(executor, lvuiVar);
    }

    @InterfaceC7731k
    @wlev.zy
    public static ScheduledExecutorService f7l8(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j2, TimeUnit timeUnit) {
        return new g().m16962g(scheduledThreadPoolExecutor, j2, timeUnit);
    }

    @wlev.zy
    private static <T> InterfaceFutureC4792c<T> fn3e(InterfaceExecutorServiceC4801e interfaceExecutorServiceC4801e, Callable<T> callable, BlockingQueue<Future<T>> blockingQueue) {
        InterfaceFutureC4792c<T> interfaceFutureC4792cSubmit = interfaceExecutorServiceC4801e.submit((Callable) callable);
        interfaceFutureC4792cSubmit.n7h(new k(blockingQueue, interfaceFutureC4792cSubmit), zy());
        return interfaceFutureC4792cSubmit;
    }

    @InterfaceC7731k
    @wlev.zy
    /* JADX INFO: renamed from: g */
    public static ScheduledExecutorService m16952g(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        return new g().m16964n(scheduledThreadPoolExecutor);
    }

    /* JADX INFO: renamed from: h */
    static Executor m16953h(Executor executor, AbstractC4837q<?> abstractC4837q) {
        com.google.common.base.jk.a9(executor);
        com.google.common.base.jk.a9(abstractC4837q);
        return executor == zy() ? executor : new n(executor, abstractC4837q);
    }

    @CanIgnoreReturnValue
    @InterfaceC7731k
    @wlev.zy
    /* JADX INFO: renamed from: i */
    public static boolean m16954i(ExecutorService executorService, long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2) / 2;
        executorService.shutdown();
        try {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (!executorService.awaitTermination(nanos, timeUnit2)) {
                executorService.shutdownNow();
                executorService.awaitTermination(nanos, timeUnit2);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            executorService.shutdownNow();
        }
        return executorService.isTerminated();
    }

    @wlev.zy
    static ExecutorService ki(ExecutorService executorService, com.google.common.base.lvui<String> lvuiVar) {
        com.google.common.base.jk.a9(executorService);
        com.google.common.base.jk.a9(lvuiVar);
        return m16959s() ? executorService : new zy(executorService, lvuiVar);
    }

    @InterfaceC7731k
    @wlev.zy
    public static ThreadFactory kja0() {
        if (!m16959s()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException e2) {
            e = e2;
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (IllegalAccessException e3) {
            e = e3;
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (InvocationTargetException e6) {
            throw com.google.common.base.dd.cdj(e6.getCause());
        }
    }

    @wlev.zy
    public static nn86 ld6(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof nn86 ? (nn86) scheduledExecutorService : new s(scheduledExecutorService);
    }

    @InterfaceC7731k
    @wlev.zy
    /* JADX INFO: renamed from: n */
    public static ExecutorService m16956n(ThreadPoolExecutor threadPoolExecutor, long j2, TimeUnit timeUnit) {
        return new g().m16965q(threadPoolExecutor, j2, timeUnit);
    }

    @wlev.zy
    static Thread n7h(String str, Runnable runnable) {
        com.google.common.base.jk.a9(str);
        com.google.common.base.jk.a9(runnable);
        Thread threadNewThread = kja0().newThread(runnable);
        try {
            threadNewThread.setName(str);
        } catch (SecurityException unused) {
        }
        return threadNewThread;
    }

    @wlev.zy
    /* JADX INFO: renamed from: p */
    public static InterfaceExecutorServiceC4801e m16957p(ExecutorService executorService) {
        if (executorService instanceof InterfaceExecutorServiceC4801e) {
            return (InterfaceExecutorServiceC4801e) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new s((ScheduledExecutorService) executorService) : new y(executorService);
    }

    @InterfaceC7731k
    @wlev.zy
    /* JADX INFO: renamed from: q */
    public static ExecutorService m16958q(ThreadPoolExecutor threadPoolExecutor) {
        return new g().zy(threadPoolExecutor);
    }

    @InterfaceC7731k
    @wlev.zy
    public static Executor qrj(Executor executor) {
        return new y9n(executor);
    }

    @wlev.zy
    /* JADX INFO: renamed from: s */
    private static boolean m16959s() {
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            return Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", new Class[0]).invoke(null, new Object[0]) != null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    @wlev.zy
    static ScheduledExecutorService t8r(ScheduledExecutorService scheduledExecutorService, com.google.common.base.lvui<String> lvuiVar) {
        com.google.common.base.jk.a9(scheduledExecutorService);
        com.google.common.base.jk.a9(lvuiVar);
        return m16959s() ? scheduledExecutorService : new q(scheduledExecutorService, lvuiVar);
    }

    @InterfaceC7731k
    @wlev.zy
    public static void toq(ExecutorService executorService, long j2, TimeUnit timeUnit) {
        new g().m16963k(executorService, j2, timeUnit);
    }

    @wlev.zy
    public static InterfaceExecutorServiceC4801e x2() {
        return new f7l8(null);
    }

    @wlev.zy
    /* JADX INFO: renamed from: y */
    static <T> T m16960y(InterfaceExecutorServiceC4801e interfaceExecutorServiceC4801e, Collection<? extends Callable<T>> collection, boolean z2, long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long jNanoTime;
        long jNanoTime2;
        com.google.common.base.jk.a9(interfaceExecutorServiceC4801e);
        com.google.common.base.jk.a9(timeUnit);
        int size = collection.size();
        com.google.common.base.jk.m15383q(size > 0);
        ArrayList arrayListFn3e = wlev.fn3e(size);
        LinkedBlockingQueue linkedBlockingQueueLd6 = u38j.ld6();
        long nanos = timeUnit.toNanos(j2);
        if (z2) {
            try {
                jNanoTime = System.nanoTime();
            } catch (Throwable th) {
                Iterator it = arrayListFn3e.iterator();
                while (it.hasNext()) {
                    ((Future) it.next()).cancel(true);
                }
                throw th;
            }
        } else {
            jNanoTime = 0;
        }
        Iterator<? extends Callable<T>> it2 = collection.iterator();
        arrayListFn3e.add(fn3e(interfaceExecutorServiceC4801e, it2.next(), linkedBlockingQueueLd6));
        int i2 = size - 1;
        int i3 = 1;
        ExecutionException executionException = null;
        while (true) {
            Future future = (Future) linkedBlockingQueueLd6.poll();
            if (future != null) {
                jNanoTime2 = jNanoTime;
            } else {
                if (i2 > 0) {
                    i2--;
                    arrayListFn3e.add(fn3e(interfaceExecutorServiceC4801e, it2.next(), linkedBlockingQueueLd6));
                    i3++;
                } else {
                    if (i3 == 0) {
                        if (executionException == null) {
                            throw new ExecutionException((Throwable) null);
                        }
                        throw executionException;
                    }
                    if (z2) {
                        future = (Future) linkedBlockingQueueLd6.poll(nanos, TimeUnit.NANOSECONDS);
                        if (future == null) {
                            throw new TimeoutException();
                        }
                        jNanoTime2 = System.nanoTime();
                        nanos -= jNanoTime2 - jNanoTime;
                    } else {
                        future = (Future) linkedBlockingQueueLd6.take();
                    }
                }
                jNanoTime2 = jNanoTime;
            }
            long j3 = nanos;
            int i4 = i2;
            if (future != null) {
                i3--;
                try {
                    T t2 = (T) future.get();
                    Iterator it3 = arrayListFn3e.iterator();
                    while (it3.hasNext()) {
                        ((Future) it3.next()).cancel(true);
                    }
                    return t2;
                } catch (RuntimeException e2) {
                    executionException = new ExecutionException(e2);
                    i2 = i4;
                    nanos = j3;
                    jNanoTime = jNanoTime2;
                } catch (ExecutionException e3) {
                    executionException = e3;
                    i2 = i4;
                    nanos = j3;
                    jNanoTime = jNanoTime2;
                }
            }
            i2 = i4;
            nanos = j3;
            jNanoTime = jNanoTime2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @wlev.zy
    public static void zurt(ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.setThreadFactory(new ch().m16903n(true).m16905y(threadPoolExecutor.getThreadFactory()).toq());
    }

    public static Executor zy() {
        return fu4.INSTANCE;
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.j$f7l8 */
    /* JADX INFO: compiled from: MoreExecutors.java */
    @wlev.zy
    private static final class f7l8 extends com.google.common.util.concurrent.f7l8 {

        /* JADX INFO: renamed from: k */
        private final Object f27449k;

        /* JADX INFO: renamed from: n */
        @GuardedBy(com.android.thememanager.util.yz.xk5)
        private boolean f27450n;

        /* JADX INFO: renamed from: q */
        @GuardedBy(com.android.thememanager.util.yz.xk5)
        private int f27451q;

        private f7l8() {
            this.f27449k = new Object();
            this.f27451q = 0;
            this.f27450n = false;
        }

        /* JADX INFO: renamed from: k */
        private void m16961k() {
            synchronized (this.f27449k) {
                int i2 = this.f27451q - 1;
                this.f27451q = i2;
                if (i2 == 0) {
                    this.f27449k.notifyAll();
                }
            }
        }

        private void toq() {
            synchronized (this.f27449k) {
                if (this.f27450n) {
                    throw new RejectedExecutionException("Executor already shutdown");
                }
                this.f27451q++;
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
            long nanos = timeUnit.toNanos(j2);
            synchronized (this.f27449k) {
                while (true) {
                    if (this.f27450n && this.f27451q == 0) {
                        return true;
                    }
                    if (nanos <= 0) {
                        return false;
                    }
                    long jNanoTime = System.nanoTime();
                    TimeUnit.NANOSECONDS.timedWait(this.f27449k, nanos);
                    nanos -= System.nanoTime() - jNanoTime;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            toq();
            try {
                runnable.run();
            } finally {
                m16961k();
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            boolean z2;
            synchronized (this.f27449k) {
                z2 = this.f27450n;
            }
            return z2;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            boolean z2;
            synchronized (this.f27449k) {
                z2 = this.f27450n && this.f27451q == 0;
            }
            return z2;
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            synchronized (this.f27449k) {
                this.f27450n = true;
                if (this.f27451q == 0) {
                    this.f27449k.notifyAll();
                }
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            shutdown();
            return Collections.emptyList();
        }

        /* synthetic */ f7l8(k kVar) {
            this();
        }
    }
}
