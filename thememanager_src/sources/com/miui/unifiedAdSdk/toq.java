package com.miui.unifiedAdSdk;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: ExeCommandUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {
    /* JADX INFO: renamed from: k */
    public static void m18217k(Context context, String str) {
        f7l8 f7l8VarKi;
        if (TextUtils.isEmpty(str) || context == null || (f7l8VarKi = f7l8.ki(context)) == null) {
            return;
        }
        f7l8VarKi.n7h(new C5352k(f7l8VarKi, str));
    }
}
