package com.android.thememanager.ad;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.thememanager.C2082k;
import com.android.thememanager.ThemeApplication;
import java.util.Locale;

/* JADX INFO: compiled from: AdParamUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    private static final int f9546k = -1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f57389toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static String f57390zy = Build.MODEL;

    /* JADX INFO: renamed from: k */
    public static String m6536k() {
        String strM26160k = miuix.os.f7l8.m26160k("ro.miui.region", "");
        if (TextUtils.isEmpty(strM26160k)) {
            strM26160k = miuix.os.f7l8.m26160k("ro.product.locale.region", "");
        }
        if (TextUtils.isEmpty(strM26160k)) {
            strM26160k = miuix.os.f7l8.m26160k("persist.sys.country", "");
        }
        return TextUtils.isEmpty(strM26160k) ? Locale.getDefault().getCountry() : strM26160k;
    }

    /* JADX INFO: renamed from: q */
    public static String m6537q() {
        return C2082k.m7998k().getPackageName();
    }

    public static String toq() {
        return f57390zy;
    }

    public static int zy() {
        try {
            ThemeApplication themeApplicationM7998k = C2082k.m7998k();
            ConnectivityManager connectivityManager = (ConnectivityManager) themeApplicationM7998k.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                if (connectivityManager.isActiveNetworkMetered()) {
                    return ((TelephonyManager) themeApplicationM7998k.getSystemService("phone")).getNetworkType();
                }
                return -1;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }
}
