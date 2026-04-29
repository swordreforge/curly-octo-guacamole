package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes3.dex */
class ps extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: q */
    final /* synthetic */ u38j f33568q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ps(u38j u38jVar, int i2) {
        super(i2);
        this.f33568q = u38jVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "Handling bind stats";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        this.f33568q.m21856n();
    }
}
