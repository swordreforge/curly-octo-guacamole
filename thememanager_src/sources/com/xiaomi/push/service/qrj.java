package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.erbd;
import com.xiaomi.push.kq;
import com.xiaomi.push.qla;
import com.xiaomi.push.service.C5921j;
import com.xiaomi.push.wwp;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
class qrj extends C5921j.k {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ v0af f33886g;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ XMPushService f33887n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    qrj(String str, long j2, XMPushService xMPushService, v0af v0afVar) {
        super(str, j2);
        this.f33887n = xMPushService;
        this.f33886g = v0afVar;
    }

    @Override // com.xiaomi.push.service.C5921j.k
    /* JADX INFO: renamed from: k */
    void mo21645k(C5921j c5921j) {
        com.xiaomi.push.o1t o1tVarM21340k = com.xiaomi.push.o1t.m21340k(this.f33887n);
        String strM21644q = c5921j.m21644q("MSAID", "msaid");
        String strMo20572a = o1tVarM21340k.mo20572a();
        if (TextUtils.isEmpty(strMo20572a) || TextUtils.equals(strM21644q, strMo20572a)) {
            return;
        }
        c5921j.f7l8("MSAID", "msaid", strMo20572a);
        erbd erbdVar = new erbd();
        erbdVar.m20795b(this.f33886g.f33920q);
        erbdVar.m20799c(kq.ClientInfoUpdate.f33227a);
        erbdVar.m20782a(gvn7.m21617k());
        erbdVar.m20784a(new HashMap());
        o1tVarM21340k.m21343q(erbdVar.m20788a());
        byte[] bArrM21397g = qla.m21397g(x2.m21795q(this.f33887n.getPackageName(), this.f33886g.f33920q, erbdVar, wwp.Notification));
        XMPushService xMPushService = this.f33887n;
        xMPushService.m21534a(xMPushService.getPackageName(), bArrM21397g, true);
    }
}
