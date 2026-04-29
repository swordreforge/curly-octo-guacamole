package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.eqxt;

/* JADX INFO: renamed from: com.xiaomi.push.service.r */
/* JADX INFO: loaded from: classes3.dex */
class C5936r extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: q */
    final /* synthetic */ eqxt.toq.zy f33888q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5936r(eqxt.toq.zy zyVar, int i2) {
        super(i2);
        this.f33888q = zyVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "check peer job";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        eqxt eqxtVarZy = eqxt.zy();
        eqxt.toq toqVar = this.f33888q.f33772k;
        if (eqxtVarZy.toq(toqVar.f33766y, toqVar.f73603toq).f73597ki == null) {
            XMPushService xMPushService = eqxt.toq.this.f33759h;
            eqxt.toq toqVar2 = this.f33888q.f33772k;
            xMPushService.m21533a(toqVar2.f33766y, toqVar2.f73603toq, 2, null, null);
        }
    }
}
