package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes3.dex */
class kq2f extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ btvn f33228g;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ long f33229n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ long f33230q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    kq2f(btvn btvnVar, int i2, long j2, long j3) {
        super(i2);
        this.f33228g = btvnVar;
        this.f33230q = j2;
        this.f33229n = j3;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "check the ping-pong." + this.f33229n;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        Thread.yield();
        if (!this.f33228g.jk() || this.f33228g.ki(this.f33230q)) {
            return;
        }
        com.xiaomi.push.service.py.zy(this.f33228g.f73275fu4).qrj();
        this.f33228g.f73275fu4.m21527a(22, (Exception) null);
    }
}
