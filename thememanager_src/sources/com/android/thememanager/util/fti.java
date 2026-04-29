package com.android.thememanager.util;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.utils.o1t;
import miui.util.FeatureParser;

/* JADX INFO: compiled from: DeviceFeatureUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class fti {

    /* JADX INFO: renamed from: k */
    public static final boolean f16451k = FeatureParser.getBoolean("is_pad", false);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final boolean f61239toq = FeatureParser.getBoolean("is_mediatek", false);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final boolean f61240zy = o1t.C1820k.zy(8);

    /* JADX INFO: renamed from: g */
    public static boolean m9733g() {
        return m9736q("com.miui.miwallpaper", 1000);
    }

    /* JADX INFO: renamed from: k */
    public static int m9734k() {
        return toq(com.android.thememanager.basemodule.utils.a9.f10267n);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m9735n() {
        return m9736q("com.android.systemui", 20180628);
    }

    /* JADX INFO: renamed from: q */
    private static boolean m9736q(String packageName, int supportVersion) {
        return toq(packageName) >= supportVersion;
    }

    private static int toq(String packageName) {
        try {
            PackageInfo packageInfo = C2082k.zy().toq().getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return -1;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.d(C2755a.f16307g, packageName + " not found: ", e2);
            return -1;
        }
    }

    public static boolean zy() {
        return m9736q(com.android.thememanager.basemodule.utils.a9.f10267n, 1146);
    }
}
