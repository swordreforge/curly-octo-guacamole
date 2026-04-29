package com.xiaomi.push;

import android.content.Context;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class m4 {

    /* JADX INFO: renamed from: k */
    private final String f33403k = "disconnection_event";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f73485toq = "count";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final String f73487zy = "host";

    /* JADX INFO: renamed from: q */
    private final String f33406q = "network_state";

    /* JADX INFO: renamed from: n */
    private final String f33404n = "reason";

    /* JADX INFO: renamed from: g */
    private final String f33402g = "ping_interval";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final String f73481f7l8 = "network_type";

    /* JADX INFO: renamed from: y */
    private final String f33408y = "wifi_digest";

    /* JADX INFO: renamed from: s */
    private final String f33407s = "duration";

    /* JADX INFO: renamed from: p */
    private final String f33405p = "disconnect_time";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final String f73482ld6 = "connect_time";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final String f73486x2 = "xmsf_vc";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final String f73484qrj = "android_vc";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final String f73483n7h = "uuid";

    /* JADX INFO: renamed from: k */
    public void m21268k(Context context, List<r8s8> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        ltg8.f7l8("upload size = " + list.size());
        String strM21600q = com.xiaomi.push.service.etdu.m21600q(context);
        for (r8s8 r8s8Var : list) {
            HashMap map = new HashMap();
            map.put("count", Integer.valueOf(r8s8Var.m21420k()));
            map.put("host", r8s8Var.zy());
            map.put("network_state", Integer.valueOf(r8s8Var.f7l8()));
            map.put("reason", Integer.valueOf(r8s8Var.qrj()));
            map.put("ping_interval", Long.valueOf(r8s8Var.toq()));
            map.put("network_type", Integer.valueOf(r8s8Var.cdj()));
            map.put("wifi_digest", r8s8Var.m21424s());
            map.put("connected_network_type", Integer.valueOf(r8s8Var.fn3e()));
            map.put("duration", Long.valueOf(r8s8Var.m21425y()));
            map.put("disconnect_time", Long.valueOf(r8s8Var.n7h()));
            map.put("connect_time", Long.valueOf(r8s8Var.ki()));
            map.put("xmsf_vc", Integer.valueOf(r8s8Var.ni7()));
            map.put("android_vc", Integer.valueOf(r8s8Var.m21426z()));
            map.put("uuid", strM21600q);
            ew.zy().mo20819k("disconnection_event", map);
        }
    }
}
