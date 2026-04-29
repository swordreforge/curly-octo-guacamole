package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.C5872k;
import com.xiaomi.push.erbd;
import com.xiaomi.push.kq;
import com.xiaomi.push.m8;
import com.xiaomi.push.nc;
import com.xiaomi.push.uf;
import com.xiaomi.push.wwp;
import com.xiaomi.push.zah1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class ncyb implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Context f31417k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ boolean f31418q;

    ncyb(Context context, boolean z2) {
        this.f31417k = context;
        this.f31418q = z2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.xiaomi.channel.commonutils.logger.zy.kja0("do sync info");
        erbd erbdVar = new erbd(com.xiaomi.push.service.gvn7.m21617k(), false);
        C5656l c5656lM19500q = C5656l.m19500q(this.f31417k);
        erbdVar.m20799c(kq.SyncInfo.f33227a);
        erbdVar.m20795b(c5656lM19500q.m19505n());
        erbdVar.m20803d(this.f31417k.getPackageName());
        HashMap map = new HashMap();
        erbdVar.f32866a = map;
        Context context = this.f31417k;
        zah1.zy(map, C5658n.f73186toq, uf.m21865y(context, context.getPackageName()));
        Map<String, String> map2 = erbdVar.f32866a;
        Context context2 = this.f31417k;
        zah1.zy(map2, C5658n.f73191zy, Integer.toString(uf.toq(context2, context2.getPackageName())));
        zah1.zy(erbdVar.f32866a, "push_sdk_vn", C5872k.f33107g);
        zah1.zy(erbdVar.f32866a, "push_sdk_vc", Integer.toString(C5872k.f33109n));
        zah1.zy(erbdVar.f32866a, "token", c5656lM19500q.kja0());
        if (!nc.m21310i()) {
            String qVar = com.xiaomi.push.n5r1.toq(m8.m21275i(this.f31417k));
            String strFu4 = m8.fu4(this.f31417k);
            if (!TextUtils.isEmpty(strFu4)) {
                qVar = qVar + "," + strFu4;
            }
            if (!TextUtils.isEmpty(qVar)) {
                zah1.zy(erbdVar.f32866a, C5658n.f31409q, qVar);
            }
        }
        com.xiaomi.push.o1t.m21340k(this.f31417k).m21343q(erbdVar.f32866a);
        zah1.zy(erbdVar.f32866a, C5658n.f31403g, c5656lM19500q.m19503i());
        zah1.zy(erbdVar.f32866a, C5658n.f73168f7l8, c5656lM19500q.ni7());
        zah1.zy(erbdVar.f32866a, C5658n.f31413y, cdj.fu4(this.f31417k).replace(",", C5658n.f73185t8r));
        if (this.f31418q) {
            zah1.zy(erbdVar.f32866a, C5658n.f31411s, x9kr.m19567g(cdj.m19408z(this.f31417k)));
            zah1.zy(erbdVar.f32866a, C5658n.f73177ld6, x9kr.m19567g(cdj.o1t(this.f31417k)));
            zah1.zy(erbdVar.f32866a, C5658n.f73184qrj, x9kr.m19567g(cdj.wvg(this.f31417k)));
        } else {
            zah1.zy(erbdVar.f32866a, C5658n.f31408p, x9kr.f7l8(cdj.m19408z(this.f31417k)));
            zah1.zy(erbdVar.f32866a, C5658n.f73188x2, x9kr.f7l8(cdj.o1t(this.f31417k)));
            zah1.zy(erbdVar.f32866a, C5658n.f73180n7h, x9kr.f7l8(cdj.wvg(this.f31417k)));
        }
        d3.m19429y(this.f31417k).m19435z(erbdVar, wwp.Notification, false, null);
    }
}
