package com.mibi.sdk.common;

import android.util.Log;
import com.market.sdk.utils.kja0;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: com.mibi.sdk.common.k */
/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5032k {

    /* JADX INFO: renamed from: k */
    private static final String f28574k = "Utils";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final boolean f70898toq = new File("/data/system/server_staging").exists();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final Set<String> f70899zy = new HashSet(Arrays.asList("AT", "BE", "BG", "CY", "CZ", "DE", "DK", "EE", kja0.f28214q, "FI", "FR", "GB", "GR", "HR", "HU", "IE", "IT", "LT", "LU", "LV", "MT", "NL", "PL", "PT", "RO", "SE", "SI", "SK"));

    public static boolean f7l8() {
        try {
            Object obj = Class.forName("miui.os.Build").getField("IS_INTERNATIONAL_BUILD").get(null);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        } catch (ClassNotFoundException unused) {
            Log.i(f28574k, "reflect miui.os.Build got null");
            return false;
        } catch (IllegalAccessException | IllegalArgumentException | NoClassDefFoundError unused2) {
        } catch (NoSuchFieldException unused3) {
            Log.i(f28574k, "no IS_INTERNATIONAL_BUILD");
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m17525g() {
        return f7l8() && f70899zy.contains(zy());
    }

    /* JADX INFO: renamed from: k */
    public static String m17526k() {
        return Locale.getDefault().getCountry();
    }

    /* JADX INFO: renamed from: n */
    public static Class<?> m17527n() {
        try {
            return Class.forName("miui.payment.PaymentManager$PaymentListener");
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoClassDefFoundError e3) {
            e3.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static Class<?> m17528q() {
        try {
            return Class.forName("miui.payment.PaymentManager");
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoClassDefFoundError e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static String toq() {
        return Locale.getDefault().getLanguage();
    }

    protected static String zy() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.miui.region");
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return "unknown";
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return "unknown";
        } catch (IllegalArgumentException e4) {
            e4.printStackTrace();
            return "unknown";
        } catch (NoSuchMethodException e6) {
            e6.printStackTrace();
            return "unknown";
        } catch (InvocationTargetException e7) {
            e7.printStackTrace();
            return "unknown";
        }
    }
}
