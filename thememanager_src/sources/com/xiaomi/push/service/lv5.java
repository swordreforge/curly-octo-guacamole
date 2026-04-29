package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes3.dex */
class lv5 extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: q */
    final /* synthetic */ XMPushService f33839q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    lv5(XMPushService xMPushService, int i2) {
        super(i2);
        this.f33839q = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "disconnect for service destroy.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        if (this.f33839q.f33664a != null) {
            this.f33839q.f33664a.zurt(15, null);
            this.f33839q.f33664a = null;
        }
    }
}
