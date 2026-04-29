package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;

/* JADX INFO: renamed from: com.xiaomi.push.service.v */
/* JADX INFO: loaded from: classes3.dex */
class C5941v extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: q */
    final /* synthetic */ XMPushService f33916q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5941v(XMPushService xMPushService, int i2) {
        super(i2);
        this.f33916q = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "prepare the mi push account.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        x2.m21797y(this.f33916q);
        if (com.xiaomi.push.oc.zurt(this.f33916q)) {
            this.f33916q.m21535a(true);
        }
    }
}
