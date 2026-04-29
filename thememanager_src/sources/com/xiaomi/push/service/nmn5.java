package com.xiaomi.push.service;

import com.xiaomi.push.ovdh;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes3.dex */
class nmn5 extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ XMPushService f33865g;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ byte[] f33866n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ String f33867q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    nmn5(XMPushService xMPushService, int i2, String str, byte[] bArr) {
        super(i2);
        this.f33865g = xMPushService;
        this.f33867q = str;
        this.f33866n = bArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "send mi push message";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        try {
            x2.x2(this.f33865g, this.f33867q, this.f33866n);
        } catch (ovdh e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            this.f33865g.m21527a(10, e2);
        }
    }
}
