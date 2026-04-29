package com.xiaomi.push.service;

import com.xiaomi.push.o5;
import com.xiaomi.push.ovdh;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: renamed from: com.xiaomi.push.service.d */
/* JADX INFO: loaded from: classes3.dex */
class C5909d extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: n */
    private o5[] f33736n;

    /* JADX INFO: renamed from: q */
    private XMPushService f33737q;

    public C5909d(XMPushService xMPushService, o5[] o5VarArr) {
        super(4);
        this.f33737q = xMPushService;
        this.f33736n = o5VarArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "batch send message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        try {
            o5[] o5VarArr = this.f33736n;
            if (o5VarArr != null) {
                this.f33737q.m21537a(o5VarArr);
            }
        } catch (ovdh e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            this.f33737q.m21527a(10, e2);
        }
    }
}
