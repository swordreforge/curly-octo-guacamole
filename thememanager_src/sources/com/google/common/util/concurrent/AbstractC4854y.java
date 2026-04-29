package com.google.common.util.concurrent;

import com.google.common.util.concurrent.InterfaceC4785b;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.util.concurrent.y */
/* JADX INFO: compiled from: AbstractScheduledService.java */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7731k
@wlev.zy
public abstract class AbstractC4854y implements InterfaceC4785b {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Logger f68676toq = Logger.getLogger(AbstractC4854y.class.getName());

    /* JADX INFO: renamed from: k */
    private final AbstractC4839s f27580k = new n(this, null);

    /* JADX INFO: renamed from: com.google.common.util.concurrent.y$k */
    /* JADX INFO: compiled from: AbstractScheduledService.java */
    class k extends InterfaceC4785b.toq {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ScheduledExecutorService f27581k;

        k(ScheduledExecutorService scheduledExecutorService) {
            this.f27581k = scheduledExecutorService;
        }

        @Override // com.google.common.util.concurrent.InterfaceC4785b.toq
        /* JADX INFO: renamed from: k */
        public void mo16870k(InterfaceC4785b.zy zyVar, Throwable th) {
            this.f27581k.shutdown();
        }

        @Override // com.google.common.util.concurrent.InterfaceC4785b.toq
        /* JADX INFO: renamed from: n */
        public void mo16871n(InterfaceC4785b.zy zyVar) {
            this.f27581k.shutdown();
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.y$q */
    /* JADX INFO: compiled from: AbstractScheduledService.java */
    public static abstract class q {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.y$q$k */
        /* JADX INFO: compiled from: AbstractScheduledService.java */
        static class k extends q {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ long f27588k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ long f68681toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            final /* synthetic */ TimeUnit f68682zy;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(long j2, long j3, TimeUnit timeUnit) {
                super(null);
                this.f27588k = j2;
                this.f68681toq = j3;
                this.f68682zy = timeUnit;
            }

            @Override // com.google.common.util.concurrent.AbstractC4854y.q
            public Future<?> zy(AbstractC4839s abstractC4839s, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return scheduledExecutorService.scheduleWithFixedDelay(runnable, this.f27588k, this.f68681toq, this.f68682zy);
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.y$q$toq */
        /* JADX INFO: compiled from: AbstractScheduledService.java */
        static class toq extends q {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ long f27589k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ long f68683toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            final /* synthetic */ TimeUnit f68684zy;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            toq(long j2, long j3, TimeUnit timeUnit) {
                super(null);
                this.f27589k = j2;
                this.f68683toq = j3;
                this.f68684zy = timeUnit;
            }

            @Override // com.google.common.util.concurrent.AbstractC4854y.q
            public Future<?> zy(AbstractC4839s abstractC4839s, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return scheduledExecutorService.scheduleAtFixedRate(runnable, this.f27589k, this.f68683toq, this.f68684zy);
            }
        }

        /* synthetic */ q(k kVar) {
            this();
        }

        /* JADX INFO: renamed from: k */
        public static q m17046k(long j2, long j3, TimeUnit timeUnit) {
            com.google.common.base.jk.a9(timeUnit);
            com.google.common.base.jk.m15374h(j3 > 0, "delay must be > 0, found %s", j3);
            return new k(j2, j3, timeUnit);
        }

        public static q toq(long j2, long j3, TimeUnit timeUnit) {
            com.google.common.base.jk.a9(timeUnit);
            com.google.common.base.jk.m15374h(j3 > 0, "period must be > 0, found %s", j3);
            return new toq(j2, j3, timeUnit);
        }

        abstract Future<?> zy(AbstractC4839s abstractC4839s, ScheduledExecutorService scheduledExecutorService, Runnable runnable);

        private q() {
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.y$toq */
    /* JADX INFO: compiled from: AbstractScheduledService.java */
    class toq implements ThreadFactory {
        toq() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return C4815j.n7h(AbstractC4854y.this.n7h(), runnable);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.y$zy */
    /* JADX INFO: compiled from: AbstractScheduledService.java */
    @InterfaceC7731k
    public static abstract class zy extends q {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.y$zy$k */
        /* JADX INFO: compiled from: AbstractScheduledService.java */
        private class k extends oc<Void> implements Callable<Void> {

            /* JADX INFO: renamed from: g */
            private final ReentrantLock f27591g = new ReentrantLock();

            /* JADX INFO: renamed from: k */
            private final Runnable f27592k;

            /* JADX INFO: renamed from: n */
            private final AbstractC4839s f27593n;

            /* JADX INFO: renamed from: q */
            private final ScheduledExecutorService f27594q;

            /* JADX INFO: renamed from: y */
            @NullableDecl
            @GuardedBy(com.android.thememanager.util.yz.xk5)
            private Future<Void> f27596y;

            k(AbstractC4839s abstractC4839s, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                this.f27592k = runnable;
                this.f27594q = scheduledExecutorService;
                this.f27593n = abstractC4839s;
            }

            @Override // com.google.common.util.concurrent.oc, java.util.concurrent.Future
            public boolean cancel(boolean z2) {
                this.f27591g.lock();
                try {
                    return this.f27596y.cancel(z2);
                } finally {
                    this.f27591g.unlock();
                }
            }

            @Override // com.google.common.util.concurrent.oc, java.util.concurrent.Future
            public boolean isCancelled() {
                this.f27591g.lock();
                try {
                    return this.f27596y.isCancelled();
                } finally {
                    this.f27591g.unlock();
                }
            }

            public void kja0() {
                try {
                    toq toqVarM17047q = zy.this.m17047q();
                    Throwable th = null;
                    this.f27591g.lock();
                    try {
                        Future<Void> future = this.f27596y;
                        if (future == null || !future.isCancelled()) {
                            this.f27596y = this.f27594q.schedule(this, toqVarM17047q.f27597k, toqVarM17047q.f68685toq);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    this.f27591g.unlock();
                    if (th != null) {
                        this.f27593n.m17012i(th);
                    }
                } catch (Throwable th3) {
                    this.f27593n.m17012i(th3);
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.util.concurrent.oc, com.google.common.collect.qkj8
            /* JADX INFO: renamed from: ld6 */
            public Future<? extends Void> delegate() {
                throw new UnsupportedOperationException("Only cancel and isCancelled is supported by this future");
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                this.f27592k.run();
                kja0();
                return null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.y$zy$toq */
        /* JADX INFO: compiled from: AbstractScheduledService.java */
        @InterfaceC7731k
        protected static final class toq {

            /* JADX INFO: renamed from: k */
            private final long f27597k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private final TimeUnit f68685toq;

            public toq(long j2, TimeUnit timeUnit) {
                this.f27597k = j2;
                this.f68685toq = (TimeUnit) com.google.common.base.jk.a9(timeUnit);
            }
        }

        public zy() {
            super(null);
        }

        /* JADX INFO: renamed from: q */
        protected abstract toq m17047q() throws Exception;

        @Override // com.google.common.util.concurrent.AbstractC4854y.q
        final Future<?> zy(AbstractC4839s abstractC4839s, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            k kVar = new k(abstractC4839s, scheduledExecutorService, runnable);
            kVar.kja0();
            return kVar;
        }
    }

    protected AbstractC4854y() {
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final Throwable f7l8() {
        return this.f27580k.f7l8();
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    /* JADX INFO: renamed from: g */
    public final void mo16865g() {
        this.f27580k.mo16865g();
    }

    /* JADX INFO: renamed from: h */
    protected void m17042h() throws Exception {
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final boolean isRunning() {
        return this.f27580k.isRunning();
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    /* JADX INFO: renamed from: k */
    public final void mo16866k(InterfaceC4785b.toq toqVar, Executor executor) {
        this.f27580k.mo16866k(toqVar, executor);
    }

    protected void kja0() throws Exception {
    }

    protected ScheduledExecutorService ld6() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new toq());
        mo16866k(new k(scheduledExecutorServiceNewSingleThreadScheduledExecutor), C4815j.zy());
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: n */
    public final InterfaceC4785b mo16867n() {
        this.f27580k.mo16867n();
        return this;
    }

    protected String n7h() {
        return getClass().getSimpleName();
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    /* JADX INFO: renamed from: q */
    public final void mo16868q() {
        this.f27580k.mo16868q();
    }

    protected abstract q qrj();

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final InterfaceC4785b.zy state() {
        return this.f27580k.state();
    }

    public String toString() {
        return n7h() + " [" + state() + "]";
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final void toq(long j2, TimeUnit timeUnit) throws TimeoutException {
        this.f27580k.toq(j2, timeUnit);
    }

    protected abstract void x2() throws Exception;

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: y */
    public final InterfaceC4785b mo16869y() {
        this.f27580k.mo16869y();
        return this;
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final void zy(long j2, TimeUnit timeUnit) throws TimeoutException {
        this.f27580k.zy(j2, timeUnit);
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.y$n */
    /* JADX INFO: compiled from: AbstractScheduledService.java */
    private final class n extends AbstractC4839s {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        @MonotonicNonNullDecl
        private volatile ScheduledExecutorService f68678cdj;

        /* JADX INFO: renamed from: h */
        @MonotonicNonNullDecl
        private volatile Future<?> f27582h;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private final ReentrantLock f68679ki;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private final Runnable f68680t8r;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.y$n$k */
        /* JADX INFO: compiled from: AbstractScheduledService.java */
        class k implements com.google.common.base.lvui<String> {
            k() {
            }

            @Override // com.google.common.base.lvui
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public String get() {
                return AbstractC4854y.this.n7h() + " " + n.this.state();
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.y$n$q */
        /* JADX INFO: compiled from: AbstractScheduledService.java */
        class q implements Runnable {
            q() {
            }

            @Override // java.lang.Runnable
            public void run() {
                n.this.f68679ki.lock();
                try {
                    if (n.this.f27582h.isCancelled()) {
                    } else {
                        AbstractC4854y.this.x2();
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.y$n$toq */
        /* JADX INFO: compiled from: AbstractScheduledService.java */
        class toq implements Runnable {
            toq() {
            }

            @Override // java.lang.Runnable
            public void run() {
                n.this.f68679ki.lock();
                try {
                    AbstractC4854y.this.m17042h();
                    n nVar = n.this;
                    nVar.f27582h = AbstractC4854y.this.qrj().zy(AbstractC4854y.this.f27580k, n.this.f68678cdj, n.this.f68680t8r);
                    n.this.fn3e();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.y$n$zy */
        /* JADX INFO: compiled from: AbstractScheduledService.java */
        class zy implements Runnable {
            zy() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    n.this.f68679ki.lock();
                    try {
                        if (n.this.state() != InterfaceC4785b.zy.STOPPING) {
                            return;
                        }
                        AbstractC4854y.this.kja0();
                        n.this.f68679ki.unlock();
                        n.this.zurt();
                    } finally {
                        n.this.f68679ki.unlock();
                    }
                } catch (Throwable th) {
                    n.this.m17012i(th);
                }
            }
        }

        private n() {
            this.f68679ki = new ReentrantLock();
            this.f68680t8r = new q();
        }

        @Override // com.google.common.util.concurrent.AbstractC4839s
        protected final void n7h() {
            this.f27582h.cancel(false);
            this.f68678cdj.execute(new zy());
        }

        @Override // com.google.common.util.concurrent.AbstractC4839s
        protected final void qrj() {
            this.f68678cdj = C4815j.t8r(AbstractC4854y.this.ld6(), new k());
            this.f68678cdj.execute(new toq());
        }

        @Override // com.google.common.util.concurrent.AbstractC4839s
        public String toString() {
            return AbstractC4854y.this.toString();
        }

        /* synthetic */ n(AbstractC4854y abstractC4854y, k kVar) {
            this();
        }
    }
}
