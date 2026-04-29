package com.market.sdk.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import com.market.sdk.MarketManager;
import com.market.sdk.compat.C4966k;
import com.market.sdk.compat.C4967q;
import com.market.sdk.o1t;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes3.dex */
public class ki {

    /* JADX INFO: renamed from: g */
    protected static final int f28209g = 1000;

    /* JADX INFO: renamed from: k */
    public static final String f28210k = "MarketSdkUtils";

    /* JADX INFO: renamed from: n */
    protected static final int f28211n = 1000000;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static boolean f68996toq = new File("/sdcard/com.xiaomi.market.sdk/sdk_debug").exists();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static o1t<String> f68997zy = new C5011k();

    /* JADX INFO: renamed from: q */
    private static volatile o1t<Boolean> f28212q = new toq();

    /* JADX INFO: renamed from: com.market.sdk.utils.ki$k */
    /* JADX INFO: compiled from: Utils.java */
    class C5011k extends o1t<String> {
        C5011k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.market.sdk.o1t
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public String mo17339k() {
            return (!C5014q.wvg() || C5014q.ni7()) ? "" : "com.xiaomi.market";
        }
    }

    /* JADX INFO: compiled from: Utils.java */
    class toq extends o1t<Boolean> {
        toq() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.market.sdk.o1t
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public Boolean mo17339k() {
            String str = (String) ki.f68997zy.toq();
            if (TextUtils.isEmpty(str)) {
                return Boolean.FALSE;
            }
            try {
                int applicationEnabledSetting = C5010k.toq().getPackageManager().getApplicationEnabledSetting(str);
                boolean z2 = true;
                if (applicationEnabledSetting != 0 && applicationEnabledSetting != 1) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }
    }

    public static boolean f7l8(boolean z2) {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState)) {
            return true;
        }
        return "mounted_ro".equals(externalStorageState) && !z2;
    }

    /* JADX INFO: renamed from: g */
    public static String m17438g(String str) {
        try {
            PackageManager packageManager = MarketManager.m17271y().getPackageManager();
            String str2 = MarketManager.f27965p;
            Resources resourcesForApplication = packageManager.getResourcesForApplication(str2);
            return resourcesForApplication.getString(resourcesForApplication.getIdentifier(str, "string", str2));
        } catch (Throwable th) {
            Log.e(MarketManager.f27964n, th.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m17439h() {
        return C4967q.toq() == com.market.sdk.compat.zy.m17302k(MarketManager.m17271y(), "second_user_id", C4967q.f28034k, C4967q.f68878toq);
    }

    public static boolean kja0(Context context) {
        NetworkInfo activeNetworkInfo;
        return (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) ? false : true;
    }

    public static boolean ld6(Context context) {
        return f28212q.toq().booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public static String[] m17441n(String str, String str2) {
        try {
            Context contextCreatePackageContext = MarketManager.m17271y().createPackageContext(str, 0);
            return contextCreatePackageContext.getResources().getStringArray(contextCreatePackageContext.getResources().getIdentifier(str2, "array", str));
        } catch (Throwable th) {
            Log.e(MarketManager.f27964n, th.toString());
            return null;
        }
    }

    public static boolean n7h() {
        return !((PowerManager) MarketManager.m17271y().getSystemService("power")).isScreenOn();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m17442p() {
        try {
            return miuix.os.toq.f40717k;
        } catch (Throwable th) {
            Log.d(MarketManager.f27964n, th.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m17443q() {
        return f68997zy.toq();
    }

    public static boolean qrj(Context context) {
        NetworkInfo activeNetworkInfo;
        return (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 0) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m17444s() {
        try {
            return C4966k.m17299k().m22390k();
        } catch (Exception e2) {
            Log.d(MarketManager.f27964n, e2.toString());
            return false;
        }
    }

    public static void toq(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                Log.e(MarketManager.f27964n, e2.toString(), e2);
            }
        }
    }

    public static boolean x2() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((String) cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.build.characteristics")).contains("tablet");
        } catch (Exception e2) {
            Log.e(f28210k, e2.getMessage(), e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    public static boolean m17445y(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static String zy(long j2, Context context) {
        String strValueOf;
        if (context == null || j2 < 0) {
            return "";
        }
        String str = "%1$sKB";
        if (j2 > 1000000) {
            strValueOf = String.format("%.1f", Double.valueOf((j2 * 1.0d) / 1000000.0d));
        } else if (j2 > 1000) {
            strValueOf = String.format("%.1f", Double.valueOf((j2 * 1.0d) / 1000.0d));
        } else {
            strValueOf = String.valueOf(j2);
            str = "%1$sMB";
        }
        return String.format(str, strValueOf);
    }
}
