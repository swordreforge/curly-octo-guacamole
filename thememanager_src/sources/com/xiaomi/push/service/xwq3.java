package com.xiaomi.push.service;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.push.service.XMPushService.f7l8;

/* JADX INFO: loaded from: classes3.dex */
class xwq3 extends ContentObserver {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ XMPushService f33931k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    xwq3(XMPushService xMPushService, Handler handler) {
        super(handler);
        this.f33931k = xMPushService;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2) {
        super.onChange(z2);
        boolean zM21515g = this.f33931k.m21515g();
        com.xiaomi.channel.commonutils.logger.zy.kja0("SuperPowerMode:" + zM21515g);
        this.f33931k.m21510e();
        if (!zM21515g) {
            this.f33931k.m21535a(true);
        } else {
            XMPushService xMPushService = this.f33931k;
            xMPushService.m21530a(xMPushService.new f7l8(24, null));
        }
    }
}
