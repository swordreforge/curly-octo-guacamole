package gcp;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.DateFormat;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: gcp.q */
/* JADX INFO: compiled from: DateFormatUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6064q {

    /* JADX INFO: renamed from: k */
    private static final String f35053k = "DateFormatUtils";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f77044toq = "com.android.systemui";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f77045zy = "com.miui.aod";

    public static int f7l8() {
        try {
            return ((Integer) ActivityManager.class.getMethod("getCurrentUser", new Class[0]).invoke(null, new Object[0])).intValue();
        } catch (Exception e2) {
            Log.e(f35053k, "get current user id fail", e2);
            return 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m22333g(Context context) {
        return "com.android.systemui".equals(context.getPackageName());
    }

    /* JADX INFO: renamed from: k */
    public static String m22334k(String str) {
        return toq(str, Locale.ENGLISH);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m22335n(Context context) {
        return m22333g(context) || m22336q(context);
    }

    /* JADX INFO: renamed from: q */
    private static boolean m22336q(Context context) {
        return "com.miui.aod".equals(context.getPackageName());
    }

    public static String toq(String str, Locale locale) {
        return new SimpleDateFormat(str, locale).format(new Date());
    }

    public static boolean zy(Context context) {
        if (m22335n(context)) {
            try {
                return ((Boolean) DateFormat.class.getMethod("is24HourFormat", Context.class, Integer.TYPE).invoke(null, context, Integer.valueOf(f7l8()))).booleanValue();
            } catch (Exception e2) {
                Log.e(f35053k, "register receiver as user fail", e2);
            }
        }
        return DateFormat.is24HourFormat(context);
    }
}
