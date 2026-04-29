package com.google.common.util.concurrent;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.Exception;
import java.util.concurrent.TimeUnit;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.util.concurrent.i */
/* JADX INFO: compiled from: CheckedFuture.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq
@InterfaceC7731k
@Deprecated
@CanIgnoreReturnValue
public interface InterfaceC4813i<V, X extends Exception> extends InterfaceFutureC4792c<V> {
    V f7l8(long j2, TimeUnit timeUnit) throws Exception;

    V zy() throws Exception;
}
