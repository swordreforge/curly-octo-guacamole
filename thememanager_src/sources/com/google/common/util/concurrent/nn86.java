package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ListeningScheduledExecutorService.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.zy
public interface nn86 extends ScheduledExecutorService, InterfaceExecutorServiceC4801e {
    @Override // java.util.concurrent.ScheduledExecutorService
    uv6<?> schedule(Runnable runnable, long j2, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    <V> uv6<V> schedule(Callable<V> callable, long j2, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    uv6<?> scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    uv6<?> scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit);
}
