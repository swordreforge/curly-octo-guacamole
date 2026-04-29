package com.xiaomi.push.service;

import com.xiaomi.push.o5;
import com.xiaomi.push.ovdh;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes3.dex */
public class vyq extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: n */
    private o5 f33921n;

    /* JADX INFO: renamed from: q */
    private XMPushService f33922q;

    public vyq(XMPushService xMPushService, o5 o5Var) {
        super(4);
        this.f33922q = xMPushService;
        this.f33921n = o5Var;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "send a message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        try {
            o5 o5Var = this.f33921n;
            if (o5Var != null) {
                if (vq.m21773k(o5Var)) {
                    this.f33921n.wvg(System.currentTimeMillis() - this.f33921n.toq());
                }
                this.f33922q.m21528a(this.f33921n);
            }
        } catch (ovdh e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            this.f33922q.m21527a(10, e2);
        }
    }
}
