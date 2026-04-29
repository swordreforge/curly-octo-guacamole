package com.android.thememanager.basemodule.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.android.thememanager.activity.LargeIconPickerActivity;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.config.model.Config;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.fn3e;
import ek5k.C6002g;

/* JADX INFO: compiled from: LargeIconHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class fn3e {

    /* JADX INFO: renamed from: k */
    private static Boolean f10318k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static String f57750toq;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.fn3e$k */
    /* JADX INFO: compiled from: LargeIconHelper.java */
    class C1806k extends BroadcastReceiver {
        C1806k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void toq() {
            if (fn3e.m7063n(true)) {
                try {
                    bf2.toq.m5813p();
                    y9n.x9kr("for update largeIcon config home update");
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C6002g.m22247s(new Runnable() { // from class: com.android.thememanager.basemodule.utils.i
                @Override // java.lang.Runnable
                public final void run() {
                    fn3e.C1806k.toq();
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m7061g(Context context) {
        C1806k c1806k = new C1806k();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        intentFilter.addDataSchemeSpecificPart(InterfaceC1789q.k9, 0);
        context.registerReceiver(c1806k, intentFilter);
        Log.i("LargeIconHelper", "observerLauncherSupportLargeIcon");
    }

    /* JADX INFO: renamed from: k */
    public static void m7062k() {
        Config configX2;
        boolean zZy = C1824r.m7203y().zy("check_config_support_large_icon", false);
        Log.d("LargeIconHelper", "checkAndSyncCache: hasChecked = " + zZy + ",sSupportLargeIconFunction = " + f10318k);
        if (!f10318k.booleanValue() || zZy || (configX2 = C1724k.m6723p().x2()) == null) {
            return;
        }
        if (!configX2.getCurrentTabCodeList().contains("largeicons")) {
            bf2.toq.m5813p();
            Log.i("LargeIconHelper", "checkAndSyncCache: updateCache success");
        }
        C1824r.m7203y().m7206p("check_config_support_large_icon", true);
    }

    /* JADX INFO: renamed from: n */
    public static synchronized boolean m7063n(boolean forceRefresh) {
        if (f10318k == null || forceRefresh) {
            zy();
        }
        return f10318k.booleanValue();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m7064q(String packageName, String activityName) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("packageName", packageName);
            bundle.putString(LargeIconPickerActivity.ay, activityName);
            return bf2.toq.toq().getContentResolver().call(Uri.parse("content://com.miui.home.launcher.bigicon.iconsize"), "supportConversionIconSize", (String) null, bundle).getBoolean("supportConversionIconSize", false);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static synchronized String toq(boolean forceRefresh) {
        if (forceRefresh) {
            zy();
        }
        return f57750toq;
    }

    public static synchronized boolean zy() {
        try {
            Log.i("LargeIconHelper", "begin initLauncherLargeIconInfo");
            Bundle bundleCall = bf2.toq.toq().getContentResolver().call(Uri.parse("content://com.miui.home.launcher.bigicon.iconsize"), "supportLargeIcon", (String) null, (Bundle) null);
            if (bundleCall == null || !bundleCall.getBoolean("supportLargeIcon", false)) {
                f10318k = Boolean.FALSE;
            } else {
                f10318k = Boolean.TRUE;
            }
            if (bundleCall != null) {
                f57750toq = bundleCall.getString(LargeIconPickerActivity.bs);
            }
            Log.d("LargeIconHelper", "initLauncherLargeIconInfo: sLauncherMode = " + f57750toq + ",sSupportLargeIconFunction = " + f10318k);
        } catch (Exception e2) {
            f10318k = Boolean.FALSE;
            Log.w("LargeIconHelper", "initLauncherLargeIconInfo: not support");
            e2.printStackTrace();
            return false;
        }
        return true;
    }
}
