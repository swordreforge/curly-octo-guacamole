package com.google.android.exoplayer2.drm;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: UnsupportedDrmException.java */
/* JADX INFO: loaded from: classes2.dex */
public final class x9kr extends Exception {
    public static final int REASON_INSTANTIATION_ERROR = 2;
    public static final int REASON_UNSUPPORTED_SCHEME = 1;
    public final int reason;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.x9kr$k */
    /* JADX INFO: compiled from: UnsupportedDrmException.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3328k {
    }

    public x9kr(int i2) {
        this.reason = i2;
    }

    public x9kr(int i2, Exception exc) {
        super(exc);
        this.reason = i2;
    }
}
