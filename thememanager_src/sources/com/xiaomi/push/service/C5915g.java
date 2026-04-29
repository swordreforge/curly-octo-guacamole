package com.xiaomi.push.service;

import com.xiaomi.push.m28;
import com.xiaomi.push.ovdh;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: renamed from: com.xiaomi.push.service.g */
/* JADX INFO: loaded from: classes3.dex */
class C5915g extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: n */
    final /* synthetic */ m28 f33784n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ XMPushService f33785q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5915g(int i2, XMPushService xMPushService, m28 m28Var) {
        super(i2);
        this.f33785q = xMPushService;
        this.f33784n = m28Var;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "send ack message for obsleted message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        try {
            m28 qVar = zy.toq(this.f33785q, this.f33784n);
            qVar.m21235a().m20909a("message_obsleted", "1");
            x2.m21796s(this.f33785q, qVar);
        } catch (ovdh e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            this.f33785q.m21527a(10, e2);
        }
    }
}
