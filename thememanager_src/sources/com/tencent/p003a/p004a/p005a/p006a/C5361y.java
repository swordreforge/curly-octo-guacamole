package com.tencent.p003a.p004a.p005a.p006a;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.Log;
import com.tencent.wxop.stat.common.C5386f;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.a.a.a.a.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C5361y {
    public static boolean f7l8(String str) {
        return str != null && str.trim().length() >= 40;
    }

    /* JADX INFO: renamed from: g */
    static boolean m18231g(String str) {
        return (str == null || str.trim().length() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    static String m18232k(Context context) {
        try {
            if (m18234q(context, "android.permission.READ_PHONE_STATE")) {
                String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
                if (deviceId != null) {
                    return deviceId;
                }
            } else {
                Log.i("MID", "Could not get permission of android.permission.READ_PHONE_STATE");
            }
            return "";
        } catch (Throwable th) {
            Log.w("MID", th);
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    static String m18233n(Context context) {
        String str;
        if (m18234q(context, "android.permission.ACCESS_WIFI_STATE")) {
            try {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                return wifiManager == null ? "" : wifiManager.getConnectionInfo().getMacAddress();
            } catch (Exception e2) {
                str = "get wifi address error" + e2;
            }
        } else {
            str = "Could not get permission of android.permission.ACCESS_WIFI_STATE";
        }
        Log.i("MID", str);
        return "";
    }

    /* JADX INFO: renamed from: q */
    static boolean m18234q(Context context, String str) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Throwable th) {
            toq("checkPermission error", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    static String m18235s(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new String(Base64.encode(C5386f.m18391a(str.getBytes("UTF-8")), 0), "UTF-8").trim().replace("\t", "").replace("\n", "").replace("\r", "");
        } catch (Throwable th) {
            toq("decode error", th);
            return str;
        }
    }

    private static void toq(String str, Throwable th) {
        Log.e("MID", str, th);
    }

    /* JADX INFO: renamed from: y */
    static String m18236y(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new String(C5386f.m18393b(Base64.decode(str.getBytes("UTF-8"), 0)), "UTF-8").trim().replace("\t", "").replace("\n", "").replace("\r", "");
        } catch (Throwable th) {
            toq("decode error", th);
            return str;
        }
    }

    static void zy(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (m18231g(str2)) {
            jSONObject.put(str, str2);
        }
    }
}
