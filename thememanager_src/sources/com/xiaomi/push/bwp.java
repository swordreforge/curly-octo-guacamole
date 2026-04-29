package com.xiaomi.push;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class bwp {

    /* JADX INFO: renamed from: k */
    private final String f32760k = "power_consumption_stats";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f73286toq = "off_up_ct";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final String f73288zy = "off_dn_ct";

    /* JADX INFO: renamed from: q */
    private final String f32763q = "off_ping_ct";

    /* JADX INFO: renamed from: n */
    private final String f32761n = "off_pong_ct";

    /* JADX INFO: renamed from: g */
    private final String f32758g = "off_dur";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final String f73281f7l8 = "on_up_ct";

    /* JADX INFO: renamed from: y */
    private final String f32765y = "on_dn_ct";

    /* JADX INFO: renamed from: s */
    private final String f32764s = "on_ping_ct";

    /* JADX INFO: renamed from: p */
    private final String f32762p = "on_pong_ct";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final String f73283ld6 = "on_dur";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final String f73287x2 = "start_time";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final String f73285qrj = "end_time";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final String f73284n7h = "xmsf_vc";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final String f73282kja0 = "android_vc";

    /* JADX INFO: renamed from: h */
    private final String f32759h = "uuid";

    /* JADX INFO: renamed from: k */
    public void m20668k(Context context, kcsr kcsrVar) {
        if (kcsrVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("off_up_ct", Integer.valueOf(kcsrVar.m21070k()));
        map.put("off_dn_ct", Integer.valueOf(kcsrVar.m21071n()));
        map.put("off_ping_ct", Integer.valueOf(kcsrVar.m21074s()));
        map.put("off_pong_ct", Integer.valueOf(kcsrVar.qrj()));
        map.put("off_dur", Long.valueOf(kcsrVar.toq()));
        map.put("on_up_ct", Integer.valueOf(kcsrVar.cdj()));
        map.put("on_dn_ct", Integer.valueOf(kcsrVar.t8r()));
        map.put("on_ping_ct", Integer.valueOf(kcsrVar.fn3e()));
        map.put("on_pong_ct", Integer.valueOf(kcsrVar.ni7()));
        map.put("on_dur", Long.valueOf(kcsrVar.m21067g()));
        map.put("start_time", Long.valueOf(kcsrVar.m21072p()));
        map.put("end_time", Long.valueOf(kcsrVar.n7h()));
        map.put("xmsf_vc", Integer.valueOf(kcsrVar.m21077z()));
        map.put("android_vc", Integer.valueOf(kcsrVar.wvg()));
        map.put("uuid", com.xiaomi.push.service.etdu.m21600q(context));
        ew.zy().mo20819k("power_consumption_stats", map);
    }
}
