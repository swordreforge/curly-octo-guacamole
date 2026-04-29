package com.tencent.wxop.stat.common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.wxop.stat.common.r */
/* JADX INFO: loaded from: classes3.dex */
public class C5398r {

    /* JADX INFO: renamed from: a */
    private static String f30173a = "";

    /* JADX INFO: renamed from: a */
    public static String m18463a(Context context) {
        try {
            if (m18467a(context, "android.permission.READ_PHONE_STATE")) {
                String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
                if (deviceId != null) {
                    return deviceId;
                }
            } else {
                Log.e(StatConstants.LOG_TAG, "Could not get permission of android.permission.READ_PHONE_STATE");
            }
            return null;
        } catch (Throwable th) {
            Log.e(StatConstants.LOG_TAG, "get device id error", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m18464a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new String(C5386f.m18393b(C5388h.m18398a(str.getBytes("UTF-8"), 0)), "UTF-8");
        } catch (Throwable th) {
            Log.e(StatConstants.LOG_TAG, "decode error", th);
            return str;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m18465a(Context context, int i2) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m18466a(JSONObject jSONObject, String str, String str2) {
        if (str2 != null) {
            try {
                if (str2.length() > 0) {
                    jSONObject.put(str, str2);
                }
            } catch (Throwable th) {
                Log.e(StatConstants.LOG_TAG, "jsonPut error", th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m18467a(Context context, String str) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Throwable th) {
            Log.e(StatConstants.LOG_TAG, "checkPermission error", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m18468b(Context context) {
        if (!m18467a(context, "android.permission.ACCESS_WIFI_STATE")) {
            Log.e(StatConstants.LOG_TAG, "Could not get permission of android.permission.ACCESS_WIFI_STATE");
            return "";
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            return wifiManager == null ? "" : wifiManager.getConnectionInfo().getMacAddress();
        } catch (Exception e2) {
            Log.e(StatConstants.LOG_TAG, "get wifi address error", e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m18469b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new String(C5388h.m18400b(C5386f.m18391a(str.getBytes("UTF-8")), 0), "UTF-8");
        } catch (Throwable th) {
            Log.e(StatConstants.LOG_TAG, "encode error", th);
            return str;
        }
    }

    /* JADX INFO: renamed from: c */
    public static WifiInfo m18470c(Context context) {
        WifiManager wifiManager;
        if (!m18467a(context, "android.permission.ACCESS_WIFI_STATE") || (wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi")) == null) {
            return null;
        }
        return wifiManager.getConnectionInfo();
    }

    /* JADX INFO: renamed from: d */
    public static String m18471d(Context context) {
        try {
            WifiInfo wifiInfoM18470c = m18470c(context);
            if (wifiInfoM18470c != null) {
                return wifiInfoM18470c.getBSSID();
            }
            return null;
        } catch (Throwable th) {
            Log.e(StatConstants.LOG_TAG, "encode error", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m18472e(Context context) {
        try {
            WifiInfo wifiInfoM18470c = m18470c(context);
            if (wifiInfoM18470c != null) {
                return wifiInfoM18470c.getSSID();
            }
            return null;
        } catch (Throwable th) {
            Log.e(StatConstants.LOG_TAG, "encode error", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m18473f(Context context) {
        try {
            if (m18467a(context, "android.permission.INTERNET") && m18467a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                        return true;
                    }
                    Log.w(StatConstants.LOG_TAG, "Network error");
                    return false;
                }
            } else {
                Log.e(StatConstants.LOG_TAG, "can not get the permisson of android.permission.INTERNET");
            }
        } catch (Throwable th) {
            Log.e(StatConstants.LOG_TAG, "isNetworkAvailable error", th);
        }
        return false;
    }
}
