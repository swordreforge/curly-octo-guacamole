package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.erbd;
import com.xiaomi.push.ge;
import com.xiaomi.push.m28;
import com.xiaomi.push.qla;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.wwp;
import gyi.C6068k;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class m4 extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ String f33848g;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ List f33849n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ String f33850q;

    /* JADX INFO: renamed from: y */
    final /* synthetic */ r8s8 f33851y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m4(r8s8 r8s8Var, int i2, String str, List list, String str2) {
        super(i2);
        this.f33851y = r8s8Var;
        this.f33850q = str;
        this.f33849n = list;
        this.f33848g = str2;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "Send tiny data.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        String strM21746q = this.f33851y.m21746q(this.f33850q);
        ArrayList<erbd> arrayListZy = ek5k.zy(this.f33849n, this.f33850q, strM21746q, 32768);
        if (arrayListZy == null) {
            com.xiaomi.channel.commonutils.logger.zy.jk("TinyData LongConnUploader.upload Get a null XmPushActionNotification list when TinyDataHelper.pack() in XMPushService.");
            return;
        }
        for (erbd erbdVar : arrayListZy) {
            erbdVar.m20790a("uploadWay", "longXMPushService");
            m28 m28VarM21795q = x2.m21795q(this.f33850q, strM21746q, erbdVar, wwp.Notification);
            if (!TextUtils.isEmpty(this.f33848g) && !TextUtils.equals(this.f33850q, this.f33848g)) {
                if (m28VarM21795q.m21235a() == null) {
                    ge geVar = new ge();
                    geVar.m20904a(C6068k.f35060p);
                    m28VarM21795q.m21237a(geVar);
                }
                m28VarM21795q.m21235a().m20918b("ext_traffic_source_pkg", this.f33848g);
            }
            this.f33851y.f33889k.m21534a(this.f33850q, qla.m21397g(m28VarM21795q), true);
        }
    }
}
