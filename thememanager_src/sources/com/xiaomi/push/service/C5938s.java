package com.xiaomi.push.service;

import com.xiaomi.push.m28;
import com.xiaomi.push.ovdh;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: renamed from: com.xiaomi.push.service.s */
/* JADX INFO: loaded from: classes3.dex */
class C5938s extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ String f33894g;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ m28 f33895n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ XMPushService f33896q;

    /* JADX INFO: renamed from: y */
    final /* synthetic */ String f33897y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5938s(int i2, XMPushService xMPushService, m28 m28Var, String str, String str2) {
        super(i2);
        this.f33896q = xMPushService;
        this.f33895n = m28Var;
        this.f33894g = str;
        this.f33897y = str2;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "send wrong message ack for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        try {
            m28 qVar = zy.toq(this.f33896q, this.f33895n);
            qVar.f33387a.m20909a("error", this.f33894g);
            qVar.f33387a.m20909a("reason", this.f33897y);
            x2.m21796s(this.f33896q, qVar);
        } catch (ovdh e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            this.f33896q.m21527a(10, e2);
        }
    }
}
