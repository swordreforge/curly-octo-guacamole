package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class ltg8 {

    /* JADX INFO: renamed from: k */
    private static cfr f33366k = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static int f73471toq = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static String f73472zy;

    static void f7l8(String str) {
        zsr0.toq("Push-DiscntStats", str);
    }

    /* JADX INFO: renamed from: g */
    public static void m21201g(Context context, String str, int i2) {
        if (!m21207y(context)) {
            f7l8("onDisconnection shouldSampling = false");
            return;
        }
        v0af.ld6(context, str, oc.ni7(context), System.currentTimeMillis(), i2, com.xiaomi.push.service.py.zy(context).x2(), m21202k(context), toq(), f73471toq);
        f7l8("onDisconnection");
    }

    /* JADX INFO: renamed from: k */
    private static int m21202k(Context context) {
        String str;
        try {
            lvui lvuiVarM21359n = oc.m21359n();
            if (lvuiVarM21359n == null) {
                m21204p(null);
                return -1;
            }
            if (lvuiVarM21359n.m21210k() != 0) {
                if (lvuiVarM21359n.m21210k() != 1 && lvuiVarM21359n.m21210k() != 6) {
                    m21204p(null);
                    return -1;
                }
                m21204p("WIFI-ID-UNKNOWN");
                return 1;
            }
            String strM21213y = lvuiVarM21359n.m21213y();
            if (TextUtils.isEmpty(strM21213y) || "UNKNOWN".equalsIgnoreCase(strM21213y)) {
                str = null;
            } else {
                str = "M-" + strM21213y;
            }
            m21204p(str);
            return 0;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.jk("DisconnectStatsHelper getNetType occurred error: " + e2.getMessage());
            m21204p(null);
            return -1;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m21203n(Context context, String str) {
        if (!m21207y(context)) {
            f7l8("onWifiChanged shouldSampling = false");
            return;
        }
        f7l8("onWifiChanged wifiDigest = " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m21204p("W-" + str);
    }

    /* JADX INFO: renamed from: p */
    private static synchronized void m21204p(String str) {
        if ("WIFI-ID-UNKNOWN".equals(str)) {
            String str2 = f73472zy;
            if (str2 == null || !str2.startsWith("W-")) {
                f73472zy = null;
            }
        } else {
            f73472zy = str;
        }
        f7l8("updateNetId new networkId = " + str + ", finally netId = " + f73472zy);
    }

    /* JADX INFO: renamed from: q */
    public static void m21205q(Context context, imd imdVar) {
        if (m21207y(context)) {
            if (f33366k == null) {
                f33366k = new cfr(context);
            }
            imdVar.m20985s(f33366k);
            f7l8("startStats");
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m21206s(Context context, imd imdVar) {
        cfr cfrVar = f33366k;
        if (cfrVar != null) {
            imdVar.fu4(cfrVar);
            f33366k = null;
            f7l8("stopStats");
        }
    }

    private static synchronized String toq() {
        return f73472zy;
    }

    /* JADX INFO: renamed from: y */
    private static boolean m21207y(Context context) {
        return zsr0.zy(context);
    }

    public static void zy(Context context) {
        if (!m21207y(context)) {
            f7l8("onReconnection shouldSampling = false");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        f73471toq = m21202k(context);
        v0af.m21896s(context, jCurrentTimeMillis);
        f7l8("onReconnection connectedNetworkType = " + f73471toq);
    }
}
