package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.C5656l;
import com.xiaomi.push.C5872k;
import com.xiaomi.push.anw;
import com.xiaomi.push.b9ub;
import com.xiaomi.push.e4e;
import com.xiaomi.push.erbd;
import com.xiaomi.push.iz;
import com.xiaomi.push.kq;
import com.xiaomi.push.m8;
import com.xiaomi.push.nc;
import com.xiaomi.push.qla;
import com.xiaomi.push.uf;
import com.xiaomi.push.wwp;
import com.xiaomi.push.x7o;
import com.xiaomi.push.z5;
import com.xiaomi.push.zxq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ki {

    /* JADX INFO: renamed from: k */
    private static Map<String, C5656l.k> f31385k = new HashMap();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Map<String, Long> f73152toq = new HashMap();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static C5655k f73153zy;

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.ki$k */
    public static class C5655k {
        /* JADX INFO: renamed from: k */
        public void m19498k(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void toq(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void zy(String str, MiPushCommandMessage miPushCommandMessage) {
        }
    }

    public static void f7l8(Context context, MiPushMessage miPushMessage) {
        String messageId = miPushMessage.getExtra() != null ? miPushMessage.getExtra().get("jobkey") : null;
        if (TextUtils.isEmpty(messageId)) {
            messageId = miPushMessage.getMessageId();
        }
        jp0y.m19489y(context, messageId);
    }

    /* JADX INFO: renamed from: g */
    public static void m19491g(Context context, String str, String str2, String str3) {
        if (C5656l.m19500q(context).n7h(str2, str3, str)) {
            ArrayList arrayList = new ArrayList();
            C5656l.k kVarZy = C5656l.m19500q(context).zy(str);
            if (kVarZy != null) {
                arrayList.add(kVarZy.f73160zy);
                MiPushCommandMessage miPushCommandMessageM19583k = zurt.m19583k(b9ub.COMMAND_REGISTER.f32725a, arrayList, 0L, null, null, null);
                C5655k c5655k = f73153zy;
                if (c5655k != null) {
                    c5655k.toq(str, miPushCommandMessageM19583k);
                }
            }
            if (ld6(context, str)) {
                erbd erbdVar = new erbd();
                erbdVar.m20795b(str2);
                erbdVar.m20799c(kq.PullOfflineMessage.f33227a);
                erbdVar.m20782a(com.xiaomi.push.service.gvn7.m21617k());
                erbdVar.m20785a(false);
                d3.m19429y(context).m19434t(erbdVar, wwp.Notification, false, true, null, false, str, str2);
                com.xiaomi.channel.commonutils.logger.zy.m19302z("MiPushClient4Hybrid pull offline pass through message");
                m19492k(context, str);
                return;
            }
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - (f73152toq.get(str) != null ? f73152toq.get(str).longValue() : 0L)) < 5000) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("MiPushClient4Hybrid  Could not send register message within 5s repeatedly.");
            return;
        }
        f73152toq.put(str, Long.valueOf(jCurrentTimeMillis));
        String strM21302k = com.xiaomi.push.n5r1.m21302k(6);
        C5656l.k kVar = new C5656l.k(context);
        kVar.qrj(str2, str3, strM21302k);
        f31385k.put(str, kVar);
        zxq zxqVar = new zxq();
        zxqVar.m22143a(com.xiaomi.push.service.gvn7.m21617k());
        zxqVar.m22150b(str2);
        zxqVar.m22162e(str3);
        zxqVar.m22159d(str);
        zxqVar.m22165f(strM21302k);
        zxqVar.m22155c(uf.m21865y(context, context.getPackageName()));
        zxqVar.m22149b(uf.toq(context, context.getPackageName()));
        zxqVar.m22171h(C5872k.f33107g);
        zxqVar.m22141a(C5872k.f33109n);
        zxqVar.m22142a(z5.Init);
        if (!nc.m21310i()) {
            String strNi7 = m8.ni7(context);
            if (!TextUtils.isEmpty(strNi7)) {
                zxqVar.m22174i(com.xiaomi.push.n5r1.toq(strNi7));
            }
        }
        int iZy = m8.zy();
        if (iZy >= 0) {
            zxqVar.m22154c(iZy);
        }
        erbd erbdVar2 = new erbd();
        erbdVar2.m20799c(kq.HybridRegister.f33227a);
        erbdVar2.m20795b(C5656l.m19500q(context).m19505n());
        erbdVar2.m20803d(context.getPackageName());
        erbdVar2.m20786a(qla.m21397g(zxqVar));
        erbdVar2.m20782a(com.xiaomi.push.service.gvn7.m21617k());
        d3.m19429y(context).ni7(erbdVar2, wwp.Notification, null);
    }

    /* JADX INFO: renamed from: k */
    private static void m19492k(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_pull_notification_" + str, System.currentTimeMillis()).commit();
    }

    private static boolean ld6(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        StringBuilder sb = new StringBuilder();
        sb.append("last_pull_notification_");
        sb.append(str);
        return Math.abs(System.currentTimeMillis() - sharedPreferences.getLong(sb.toString(), -1L)) > 300000;
    }

    /* JADX INFO: renamed from: n */
    public static void m19493n(Context context, anw anwVar) {
        MiPushCommandMessage miPushCommandMessageM19583k = zurt.m19583k(b9ub.COMMAND_UNREGISTER.f32725a, null, anwVar.f32685a, anwVar.f32693d, null, null);
        String strM20605a = anwVar.m20605a();
        C5655k c5655k = f73153zy;
        if (c5655k != null) {
            c5655k.zy(strM20605a, miPushCommandMessageM19583k);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m19494p(C5655k c5655k) {
        f73153zy = c5655k;
    }

    /* JADX INFO: renamed from: q */
    public static void m19495q(Context context, e4e e4eVar) {
        C5656l.k kVar;
        String strM20740c = e4eVar.m20740c();
        if (e4eVar.m20730a() == 0 && (kVar = f31385k.get(strM20740c)) != null) {
            kVar.m19512g(e4eVar.f32835e, e4eVar.f32836f);
            C5656l.m19500q(context).m19507s(strM20740c, kVar);
        }
        ArrayList arrayList = null;
        if (!TextUtils.isEmpty(e4eVar.f32835e)) {
            arrayList = new ArrayList();
            arrayList.add(e4eVar.f32835e);
        }
        MiPushCommandMessage miPushCommandMessageM19583k = zurt.m19583k(b9ub.COMMAND_REGISTER.f32725a, arrayList, e4eVar.f32823a, e4eVar.f32834d, null, null);
        C5655k c5655k = f73153zy;
        if (c5655k != null) {
            c5655k.toq(strM20740c, miPushCommandMessageM19583k);
        }
    }

    public static void qrj(Context context, LinkedList<? extends Object> linkedList) {
        com.xiaomi.push.service.kja0.mcp(context, linkedList);
    }

    /* JADX INFO: renamed from: s */
    public static void m19496s(Context context, MiPushMessage miPushMessage) {
        cdj.ek5k(context, miPushMessage);
    }

    private static short toq(MiPushMessage miPushMessage, boolean z2) {
        String str = miPushMessage.getExtra() == null ? "" : miPushMessage.getExtra().get(C5658n.f31412t);
        int iIntValue = TextUtils.isEmpty(str) ? 0 : Integer.valueOf(str).intValue();
        if (!z2) {
            iIntValue = (iIntValue & (-4)) + uf.toq.NOT_ALLOWED.m21868a();
        }
        return (short) iIntValue;
    }

    public static void x2(Context context, String str) {
        f73152toq.remove(str);
        C5656l.k kVarZy = C5656l.m19500q(context).zy(str);
        if (kVarZy == null) {
            return;
        }
        iz izVar = new iz();
        izVar.m21002a(com.xiaomi.push.service.gvn7.m21617k());
        izVar.m21012d(str);
        izVar.m21007b(kVarZy.f31390k);
        izVar.m21010c(kVarZy.f73160zy);
        izVar.m21014e(kVarZy.f73158toq);
        erbd erbdVar = new erbd();
        erbdVar.m20799c(kq.HybridUnregister.f33227a);
        erbdVar.m20795b(C5656l.m19500q(context).m19505n());
        erbdVar.m20803d(context.getPackageName());
        erbdVar.m20786a(qla.m21397g(izVar));
        erbdVar.m20782a(com.xiaomi.push.service.gvn7.m21617k());
        d3.m19429y(context).ni7(erbdVar, wwp.Notification, null);
        C5656l.m19500q(context).cdj(str);
    }

    /* JADX INFO: renamed from: y */
    public static void m19497y(Context context, MiPushMessage miPushMessage, boolean z2) {
        if (miPushMessage == null || miPushMessage.getExtra() == null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("do not ack message, message is null");
            return;
        }
        try {
            x7o x7oVar = new x7o();
            x7oVar.m21992b(C5656l.m19500q(context).m19505n());
            x7oVar.m21986a(miPushMessage.getMessageId());
            x7oVar.m21985a(Long.valueOf(miPushMessage.getExtra().get(C5658n.f73187wvg)).longValue());
            x7oVar.m21987a(toq(miPushMessage, z2));
            if (!TextUtils.isEmpty(miPushMessage.getTopic())) {
                x7oVar.m21995c(miPushMessage.getTopic());
            }
            d3.m19429y(context).m19435z(x7oVar, wwp.AckMessage, false, com.xiaomi.push.service.lrht.m21687k(zurt.zy(miPushMessage)));
            com.xiaomi.channel.commonutils.logger.zy.m19302z("MiPushClient4Hybrid ack mina message, messageId is " + miPushMessage.getMessageId());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static boolean zy(Context context, String str) {
        return C5656l.m19500q(context).zy(str) != null;
    }
}
