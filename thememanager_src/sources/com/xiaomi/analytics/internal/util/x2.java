package com.xiaomi.analytics.internal.util;

import android.util.Log;

/* JADX INFO: compiled from: SystemProperties.java */
/* JADX INFO: loaded from: classes3.dex */
public class x2 {

    /* JADX INFO: renamed from: k */
    private static final String f31217k = "SystemProperties";

    /* JADX INFO: renamed from: k */
    public static String m19257k(String str) {
        return toq(str, "");
    }

    public static String toq(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception e2) {
            Log.e(C5609k.m19240k(f31217k), "get e", e2);
            return str2;
        }
    }
}
