package com.xiaomi.accountsdk.futureservice;

import android.os.AsyncTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: MiAccountManagerFuture.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class toq<V> extends AbstractC5505k<V, V> {

    /* JADX INFO: renamed from: n */
    private static Executor f30814n = AsyncTask.THREAD_POOL_EXECUTOR;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.futureservice.toq$k */
    /* JADX INFO: compiled from: MiAccountManagerFuture.java */
    class RunnableC5507k implements Runnable {
        RunnableC5507k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                toq toqVar = toq.this;
                toqVar.m18835y(toqVar.mo18837p());
            } catch (Throwable th) {
                toq.this.m18834s(th);
            }
        }
    }

    protected toq() {
        super(null);
    }

    public toq<V> ld6() {
        f30814n.execute(new RunnableC5507k());
        return this;
    }

    @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k
    /* JADX INFO: renamed from: n */
    public void mo18833n(ExecutionException executionException) throws Exception {
        throw new IllegalStateException("not going here");
    }

    /* JADX INFO: renamed from: p */
    public abstract V mo18837p();

    @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k
    protected V toq(V v2) throws Throwable {
        return v2;
    }
}
