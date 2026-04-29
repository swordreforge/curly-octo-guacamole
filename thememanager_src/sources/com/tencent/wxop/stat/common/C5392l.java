package com.tencent.wxop.stat.common;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.android.thememanager.clockmessage.model.C1873k;
import com.tencent.wxop.stat.StatConfig;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.zip.GZIPInputStream;
import miuix.android.content.C6824k;
import miuix.security.C7323k;
import org.apache.http.HttpHost;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.wxop.stat.common.l */
/* JADX INFO: loaded from: classes3.dex */
public class C5392l {

    /* JADX INFO: renamed from: a */
    private static String f30147a = null;

    /* JADX INFO: renamed from: b */
    private static String f30148b = null;

    /* JADX INFO: renamed from: c */
    private static String f30149c = null;

    /* JADX INFO: renamed from: d */
    private static String f30150d = null;

    /* JADX INFO: renamed from: e */
    private static Random f30151e = null;

    /* JADX INFO: renamed from: f */
    private static DisplayMetrics f30152f = null;

    /* JADX INFO: renamed from: g */
    private static String f30153g = null;

    /* JADX INFO: renamed from: h */
    private static String f30154h = "";

    /* JADX INFO: renamed from: i */
    private static String f30155i = "";

    /* JADX INFO: renamed from: j */
    private static int f30156j = -1;

    /* JADX INFO: renamed from: k */
    private static StatLogger f30157k = null;

    /* JADX INFO: renamed from: l */
    private static String f30158l = null;

    /* JADX INFO: renamed from: m */
    private static String f30159m = null;

    /* JADX INFO: renamed from: n */
    private static volatile int f30160n = -1;

    /* JADX INFO: renamed from: o */
    private static String f30161o = null;

    /* JADX INFO: renamed from: p */
    private static String f30162p = null;

    /* JADX INFO: renamed from: q */
    private static long f30163q = -1;

    /* JADX INFO: renamed from: r */
    private static String f30164r = "";

    /* JADX INFO: renamed from: s */
    private static C5395o f30165s = null;

    /* JADX INFO: renamed from: t */
    private static String f30166t = "__MTA_FIRST_ACTIVATE__";

    /* JADX INFO: renamed from: u */
    private static int f30167u = -1;

    /* JADX INFO: renamed from: v */
    private static long f30168v = -1;

    /* JADX INFO: renamed from: w */
    private static int f30169w = 0;

    /* JADX INFO: renamed from: x */
    private static String f30170x = "";

    /* JADX INFO: renamed from: A */
    public static String m18404A(Context context) {
        if (context == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 0);
        ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
        if (activityInfo == null || activityInfo.packageName.equals("android")) {
            return null;
        }
        return resolveInfoResolveActivity.activityInfo.packageName;
    }

    /* JADX INFO: renamed from: B */
    private static long m18405B(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C1873k.f10652g);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* JADX INFO: renamed from: a */
    public static int m18406a() {
        return m18430g().nextInt(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: a */
    public static int m18407a(Context context, boolean z2) {
        if (z2) {
            f30169w = m18449y(context);
        }
        return f30169w;
    }

    /* JADX INFO: renamed from: a */
    public static Long m18408a(String str, String str2, int i2, int i3, Long l2) {
        if (str != null && str2 != null) {
            if (str2.equalsIgnoreCase(".") || str2.equalsIgnoreCase("|")) {
                str2 = "\\" + str2;
            }
            String[] strArrSplit = str.split(str2);
            if (strArrSplit.length == i3) {
                try {
                    Long lValueOf = 0L;
                    for (String str3 : strArrSplit) {
                        lValueOf = Long.valueOf(((long) i2) * (lValueOf.longValue() + Long.valueOf(str3).longValue()));
                    }
                    return lValueOf;
                } catch (NumberFormatException unused) {
                }
            }
        }
        return l2;
    }

    /* JADX INFO: renamed from: a */
    public static String m18409a(int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.roll(6, i2);
        return new SimpleDateFormat("yyyyMMdd").format(calendar.getTime());
    }

    /* JADX INFO: renamed from: a */
    public static String m18410a(long j2) {
        return new SimpleDateFormat("yyyyMMdd").format(new Date(j2));
    }

    /* JADX INFO: renamed from: a */
    public static String m18411a(Context context, String str) {
        if (StatConfig.isEnableConcurrentProcess()) {
            if (f30159m == null) {
                f30159m = m18439o(context);
            }
            if (f30159m != null) {
                return str + "_" + f30159m;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static String m18412a(String str) {
        if (str == null) {
            return "0";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C7323k.f90061toq);
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : bArrDigest) {
                int i2 = b2 & 255;
                if (i2 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i2));
            }
            return stringBuffer.toString();
        } catch (Throwable unused) {
            return "0";
        }
    }

    /* JADX INFO: renamed from: a */
    public static HttpHost m18413a(Context context) {
        NetworkInfo activeNetworkInfo;
        String extraInfo;
        if (context == null) {
            return null;
        }
        try {
        } catch (Throwable th) {
            f30157k.m18376e(th);
        }
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0 || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
            return null;
        }
        if ((activeNetworkInfo.getTypeName() != null && activeNetworkInfo.getTypeName().equalsIgnoreCase(C6824k.f86613r8s8)) || (extraInfo = activeNetworkInfo.getExtraInfo()) == null) {
            return null;
        }
        if (!extraInfo.equals("cmwap") && !extraInfo.equals("3gwap") && !extraInfo.equals("uniwap")) {
            if (extraInfo.equals("ctwap")) {
                return new HttpHost("10.0.0.200", 80);
            }
            String defaultHost = Proxy.getDefaultHost();
            if (defaultHost != null && defaultHost.trim().length() > 0) {
                return new HttpHost(defaultHost, Proxy.getDefaultPort());
            }
            return null;
        }
        return new HttpHost("10.0.0.172", 80);
    }

    /* JADX INFO: renamed from: a */
    public static void m18414a(Context context, int i2) {
        f30169w = i2;
        C5397q.m18460b(context, "mta.qq.com.difftime", i2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m18415a(StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (statSpecifyReportedInfo == null) {
            return false;
        }
        return m18422c(statSpecifyReportedInfo.getAppKey());
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m18416a(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length * 2);
        while (true) {
            int i2 = gZIPInputStream.read(bArr2);
            if (i2 == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayInputStream.close();
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            }
            byteArrayOutputStream.write(bArr2, 0, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m18417b(String str) {
        return m18408a(str, ".", 100, 3, 0L).longValue();
    }

    /* JADX INFO: renamed from: b */
    public static synchronized StatLogger m18418b() {
        if (f30157k == null) {
            StatLogger statLogger = new StatLogger(StatConstants.LOG_TAG);
            f30157k = statLogger;
            statLogger.setDebugEnable(false);
        }
        return f30157k;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized String m18419b(Context context) {
        String str = f30147a;
        if (str != null && str.trim().length() != 0) {
            return f30147a;
        }
        String strM18463a = C5398r.m18463a(context);
        f30147a = strM18463a;
        if (strM18463a == null || strM18463a.trim().length() == 0) {
            f30147a = Integer.toString(m18430g().nextInt(Integer.MAX_VALUE));
        }
        return f30147a;
    }

    /* JADX INFO: renamed from: c */
    public static long m18420c() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            return calendar.getTimeInMillis() + 86400000;
        } catch (Throwable th) {
            f30157k.m18376e(th);
            return System.currentTimeMillis() + 86400000;
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized String m18421c(Context context) {
        String str = f30149c;
        if (str == null || str.trim().length() == 0) {
            f30149c = C5398r.m18468b(context);
        }
        return f30149c;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m18422c(String str) {
        return (str == null || str.trim().length() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static DisplayMetrics m18423d(Context context) {
        if (f30152f == null) {
            f30152f = new DisplayMetrics();
            ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(f30152f);
        }
        return f30152f;
    }

    /* JADX INFO: renamed from: d */
    public static String m18424d() {
        if (m18422c(f30162p)) {
            return f30162p;
        }
        long jM18425e = m18425e() / 1000000;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        String str = String.valueOf((((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks())) / 1000000) + "/" + String.valueOf(jM18425e);
        f30162p = str;
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static long m18425e() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
    }

    /* JADX INFO: renamed from: e */
    public static boolean m18426e(Context context) {
        NetworkInfo[] allNetworkInfo;
        try {
        } catch (Throwable th) {
            f30157k.m18376e(th);
        }
        if (!C5398r.m18467a(context, "android.permission.ACCESS_WIFI_STATE")) {
            f30157k.warn("can not get the permission of android.permission.ACCESS_WIFI_STATE");
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager != null && (allNetworkInfo = connectivityManager.getAllNetworkInfo()) != null) {
            for (int i2 = 0; i2 < allNetworkInfo.length; i2++) {
                if (allNetworkInfo[i2].getTypeName().equalsIgnoreCase(C6824k.f86613r8s8) && allNetworkInfo[i2].isConnected()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static String m18428f(Context context) {
        if (context == null) {
            return null;
        }
        return context.getClass().getName();
    }

    /* JADX INFO: renamed from: g */
    public static String m18429g(Context context) {
        TelephonyManager telephonyManager;
        String str = f30153g;
        if (str != null) {
            return str;
        }
        try {
            if (!C5398r.m18467a(context, "android.permission.READ_PHONE_STATE")) {
                f30157k.m18375e("Could not get permission of android.permission.READ_PHONE_STATE");
            } else if (m18433i(context) && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                f30153g = telephonyManager.getSimOperator();
            }
        } catch (Throwable th) {
            f30157k.m18376e(th);
        }
        return f30153g;
    }

    /* JADX INFO: renamed from: g */
    private static synchronized Random m18430g() {
        if (f30151e == null) {
            f30151e = new Random();
        }
        return f30151e;
    }

    /* JADX INFO: renamed from: h */
    private static long m18431h() {
        long j2 = f30163q;
        if (j2 > 0) {
            return j2;
        }
        long jIntValue = 1;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            jIntValue = Integer.valueOf(bufferedReader.readLine().split("\\s+")[1]).intValue() * 1024;
            bufferedReader.close();
        } catch (Exception unused) {
        }
        f30163q = jIntValue;
        return jIntValue;
    }

    /* JADX INFO: renamed from: h */
    public static String m18432h(Context context) {
        if (m18422c(f30154h)) {
            return f30154h;
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            f30154h = str;
            if (str == null) {
                return "";
            }
        } catch (Throwable th) {
            f30157k.m18376e(th);
        }
        return f30154h;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m18433i(Context context) {
        return context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0;
    }

    /* JADX INFO: renamed from: j */
    public static String m18434j(Context context) {
        try {
            if (C5398r.m18467a(context, "android.permission.INTERNET") && C5398r.m18467a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    String typeName = activeNetworkInfo.getTypeName();
                    String extraInfo = activeNetworkInfo.getExtraInfo();
                    if (typeName != null) {
                        if (typeName.equalsIgnoreCase(C6824k.f86613r8s8)) {
                            return C6824k.f86613r8s8;
                        }
                        if (typeName.equalsIgnoreCase("MOBILE")) {
                            if (extraInfo == null) {
                                return "MOBILE";
                            }
                        } else if (extraInfo == null) {
                            return typeName;
                        }
                        return extraInfo;
                    }
                }
            } else {
                f30157k.m18375e("can not get the permission of android.permission.ACCESS_WIFI_STATE");
            }
        } catch (Throwable th) {
            f30157k.m18376e(th);
        }
        return "";
    }

    /* JADX INFO: renamed from: k */
    public static Integer m18435k(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return Integer.valueOf(telephonyManager.getNetworkType());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m18436l(Context context) {
        if (m18422c(f30155i)) {
            return f30155i;
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            f30155i = str;
            if (str == null) {
                return "unknown";
            }
            if (str.length() == 0) {
                return "unknown";
            }
        } catch (Throwable th) {
            f30157k.m18376e(th);
        }
        return f30155i;
    }

    /* JADX INFO: renamed from: m */
    public static int m18437m(Context context) {
        int i2 = f30156j;
        if (i2 != -1) {
            return i2;
        }
        try {
            if (C5396p.m18455a()) {
                f30156j = 1;
            }
        } catch (Throwable th) {
            f30157k.m18376e(th);
        }
        f30156j = 0;
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public static String m18438n(Context context) {
        String path;
        if (m18422c(f30158l)) {
            return f30158l;
        }
        try {
        } catch (Throwable th) {
            f30157k.m18376e(th);
        }
        if (!C5398r.m18467a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            f30157k.warn("can not get the permission of android.permission.WRITE_EXTERNAL_STORAGE");
            return null;
        }
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState != null && externalStorageState.equals("mounted") && (path = Environment.getExternalStorageDirectory().getPath()) != null) {
            StatFs statFs = new StatFs(path);
            long blockCount = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1000000;
            String str = String.valueOf((((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / 1000000) + "/" + String.valueOf(blockCount);
            f30158l = str;
            return str;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        com.tencent.wxop.stat.common.C5392l.f30159m = r1.processName;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String m18439o(android.content.Context r3) {
        /*
            java.lang.String r0 = com.tencent.wxop.stat.common.C5392l.f30159m     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "activity"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L2d
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3     // Catch: java.lang.Throwable -> L2d
            java.util.List r3 = r3.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2d
        L19:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L2d
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Throwable -> L2d
            int r2 = r1.pid     // Catch: java.lang.Throwable -> L2d
            if (r2 != r0) goto L19
            java.lang.String r3 = r1.processName     // Catch: java.lang.Throwable -> L2d
            com.tencent.wxop.stat.common.C5392l.f30159m = r3     // Catch: java.lang.Throwable -> L2d
        L2d:
            java.lang.String r3 = com.tencent.wxop.stat.common.C5392l.f30159m
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.common.C5392l.m18439o(android.content.Context):java.lang.String");
    }

    /* JADX INFO: renamed from: p */
    public static String m18440p(Context context) {
        return m18411a(context, StatConstants.DATABASE_NAME);
    }

    /* JADX INFO: renamed from: q */
    public static synchronized Integer m18441q(Context context) {
        int i2;
        int i3 = 0;
        if (f30160n > 0) {
            if (f30160n % 1000 == 0) {
                try {
                    int i4 = f30160n + 1000;
                    if (f30160n < 2147383647) {
                        i3 = i4;
                    }
                    C5397q.m18460b(context, "MTA_EVENT_INDEX", i3);
                } catch (Throwable th) {
                    f30157k.m18379w(th);
                }
            }
        }
        f30160n = C5397q.m18456a(context, "MTA_EVENT_INDEX", 0);
        C5397q.m18460b(context, "MTA_EVENT_INDEX", f30160n + 1000);
        i2 = f30160n + 1;
        f30160n = i2;
        return Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: r */
    public static String m18442r(Context context) {
        try {
            return String.valueOf(m18405B(context) / 1000000) + "/" + String.valueOf(m18431h() / 1000000);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static JSONObject m18443s(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("n", C5393m.m18451a());
            String strM18454d = C5393m.m18454d();
            if (strM18454d != null && strM18454d.length() > 0) {
                jSONObject.put("na", strM18454d);
            }
            int iM18452b = C5393m.m18452b();
            if (iM18452b > 0) {
                jSONObject.put("fx", iM18452b / 1000000);
            }
            int iM18453c = C5393m.m18453c();
            if (iM18453c > 0) {
                jSONObject.put("fn", iM18453c / 1000000);
            }
        } catch (Throwable th) {
            Log.w(StatConstants.LOG_TAG, "get cpu error", th);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: t */
    public static String m18444t(Context context) {
        List<Sensor> sensorList;
        if (m18422c(f30164r)) {
            return f30164r;
        }
        try {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            if (sensorManager != null && (sensorList = sensorManager.getSensorList(-1)) != null) {
                StringBuilder sb = new StringBuilder(sensorList.size() * 10);
                for (int i2 = 0; i2 < sensorList.size(); i2++) {
                    sb.append(sensorList.get(i2).getType());
                    if (i2 != sensorList.size() - 1) {
                        sb.append(",");
                    }
                }
                f30164r = sb.toString();
            }
        } catch (Throwable th) {
            f30157k.m18376e(th);
        }
        return f30164r;
    }

    /* JADX INFO: renamed from: u */
    public static synchronized int m18445u(Context context) {
        int i2 = f30167u;
        if (i2 != -1) {
            return i2;
        }
        m18446v(context);
        return f30167u;
    }

    /* JADX INFO: renamed from: v */
    public static void m18446v(Context context) {
        int iM18456a = C5397q.m18456a(context, f30166t, 1);
        f30167u = iM18456a;
        if (iM18456a == 1) {
            C5397q.m18460b(context, f30166t, 0);
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m18447w(Context context) {
        if (f30168v < 0) {
            f30168v = C5397q.m18457a(context, "mta.qq.com.checktime", 0L);
        }
        return Math.abs(System.currentTimeMillis() - f30168v) > 86400000;
    }

    /* JADX INFO: renamed from: x */
    public static void m18448x(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        f30168v = jCurrentTimeMillis;
        C5397q.m18461b(context, "mta.qq.com.checktime", jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: y */
    public static int m18449y(Context context) {
        return C5397q.m18456a(context, "mta.qq.com.difftime", 0);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m18450z(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService(C1873k.f10652g)) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.processName.startsWith(packageName)) {
                if (next.importance == 400) {
                    return true;
                }
            }
        }
        return false;
    }
}
