package com.android.thememanager.miuixcompat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.thememanager.service.ThemeSchedulerService;

/* JADX INFO: loaded from: classes2.dex */
public class AppReplacedReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: k */
    public static final String f12995k = AppReplacedReceiver.class.getSimpleName();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f60481toq = "com.miui.action.APP_REPLACED_ACTION_FOR_THEME";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (f60481toq.equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("android.intent.extra.PACKAGE_NAME");
            Log.d(f12995k, "receive from: " + stringExtra);
            ThemeSchedulerService.fn3e(context, stringExtra);
        }
    }
}
