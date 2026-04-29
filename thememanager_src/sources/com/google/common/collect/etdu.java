package com.google.common.collect;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: Hashing.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
final class etdu {

    /* JADX INFO: renamed from: k */
    private static final long f26094k = -862048943;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final long f68191toq = 461845907;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f68192zy = 1073741824;

    private etdu() {
    }

    /* JADX INFO: renamed from: k */
    static int m15652k(int i2, double d2) {
        int iMax = Math.max(i2, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d2 * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i3 = iHighestOneBit << 1;
        if (i3 > 0) {
            return i3;
        }
        return 1073741824;
    }

    /* JADX INFO: renamed from: q */
    static int m15653q(@NullableDecl Object obj) {
        return zy(obj == null ? 0 : obj.hashCode());
    }

    static boolean toq(int i2, int i3, double d2) {
        return ((double) i2) > d2 * ((double) i3) && i3 < 1073741824;
    }

    static int zy(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * f26094k), 15)) * f68191toq);
    }
}
