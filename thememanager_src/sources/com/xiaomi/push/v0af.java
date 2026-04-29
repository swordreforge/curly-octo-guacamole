package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class v0af {

    /* JADX INFO: renamed from: k */
    private static int f34012k;

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void cdj(Context context, String str, boolean z2, long j2, int i2, long j3, int i3, String str2, int i4) {
        SharedPreferences sharedPreferencesZy = zy(context);
        long j4 = sharedPreferencesZy.getLong("start_time_for_day", 0L);
        if (j4 == 0) {
            ltg8.f7l8("recordDisconnection not initialized");
            return;
        }
        if (j2 - sharedPreferencesZy.getLong("last_discnt_time", 0L) < 60000) {
            ltg8.f7l8("recordDisconnection anti-shake");
            return;
        }
        if (j2 - j4 < 86400000) {
            int i5 = sharedPreferencesZy.getInt("discnt_count_in_day", 0);
            if (i5 > 100) {
                ltg8.f7l8("recordDisconnection count > 100 in 24H cycle,abandon.");
                return;
            } else {
                sharedPreferencesZy.edit().putInt("discnt_count_in_day", i5 + 1).apply();
            }
        } else {
            ltg8.f7l8("recordDisconnection with the current time exceeds 24H cycle, go on.");
        }
        int i6 = sharedPreferencesZy.getInt("discnt_count", 0);
        if (i6 == sharedPreferencesZy.getInt("cnt_count", 0)) {
            m21894p(context, str, toq(z2), j2, i2, j3, i3, str2, i4);
            sharedPreferencesZy.edit().putLong("last_discnt_time", j2).putInt("discnt_count", i6 + 1).apply();
        }
        ltg8.f7l8("recordDisconnection complete");
    }

    private static List<r8s8> f7l8(Context context) {
        SharedPreferences sharedPreferencesZy = zy(context);
        String[] strArrX2 = x2(sharedPreferencesZy.getString("host", null));
        if (strArrX2 == null || strArrX2.length <= 0) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("DisconnectStatsSP Cached hosts data is empty,drop.");
            return null;
        }
        String[] strArrX22 = x2(sharedPreferencesZy.getString("network_state", null));
        String[] strArrX23 = x2(sharedPreferencesZy.getString("reason", null));
        String[] strArrX24 = x2(sharedPreferencesZy.getString("ping_interval", null));
        String[] strArrX25 = x2(sharedPreferencesZy.getString("network_type", null));
        String[] strArrX26 = x2(sharedPreferencesZy.getString("wifi_digest", null));
        String[] strArrX27 = x2(sharedPreferencesZy.getString("connected_network_type", null));
        String[] strArrX28 = x2(sharedPreferencesZy.getString("disconnect_time", null));
        String[] strArrX29 = x2(sharedPreferencesZy.getString("connected_time", null));
        String[] strArrX210 = x2(sharedPreferencesZy.getString("xmsf_vc", null));
        String[] strArrX211 = x2(sharedPreferencesZy.getString("android_vc", null));
        if (strArrX22 == null || strArrX23 == null || strArrX24 == null || strArrX25 == null || strArrX26 == null || strArrX27 == null || strArrX28 == null || strArrX29 == null || strArrX210 == null || strArrX211 == null || strArrX2.length != strArrX22.length || strArrX2.length != strArrX23.length || strArrX2.length != strArrX24.length || strArrX2.length != strArrX25.length || strArrX2.length != strArrX26.length || strArrX2.length != strArrX27.length || strArrX2.length != strArrX28.length || strArrX2.length != strArrX29.length || strArrX2.length != strArrX210.length || strArrX2.length != strArrX211.length) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("DisconnectStatsSP Cached data incorrect,drop.");
            return null;
        }
        ArrayList arrayList = new ArrayList(strArrX2.length);
        int i2 = 0;
        while (i2 < strArrX2.length) {
            r8s8 r8s8Var = new r8s8();
            r8s8Var.m21423q(1);
            r8s8Var.m21417g(strArrX2[i2]);
            r8s8Var.m21422p(y3.m22047k(strArrX22[i2], -1));
            r8s8Var.kja0(y3.m22047k(strArrX23[i2], -1));
            String[] strArr = strArrX22;
            String[] strArr2 = strArrX2;
            ArrayList arrayList2 = arrayList;
            r8s8Var.m21421n(y3.toq(strArrX24[i2], -1L));
            r8s8Var.t8r(y3.m22047k(strArrX25[i2], -1));
            r8s8Var.x2(strArrX26[i2]);
            r8s8Var.zurt(y3.m22047k(strArrX27[i2], -1));
            long qVar = y3.toq(strArrX28[i2], -1L);
            long qVar2 = y3.toq(strArrX29[i2], -1L);
            r8s8Var.ld6(qVar2 - qVar);
            r8s8Var.m21418h(qVar);
            r8s8Var.m21419i(qVar2);
            r8s8Var.fu4(y3.m22047k(strArrX210[i2], -1));
            r8s8Var.o1t(y3.m22047k(strArrX211[i2], -1));
            arrayList2.add(r8s8Var);
            i2++;
            strArrX22 = strArr;
            arrayList = arrayList2;
            strArrX24 = strArrX24;
            strArrX23 = strArrX23;
            strArrX2 = strArr2;
            strArrX25 = strArrX25;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    private static String m21890g(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            str2 = "null";
        }
        if (str == null || str.length() <= 0) {
            return str2;
        }
        return str + ";" + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static synchronized void m21891h(Context context, long j2) {
        SharedPreferences sharedPreferencesZy = zy(context);
        long j3 = sharedPreferencesZy.getLong("start_time_for_day", 0L);
        if (j3 == 0) {
            sharedPreferencesZy.edit().putLong("start_time_for_day", j2).putLong("last_discnt_time", 0L).putInt("discnt_count_in_day", 0).putInt("discnt_count", 0).putInt("cnt_count", 0).apply();
            return;
        }
        int i2 = sharedPreferencesZy.getInt("discnt_count", 0);
        int i3 = sharedPreferencesZy.getInt("cnt_count", 0);
        if (i2 > i3) {
            sharedPreferencesZy.edit().putInt("cnt_count", i3 + 1).putString("connected_time", m21893n(sharedPreferencesZy.getString("connected_time", null), j2)).apply();
        }
        if (j2 - j3 >= 86400000) {
            sharedPreferencesZy.edit().putLong("start_time_for_day", j2).putInt("discnt_count_in_day", 0).apply();
            m21897y(context);
        } else if (i2 >= 10) {
            m21897y(context);
        }
    }

    /* JADX INFO: renamed from: k */
    private static int m21892k(Context context) {
        if (f34012k <= 0) {
            f34012k = nc.x2(context);
        }
        return f34012k;
    }

    public static void ld6(Context context, String str, boolean z2, long j2, int i2, long j3, int i3, String str2, int i4) {
        C5889p.toq(context).f7l8(new etdu(context, str, z2, j2, i2, j3, i3, str2, i4));
    }

    /* JADX INFO: renamed from: n */
    private static String m21893n(String str, long j2) {
        return m21890g(str, String.valueOf(j2));
    }

    /* JADX INFO: renamed from: p */
    private static void m21894p(Context context, String str, int i2, long j2, int i3, long j3, int i4, String str2, int i5) {
        ltg8.f7l8(String.format(Locale.US, "recordDisconnectInfo host=%s, netState=%d, currentTimeMillis=%d, reason=%d, pingInterval=%d, netType=%d, wifiDigest=%s, connectedNetType=%d", str, Integer.valueOf(i2), Long.valueOf(j2), Integer.valueOf(i3), Long.valueOf(j3), Integer.valueOf(i4), str2, Integer.valueOf(i5)));
        SharedPreferences sharedPreferencesZy = zy(context);
        String string = sharedPreferencesZy.getString("host", null);
        String string2 = sharedPreferencesZy.getString("network_state", null);
        String string3 = sharedPreferencesZy.getString("reason", null);
        String string4 = sharedPreferencesZy.getString("ping_interval", null);
        String string5 = sharedPreferencesZy.getString("network_type", null);
        String string6 = sharedPreferencesZy.getString("wifi_digest", null);
        String string7 = sharedPreferencesZy.getString("connected_network_type", null);
        String string8 = sharedPreferencesZy.getString("disconnect_time", null);
        String string9 = sharedPreferencesZy.getString("xmsf_vc", null);
        String string10 = sharedPreferencesZy.getString("android_vc", null);
        String strM21890g = m21890g(string, str);
        String strM21895q = m21895q(string2, i2);
        String strM21895q2 = m21895q(string3, i3);
        String strM21893n = m21893n(string4, j3);
        String strM21895q3 = m21895q(string5, i4);
        String strM21890g2 = m21890g(string6, str2);
        String strM21895q4 = m21895q(string7, i5);
        String strM21893n2 = m21893n(string8, j2);
        sharedPreferencesZy.edit().putString("host", strM21890g).putString("network_state", strM21895q).putString("reason", strM21895q2).putString("ping_interval", strM21893n).putString("network_type", strM21895q3).putString("wifi_digest", strM21890g2).putString("connected_network_type", strM21895q4).putString("disconnect_time", strM21893n2).putString("xmsf_vc", m21895q(string9, m21892k(context))).putString("android_vc", m21895q(string10, Build.VERSION.SDK_INT)).apply();
    }

    /* JADX INFO: renamed from: q */
    private static String m21895q(String str, int i2) {
        return m21890g(str, String.valueOf(i2));
    }

    private static void qrj(Context context) {
        ltg8.f7l8("resetAfterUpload");
        zy(context).edit().putString("host", null).putString("network_state", null).putString("reason", null).putString("ping_interval", null).putString("network_type", null).putString("wifi_digest", null).putString("connected_network_type", null).putString("disconnect_time", null).putString("connected_time", null).putLong("last_discnt_time", 0L).putInt("discnt_count", 0).putInt("cnt_count", 0).putString("xmsf_vc", null).putString("android_vc", null).apply();
    }

    /* JADX INFO: renamed from: s */
    public static void m21896s(Context context, long j2) {
        C5889p.toq(context).f7l8(new sok(context, j2));
    }

    private static int toq(boolean z2) {
        return z2 ? 1 : 0;
    }

    private static String[] x2(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.split(";");
    }

    /* JADX INFO: renamed from: y */
    private static void m21897y(Context context) {
        ltg8.f7l8("upload");
        new m4().m21268k(context, f7l8(context));
        qrj(context);
    }

    private static SharedPreferences zy(Context context) {
        return context.getSharedPreferences("sp_disconnect_stats", 0);
    }
}
