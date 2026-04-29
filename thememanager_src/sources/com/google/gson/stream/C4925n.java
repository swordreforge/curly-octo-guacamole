package com.google.gson.stream;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.gson.stream.n */
/* JADX INFO: compiled from: MalformedJsonException.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C4925n extends IOException {
    private static final long serialVersionUID = 1;

    public C4925n(String str) {
        super(str);
    }

    public C4925n(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    public C4925n(Throwable th) {
        initCause(th);
    }
}
