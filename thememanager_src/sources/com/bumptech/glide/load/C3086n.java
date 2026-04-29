package com.bumptech.glide.load;

import java.io.IOException;
import zy.dd;

/* JADX INFO: renamed from: com.bumptech.glide.load.n */
/* JADX INFO: compiled from: HttpException.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3086n extends IOException {
    public static final int UNKNOWN = -1;
    private static final long serialVersionUID = 1;
    private final int statusCode;

    public C3086n(int i2) {
        this("Http request failed", i2);
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    @Deprecated
    public C3086n(String str) {
        this(str, -1);
    }

    public C3086n(String str, int i2) {
        this(str, i2, null);
    }

    public C3086n(String str, int i2, @dd Throwable th) {
        super(str + ", status code: " + i2, th);
        this.statusCode = i2;
    }
}
