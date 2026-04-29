package com.xiaomi.accountsdk.guestaccount;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: SharedPreferencesUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class kja0 {
    /* JADX INFO: renamed from: k */
    private static SharedPreferences m18875k(Context context) {
        return context.getSharedPreferences("uuid_data", 0);
    }

    static String toq(Context context) {
        return m18875k(context).getString("uuid", "");
    }

    static void zy(Context context, String str) {
        m18875k(context).edit().putString("uuid", str).commit();
    }
}
