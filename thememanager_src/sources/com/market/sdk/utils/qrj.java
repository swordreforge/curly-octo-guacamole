package com.market.sdk.utils;

import android.content.SharedPreferences;
import android.os.Looper;
import java.util.Set;

/* JADX INFO: compiled from: PrefUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class qrj {

    /* JADX INFO: renamed from: com.market.sdk.utils.qrj$k */
    /* JADX INFO: compiled from: PrefUtils.java */
    public enum EnumC5015k {
        DEFAULT("com.xiaomi.market.sdk_pref", false);

        public final String fileName;
        public boolean isMultiProcess;

        EnumC5015k(String str, boolean z2) {
            this.fileName = str;
            this.isMultiProcess = z2;
        }
    }

    public static boolean cdj(String str, int i2, EnumC5015k... enumC5015kArr) {
        SharedPreferences.Editor editorEdit = m17486s(enumC5015kArr).edit();
        editorEdit.putInt(str, i2);
        return editorEdit.commit();
    }

    public static SharedPreferences f7l8() {
        return m17487y(EnumC5015k.DEFAULT);
    }

    public static void fn3e(String str, Set<String> set, EnumC5015k... enumC5015kArr) {
        SharedPreferences.Editor editorEdit = m17486s(enumC5015kArr).edit();
        editorEdit.putStringSet(str, set);
        m17482k(editorEdit);
    }

    /* JADX INFO: renamed from: g */
    public static long m17479g(String str, EnumC5015k... enumC5015kArr) {
        return m17486s(enumC5015kArr).getLong(str, 0L);
    }

    /* JADX INFO: renamed from: h */
    public static void m17480h(String str, int i2, EnumC5015k... enumC5015kArr) {
        SharedPreferences.Editor editorEdit = m17486s(enumC5015kArr).edit();
        editorEdit.putInt(str, i2);
        m17482k(editorEdit);
    }

    /* JADX INFO: renamed from: i */
    public static void m17481i(String str, String str2, EnumC5015k... enumC5015kArr) {
        SharedPreferences.Editor editorEdit = m17486s(enumC5015kArr).edit();
        editorEdit.putString(str, str2);
        m17482k(editorEdit);
    }

    /* JADX INFO: renamed from: k */
    private static void m17482k(SharedPreferences.Editor editor) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            editor.apply();
        } else {
            editor.commit();
        }
    }

    public static void ki(String str, long j2, EnumC5015k... enumC5015kArr) {
        SharedPreferences.Editor editorEdit = m17486s(enumC5015kArr).edit();
        editorEdit.putLong(str, j2);
        m17482k(editorEdit);
    }

    public static boolean kja0(String str, boolean z2, EnumC5015k... enumC5015kArr) {
        SharedPreferences.Editor editorEdit = m17486s(enumC5015kArr).edit();
        editorEdit.putBoolean(str, z2);
        return editorEdit.commit();
    }

    public static Set<String> ld6(String str, Set<String> set, EnumC5015k... enumC5015kArr) {
        return m17486s(enumC5015kArr).getStringSet(str, set);
    }

    /* JADX INFO: renamed from: n */
    public static long m17483n(String str, long j2, EnumC5015k... enumC5015kArr) {
        return m17486s(enumC5015kArr).getLong(str, j2);
    }

    public static void n7h(String str, boolean z2, EnumC5015k... enumC5015kArr) {
        SharedPreferences.Editor editorEdit = m17486s(enumC5015kArr).edit();
        editorEdit.putBoolean(str, z2);
        m17482k(editorEdit);
    }

    /* JADX INFO: renamed from: p */
    public static String m17484p(String str, String str2, EnumC5015k... enumC5015kArr) {
        return m17486s(enumC5015kArr).getString(str, str2);
    }

    /* JADX INFO: renamed from: q */
    public static int m17485q(String str, EnumC5015k... enumC5015kArr) {
        return m17486s(enumC5015kArr).getInt(str, 0);
    }

    public static boolean qrj(String str, EnumC5015k... enumC5015kArr) {
        SharedPreferences.Editor editorEdit = m17486s(enumC5015kArr).edit();
        editorEdit.remove(str);
        return editorEdit.commit();
    }

    /* JADX INFO: renamed from: s */
    private static SharedPreferences m17486s(EnumC5015k[] enumC5015kArr) {
        return m17487y(enumC5015kArr.length == 0 ? EnumC5015k.DEFAULT : enumC5015kArr[0]);
    }

    public static boolean t8r(String str, long j2, EnumC5015k... enumC5015kArr) {
        SharedPreferences.Editor editorEdit = m17486s(enumC5015kArr).edit();
        editorEdit.putLong(str, j2);
        return editorEdit.commit();
    }

    public static boolean toq(String str, boolean z2, EnumC5015k... enumC5015kArr) {
        return m17486s(enumC5015kArr).getBoolean(str, z2);
    }

    public static void x2(String str, EnumC5015k... enumC5015kArr) {
        SharedPreferences.Editor editorEdit = m17486s(enumC5015kArr).edit();
        editorEdit.remove(str);
        m17482k(editorEdit);
    }

    /* JADX INFO: renamed from: y */
    public static SharedPreferences m17487y(EnumC5015k enumC5015k) {
        return C5010k.toq().getSharedPreferences(enumC5015k.fileName, enumC5015k.isMultiProcess ? 4 : 0);
    }

    public static boolean zurt(String str, String str2, EnumC5015k... enumC5015kArr) {
        SharedPreferences.Editor editorEdit = m17486s(enumC5015kArr).edit();
        editorEdit.putString(str, str2);
        return editorEdit.commit();
    }

    public static int zy(String str, int i2, EnumC5015k... enumC5015kArr) {
        return m17486s(enumC5015kArr).getInt(str, i2);
    }
}
