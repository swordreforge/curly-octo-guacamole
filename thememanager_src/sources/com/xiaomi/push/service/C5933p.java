package com.xiaomi.push.service;

import com.xiaomi.push.erbd;
import com.xiaomi.push.kq;
import com.xiaomi.push.m28;
import com.xiaomi.push.ovdh;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.wwp;
import com.xiaomi.push.z8;

/* JADX INFO: renamed from: com.xiaomi.push.service.p */
/* JADX INFO: loaded from: classes3.dex */
class C5933p extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ XMPushService f33873g;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ m28 f33874n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ erbd f33875q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5933p(int i2, erbd erbdVar, m28 m28Var, XMPushService xMPushService) {
        super(i2);
        this.f33875q = erbdVar;
        this.f33874n = m28Var;
        this.f33873g = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "send ack message for clear push message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        try {
            z8 z8Var = new z8();
            z8Var.m22091c(kq.CancelPushMessageACK.f33227a);
            z8Var.m22081a(this.f33875q.m20787a());
            z8Var.m22080a(this.f33875q.m20781a());
            z8Var.m22088b(this.f33875q.m20796b());
            z8Var.m22095e(this.f33875q.m20804d());
            z8Var.m22079a(0L);
            z8Var.m22093d("success clear push message.");
            x2.m21796s(this.f33873g, x2.n7h(this.f33874n.m21251b(), this.f33874n.m21243a(), z8Var, wwp.Notification));
        } catch (ovdh e2) {
            com.xiaomi.channel.commonutils.logger.zy.jk("clear push message. " + e2);
            this.f33873g.m21527a(10, e2);
        }
    }
}
