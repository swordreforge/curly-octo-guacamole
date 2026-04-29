package com.google.android.exoplayer2.util;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: RepeatModeUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class eqxt {

    /* JADX INFO: renamed from: k */
    public static final int f23178k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f66979toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f66980zy = 2;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.eqxt$k */
    /* JADX INFO: compiled from: RepeatModeUtil.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3835k {
    }

    private eqxt() {
    }

    /* JADX INFO: renamed from: k */
    public static int m13576k(int i2, int i3) {
        for (int i4 = 1; i4 <= 2; i4++) {
            int i5 = (i2 + i4) % 3;
            if (toq(i5, i3)) {
                return i5;
            }
        }
        return i2;
    }

    public static boolean toq(int i2, int i3) {
        if (i2 != 0) {
            return i2 != 1 ? i2 == 2 && (i3 & 2) != 0 : (i3 & 1) != 0;
        }
        return true;
    }
}
