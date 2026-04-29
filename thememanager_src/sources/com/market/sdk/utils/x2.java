package com.market.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PkgUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class x2 {

    /* JADX INFO: renamed from: k */
    private static final String f28235k = "PkgUtils";

    /* JADX INFO: renamed from: g */
    public static List<ResolveInfo> m17495g(Intent intent, int i2) {
        List<ResolveInfo> listQueryIntentServices;
        try {
            listQueryIntentServices = C5010k.zy().queryIntentServices(intent, i2);
        } catch (Exception e2) {
            C5013p.m17463n(f28235k, e2.toString(), e2);
            listQueryIntentServices = null;
        }
        return listQueryIntentServices != null ? listQueryIntentServices : new ArrayList();
    }

    /* JADX INFO: renamed from: k */
    public static String m17496k(Context context, String str) {
        try {
            return zy(context.getPackageManager().getPackageInfo(str, 64));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static List<ResolveInfo> m17497n(Intent intent, int i2) {
        List<ResolveInfo> listQueryIntentActivities;
        try {
            listQueryIntentActivities = C5010k.zy().queryIntentActivities(intent, i2);
        } catch (Exception e2) {
            C5013p.m17463n(f28235k, e2.getMessage(), e2);
            listQueryIntentActivities = null;
        }
        return listQueryIntentActivities != null ? listQueryIntentActivities : new ArrayList();
    }

    /* JADX INFO: renamed from: q */
    public static String m17498q(Intent intent) {
        Iterator<ResolveInfo> it = m17497n(intent, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo.enabled && activityInfo.exported) {
                return activityInfo.packageName;
            }
        }
        return null;
    }

    public static boolean toq(String str) {
        try {
            PackageManager packageManagerZy = C5010k.zy();
            int applicationEnabledSetting = packageManagerZy.getApplicationEnabledSetting(str);
            C5013p.toq(f28235k, "state: " + applicationEnabledSetting);
            return applicationEnabledSetting != 0 ? applicationEnabledSetting == 1 : packageManagerZy.getApplicationInfo(str, 0).enabled;
        } catch (IllegalArgumentException unused) {
            return false;
        } catch (Exception e2) {
            C5013p.m17463n(f28235k, e2.toString(), e2);
            return false;
        }
    }

    public static String zy(PackageInfo packageInfo) {
        Signature[] signatureArr = packageInfo.signatures;
        return (signatureArr == null || signatureArr.length <= 0) ? "" : C5012n.ld6(signatureArr[0].toCharsString());
    }
}
