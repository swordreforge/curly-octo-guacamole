package com.miui.privacypolicy;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import org.json.JSONObject;

/* JADX INFO: compiled from: PrivacyManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8 {

    /* JADX INFO: renamed from: k */
    private static final String f29747k = "Privacy_PrivacyManager";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected static final boolean f72465toq = false;

    private f7l8() {
    }

    public static synchronized String f7l8(Context context, String str, String str2, String str3, String str4) {
        m18117k("can not request privacy update in main thread!");
        if (C5321q.f29759y) {
            return String.valueOf(-4);
        }
        if (!zy.m18139g(context.getApplicationContext(), str)) {
            int iM18138k = C5323y.m18138k(context.getApplicationContext(), str, str3);
            if (iM18138k == 1) {
                iM18138k = -7;
            }
            return String.valueOf(iM18138k);
        }
        if (!zy.m18141n(context.getApplicationContext(), str)) {
            return C5320p.toq(context.getApplicationContext(), str, str3);
        }
        if (System.currentTimeMillis() - x2.m18133n(context.getApplicationContext(), str + "_privacy_update_time", 0L) < 86400000) {
            return String.valueOf(-5);
        }
        x2.m18134p(context.getApplicationContext(), str + "_privacy_update_time", System.currentTimeMillis());
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String strF7l8 = zy.f7l8(context.getApplicationContext(), "privacy_agree_error", str);
        if (!TextUtils.isEmpty(strF7l8)) {
            try {
                JSONObject jSONObject = new JSONObject(strF7l8);
                str2 = jSONObject.optString("idContent", str2);
                str = jSONObject.optString("policyName", str);
                strValueOf = jSONObject.optString("timestamp", strValueOf);
            } catch (Exception e2) {
                Log.e(f29747k, "parse last jsonObject error, ", e2);
            }
        }
        int iM18120k = C5317g.m18120k(context.getApplicationContext(), str, str2, strValueOf, str3, str4);
        if (iM18120k == 1) {
            iM18120k = -6;
        }
        return String.valueOf(iM18120k);
    }

    /* JADX INFO: renamed from: g */
    public static synchronized String m18116g(Context context, String str, String str2) {
        m18117k("can not request privacy update in main thread!");
        if (C5321q.f29759y) {
            return String.valueOf(-4);
        }
        return f7l8(context, str, str2, null, null);
    }

    /* JADX INFO: renamed from: k */
    private static void m18117k(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        Log.w(f29747k, str);
        throw new IllegalStateException(str);
    }

    /* JADX INFO: renamed from: n */
    public static synchronized int m18118n(Context context, String str, String str2, String str3, String str4) {
        m18117k("can not request privacy revoke in main thread!");
        if (C5321q.f29759y) {
            return -4;
        }
        return C5322s.m18130k(context.getApplicationContext(), str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: q */
    public static synchronized int m18119q(Context context, String str, String str2) {
        m18117k("can not request privacy revoke in main thread!");
        if (C5321q.f29759y) {
            return -4;
        }
        return C5322s.m18130k(context.getApplicationContext(), str, str2, null, null);
    }

    public static synchronized int toq(Context context, String str, String str2) {
        m18117k("can not request privacy agree in main thread!");
        if (C5321q.f29759y) {
            return -4;
        }
        return C5317g.m18120k(context.getApplicationContext(), str, str2, String.valueOf(System.currentTimeMillis()), null, null);
    }

    public static synchronized int zy(Context context, String str, String str2, String str3, String str4) {
        m18117k("can not request privacy agree in main thread!");
        if (C5321q.f29759y) {
            return -4;
        }
        return C5317g.m18120k(context.getApplicationContext(), str, str2, String.valueOf(System.currentTimeMillis()), str3, str4);
    }
}
