package com.xiaomi.analytics.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import androidx.exifinterface.media.C0846k;

/* JADX INFO: compiled from: SysUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class ld6 {

    /* JADX INFO: renamed from: g */
    private static final String f31200g = "ro.build.product";

    /* JADX INFO: renamed from: k */
    private static final String f31201k = "SysUtils";

    /* JADX INFO: renamed from: n */
    private static final String f31202n = "ro.build.version.sdk";

    /* JADX INFO: renamed from: q */
    private static final String f31203q = "has_deleted_id";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f73059toq = "_m_rec";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f73060zy = "imei";

    public static String f7l8() {
        try {
            String qVar = x2.toq("ro.miui.region", "");
            return TextUtils.isEmpty(qVar) ? x2.toq("ro.product.locale.region", "") : qVar;
        } catch (Exception e2) {
            C5609k.m19241n(f31201k, "getRegion Exception: ", e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m19246g() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: k */
    public static void m19247k(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f73059toq, 0);
            if (sharedPreferences.getBoolean(f31203q, false)) {
                return;
            }
            sharedPreferences.edit().remove("imei").apply();
            sharedPreferences.edit().putBoolean(f31203q, true).apply();
        } catch (Exception e2) {
            C5609k.m19241n(f31201k, "deleteDeviceIdInSpFile exception", e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m19248n() {
        return Build.VERSION.INCREMENTAL;
    }

    /* JADX INFO: renamed from: q */
    public static String m19249q() {
        return C5614y.m19259k() ? C0846k.l0 : C5614y.m19260n() ? "S" : C5614y.m19258g() ? com.market.sdk.reflect.toq.f28135s : C5614y.toq() ? "X" : "";
    }

    public static String toq() {
        return x2.toq(f31202n, "");
    }

    public static String zy() {
        return x2.toq(f31200g, "");
    }
}
