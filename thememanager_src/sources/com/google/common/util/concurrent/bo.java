package com.google.common.util.concurrent;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: UncheckedExecutionException.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq
public class bo extends RuntimeException {
    private static final long serialVersionUID = 0;

    protected bo() {
    }

    protected bo(@NullableDecl String str) {
        super(str);
    }

    public bo(@NullableDecl String str, @NullableDecl Throwable th) {
        super(str, th);
    }

    public bo(@NullableDecl Throwable th) {
        super(th);
    }
}
