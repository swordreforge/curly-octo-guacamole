package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.clientreport.data.C5623k;
import com.xiaomi.clientreport.manager.C5627k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ga {

    /* JADX INFO: renamed from: k */
    private static InterfaceC5865k f32953k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Map<String, kq> f73340toq;

    /* JADX INFO: renamed from: com.xiaomi.push.ga$k */
    public interface InterfaceC5865k {
        /* JADX INFO: renamed from: k */
        void mo19499k(Context context, kl7m kl7mVar);
    }

    public static com.xiaomi.clientreport.data.zy f7l8(Context context, int i2, long j2, long j3) {
        com.xiaomi.clientreport.data.zy zyVarM20884g = m20884g();
        zyVarM20884g.f31280y = i2;
        zyVarM20884g.f31279s = j2;
        zyVarM20884g.f31278p = j3;
        return zyVarM20884g;
    }

    /* JADX INFO: renamed from: g */
    public static com.xiaomi.clientreport.data.zy m20884g() {
        com.xiaomi.clientreport.data.zy zyVar = new com.xiaomi.clientreport.data.zy();
        zyVar.f31272k = 1000;
        zyVar.f73111zy = 1000;
        zyVar.f73110toq = "P100000";
        return zyVar;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m20885h(Context context) {
        return (context == null || TextUtils.isEmpty(context.getPackageName()) || !"com.xiaomi.xmsf".equals(context.getPackageName())) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public static int m20886k(int i2) {
        if (i2 > 0) {
            return i2 + 1000;
        }
        return -1;
    }

    public static void kja0(InterfaceC5865k interfaceC5865k) {
        f32953k = interfaceC5865k;
    }

    public static void ld6(Context context) {
        C5627k.m19321g(context, zy(context));
    }

    /* JADX INFO: renamed from: n */
    public static com.xiaomi.clientreport.data.toq m20887n(String str) {
        com.xiaomi.clientreport.data.toq toqVar = new com.xiaomi.clientreport.data.toq();
        toqVar.f31272k = 1000;
        toqVar.f73111zy = 1001;
        toqVar.f73110toq = str;
        return toqVar;
    }

    public static void n7h(Context context, List<String> list) {
        if (list == null) {
            return;
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                kl7m kl7mVarM20891y = m20891y(context, it.next());
                if (!com.xiaomi.push.service.ek5k.m21579n(kl7mVarM20891y, false)) {
                    qrj(context, kl7mVarM20891y);
                }
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.zy.jk(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m20888p(int i2) {
        return i2 == 1000 ? "E100000" : i2 == 3000 ? "E100002" : i2 == 2000 ? "E100001" : i2 == 6000 ? "E100003" : "";
    }

    /* JADX INFO: renamed from: q */
    public static com.xiaomi.clientreport.data.toq m20889q(Context context, String str, String str2, int i2, long j2, String str3) {
        com.xiaomi.clientreport.data.toq toqVarM20887n = m20887n(str);
        toqVarM20887n.f31277y = str2;
        toqVarM20887n.f31276s = i2;
        toqVarM20887n.f31275p = j2;
        toqVarM20887n.f73112ld6 = str3;
        return toqVarM20887n;
    }

    private static void qrj(Context context, kl7m kl7mVar) {
        if (m20885h(context.getApplicationContext())) {
            com.xiaomi.push.service.yz.m21802k(context.getApplicationContext(), kl7mVar);
            return;
        }
        InterfaceC5865k interfaceC5865k = f32953k;
        if (interfaceC5865k != null) {
            interfaceC5865k.mo19499k(context, kl7mVar);
        }
    }

    /* JADX INFO: renamed from: s */
    public static kq m20890s(String str) {
        if (f73340toq == null) {
            synchronized (kq.class) {
                if (f73340toq == null) {
                    f73340toq = new HashMap();
                    for (kq kqVar : kq.values()) {
                        f73340toq.put(kqVar.f33227a.toLowerCase(), kqVar);
                    }
                }
            }
        }
        kq kqVar2 = f73340toq.get(str.toLowerCase());
        return kqVar2 != null ? kqVar2 : kq.Invalid;
    }

    public static int toq(Enum r1) {
        if (r1 != null) {
            if (r1 instanceof wwp) {
                return r1.ordinal() + 1001;
            }
            if (r1 instanceof kq) {
                return r1.ordinal() + 2001;
            }
            if (r1 instanceof b9ub) {
                return r1.ordinal() + 3001;
            }
        }
        return -1;
    }

    public static void x2(Context context, C5623k c5623k) {
        C5627k.zy(context, c5623k, new bap7(context), new wlev(context));
    }

    /* JADX INFO: renamed from: y */
    public static kl7m m20891y(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        kl7m kl7mVar = new kl7m();
        kl7mVar.m21126d("category_client_report_data");
        kl7mVar.m21107a("push_sdk_channel");
        kl7mVar.m21106a(1L);
        kl7mVar.m21118b(str);
        kl7mVar.m21109a(true);
        kl7mVar.m21117b(System.currentTimeMillis());
        kl7mVar.m21134g(context.getPackageName());
        kl7mVar.m21129e("com.xiaomi.xmsf");
        kl7mVar.m21132f(com.xiaomi.push.service.ek5k.toq());
        kl7mVar.m21122c("quality_support");
        return kl7mVar;
    }

    public static C5623k zy(Context context) {
        boolean zQrj = com.xiaomi.push.service.a9.m21550q(context).qrj(oph.PerfUploadSwitch.m21370a(), false);
        boolean zQrj2 = com.xiaomi.push.service.a9.m21550q(context).qrj(oph.EventUploadNewSwitch.m21370a(), false);
        return C5623k.toq().x2(zQrj2).ld6(com.xiaomi.push.service.a9.m21550q(context).m21553k(oph.EventUploadFrequency.m21370a(), 86400)).kja0(zQrj).n7h(com.xiaomi.push.service.a9.m21550q(context).m21553k(oph.PerfUploadFrequency.m21370a(), 86400)).m19314y(context);
    }
}
