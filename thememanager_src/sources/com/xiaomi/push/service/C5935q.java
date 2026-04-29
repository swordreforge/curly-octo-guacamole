package com.xiaomi.push.service;

import com.xiaomi.push.m28;
import com.xiaomi.push.ovdh;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: renamed from: com.xiaomi.push.service.q */
/* JADX INFO: loaded from: classes3.dex */
class C5935q extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: n */
    final /* synthetic */ m28 f33883n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ XMPushService f33884q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5935q(int i2, XMPushService xMPushService, m28 m28Var) {
        super(i2);
        this.f33884q = xMPushService;
        this.f33883n = m28Var;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "send app absent message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        try {
            x2.m21796s(this.f33884q, x2.zy(this.f33883n.m21251b(), this.f33883n.m21243a()));
        } catch (ovdh e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            this.f33884q.m21527a(10, e2);
        }
    }
}
