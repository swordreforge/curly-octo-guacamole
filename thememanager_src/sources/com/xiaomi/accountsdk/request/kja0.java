package com.xiaomi.accountsdk.request;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.xiaomi.accountsdk.utils.C5581y;

/* JADX INFO: compiled from: NetworkUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class kja0 {
    /* JADX INFO: renamed from: k */
    static String m18953k(String str) {
        if (str != null) {
            return str.replaceAll("[^a-zA-Z0-9-_.]", "");
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    static String m18954q(String str) {
        if (str != null) {
            return str.replaceAll("\\+", "p");
        }
        return null;
    }

    static String toq(Context context) {
        String ssid = "";
        if (context == null) {
            return null;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return "";
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return "";
            }
            if (activeNetworkInfo.getType() != 1) {
                return String.format("%s-%s-%s", activeNetworkInfo.getTypeName(), m18954q(activeNetworkInfo.getSubtypeName()), activeNetworkInfo.getExtraInfo()).toLowerCase();
            }
            try {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                ssid = wifiManager.getConnectionInfo() != null ? wifiManager.getConnectionInfo().getSSID() : null;
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(ssid)) {
                return "wifi";
            }
            return "wifi-" + C5581y.fn3e(ssid).substring(0, 3).toLowerCase();
        } catch (Exception unused2) {
            return "";
        }
    }

    public static String zy(Context context) {
        return m18953k(toq(context));
    }
}
