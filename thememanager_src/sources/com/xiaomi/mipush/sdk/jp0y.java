package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.google.android.exoplayer2.yqrt;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.onetrack.api.C5693g;
import com.xiaomi.push.anw;
import com.xiaomi.push.b9ub;
import com.xiaomi.push.e4e;
import com.xiaomi.push.e5;
import com.xiaomi.push.erbd;
import com.xiaomi.push.ff;
import com.xiaomi.push.ga;
import com.xiaomi.push.ge;
import com.xiaomi.push.j3y2;
import com.xiaomi.push.k4jz;
import com.xiaomi.push.kjd;
import com.xiaomi.push.kq;
import com.xiaomi.push.l7o;
import com.xiaomi.push.m28;
import com.xiaomi.push.oaex;
import com.xiaomi.push.qla;
import com.xiaomi.push.rf;
import com.xiaomi.push.sb;
import com.xiaomi.push.service.C5939t;
import com.xiaomi.push.service.wo;
import com.xiaomi.push.uf;
import com.xiaomi.push.uv;
import com.xiaomi.push.vg;
import com.xiaomi.push.w831;
import com.xiaomi.push.wwp;
import com.xiaomi.push.x7o;
import com.xiaomi.push.z5;
import com.xiaomi.push.z8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class jp0y {

    /* JADX INFO: renamed from: q */
    private static Object f31383q = new Object();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static jp0y f73150toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Queue<String> f73151zy;

    /* JADX INFO: renamed from: k */
    private Context f31384k;

    private jp0y(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f31384k = applicationContext;
        if (applicationContext == null) {
            this.f31384k = context;
        }
    }

    private void cdj(m28 m28Var) {
        ge geVarM21235a = m28Var.m21235a();
        if (geVarM21235a != null) {
            geVarM21235a = com.xiaomi.push.service.lrht.m21687k(geVarM21235a.m20902a());
        }
        x7o x7oVar = new x7o();
        x7oVar.m21992b(m28Var.m21243a());
        x7oVar.m21986a(geVarM21235a.m20906a());
        x7oVar.m21985a(geVarM21235a.m20901a());
        if (!TextUtils.isEmpty(geVarM21235a.m20916b())) {
            x7oVar.m21995c(geVarM21235a.m20916b());
        }
        x7oVar.m21987a(qla.toq(this.f31384k, m28Var));
        d3.m19429y(this.f31384k).m19435z(x7oVar, wwp.AckMessage, false, geVarM21235a);
    }

    private void f7l8() {
        SharedPreferences sharedPreferences = this.f31384k.getSharedPreferences("mipush_extra", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - sharedPreferences.getLong(C5658n.f31406k, 0L)) > 1800000) {
            cdj.m19401r(this.f31384k, z5.PackageUnregistered);
            sharedPreferences.edit().putLong(C5658n.f31406k, jCurrentTimeMillis).commit();
        }
    }

    /* JADX INFO: renamed from: h */
    private void m19483h(z8 z8Var) {
        com.xiaomi.channel.commonutils.logger.zy.m19300t("ASSEMBLE_PUSH : " + z8Var.toString());
        String strM22082a = z8Var.m22082a();
        Map<String, String> mapM22083a = z8Var.m22083a();
        if (mapM22083a != null) {
            String str = mapM22083a.get(C5658n.f73173jk);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.contains("brand:" + wvg.FCM.name())) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("ASSEMBLE_PUSH : receive fcm token sync ack");
                Context context = this.f31384k;
                hyr hyrVar = hyr.ASSEMBLE_PUSH_FCM;
                uv6.zurt(context, hyrVar, str);
                qrj(strM22082a, z8Var.f34261a, hyrVar);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("brand:");
            wvg wvgVar = wvg.HUAWEI;
            sb.append(wvgVar.name());
            if (!str.contains(sb.toString())) {
                if (!str.contains("channel:" + wvgVar.name())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("brand:");
                    wvg wvgVar2 = wvg.OPPO;
                    sb2.append(wvgVar2.name());
                    if (!str.contains(sb2.toString())) {
                        if (!str.contains("channel:" + wvgVar2.name())) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("brand:");
                            wvg wvgVar3 = wvg.VIVO;
                            sb3.append(wvgVar3.name());
                            if (!str.contains(sb3.toString())) {
                                if (!str.contains("channel:" + wvgVar3.name())) {
                                    return;
                                }
                            }
                            com.xiaomi.channel.commonutils.logger.zy.kja0("ASSEMBLE_PUSH : receive FTOS token sync ack");
                            Context context2 = this.f31384k;
                            hyr hyrVar2 = hyr.ASSEMBLE_PUSH_FTOS;
                            uv6.zurt(context2, hyrVar2, str);
                            qrj(strM22082a, z8Var.f34261a, hyrVar2);
                            return;
                        }
                    }
                    com.xiaomi.channel.commonutils.logger.zy.kja0("ASSEMBLE_PUSH : receive COS token sync ack");
                    Context context3 = this.f31384k;
                    hyr hyrVar3 = hyr.ASSEMBLE_PUSH_COS;
                    uv6.zurt(context3, hyrVar3, str);
                    qrj(strM22082a, z8Var.f34261a, hyrVar3);
                    return;
                }
            }
            com.xiaomi.channel.commonutils.logger.zy.kja0("ASSEMBLE_PUSH : receive hw token sync ack");
            Context context4 = this.f31384k;
            hyr hyrVar4 = hyr.ASSEMBLE_PUSH_HUAWEI;
            uv6.zurt(context4, hyrVar4, str);
            qrj(strM22082a, z8Var.f34261a, hyrVar4);
        }
    }

    /* JADX INFO: renamed from: k */
    public static Intent m19484k(Context context, String str, Map<String, String> map, int i2) {
        return com.xiaomi.push.service.kja0.x9kr(context, str, map, i2);
    }

    private void ki(erbd erbdVar) {
        Map<String, String> mapM20788a = erbdVar.m20788a();
        if (mapM20788a == null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("detect failed because null");
            return;
        }
        String str = (String) C5939t.f7l8(mapM20788a, "pkgList", null);
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("detect failed because empty");
            return;
        }
        Map<String, String> mapM21864s = uf.m21864s(this.f31384k, str);
        if (mapM21864s == null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("detect failed because get status illegal");
            return;
        }
        String str2 = mapM21864s.get("alive");
        String str3 = mapM21864s.get("notAlive");
        if (TextUtils.isEmpty(str2)) {
            com.xiaomi.channel.commonutils.logger.zy.m19302z("detect failed because no alive process");
            return;
        }
        erbd erbdVar2 = new erbd();
        erbdVar2.m20782a(erbdVar.m20787a());
        erbdVar2.m20795b(erbdVar.m20796b());
        erbdVar2.m20803d(erbdVar.m20804d());
        erbdVar2.m20799c(kq.DetectAppAliveResult.f33227a);
        HashMap map = new HashMap();
        erbdVar2.f32866a = map;
        map.put("alive", str2);
        if (Boolean.parseBoolean((String) C5939t.f7l8(mapM20788a, "reportNotAliveApp", "false")) && !TextUtils.isEmpty(str3)) {
            erbdVar2.f32866a.put("notAlive", str3);
        }
        d3.m19429y(this.f31384k).m19435z(erbdVar2, wwp.Notification, false, null);
    }

    private boolean kja0(m28 m28Var) {
        Map<String, String> mapM20907a = m28Var.m21235a() == null ? null : m28Var.m21235a().m20907a();
        if (mapM20907a == null) {
            return false;
        }
        String str = mapM20907a.get(C5658n.f73181ni7);
        return TextUtils.equals(str, C5658n.f73171fu4) || TextUtils.equals(str, C5658n.f31414z);
    }

    private void ld6(erbd erbdVar) {
        z8 z8Var = new z8();
        z8Var.m22091c(kq.CancelPushMessageACK.f33227a);
        z8Var.m22081a(erbdVar.m20787a());
        z8Var.m22080a(erbdVar.m20781a());
        z8Var.m22088b(erbdVar.m20796b());
        z8Var.m22095e(erbdVar.m20804d());
        z8Var.m22079a(0L);
        z8Var.m22093d("success clear push message.");
        d3.m19429y(this.f31384k).mcp(z8Var, wwp.Notification, false, true, null, false, this.f31384k.getPackageName(), C5656l.m19500q(this.f31384k).m19505n(), false);
    }

    /* JADX INFO: renamed from: n */
    public static jp0y m19485n(Context context) {
        if (f73150toq == null) {
            f73150toq = new jp0y(context);
        }
        return f73150toq;
    }

    private static boolean n7h(Context context, String str) {
        synchronized (f31383q) {
            C5656l.m19500q(context);
            SharedPreferences qVar = C5656l.toq(context);
            if (f73151zy == null) {
                String[] strArrSplit = qVar.getString("pref_msg_ids", "").split(",");
                f73151zy = new LinkedList();
                for (String str2 : strArrSplit) {
                    f73151zy.add(str2);
                }
            }
            if (f73151zy.contains(str)) {
                return true;
            }
            f73151zy.add(str);
            if (f73151zy.size() > 25) {
                f73151zy.poll();
            }
            String strM21305q = com.xiaomi.push.n5r1.m21305q(f73151zy, ",");
            SharedPreferences.Editor editorEdit = qVar.edit();
            editorEdit.putString("pref_msg_ids", strM21305q);
            l7o.m21152k(editorEdit);
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    private void m19486p(m28 m28Var) {
        com.xiaomi.channel.commonutils.logger.zy.kja0("receive a message but decrypt failed. report now.");
        erbd erbdVar = new erbd(m28Var.m21235a().f32981a, false);
        erbdVar.m20799c(kq.DecryptMessageFail.f33227a);
        erbdVar.m20795b(m28Var.m21243a());
        erbdVar.m20803d(m28Var.f33393b);
        HashMap map = new HashMap();
        erbdVar.f32866a = map;
        map.put("regid", cdj.gvn7(this.f31384k));
        d3.m19429y(this.f31384k).m19435z(erbdVar, wwp.Notification, false, null);
    }

    /* JADX INFO: renamed from: q */
    private PushMessageHandler.InterfaceC5638k m19487q(m28 m28Var, byte[] bArr) {
        String str = null;
        try {
            oaex oaexVarM19526q = mcp.m19526q(this.f31384k, m28Var);
            if (oaexVarM19526q == null) {
                com.xiaomi.channel.commonutils.logger.zy.jk("message arrived: receiving an un-recognized message. " + m28Var.f33388a);
                return null;
            }
            wwp wwpVarM21242a = m28Var.m21242a();
            com.xiaomi.channel.commonutils.logger.zy.kja0("message arrived: processing an arrived message, action=" + wwpVarM21242a);
            if (gvn7.f31362k[wwpVarM21242a.ordinal()] != 1) {
                return null;
            }
            if (!m28Var.m21253b()) {
                com.xiaomi.channel.commonutils.logger.zy.jk("message arrived: receiving an un-encrypt message(SendMessage).");
                return null;
            }
            rf rfVar = (rf) oaexVarM19526q;
            j3y2 j3y2VarM21431a = rfVar.m21431a();
            if (j3y2VarM21431a == null) {
                com.xiaomi.channel.commonutils.logger.zy.jk("message arrived: receive an empty message without push content, drop it");
                return null;
            }
            ge geVar = m28Var.f33387a;
            if (geVar != null && geVar.m20907a() != null) {
                str = m28Var.f33387a.f32983a.get("jobkey");
            }
            MiPushMessage qVar = zurt.toq(rfVar, m28Var.m21235a(), false);
            qVar.setArrivedMessage(true);
            com.xiaomi.channel.commonutils.logger.zy.kja0("message arrived: receive a message, msgid=" + j3y2VarM21431a.m21025a() + ", jobkey=" + str);
            return qVar;
        } catch (yz e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            com.xiaomi.channel.commonutils.logger.zy.jk("message arrived: receive a message but decrypt failed. report when click.");
            return null;
        } catch (sb e3) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e3);
            com.xiaomi.channel.commonutils.logger.zy.jk("message arrived: receive a message which action string is not valid. is the reg expired?");
            return null;
        }
    }

    private void qrj(String str, long j2, hyr hyrVar) {
        dd ddVarM19529k = nn86.m19529k(hyrVar);
        if (ddVarM19529k == null) {
            return;
        }
        if (j2 == 0) {
            synchronized (o1t.class) {
                if (o1t.toq(this.f31384k).m19533g(str)) {
                    o1t.toq(this.f31384k).m19537y(str);
                    if ("syncing".equals(o1t.toq(this.f31384k).zy(ddVarM19529k))) {
                        o1t.toq(this.f31384k).m19536q(ddVarM19529k, "synced");
                    }
                }
            }
            return;
        }
        if (!"syncing".equals(o1t.toq(this.f31384k).zy(ddVarM19529k))) {
            o1t.toq(this.f31384k).m19537y(str);
            return;
        }
        synchronized (o1t.class) {
            if (o1t.toq(this.f31384k).m19533g(str)) {
                if (o1t.toq(this.f31384k).m19534k(str) < 10) {
                    o1t.toq(this.f31384k).f7l8(str);
                    d3.m19429y(this.f31384k).a9(str, ddVarM19529k, hyrVar, C5693g.f31770L);
                } else {
                    o1t.toq(this.f31384k).m19537y(str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private void m19488s(z8 z8Var) {
        String strM22082a = z8Var.m22082a();
        com.xiaomi.channel.commonutils.logger.zy.m19302z("receive ack " + strM22082a);
        Map<String, String> mapM22083a = z8Var.m22083a();
        if (mapM22083a != null) {
            String str = mapM22083a.get("real_source");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.zy.m19302z("receive ack : messageId = " + strM22082a + "  realSource = " + str);
            com.xiaomi.push.bf2.toq(this.f31384k).m20646p(strM22082a, str, Boolean.valueOf(z8Var.f34261a == 0));
        }
    }

    private void x2(rf rfVar, m28 m28Var) {
        ge geVarM21235a = m28Var.m21235a();
        if (geVarM21235a != null) {
            geVarM21235a = com.xiaomi.push.service.lrht.m21687k(geVarM21235a.m20902a());
        }
        x7o x7oVar = new x7o();
        x7oVar.m21992b(rfVar.m21437b());
        x7oVar.m21986a(rfVar.m21432a());
        x7oVar.m21985a(rfVar.m21431a().m21024a());
        if (!TextUtils.isEmpty(rfVar.m21439c())) {
            x7oVar.m21995c(rfVar.m21439c());
        }
        if (!TextUtils.isEmpty(rfVar.m21441d())) {
            x7oVar.m21998d(rfVar.m21441d());
        }
        x7oVar.m21987a(qla.toq(this.f31384k, m28Var));
        d3.m19429y(this.f31384k).ni7(x7oVar, wwp.AckMessage, geVarM21235a);
    }

    /* JADX INFO: renamed from: y */
    public static void m19489y(Context context, String str) {
        synchronized (f31383q) {
            f73151zy.remove(str);
            C5656l.m19500q(context);
            SharedPreferences qVar = C5656l.toq(context);
            String strM21305q = com.xiaomi.push.n5r1.m21305q(f73151zy, ",");
            SharedPreferences.Editor editorEdit = qVar.edit();
            editorEdit.putString("pref_msg_ids", strM21305q);
            l7o.m21152k(editorEdit);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private PushMessageHandler.InterfaceC5638k zy(m28 m28Var, boolean z2, byte[] bArr, String str, int i2, Intent intent) {
        MiPushMessage miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        miPushMessage = null;
        ArrayList arrayList3 = null;
        miPushMessage = null;
        try {
            oaex oaexVarM19526q = mcp.m19526q(this.f31384k, m28Var);
            if (oaexVarM19526q == null) {
                com.xiaomi.channel.commonutils.logger.zy.jk("receiving an un-recognized message. " + m28Var.f33388a);
                e5.m20763k(this.f31384k).m20768s(this.f31384k.getPackageName(), ga.m20888p(i2), str, "18");
                C5657m.m19518g(this.f31384k, m28Var, z2);
                return null;
            }
            wwp wwpVarM21242a = m28Var.m21242a();
            com.xiaomi.channel.commonutils.logger.zy.ki("processing a message, action=", wwpVarM21242a, ", hasNotified=", Boolean.valueOf(z2));
            switch (gvn7.f31362k[wwpVarM21242a.ordinal()]) {
                case 1:
                    if (!m28Var.m21253b()) {
                        com.xiaomi.channel.commonutils.logger.zy.jk("receiving an un-encrypt message(SendMessage).");
                        return null;
                    }
                    if (C5656l.m19500q(this.f31384k).o1t() && !z2) {
                        com.xiaomi.channel.commonutils.logger.zy.kja0("receive a message in pause state. drop it");
                        e5.m20763k(this.f31384k).m20769y(this.f31384k.getPackageName(), ga.m20888p(i2), str, "12");
                        return null;
                    }
                    rf rfVar = (rf) oaexVarM19526q;
                    j3y2 j3y2VarM21431a = rfVar.m21431a();
                    if (j3y2VarM21431a == null) {
                        com.xiaomi.channel.commonutils.logger.zy.jk("receive an empty message without push content, drop it");
                        e5.m20763k(this.f31384k).m20768s(this.f31384k.getPackageName(), ga.m20888p(i2), str, "22");
                        C5657m.f7l8(this.f31384k, m28Var, z2);
                        return null;
                    }
                    int intExtra = intent.getIntExtra("notification_click_button", 0);
                    if (z2) {
                        if (com.xiaomi.push.service.kja0.oc(m28Var)) {
                            cdj.m19396m(this.f31384k, j3y2VarM21431a.m21025a(), m28Var.m21235a(), m28Var.f33393b, j3y2VarM21431a.m21030b());
                        } else {
                            ge geVar = m28Var.m21235a() != null ? new ge(m28Var.m21235a()) : new ge();
                            if (geVar.m20907a() == null) {
                                geVar.m20905a(new HashMap());
                            }
                            geVar.m20907a().put("notification_click_button", String.valueOf(intExtra));
                            cdj.y9n(this.f31384k, j3y2VarM21431a.m21025a(), geVar, j3y2VarM21431a.m21030b());
                        }
                    }
                    if (!z2) {
                        if (!TextUtils.isEmpty(rfVar.m21441d()) && cdj.x2(this.f31384k, rfVar.m21441d()) < 0) {
                            cdj.m19407y(this.f31384k, rfVar.m21441d());
                        } else if (!TextUtils.isEmpty(rfVar.m21439c()) && cdj.xwq3(this.f31384k, rfVar.m21439c()) < 0) {
                            cdj.ld6(this.f31384k, rfVar.m21439c());
                        }
                    }
                    ge geVar2 = m28Var.f33387a;
                    String strM21025a = (geVar2 == null || geVar2.m20907a() == null) ? null : m28Var.f33387a.f32983a.get("jobkey");
                    String str2 = strM21025a;
                    if (TextUtils.isEmpty(strM21025a)) {
                        strM21025a = j3y2VarM21431a.m21025a();
                    }
                    if (z2 || !n7h(this.f31384k, strM21025a)) {
                        MiPushMessage qVar = zurt.toq(rfVar, m28Var.m21235a(), z2);
                        if (qVar.getPassThrough() == 0 && !z2 && com.xiaomi.push.service.kja0.d2ok(qVar.getExtra())) {
                            com.xiaomi.push.service.kja0.ki(this.f31384k, m28Var, bArr);
                            return null;
                        }
                        String strFn3e = com.xiaomi.push.service.kja0.fn3e(qVar.getExtra(), intExtra);
                        com.xiaomi.channel.commonutils.logger.zy.ki("receive a message, msgid=", j3y2VarM21431a.m21025a(), ", jobkey=", strM21025a, ", btn=", Integer.valueOf(intExtra), ", typeId=", strFn3e, ", hasNotified=", Boolean.valueOf(z2));
                        if (z2 && qVar.getExtra() != null && !TextUtils.isEmpty(strFn3e)) {
                            Map<String, String> extra = qVar.getExtra();
                            if (intExtra != 0 && m28Var.m21235a() != null) {
                                d3.m19429y(this.f31384k).kja0(m28Var.m21235a().m20921c(), intExtra);
                            }
                            if (com.xiaomi.push.service.kja0.oc(m28Var)) {
                                Intent intentM19484k = m19484k(this.f31384k, m28Var.f33393b, extra, intExtra);
                                intentM19484k.putExtra("eventMessageType", i2);
                                intentM19484k.putExtra("messageId", str);
                                intentM19484k.putExtra("jobkey", str2);
                                String strM21033c = j3y2VarM21431a.m21033c();
                                if (!TextUtils.isEmpty(strM21033c)) {
                                    intentM19484k.putExtra(InterfaceC1925p.hkfy, strM21033c);
                                }
                                this.f31384k.startActivity(intentM19484k);
                                C5657m.toq(this.f31384k, m28Var);
                                e5.m20763k(this.f31384k).f7l8(this.f31384k.getPackageName(), ga.m20888p(i2), str, 3006, strFn3e);
                                com.xiaomi.channel.commonutils.logger.zy.m19293h("PushMessageProcessor", "start business activity succ");
                            } else {
                                Context context = this.f31384k;
                                Intent intentM19484k2 = m19484k(context, context.getPackageName(), extra, intExtra);
                                if (intentM19484k2 != null) {
                                    if (!strFn3e.equals(com.xiaomi.push.service.dd.f73589zy)) {
                                        intentM19484k2.putExtra(zurt.f31450p, qVar);
                                        intentM19484k2.putExtra("eventMessageType", i2);
                                        intentM19484k2.putExtra("messageId", str);
                                        intentM19484k2.putExtra("jobkey", str2);
                                    }
                                    this.f31384k.startActivity(intentM19484k2);
                                    C5657m.toq(this.f31384k, m28Var);
                                    com.xiaomi.channel.commonutils.logger.zy.m19293h("PushMessageProcessor", "start activity succ");
                                    e5.m20763k(this.f31384k).f7l8(this.f31384k.getPackageName(), ga.m20888p(i2), str, 1006, strFn3e);
                                    if (strFn3e.equals(com.xiaomi.push.service.dd.f73589zy)) {
                                        e5.m20763k(this.f31384k).m20769y(this.f31384k.getPackageName(), ga.m20888p(i2), str, "13");
                                    }
                                } else {
                                    com.xiaomi.channel.commonutils.logger.zy.mcp("PushMessageProcessor", "missing target intent for message: " + j3y2VarM21431a.m21025a() + ", typeId=" + strFn3e);
                                }
                            }
                            com.xiaomi.channel.commonutils.logger.zy.m19293h("PushMessageProcessor", "pre-def msg process done.");
                            return null;
                        }
                        miPushMessage = qVar;
                    } else {
                        com.xiaomi.channel.commonutils.logger.zy.kja0("drop a duplicate message, key=" + strM21025a);
                        e5.m20763k(this.f31384k).m20766p(this.f31384k.getPackageName(), ga.m20888p(i2), str, "2:" + strM21025a);
                    }
                    if (m28Var.m21235a() == null && !z2) {
                        x2(rfVar, m28Var);
                    }
                    return miPushMessage;
                case 2:
                    e4e e4eVar = (e4e) oaexVarM19526q;
                    String str3 = C5656l.m19500q(this.f31384k).f31388q;
                    if (TextUtils.isEmpty(str3) || !TextUtils.equals(str3, e4eVar.m20731a())) {
                        com.xiaomi.channel.commonutils.logger.zy.kja0("bad Registration result:");
                        e5.m20763k(this.f31384k).m20768s(this.f31384k.getPackageName(), ga.m20888p(i2), str, "21");
                        return null;
                    }
                    long qVar2 = d3.m19429y(this.f31384k).toq();
                    if (qVar2 > 0 && SystemClock.elapsedRealtime() - qVar2 > 900000) {
                        com.xiaomi.channel.commonutils.logger.zy.kja0("The received registration result has expired.");
                        e5.m20763k(this.f31384k).m20768s(this.f31384k.getPackageName(), ga.m20888p(i2), str, "26");
                        return null;
                    }
                    C5656l.m19500q(this.f31384k).f31388q = null;
                    if (e4eVar.f32823a == 0) {
                        C5656l.m19500q(this.f31384k).ki(e4eVar.f32835e, e4eVar.f32836f, e4eVar.f32842l);
                        f7l8.ld6(this.f31384k);
                        e5.m20763k(this.f31384k).f7l8(this.f31384k.getPackageName(), ga.m20888p(i2), str, yqrt.ERROR_CODE_DRM_SYSTEM_ERROR, "1");
                    } else {
                        e5.m20763k(this.f31384k).f7l8(this.f31384k.getPackageName(), ga.m20888p(i2), str, yqrt.ERROR_CODE_DRM_SYSTEM_ERROR, "2");
                    }
                    if (!TextUtils.isEmpty(e4eVar.f32835e)) {
                        arrayList3 = new ArrayList();
                        arrayList3.add(e4eVar.f32835e);
                    }
                    MiPushCommandMessage miPushCommandMessageM19583k = zurt.m19583k(b9ub.COMMAND_REGISTER.f32725a, arrayList3, e4eVar.f32823a, e4eVar.f32834d, null, e4eVar.m20732a());
                    d3.m19429y(this.f31384k).uv6();
                    return miPushCommandMessageM19583k;
                case 3:
                    if (!m28Var.m21253b()) {
                        com.xiaomi.channel.commonutils.logger.zy.jk("receiving an un-encrypt message(UnRegistration).");
                        return null;
                    }
                    if (((anw) oaexVarM19526q).f32685a == 0) {
                        C5656l.m19500q(this.f31384k).m19501g();
                        cdj.m19391h(this.f31384k);
                    }
                    PushMessageHandler.m19363a();
                    return miPushMessage;
                case 4:
                    ff ffVar = (ff) oaexVarM19526q;
                    if (ffVar.f32912a == 0) {
                        cdj.ld6(this.f31384k, ffVar.m20853b());
                    }
                    if (!TextUtils.isEmpty(ffVar.m20853b())) {
                        arrayList2 = new ArrayList();
                        arrayList2.add(ffVar.m20853b());
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("resp-cmd:");
                    b9ub b9ubVar = b9ub.COMMAND_SUBSCRIBE_TOPIC;
                    sb.append(b9ubVar);
                    sb.append(", ");
                    sb.append(ffVar.m20848a());
                    com.xiaomi.channel.commonutils.logger.zy.a9(sb.toString());
                    return zurt.m19583k(b9ubVar.f32725a, arrayList2, ffVar.f32912a, ffVar.f32918d, ffVar.m20855c(), null);
                case 5:
                    uv uvVar = (uv) oaexVarM19526q;
                    if (uvVar.f34000a == 0) {
                        cdj.hb(this.f31384k, uvVar.m21879b());
                    }
                    if (!TextUtils.isEmpty(uvVar.m21879b())) {
                        arrayList = new ArrayList();
                        arrayList.add(uvVar.m21879b());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("resp-cmd:");
                    b9ub b9ubVar2 = b9ub.COMMAND_UNSUBSCRIBE_TOPIC;
                    sb2.append(b9ubVar2);
                    sb2.append(", ");
                    sb2.append(uvVar.m21874a());
                    com.xiaomi.channel.commonutils.logger.zy.a9(sb2.toString());
                    return zurt.m19583k(b9ubVar2.f32725a, arrayList, uvVar.f34000a, uvVar.f34006d, uvVar.m21881c(), null);
                case 6:
                    w831.m21956g(this.f31384k.getPackageName(), this.f31384k, oaexVarM19526q, wwp.Command, bArr.length);
                    kjd kjdVar = (kjd) oaexVarM19526q;
                    String strM21092b = kjdVar.m21092b();
                    List<String> listM21087a = kjdVar.m21087a();
                    if (kjdVar.f33139a == 0) {
                        if (TextUtils.equals(strM21092b, b9ub.COMMAND_SET_ACCEPT_TIME.f32725a) && listM21087a != null && listM21087a.size() > 1) {
                            cdj.m19390g(this.f31384k, listM21087a.get(0), listM21087a.get(1));
                            if ("00:00".equals(listM21087a.get(0)) && "00:00".equals(listM21087a.get(1))) {
                                C5656l.m19500q(this.f31384k).ld6(true);
                            } else {
                                C5656l.m19500q(this.f31384k).ld6(false);
                            }
                            listM21087a = m19490g(TimeZone.getTimeZone("GMT+08"), TimeZone.getDefault(), listM21087a);
                        } else if (TextUtils.equals(strM21092b, b9ub.COMMAND_SET_ALIAS.f32725a) && listM21087a != null && listM21087a.size() > 0) {
                            cdj.m19407y(this.f31384k, listM21087a.get(0));
                        } else if (TextUtils.equals(strM21092b, b9ub.COMMAND_UNSET_ALIAS.f32725a) && listM21087a != null && listM21087a.size() > 0) {
                            cdj.uv6(this.f31384k, listM21087a.get(0));
                        } else if (TextUtils.equals(strM21092b, b9ub.COMMAND_SET_ACCOUNT.f32725a) && listM21087a != null && listM21087a.size() > 0) {
                            cdj.f7l8(this.f31384k, listM21087a.get(0));
                        } else if (TextUtils.equals(strM21092b, b9ub.COMMAND_UNSET_ACCOUNT.f32725a) && listM21087a != null && listM21087a.size() > 0) {
                            cdj.lrht(this.f31384k, listM21087a.get(0));
                        } else if (TextUtils.equals(strM21092b, b9ub.COMMAND_CHK_VDEVID.f32725a)) {
                            return null;
                        }
                    }
                    List<String> list = listM21087a;
                    com.xiaomi.channel.commonutils.logger.zy.a9("resp-cmd:" + strM21092b + ", " + kjdVar.m21086a());
                    return zurt.m19583k(strM21092b, list, kjdVar.f33139a, kjdVar.f33147d, kjdVar.m21095c(), null);
                case 7:
                    w831.m21956g(this.f31384k.getPackageName(), this.f31384k, oaexVarM19526q, wwp.Notification, bArr.length);
                    if (oaexVarM19526q instanceof z8) {
                        z8 z8Var = (z8) oaexVarM19526q;
                        String strM22082a = z8Var.m22082a();
                        com.xiaomi.channel.commonutils.logger.zy.a9("resp-type:" + z8Var.m22089b() + ", code:" + z8Var.f34261a + ", " + strM22082a);
                        if (kq.DisablePushMessage.f33227a.equalsIgnoreCase(z8Var.f34268d)) {
                            if (z8Var.f34261a == 0) {
                                synchronized (o1t.class) {
                                    if (o1t.toq(this.f31384k).m19533g(strM22082a)) {
                                        o1t.toq(this.f31384k).m19537y(strM22082a);
                                        o1t qVar3 = o1t.toq(this.f31384k);
                                        dd ddVar = dd.DISABLE_PUSH;
                                        if ("syncing".equals(qVar3.zy(ddVar))) {
                                            o1t.toq(this.f31384k).m19536q(ddVar, "synced");
                                            cdj.t8r(this.f31384k);
                                            cdj.ki(this.f31384k);
                                            PushMessageHandler.m19363a();
                                            d3.m19429y(this.f31384k).m19433r();
                                        }
                                    }
                                }
                            } else if ("syncing".equals(o1t.toq(this.f31384k).zy(dd.DISABLE_PUSH))) {
                                synchronized (o1t.class) {
                                    if (o1t.toq(this.f31384k).m19533g(strM22082a)) {
                                        if (o1t.toq(this.f31384k).m19534k(strM22082a) < 10) {
                                            o1t.toq(this.f31384k).f7l8(strM22082a);
                                            d3.m19429y(this.f31384k).d3(true, strM22082a);
                                        } else {
                                            o1t.toq(this.f31384k).m19537y(strM22082a);
                                        }
                                    }
                                }
                            } else {
                                o1t.toq(this.f31384k).m19537y(strM22082a);
                            }
                            break;
                        } else if (kq.EnablePushMessage.f33227a.equalsIgnoreCase(z8Var.f34268d)) {
                            if (z8Var.f34261a == 0) {
                                synchronized (o1t.class) {
                                    if (o1t.toq(this.f31384k).m19533g(strM22082a)) {
                                        o1t.toq(this.f31384k).m19537y(strM22082a);
                                        o1t qVar4 = o1t.toq(this.f31384k);
                                        dd ddVar2 = dd.ENABLE_PUSH;
                                        if ("syncing".equals(qVar4.zy(ddVar2))) {
                                            o1t.toq(this.f31384k).m19536q(ddVar2, "synced");
                                        }
                                    }
                                }
                            } else if ("syncing".equals(o1t.toq(this.f31384k).zy(dd.ENABLE_PUSH))) {
                                synchronized (o1t.class) {
                                    if (o1t.toq(this.f31384k).m19533g(strM22082a)) {
                                        if (o1t.toq(this.f31384k).m19534k(strM22082a) < 10) {
                                            o1t.toq(this.f31384k).f7l8(strM22082a);
                                            d3.m19429y(this.f31384k).d3(false, strM22082a);
                                        } else {
                                            o1t.toq(this.f31384k).m19537y(strM22082a);
                                        }
                                    }
                                }
                            } else {
                                o1t.toq(this.f31384k).m19537y(strM22082a);
                            }
                            break;
                        } else if (kq.ThirdPartyRegUpdate.f33227a.equalsIgnoreCase(z8Var.f34268d)) {
                            m19483h(z8Var);
                        } else if (kq.UploadTinyData.f33227a.equalsIgnoreCase(z8Var.f34268d)) {
                            m19488s(z8Var);
                        }
                    } else if (oaexVarM19526q instanceof erbd) {
                        erbd erbdVar = (erbd) oaexVarM19526q;
                        if ("registration id expired".equalsIgnoreCase(erbdVar.f32871d)) {
                            List<String> listM19408z = cdj.m19408z(this.f31384k);
                            List<String> listO1t = cdj.o1t(this.f31384k);
                            List<String> listWvg = cdj.wvg(this.f31384k);
                            String strFu4 = cdj.fu4(this.f31384k);
                            com.xiaomi.channel.commonutils.logger.zy.a9("resp-type:" + erbdVar.f32871d + ", " + erbdVar.m20787a());
                            cdj.m19401r(this.f31384k, z5.RegIdExpired);
                            for (String str4 : listM19408z) {
                                cdj.uv6(this.f31384k, str4);
                                cdj.m19384a(this.f31384k, str4, null);
                            }
                            for (String str5 : listO1t) {
                                cdj.hb(this.f31384k, str5);
                                cdj.bo(this.f31384k, str5, null);
                            }
                            for (String str6 : listWvg) {
                                cdj.lrht(this.f31384k, str6);
                                cdj.nmn5(this.f31384k, str6, null);
                            }
                            String[] strArrSplit = strFu4.split(",");
                            if (strArrSplit.length == 2) {
                                cdj.m19386c(this.f31384k);
                                cdj.m19390g(this.f31384k, strArrSplit[0], strArrSplit[1]);
                            }
                        } else if (!kq.ClientInfoUpdateOk.f33227a.equalsIgnoreCase(erbdVar.f32871d)) {
                            try {
                                if (kq.NormalClientConfigUpdate.f33227a.equalsIgnoreCase(erbdVar.f32871d)) {
                                    vg vgVar = new vg();
                                    qla.m21399n(vgVar, erbdVar.m20794a());
                                    com.xiaomi.push.service.fti.m21614q(com.xiaomi.push.service.a9.m21550q(this.f31384k), vgVar);
                                } else if (kq.CustomClientConfigUpdate.f33227a.equalsIgnoreCase(erbdVar.f32871d)) {
                                    k4jz k4jzVar = new k4jz();
                                    qla.m21399n(k4jzVar, erbdVar.m20794a());
                                    com.xiaomi.push.service.fti.zy(com.xiaomi.push.service.a9.m21550q(this.f31384k), k4jzVar);
                                } else if (kq.SyncInfoResult.f33227a.equalsIgnoreCase(erbdVar.f32871d)) {
                                    x9kr.zy(this.f31384k, erbdVar);
                                } else if (kq.ForceSync.f33227a.equalsIgnoreCase(erbdVar.f32871d)) {
                                    com.xiaomi.channel.commonutils.logger.zy.kja0("receive force sync notification");
                                    x9kr.m19570q(this.f31384k, false);
                                } else if (kq.CancelPushMessage.f33227a.equals(erbdVar.f32871d)) {
                                    com.xiaomi.channel.commonutils.logger.zy.a9("resp-type:" + erbdVar.f32871d + ", " + erbdVar.m20787a());
                                    if (erbdVar.m20788a() != null) {
                                        int i3 = -2;
                                        if (erbdVar.m20788a().containsKey(com.xiaomi.push.service.dd.f73578ncyb)) {
                                            String str7 = erbdVar.m20788a().get(com.xiaomi.push.service.dd.f73578ncyb);
                                            if (!TextUtils.isEmpty(str7)) {
                                                try {
                                                    i3 = Integer.parseInt(str7);
                                                } catch (NumberFormatException e2) {
                                                    e2.printStackTrace();
                                                }
                                            }
                                        }
                                        if (i3 >= -1) {
                                            cdj.m19392i(this.f31384k, i3);
                                        } else {
                                            cdj.fn3e(this.f31384k, erbdVar.m20788a().containsKey(com.xiaomi.push.service.dd.f73563dd) ? erbdVar.m20788a().get(com.xiaomi.push.service.dd.f73563dd) : "", erbdVar.m20788a().containsKey(com.xiaomi.push.service.dd.f73587x9kr) ? erbdVar.m20788a().get(com.xiaomi.push.service.dd.f73587x9kr) : "");
                                        }
                                    }
                                    ld6(erbdVar);
                                    break;
                                } else if (kq.HybridRegisterResult.f33227a.equals(erbdVar.f32871d)) {
                                    try {
                                        e4e e4eVar2 = new e4e();
                                        qla.m21399n(e4eVar2, erbdVar.m20794a());
                                        ki.m19495q(this.f31384k, e4eVar2);
                                    } catch (sb e3) {
                                        com.xiaomi.channel.commonutils.logger.zy.t8r(e3);
                                    }
                                    break;
                                } else if (kq.HybridUnregisterResult.f33227a.equals(erbdVar.f32871d)) {
                                    try {
                                        anw anwVar = new anw();
                                        qla.m21399n(anwVar, erbdVar.m20794a());
                                        ki.m19493n(this.f31384k, anwVar);
                                    } catch (sb e4) {
                                        com.xiaomi.channel.commonutils.logger.zy.t8r(e4);
                                    }
                                    break;
                                } else if (!kq.PushLogUpload.f33227a.equals(erbdVar.f32871d)) {
                                    if (kq.DetectAppAlive.f33227a.equals(erbdVar.f32871d)) {
                                        com.xiaomi.channel.commonutils.logger.zy.m19302z("receive detect msg");
                                        ki(erbdVar);
                                    } else if (wo.toq(erbdVar)) {
                                        com.xiaomi.channel.commonutils.logger.zy.m19302z("receive notification handle by cpra");
                                    }
                                }
                                break;
                            } catch (sb unused) {
                            }
                        } else if (erbdVar.m20788a() != null && erbdVar.m20788a().containsKey(C5658n.f73186toq)) {
                            C5656l.m19500q(this.f31384k).m19509y(erbdVar.m20788a().get(C5658n.f73186toq));
                        }
                    }
                    return miPushMessage;
                default:
                    return miPushMessage;
            }
        } catch (yz e6) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e6);
            m19486p(m28Var);
            e5.m20763k(this.f31384k).m20768s(this.f31384k.getPackageName(), ga.m20888p(i2), str, "19");
            C5657m.m19518g(this.f31384k, m28Var, z2);
            return null;
        } catch (sb e7) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e7);
            com.xiaomi.channel.commonutils.logger.zy.jk("receive a message which action string is not valid. is the reg expired?");
            e5.m20763k(this.f31384k).m20768s(this.f31384k.getPackageName(), ga.m20888p(i2), str, "20");
            C5657m.m19518g(this.f31384k, m28Var, z2);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public List<String> m19490g(TimeZone timeZone, TimeZone timeZone2, List<String> list) {
        if (timeZone.equals(timeZone2)) {
            return list;
        }
        long rawOffset = ((timeZone.getRawOffset() - timeZone2.getRawOffset()) / 1000) / 60;
        long j2 = ((((Long.parseLong(list.get(0).split(":")[0]) * 60) + Long.parseLong(list.get(0).split(":")[1])) - rawOffset) + 1440) % 1440;
        long j3 = ((((Long.parseLong(list.get(1).split(":")[0]) * 60) + Long.parseLong(list.get(1).split(":")[1])) - rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60)));
        return arrayList;
    }

    public PushMessageHandler.InterfaceC5638k toq(Intent intent) {
        String action = intent.getAction();
        com.xiaomi.channel.commonutils.logger.zy.kja0("receive an intent from server, action=" + action);
        String stringExtra = intent.getStringExtra("mrt");
        if (stringExtra == null) {
            stringExtra = Long.toString(System.currentTimeMillis());
        }
        String stringExtra2 = intent.getStringExtra("messageId");
        int intExtra = intent.getIntExtra("eventMessageType", -1);
        if ("com.xiaomi.mipush.RECEIVE_MESSAGE".equals(action)) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            boolean booleanExtra = intent.getBooleanExtra("mipush_notified", false);
            if (byteArrayExtra == null) {
                com.xiaomi.channel.commonutils.logger.zy.jk("receiving an empty message, drop");
                e5.m20763k(this.f31384k).m20765n(this.f31384k.getPackageName(), intent, "12");
                return null;
            }
            m28 m28Var = new m28();
            try {
                qla.m21399n(m28Var, byteArrayExtra);
                C5656l c5656lM19500q = C5656l.m19500q(this.f31384k);
                ge geVarM21235a = m28Var.m21235a();
                wwp wwpVarM21242a = m28Var.m21242a();
                wwp wwpVar = wwp.SendMessage;
                if (wwpVarM21242a == wwpVar && geVarM21235a != null && !c5656lM19500q.o1t() && !booleanExtra) {
                    geVarM21235a.m20909a("mrt", stringExtra);
                    geVarM21235a.m20909a("mat", Long.toString(System.currentTimeMillis()));
                    if (kja0(m28Var)) {
                        com.xiaomi.channel.commonutils.logger.zy.m19302z("this is a mina's message, ack later");
                        geVarM21235a.m20909a(C5658n.f73187wvg, String.valueOf(geVarM21235a.m20901a()));
                        geVarM21235a.m20909a(C5658n.f31412t, String.valueOf((int) qla.toq(this.f31384k, m28Var)));
                    } else {
                        cdj(m28Var);
                    }
                }
                if (m28Var.m21242a() == wwpVar && !m28Var.m21253b()) {
                    if (com.xiaomi.push.service.kja0.oc(m28Var)) {
                        Object[] objArr = new Object[2];
                        objArr[0] = m28Var.m21251b();
                        objArr[1] = geVarM21235a != null ? geVarM21235a.m20906a() : "";
                        com.xiaomi.channel.commonutils.logger.zy.kja0(String.format("drop an un-encrypted wake-up messages. %1$s, %2$s", objArr));
                        e5.m20763k(this.f31384k).m20765n(this.f31384k.getPackageName(), intent, String.format("13: %1$s", m28Var.m21251b()));
                    } else {
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = m28Var.m21251b();
                        objArr2[1] = geVarM21235a != null ? geVarM21235a.m20906a() : "";
                        com.xiaomi.channel.commonutils.logger.zy.kja0(String.format("drop an un-encrypted messages. %1$s, %2$s", objArr2));
                        e5.m20763k(this.f31384k).m20765n(this.f31384k.getPackageName(), intent, String.format("14: %1$s", m28Var.m21251b()));
                    }
                    C5657m.zy(this.f31384k, m28Var, booleanExtra);
                    return null;
                }
                if (m28Var.m21242a() == wwpVar && m28Var.m21253b() && com.xiaomi.push.service.kja0.oc(m28Var) && (!booleanExtra || geVarM21235a == null || geVarM21235a.m20907a() == null || !geVarM21235a.m20907a().containsKey("notify_effect"))) {
                    Object[] objArr3 = new Object[2];
                    objArr3[0] = m28Var.m21251b();
                    objArr3[1] = geVarM21235a != null ? geVarM21235a.m20906a() : "";
                    com.xiaomi.channel.commonutils.logger.zy.kja0(String.format("drop a wake-up messages which not has 'notify_effect' attr. %1$s, %2$s", objArr3));
                    e5.m20763k(this.f31384k).m20765n(this.f31384k.getPackageName(), intent, String.format("25: %1$s", m28Var.m21251b()));
                    C5657m.m19520n(this.f31384k, m28Var, booleanExtra);
                    return null;
                }
                if (c5656lM19500q.zurt() || m28Var.f33388a == wwp.Registration) {
                    if (!c5656lM19500q.zurt() || !c5656lM19500q.m19508t()) {
                        return zy(m28Var, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                    }
                    if (m28Var.f33388a != wwp.UnRegistration) {
                        C5657m.m19522y(this.f31384k, m28Var, booleanExtra);
                        cdj.mu(this.f31384k);
                    } else if (m28Var.m21253b()) {
                        c5656lM19500q.m19501g();
                        cdj.m19391h(this.f31384k);
                        PushMessageHandler.m19363a();
                    } else {
                        com.xiaomi.channel.commonutils.logger.zy.jk("receiving an un-encrypt unregistration message");
                    }
                } else {
                    if (com.xiaomi.push.service.kja0.oc(m28Var)) {
                        return zy(m28Var, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                    }
                    C5657m.m19522y(this.f31384k, m28Var, booleanExtra);
                    boolean zFu4 = c5656lM19500q.fu4();
                    com.xiaomi.channel.commonutils.logger.zy.jk("receive message without registration. need re-register!registered?" + zFu4);
                    e5.m20763k(this.f31384k).m20765n(this.f31384k.getPackageName(), intent, "15");
                    if (zFu4) {
                        f7l8();
                    }
                }
            } catch (sb e2) {
                e5.m20763k(this.f31384k).m20765n(this.f31384k.getPackageName(), intent, "16");
                com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            } catch (Exception e3) {
                e5.m20763k(this.f31384k).m20765n(this.f31384k.getPackageName(), intent, "17");
                com.xiaomi.channel.commonutils.logger.zy.t8r(e3);
            }
        } else {
            if ("com.xiaomi.mipush.ERROR".equals(action)) {
                MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
                m28 m28Var2 = new m28();
                try {
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
                    if (byteArrayExtra2 != null) {
                        qla.m21399n(m28Var2, byteArrayExtra2);
                    }
                } catch (sb unused) {
                }
                miPushCommandMessage.setCommand(String.valueOf(m28Var2.m21242a()));
                miPushCommandMessage.setResultCode(intent.getIntExtra("mipush_error_code", 0));
                miPushCommandMessage.setReason(intent.getStringExtra("mipush_error_msg"));
                com.xiaomi.channel.commonutils.logger.zy.jk("receive a error message. code = " + intent.getIntExtra("mipush_error_code", 0) + ", msg= " + intent.getStringExtra("mipush_error_msg"));
                return miPushCommandMessage;
            }
            if ("com.xiaomi.mipush.MESSAGE_ARRIVED".equals(action)) {
                byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
                if (byteArrayExtra3 == null) {
                    com.xiaomi.channel.commonutils.logger.zy.jk("message arrived: receiving an empty message, drop");
                    return null;
                }
                m28 m28Var3 = new m28();
                try {
                    qla.m21399n(m28Var3, byteArrayExtra3);
                    C5656l c5656lM19500q2 = C5656l.m19500q(this.f31384k);
                    if (com.xiaomi.push.service.kja0.oc(m28Var3)) {
                        com.xiaomi.channel.commonutils.logger.zy.jk("message arrived: receive ignore reg message, ignore!");
                    } else if (!c5656lM19500q2.zurt()) {
                        com.xiaomi.channel.commonutils.logger.zy.jk("message arrived: receive message without registration. need unregister or re-register!");
                    } else {
                        if (!c5656lM19500q2.zurt() || !c5656lM19500q2.m19508t()) {
                            return m19487q(m28Var3, byteArrayExtra3);
                        }
                        com.xiaomi.channel.commonutils.logger.zy.jk("message arrived: app info is invalidated");
                    }
                } catch (Exception e4) {
                    com.xiaomi.channel.commonutils.logger.zy.jk("fail to deal with arrived message. " + e4);
                }
            }
        }
        return null;
    }
}
