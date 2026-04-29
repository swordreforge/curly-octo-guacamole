package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC4837q;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: SettableFuture.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq
public final class i1<V> extends AbstractC4837q.p<V> {
    private i1() {
    }

    public static <V> i1<V> gvn7() {
        return new i1<>();
    }

    @Override // com.google.common.util.concurrent.AbstractC4837q
    @CanIgnoreReturnValue
    @InterfaceC7731k
    public boolean a9(InterfaceFutureC4792c<? extends V> interfaceFutureC4792c) {
        return super.a9(interfaceFutureC4792c);
    }

    @Override // com.google.common.util.concurrent.AbstractC4837q
    @CanIgnoreReturnValue
    public boolean jk(Throwable th) {
        return super.jk(th);
    }

    @Override // com.google.common.util.concurrent.AbstractC4837q
    @CanIgnoreReturnValue
    public boolean mcp(@NullableDecl V v2) {
        return super.mcp(v2);
    }
}
