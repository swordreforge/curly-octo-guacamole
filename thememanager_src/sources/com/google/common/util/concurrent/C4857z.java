package com.google.common.util.concurrent;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.util.concurrent.z */
/* JADX INFO: compiled from: ExecutionError.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq
public class C4857z extends Error {
    private static final long serialVersionUID = 0;

    protected C4857z() {
    }

    protected C4857z(@NullableDecl String str) {
        super(str);
    }

    public C4857z(@NullableDecl String str, @NullableDecl Error error) {
        super(str, error);
    }

    public C4857z(@NullableDecl Error error) {
        super(error);
    }
}
