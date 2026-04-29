package com.google.android.exoplayer2;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: ExoTimeoutException.java */
/* JADX INFO: loaded from: classes2.dex */
public final class gyi extends RuntimeException {
    public static final int TIMEOUT_OPERATION_DETACH_SURFACE = 3;
    public static final int TIMEOUT_OPERATION_RELEASE = 1;
    public static final int TIMEOUT_OPERATION_SET_FOREGROUND_MODE = 2;
    public static final int TIMEOUT_OPERATION_UNDEFINED = 0;
    public final int timeoutOperation;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.gyi$k */
    /* JADX INFO: compiled from: ExoTimeoutException.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3442k {
    }

    public gyi(int i2) {
        super(m12110k(i2));
        this.timeoutOperation = i2;
    }

    /* JADX INFO: renamed from: k */
    private static String m12110k(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
