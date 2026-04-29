package com.android.thememanager.basemodule.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.privacy.C1781k;
import retrofit2.C7639i;

/* JADX INFO: compiled from: NetworkUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class mcp {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f57780f7l8 = -1;

    /* JADX INFO: renamed from: g */
    public static String[] f10358g = null;

    /* JADX INFO: renamed from: k */
    private static final String f10359k = "NetworkUtils";

    /* JADX INFO: renamed from: y */
    private static final int f10362y = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String[] f57781toq = {"mi.com", "xiaomi.com", "xiaomi.net"};

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String[] f57782zy = {".mi.com", ".xiaomi.com", ".xiaomi.net", ".miui.com"};

    /* JADX INFO: renamed from: q */
    public static final String[] f10361q = {".diyring.cc", ".jd.com", ".imusic.cn"};

    /* JADX INFO: renamed from: n */
    public static final String[] f10360n = {".diyring.cc", ".kuyin123.com", ".ttring.cn"};

    public static boolean f7l8() {
        ConnectivityManager connectivityManager = (ConnectivityManager) bf2.toq.toq().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo == null || connectivityManager.isActiveNetworkMetered() || !activeNetworkInfo.isConnected()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m7137g(Uri uri) {
        if (uri != null && uri.getHost() != null) {
            String host = uri.getHost();
            for (String str : C1724k.m6723p().ld6().getPartnerDomain()) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
        }
        return bf2.toq.m5812n();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m7138k() {
        return C1781k.toq(bf2.toq.toq());
    }

    /* JADX INFO: renamed from: n */
    public static boolean m7139n() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) bf2.toq.toq().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m7140q(Uri uri) {
        if (uri != null && uri.getHost() != null) {
            String host = uri.getHost();
            for (String str : f57782zy) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
        }
        return bf2.toq.m5812n();
    }

    @zy.dd
    public static <T> T toq(C7639i<CommonResponse<T>> res) {
        if (res == null) {
            Log.i(f10359k, "getResponseResult() response null.");
            return null;
        }
        if (res.f7l8()) {
            CommonResponse<T> commonResponseM27986k = res.m27986k();
            if (commonResponseM27986k != null) {
                return commonResponseM27986k.apiData;
            }
            Log.d(f10359k, "getResponseResult() CommonResponse null.");
            return null;
        }
        Log.d(f10359k, "getResponseResult() res fail." + res.toq());
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m7141y(String host) {
        if (f10358g == null) {
            f10358g = C1724k.m6723p().ld6().getXunFeiDomain();
        }
        String[] strArr = f10358g;
        if (strArr != null) {
            for (String str : strArr) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
        }
        return bf2.toq.m5812n();
    }

    public static int zy(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                if (connectivityManager.isActiveNetworkMetered()) {
                    return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
                }
                return -1;
            }
        } catch (Exception unused) {
        }
        return 0;
    }
}
