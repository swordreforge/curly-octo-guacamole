package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.xiaomi.push.e5;
import com.xiaomi.push.erbd;
import com.xiaomi.push.ge;
import com.xiaomi.push.hyow;
import com.xiaomi.push.kq;
import com.xiaomi.push.m28;
import com.xiaomi.push.nc;
import com.xiaomi.push.o5;
import com.xiaomi.push.ovdh;
import com.xiaomi.push.pnt2;
import com.xiaomi.push.qla;
import com.xiaomi.push.service.eqxt;
import com.xiaomi.push.service.kja0;
import com.xiaomi.push.uf;
import com.xiaomi.push.wwp;
import com.xiaomi.push.x7o;
import com.xiaomi.push.xtb7;
import com.xiaomi.push.z4j7;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v5yj.C7704k;

/* JADX INFO: loaded from: classes3.dex */
public class zy {
    private static boolean cdj(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.mipush.miui.CLICK_MESSAGE");
        intent.setPackage(str);
        Intent intent2 = new Intent("com.xiaomi.mipush.miui.RECEIVE_MESSAGE");
        intent2.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        try {
            List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 32);
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 32);
            if (listQueryBroadcastReceivers.isEmpty()) {
                if (listQueryIntentServices.isEmpty()) {
                    return false;
                }
            }
            return true;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            return false;
        }
    }

    private static void fn3e(Context context, m28 m28Var, byte[] bArr) {
        if (kja0.oc(m28Var)) {
            return;
        }
        String strM21666i = kja0.m21666i(m28Var);
        if (TextUtils.isEmpty(strM21666i) || ki(context, strM21666i, bArr)) {
            return;
        }
        e5.m20763k(context).m20768s(strM21666i, kja0.ncyb(m28Var), m28Var.m21235a().m20906a(), "1");
    }

    private static void fu4(XMPushService xMPushService, m28 m28Var) {
        xMPushService.m21530a(new C5915g(4, xMPushService, m28Var));
    }

    /* JADX INFO: renamed from: h */
    private static boolean m21819h(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (listQueryBroadcastReceivers != null) {
                if (!listQueryBroadcastReceivers.isEmpty()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: i */
    private static boolean m21820i(XMPushService xMPushService, String str, m28 m28Var, ge geVar) {
        boolean z2 = true;
        if (geVar != null && geVar.m20907a() != null && geVar.m20907a().containsKey("__check_alive") && geVar.m20907a().containsKey("__awake")) {
            erbd erbdVar = new erbd();
            erbdVar.m20795b(m28Var.m21243a());
            erbdVar.m20803d(str);
            erbdVar.m20799c(kq.AwakeSystemApp.f33227a);
            erbdVar.m20782a(geVar.m20906a());
            erbdVar.f32866a = new HashMap();
            boolean zX2 = uf.x2(xMPushService.getApplicationContext(), str);
            erbdVar.f32866a.put("app_running", Boolean.toString(zX2));
            if (!zX2) {
                boolean z3 = Boolean.parseBoolean(geVar.m20907a().get("__awake"));
                erbdVar.f32866a.put("awaked", Boolean.toString(z3));
                if (!z3) {
                    z2 = false;
                }
            }
            try {
                x2.m21796s(xMPushService, x2.m21795q(m28Var.m21251b(), m28Var.m21243a(), erbdVar, wwp.Notification));
            } catch (ovdh e2) {
                com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: k */
    public static Intent m21821k(byte[] bArr, long j2) {
        m28 m28VarM21824q = m21824q(bArr);
        if (m28VarM21824q == null) {
            return null;
        }
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mrt", Long.toString(j2));
        intent.setPackage(m28VarM21824q.f33393b);
        return intent;
    }

    public static boolean ki(Context context, String str, byte[] bArr) {
        if (!uf.x2(context, str)) {
            return false;
        }
        Intent intent = new Intent("com.xiaomi.mipush.MESSAGE_ARRIVED");
        intent.putExtra("mipush_payload", bArr);
        intent.setPackage(str);
        try {
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty()) {
                return false;
            }
            com.xiaomi.channel.commonutils.logger.zy.kja0("broadcast message arrived.");
            context.sendBroadcast(intent, x2.f7l8(str));
            return true;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("meet error when broadcast message arrived. " + e2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void kja0(com.xiaomi.push.service.XMPushService r19, byte[] r20, long r21, java.util.Map<java.lang.String, java.lang.String> r23) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.zy.kja0(com.xiaomi.push.service.XMPushService, byte[], long, java.util.Map):void");
    }

    private static void ld6(XMPushService xMPushService, m28 m28Var, String str) {
        xMPushService.m21530a(new C5945y(4, xMPushService, m28Var, str));
    }

    /* JADX INFO: renamed from: n */
    public static void m21822n(Context context, m28 m28Var, byte[] bArr) {
        try {
            kja0.zy zyVarKi = kja0.ki(context, m28Var, bArr);
            if (zyVarKi.f73634toq > 0 && !TextUtils.isEmpty(zyVarKi.f33836k)) {
                z4j7.m22068p(context, zyVarKi.f33836k, zyVarKi.f73634toq, true, false, System.currentTimeMillis());
            }
            if (!nc.m21313p(context) || !ld6.m21678g(context, m28Var, zyVarKi.f73635zy)) {
                fn3e(context, m28Var, bArr);
            } else {
                ld6.toq(context, m28Var);
                com.xiaomi.channel.commonutils.logger.zy.kja0("consume this broadcast by tts");
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("notify push msg error " + e2);
            e2.printStackTrace();
        }
    }

    private static void n7h(XMPushService xMPushService, byte[] bArr, long j2) {
        kja0(xMPushService, bArr, j2, null);
    }

    private static boolean ni7(m28 m28Var) {
        Map<String, String> mapM20907a = m28Var.m21235a().m20907a();
        return mapM20907a != null && mapM20907a.containsKey("notify_effect");
    }

    private static void o1t(XMPushService xMPushService, m28 m28Var) {
        xMPushService.m21530a(new f7l8(4, xMPushService, m28Var));
    }

    /* JADX INFO: renamed from: p */
    private static void m21823p(XMPushService xMPushService, m28 m28Var, erbd erbdVar) {
        xMPushService.m21530a(new C5933p(4, erbdVar, m28Var, xMPushService));
    }

    /* JADX INFO: renamed from: q */
    public static m28 m21824q(byte[] bArr) {
        m28 m28Var = new m28();
        try {
            qla.m21399n(m28Var, bArr);
            return m28Var;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(th);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0448  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void qrj(com.xiaomi.push.service.XMPushService r19, java.lang.String r20, byte[] r21, android.content.Intent r22) {
        /*
            Method dump skipped, instruction units count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.zy.qrj(com.xiaomi.push.service.XMPushService, java.lang.String, byte[], android.content.Intent):void");
    }

    /* JADX INFO: renamed from: s */
    private static void m21825s(XMPushService xMPushService, m28 m28Var) {
        xMPushService.m21530a(new C5935q(4, xMPushService, m28Var));
    }

    private static boolean t8r(m28 m28Var) {
        return "com.xiaomi.xmsf".equals(m28Var.f33393b) && m28Var.m21235a() != null && m28Var.m21235a().m20907a() != null && m28Var.m21235a().m20907a().containsKey("miui_package_name");
    }

    public static m28 toq(Context context, m28 m28Var) {
        return zy(context, m28Var, null);
    }

    private static void x2(XMPushService xMPushService, m28 m28Var, String str, String str2) {
        xMPushService.m21530a(new C5938s(4, xMPushService, m28Var, str, str2));
    }

    /* JADX INFO: renamed from: z */
    private static boolean m21826z(m28 m28Var) {
        if (m28Var.m21235a() == null || m28Var.m21235a().m20907a() == null) {
            return false;
        }
        return "1".equals(m28Var.m21235a().m20907a().get("obslete_ads_message"));
    }

    private static void zurt(XMPushService xMPushService, m28 m28Var) {
        xMPushService.m21530a(new C5928n(4, xMPushService, m28Var));
    }

    public static m28 zy(Context context, m28 m28Var, Map<String, String> map) {
        x7o x7oVar = new x7o();
        x7oVar.m21992b(m28Var.m21243a());
        ge geVarM21235a = m28Var.m21235a();
        if (geVarM21235a != null) {
            x7oVar.m21986a(geVarM21235a.m20906a());
            x7oVar.m21985a(geVarM21235a.m20901a());
            if (!TextUtils.isEmpty(geVarM21235a.m20916b())) {
                x7oVar.m21995c(geVarM21235a.m20916b());
            }
        }
        x7oVar.m21987a(qla.toq(context, m28Var));
        m28 m28VarM21795q = x2.m21795q(m28Var.m21251b(), m28Var.m21243a(), x7oVar, wwp.AckMessage);
        ge geVarM21235a2 = m28Var.m21235a();
        if (geVarM21235a2 != null) {
            geVarM21235a2 = lrht.m21687k(geVarM21235a2.m20902a());
            Map<String, String> mapM20907a = geVarM21235a2.m20907a();
            String str = mapM20907a != null ? mapM20907a.get("channel_id") : null;
            geVarM21235a2.m20909a("mat", Long.toString(System.currentTimeMillis()));
            geVarM21235a2.m20909a("cs", String.valueOf(qkj8.toq(context, m28Var.f33393b, str)));
        }
        if (map != null) {
            try {
                if (map.size() > 0) {
                    for (String str2 : map.keySet()) {
                        geVarM21235a2.m20909a(str2, map.get(str2));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        m28VarM21795q.m21237a(geVarM21235a2);
        return m28VarM21795q;
    }

    public void f7l8(XMPushService xMPushService, o5 o5Var, eqxt.toq toqVar) {
        try {
            byte[] bArrCdj = o5Var.cdj(toqVar.f33765s);
            HashMap map = null;
            if (vq.toq(o5Var)) {
                map = new HashMap();
                map.put("t_im", String.valueOf(o5Var.t8r()));
                map.put("t_rt", String.valueOf(o5Var.toq()));
            }
            kja0(xMPushService, bArrCdj, o5Var.fu4(), map);
        } catch (IllegalArgumentException e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m21827g(Context context, eqxt.toq toqVar, boolean z2, int i2, String str) {
        v0af qVar;
        if (z2 || (qVar = etdu.toq(context)) == null || !"token-expired".equals(str)) {
            return;
        }
        etdu.zy(context, qVar.f33917g, qVar.f33920q, qVar.f33919n);
    }

    /* JADX INFO: renamed from: y */
    public void m21828y(XMPushService xMPushService, xtb7 xtb7Var, eqxt.toq toqVar) {
        if (!(xtb7Var instanceof pnt2)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("not a mipush message");
            return;
        }
        pnt2 pnt2Var = (pnt2) xtb7Var;
        hyow qVar = pnt2Var.toq(C7704k.y.toq.f44691k);
        if (qVar != null) {
            try {
                n7h(xMPushService, n5r1.m21698y(n5r1.f7l8(toqVar.f33765s, pnt2Var.x2()), qVar.x2()), z4j7.toq(xtb7Var.mo21382g()));
            } catch (IllegalArgumentException e2) {
                com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            }
        }
    }
}
