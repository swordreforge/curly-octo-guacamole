package com.xiaomi.mipush.sdk;

import android.text.TextUtils;
import com.xiaomi.push.erbd;
import com.xiaomi.push.kq;
import com.xiaomi.push.m8;
import com.xiaomi.push.nc;
import com.xiaomi.push.wwp;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
class qrj implements Runnable {
    qrj() {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (nc.m21310i()) {
            return;
        }
        if (m8.m21275i(cdj.f73122ld6) != null || com.xiaomi.push.o1t.m21340k(cdj.f73122ld6).mo20573a()) {
            erbd erbdVar = new erbd();
            erbdVar.m20795b(C5656l.m19500q(cdj.f73122ld6).m19505n());
            erbdVar.m20799c(kq.ClientInfoUpdate.f33227a);
            erbdVar.m20782a(com.xiaomi.push.service.gvn7.m21617k());
            erbdVar.m20784a(new HashMap());
            String str = "";
            String strM21275i = m8.m21275i(cdj.f73122ld6);
            if (!TextUtils.isEmpty(strM21275i)) {
                str = "" + com.xiaomi.push.n5r1.toq(strM21275i);
            }
            String strFu4 = m8.fu4(cdj.f73122ld6);
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strFu4)) {
                str = str + "," + strFu4;
            }
            if (!TextUtils.isEmpty(str)) {
                erbdVar.m20788a().put(C5658n.f31409q, str);
            }
            com.xiaomi.push.o1t.m21340k(cdj.f73122ld6).m21343q(erbdVar.m20788a());
            int iZy = m8.zy();
            if (iZy >= 0) {
                erbdVar.m20788a().put("space_id", Integer.toString(iZy));
            }
            d3.m19429y(cdj.f73122ld6).m19435z(erbdVar, wwp.Notification, false, null);
        }
    }
}
