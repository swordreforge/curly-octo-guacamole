package com.xiaomi.onetrack.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.onetrack.p017f.C5756a;

/* JADX INFO: loaded from: classes3.dex */
public class aa {

    /* JADX INFO: renamed from: A */
    private static final String f32230A = "onetrack_user_id";

    /* JADX INFO: renamed from: B */
    private static final String f32231B = "onetrack_user_type";

    /* JADX INFO: renamed from: C */
    private static final String f32232C = "custom_id";

    /* JADX INFO: renamed from: D */
    private static final String f32233D = "page_end";

    /* JADX INFO: renamed from: E */
    private static final String f32234E = "last_app_version";

    /* JADX INFO: renamed from: F */
    private static final String f32235F = "first_launch_time";

    /* JADX INFO: renamed from: G */
    private static final String f32236G = "pref_custom_privacy_policy_";

    /* JADX INFO: renamed from: H */
    private static final String f32237H = "app_config_region";

    /* JADX INFO: renamed from: a */
    private static final String f32238a = "onetrack";

    /* JADX INFO: renamed from: b */
    private static final String f32239b = "one_track_pref";

    /* JADX INFO: renamed from: c */
    private static SharedPreferences f32240c = null;

    /* JADX INFO: renamed from: d */
    private static SharedPreferences.Editor f32241d = null;

    /* JADX INFO: renamed from: e */
    private static final String f32242e = "last_upload_active_time";

    /* JADX INFO: renamed from: f */
    private static final String f32243f = "last_upload_usage_time";

    /* JADX INFO: renamed from: g */
    private static final String f32244g = "last_collect_crash_time";

    /* JADX INFO: renamed from: h */
    private static final String f32245h = "report_crash_ticket";

    /* JADX INFO: renamed from: i */
    private static final String f32246i = "last_secret_key_time";

    /* JADX INFO: renamed from: j */
    private static final String f32247j = "last_common_cloud_time";

    /* JADX INFO: renamed from: k */
    private static final String f32248k = "next_update_common_conf_time";

    /* JADX INFO: renamed from: l */
    private static final String f32249l = "common_cloud_data";

    /* JADX INFO: renamed from: m */
    private static final String f32250m = "common_config_hash";

    /* JADX INFO: renamed from: n */
    private static final String f32251n = "s_t";

    /* JADX INFO: renamed from: o */
    private static final String f32252o = "l_t";

    /* JADX INFO: renamed from: p */
    private static final String f32253p = "e_t";

    /* JADX INFO: renamed from: q */
    private static final String f32254q = "secret_key_data";

    /* JADX INFO: renamed from: r */
    private static final String f32255r = "region_rul";

    /* JADX INFO: renamed from: s */
    private static final String f32256s = "pref_instance_id";

    /* JADX INFO: renamed from: t */
    private static final String f32257t = "pref_instance_id_last_use_time";

    /* JADX INFO: renamed from: u */
    private static final String f32258u = "last_usage_resume_component";

    /* JADX INFO: renamed from: v */
    private static final String f32259v = "last_usage_resume_time";

    /* JADX INFO: renamed from: w */
    private static final String f32260w = "network_access_enabled";

    /* JADX INFO: renamed from: x */
    private static final String f32261x = "anonymous_enabled";

    /* JADX INFO: renamed from: y */
    private static final String f32262y = "onetrack_first_open";

    /* JADX INFO: renamed from: z */
    private static final String f32263z = "dau_last_time";

    /* JADX INFO: renamed from: A */
    public static String m20146A() {
        return m20153a(f32234E, "");
    }

    /* JADX INFO: renamed from: B */
    public static long m20147B() {
        return m20151a(f32235F, 0L);
    }

    /* JADX INFO: renamed from: C */
    public static String m20148C() {
        return m20153a(f32237H, "");
    }

    /* JADX INFO: renamed from: D */
    private static void m20149D() {
        if (f32241d != null) {
            return;
        }
        synchronized (aa.class) {
            if (f32241d == null) {
                SharedPreferences sharedPreferences = C5756a.m20048a().getSharedPreferences(f32239b, 0);
                f32240c = sharedPreferences;
                f32241d = sharedPreferences.edit();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m20153a(String str, String str2) {
        m20149D();
        return f32240c.getString(str, str2);
    }

    /* JADX INFO: renamed from: b */
    private static void m20165b(String str, String str2) {
        m20149D();
        f32241d.putString(str, str2).apply();
    }

    /* JADX INFO: renamed from: c */
    private static void m20171c(String str, boolean z2) {
        m20149D();
        f32241d.putBoolean(str, z2).apply();
    }

    /* JADX INFO: renamed from: d */
    public static void m20174d(long j2) {
        m20164b(f32245h, j2);
    }

    /* JADX INFO: renamed from: e */
    public static void m20177e(long j2) {
        m20164b(f32243f, j2);
    }

    /* JADX INFO: renamed from: f */
    public static void m20180f(long j2) {
        m20164b(f32251n, j2);
    }

    /* JADX INFO: renamed from: g */
    public static void m20183g(long j2) {
        m20164b(f32252o, j2);
    }

    /* JADX INFO: renamed from: h */
    public static void m20186h(long j2) {
        m20164b(f32253p, j2);
    }

    /* JADX INFO: renamed from: i */
    public static void m20189i(long j2) {
        m20164b(f32246i, j2);
    }

    /* JADX INFO: renamed from: j */
    public static void m20192j(long j2) {
        m20164b(f32248k, j2);
    }

    /* JADX INFO: renamed from: k */
    public static String m20194k() {
        return m20153a(f32250m, "");
    }

    /* JADX INFO: renamed from: l */
    public static String m20197l() {
        return m20153a(f32249l, "");
    }

    /* JADX INFO: renamed from: m */
    private static void m20202m(String str) {
        m20149D();
        f32241d.remove(str).apply();
    }

    /* JADX INFO: renamed from: n */
    public static long m20203n() {
        return m20151a(f32257t, 0L);
    }

    /* JADX INFO: renamed from: o */
    public static String m20205o() {
        return m20153a(f32258u, "");
    }

    /* JADX INFO: renamed from: p */
    public static long m20206p() {
        return m20151a(f32259v, 0L);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m20207q() {
        return m20167b(f32260w, true);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m20208r() {
        return m20167b(f32261x, false);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m20209s() {
        return m20167b(f32262y, true);
    }

    /* JADX INFO: renamed from: t */
    public static long m20210t() {
        return m20151a(f32263z, 0L);
    }

    /* JADX INFO: renamed from: u */
    public static String m20211u() {
        return m20153a(f32230A, "");
    }

    /* JADX INFO: renamed from: v */
    public static void m20212v() {
        m20202m(f32230A);
    }

    /* JADX INFO: renamed from: w */
    public static String m20213w() {
        return m20153a(f32231B, "");
    }

    /* JADX INFO: renamed from: x */
    public static void m20214x() {
        m20202m(f32231B);
    }

    /* JADX INFO: renamed from: y */
    public static long m20215y() {
        return m20151a(f32260w, 0L);
    }

    /* JADX INFO: renamed from: z */
    public static String m20216z() {
        return m20153a(f32233D, "");
    }

    /* JADX INFO: renamed from: d */
    public static long m20173d() {
        return m20151a(f32251n, 0L);
    }

    /* JADX INFO: renamed from: e */
    public static long m20176e() {
        return m20151a(f32252o, 0L);
    }

    /* JADX INFO: renamed from: f */
    public static long m20179f() {
        return m20151a(f32253p, 0L);
    }

    /* JADX INFO: renamed from: g */
    public static String m20182g() {
        return m20153a(f32254q, "");
    }

    /* JADX INFO: renamed from: h */
    public static String m20185h() {
        return m20153a(f32255r, "");
    }

    /* JADX INFO: renamed from: i */
    public static long m20188i() {
        return m20151a(f32246i, 0L);
    }

    /* JADX INFO: renamed from: j */
    public static long m20191j() {
        return m20151a(f32248k, 0L);
    }

    /* JADX INFO: renamed from: k */
    public static void m20195k(long j2) {
        m20164b(f32257t, j2);
    }

    /* JADX INFO: renamed from: l */
    public static void m20198l(long j2) {
        m20164b(f32259v, j2);
    }

    /* JADX INFO: renamed from: n */
    public static void m20204n(long j2) {
        m20164b(f32235F, j2);
    }

    /* JADX INFO: renamed from: a */
    private static long m20151a(String str, long j2) {
        m20149D();
        return f32240c.getLong(str, j2);
    }

    /* JADX INFO: renamed from: b */
    private static void m20164b(String str, long j2) {
        m20149D();
        f32241d.putLong(str, j2).apply();
    }

    /* JADX INFO: renamed from: c */
    public static void m20169c(long j2) {
        m20164b(f32244g, j2);
    }

    /* JADX INFO: renamed from: d */
    public static void m20175d(String str) {
        m20165b(f32249l, str);
    }

    /* JADX INFO: renamed from: e */
    public static void m20178e(String str) {
        m20165b(f32256s, str);
        m20195k(ac.m20220a());
    }

    /* JADX INFO: renamed from: f */
    public static void m20181f(String str) {
        m20165b(f32258u, str);
    }

    /* JADX INFO: renamed from: g */
    public static void m20184g(String str) {
        m20165b(f32230A, str);
    }

    /* JADX INFO: renamed from: h */
    public static void m20187h(String str) {
        m20165b(f32231B, str);
    }

    /* JADX INFO: renamed from: i */
    public static void m20190i(String str) {
        m20165b(f32233D, str);
    }

    /* JADX INFO: renamed from: j */
    public static void m20193j(String str) {
        m20165b(f32234E, str);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m20196k(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return m20167b(f32236G + str, true);
    }

    /* JADX INFO: renamed from: l */
    public static void m20199l(String str) {
        m20165b(f32237H, str);
    }

    /* JADX INFO: renamed from: m */
    public static String m20200m() {
        return m20153a(f32256s, "");
    }

    /* JADX INFO: renamed from: c */
    public static long m20168c() {
        return m20151a(f32245h, 0L);
    }

    /* JADX INFO: renamed from: m */
    public static void m20201m(long j2) {
        m20164b(f32263z, j2);
    }

    /* JADX INFO: renamed from: a */
    private static void m20157a(String str, float f2) {
        m20149D();
        f32241d.putFloat(str, f2).apply();
    }

    /* JADX INFO: renamed from: b */
    private static boolean m20167b(String str, boolean z2) {
        m20149D();
        return f32240c.getBoolean(str, z2);
    }

    /* JADX INFO: renamed from: c */
    public static void m20170c(String str) {
        m20165b(f32250m, str);
    }

    /* JADX INFO: renamed from: c */
    public static void m20172c(boolean z2) {
        m20171c(f32262y, z2);
    }

    /* JADX INFO: renamed from: a */
    public static long m20150a() {
        return m20151a(f32242e, 0L);
    }

    /* JADX INFO: renamed from: b */
    private static float m20160b(String str, float f2) {
        m20149D();
        return f32240c.getFloat(str, f2);
    }

    /* JADX INFO: renamed from: a */
    public static void m20154a(long j2) {
        m20164b(f32242e, j2);
    }

    /* JADX INFO: renamed from: a */
    public static void m20156a(String str) {
        m20165b(f32254q, str);
    }

    /* JADX INFO: renamed from: b */
    public static long m20162b(long j2) {
        return m20151a(f32243f, j2);
    }

    /* JADX INFO: renamed from: a */
    public static void m20159a(boolean z2) {
        m20171c(f32260w, z2);
    }

    /* JADX INFO: renamed from: b */
    public static long m20161b() {
        return m20151a(f32244g, 0L);
    }

    /* JADX INFO: renamed from: a */
    public static void m20155a(Context context, String str) {
        m20165b(f32232C, str);
    }

    /* JADX INFO: renamed from: b */
    public static void m20163b(String str) {
        m20165b(f32255r, str);
    }

    /* JADX INFO: renamed from: a */
    public static String m20152a(Context context) {
        return m20153a(f32232C, "");
    }

    /* JADX INFO: renamed from: b */
    public static void m20166b(boolean z2) {
        m20171c(f32261x, z2);
    }

    /* JADX INFO: renamed from: a */
    public static void m20158a(String str, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m20171c(f32236G + str, z2);
    }
}
