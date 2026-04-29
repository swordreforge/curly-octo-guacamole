package com.xiaomi.analytics.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: renamed from: com.xiaomi.analytics.internal.util.y */
/* JADX INFO: compiled from: MIUI.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5614y {

    /* JADX INFO: renamed from: k */
    private static final String f31218k = "MIUI";

    public static boolean f7l8(Context context, String str) {
        if (zy(context)) {
            return false;
        }
        C5609k.m19244y(str, "should not access network or location, not provisioned");
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m19258g() {
        try {
            return ((Boolean) Class.forName("miui.os.Build").getField("IS_DEVELOPMENT_VERSION").get(null)).booleanValue() && !Build.VERSION.INCREMENTAL.contains(".DEV");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m19259k() {
        try {
            return ((Boolean) Class.forName("miui.os.Build").getField("IS_ALPHA_BUILD").get(null)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m19260n() {
        try {
            return ((Boolean) Class.forName("miui.os.Build").getField("IS_STABLE_VERSION").get(null)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m19261q() {
        try {
            return ((Boolean) Class.forName("miui.os.Build").getField("IS_INTERNATIONAL_BUILD").get(null)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean toq() {
        try {
            return ((Boolean) Class.forName("miui.os.Build").getField("IS_DEVELOPMENT_VERSION").get(null)).booleanValue() && Build.VERSION.INCREMENTAL.contains(".DEV");
        } catch (Throwable unused) {
            return false;
        }
    }

    @TargetApi(17)
    public static boolean zy(Context context) {
        try {
            boolean z2 = Settings.Global.getInt(context.getContentResolver(), "device_provisioned", 0) != 0;
            if (!z2) {
                C5609k.m19244y(f31218k, "Provisioned: " + z2);
            }
            return z2;
        } catch (Throwable th) {
            C5609k.m19241n(f31218k, "isDeviceProvisioned exception", th);
            return true;
        }
    }
}
