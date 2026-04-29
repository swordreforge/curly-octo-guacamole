package com.market.sdk.compat;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: FutureTaskCompat.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq<V> extends FutureTask<V> {

    /* JADX INFO: renamed from: k */
    private static final String f28035k = "FutureTaskCompat";

    /* JADX INFO: renamed from: com.market.sdk.compat.toq$k */
    /* JADX INFO: compiled from: FutureTaskCompat.java */
    class CallableC4968k implements Callable<V> {
        CallableC4968k() {
        }

        @Override // java.util.concurrent.Callable
        public V call() throws Exception {
            throw new IllegalStateException("this should never be called");
        }
    }

    public toq(Callable<V> callable) {
        super(callable);
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public V get() {
        try {
            return (V) super.get();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public V m17301k(long j2, V v2) {
        try {
            return (V) super.get(j2, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
            return v2;
        }
    }

    @Override // java.util.concurrent.FutureTask
    public void set(V v2) {
        super.set(v2);
    }

    public toq() {
        super(new CallableC4968k());
    }
}
