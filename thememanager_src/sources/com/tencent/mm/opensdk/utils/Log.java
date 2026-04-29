package com.tencent.mm.opensdk.utils;

/* JADX INFO: loaded from: classes3.dex */
public class Log {
    private static ILog logImpl;

    /* JADX INFO: renamed from: d */
    public static void m18252d(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            android.util.Log.d(str, str2);
        } else {
            iLog.m18247d(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m18253e(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            android.util.Log.e(str, str2);
        } else {
            iLog.m18248e(str, str2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m18254i(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            android.util.Log.i(str, str2);
        } else {
            iLog.m18249i(str, str2);
        }
    }

    public static void setLogImpl(ILog iLog) {
        logImpl = iLog;
    }

    /* JADX INFO: renamed from: v */
    public static void m18255v(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            android.util.Log.v(str, str2);
        } else {
            iLog.m18250v(str, str2);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m18256w(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            android.util.Log.w(str, str2);
        } else {
            iLog.m18251w(str, str2);
        }
    }
}
