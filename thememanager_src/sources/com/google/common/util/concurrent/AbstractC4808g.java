package com.google.common.util.concurrent;

import com.google.common.util.concurrent.InterfaceC4785b;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.util.concurrent.g */
/* JADX INFO: compiled from: AbstractIdleService.java */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7731k
@wlev.zy
public abstract class AbstractC4808g implements InterfaceC4785b {

    /* JADX INFO: renamed from: k */
    private final com.google.common.base.lvui<String> f27432k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final InterfaceC4785b f68632toq;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.g$k */
    /* JADX INFO: compiled from: AbstractIdleService.java */
    class k implements Executor {
        k() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C4815j.n7h((String) AbstractC4808g.this.f27432k.get(), runnable).start();
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.g$toq */
    /* JADX INFO: compiled from: AbstractIdleService.java */
    private final class toq extends AbstractC4839s {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.g$toq$k */
        /* JADX INFO: compiled from: AbstractIdleService.java */
        class k implements Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    AbstractC4808g.this.qrj();
                    toq.this.fn3e();
                } catch (Throwable th) {
                    toq.this.m17012i(th);
                }
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.g$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractIdleService.java */
        class RunnableC8018toq implements Runnable {
            RunnableC8018toq() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    AbstractC4808g.this.x2();
                    toq.this.zurt();
                } catch (Throwable th) {
                    toq.this.m17012i(th);
                }
            }
        }

        private toq() {
        }

        @Override // com.google.common.util.concurrent.AbstractC4839s
        protected final void n7h() {
            C4815j.cdj(AbstractC4808g.this.m16935p(), AbstractC4808g.this.f27432k).execute(new RunnableC8018toq());
        }

        @Override // com.google.common.util.concurrent.AbstractC4839s
        protected final void qrj() {
            C4815j.cdj(AbstractC4808g.this.m16935p(), AbstractC4808g.this.f27432k).execute(new k());
        }

        @Override // com.google.common.util.concurrent.AbstractC4839s
        public String toString() {
            return AbstractC4808g.this.toString();
        }

        /* synthetic */ toq(AbstractC4808g abstractC4808g, k kVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.g$zy */
    /* JADX INFO: compiled from: AbstractIdleService.java */
    private final class zy implements com.google.common.base.lvui<String> {
        private zy() {
        }

        @Override // com.google.common.base.lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String get() {
            return AbstractC4808g.this.ld6() + " " + AbstractC4808g.this.state();
        }

        /* synthetic */ zy(AbstractC4808g abstractC4808g, k kVar) {
            this();
        }
    }

    protected AbstractC4808g() {
        k kVar = null;
        this.f27432k = new zy(this, kVar);
        this.f68632toq = new toq(this, kVar);
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final Throwable f7l8() {
        return this.f68632toq.f7l8();
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    /* JADX INFO: renamed from: g */
    public final void mo16865g() {
        this.f68632toq.mo16865g();
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final boolean isRunning() {
        return this.f68632toq.isRunning();
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    /* JADX INFO: renamed from: k */
    public final void mo16866k(InterfaceC4785b.toq toqVar, Executor executor) {
        this.f68632toq.mo16866k(toqVar, executor);
    }

    protected String ld6() {
        return getClass().getSimpleName();
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: n */
    public final InterfaceC4785b mo16867n() {
        this.f68632toq.mo16867n();
        return this;
    }

    /* JADX INFO: renamed from: p */
    protected Executor m16935p() {
        return new k();
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    /* JADX INFO: renamed from: q */
    public final void mo16868q() {
        this.f68632toq.mo16868q();
    }

    protected abstract void qrj() throws Exception;

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final InterfaceC4785b.zy state() {
        return this.f68632toq.state();
    }

    public String toString() {
        return ld6() + " [" + state() + "]";
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final void toq(long j2, TimeUnit timeUnit) throws TimeoutException {
        this.f68632toq.toq(j2, timeUnit);
    }

    protected abstract void x2() throws Exception;

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: y */
    public final InterfaceC4785b mo16869y() {
        this.f68632toq.mo16869y();
        return this;
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final void zy(long j2, TimeUnit timeUnit) throws TimeoutException {
        this.f68632toq.zy(j2, timeUnit);
    }
}
