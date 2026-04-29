package com.xiaomi.push;

/* JADX INFO: loaded from: classes3.dex */
public final class h4b {

    /* JADX INFO: renamed from: k */
    static final int f32997k = toq(1, 3);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final int f73348toq = toq(1, 4);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    static final int f73349zy = toq(2, 0);

    /* JADX INFO: renamed from: q */
    static final int f32998q = toq(3, 2);

    /* JADX INFO: renamed from: k */
    static int m20946k(int i2) {
        return i2 & 7;
    }

    static int toq(int i2, int i3) {
        return (i2 << 3) | i3;
    }

    public static int zy(int i2) {
        return i2 >>> 3;
    }
}
