package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class zsr0 {

    /* JADX INFO: renamed from: k */
    private static Boolean f34298k;

    /* JADX INFO: renamed from: k */
    static void m22130k(String str) {
        toq("Push-ConnectionQualityStatsHelper", str);
    }

    public static void toq(String str, String str2) {
    }

    public static boolean zy(Context context) {
        if (f34298k == null) {
            if (!nc.m21313p(context)) {
                f34298k = Boolean.FALSE;
            }
            String strM21600q = com.xiaomi.push.service.etdu.m21600q(context);
            if (TextUtils.isEmpty(strM21600q) || strM21600q.length() < 3) {
                f34298k = Boolean.FALSE;
            } else {
                String strSubstring = strM21600q.substring(strM21600q.length() - 3);
                m22130k("shouldSampling uuid suffix = " + strSubstring);
                f34298k = Boolean.valueOf(TextUtils.equals(strSubstring, "001"));
            }
            m22130k("shouldSampling = " + f34298k);
        }
        return f34298k.booleanValue();
    }
}
