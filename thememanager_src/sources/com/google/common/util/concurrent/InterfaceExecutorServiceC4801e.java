package com.google.common.util.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.common.util.concurrent.e */
/* JADX INFO: compiled from: ListeningExecutorService.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.zy
public interface InterfaceExecutorServiceC4801e extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException;

    @Override // java.util.concurrent.ExecutorService
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException;

    InterfaceFutureC4792c<?> submit(Runnable runnable);

    <T> InterfaceFutureC4792c<T> submit(Runnable runnable, T t2);

    <T> InterfaceFutureC4792c<T> submit(Callable<T> callable);
}
