package com.xiaomi.push;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.room.AbstractC1141t;
import com.xiaomi.accountsdk.account.C5497k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class m8 {

    /* JADX INFO: renamed from: k */
    private static String f33411k = null;

    /* JADX INFO: renamed from: n */
    private static String f33412n = null;

    /* JADX INFO: renamed from: q */
    private static String f33413q = null;

    /* JADX INFO: renamed from: s */
    private static boolean f33414s = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static String f73491toq = null;

    /* JADX INFO: renamed from: y */
    private static final Set<String> f33415y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static String f73492zy = "";

    /* JADX INFO: renamed from: g */
    private static final String f33410g = String.valueOf((char) 2);

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String[] f73490f7l8 = {"--", "a-", "u-", "v-", "o-", "g-", "d-"};

    static {
        HashSet hashSet = new HashSet();
        f33415y = hashSet;
        hashSet.add("com.xiaomi.xmsf");
        hashSet.add(C5497k.f30745i);
        hashSet.add("com.miui.securitycenter");
        f33414s = true;
    }

    private static String a9(Context context) {
        return x9kr.m22019k(Build.BRAND + "_" + Build.MODEL + "_" + Build.VERSION.SDK_INT + "_" + Build.VERSION.RELEASE + "_" + Build.VERSION.INCREMENTAL + "_" + zy() + "_" + context.getPackageName() + "_" + System.currentTimeMillis() + "_" + n5r1.m21302k(16));
    }

    public static boolean cdj(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null || powerManager.isScreenOn();
    }

    @Deprecated
    public static String f7l8(Context context) {
        return null;
    }

    private static boolean fn3e(Context context) {
        Bundle bundle;
        ApplicationInfo applicationInfo;
        Bundle bundle2;
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null && (bundle2 = applicationInfo.metaData) != null && bundle2.containsKey("supportGetAndroidID")) {
                boolean z2 = packageInfo.applicationInfo.metaData.getBoolean("supportGetAndroidID", true);
                com.xiaomi.channel.commonutils.logger.zy.o1t("DeviceInfo", "Get supportGetAndroidID from app metaData: " + z2);
                return z2;
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.m19294i("DeviceInfo", "Check supportGetAndroidID from app metaData error: " + e2.getMessage());
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = new ComponentName(context.getPackageName(), "com.xiaomi.push.service.XMPushService");
            intent.setComponent(componentName);
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(componentName, 128);
            if (serviceInfo != null && (bundle = serviceInfo.metaData) != null && bundle.containsKey("supportGetAndroidID")) {
                com.xiaomi.channel.commonutils.logger.zy.o1t("DeviceInfo", "The metaData of XMPushService contains key supportGetAndroidID,so return false.");
                return false;
            }
        } catch (Exception e3) {
            com.xiaomi.channel.commonutils.logger.zy.m19294i("DeviceInfo", "Check supportGetAndroidID from XMPushService metaData error: " + e3.getMessage());
        }
        com.xiaomi.channel.commonutils.logger.zy.o1t("DeviceInfo", "Not configure the metaData key of supportGetAndroidID，return true by default.");
        return true;
    }

    @Deprecated
    public static String fu4(Context context) {
        return null;
    }

    /* JADX INFO: renamed from: g */
    private static String m21273g(int i2) {
        if (i2 > 0) {
            String[] strArr = f73490f7l8;
            if (i2 < strArr.length) {
                return strArr[i2];
            }
        }
        return f73490f7l8[0];
    }

    /* JADX INFO: renamed from: h */
    public static String m21274h(Context context) {
        String str = f73491toq;
        if (str != null || !f33414s) {
            return str;
        }
        boolean zFn3e = fn3e(context);
        f33414s = zFn3e;
        if (!zFn3e) {
            return null;
        }
        try {
            f73491toq = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("failure to get androidId: " + th);
        }
        return f73491toq;
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public static String m21275i(Context context) {
        return null;
    }

    private static String jk(Context context) {
        String string = context.getSharedPreferences("device_info", 0).getString("default_id", null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strA9 = a9(context);
        m21280s(context, strA9);
        return strA9;
    }

    /* JADX INFO: renamed from: k */
    private static double m21276k(double d2) {
        int i2 = 1;
        while (true) {
            double d4 = i2;
            if (d4 >= d2) {
                return d4;
            }
            i2 <<= 1;
        }
    }

    private static boolean ki(String str) {
        if (str == null) {
            return true;
        }
        String strTrim = str.trim();
        return strTrim.length() == 0 || strTrim.equalsIgnoreCase("null") || strTrim.equalsIgnoreCase("unknown");
    }

    public static String kja0() {
        return m21276k(((m21279q(Environment.getDataDirectory()) / 1024.0d) / 1024.0d) / 1024.0d) + "GB";
    }

    public static boolean ld6(Context context) {
        Intent intentZy = verb.zy(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null, null);
        if (intentZy == null) {
            return false;
        }
        int intExtra = intentZy.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Deprecated
    private static String mcp(Context context) {
        return "";
    }

    /* JADX INFO: renamed from: n */
    public static String m21277n() {
        return toq(n7h()) + "GB";
    }

    public static int n7h() throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        String[] strArrSplit;
        int i2 = 0;
        if (new File("/proc/meminfo").exists()) {
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
                } catch (IOException unused) {
                }
                try {
                    String line = bufferedReader.readLine();
                    if (!TextUtils.isEmpty(line) && (strArrSplit = line.split("\\s+")) != null && strArrSplit.length >= 2 && TextUtils.isDigitsOnly(strArrSplit[1])) {
                        i2 = Integer.parseInt(strArrSplit[1]);
                    }
                    bufferedReader.close();
                } catch (Exception unused2) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return i2;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused4) {
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
            }
        }
        return i2;
    }

    @Deprecated
    public static String ni7(Context context) {
        return null;
    }

    public static synchronized String o1t(Context context) {
        String str = f33412n;
        if (str != null) {
            return str;
        }
        String strLd6 = n5r1.ld6(m21274h(context) + f7l8(context));
        f33412n = strLd6;
        return strLd6;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m21278p() {
        return zy() <= 0;
    }

    /* JADX INFO: renamed from: q */
    private static long m21279q(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
    }

    public static boolean qrj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i2 = 0;
        while (true) {
            String[] strArr = f73490f7l8;
            if (i2 >= strArr.length) {
                return false;
            }
            if (str.startsWith(strArr[i2])) {
                return true;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: s */
    private static void m21280s(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_info", 0);
        if (TextUtils.isEmpty(sharedPreferences.getString("default_id", null))) {
            sharedPreferences.edit().putString("default_id", str).apply();
        } else {
            com.xiaomi.channel.commonutils.logger.zy.kja0("default_id exist,do not change it.");
        }
    }

    /* JADX INFO: renamed from: t */
    public static String m21281t(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
    }

    public static String t8r() {
        return n7h() + "KB";
    }

    private static float toq(int i2) {
        float f2 = ((((((i2 + 102400) / 524288) + 1) * 512) * 1024) / 1024.0f) / 1024.0f;
        double d2 = f2;
        return d2 > 0.5d ? (float) Math.ceil(d2) : f2;
    }

    public static synchronized String wvg(Context context) {
        return n5r1.ld6(m21274h(context) + ((String) null));
    }

    public static boolean x2(Context context, String str) {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfo = (PackageInfo) C5892r.m21411n(context.getPackageManager(), "getPackageInfoAsUser", str, 0, Integer.valueOf(AbstractC1141t.f52393qrj));
        return packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 8388608) != 8388608;
    }

    /* JADX INFO: renamed from: y */
    public static synchronized String m21282y(Context context, boolean z2) {
        int i2;
        if (f33413q == null) {
            String strM21274h = m21274h(context);
            String strM21275i = "";
            if (!nc.m21310i()) {
                strM21275i = z2 ? m21275i(context) : mcp(context);
            }
            String strF7l8 = f7l8(context);
            if (ki(strM21275i) && ki(strF7l8)) {
                String strM21342n = o1t.m21340k(context).m21342n();
                if (TextUtils.isEmpty(strM21342n)) {
                    String strMo20572a = o1t.m21340k(context).mo20572a();
                    if (!TextUtils.isEmpty(strMo20572a) && !strMo20572a.startsWith("00000000-0000-0000-0000-000000000000")) {
                        i2 = 4;
                        strM21274h = strMo20572a;
                    } else if (TextUtils.isEmpty(strM21274h)) {
                        strM21274h = jk(context);
                        i2 = 6;
                    } else {
                        i2 = 5;
                    }
                } else {
                    strM21274h = strM21342n + strM21274h;
                    i2 = 2;
                }
            } else {
                strM21274h = strM21275i + strM21274h + strF7l8;
                i2 = 1;
            }
            com.xiaomi.channel.commonutils.logger.zy.m19302z("devid rule select:" + i2);
            if (i2 == 3) {
                f33413q = strM21274h;
            } else {
                f33413q = m21273g(i2) + n5r1.ld6(strM21274h);
            }
        }
        return f33413q;
    }

    @Deprecated
    /* JADX INFO: renamed from: z */
    public static String m21283z(Context context) {
        return "";
    }

    public static String zurt() {
        return (m21279q(Environment.getDataDirectory()) / 1024) + "KB";
    }

    @TargetApi(17)
    public static int zy() {
        Object objF7l8 = C5892r.f7l8("android.os.UserHandle", "myUserId", new Object[0]);
        if (objF7l8 == null) {
            return -1;
        }
        return ((Integer) Integer.class.cast(objF7l8)).intValue();
    }
}
