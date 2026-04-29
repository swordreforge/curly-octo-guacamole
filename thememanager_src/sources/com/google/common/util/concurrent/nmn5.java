package com.google.common.util.concurrent;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: TimeLimiter.java */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7731k
@wlev.zy
public interface nmn5 {
    /* JADX INFO: renamed from: k */
    void mo16862k(Runnable runnable, long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException;

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: n */
    <T> T mo16863n(Callable<T> callable, long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException;

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: q */
    <T> T mo16864q(Callable<T> callable, long j2, TimeUnit timeUnit) throws ExecutionException, TimeoutException;

    <T> T toq(T t2, Class<T> cls, long j2, TimeUnit timeUnit);

    void zy(Runnable runnable, long j2, TimeUnit timeUnit) throws TimeoutException;
}
