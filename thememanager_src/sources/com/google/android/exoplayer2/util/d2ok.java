package com.google.android.exoplayer2.util;

import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: RunnableFutureTask.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d2ok<R, E extends Exception> implements RunnableFuture<R> {

    /* JADX INFO: renamed from: g */
    @zy.dd
    private Exception f23169g;

    /* JADX INFO: renamed from: p */
    private boolean f23172p;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private Thread f23174s;

    /* JADX INFO: renamed from: y */
    @zy.dd
    private R f23175y;

    /* JADX INFO: renamed from: k */
    private final C3862y f23170k = new C3862y();

    /* JADX INFO: renamed from: q */
    private final C3862y f23173q = new C3862y();

    /* JADX INFO: renamed from: n */
    private final Object f23171n = new Object();

    protected d2ok() {
    }

    @hyr
    /* JADX INFO: renamed from: g */
    private R m13564g() throws ExecutionException {
        if (this.f23172p) {
            throw new CancellationException();
        }
        if (this.f23169g == null) {
            return this.f23175y;
        }
        throw new ExecutionException(this.f23169g);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        synchronized (this.f23171n) {
            if (!this.f23172p && !this.f23173q.m13764n()) {
                this.f23172p = true;
                mo12375q();
                Thread thread = this.f23174s;
                if (thread == null) {
                    this.f23170k.m13762g();
                    this.f23173q.m13762g();
                } else if (z2) {
                    thread.interrupt();
                }
                return true;
            }
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    @hyr
    public final R get() throws ExecutionException, InterruptedException {
        this.f23173q.m13763k();
        return m13564g();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f23172p;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f23173q.m13764n();
    }

    /* JADX INFO: renamed from: k */
    public final void m13565k() {
        this.f23173q.zy();
    }

    @hyr
    /* JADX INFO: renamed from: n */
    protected abstract R mo12373n() throws Exception;

    /* JADX INFO: renamed from: q */
    protected void mo12375q() {
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f23171n) {
            if (this.f23172p) {
                return;
            }
            this.f23174s = Thread.currentThread();
            this.f23170k.m13762g();
            try {
                try {
                    this.f23175y = mo12373n();
                    synchronized (this.f23171n) {
                        this.f23173q.m13762g();
                        this.f23174s = null;
                        Thread.interrupted();
                    }
                } catch (Exception e2) {
                    this.f23169g = e2;
                    synchronized (this.f23171n) {
                        this.f23173q.m13762g();
                        this.f23174s = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th) {
                synchronized (this.f23171n) {
                    this.f23173q.m13762g();
                    this.f23174s = null;
                    Thread.interrupted();
                    throw th;
                }
            }
        }
    }

    public final void toq() {
        this.f23170k.zy();
    }

    @Override // java.util.concurrent.Future
    @hyr
    public final R get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f23173q.toq(TimeUnit.MILLISECONDS.convert(j2, timeUnit))) {
            return m13564g();
        }
        throw new TimeoutException();
    }
}
