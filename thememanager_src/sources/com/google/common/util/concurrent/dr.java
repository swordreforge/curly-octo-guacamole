package com.google.common.util.concurrent;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: WrappingScheduledExecutorService.java */
/* JADX INFO: loaded from: classes3.dex */
@CanIgnoreReturnValue
@wlev.zy
abstract class dr extends gyi implements ScheduledExecutorService {

    /* JADX INFO: renamed from: q */
    final ScheduledExecutorService f27416q;

    protected dr(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f27416q = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.f27416q.schedule(mo16937k(runnable), j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        return this.f27416q.scheduleAtFixedRate(mo16937k(runnable), j2, j3, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        return this.f27416q.scheduleWithFixedDelay(mo16937k(runnable), j2, j3, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j2, TimeUnit timeUnit) {
        return this.f27416q.schedule(toq(callable), j2, timeUnit);
    }
}
