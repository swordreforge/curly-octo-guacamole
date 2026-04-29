package com.miui.privacypolicy;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: SharePreferenceUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class x2 {

    /* JADX INFO: renamed from: k */
    private static SharedPreferences f29771k;

    private x2() {
    }

    protected static String f7l8(Context context, String str, String str2) {
        return zy(context).getString(str, str2);
    }

    /* JADX INFO: renamed from: g */
    protected static String m18131g(Context context, String str) {
        return zy(context).getString(str, "");
    }

    /* JADX INFO: renamed from: k */
    protected static void m18132k(Context context) {
        SharedPreferences.Editor editorEdit = zy(context).edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    protected static void ld6(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = zy(context).edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: n */
    protected static long m18133n(Context context, String str, long j2) {
        return zy(context).getLong(str, j2);
    }

    /* JADX INFO: renamed from: p */
    protected static void m18134p(Context context, String str, long j2) {
        SharedPreferences.Editor editorEdit = zy(context).edit();
        editorEdit.putLong(str, j2);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: q */
    protected static int m18135q(Context context, String str, int i2) {
        return zy(context).getInt(str, i2);
    }

    /* JADX INFO: renamed from: s */
    protected static void m18136s(Context context, String str, int i2) {
        SharedPreferences.Editor editorEdit = zy(context).edit();
        editorEdit.putInt(str, i2);
        editorEdit.commit();
    }

    protected static boolean toq(Context context, String str, boolean z2) {
        return zy(context).getBoolean(str, z2);
    }

    /* JADX INFO: renamed from: y */
    protected static void m18137y(Context context, String str, boolean z2) {
        SharedPreferences.Editor editorEdit = zy(context).edit();
        editorEdit.putBoolean(str, z2);
        editorEdit.commit();
    }

    private static SharedPreferences zy(Context context) {
        if (f29771k == null) {
            f29771k = context.getSharedPreferences("privacy_sdk", 0);
        }
        return f29771k;
    }
}
