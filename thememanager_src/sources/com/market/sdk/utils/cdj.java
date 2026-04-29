package com.market.sdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;

/* JADX INFO: compiled from: SettingsCompat.java */
/* JADX INFO: loaded from: classes3.dex */
public class cdj {

    /* JADX INFO: renamed from: k */
    private static final String f28188k = "SettingsCompat";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f68983toq = "sys_storage_threshold_max_bytes";

    /* JADX INFO: renamed from: com.market.sdk.utils.cdj$k */
    /* JADX INFO: compiled from: SettingsCompat.java */
    public static class C5002k {
        /* JADX INFO: renamed from: k */
        public static boolean m17406k(Context context, String str) {
            return toq(context, str, 0) != 0;
        }

        /* JADX INFO: renamed from: q */
        public static String m17407q(Context context, String str, String str2) {
            try {
                return Settings.Global.getString(context.getContentResolver(), str);
            } catch (Exception e2) {
                C5013p.n7h(cdj.f28188k, e2.toString());
                return str2;
            }
        }

        public static int toq(Context context, String str, int i2) {
            try {
                return Settings.Global.getInt(context.getContentResolver(), str);
            } catch (Exception e2) {
                C5013p.n7h(cdj.f28188k, e2.toString());
                return i2;
            }
        }

        public static long zy(Context context, String str, long j2) {
            try {
                return Settings.Global.getLong(context.getContentResolver(), str);
            } catch (Exception e2) {
                C5013p.n7h(cdj.f28188k, e2.toString());
                return j2;
            }
        }
    }

    /* JADX INFO: compiled from: SettingsCompat.java */
    public static class toq {
        /* JADX INFO: renamed from: k */
        public static boolean m17408k(Context context, String str) {
            return toq(context, str, 0) != 0;
        }

        /* JADX INFO: renamed from: q */
        public static String m17409q(Context context, String str, String str2) {
            try {
                return Settings.Secure.getString(context.getContentResolver(), str);
            } catch (Exception e2) {
                C5013p.n7h(cdj.f28188k, e2.toString());
                return str2;
            }
        }

        public static int toq(Context context, String str, int i2) {
            try {
                return Settings.Secure.getInt(context.getContentResolver(), str);
            } catch (Exception e2) {
                C5013p.n7h(cdj.f28188k, e2.toString());
                return i2;
            }
        }

        public static int zy(Context context, String str, int i2, int i3) {
            try {
                Class cls = Integer.TYPE;
                Integer num = (Integer) n7h.m17459s(Settings.Secure.class, Settings.Secure.class, "getIntForUser", n7h.f7l8(cls, ContentResolver.class, String.class, cls, cls), context.getContentResolver(), str, Integer.valueOf(i2), Integer.valueOf(i3));
                return num != null ? num.intValue() : i2;
            } catch (Exception e2) {
                C5013p.n7h(cdj.f28188k, e2.toString());
                return i2;
            }
        }
    }

    /* JADX INFO: compiled from: SettingsCompat.java */
    public static class zy {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final int f68984f7l8 = 1;

        /* JADX INFO: renamed from: g */
        public static final int f28189g = 2;

        /* JADX INFO: renamed from: k */
        public static final String f28190k = "com.xiaomi.discover.auto_update_enabled";

        /* JADX INFO: renamed from: n */
        public static final int f28191n = 1;

        /* JADX INFO: renamed from: q */
        public static final int f28192q = 0;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f68985toq = "com.xiaomi.discover.metered_update_answered";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final String f68986zy = "com.xiaomi.discover.metered_update_confirm_needed_by_region";

        /* JADX INFO: renamed from: k */
        public static boolean m17410k(Context context, String str) {
            return toq(context, str, 0) != 0;
        }

        /* JADX INFO: renamed from: q */
        public static boolean m17411q(Context context, String str, int i2) {
            try {
                return Settings.System.putInt(context.getContentResolver(), str, i2);
            } catch (Exception e2) {
                C5013p.n7h(cdj.f28188k, e2.toString());
                return false;
            }
        }

        public static int toq(Context context, String str, int i2) {
            try {
                return Settings.System.getInt(context.getContentResolver(), str);
            } catch (Exception e2) {
                C5013p.n7h(cdj.f28188k, e2.toString());
                return i2;
            }
        }

        public static String zy(Context context, String str, String str2) {
            try {
                return Settings.System.getString(context.getContentResolver(), str);
            } catch (Exception e2) {
                C5013p.n7h(cdj.f28188k, e2.toString());
                return str2;
            }
        }
    }
}
