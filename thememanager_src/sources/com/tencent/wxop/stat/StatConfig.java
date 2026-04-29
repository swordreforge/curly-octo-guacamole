package com.tencent.wxop.stat;

import android.content.Context;
import com.android.thememanager.lockscreen.lock.wallpaper.kja0;
import com.tencent.p003a.p004a.p005a.p006a.f7l8;
import com.tencent.wxop.stat.common.C5392l;
import com.tencent.wxop.stat.common.C5397q;
import com.tencent.wxop.stat.common.StatConstants;
import com.tencent.wxop.stat.common.StatLogger;
import java.net.URI;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class StatConfig {

    /* JADX INFO: renamed from: B */
    private static String f29918B;

    /* JADX INFO: renamed from: C */
    private static String f29919C;

    /* JADX INFO: renamed from: p */
    private static StatLogger f29951p = C5392l.m18418b();

    /* JADX INFO: renamed from: a */
    static C5412f f29936a = new C5412f(2);

    /* JADX INFO: renamed from: b */
    static C5412f f29937b = new C5412f(1);

    /* JADX INFO: renamed from: q */
    private static StatReportStrategy f29952q = StatReportStrategy.APP_LAUNCH;

    /* JADX INFO: renamed from: r */
    private static boolean f29953r = false;

    /* JADX INFO: renamed from: s */
    private static boolean f29954s = true;

    /* JADX INFO: renamed from: t */
    private static int f29955t = kja0.f12502h;

    /* JADX INFO: renamed from: u */
    private static int f29956u = 100000;

    /* JADX INFO: renamed from: v */
    private static int f29957v = 30;

    /* JADX INFO: renamed from: w */
    private static int f29958w = 10;

    /* JADX INFO: renamed from: x */
    private static int f29959x = 100;

    /* JADX INFO: renamed from: y */
    private static int f29960y = 30;

    /* JADX INFO: renamed from: z */
    private static int f29961z = 1;

    /* JADX INFO: renamed from: c */
    static String f29938c = "__HIBERNATE__";

    /* JADX INFO: renamed from: d */
    static String f29939d = "__HIBERNATE__TIME";

    /* JADX INFO: renamed from: e */
    static String f29940e = "__MTA_KILL__";

    /* JADX INFO: renamed from: A */
    private static String f29917A = null;

    /* JADX INFO: renamed from: D */
    private static String f29920D = "mta_channel";

    /* JADX INFO: renamed from: f */
    static String f29941f = "";

    /* JADX INFO: renamed from: E */
    private static int f29921E = 180;

    /* JADX INFO: renamed from: g */
    static boolean f29942g = false;

    /* JADX INFO: renamed from: h */
    static int f29943h = 100;

    /* JADX INFO: renamed from: i */
    static long f29944i = 10000;

    /* JADX INFO: renamed from: F */
    private static int f29922F = 1024;

    /* JADX INFO: renamed from: j */
    static boolean f29945j = true;

    /* JADX INFO: renamed from: G */
    private static long f29923G = 0;

    /* JADX INFO: renamed from: H */
    private static long f29924H = 300000;
    public static boolean isAutoExceptionCaught = true;

    /* JADX INFO: renamed from: k */
    static volatile String f29946k = StatConstants.MTA_SERVER;

    /* JADX INFO: renamed from: I */
    private static volatile String f29925I = StatConstants.MTA_REPORT_FULL_URL;

    /* JADX INFO: renamed from: J */
    private static int f29926J = 0;

    /* JADX INFO: renamed from: K */
    private static volatile int f29927K = 0;

    /* JADX INFO: renamed from: L */
    private static int f29928L = 20;

    /* JADX INFO: renamed from: M */
    private static int f29929M = 0;

    /* JADX INFO: renamed from: N */
    private static boolean f29930N = false;

    /* JADX INFO: renamed from: O */
    private static int f29931O = 4096;

    /* JADX INFO: renamed from: P */
    private static boolean f29932P = false;

    /* JADX INFO: renamed from: Q */
    private static String f29933Q = null;

    /* JADX INFO: renamed from: R */
    private static boolean f29934R = false;

    /* JADX INFO: renamed from: S */
    private static InterfaceC5413g f29935S = null;

    /* JADX INFO: renamed from: l */
    static boolean f29947l = true;

    /* JADX INFO: renamed from: m */
    static int f29948m = 0;

    /* JADX INFO: renamed from: n */
    static long f29949n = 10000;

    /* JADX INFO: renamed from: o */
    static int f29950o = 512;

    /* JADX INFO: renamed from: a */
    static int m18263a() {
        return f29957v;
    }

    /* JADX INFO: renamed from: a */
    static String m18264a(String str, String str2) {
        String string;
        try {
            string = f29937b.f30216b.getString(str);
        } catch (Throwable unused) {
            f29951p.m18379w("can't find custom key:" + str);
        }
        return string != null ? string : str2;
    }

    /* JADX INFO: renamed from: a */
    static synchronized void m18265a(int i2) {
        f29927K = i2;
    }

    /* JADX INFO: renamed from: a */
    static void m18266a(long j2) {
        C5397q.m18461b(C5415i.m18498a(), f29938c, j2);
        setEnableStatService(false);
        f29951p.warn("MTA is disable for current SDK version");
    }

    /* JADX INFO: renamed from: a */
    static void m18267a(Context context, C5412f c5412f) {
        int i2 = c5412f.f30215a;
        if (i2 != f29937b.f30215a) {
            if (i2 == f29936a.f30215a) {
                f29936a = c5412f;
            }
        } else {
            f29937b = c5412f;
            m18270a(c5412f.f30216b);
            if (f29937b.f30216b.isNull("iplist")) {
                return;
            }
            C5378a.m18307a(context).m18315a(f29937b.f30216b.getString("iplist"));
        }
    }

    /* JADX INFO: renamed from: a */
    static void m18268a(Context context, C5412f c5412f, JSONObject jSONObject) {
        boolean z2 = false;
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.equalsIgnoreCase("v")) {
                    int i2 = jSONObject.getInt(next);
                    if (c5412f.f30218d != i2) {
                        z2 = true;
                    }
                    c5412f.f30218d = i2;
                } else if (next.equalsIgnoreCase("c")) {
                    String string = jSONObject.getString("c");
                    if (string.length() > 0) {
                        c5412f.f30216b = new JSONObject(string);
                    }
                } else if (next.equalsIgnoreCase("m")) {
                    c5412f.f30217c = jSONObject.getString("m");
                }
            }
            if (z2) {
                au auVarM18335a = au.m18335a(C5415i.m18498a());
                if (auVarM18335a != null) {
                    auVarM18335a.m18365a(c5412f);
                }
                if (c5412f.f30215a == f29937b.f30215a) {
                    m18270a(c5412f.f30216b);
                    m18276b(c5412f.f30216b);
                }
            }
            m18267a(context, c5412f);
        } catch (JSONException e2) {
            f29951p.m18376e((Throwable) e2);
        }
    }

    /* JADX INFO: renamed from: a */
    static void m18269a(Context context, JSONObject jSONObject) {
        JSONObject jSONObject2;
        C5412f c5412f;
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.equalsIgnoreCase(Integer.toString(f29937b.f30215a))) {
                    jSONObject2 = jSONObject.getJSONObject(next);
                    c5412f = f29937b;
                } else if (next.equalsIgnoreCase(Integer.toString(f29936a.f30215a))) {
                    jSONObject2 = jSONObject.getJSONObject(next);
                    c5412f = f29936a;
                } else {
                    if (!next.equalsIgnoreCase("rs")) {
                        return;
                    }
                    StatReportStrategy statReportStrategy = StatReportStrategy.getStatReportStrategy(jSONObject.getInt(next));
                    if (statReportStrategy != null) {
                        f29952q = statReportStrategy;
                        if (isDebugEnable()) {
                            f29951p.m18374d("Change to ReportStrategy:" + statReportStrategy.name());
                        }
                    }
                }
                m18268a(context, c5412f, jSONObject2);
            }
        } catch (JSONException e2) {
            f29951p.m18376e((Throwable) e2);
        }
    }

    /* JADX INFO: renamed from: a */
    static void m18270a(JSONObject jSONObject) {
        try {
            StatReportStrategy statReportStrategy = StatReportStrategy.getStatReportStrategy(jSONObject.getInt("rs"));
            if (statReportStrategy != null) {
                setStatSendStrategy(statReportStrategy);
            }
        } catch (JSONException unused) {
            if (isDebugEnable()) {
                f29951p.m18377i("rs not found.");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m18271a(int i2, int i3, int i4) {
        return i2 >= i3 && i2 <= i4;
    }

    /* JADX INFO: renamed from: a */
    static boolean m18272a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject.isNull(str)) {
            return false;
        }
        String strOptString = jSONObject.optString(str);
        return C5392l.m18422c(str2) && C5392l.m18422c(strOptString) && str2.equalsIgnoreCase(strOptString);
    }

    /* JADX INFO: renamed from: b */
    static void m18273b() {
        f29929M++;
    }

    /* JADX INFO: renamed from: b */
    static void m18274b(int i2) {
        if (i2 < 0) {
            return;
        }
        f29929M = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: Exception -> 0x01a7, TryCatch #0 {Exception -> 0x01a7, blocks: (B:3:0x0004, B:5:0x0010, B:8:0x001c, B:10:0x0023, B:12:0x002b, B:13:0x002d, B:19:0x0040, B:21:0x0046, B:22:0x005e, B:14:0x0032, B:16:0x0036, B:23:0x0077, B:25:0x0080, B:26:0x0088, B:28:0x0092, B:29:0x00a6, B:31:0x00b2, B:32:0x00ca, B:34:0x00e0, B:35:0x00f4, B:38:0x010c, B:39:0x011e, B:41:0x0132, B:42:0x0144, B:44:0x0158, B:45:0x0178, B:47:0x0184, B:50:0x019f), top: B:55:0x0004 }] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void m18275b(android.content.Context r8, org.json.JSONObject r9) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.StatConfig.m18275b(android.content.Context, org.json.JSONObject):void");
    }

    /* JADX INFO: renamed from: b */
    static void m18276b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        try {
            m18275b(C5415i.m18498a(), jSONObject);
            String string = jSONObject.getString(f29938c);
            if (isDebugEnable()) {
                f29951p.m18374d("hibernateVer:" + string + ", current version:2.0.4");
            }
            long jM18417b = C5392l.m18417b(string);
            if (C5392l.m18417b(StatConstants.VERSION) <= jM18417b) {
                m18266a(jM18417b);
            }
        } catch (JSONException unused) {
            f29951p.m18374d("__HIBERNATE__ not found.");
        }
    }

    /* JADX INFO: renamed from: c */
    static int m18277c() {
        return f29929M;
    }

    public static synchronized String getAppKey(Context context) {
        return f29918B;
    }

    public static int getCurSessionStatReportCount() {
        return f29927K;
    }

    public static InterfaceC5413g getCustomLogger() {
        return f29935S;
    }

    public static String getCustomProperty(String str) {
        try {
            return f29936a.f30216b.getString(str);
        } catch (Throwable th) {
            f29951p.m18376e(th);
            return null;
        }
    }

    public static String getCustomProperty(String str, String str2) {
        String string;
        try {
            string = f29936a.f30216b.getString(str);
        } catch (Throwable th) {
            f29951p.m18376e(th);
        }
        return string != null ? string : str2;
    }

    public static String getCustomUserId(Context context) {
        if (context == null) {
            f29951p.error("Context for getCustomUid is null.");
            return null;
        }
        if (f29933Q == null) {
            f29933Q = C5397q.m18459a(context, "MTA_CUSTOM_UID", "");
        }
        return f29933Q;
    }

    public static long getFlushDBSpaceMS() {
        return f29949n;
    }

    public static synchronized String getInstallChannel(Context context) {
        return f29919C;
    }

    public static String getLocalMidOnly(Context context) {
        return context != null ? f7l8.m18225k(context).m18226q().m18237k() : "0";
    }

    public static int getMaxBatchReportCount() {
        return f29960y;
    }

    public static int getMaxDaySessionNumbers() {
        return f29928L;
    }

    public static int getMaxImportantDataSendRetryCount() {
        return f29959x;
    }

    public static int getMaxParallelTimmingEvents() {
        return f29922F;
    }

    public static int getMaxReportEventLength() {
        return f29931O;
    }

    public static int getMaxSendRetryCount() {
        return f29958w;
    }

    public static int getMaxSessionStatReportCount() {
        return f29926J;
    }

    public static int getMaxStoreEventCount() {
        return f29956u;
    }

    public static String getMid(Context context) {
        return getLocalMidOnly(context);
    }

    public static long getMsPeriodForMethodsCalledLimitClear() {
        return f29944i;
    }

    public static int getNumEventsCachedInMemory() {
        return f29948m;
    }

    public static int getNumEventsCommitPerSec() {
        return f29961z;
    }

    public static int getNumOfMethodsCalledLimit() {
        return f29943h;
    }

    public static String getQQ(Context context) {
        return C5397q.m18459a(context, "mta.acc.qq", f29941f);
    }

    public static int getReportCompressedSize() {
        return f29950o;
    }

    public static int getSendPeriodMinutes() {
        return f29921E;
    }

    public static int getSessionTimoutMillis() {
        return f29955t;
    }

    public static String getStatReportHost() {
        return f29946k;
    }

    public static String getStatReportUrl() {
        return f29925I;
    }

    public static StatReportStrategy getStatSendStrategy() {
        return f29952q;
    }

    public static boolean isAutoExceptionCaught() {
        return isAutoExceptionCaught;
    }

    public static boolean isDebugEnable() {
        return f29953r;
    }

    public static boolean isEnableConcurrentProcess() {
        return f29932P;
    }

    public static boolean isEnableSmartReporting() {
        return f29945j;
    }

    public static boolean isEnableStatService() {
        return f29954s;
    }

    public static boolean isReportEventsByOrder() {
        return f29947l;
    }

    public static boolean isXGProMode() {
        return f29934R;
    }

    public static void setAppKey(Context context, String str) {
        StatLogger statLogger;
        String str2;
        if (context == null) {
            statLogger = f29951p;
            str2 = "ctx in StatConfig.setAppKey() is null";
        } else if (str != null && str.length() <= 256) {
            f29918B = str;
            return;
        } else {
            statLogger = f29951p;
            str2 = "appkey in StatConfig.setAppKey() is null or exceed 256 bytes";
        }
        statLogger.error(str2);
    }

    public static void setAppKey(String str) {
        StatLogger statLogger;
        String str2;
        if (str == null) {
            statLogger = f29951p;
            str2 = "appkey in StatConfig.setAppKey() is null";
        } else if (str.length() <= 256) {
            f29918B = str;
            return;
        } else {
            statLogger = f29951p;
            str2 = "The length of appkey cann't exceed 256 bytes.";
        }
        statLogger.error(str2);
    }

    public static void setAutoExceptionCaught(boolean z2) {
        isAutoExceptionCaught = z2;
    }

    public static void setCustomLogger(InterfaceC5413g interfaceC5413g) {
        f29935S = interfaceC5413g;
    }

    public static void setCustomUserId(Context context, String str) {
        if (context == null) {
            f29951p.error("Context for setCustomUid is null.");
        } else {
            C5397q.m18462b(context, "MTA_CUSTOM_UID", str);
            f29933Q = str;
        }
    }

    public static void setDebugEnable(boolean z2) {
        f29953r = z2;
        C5392l.m18418b().setDebugEnable(z2);
    }

    public static void setEnableConcurrentProcess(boolean z2) {
        f29932P = z2;
    }

    public static void setEnableSmartReporting(boolean z2) {
        f29945j = z2;
    }

    public static void setEnableStatService(boolean z2) {
        f29954s = z2;
        if (z2) {
            return;
        }
        f29951p.warn("!!!!!!MTA StatService has been disabled!!!!!!");
    }

    public static void setFlushDBSpaceMS(long j2) {
        if (j2 > 0) {
            f29949n = j2;
        }
    }

    public static void setInstallChannel(Context context, String str) {
        if (str.length() > 128) {
            f29951p.error("the length of installChannel can not exceed the range of 128 bytes.");
        } else {
            f29919C = str;
        }
    }

    public static void setInstallChannel(String str) {
        f29919C = str;
    }

    public static void setMaxBatchReportCount(int i2) {
        if (m18271a(i2, 2, 1000)) {
            f29960y = i2;
        } else {
            f29951p.error("setMaxBatchReportCount can not exceed the range of [2,1000].");
        }
    }

    public static void setMaxDaySessionNumbers(int i2) {
        if (i2 <= 0) {
            f29951p.m18375e("maxDaySessionNumbers must be greater than 0.");
        } else {
            f29928L = i2;
        }
    }

    public static void setMaxImportantDataSendRetryCount(int i2) {
        if (i2 > 100) {
            f29959x = i2;
        }
    }

    public static void setMaxParallelTimmingEvents(int i2) {
        if (m18271a(i2, 1, 4096)) {
            f29922F = i2;
        } else {
            f29951p.error("setMaxParallelTimmingEvents can not exceed the range of [1, 4096].");
        }
    }

    public static void setMaxReportEventLength(int i2) {
        if (i2 <= 0) {
            f29951p.error("maxReportEventLength on setMaxReportEventLength() must greater than 0.");
        } else {
            f29931O = i2;
        }
    }

    public static void setMaxSendRetryCount(int i2) {
        if (m18271a(i2, 1, 1000)) {
            f29958w = i2;
        } else {
            f29951p.error("setMaxSendRetryCount can not exceed the range of [1,1000].");
        }
    }

    public static void setMaxSessionStatReportCount(int i2) {
        if (i2 < 0) {
            f29951p.error("maxSessionStatReportCount cannot be less than 0.");
        } else {
            f29926J = i2;
        }
    }

    public static void setMaxStoreEventCount(int i2) {
        if (m18271a(i2, 0, 500000)) {
            f29956u = i2;
        } else {
            f29951p.error("setMaxStoreEventCount can not exceed the range of [0, 500000].");
        }
    }

    public static void setNumEventsCachedInMemory(int i2) {
        if (i2 >= 0) {
            f29948m = i2;
        }
    }

    public static void setNumEventsCommitPerSec(int i2) {
        if (i2 > 0) {
            f29961z = i2;
        }
    }

    public static void setNumOfMethodsCalledLimit(int i2, long j2) {
        f29943h = i2;
        if (j2 >= 1000) {
            f29944i = j2;
        }
    }

    public static void setQQ(Context context, String str) {
        C5397q.m18462b(context, "mta.acc.qq", str);
        f29941f = str;
    }

    public static void setReportCompressedSize(int i2) {
        if (i2 > 0) {
            f29950o = i2;
        }
    }

    public static void setReportEventsByOrder(boolean z2) {
        f29947l = z2;
    }

    public static void setSendPeriodMinutes(int i2) {
        if (m18271a(i2, 1, 10080)) {
            f29921E = i2;
        } else {
            f29951p.error("setSendPeriodMinutes can not exceed the range of [1, 7*24*60] minutes.");
        }
    }

    public static void setSessionTimoutMillis(int i2) {
        if (m18271a(i2, 1000, 86400000)) {
            f29955t = i2;
        } else {
            f29951p.error("setSessionTimoutMillis can not exceed the range of [1000, 24 * 60 * 60 * 1000].");
        }
    }

    public static void setStatReportUrl(String str) {
        if (str == null || str.length() == 0) {
            f29951p.error("statReportUrl cannot be null or empty.");
            return;
        }
        f29925I = str;
        try {
            f29946k = new URI(f29925I).getHost();
        } catch (Exception e2) {
            f29951p.m18379w(e2);
        }
        if (isDebugEnable()) {
            f29951p.m18377i("url:" + f29925I + ", domain:" + f29946k);
        }
    }

    public static void setStatSendStrategy(StatReportStrategy statReportStrategy) {
        f29952q = statReportStrategy;
        if (statReportStrategy != StatReportStrategy.PERIOD) {
            StatServiceImpl.f29969c = 0L;
        }
        if (isDebugEnable()) {
            f29951p.m18374d("Change to statSendStrategy: " + statReportStrategy);
        }
    }

    public static void setXGProMode(boolean z2) {
        f29934R = z2;
    }
}
