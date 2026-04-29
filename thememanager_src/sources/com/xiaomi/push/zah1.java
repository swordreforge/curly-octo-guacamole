package com.xiaomi.push;

import android.content.Context;
import android.preference.PreferenceManager;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zah1 {
    /* JADX INFO: renamed from: k */
    public static void m22102k(Context context) {
    }

    /* JADX INFO: renamed from: q */
    public static boolean m22103q(Context context, String str, boolean z2) {
        m22102k(context);
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, z2);
    }

    public static void toq(Context context, String str, boolean z2) {
        m22102k(context);
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(str, z2).commit();
    }

    public static void zy(Map<String, String> map, String str, String str2) {
        if (map == null || str == null || str2 == null) {
            return;
        }
        map.put(str, str2);
    }
}
