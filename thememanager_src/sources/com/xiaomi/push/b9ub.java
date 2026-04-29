package com.xiaomi.push;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public enum b9ub {
    COMMAND_REGISTER(com.xiaomi.mipush.sdk.cdj.f31317k),
    COMMAND_UNREGISTER(com.xiaomi.mipush.sdk.cdj.f73123toq),
    COMMAND_SET_ALIAS(com.xiaomi.mipush.sdk.cdj.f73125zy),
    COMMAND_UNSET_ALIAS(com.xiaomi.mipush.sdk.cdj.f31320q),
    COMMAND_SET_ACCOUNT(com.xiaomi.mipush.sdk.cdj.f31318n),
    COMMAND_UNSET_ACCOUNT(com.xiaomi.mipush.sdk.cdj.f31316g),
    COMMAND_SUBSCRIBE_TOPIC(com.xiaomi.mipush.sdk.cdj.f73121f7l8),
    COMMAND_UNSUBSCRIBE_TOPIC(com.xiaomi.mipush.sdk.cdj.f31322y),
    COMMAND_SET_ACCEPT_TIME(com.xiaomi.mipush.sdk.cdj.f31321s),
    COMMAND_CHK_VDEVID("check-vdeviceid");


    /* JADX INFO: renamed from: a */
    public final String f32725a;

    b9ub(String str) {
        this.f32725a = str;
    }

    /* JADX INFO: renamed from: a */
    public static int m20641a(String str) {
        int qVar = -1;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        for (b9ub b9ubVar : values()) {
            if (b9ubVar.f32725a.equals(str)) {
                qVar = ga.toq(b9ubVar);
            }
        }
        return qVar;
    }
}
