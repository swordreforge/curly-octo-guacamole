package com.xiaomi.passport.uicontroller;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.g */
/* JADX INFO: compiled from: PreConditions.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5837g {
    /* JADX INFO: renamed from: k */
    public static void m20491k(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static <T> void toq(T t2, String str) {
        if (t2 == null) {
            throw new NullPointerException(str);
        }
    }
}
