package com.xiaomi.onetrack.api;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.util.C5776i;
import com.xiaomi.onetrack.util.C5804p;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.a */
/* JADX INFO: loaded from: classes3.dex */
public class C5684a {

    /* JADX INFO: renamed from: a */
    public static final String f31619a = "action";

    /* JADX INFO: renamed from: b */
    private static final String f31620b = "AppActiveBroadcastManager";

    /* JADX INFO: renamed from: c */
    private static volatile C5684a f31621c = null;

    /* JADX INFO: renamed from: d */
    private static final String f31622d = "content://com.miui.analytics.OneTrackProvider/traceId";

    /* JADX INFO: renamed from: e */
    private static final String f31623e = "traceId";

    /* JADX INFO: renamed from: f */
    private static final String f31624f = "pkg";

    /* JADX INFO: renamed from: g */
    private static final String f31625g = "sign";

    /* JADX INFO: renamed from: j */
    private static String f31626j = null;

    /* JADX INFO: renamed from: k */
    private static final String f31627k = "package";

    /* JADX INFO: renamed from: l */
    private static final String f31628l = "installer";

    /* JADX INFO: renamed from: m */
    private static final String f31629m = "userId";

    /* JADX INFO: renamed from: n */
    private static final String f31630n = "miuiActiveId";

    /* JADX INFO: renamed from: o */
    private static final String f31631o = "miuiActiveTime";

    /* JADX INFO: renamed from: p */
    private static final String f31632p = "activeTime";

    /* JADX INFO: renamed from: q */
    private static final String f31633q = "queryTime";

    /* JADX INFO: renamed from: r */
    private static final Set<String> f31634r = new HashSet(Arrays.asList("com.xiaomi.xmsf", "com.xiaomi.market", "com.miui.packageinstaller"));

    /* JADX INFO: renamed from: h */
    private final Context f31635h = C5756a.m20048a();

    /* JADX INFO: renamed from: i */
    private final Context f31636i = C5756a.m20053b();

    private C5684a() {
        f31626j = C5756a.m20058e();
    }

    /* JADX INFO: renamed from: b */
    public static void m19691b() {
        if (f31621c == null) {
            synchronized (C5684a.class) {
                if (f31621c == null) {
                    f31621c = new C5684a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static boolean m19694f() {
        try {
            int i2 = C5756a.m20053b().getPackageManager().getPackageInfo("com.miui.analytics", 0).versionCode;
            if (i2 >= 2023010300) {
                return true;
            }
            C5804p.m20342a(f31620b, "not support getTraceId versionCode: " + i2);
        } catch (Throwable th) {
            C5804p.m20347b(f31620b, "isSupportEmptyEvent error:" + th.getMessage());
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m19696c() {
        return f31634r.contains(C5756a.m20053b().getPackageName());
    }

    /* JADX INFO: renamed from: a */
    public static C5684a m19690a() {
        if (f31621c == null) {
            m19691b();
        }
        return f31621c;
    }

    /* JADX INFO: renamed from: a */
    public String m19695a(Intent intent) {
        Exception e2;
        String str;
        FutureTask futureTask = new FutureTask(new CallableC5688b(this, intent));
        long jCurrentTimeMillis = System.currentTimeMillis();
        C5776i.m20256a(futureTask);
        try {
            str = (String) futureTask.get(5L, TimeUnit.SECONDS);
        } catch (Exception e3) {
            e2 = e3;
            str = "";
        }
        try {
            if (C5804p.f32410a) {
                C5804p.m20342a(f31620b, "packageName:" + f31626j + " _start ------getTraceId:" + str + "  _tid:" + Process.myTid());
            }
        } catch (Exception e4) {
            e2 = e4;
            C5804p.m20347b(f31620b, "getTraceId error: " + e2.toString());
        }
        C5804p.m20342a(f31620b, "packageName:" + f31626j + " _end ------getTraceId:" + str + "  _tid:" + Process.myTid() + " diffTime:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        return str;
    }
}
