package miuix.core.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.ad.AdUtils;
import java.io.File;

/* JADX INFO: compiled from: PackageHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class x2 {

    /* JADX INFO: renamed from: k */
    private static final String f39938k = "miuix_core";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f87402toq = "ro.miui.ui.version.code";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f87403zy = "miui";

    private x2() {
    }

    private static String f7l8(String str) {
        return "/data/data/" + str + "/lib/";
    }

    /* JADX INFO: renamed from: g */
    private static String m25677g(String str) {
        return m25680p(new String[]{"/data/app/" + str + "-1.apk", "/data/app/" + str + "-2.apk", "/data/app/" + str + "-1/base.apk", "/data/app/" + str + "-2/base.apk"});
    }

    /* JADX INFO: renamed from: k */
    public static String m25678k(Context context, String str, String str2) {
        if (context == null) {
            return m25679n(str, str2);
        }
        PackageInfo packageInfoZy = zy(context, str);
        if (packageInfoZy != null) {
            return packageInfoZy.applicationInfo.publicSourceDir;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    private static String m25679n(String str, String str2) {
        String strM25677g = m25677g(str);
        return strM25677g == null ? m25683y(str2) : strM25677g;
    }

    /* JADX INFO: renamed from: p */
    private static String m25680p(String[] strArr) {
        for (String str : strArr) {
            if (new File(str).exists()) {
                return str;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    private static Context m25681q() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (Context) cls.getDeclaredMethod("getSystemContext", new Class[0]).invoke(cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
        } catch (Exception e2) {
            Log.e(f39938k, "getSystemContext error", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m25682s() {
        return !TextUtils.isEmpty(SystemProperties.get(f87402toq, ""));
    }

    public static String toq(Context context, String str) {
        if (context == null) {
            context = m25681q();
        }
        if (context == null) {
            return f7l8(str);
        }
        PackageInfo packageInfoZy = zy(context, str);
        if (packageInfoZy != null) {
            return packageInfoZy.applicationInfo.nativeLibraryDir;
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    private static String m25683y(String str) {
        return m25680p(new String[]{"/system/app/" + str + AdUtils.f57373toq, "/system/priv-app/" + str + AdUtils.f57373toq, "/system/app/" + str + "/" + str + AdUtils.f57373toq, "/system/priv-app/" + str + "/" + str + AdUtils.f57373toq});
    }

    private static PackageInfo zy(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 128);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
