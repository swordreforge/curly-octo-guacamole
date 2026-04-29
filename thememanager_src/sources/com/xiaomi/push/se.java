package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public class se {

    /* JADX INFO: renamed from: k */
    private static int f33652k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static boolean f73552toq = true;

    public static void f7l8(Context context, long j2, boolean z2) {
        C5889p.toq(context).f7l8(new gc3c(context, j2, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void fn3e(Context context, long j2, boolean z2) {
        int i2;
        yqrt.zy("recordPong start");
        int qVar = toq(z2);
        SharedPreferences sharedPreferencesZy = zy(context);
        long j3 = sharedPreferencesZy.getLong("start_time", 0L);
        if (j3 <= 0) {
            m21477y(context, sharedPreferencesZy, j2, qVar);
        }
        if (qVar == 1) {
            i2 = sharedPreferencesZy.getInt("on_pong_count", 0) + 1;
            sharedPreferencesZy.edit().putInt("on_pong_count", i2).apply();
        } else {
            i2 = sharedPreferencesZy.getInt("off_pong_count", 0) + 1;
            sharedPreferencesZy.edit().putInt("off_pong_count", i2).apply();
        }
        m21469g(context, j3, j2, i2, qVar);
        yqrt.zy("recordPong complete");
    }

    /* JADX INFO: renamed from: g */
    private static void m21469g(Context context, long j2, long j3, int i2, int i3) {
        if (j2 > 0) {
            if (m21476s(context) || i2 >= 1073741823 || j3 - j2 >= 86400000) {
                zy(context).edit().putLong("end_time", j3).apply();
                m21473n(context, j3, i3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static synchronized void m21471i(Context context, long j2, boolean z2) {
        int i2;
        yqrt.zy("recordPing start");
        int qVar = toq(z2);
        SharedPreferences sharedPreferencesZy = zy(context);
        long j3 = sharedPreferencesZy.getLong("start_time", 0L);
        if (j3 <= 0) {
            m21477y(context, sharedPreferencesZy, j2, qVar);
        }
        if (qVar == 1) {
            i2 = sharedPreferencesZy.getInt("on_ping_count", 0) + 1;
            sharedPreferencesZy.edit().putInt("on_ping_count", i2).apply();
        } else {
            i2 = sharedPreferencesZy.getInt("off_ping_count", 0) + 1;
            sharedPreferencesZy.edit().putInt("off_ping_count", i2).apply();
        }
        m21469g(context, j3, j2, i2, qVar);
        yqrt.zy("recordPing complete");
    }

    /* JADX INFO: renamed from: k */
    private static int m21472k(Context context) {
        if (f33652k <= 0) {
            f33652k = nc.x2(context);
        }
        return f33652k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void ki(Context context, long j2, boolean z2) {
        int i2;
        yqrt.zy("recordSendMsg start");
        int qVar = toq(z2);
        SharedPreferences sharedPreferencesZy = zy(context);
        long j3 = sharedPreferencesZy.getLong("start_time", 0L);
        if (j3 <= 0) {
            m21477y(context, sharedPreferencesZy, j2, qVar);
        }
        if (qVar == 1) {
            i2 = sharedPreferencesZy.getInt("on_up_count", 0) + 1;
            sharedPreferencesZy.edit().putInt("on_up_count", i2).apply();
        } else {
            i2 = sharedPreferencesZy.getInt("off_up_count", 0) + 1;
            sharedPreferencesZy.edit().putInt("off_up_count", i2).apply();
        }
        m21469g(context, j3, j2, i2, qVar);
        yqrt.zy("recordSendMsg complete");
    }

    public static void ld6(Context context, long j2, boolean z2) {
        C5889p.toq(context).f7l8(new zkd(context, j2, z2));
    }

    /* JADX INFO: renamed from: n */
    private static void m21473n(Context context, long j2, int i2) {
        yqrt.zy("upload");
        new bwp().m20668k(context, m21475q(context));
        m21474p(context, j2, i2);
    }

    /* JADX INFO: renamed from: p */
    private static void m21474p(Context context, long j2, int i2) {
        yqrt.zy("reset");
        zy(context).edit().clear().putLong("start_time", j2).putInt("current_screen_state", i2).putLong("current_screen_state_start_time", j2).putInt("xmsf_vc", m21472k(context)).putInt("android_vc", Build.VERSION.SDK_INT).apply();
    }

    /* JADX INFO: renamed from: q */
    private static kcsr m21475q(Context context) {
        SharedPreferences sharedPreferencesZy = zy(context);
        kcsr kcsrVar = new kcsr();
        kcsrVar.zy(sharedPreferencesZy.getInt("off_up_count", 0));
        kcsrVar.f7l8(sharedPreferencesZy.getInt("off_down_count", 0));
        kcsrVar.ld6(sharedPreferencesZy.getInt("off_ping_count", 0));
        kcsrVar.kja0(sharedPreferencesZy.getInt("off_pong_count", 0));
        kcsrVar.m21073q(sharedPreferencesZy.getLong("off_duration", 0L));
        kcsrVar.ki(sharedPreferencesZy.getInt("on_up_count", 0));
        kcsrVar.m21069i(sharedPreferencesZy.getInt("on_down_count", 0));
        kcsrVar.zurt(sharedPreferencesZy.getInt("on_ping_count", 0));
        kcsrVar.fu4(sharedPreferencesZy.getInt("on_pong_count", 0));
        kcsrVar.m21076y(sharedPreferencesZy.getLong("on_duration", 0L));
        kcsrVar.x2(sharedPreferencesZy.getLong("start_time", 0L));
        kcsrVar.m21068h(sharedPreferencesZy.getLong("end_time", 0L));
        kcsrVar.o1t(sharedPreferencesZy.getInt("xmsf_vc", 0));
        kcsrVar.m21075t(sharedPreferencesZy.getInt("android_vc", 0));
        return kcsrVar;
    }

    public static void qrj(Context context, long j2, boolean z2) {
        C5889p.toq(context).f7l8(new jz5(context, j2, z2));
    }

    /* JADX INFO: renamed from: s */
    private static boolean m21476s(Context context) {
        boolean z2 = false;
        if (f73552toq) {
            f73552toq = false;
            SharedPreferences sharedPreferencesZy = zy(context);
            int i2 = sharedPreferencesZy.getInt("xmsf_vc", 0);
            int i3 = sharedPreferencesZy.getInt("android_vc", 0);
            if (i2 != 0 && i3 != 0 && (i2 != m21472k(context) || i3 != Build.VERSION.SDK_INT)) {
                z2 = true;
            }
        }
        yqrt.zy("isVcChanged = " + z2);
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void t8r(Context context, long j2, boolean z2) {
        int i2;
        yqrt.zy("recordReceiveMsg start");
        int qVar = toq(z2);
        SharedPreferences sharedPreferencesZy = zy(context);
        long j3 = sharedPreferencesZy.getLong("start_time", 0L);
        if (j3 <= 0) {
            m21477y(context, sharedPreferencesZy, j2, qVar);
        }
        if (qVar == 1) {
            i2 = sharedPreferencesZy.getInt("on_down_count", 0) + 1;
            sharedPreferencesZy.edit().putInt("on_down_count", i2).apply();
        } else {
            i2 = sharedPreferencesZy.getInt("off_down_count", 0) + 1;
            sharedPreferencesZy.edit().putInt("off_down_count", i2).apply();
        }
        m21469g(context, j3, j2, i2, qVar);
        yqrt.zy("recordReceiveMsg complete");
    }

    private static int toq(boolean z2) {
        return z2 ? 1 : 0;
    }

    public static void x2(Context context, long j2, boolean z2) {
        C5889p.toq(context).f7l8(new uj2j(context, j2, z2));
    }

    /* JADX INFO: renamed from: y */
    private static void m21477y(Context context, SharedPreferences sharedPreferences, long j2, int i2) {
        yqrt.zy("recordInit");
        sharedPreferences.edit().putLong("start_time", j2).putInt("current_screen_state", i2).putLong("current_screen_state_start_time", j2).putInt("xmsf_vc", m21472k(context)).putInt("android_vc", Build.VERSION.SDK_INT).apply();
    }

    private static SharedPreferences zy(Context context) {
        return context.getSharedPreferences("sp_power_stats", 0);
    }
}
