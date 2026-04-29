package com.android.thememanager.basemodule.utils;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.activity.LargeIconPickerActivity;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import yz.C7794k;

/* JADX INFO: compiled from: PackageUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class a9 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f57709f7l8 = "miui.intent.action.CTA_DECLARE";

    /* JADX INFO: renamed from: g */
    public static final String f10265g = "com.android.systemui";

    /* JADX INFO: renamed from: k */
    private static final String f10266k = "PackageUtils";

    /* JADX INFO: renamed from: n */
    public static final String f10267n = "com.xiaomi.vipaccount";

    /* JADX INFO: renamed from: p */
    private static final String f10268p = "supportPaidWidget";

    /* JADX INFO: renamed from: q */
    public static final String f10269q = "queryDownloadStatus";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f57711toq = "com.xiaomi.market.DOWNLOAD_INSTALL_RESULT";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f57712x2 = "xiaoai.supportSmartAlarmPage";

    /* JADX INFO: renamed from: y */
    private static int f10271y = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f57713zy = "content://com.xiaomi.market.provider.DirectMailProvider/status";

    /* JADX INFO: renamed from: s */
    private static final String[] f10270s = {"com.miui.personalassistant", InterfaceC1789q.k9};

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static Boolean f57710ld6 = null;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.a9$k */
    /* JADX INFO: compiled from: PackageUtils.java */
    private static class C1800k implements Comparator<ResolveInfo> {

        /* JADX INFO: renamed from: k */
        private PackageManager f10272k;

        public C1800k(PackageManager pm) {
            this.f10272k = pm;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final int compare(ResolveInfo a2, ResolveInfo b2) {
            String str = a2.activityInfo.packageName;
            String str2 = b2.activityInfo.packageName;
            CharSequence charSequenceLoadLabel = a2.loadLabel(this.f10272k);
            CharSequence charSequenceLoadLabel2 = b2.loadLabel(this.f10272k);
            if (charSequenceLoadLabel == null) {
                charSequenceLoadLabel = a2.activityInfo.name;
            }
            if (charSequenceLoadLabel2 == null) {
                charSequenceLoadLabel2 = b2.activityInfo.name;
            }
            int iCompareTo = str.compareTo(str2);
            return iCompareTo == 0 ? charSequenceLoadLabel.toString().compareTo(charSequenceLoadLabel2.toString()) : iCompareTo;
        }
    }

    public static boolean cdj(Context context) {
        return fn3e(context, "com.miui.aod", 11900342);
    }

    public static int f7l8(Context context) {
        return m7000y(context, context.getPackageName());
    }

    private static boolean fn3e(Context context, String packageName, int supportVersion) {
        return m7000y(context, packageName) >= supportVersion;
    }

    public static boolean fu4(Context context, String id) {
        if (TextUtils.equals("weather", id)) {
            return fn3e(context, "com.miui.aod", 20900667);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static String m6992g(Context context) {
        return context.getPackageName();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m6993h(Context context) {
        return fn3e(context, "com.android.systemui", 201912130);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m6994i(Context context) {
        new Intent("com.xiaomi.account.action.SYSTEM_ACCOUNT_LOGIN_AUTH").setPackage("com.xiaomi.account");
        return !context.getPackageManager().queryIntentActivities(r0, 0).isEmpty();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m6995k() {
        Bundle bundle;
        if (!C1807g.gvn7() && !C1807g.jk() && !C1807g.eqxt() && (C1807g.ki() > 4 || C1807g.ki() <= 0)) {
            try {
                int length = f10270s.length;
                PackageManager packageManager = bf2.toq.toq().getPackageManager();
                for (int i2 = 0; i2 < length; i2++) {
                    String str = f10270s[i2];
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
                    if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                        if (!bundle.getBoolean(f10268p)) {
                            Log.w(f10266k, "checkSupportPaidWidgets failed: not support paid widgets for package: " + str);
                            return false;
                        }
                    }
                    Log.w(f10266k, "checkSupportPaidWidgets failed: no applicationInfo or metaData found for package: " + str);
                    return false;
                }
                return true;
            } catch (Exception e2) {
                Log.e(f10266k, "checkSupportPaidWidgets error: \n" + e2);
            }
        }
        return false;
    }

    public static boolean ki() {
        if (f10271y < 0) {
            Intent intent = new Intent(f57709f7l8);
            intent.setPackage("com.miui.securitycenter");
            List<ResolveInfo> listQueryIntentActivities = bf2.toq.toq().getPackageManager().queryIntentActivities(intent, 0);
            if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
                f10271y = 0;
            } else {
                f10271y = 1;
            }
        }
        return f10271y == 1;
    }

    public static boolean kja0(Context context, String packageName) {
        Intent launchIntentForPackage;
        if (TextUtils.isEmpty(packageName) || (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageName)) == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            launchIntentForPackage.addFlags(268435456);
        }
        context.startActivity(launchIntentForPackage);
        return true;
    }

    public static boolean ld6() {
        Context qVar = bf2.toq.toq();
        Uri uri = Uri.parse("content://com.miui.home.app.hide");
        Bundle bundle = new Bundle();
        bundle.putString("packageName", qVar.getPackageName());
        bundle.putString(LargeIconPickerActivity.ay, "com.android.thememanager.ThemeResourceTabActivity");
        bundle.putString("serialNumber", "0");
        try {
            Bundle bundleCall = qVar.getContentResolver().call(uri, "isAppHidded", (String) null, bundle);
            if (bundleCall != null) {
                String string = bundleCall.getString("result");
                Log.i(f10266k, "isHomeIconHide :=: " + string);
                return "true".equals(string);
            }
        } catch (Exception e2) {
            Log.e(f10266k, "restoreLauncherIcon fail. " + e2);
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static String m6996n(String packageName, String activityName) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        if (!TextUtils.isEmpty(activityName)) {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setComponent(new ComponentName(packageName, activityName));
            List<ResolveInfo> listQueryIntentActivities = bf2.toq.toq().getPackageManager().queryIntentActivities(intent, 0);
            if (listQueryIntentActivities != null && listQueryIntentActivities.size() > 0) {
                return String.valueOf(listQueryIntentActivities.get(0).loadLabel(bf2.toq.toq().getPackageManager()));
            }
        }
        try {
            packageManager = bf2.toq.toq().getPackageManager();
            try {
                applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                applicationInfo = null;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            packageManager = null;
        }
        if (applicationInfo == null) {
            return null;
        }
        return (String) packageManager.getApplicationLabel(applicationInfo);
    }

    public static boolean n7h() {
        Context qVar = bf2.toq.toq();
        Uri uri = Uri.parse("content://com.miui.home.app.hide");
        Bundle bundle = new Bundle();
        bundle.putString("packageName", qVar.getPackageName());
        bundle.putString(LargeIconPickerActivity.ay, "com.android.thememanager.ThemeResourceTabActivity");
        bundle.putString("serialNumber", "0");
        try {
            qVar.getContentResolver().call(uri, "restoreHiddenApp", (String) null, bundle);
            return true;
        } catch (Exception e2) {
            Log.e(f10266k, "restoreLauncherIcon fail. " + e2);
            return false;
        }
    }

    public static boolean ni7(Context context) {
        return fn3e(context, "com.miui.miwallpaper", 1000);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m6997p() {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = bf2.toq.toq().getPackageManager().getApplicationInfo(p001b.f7l8.kq, 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return bundle.getBoolean(f57712x2);
            }
            Log.w(f10266k, "checkSupportXiaoAiRingtone failed: no applicationInfo or metaData found!");
            return false;
        } catch (Exception e2) {
            Log.e(f10266k, "checkSupportXiaoAiRingtone error: " + e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public static Drawable m6998q(String packageName, String className, boolean original) {
        PackageManager packageManager = bf2.toq.toq().getPackageManager();
        Drawable drawableLoadIcon = null;
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        if (className != null) {
            intent.setComponent(new ComponentName(packageName, className));
        } else {
            intent.setPackage(packageName);
        }
        try {
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            if (listQueryIntentActivities != null && listQueryIntentActivities.size() > 0) {
                ResolveInfo resolveInfo = listQueryIntentActivities.get(0);
                drawableLoadIcon = original ? packageManager.getDrawable(packageName, resolveInfo.getIconResource(), packageManager.getApplicationInfo(packageName, 128)) : resolveInfo.loadIcon(packageManager);
            }
            if (drawableLoadIcon == null) {
                drawableLoadIcon = packageManager.getApplicationInfo(packageName, 0).loadIcon(packageManager);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getAppIcon: ");
        sb.append(packageName);
        sb.append(",");
        sb.append(drawableLoadIcon != null);
        Log.i(f10266k, sb.toString());
        return drawableLoadIcon;
    }

    public static ArrayList<ResolveInfo> qrj(Context context, Intent targetIntent) {
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(targetIntent, 65536);
        if (listQueryIntentActivities.size() > 0) {
            Collections.sort(listQueryIntentActivities, new C1800k(packageManager));
        }
        return new ArrayList<>(listQueryIntentActivities);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m6999s(String packageName) {
        try {
            bf2.toq.toq().getPackageManager().getApplicationInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            C7794k.m28194k(f10266k, packageName + "is not install");
            return false;
        }
    }

    public static boolean t8r(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Bundle bundle = context.getPackageManager().getPackageInfo("com.lbe.security.miui", 128).applicationInfo.metaData;
            if (bundle == null) {
                return false;
            }
            return bundle.getBoolean("miui.supportSpecialUidControl", false);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean toq() {
        if (f57710ld6 == null) {
            f57710ld6 = Boolean.valueOf(m6995k() && !C1807g.m7081r());
        }
        return f57710ld6.booleanValue();
    }

    public static boolean x2(Context context, String deeplink) {
        try {
            Intent uri = Intent.parseUri(deeplink, 0);
            uri.addFlags(268435456);
            context.startActivity(uri);
            return true;
        } catch (URISyntaxException e2) {
            Log.d(f10266k, e2.getLocalizedMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    public static int m7000y(Context context, String packageName) {
        try {
            return context.getPackageManager().getPackageInfo(packageName, 16384).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static boolean zurt(Context context) {
        return fn3e(context, "com.android.systemui", 20180628);
    }

    public static String zy() {
        ApplicationInfo applicationInfo;
        boolean z2 = false;
        try {
            PackageInfo packageInfo = bf2.toq.toq().getPackageManager().getPackageInfo("com.miui.aod", 128);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                z2 = applicationInfo.metaData.getBoolean("aodPackageChanged", false);
            }
        } catch (Exception e2) {
            Log.d(f10266k, "aod meta get exception " + e2);
        }
        return z2 ? "com.android.systemui" : "com.miui.aod";
    }
}
