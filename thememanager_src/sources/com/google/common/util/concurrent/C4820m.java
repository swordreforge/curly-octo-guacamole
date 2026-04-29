package com.google.common.util.concurrent;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.util.concurrent.m */
/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq(emulated = true)
final class C4820m {
    private C4820m() {
    }

    /* JADX INFO: renamed from: k */
    static boolean m16978k(@NullableDecl Throwable th, Class<? extends Throwable> cls) {
        return cls.isInstance(th);
    }
}
