package com.xiaomi.onetrack.util;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class ab {

    /* JADX INFO: renamed from: a */
    private static final String f32264a = "SystemProperties";

    /* JADX INFO: renamed from: a */
    public static String m20219a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Throwable th) {
            Log.e(C5804p.m20340a(f32264a), "get e" + th.getMessage());
            return str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m20218a(String str) {
        return m20219a(str, "");
    }

    /* JADX INFO: renamed from: a */
    public static long m20217a(String str, Long l2) {
        try {
            return ((Long) Class.forName("android.os.SystemProperties").getMethod("getLong", String.class, Long.TYPE).invoke(null, str, l2)).longValue();
        } catch (Throwable th) {
            Log.e(C5804p.m20340a(f32264a), "getLong e" + th.getMessage());
            return l2.longValue();
        }
    }
}
