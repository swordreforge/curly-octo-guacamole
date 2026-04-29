package com.xiaomi.mipush.sdk;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
class d2ok extends ContentObserver {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ d3 f31327k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d2ok(d3 d3Var, Handler handler) {
        super(handler);
        this.f31327k = d3Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2) {
        d3 d3Var = this.f31327k;
        d3Var.f73131ld6 = Integer.valueOf(com.xiaomi.push.service.ncyb.zy(d3Var.f73132toq).m21700k());
        if (this.f31327k.f73131ld6.intValue() != 0) {
            this.f31327k.f73132toq.getContentResolver().unregisterContentObserver(this);
            if (com.xiaomi.push.oc.zurt(this.f31327k.f73132toq)) {
                this.f31327k.n5r1();
            }
        }
    }
}
