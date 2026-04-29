package com.xiaomi.push;

/* JADX INFO: loaded from: classes3.dex */
public class mla {
    /* JADX INFO: renamed from: k */
    public static String m21289k(String str, String str2) {
        try {
            return (String) wu.zy(null, "android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("SystemProperties.get: " + e2);
            return str2;
        }
    }
}
