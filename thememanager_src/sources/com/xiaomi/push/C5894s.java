package com.xiaomi.push;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: renamed from: com.xiaomi.push.s */
/* JADX INFO: loaded from: classes3.dex */
public class C5894s {
    /* JADX INFO: renamed from: k */
    public static boolean m21457k(Context context) {
        try {
            return ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            return false;
        }
    }

    public static boolean toq(Context context) {
        Intent intentZy = null;
        try {
            intentZy = verb.zy(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null, null);
        } catch (Exception unused) {
        }
        if (intentZy == null) {
            return false;
        }
        int intExtra = intentZy.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }
}
