package com.xiaomi.push.service;

import com.xiaomi.push.C5892r;

/* JADX INFO: renamed from: com.xiaomi.push.service.u */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5940u implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ XMPushService f33914k;

    RunnableC5940u(XMPushService xMPushService) {
        this.f33914k = xMPushService;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f33914k.f33680a = true;
        try {
            com.xiaomi.channel.commonutils.logger.zy.kja0("try to trigger the wifi digest broadcast.");
            Object systemService = this.f33914k.getApplicationContext().getSystemService("MiuiWifiService");
            if (systemService != null) {
                C5892r.n7h(systemService, "sendCurrentWifiDigestInfo", new Object[0]);
            }
        } catch (Throwable unused) {
        }
    }
}
