package com.xiaomi.accountsdk.futureservice;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.futureservice.k */
/* JADX INFO: compiled from: ClientFuture.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5505k<ServerDataType, ClientDataType> extends FutureTask<ClientDataType> {

    /* JADX INFO: renamed from: q */
    private static final String f30811q = "ClientFuture";

    /* JADX INFO: renamed from: k */
    private final zy<ClientDataType> f30812k;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.futureservice.k$k */
    /* JADX INFO: compiled from: ClientFuture.java */
    class k implements Callable<ClientDataType> {
        k() {
        }

        @Override // java.util.concurrent.Callable
        public ClientDataType call() throws Exception {
            throw new IllegalStateException("this should never be called");
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.futureservice.k$toq */
    /* JADX INFO: compiled from: ClientFuture.java */
    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5505k.this.f30812k.mo18836k(AbstractC5505k.this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.futureservice.k$zy */
    /* JADX INFO: compiled from: ClientFuture.java */
    public interface zy<ClientSideDataType> {
        /* JADX INFO: renamed from: k */
        void mo18836k(AbstractC5505k<?, ClientSideDataType> abstractC5505k);
    }

    protected AbstractC5505k(zy<ClientDataType> zyVar) {
        super(new k());
        this.f30812k = zyVar;
    }

    /* JADX INFO: renamed from: g */
    private void m18830g() {
        if (isCancelled() || this.f30812k == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new toq());
    }

    /* JADX INFO: renamed from: q */
    private void m18832q() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null || looperMyLooper != Looper.getMainLooper()) {
            return;
        }
        Log.e(f30811q, "calling this from your main thread can lead to deadlock and/or ANRs", new IllegalStateException("ClientFuture#calling this from your main thread can lead to deadlock"));
    }

    @Override // java.util.concurrent.FutureTask
    protected void done() {
        super.done();
        m18830g();
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public ClientDataType get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            m18832q();
        }
        return (ClientDataType) super.get();
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo18833n(ExecutionException executionException) throws Exception;

    /* JADX INFO: renamed from: s */
    public final void m18834s(Throwable th) {
        setException(th);
    }

    protected abstract ClientDataType toq(ServerDataType serverdatatype) throws Throwable;

    /* JADX INFO: renamed from: y */
    public final void m18835y(ServerDataType serverdatatype) {
        try {
            set(toq(serverdatatype));
        } catch (Throwable th) {
            setException(th);
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public ClientDataType get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            m18832q();
        }
        return (ClientDataType) super.get(j2, timeUnit);
    }
}
