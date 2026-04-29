package com.android.thememanager.settings.superwallpaper.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.content.C0498q;

/* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.utils.p */
/* JADX INFO: compiled from: PreferenceUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2666p {

    /* JADX INFO: renamed from: k */
    public static final String f15791k = "pref_key_online_wallpaper_json_list";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f60984toq = "pref_key_online_wallpaper_page_id";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f60985zy = "mi_wallpaper_sharedpreference";

    private C2666p() {
    }

    public static void f7l8(Context context, String key, boolean value) {
        m9291n(context).edit().putBoolean(key, value).apply();
    }

    /* JADX INFO: renamed from: g */
    public static String m9289g(Context context, String key, String def) {
        return m9291n(context).getString(key, def);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m9290k(Context context, String key, boolean def) {
        return m9291n(context).getBoolean(key, def);
    }

    public static void ld6(Context context, String key) {
        SharedPreferences sharedPreferencesM9291n = m9291n(context);
        if (sharedPreferencesM9291n.contains(key)) {
            sharedPreferencesM9291n.edit().remove(key).apply();
        }
    }

    /* JADX INFO: renamed from: n */
    private static SharedPreferences m9291n(Context context) {
        return toq(context).getSharedPreferences(f60985zy, 0);
    }

    /* JADX INFO: renamed from: p */
    public static void m9292p(Context context, String key, String value) {
        m9291n(context).edit().putString(key, value).apply();
    }

    /* JADX INFO: renamed from: q */
    public static long m9293q(Context context, String key, long def) {
        return m9291n(context).getLong(key, def);
    }

    /* JADX INFO: renamed from: s */
    public static void m9294s(Context context, String key, long value) {
        m9291n(context).edit().putLong(key, value).apply();
    }

    private static Context toq(Context context) {
        Context qVar = C0498q.toq(context);
        return qVar != null ? qVar : context;
    }

    /* JADX INFO: renamed from: y */
    public static void m9295y(Context context, String key, int value) {
        m9291n(context).edit().putInt(key, value).apply();
    }

    public static int zy(Context context, String key, int def) {
        return m9291n(context).getInt(key, def);
    }
}
