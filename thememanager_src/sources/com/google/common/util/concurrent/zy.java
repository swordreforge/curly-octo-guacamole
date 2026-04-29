package com.google.common.util.concurrent;

import com.google.common.util.concurrent.InterfaceC4785b;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: AbstractExecutionThreadService.java */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7731k
@wlev.zy
public abstract class zy implements InterfaceC4785b {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Logger f68691toq = Logger.getLogger(zy.class.getName());

    /* JADX INFO: renamed from: k */
    private final InterfaceC4785b f27627k = new C4868k();

    /* JADX INFO: renamed from: com.google.common.util.concurrent.zy$k */
    /* JADX INFO: compiled from: AbstractExecutionThreadService.java */
    class C4868k extends AbstractC4839s {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.zy$k$k */
        /* JADX INFO: compiled from: AbstractExecutionThreadService.java */
        class k implements com.google.common.base.lvui<String> {
            k() {
            }

            @Override // com.google.common.base.lvui
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public String get() {
                return zy.this.x2();
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.zy$k$toq */
        /* JADX INFO: compiled from: AbstractExecutionThreadService.java */
        class toq implements Runnable {
            toq() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    zy.this.n7h();
                    C4868k.this.fn3e();
                    if (C4868k.this.isRunning()) {
                        try {
                            zy.this.ld6();
                        } catch (Throwable th) {
                            try {
                                zy.this.qrj();
                            } catch (Exception e2) {
                                zy.f68691toq.log(Level.WARNING, "Error while attempting to shut down the service after failure.", (Throwable) e2);
                            }
                            C4868k.this.m17012i(th);
                            return;
                        }
                    }
                    zy.this.qrj();
                    C4868k.this.zurt();
                } catch (Throwable th2) {
                    C4868k.this.m17012i(th2);
                }
            }
        }

        C4868k() {
        }

        @Override // com.google.common.util.concurrent.AbstractC4839s
        protected void n7h() {
            zy.this.kja0();
        }

        @Override // com.google.common.util.concurrent.AbstractC4839s
        protected final void qrj() {
            C4815j.cdj(zy.this.m17069p(), new k()).execute(new toq());
        }

        @Override // com.google.common.util.concurrent.AbstractC4839s
        public String toString() {
            return zy.this.toString();
        }
    }

    /* JADX INFO: compiled from: AbstractExecutionThreadService.java */
    class toq implements Executor {
        toq() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C4815j.n7h(zy.this.x2(), runnable).start();
        }
    }

    protected zy() {
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final Throwable f7l8() {
        return this.f27627k.f7l8();
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    /* JADX INFO: renamed from: g */
    public final void mo16865g() {
        this.f27627k.mo16865g();
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final boolean isRunning() {
        return this.f27627k.isRunning();
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    /* JADX INFO: renamed from: k */
    public final void mo16866k(InterfaceC4785b.toq toqVar, Executor executor) {
        this.f27627k.mo16866k(toqVar, executor);
    }

    protected void kja0() {
    }

    protected abstract void ld6() throws Exception;

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: n */
    public final InterfaceC4785b mo16867n() {
        this.f27627k.mo16867n();
        return this;
    }

    protected void n7h() throws Exception {
    }

    /* JADX INFO: renamed from: p */
    protected Executor m17069p() {
        return new toq();
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    /* JADX INFO: renamed from: q */
    public final void mo16868q() {
        this.f27627k.mo16868q();
    }

    protected void qrj() throws Exception {
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final InterfaceC4785b.zy state() {
        return this.f27627k.state();
    }

    public String toString() {
        return x2() + " [" + state() + "]";
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final void toq(long j2, TimeUnit timeUnit) throws TimeoutException {
        this.f27627k.toq(j2, timeUnit);
    }

    protected String x2() {
        return getClass().getSimpleName();
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: y */
    public final InterfaceC4785b mo16869y() {
        this.f27627k.mo16869y();
        return this;
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final void zy(long j2, TimeUnit timeUnit) throws TimeoutException {
        this.f27627k.zy(j2, timeUnit);
    }
}
