package com.google.common.base;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: VerifyException.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public class n5r1 extends RuntimeException {
    public n5r1() {
    }

    public n5r1(@NullableDecl String str) {
        super(str);
    }

    public n5r1(@NullableDecl Throwable th) {
        super(th);
    }

    public n5r1(@NullableDecl String str, @NullableDecl Throwable th) {
        super(str, th);
    }
}
