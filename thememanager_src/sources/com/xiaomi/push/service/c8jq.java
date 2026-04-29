package com.xiaomi.push.service;

import com.xiaomi.push.bqie;
import com.xiaomi.push.lh;
import com.xiaomi.push.ob;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class c8jq extends bqie {

    /* JADX INFO: renamed from: z */
    final /* synthetic */ XMPushService f33725z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c8jq(XMPushService xMPushService, Map map, int i2, String str, ob obVar) {
        super(map, i2, str, obVar);
        this.f33725z = xMPushService;
    }

    @Override // com.xiaomi.push.bqie
    public byte[] qrj() {
        try {
            lh.toq toqVar = new lh.toq();
            toqVar.m21193p(nn86.m21710g().m21715k());
            return toqVar.m20674y();
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("getOBBString err: " + e2.toString());
            return null;
        }
    }
}
