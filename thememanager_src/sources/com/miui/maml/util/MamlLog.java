package com.miui.maml.util;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class MamlLog {
    public static int LOG_LEVEL = 5;

    private MamlLog() {
    }

    /* JADX INFO: renamed from: d */
    public static void m17850d(String str, String str2) {
        if (3 >= LOG_LEVEL) {
            Log.d(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m17851e(String str, String str2) {
        if (6 >= LOG_LEVEL) {
            Log.e(str, str2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m17853i(String str, String str2) {
        if (4 >= LOG_LEVEL) {
            Log.i(str, str2);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m17854w(String str, String str2) {
        if (5 >= LOG_LEVEL) {
            Log.w(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m17852e(String str, String str2, Throwable th) {
        if (6 >= LOG_LEVEL) {
            Log.e(str, str2, th);
        }
    }
}
