package com.xiaomi.push.service;

import android.content.Context;
import android.util.Log;
import com.xiaomi.push.C5889p;
import com.xiaomi.push.erbd;
import com.xiaomi.push.kq;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.y3;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.xiaomi.push.service.a */
/* JADX INFO: loaded from: classes3.dex */
public class C5905a implements XMPushService.n7h {

    /* JADX INFO: renamed from: k */
    private static final boolean f33713k = Log.isLoggable("UNDatas", 3);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Map<Integer, Map<String, List<String>>> f73554toq = new HashMap();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Context f73555zy;

    public C5905a(Context context) {
        f73555zy = context;
    }

    /* JADX INFO: renamed from: q */
    private static void m21548q() {
        HashMap map = new HashMap();
        map.putAll(f73554toq);
        if (map.size() > 0) {
            for (Integer num : map.keySet()) {
                Map map2 = (Map) map.get(num);
                if (map2 != null && map2.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (String str : map2.keySet()) {
                        sb.append(str);
                        sb.append(":");
                        List list = (List) map2.get(str);
                        if (!y3.m22049q(list)) {
                            for (int i2 = 0; i2 < list.size(); i2++) {
                                if (i2 != 0) {
                                    sb.append(",");
                                }
                                sb.append((String) list.get(i2));
                            }
                        }
                        sb.append(";");
                    }
                    erbd qVar = toq(null, gvn7.m21617k(), kq.NotificationRemoved.f33227a, null);
                    qVar.m20790a("removed_reason", String.valueOf(num));
                    qVar.m20790a("all_delete_msgId_appId", sb.toString());
                    com.xiaomi.channel.commonutils.logger.zy.m19302z("UNDatas upload all removed messages reason: " + num + " allIds: " + sb.toString());
                    zy(f73555zy, qVar);
                }
                f73554toq.remove(num);
            }
        }
    }

    private static erbd toq(String str, String str2, String str3, String str4) {
        erbd erbdVar = new erbd();
        if (str3 != null) {
            erbdVar.m20799c(str3);
        }
        if (str != null) {
            erbdVar.m20795b(str);
        }
        if (str2 != null) {
            erbdVar.m20782a(str2);
        }
        if (str4 != null) {
            erbdVar.m20803d(str4);
        }
        erbdVar.m20785a(false);
        return erbdVar;
    }

    private static void zy(Context context, erbd erbdVar) {
        if (f33713k) {
            com.xiaomi.channel.commonutils.logger.zy.m19302z("UNDatas upload message notification:" + erbdVar);
        }
        C5889p.toq(context).f7l8(new zp(erbdVar));
    }

    @Override // com.xiaomi.push.service.XMPushService.n7h
    /* JADX INFO: renamed from: a */
    public void mo21145a() {
        Map<Integer, Map<String, List<String>>> map = f73554toq;
        if (map.size() > 0) {
            synchronized (map) {
                m21548q();
            }
        }
    }
}
