package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.C5892r;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.j */
/* JADX INFO: loaded from: classes3.dex */
public class C5653j {

    /* JADX INFO: renamed from: k */
    private static int f31381k = -1;

    /* JADX INFO: renamed from: g */
    public static boolean m19479g(Context context) {
        boolean zBooleanValue = false;
        Object objF7l8 = C5892r.f7l8("com.xiaomi.assemble.control.FTOSPushManager", "isSupportPush", context);
        if (objF7l8 != null && (objF7l8 instanceof Boolean)) {
            zBooleanValue = ((Boolean) Boolean.class.cast(objF7l8)).booleanValue();
        }
        com.xiaomi.channel.commonutils.logger.zy.m19300t("fun touch os push  is avaliable ? :" + zBooleanValue);
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: k */
    public static wvg m19480k(Context context) {
        return zy(context) ? wvg.HUAWEI : m19481n(context) ? wvg.OPPO : m19479g(context) ? wvg.VIVO : wvg.OTHER;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m19481n(Context context) {
        boolean zBooleanValue = false;
        Object objF7l8 = C5892r.f7l8("com.xiaomi.assemble.control.COSPushManager", "isSupportPush", context);
        if (objF7l8 != null && (objF7l8 instanceof Boolean)) {
            zBooleanValue = ((Boolean) Boolean.class.cast(objF7l8)).booleanValue();
        }
        com.xiaomi.channel.commonutils.logger.zy.m19300t("color os push  is avaliable ? :" + zBooleanValue);
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m19482q(Context context) {
        Object objM21411n = C5892r.m21411n(C5892r.f7l8("com.google.android.gms.common.GoogleApiAvailability", "getInstance", new Object[0]), "isGooglePlayServicesAvailable", context);
        Object objM21409g = C5892r.m21409g("com.google.android.gms.common.ConnectionResult", "SUCCESS");
        if (objM21409g == null || !(objM21409g instanceof Integer)) {
            com.xiaomi.channel.commonutils.logger.zy.m19300t("google service is not avaliable");
            f31381k = 0;
            return false;
        }
        int iIntValue = ((Integer) Integer.class.cast(objM21409g)).intValue();
        if (objM21411n != null) {
            if (objM21411n instanceof Integer) {
                f31381k = ((Integer) Integer.class.cast(objM21411n)).intValue() == iIntValue ? 1 : 0;
            } else {
                f31381k = 0;
                com.xiaomi.channel.commonutils.logger.zy.m19300t("google service is not avaliable");
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("is google service can be used");
        sb.append(f31381k > 0);
        com.xiaomi.channel.commonutils.logger.zy.m19300t(sb.toString());
        return f31381k > 0;
    }

    private static boolean toq() {
        try {
            String str = (String) C5892r.f7l8("android.os.SystemProperties", "get", "ro.build.hw_emui_api_level", "");
            if (!TextUtils.isEmpty(str)) {
                if (Integer.parseInt(str) >= 9) {
                    return true;
                }
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
        }
        return false;
    }

    public static boolean zy(Context context) {
        try {
            if (context.getPackageManager().getServiceInfo(new ComponentName("com.huawei.hwid", "com.huawei.hms.core.service.HMSCoreService"), 128) != null) {
                if (toq()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
