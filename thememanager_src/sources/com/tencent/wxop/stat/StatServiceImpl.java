package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.common.C5382b;
import com.tencent.wxop.stat.common.C5385e;
import com.tencent.wxop.stat.common.C5392l;
import com.tencent.wxop.stat.common.C5397q;
import com.tencent.wxop.stat.common.StatConstants;
import com.tencent.wxop.stat.common.StatLogger;
import com.tencent.wxop.stat.event.C5401a;
import com.tencent.wxop.stat.event.C5403c;
import com.tencent.wxop.stat.event.C5408h;
import com.tencent.wxop.stat.event.C5411k;
import com.xiaomi.mipush.sdk.C5658n;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class StatServiceImpl {

    /* JADX INFO: renamed from: d */
    private static C5385e f29970d;

    /* JADX INFO: renamed from: e */
    private static volatile Map<C5403c, Long> f29971e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    private static volatile Map<String, Properties> f29972f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    private static volatile Map<Integer, Integer> f29973g = new ConcurrentHashMap(10);

    /* JADX INFO: renamed from: h */
    private static volatile long f29974h = 0;

    /* JADX INFO: renamed from: i */
    private static volatile long f29975i = 0;

    /* JADX INFO: renamed from: j */
    private static volatile long f29976j = 0;

    /* JADX INFO: renamed from: k */
    private static String f29977k = "";

    /* JADX INFO: renamed from: l */
    private static volatile int f29978l = 0;

    /* JADX INFO: renamed from: m */
    private static volatile String f29979m = "";

    /* JADX INFO: renamed from: n */
    private static volatile String f29980n = "";

    /* JADX INFO: renamed from: o */
    private static Map<String, Long> f29981o = new ConcurrentHashMap();

    /* JADX INFO: renamed from: p */
    private static Map<String, Long> f29982p = new ConcurrentHashMap();

    /* JADX INFO: renamed from: q */
    private static StatLogger f29983q = C5392l.m18418b();

    /* JADX INFO: renamed from: r */
    private static Thread.UncaughtExceptionHandler f29984r = null;

    /* JADX INFO: renamed from: s */
    private static volatile boolean f29985s = true;

    /* JADX INFO: renamed from: a */
    static volatile int f29967a = 0;

    /* JADX INFO: renamed from: b */
    static volatile long f29968b = 0;

    /* JADX INFO: renamed from: t */
    private static Context f29986t = null;

    /* JADX INFO: renamed from: c */
    static volatile long f29969c = 0;

    /* JADX INFO: renamed from: a */
    static int m18279a(Context context, boolean z2, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z3 = z2 && jCurrentTimeMillis - f29975i >= ((long) StatConfig.getSessionTimoutMillis());
        f29975i = jCurrentTimeMillis;
        if (f29976j == 0) {
            f29976j = C5392l.m18420c();
        }
        if (jCurrentTimeMillis >= f29976j) {
            f29976j = C5392l.m18420c();
            if (au.m18335a(context).m18368b(context).m18384d() != 1) {
                au.m18335a(context).m18368b(context).m18381a(1);
            }
            StatConfig.m18274b(0);
            f29967a = 0;
            f29977k = C5392l.m18409a(0);
            z3 = true;
        }
        String str = f29977k;
        if (C5392l.m18415a(statSpecifyReportedInfo)) {
            str = statSpecifyReportedInfo.getAppKey() + f29977k;
        }
        if (f29982p.containsKey(str) ? z3 : true) {
            if (C5392l.m18415a(statSpecifyReportedInfo)) {
                m18284a(context, statSpecifyReportedInfo);
            } else if (StatConfig.m18277c() < StatConfig.getMaxDaySessionNumbers()) {
                C5392l.m18446v(context);
                m18284a(context, (StatSpecifyReportedInfo) null);
            } else {
                f29983q.m18375e("Exceed StatConfig.getMaxDaySessionNumbers().");
            }
            f29982p.put(str, 1L);
        }
        if (f29985s) {
            testSpeed(context);
            f29985s = false;
        }
        return f29978l;
    }

    /* JADX INFO: renamed from: a */
    static synchronized void m18282a(Context context) {
        if (context == null) {
            return;
        }
        if (f29970d == null) {
            if (!m18291b(context)) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            f29986t = applicationContext;
            f29970d = new C5385e();
            f29977k = C5392l.m18409a(0);
            f29974h = System.currentTimeMillis() + StatConfig.f29944i;
            f29970d.m18389a(new RunnableC5418l(applicationContext));
        }
    }

    /* JADX INFO: renamed from: a */
    static void m18284a(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (m18292c(context) != null) {
            if (StatConfig.isDebugEnable()) {
                f29983q.m18374d("start new session.");
            }
            if (statSpecifyReportedInfo == null || f29978l == 0) {
                f29978l = C5392l.m18406a();
            }
            StatConfig.m18265a(0);
            StatConfig.m18273b();
            new aq(new C5411k(context, f29978l, m18289b(), statSpecifyReportedInfo)).m18332a();
        }
    }

    /* JADX INFO: renamed from: a */
    static void m18285a(Context context, Throwable th) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f29983q.error("The Context of StatService.reportSdkSelfException() can not be null!");
            } else if (m18292c(context2) != null) {
                f29970d.m18389a(new RunnableC5423q(context2, th));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m18286a() {
        if (f29967a < 2) {
            return false;
        }
        f29968b = System.currentTimeMillis();
        return true;
    }

    /* JADX INFO: renamed from: a */
    static boolean m18287a(String str) {
        return str == null || str.length() == 0;
    }

    /* JADX INFO: renamed from: b */
    static JSONObject m18289b() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            int i2 = StatConfig.f29937b.f30218d;
            if (i2 != 0) {
                jSONObject2.put("v", i2);
            }
            jSONObject.put(Integer.toString(StatConfig.f29937b.f30215a), jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            int i3 = StatConfig.f29936a.f30218d;
            if (i3 != 0) {
                jSONObject3.put("v", i3);
            }
            jSONObject.put(Integer.toString(StatConfig.f29936a.f30215a), jSONObject3);
        } catch (JSONException e2) {
            f29983q.m18376e((Throwable) e2);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m18290b(Context context, StatAccount statAccount, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        try {
            new aq(new C5401a(context, m18279a(context, false, statSpecifyReportedInfo), statAccount, statSpecifyReportedInfo)).m18332a();
        } catch (Throwable th) {
            f29983q.m18376e(th);
            m18285a(context, th);
        }
    }

    /* JADX INFO: renamed from: b */
    static boolean m18291b(Context context) {
        boolean z2;
        long jM18457a = C5397q.m18457a(context, StatConfig.f29938c, 0L);
        long jM18417b = C5392l.m18417b(StatConstants.VERSION);
        boolean z3 = false;
        if (jM18417b <= jM18457a) {
            f29983q.error("MTA is disable for current version:" + jM18417b + ",wakeup version:" + jM18457a);
            z2 = false;
        } else {
            z2 = true;
        }
        long jM18457a2 = C5397q.m18457a(context, StatConfig.f29939d, 0L);
        if (jM18457a2 > System.currentTimeMillis()) {
            f29983q.error("MTA is disable for current time:" + System.currentTimeMillis() + ",wakeup time:" + jM18457a2);
        } else {
            z3 = z2;
        }
        StatConfig.setEnableStatService(z3);
        return z3;
    }

    /* JADX INFO: renamed from: c */
    static C5385e m18292c(Context context) {
        if (f29970d == null) {
            synchronized (StatServiceImpl.class) {
                if (f29970d == null) {
                    try {
                        m18282a(context);
                    } catch (Throwable th) {
                        f29983q.error(th);
                        StatConfig.setEnableStatService(false);
                    }
                }
            }
        }
        return f29970d;
    }

    /* JADX INFO: renamed from: c */
    static void m18294c() {
        f29967a = 0;
        f29968b = 0L;
    }

    public static void commitEvents(Context context, int i2) {
        StatLogger statLogger;
        String str;
        if (StatConfig.isEnableStatService()) {
            if (StatConfig.isDebugEnable()) {
                f29983q.m18377i("commitEvents, maxNumber=" + i2);
            }
            Context context2 = getContext(context);
            if (context2 == null) {
                statLogger = f29983q;
                str = "The Context of StatService.commitEvents() can not be null!";
            } else {
                if (i2 >= -1 && i2 != 0) {
                    if (C5378a.m18307a(f29986t).m18320f() && m18292c(context2) != null) {
                        f29970d.m18389a(new ad(context2, i2));
                        return;
                    }
                    return;
                }
                statLogger = f29983q;
                str = "The maxNumber of StatService.commitEvents() should be -1 or bigger than 0.";
            }
            statLogger.error(str);
        }
    }

    /* JADX INFO: renamed from: d */
    static void m18295d() {
        f29967a++;
        f29968b = System.currentTimeMillis();
        flushDataToDB(f29986t);
    }

    /* JADX INFO: renamed from: d */
    static void m18296d(Context context) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f29983q.error("The Context of StatService.sendNetworkDetector() can not be null!");
                return;
            }
            try {
                C5415i.m18501b(context2).m18502a(new C5408h(context2), new C5426t());
            } catch (Throwable th) {
                f29983q.m18376e(th);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    static void m18298e(Context context) {
        f29969c = System.currentTimeMillis() + ((long) (StatConfig.getSendPeriodMinutes() * 60000));
        C5397q.m18461b(context, "last_period_ts", f29969c);
        commitEvents(context, -1);
    }

    public static void flushDataToDB(Context context) {
        if (StatConfig.isEnableStatService() && StatConfig.f29948m > 0) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f29983q.error("The Context of StatService.testSpeed() can not be null!");
            } else {
                au.m18335a(context2).m18369c();
            }
        }
    }

    public static Properties getCommonKeyValueForKVEvent(String str) {
        return f29972f.get(str);
    }

    public static Context getContext(Context context) {
        return context != null ? context : f29986t;
    }

    public static void onLowMemory(Context context) {
        if (StatConfig.isEnableStatService() && m18292c(getContext(context)) != null) {
            f29970d.m18389a(new RunnableC5421o(context));
        }
    }

    public static void onPause(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService() && m18292c(context) != null) {
            f29970d.m18389a(new RunnableC5419m(context, statSpecifyReportedInfo));
        }
    }

    public static void onResume(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService() && m18292c(context) != null) {
            f29970d.m18389a(new aj(context, statSpecifyReportedInfo));
        }
    }

    public static void onStop(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (m18292c(context2) != null) {
                f29970d.m18389a(new RunnableC5420n(context2));
            }
        }
    }

    public static void reportAccount(Context context, StatAccount statAccount, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f29983q.m18375e("context is null in reportAccount.");
            } else if (m18292c(context2) != null) {
                f29970d.m18389a(new al(statAccount, context2, statSpecifyReportedInfo));
            }
        }
    }

    public static void reportAppMonitorStat(Context context, StatAppMonitor statAppMonitor, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        StatLogger statLogger;
        String str;
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                statLogger = f29983q;
                str = "The Context of StatService.reportAppMonitorStat() can not be null!";
            } else if (statAppMonitor == null) {
                statLogger = f29983q;
                str = "The StatAppMonitor of StatService.reportAppMonitorStat() can not be null!";
            } else {
                if (statAppMonitor.getInterfaceName() != null) {
                    StatAppMonitor statAppMonitorM28270clone = statAppMonitor.m28270clone();
                    if (m18292c(context2) != null) {
                        f29970d.m18389a(new aa(context2, statSpecifyReportedInfo, statAppMonitorM28270clone));
                        return;
                    }
                    return;
                }
                statLogger = f29983q;
                str = "The interfaceName of StatAppMonitor on StatService.reportAppMonitorStat() can not be null!";
            }
            statLogger.error(str);
        }
    }

    public static void reportError(Context context, String str, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f29983q.error("The Context of StatService.reportError() can not be null!");
            } else if (m18292c(context2) != null) {
                f29970d.m18389a(new RunnableC5422p(str, context2, statSpecifyReportedInfo));
            }
        }
    }

    public static void reportException(Context context, Throwable th, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f29983q.error("The Context of StatService.reportException() can not be null!");
            } else if (m18292c(context2) != null) {
                f29970d.m18389a(new RunnableC5424r(th, context2, statSpecifyReportedInfo));
            }
        }
    }

    public static void reportGameUser(Context context, StatGameUser statGameUser, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f29983q.error("The Context of StatService.reportGameUser() can not be null!");
            } else if (m18292c(context2) != null) {
                f29970d.m18389a(new am(statGameUser, context2, statSpecifyReportedInfo));
            }
        }
    }

    public static void reportQQ(Context context, String str, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f29983q.error("context is null in reportQQ()");
            } else if (m18292c(context2) != null) {
                f29970d.m18389a(new ak(str, context2, statSpecifyReportedInfo));
            }
        }
    }

    public static void setCommonKeyValueForKVEvent(String str, Properties properties) {
        if (!C5392l.m18422c(str)) {
            f29983q.m18375e("event_id or commonProp for setCommonKeyValueForKVEvent is invalid.");
        } else if (properties == null || properties.size() <= 0) {
            f29972f.remove(str);
        } else {
            f29972f.put(str, (Properties) properties.clone());
        }
    }

    public static void setContext(Context context) {
        if (context != null) {
            f29986t = context.getApplicationContext();
        }
    }

    public static void setEnvAttributes(Context context, Map<String, String> map) {
        if (map == null || map.size() > 512) {
            f29983q.error("The map in setEnvAttributes can't be null or its size can't exceed 512.");
            return;
        }
        try {
            C5382b.m18386a(context, map);
        } catch (JSONException e2) {
            f29983q.m18376e((Throwable) e2);
        }
    }

    public static void startNewSession(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f29983q.error("The Context of StatService.startNewSession() can not be null!");
            } else if (m18292c(context2) != null) {
                f29970d.m18389a(new ai(context2, statSpecifyReportedInfo));
            }
        }
    }

    public static boolean startStatService(Context context, String str, String str2, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        try {
            if (!StatConfig.isEnableStatService()) {
                f29983q.error("MTA StatService is disable.");
                return false;
            }
            if (StatConfig.isDebugEnable()) {
                f29983q.m18374d("MTA SDK version, current: " + StatConstants.VERSION + " ,required: " + str2);
            }
            if (context != null && str2 != null) {
                if (C5392l.m18417b(StatConstants.VERSION) >= C5392l.m18417b(str2)) {
                    String installChannel = StatConfig.getInstallChannel(context);
                    if (installChannel == null || installChannel.length() == 0) {
                        StatConfig.setInstallChannel(C5658n.f73185t8r);
                    }
                    if (str != null) {
                        StatConfig.setAppKey(context, str);
                    }
                    if (m18292c(context) == null) {
                        return true;
                    }
                    f29970d.m18389a(new an(context, statSpecifyReportedInfo));
                    return true;
                }
                f29983q.error(("MTA SDK version conflicted, current: " + StatConstants.VERSION + ",required: " + str2) + ". please delete the current SDK and download the latest one. official website: http://mta.qq.com/ or http://mta.oa.com/");
                StatConfig.setEnableStatService(false);
                return false;
            }
            f29983q.error("Context or mtaSdkVersion in StatService.startStatService() is null, please check it!");
            StatConfig.setEnableStatService(false);
            return false;
        } catch (Throwable th) {
            f29983q.m18376e(th);
            return false;
        }
    }

    public static void stopSession() {
        f29975i = 0L;
    }

    public static void testSpeed(Context context) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f29983q.error("The Context of StatService.testSpeed() can not be null!");
            } else if (m18292c(context2) != null) {
                f29970d.m18389a(new ae(context2));
            }
        }
    }

    public static void testSpeed(Context context, Map<String, Integer> map, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        StatLogger statLogger;
        String str;
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                statLogger = f29983q;
                str = "The Context of StatService.testSpeed() can not be null!";
            } else {
                if (map != null && map.size() != 0) {
                    HashMap map2 = new HashMap(map);
                    if (m18292c(context2) != null) {
                        f29970d.m18389a(new af(context2, map2, statSpecifyReportedInfo));
                        return;
                    }
                    return;
                }
                statLogger = f29983q;
                str = "The domainMap of StatService.testSpeed() can not be null or empty!";
            }
            statLogger.error(str);
        }
    }

    public static void trackBeginPage(Context context, String str, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null || str == null || str.length() == 0) {
                f29983q.error("The Context or pageName of StatService.trackBeginPage() can not be null or empty!");
                return;
            }
            String str2 = new String(str);
            if (m18292c(context2) != null) {
                f29970d.m18389a(new RunnableC5429w(str2, context2, statSpecifyReportedInfo));
            }
        }
    }

    public static void trackCustomBeginEvent(Context context, String str, StatSpecifyReportedInfo statSpecifyReportedInfo, String... strArr) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f29983q.error("The Context of StatService.trackCustomBeginEvent() can not be null!");
                return;
            }
            C5403c c5403c = new C5403c(str, strArr, null);
            if (m18292c(context2) != null) {
                f29970d.m18389a(new RunnableC5428v(str, c5403c, context2));
            }
        }
    }

    public static void trackCustomBeginKVEvent(Context context, String str, Properties properties, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f29983q.error("The Context of StatService.trackCustomBeginEvent() can not be null!");
                return;
            }
            C5403c c5403c = new C5403c(str, null, properties);
            if (m18292c(context2) != null) {
                f29970d.m18389a(new RunnableC5431y(str, c5403c, context2));
            }
        }
    }

    public static void trackCustomEndEvent(Context context, String str, StatSpecifyReportedInfo statSpecifyReportedInfo, String... strArr) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f29983q.error("The Context of StatService.trackCustomEndEvent() can not be null!");
                return;
            }
            C5403c c5403c = new C5403c(str, strArr, null);
            if (m18292c(context2) != null) {
                f29970d.m18389a(new RunnableC5430x(str, c5403c, context2, statSpecifyReportedInfo));
            }
        }
    }

    public static void trackCustomEndKVEvent(Context context, String str, Properties properties, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f29983q.error("The Context of StatService.trackCustomEndEvent() can not be null!");
                return;
            }
            C5403c c5403c = new C5403c(str, null, properties);
            if (m18292c(context2) != null) {
                f29970d.m18389a(new RunnableC5432z(str, c5403c, context2, statSpecifyReportedInfo));
            }
        }
    }

    public static void trackCustomEvent(Context context, String str, StatSpecifyReportedInfo statSpecifyReportedInfo, String... strArr) {
        StatLogger statLogger;
        String str2;
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                statLogger = f29983q;
                str2 = "The Context of StatService.trackCustomEvent() can not be null!";
            } else {
                if (!m18287a(str)) {
                    C5403c c5403c = new C5403c(str, strArr, null);
                    if (m18292c(context2) != null) {
                        f29970d.m18389a(new RunnableC5425s(context2, statSpecifyReportedInfo, c5403c));
                        return;
                    }
                    return;
                }
                statLogger = f29983q;
                str2 = "The event_id of StatService.trackCustomEvent() can not be null or empty.";
            }
            statLogger.error(str2);
        }
    }

    public static void trackCustomKVEvent(Context context, String str, Properties properties, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        StatLogger statLogger;
        String str2;
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                statLogger = f29983q;
                str2 = "The Context of StatService.trackCustomEvent() can not be null!";
            } else {
                if (!m18287a(str)) {
                    C5403c c5403c = new C5403c(str, null, properties);
                    if (m18292c(context2) != null) {
                        f29970d.m18389a(new RunnableC5427u(context2, statSpecifyReportedInfo, c5403c));
                        return;
                    }
                    return;
                }
                statLogger = f29983q;
                str2 = "The event_id of StatService.trackCustomEvent() can not be null or empty.";
            }
            statLogger.error(str2);
        }
    }

    public static void trackCustomKVTimeIntervalEvent(Context context, String str, Properties properties, int i2, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        StatLogger statLogger;
        String str2;
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                statLogger = f29983q;
                str2 = "The Context of StatService.trackCustomEndEvent() can not be null!";
            } else {
                if (!m18287a(str)) {
                    C5403c c5403c = new C5403c(str, null, properties);
                    if (m18292c(context2) != null) {
                        f29970d.m18389a(new ac(context2, statSpecifyReportedInfo, c5403c, i2));
                        return;
                    }
                    return;
                }
                statLogger = f29983q;
                str2 = "The event_id of StatService.trackCustomEndEvent() can not be null or empty.";
            }
            statLogger.error(str2);
        }
    }

    public static void trackCustomTimeIntervalEvent(Context context, int i2, String str, String... strArr) {
        StatLogger statLogger;
        String str2;
        if (StatConfig.isEnableStatService()) {
            if (i2 <= 0) {
                statLogger = f29983q;
                str2 = "The intervalSecond of StatService.trackCustomTimeIntervalEvent() can must bigger than 0!";
            } else {
                Context context2 = getContext(context);
                if (context2 != null) {
                    if (m18292c(context2) != null) {
                        f29970d.m18389a(new ab());
                        return;
                    }
                    return;
                }
                statLogger = f29983q;
                str2 = "The Context of StatService.trackCustomTimeIntervalEvent() can not be null!";
            }
            statLogger.error(str2);
        }
    }

    public static void trackEndPage(Context context, String str, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null || str == null || str.length() == 0) {
                f29983q.error("The Context or pageName of StatService.trackEndPage() can not be null or empty!");
                return;
            }
            String str2 = new String(str);
            if (m18292c(context2) != null) {
                f29970d.m18389a(new ah(context2, str2, statSpecifyReportedInfo));
            }
        }
    }
}
