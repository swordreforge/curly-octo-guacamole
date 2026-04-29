package com.xiaomi.push.service;

import com.xiaomi.push.m28;
import com.xiaomi.push.ovdh;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: renamed from: com.xiaomi.push.service.y */
/* JADX INFO: loaded from: classes3.dex */
class C5945y extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ String f33932g;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ m28 f33933n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ XMPushService f33934q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5945y(int i2, XMPushService xMPushService, m28 m28Var, String str) {
        super(i2);
        this.f33934q = xMPushService;
        this.f33933n = m28Var;
        this.f33932g = str;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "send app absent ack message for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        try {
            m28 qVar = zy.toq(this.f33934q, this.f33933n);
            qVar.m21235a().m20909a("absent_target_package", this.f33932g);
            x2.m21796s(this.f33934q, qVar);
        } catch (ovdh e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            this.f33934q.m21527a(10, e2);
        }
    }
}
