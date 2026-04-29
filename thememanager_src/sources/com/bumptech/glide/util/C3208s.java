package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.bumptech.glide.util.s */
/* JADX INFO: compiled from: LogTime.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3208s {

    /* JADX INFO: renamed from: k */
    private static final double f19097k = 1.0d / Math.pow(10.0d, 6.0d);

    private C3208s() {
    }

    /* JADX INFO: renamed from: k */
    public static double m11263k(long j2) {
        return (toq() - j2) * f19097k;
    }

    @TargetApi(17)
    public static long toq() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
