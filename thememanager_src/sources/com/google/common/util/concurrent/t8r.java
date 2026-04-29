package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Callables.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq(emulated = true)
public final class t8r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.common.util.concurrent.t8r$k */
    /* JADX INFO: compiled from: Callables.java */
    static class CallableC4842k<T> implements Callable<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Object f27543k;

        CallableC4842k(Object obj) {
            this.f27543k = obj;
        }

        @Override // java.util.concurrent.Callable
        public T call() {
            return (T) this.f27543k;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.t8r$q */
    /* JADX INFO: compiled from: Callables.java */
    static class RunnableC4843q implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.google.common.base.lvui f27544k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Runnable f27545q;

        RunnableC4843q(com.google.common.base.lvui lvuiVar, Runnable runnable) {
            this.f27544k = lvuiVar;
            this.f27545q = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            boolean zM17014g = t8r.m17014g((String) this.f27544k.get(), threadCurrentThread);
            try {
                this.f27545q.run();
            } finally {
                if (zM17014g) {
                    t8r.m17014g(name, threadCurrentThread);
                }
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Callables.java */
    static class toq<T> implements qrj<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceExecutorServiceC4801e f27546k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Callable f68668toq;

        toq(InterfaceExecutorServiceC4801e interfaceExecutorServiceC4801e, Callable callable) {
            this.f27546k = interfaceExecutorServiceC4801e;
            this.f68668toq = callable;
        }

        @Override // com.google.common.util.concurrent.qrj
        public InterfaceFutureC4792c<T> call() throws Exception {
            return this.f27546k.submit((Callable) this.f68668toq);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Callables.java */
    static class zy<T> implements Callable<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.google.common.base.lvui f27547k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Callable f27548q;

        zy(com.google.common.base.lvui lvuiVar, Callable callable) {
            this.f27547k = lvuiVar;
            this.f27548q = callable;
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            boolean zM17014g = t8r.m17014g((String) this.f27547k.get(), threadCurrentThread);
            try {
                return (T) this.f27548q.call();
            } finally {
                if (zM17014g) {
                    t8r.m17014g(name, threadCurrentThread);
                }
            }
        }
    }

    private t8r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @wlev.zy
    /* JADX INFO: renamed from: g */
    public static boolean m17014g(String str, Thread thread) {
        try {
            thread.setName(str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @wlev.zy
    /* JADX INFO: renamed from: n */
    static <T> Callable<T> m17016n(Callable<T> callable, com.google.common.base.lvui<String> lvuiVar) {
        com.google.common.base.jk.a9(lvuiVar);
        com.google.common.base.jk.a9(callable);
        return new zy(lvuiVar, callable);
    }

    @wlev.zy
    /* JADX INFO: renamed from: q */
    static Runnable m17017q(Runnable runnable, com.google.common.base.lvui<String> lvuiVar) {
        com.google.common.base.jk.a9(lvuiVar);
        com.google.common.base.jk.a9(runnable);
        return new RunnableC4843q(lvuiVar, runnable);
    }

    @InterfaceC7731k
    @wlev.zy
    public static <T> qrj<T> toq(Callable<T> callable, InterfaceExecutorServiceC4801e interfaceExecutorServiceC4801e) {
        com.google.common.base.jk.a9(callable);
        com.google.common.base.jk.a9(interfaceExecutorServiceC4801e);
        return new toq(interfaceExecutorServiceC4801e, callable);
    }

    public static <T> Callable<T> zy(@NullableDecl T t2) {
        return new CallableC4842k(t2);
    }
}
