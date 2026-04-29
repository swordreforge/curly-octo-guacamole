package miuix.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Binder;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: UrlResolver.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    private static Method f42259k;

    /* JADX INFO: renamed from: k */
    public static ResolveInfo m26765k(Context context, PackageManager pm, Intent intent) {
        return toq(context, true, pm, null, intent, null, 0, 0);
    }

    private static ResolveInfo toq(Context context, boolean fromWebView, PackageManager pm, Object pms, Intent intent, String resolvedType, int flags, int userId) {
        Uri data;
        String host;
        String qVar;
        boolean z2;
        List<ResolveInfo> listQueryIntentActivities = fromWebView ? pm.queryIntentActivities(intent, 0) : null;
        if (listQueryIntentActivities == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < listQueryIntentActivities.size(); i2++) {
            ResolveInfo resolveInfo = listQueryIntentActivities.get(i2);
            if (!resolveInfo.activityInfo.packageName.equals("com.android.browser") && !resolveInfo.activityInfo.packageName.equals("com.mi.globalbrowser")) {
                if (mi1u.toq.f7l8(resolveInfo.activityInfo.packageName)) {
                    arrayList.add(resolveInfo);
                } else {
                    try {
                        long jClearCallingIdentity = Binder.clearCallingIdentity();
                        PackageInfo packageInfo = pm.getPackageInfo(resolveInfo.activityInfo.packageName, 0);
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                        if (applicationInfo != null && (1 & applicationInfo.flags) != 0 && !packageInfo.packageName.equals("com.android.chrome")) {
                            arrayList.add(resolveInfo);
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            }
        }
        if (arrayList.size() == 1) {
            return (ResolveInfo) arrayList.get(0);
        }
        if (arrayList.size() <= 1 && (data = intent.getData()) != null && (host = data.getHost()) != null && mi1u.toq.m24749n(host) && (qVar = mi1u.toq.toq(data)) != null) {
            Uri uriM24748k = Uri.parse(qVar);
            if (mi1u.toq.m24750q(uriM24748k.getScheme())) {
                uriM24748k = mi1u.toq.m24748k(qVar);
                z2 = true;
            } else {
                z2 = false;
            }
            intent.setData(uriM24748k);
            if (fromWebView) {
                if (!z2) {
                    return m26765k(context, pm, intent);
                }
                context.startActivity(intent);
                return new ResolveInfo();
            }
            try {
                if (f42259k == null) {
                    Class<?> clsLoadClass = context.getClassLoader().loadClass("com.android.server.pm.PackageManagerService");
                    Class<?> cls = Integer.TYPE;
                    f42259k = clsLoadClass.getDeclaredMethod("resolveIntent", Intent.class, String.class, cls, cls);
                }
                return (ResolveInfo) f42259k.invoke(pms, intent, resolvedType, Integer.valueOf(flags), Integer.valueOf(userId));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }
}
