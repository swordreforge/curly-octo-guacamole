package miuix.os;

import miuix.core.util.SystemProperties;

/* JADX INFO: compiled from: SystemProperties.java */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8 {
    /* JADX INFO: renamed from: k */
    public static String m26160k(String key, String defValue) {
        return SystemProperties.get(key, defValue);
    }

    /* JADX INFO: renamed from: q */
    public static long m26161q(String key, long def) {
        return SystemProperties.getLong(key, def);
    }

    public static boolean toq(String key, boolean def) {
        return SystemProperties.getBoolean(key, def);
    }

    public static int zy(String key, int def) {
        return SystemProperties.getInt(key, def);
    }
}
