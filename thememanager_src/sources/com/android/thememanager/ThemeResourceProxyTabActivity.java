package com.android.thememanager;

import android.app.ActivityManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.clockmessage.model.C1873k;

/* JADX INFO: loaded from: classes.dex */
public class ThemeResourceProxyTabActivity extends ThemeResourceTabActivity {
    public static final String as = "key_start_theme_from_store";
    public static final String bg = "com.miui.action.thememanager.main_exit";
    public static final String bl = "com.miui.theme.action.VIEW_HOME";
    private static final String in = "ThemeResourceProxyTabActivity";
    private boolean id;

    private boolean ebn() {
        if (!y9n.vyq() || com.android.thememanager.basemodule.utils.a9.m6999s(y9n.f10446p)) {
            return false;
        }
        Log.i(in, "jumpToAppMarket");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=com.miui.themestore&back=true&ref=thememanager"));
        try {
            startActivity(intent);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            intent.setData(Uri.parse("mimarket://details?id=com.miui.themestore&back=true&ref=thememanager"));
            try {
                startActivity(intent);
                return true;
            } catch (Exception e3) {
                e3.printStackTrace();
                return true;
            }
        }
    }

    private boolean ukdy() {
        try {
            return ((ActivityManager) getSystemService(C1873k.f10652g)).getLockTaskModeState() == 2;
        } catch (Exception e2) {
            Log.e(in, "isAppInLockTaskMode error : " + e2);
            return false;
        }
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity
    public void finish() {
        if (ukdy()) {
            Log.i(in, "ProxyTabActivity can't exit: LOCK_TASK_MODE_PINNED");
            return;
        }
        super.finish();
        Log.i(in, "ProxyTabActivity exit ," + this.id);
        if (this.id) {
            Intent intent = new Intent(bg);
            intent.setPackage(y9n.f10446p);
            sendBroadcast(intent);
        }
    }

    @Override // com.android.thememanager.ThemeResourceTabActivity, com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        if (ebn()) {
            finish();
        }
        super.onCreate(savedInstanceState);
        this.id = getIntent().getBooleanExtra(as, false);
    }
}
