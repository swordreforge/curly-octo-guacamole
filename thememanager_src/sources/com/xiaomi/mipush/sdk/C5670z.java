package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.C5889p;
import com.xiaomi.push.erbd;
import com.xiaomi.push.kq;
import com.xiaomi.push.le7;
import com.xiaomi.push.qla;
import com.xiaomi.push.sb1e;
import com.xiaomi.push.wwp;
import gyi.C6068k;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.z */
/* JADX INFO: loaded from: classes3.dex */
public class C5670z extends C5889p.k {

    /* JADX INFO: renamed from: k */
    private Context f31444k;

    /* JADX INFO: renamed from: q */
    private boolean f31445q = false;

    public C5670z(Context context) {
        this.f31444k = context;
    }

    @Override // com.xiaomi.push.C5889p.k
    /* JADX INFO: renamed from: k */
    public String mo19320k() {
        return "2";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.xiaomi.push.service.a9 a9VarM21550q = com.xiaomi.push.service.a9.m21550q(this.f31444k);
        sb1e sb1eVar = new sb1e();
        if (this.f31445q) {
            sb1eVar.m21459a(0);
            sb1eVar.m21464b(0);
        } else {
            sb1eVar.m21459a(com.xiaomi.push.service.fti.m21613k(a9VarM21550q, le7.MISC_CONFIG));
            sb1eVar.m21464b(com.xiaomi.push.service.fti.m21613k(a9VarM21550q, le7.PLUGIN_CONFIG));
        }
        erbd erbdVar = new erbd(C6068k.f35060p, false);
        erbdVar.m20799c(kq.DailyCheckClientConfig.f33227a);
        erbdVar.m20786a(qla.m21397g(sb1eVar));
        com.xiaomi.channel.commonutils.logger.zy.wvg("OcVersionCheckJob", "-->check version: checkMessage=", sb1eVar);
        d3.m19429y(this.f31444k).ni7(erbdVar, wwp.Notification, null);
    }
}
