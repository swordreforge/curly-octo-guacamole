package com.tencent.wxop.stat.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* JADX INFO: renamed from: com.tencent.wxop.stat.common.q */
/* JADX INFO: loaded from: classes3.dex */
public class C5397q {

    /* JADX INFO: renamed from: a */
    private static SharedPreferences f30172a;

    /* JADX INFO: renamed from: a */
    public static int m18456a(Context context, String str, int i2) {
        return m18458a(context).getInt(C5392l.m18411a(context, StatConstants.MTA_COOPERATION_TAG + str), i2);
    }

    /* JADX INFO: renamed from: a */
    public static long m18457a(Context context, String str, long j2) {
        return m18458a(context).getLong(C5392l.m18411a(context, StatConstants.MTA_COOPERATION_TAG + str), j2);
    }

    /* JADX INFO: renamed from: a */
    static synchronized SharedPreferences m18458a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(".mta-wxop", 0);
        f30172a = sharedPreferences;
        if (sharedPreferences == null) {
            f30172a = PreferenceManager.getDefaultSharedPreferences(context);
        }
        return f30172a;
    }

    /* JADX INFO: renamed from: a */
    public static String m18459a(Context context, String str, String str2) {
        return m18458a(context).getString(C5392l.m18411a(context, StatConstants.MTA_COOPERATION_TAG + str), str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m18460b(Context context, String str, int i2) {
        String strM18411a = C5392l.m18411a(context, StatConstants.MTA_COOPERATION_TAG + str);
        SharedPreferences.Editor editorEdit = m18458a(context).edit();
        editorEdit.putInt(strM18411a, i2);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: b */
    public static void m18461b(Context context, String str, long j2) {
        String strM18411a = C5392l.m18411a(context, StatConstants.MTA_COOPERATION_TAG + str);
        SharedPreferences.Editor editorEdit = m18458a(context).edit();
        editorEdit.putLong(strM18411a, j2);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: b */
    public static void m18462b(Context context, String str, String str2) {
        String strM18411a = C5392l.m18411a(context, StatConstants.MTA_COOPERATION_TAG + str);
        SharedPreferences.Editor editorEdit = m18458a(context).edit();
        editorEdit.putString(strM18411a, str2);
        editorEdit.commit();
    }
}
