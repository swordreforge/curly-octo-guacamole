package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes3.dex */
class xm extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ btvn f34177g;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ Exception f34178n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ int f34179q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    xm(btvn btvnVar, int i2, int i3, Exception exc) {
        super(i2);
        this.f34177g = btvnVar;
        this.f34179q = i3;
        this.f34178n = exc;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "shutdown the connection. " + this.f34179q + ", " + this.f34178n;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        this.f34177g.f73275fu4.m21527a(this.f34179q, this.f34178n);
    }
}
