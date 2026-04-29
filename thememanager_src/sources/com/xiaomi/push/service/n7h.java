package com.xiaomi.push.service;

import com.xiaomi.mipush.sdk.C5650g;
import com.xiaomi.push.service.eqxt;

/* JADX INFO: loaded from: classes3.dex */
class n7h implements eqxt.toq.InterfaceC5912k {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ XMPushService f33860k;

    n7h(XMPushService xMPushService) {
        this.f33860k = xMPushService;
    }

    @Override // com.xiaomi.push.service.eqxt.toq.InterfaceC5912k
    /* JADX INFO: renamed from: k */
    public void mo21564k(eqxt.zy zyVar, eqxt.zy zyVar2, int i2) {
        if (zyVar2 == eqxt.zy.binded) {
            w831.m21777q(this.f33860k, true);
            w831.zy(this.f33860k);
        } else if (zyVar2 == eqxt.zy.unbind) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("onChange unbind");
            w831.m21775k(this.f33860k, C5650g.f73142toq, " the push is not connected.");
        }
    }
}
