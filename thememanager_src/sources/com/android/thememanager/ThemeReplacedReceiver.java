package com.android.thememanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.thememanager.miuixcompat.C2206g;
import com.android.thememanager.service.ThemeSchedulerService;
import ek5k.C6002g;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ThemeReplacedReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: k */
    private static final String f8702k = "ThemeReplacedReceiver";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void toq(String str) {
        C2206g.jk(false, "ThemeReplacedReceiver,check miui version" + com.android.thememanager.basemodule.utils.a9.m7000y(bf2.toq.toq(), str), str);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d(f8702k, "onReceive: " + intent.getAction());
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            ArrayList arrayList = new ArrayList(C2206g.n7h());
            arrayList.add("com.android.settings");
            final String strZy = com.android.thememanager.basemodule.utils.hyr.zy(",", arrayList);
            ThemeSchedulerService.fn3e(context, strZy);
            Log.d(f8702k, "receive from: " + strZy);
            C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.dd
                @Override // java.lang.Runnable
                public final void run() {
                    ThemeReplacedReceiver.toq(strZy);
                }
            });
        }
    }
}
