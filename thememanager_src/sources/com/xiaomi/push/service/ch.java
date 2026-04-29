package com.xiaomi.push.service;

import com.xiaomi.push.bqie;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.xouc;

/* JADX INFO: loaded from: classes3.dex */
class ch extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ byte[] f33732g;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ String f33733n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ int f33734q;

    /* JADX INFO: renamed from: y */
    final /* synthetic */ XMPushService f33735y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ch(XMPushService xMPushService, int i2, int i3, String str, byte[] bArr) {
        super(i2);
        this.f33735y = xMPushService;
        this.f33734q = i3;
        this.f33733n = str;
        this.f33732g = bArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "clear account cache.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        etdu.f7l8(this.f33735y);
        eqxt.zy().qrj("5");
        xouc.toq(this.f33734q);
        this.f33735y.f33663a.ki(bqie.m20660q());
        com.xiaomi.channel.commonutils.logger.zy.kja0("clear account and start registration. " + this.f33733n);
        this.f33735y.m21536a(this.f33732g, this.f33733n);
    }
}
