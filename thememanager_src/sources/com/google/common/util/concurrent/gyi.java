package com.google.common.util.concurrent;

import com.google.common.collect.se;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: WrappingExecutorService.java */
/* JADX INFO: loaded from: classes3.dex */
@CanIgnoreReturnValue
@wlev.zy
abstract class gyi implements ExecutorService {

    /* JADX INFO: renamed from: k */
    private final ExecutorService f27438k;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.gyi$k */
    /* JADX INFO: compiled from: WrappingExecutorService.java */
    class RunnableC4809k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Callable f27439k;

        RunnableC4809k(Callable callable) {
            this.f27439k = callable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f27439k.call();
            } catch (Exception e2) {
                com.google.common.base.dd.ni7(e2);
                throw new RuntimeException(e2);
            }
        }
    }

    protected gyi(ExecutorService executorService) {
        this.f27438k = (ExecutorService) com.google.common.base.jk.a9(executorService);
    }

    private <T> se<Callable<T>> zy(Collection<? extends Callable<T>> collection) {
        se.C4520k c4520kBuilder = se.builder();
        Iterator<? extends Callable<T>> it = collection.iterator();
        while (it.hasNext()) {
            c4520kBuilder.mo15569k(toq(it.next()));
        }
        return c4520kBuilder.mo15570n();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
        return this.f27438k.awaitTermination(j2, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f27438k.execute(mo16937k(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f27438k.invokeAll(zy(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f27438k.invokeAny(zy(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f27438k.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f27438k.isTerminated();
    }

    /* JADX INFO: renamed from: k */
    protected Runnable mo16937k(Runnable runnable) {
        return new RunnableC4809k(toq(Executors.callable(runnable, null)));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f27438k.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f27438k.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f27438k.submit(toq((Callable) com.google.common.base.jk.a9(callable)));
    }

    protected abstract <T> Callable<T> toq(Callable<T> callable);

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException {
        return this.f27438k.invokeAll(zy(collection), j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f27438k.invokeAny(zy(collection), j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f27438k.submit(mo16937k(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t2) {
        return this.f27438k.submit(mo16937k(runnable), t2);
    }
}
