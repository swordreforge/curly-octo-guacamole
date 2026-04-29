package com.google.common.util.concurrent;

import com.google.common.util.concurrent.eqxt;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: AbstractCheckedFuture.java */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7731k
@wlev.zy
@Deprecated
public abstract class toq<V, X extends Exception> extends eqxt.AbstractC4803k<V> implements InterfaceC4813i<V, X> {
    protected toq(InterfaceFutureC4792c<V> interfaceFutureC4792c) {
        super(interfaceFutureC4792c);
    }

    @Override // com.google.common.util.concurrent.InterfaceC4813i
    @CanIgnoreReturnValue
    public V f7l8(long j2, TimeUnit timeUnit) throws Exception {
        try {
            return get(j2, timeUnit);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw kja0(e2);
        } catch (CancellationException e3) {
            e = e3;
            throw kja0(e);
        } catch (ExecutionException e4) {
            e = e4;
            throw kja0(e);
        }
    }

    protected abstract X kja0(Exception exc);

    @Override // com.google.common.util.concurrent.InterfaceC4813i
    @CanIgnoreReturnValue
    public V zy() throws Exception {
        try {
            return get();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw kja0(e2);
        } catch (CancellationException e3) {
            e = e3;
            throw kja0(e);
        } catch (ExecutionException e4) {
            e = e4;
            throw kja0(e);
        }
    }
}
