package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.push.cn02;
import com.xiaomi.push.e4e;
import com.xiaomi.push.m28;
import com.xiaomi.push.qla;
import com.xiaomi.push.sb;

/* JADX INFO: loaded from: classes3.dex */
public class zsr0 {
    /* JADX INFO: renamed from: k */
    public static e4e m21809k(m28 m28Var) {
        byte[] bArrM21248a = m28Var.m21248a();
        e4e e4eVar = new e4e();
        try {
            qla.m21399n(e4eVar, bArrM21248a);
            return e4eVar;
        } catch (sb unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static byte[] m21810n(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("secret is empty, return null");
            return null;
        }
        try {
            return cn02.toq(com.xiaomi.push.x9kr.toq(str), bArr);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.cdj("dencryption error. ", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static byte[] m21811q(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("secret is empty, return null");
            return null;
        }
        try {
            return cn02.zy(com.xiaomi.push.x9kr.toq(str), bArr);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.cdj("encryption error. ", e2);
            return null;
        }
    }

    static void toq(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("ext_fcm_container_buffer");
        String stringExtra2 = intent.getStringExtra("mipush_app_package");
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            return;
        }
        try {
            byte[] bArrM21810n = m21810n(Base64.decode(stringExtra, 2), context.getSharedPreferences("mipush_apps_scrt", 0).getString(stringExtra2, null));
            if (bArrM21810n != null) {
                kja0.ki(context, zy.m21824q(bArrM21810n), bArrM21810n);
            } else {
                com.xiaomi.channel.commonutils.logger.zy.kja0("notify fcm notification error ：dencrypt failed");
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.zy.cdj("notify fcm notification error ", th);
        }
    }

    public static void zy(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        context.getSharedPreferences("mipush_apps_scrt", 0).edit().putString(str, str2).apply();
    }
}
