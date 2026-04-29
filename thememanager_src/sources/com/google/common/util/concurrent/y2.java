package com.google.common.util.concurrent;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: UncheckedTimeoutException.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.zy
public class y2 extends RuntimeException {
    private static final long serialVersionUID = 0;

    public y2() {
    }

    public y2(@NullableDecl String str) {
        super(str);
    }

    public y2(@NullableDecl Throwable th) {
        super(th);
    }

    public y2(@NullableDecl String str, @NullableDecl Throwable th) {
        super(str, th);
    }
}
