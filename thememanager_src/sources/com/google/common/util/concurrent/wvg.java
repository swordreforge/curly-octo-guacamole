package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ExecutionSequencer.java */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7731k
public final class wvg {

    /* JADX INFO: renamed from: k */
    private final AtomicReference<InterfaceFutureC4792c<Object>> f27556k = new AtomicReference<>(dd.n7h(null));

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.util.concurrent.wvg$k */
    /* JADX INFO: compiled from: ExecutionSequencer.java */
    class C4846k<T> implements qrj<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Callable f27557k;

        C4846k(Callable callable) {
            this.f27557k = callable;
        }

        @Override // com.google.common.util.concurrent.qrj
        public InterfaceFutureC4792c<T> call() throws Exception {
            return dd.n7h(this.f27557k.call());
        }

        public String toString() {
            return this.f27557k.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.wvg$n */
    /* JADX INFO: compiled from: ExecutionSequencer.java */
    enum EnumC4847n {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.wvg$q */
    /* JADX INFO: compiled from: ExecutionSequencer.java */
    class RunnableC4848q implements Runnable {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ i1 f27559g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceFutureC4792c f27560k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ AtomicReference f27561n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceFutureC4792c f27562q;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceFutureC4792c f27564y;

        RunnableC4848q(InterfaceFutureC4792c interfaceFutureC4792c, InterfaceFutureC4792c interfaceFutureC4792c2, AtomicReference atomicReference, i1 i1Var, InterfaceFutureC4792c interfaceFutureC4792c3) {
            this.f27560k = interfaceFutureC4792c;
            this.f27562q = interfaceFutureC4792c2;
            this.f27561n = atomicReference;
            this.f27559g = i1Var;
            this.f27564y = interfaceFutureC4792c3;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f27560k.isDone() || (this.f27562q.isCancelled() && androidx.lifecycle.zurt.m4493k(this.f27561n, EnumC4847n.NOT_RUN, EnumC4847n.CANCELLED))) {
                this.f27559g.a9(this.f27564y);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ExecutionSequencer.java */
    class toq<T> implements qrj<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ AtomicReference f27565k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ qrj f68672toq;

        toq(AtomicReference atomicReference, qrj qrjVar) {
            this.f27565k = atomicReference;
            this.f68672toq = qrjVar;
        }

        @Override // com.google.common.util.concurrent.qrj
        public InterfaceFutureC4792c<T> call() throws Exception {
            return !androidx.lifecycle.zurt.m4493k(this.f27565k, EnumC4847n.NOT_RUN, EnumC4847n.STARTED) ? dd.m16911p() : this.f68672toq.call();
        }

        public String toString() {
            return this.f68672toq.toString();
        }
    }

    /* JADX INFO: compiled from: ExecutionSequencer.java */
    class zy implements Executor {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceFutureC4792c f27566k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Executor f27568q;

        zy(InterfaceFutureC4792c interfaceFutureC4792c, Executor executor) {
            this.f27566k = interfaceFutureC4792c;
            this.f27568q = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f27566k.n7h(runnable, this.f27568q);
        }
    }

    private wvg() {
    }

    /* JADX INFO: renamed from: k */
    public static wvg m17024k() {
        return new wvg();
    }

    public <T> InterfaceFutureC4792c<T> toq(Callable<T> callable, Executor executor) {
        com.google.common.base.jk.a9(callable);
        return zy(new C4846k(callable), executor);
    }

    public <T> InterfaceFutureC4792c<T> zy(qrj<T> qrjVar, Executor executor) {
        com.google.common.base.jk.a9(qrjVar);
        AtomicReference atomicReference = new AtomicReference(EnumC4847n.NOT_RUN);
        toq toqVar = new toq(atomicReference, qrjVar);
        i1 i1VarGvn7 = i1.gvn7();
        InterfaceFutureC4792c<Object> andSet = this.f27556k.getAndSet(i1VarGvn7);
        InterfaceFutureC4792c interfaceFutureC4792cM16908i = dd.m16908i(toqVar, new zy(andSet, executor));
        InterfaceFutureC4792c<T> interfaceFutureC4792cKi = dd.ki(interfaceFutureC4792cM16908i);
        RunnableC4848q runnableC4848q = new RunnableC4848q(interfaceFutureC4792cM16908i, interfaceFutureC4792cKi, atomicReference, i1VarGvn7, andSet);
        interfaceFutureC4792cKi.n7h(runnableC4848q, C4815j.zy());
        interfaceFutureC4792cM16908i.n7h(runnableC4848q, C4815j.zy());
        return interfaceFutureC4792cKi;
    }
}
