package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
class ni7 {

    /* JADX INFO: renamed from: k */
    private static volatile boolean f33446k = false;

    /* JADX INFO: renamed from: k */
    private static void m21322k(Class<?> cls, Context context) {
        if (f33446k) {
            return;
        }
        try {
            f33446k = true;
            cls.getDeclaredMethod("InitEntry", Context.class).invoke(cls, context);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("mdid:load lib error " + th);
        }
    }

    public static boolean toq(Context context) {
        try {
            Class<?> clsZy = wu.zy(context, "com.bun.miitmdid.core.JLibrary");
            if (clsZy == null) {
                return false;
            }
            m21322k(clsZy, context);
            return true;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("mdid:check error " + th);
            return false;
        }
    }
}
