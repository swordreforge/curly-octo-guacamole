package com.xiaomi.push;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public class ebn {
    /* JADX INFO: renamed from: k */
    private static void m20770k(byte[] bArr) {
        if (bArr.length >= 2) {
            bArr[0] = 99;
            bArr[1] = 100;
        }
    }

    /* JADX INFO: renamed from: q */
    public static byte[] m20771q(String str, byte[] bArr) {
        byte[] qVar = x9kr.toq(str);
        try {
            m20770k(qVar);
            return cn02.zy(qVar, bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean toq(Context context, String str, long j2) {
        if (com.xiaomi.push.service.a9.m21550q(context).qrj(oph.DCJobMutualSwitch.m21370a(), false)) {
            return (Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) && !C5961y.m22034k(context, str, j2);
        }
        return false;
    }

    public static byte[] zy(String str, byte[] bArr) {
        byte[] qVar = x9kr.toq(str);
        try {
            m20770k(qVar);
            return cn02.toq(qVar, bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
