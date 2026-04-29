package com.xiaomi.push.service;

import com.xiaomi.push.m28;
import com.xiaomi.push.ovdh;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes3.dex */
class f7l8 extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: n */
    final /* synthetic */ m28 f33782n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ XMPushService f33783q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f7l8(int i2, XMPushService xMPushService, m28 m28Var) {
        super(i2);
        this.f33783q = xMPushService;
        this.f33782n = m28Var;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "send ack message for unrecognized new miui message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        try {
            m28 qVar = zy.toq(this.f33783q, this.f33782n);
            qVar.m21235a().m20909a("miui_message_unrecognized", "1");
            x2.m21796s(this.f33783q, qVar);
        } catch (ovdh e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            this.f33783q.m21527a(10, e2);
        }
    }
}
