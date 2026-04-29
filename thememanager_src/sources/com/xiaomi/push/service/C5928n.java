package com.xiaomi.push.service;

import com.xiaomi.push.m28;
import com.xiaomi.push.nc;
import com.xiaomi.push.ovdh;
import com.xiaomi.push.service.XMPushService;
import java.util.Map;

/* JADX INFO: renamed from: com.xiaomi.push.service.n */
/* JADX INFO: loaded from: classes3.dex */
class C5928n extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: n */
    final /* synthetic */ m28 f33855n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ XMPushService f33856q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5928n(int i2, XMPushService xMPushService, m28 m28Var) {
        super(i2);
        this.f33856q = xMPushService;
        this.f33855n = m28Var;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "send ack message for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        Map<String, String> mapM21679k = null;
        try {
            if (nc.m21313p(this.f33856q)) {
                try {
                    mapM21679k = ld6.m21679k(this.f33856q, this.f33855n);
                } catch (Throwable unused) {
                }
            }
            x2.m21796s(this.f33856q, zy.zy(this.f33856q, this.f33855n, mapM21679k));
        } catch (ovdh e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            this.f33856q.m21527a(10, e2);
        }
    }
}
