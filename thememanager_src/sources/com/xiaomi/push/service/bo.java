package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes3.dex */
class bo implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ XMPushService f33724k;

    bo(XMPushService xMPushService) {
        this.f33724k = xMPushService;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            PackageManager packageManager = this.f33724k.getApplicationContext().getPackageManager();
            ComponentName componentName = new ComponentName(this.f33724k.getApplicationContext(), "com.xiaomi.push.service.receivers.PingReceiver");
            if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("[Alarm] disable ping receiver may be failure. " + th);
        }
    }
}
