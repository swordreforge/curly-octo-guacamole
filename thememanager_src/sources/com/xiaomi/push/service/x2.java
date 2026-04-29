package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.C5650g;
import com.xiaomi.push.b2;
import com.xiaomi.push.erbd;
import com.xiaomi.push.ge;
import com.xiaomi.push.imd;
import com.xiaomi.push.kq;
import com.xiaomi.push.m28;
import com.xiaomi.push.o5;
import com.xiaomi.push.oaex;
import com.xiaomi.push.ovdh;
import com.xiaomi.push.qla;
import com.xiaomi.push.sb;
import com.xiaomi.push.service.eqxt;
import com.xiaomi.push.wwp;
import com.xiaomi.push.xtb7;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class x2 {
    static String f7l8(String str) {
        return str + ".permission.MIPUSH_RECEIVE";
    }

    /* JADX INFO: renamed from: g */
    private static String m21791g(m28 m28Var) {
        Map<String, String> map;
        ge geVar = m28Var.f33387a;
        if (geVar != null && (map = geVar.f32987b) != null) {
            String str = map.get("ext_traffic_source_pkg");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return m28Var.f33393b;
    }

    /* JADX INFO: renamed from: k */
    static o5 m21792k(XMPushService xMPushService, byte[] bArr) {
        m28 m28Var = new m28();
        try {
            qla.m21399n(m28Var, bArr);
            return toq(etdu.toq(xMPushService), xMPushService, m28Var);
        } catch (sb e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            return null;
        }
    }

    private static void ld6(XMPushService xMPushService, v0af v0afVar, int i2) {
        C5921j.zy(xMPushService).m21643g(new qrj("MSAID", i2, xMPushService, v0afVar));
    }

    /* JADX INFO: renamed from: n */
    private static <T extends oaex<T, ?>> m28 m21793n(String str, String str2, T t2, wwp wwpVar, boolean z2) {
        byte[] bArrM21397g = qla.m21397g(t2);
        m28 m28Var = new m28();
        b2 b2Var = new b2();
        b2Var.f32704a = 5L;
        b2Var.f32705a = "fakeid";
        m28Var.m21236a(b2Var);
        m28Var.m21240a(ByteBuffer.wrap(bArrM21397g));
        m28Var.m21238a(wwpVar);
        m28Var.m21250b(z2);
        m28Var.m21249b(str);
        m28Var.m21241a(false);
        m28Var.m21239a(str2);
        return m28Var;
    }

    static <T extends oaex<T, ?>> m28 n7h(String str, String str2, T t2, wwp wwpVar) {
        return m21793n(str, str2, t2, wwpVar, false);
    }

    /* JADX INFO: renamed from: p */
    static void m21794p(XMPushService xMPushService, eqxt.toq toqVar) {
        toqVar.m21595y(null);
        toqVar.m21594s(new n7h(xMPushService));
    }

    /* JADX INFO: renamed from: q */
    static <T extends oaex<T, ?>> m28 m21795q(String str, String str2, T t2, wwp wwpVar) {
        return m21793n(str, str2, t2, wwpVar, true);
    }

    static m28 qrj(String str, String str2) {
        erbd erbdVar = new erbd();
        erbdVar.m20795b(str2);
        erbdVar.m20799c(kq.AppDataCleared.f33227a);
        erbdVar.m20782a(gvn7.m21617k());
        erbdVar.m20785a(false);
        return m21795q(str, str2, erbdVar, wwp.Notification);
    }

    /* JADX INFO: renamed from: s */
    static void m21796s(XMPushService xMPushService, m28 m28Var) {
        com.xiaomi.push.w831.m21958n(m28Var.m21251b(), xMPushService.getApplicationContext(), m28Var, -1);
        imd imdVarM21523a = xMPushService.m21523a();
        if (imdVarM21523a == null) {
            throw new ovdh("try send msg while connection is null.");
        }
        if (!imdVarM21523a.cdj()) {
            throw new ovdh("Don't support XMPP connection.");
        }
        o5 qVar = toq(etdu.toq(xMPushService), xMPushService, m28Var);
        if (qVar != null) {
            imdVarM21523a.ni7(qVar);
        }
    }

    static o5 toq(v0af v0afVar, Context context, m28 m28Var) {
        try {
            o5 o5Var = new o5();
            o5Var.m21353y(5);
            o5Var.m21352t(v0afVar.f33918k);
            o5Var.zurt(m21791g(m28Var));
            o5Var.x2("SECMSG", "message");
            String str = v0afVar.f33918k;
            m28Var.f33386a.f32705a = str.substring(0, str.indexOf("@"));
            m28Var.f33386a.f32709c = str.substring(str.indexOf("/") + 1);
            o5Var.n7h(qla.m21397g(m28Var), v0afVar.f73673zy);
            o5Var.qrj((short) 1);
            com.xiaomi.channel.commonutils.logger.zy.kja0("try send mi push message. packagename:" + m28Var.f33393b + " action:" + m28Var.f33388a);
            return o5Var;
        } catch (NullPointerException e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            return null;
        }
    }

    static void x2(XMPushService xMPushService, String str, byte[] bArr) {
        com.xiaomi.push.w831.f7l8(str, xMPushService.getApplicationContext(), bArr);
        imd imdVarM21523a = xMPushService.m21523a();
        if (imdVarM21523a == null) {
            throw new ovdh("try send msg while connection is null.");
        }
        if (!imdVarM21523a.cdj()) {
            throw new ovdh("Don't support XMPP connection.");
        }
        o5 o5VarM21792k = m21792k(xMPushService, bArr);
        if (o5VarM21792k != null) {
            imdVarM21523a.ni7(o5VarM21792k);
        } else {
            w831.toq(xMPushService, str, bArr, C5650g.f31360n, "not a valid message");
        }
    }

    /* JADX INFO: renamed from: y */
    static void m21797y(XMPushService xMPushService) {
        v0af qVar = etdu.toq(xMPushService.getApplicationContext());
        if (qVar != null) {
            eqxt.toq toqVarM21772k = etdu.toq(xMPushService.getApplicationContext()).m21772k(xMPushService);
            com.xiaomi.channel.commonutils.logger.zy.kja0("prepare account. " + toqVarM21772k.f33761k);
            m21794p(xMPushService, toqVarM21772k);
            eqxt.zy().x2(toqVarM21772k);
            ld6(xMPushService, qVar, 172800);
        }
    }

    static m28 zy(String str, String str2) {
        erbd erbdVar = new erbd();
        erbdVar.m20795b(str2);
        erbdVar.m20799c("package uninstalled");
        erbdVar.m20782a(xtb7.ld6());
        erbdVar.m20785a(false);
        return m21795q(str, str2, erbdVar, wwp.Notification);
    }
}
