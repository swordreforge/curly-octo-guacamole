package com.xiaomi.accountsdk.utils;

import android.text.TextUtils;
import com.xiaomi.accountsdk.account.C5500p;

/* JADX INFO: compiled from: UserSpaceIdUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class a9 {
    private a9() {
    }

    /* JADX INFO: renamed from: k */
    public static String m19053k() {
        return toq(C5500p.f7l8(), C5500p.m18783n());
    }

    static String toq(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, str2)) {
            return null;
        }
        return str;
    }
}
