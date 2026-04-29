package com.android.thememanager.util;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.thememanager.C2082k;

/* JADX INFO: compiled from: ThemeMessageHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class i9jn {

    /* JADX INFO: renamed from: k */
    private static final String f16563k = "msg";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f61309toq = "gift_received_last_name";

    /* JADX INFO: renamed from: k */
    public static void m9822k(String receivedGiftName) {
        SharedPreferences.Editor editorEdit = m9824q().edit();
        editorEdit.putString(f61309toq, receivedGiftName);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m9823n() {
        return !TextUtils.isEmpty(zy());
    }

    /* JADX INFO: renamed from: q */
    private static SharedPreferences m9824q() {
        return C2082k.zy().toq().getSharedPreferences("msg", 0);
    }

    public static void toq() {
        m9822k("");
    }

    public static String zy() {
        return m9824q().getString(f61309toq, "");
    }
}
