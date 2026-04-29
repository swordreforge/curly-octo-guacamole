package com.xiaomi.accountsdk.hasheddeviceidlib;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.hasheddeviceidlib.g */
/* JADX INFO: compiled from: PlainDeviceIdUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C5530g {

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.hasheddeviceidlib.g$k */
    /* JADX INFO: compiled from: PlainDeviceIdUtil.java */
    private static class k {

        /* JADX INFO: renamed from: k */
        private static volatile toq f30922k = new zy();

        private k() {
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.hasheddeviceidlib.g$toq */
    /* JADX INFO: compiled from: PlainDeviceIdUtil.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        String mo18905k(Context context);
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.hasheddeviceidlib.g$zy */
    /* JADX INFO: compiled from: PlainDeviceIdUtil.java */
    public static final class zy implements toq {
        @Override // com.xiaomi.accountsdk.hasheddeviceidlib.C5530g.toq
        /* JADX INFO: renamed from: k */
        public String mo18905k(Context context) {
            if (context == null) {
                return null;
            }
            String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
            return TextUtils.isEmpty(deviceId) ? C5532n.m18907k(context) : deviceId;
        }
    }

    /* JADX INFO: renamed from: k */
    public static toq m18903k() {
        return k.f30922k;
    }

    public static void toq(toq toqVar) {
        toq unused = k.f30922k = toqVar;
    }
}
