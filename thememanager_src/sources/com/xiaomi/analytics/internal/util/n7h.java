package com.xiaomi.analytics.internal.util;

/* JADX INFO: compiled from: TimeUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class n7h {

    /* JADX INFO: renamed from: g */
    public static int f31205g = 1000;

    /* JADX INFO: renamed from: k */
    public static int f31206k = 604800000;

    /* JADX INFO: renamed from: n */
    public static int f31207n = 60000;

    /* JADX INFO: renamed from: q */
    public static int f31208q = 3600000;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static int f73061toq = 86400000;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static int f73062zy = 43200000;

    /* JADX INFO: renamed from: k */
    public static boolean m19251k(long j2, long j3) {
        return Math.abs(System.currentTimeMillis() - j2) > j3;
    }
}
