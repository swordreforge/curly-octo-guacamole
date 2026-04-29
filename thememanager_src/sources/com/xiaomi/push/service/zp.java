package com.xiaomi.push.service;

import com.xiaomi.push.erbd;
import com.xiaomi.push.qla;
import com.xiaomi.push.wwp;

/* JADX INFO: loaded from: classes3.dex */
class zp implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ erbd f33942k;

    zp(erbd erbdVar) {
        this.f33942k = erbdVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArrM21397g = qla.m21397g(x2.m21795q(this.f33942k.m20804d(), this.f33942k.m20796b(), this.f33942k, wwp.Notification));
        if (C5905a.f73555zy instanceof XMPushService) {
            ((XMPushService) C5905a.f73555zy).m21534a(this.f33942k.m20804d(), bArrM21397g, true);
        } else {
            com.xiaomi.channel.commonutils.logger.zy.kja0("UNDatas UploadNotificationDatas failed because not xmsf");
        }
    }
}
