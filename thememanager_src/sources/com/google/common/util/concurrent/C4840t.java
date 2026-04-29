package com.google.common.util.concurrent;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.util.concurrent.t */
/* JADX INFO: compiled from: FakeTimeLimiter.java */
/* JADX INFO: loaded from: classes3.dex */
@CanIgnoreReturnValue
@InterfaceC7731k
@wlev.zy
public final class C4840t implements nmn5 {
    @Override // com.google.common.util.concurrent.nmn5
    /* JADX INFO: renamed from: k */
    public void mo16862k(Runnable runnable, long j2, TimeUnit timeUnit) {
        com.google.common.base.jk.a9(runnable);
        com.google.common.base.jk.a9(timeUnit);
        try {
            runnable.run();
        } catch (Error e2) {
            throw new C4857z(e2);
        } catch (RuntimeException e3) {
            throw new bo(e3);
        } catch (Throwable th) {
            throw new bo(th);
        }
    }

    @Override // com.google.common.util.concurrent.nmn5
    /* JADX INFO: renamed from: n */
    public <T> T mo16863n(Callable<T> callable, long j2, TimeUnit timeUnit) throws ExecutionException {
        com.google.common.base.jk.a9(callable);
        com.google.common.base.jk.a9(timeUnit);
        try {
            return callable.call();
        } catch (Error e2) {
            throw new C4857z(e2);
        } catch (RuntimeException e3) {
            throw new bo(e3);
        } catch (Exception e4) {
            throw new ExecutionException(e4);
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }

    @Override // com.google.common.util.concurrent.nmn5
    /* JADX INFO: renamed from: q */
    public <T> T mo16864q(Callable<T> callable, long j2, TimeUnit timeUnit) throws ExecutionException {
        return (T) mo16863n(callable, j2, timeUnit);
    }

    @Override // com.google.common.util.concurrent.nmn5
    public <T> T toq(T t2, Class<T> cls, long j2, TimeUnit timeUnit) {
        com.google.common.base.jk.a9(t2);
        com.google.common.base.jk.a9(cls);
        com.google.common.base.jk.a9(timeUnit);
        return t2;
    }

    @Override // com.google.common.util.concurrent.nmn5
    public void zy(Runnable runnable, long j2, TimeUnit timeUnit) {
        mo16862k(runnable, j2, timeUnit);
    }
}
