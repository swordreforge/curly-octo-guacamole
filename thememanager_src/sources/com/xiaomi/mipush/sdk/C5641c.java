package com.xiaomi.mipush.sdk;

import com.xiaomi.push.oph;
import com.xiaomi.push.service.a9;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.c */
/* JADX INFO: loaded from: classes3.dex */
class C5641c extends a9.AbstractRunnableC5906k {

    /* JADX INFO: renamed from: n */
    final /* synthetic */ C5648f f31315n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5641c(C5648f c5648f, int i2, String str) {
        super(i2, str);
        this.f31315n = c5648f;
    }

    @Override // com.xiaomi.push.service.a9.AbstractRunnableC5906k
    /* JADX INFO: renamed from: k */
    protected void mo19383k() {
        boolean zQrj = com.xiaomi.push.service.a9.m21550q(this.f31315n.f31346k).qrj(oph.AggregatePushSwitch.m21370a(), true);
        if (this.f31315n.f73137zy != zQrj) {
            this.f31315n.f73137zy = zQrj;
            uv6.fn3e(this.f31315n.f31346k);
        }
    }
}
