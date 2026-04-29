package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.eqxt;

/* JADX INFO: loaded from: classes3.dex */
class lvui extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: q */
    final /* synthetic */ eqxt.toq.zy f33840q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    lvui(eqxt.toq.zy zyVar, int i2) {
        super(i2);
        this.f33840q = zyVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "clear peer job";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        eqxt.toq.zy zyVar = this.f33840q;
        if (zyVar.f73607toq == zyVar.f33772k.f73597ki) {
            com.xiaomi.channel.commonutils.logger.zy.m19302z("clean peer, chid = " + this.f33840q.f33772k.f33766y);
            this.f33840q.f33772k.f73597ki = null;
        }
    }
}
