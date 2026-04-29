package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.xiaomi.push.m28;
import com.xiaomi.push.nc;
import com.xiaomi.push.qla;
import com.xiaomi.push.rf;
import com.xiaomi.push.service.zsr0;
import com.xiaomi.push.wwp;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class f7l8 {
    public static void f7l8(Intent intent) {
        uv6.qrj(intent);
    }

    /* JADX INFO: renamed from: g */
    public static void m19444g(Context context) {
        uv6.m19562p(context, hyr.ASSEMBLE_PUSH_FCM);
    }

    /* JADX INFO: renamed from: k */
    private static Map<String, String> m19445k(Context context) {
        HashMap map = new HashMap();
        map.put(InterfaceC1925p.igv, String.valueOf(wwp.AckMessage.m21982a()));
        map.put("deviceStatus", String.valueOf((int) qla.zy(context, context.getPackageName())));
        map.put("mat", Long.toString(System.currentTimeMillis()));
        return map;
    }

    public static void ld6(Context context) {
        context.getSharedPreferences("mipush_extra", 0).edit().putBoolean("is_xmsf_sup_decrypt", ((long) nc.x2(context)) >= 50002000).apply();
    }

    /* JADX INFO: renamed from: n */
    private static boolean m19446n(Context context) {
        return context.getSharedPreferences("mipush_extra", 0).getBoolean("is_xmsf_sup_decrypt", false);
    }

    /* JADX INFO: renamed from: p */
    public static Map<String, String> m19447p(Context context, Map<String, String> map) {
        PushMessageReceiver pushMessageReceiverM19563q;
        String str = map.get("pushMsg");
        if (!TextUtils.isEmpty(str) && (pushMessageReceiverM19563q = uv6.m19563q(context)) != null) {
            pushMessageReceiverM19563q.onReceivePassThroughMessage(context, uv6.zy(str));
        }
        String str2 = map.get("mipushContainer");
        if (TextUtils.isEmpty(str2)) {
            return new HashMap();
        }
        try {
            byte[] bArrDecode = Base64.decode(str2, 2);
            toq(context, com.xiaomi.push.service.zy.m21824q(bArrDecode));
            zy(context, bArrDecode);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.zy.cdj("fcm notify notification error ", th);
        }
        return m19445k(context);
    }

    /* JADX INFO: renamed from: q */
    private static boolean m19448q(Context context) {
        return ((long) nc.x2(context)) >= 50002000 && m19446n(context);
    }

    public static void qrj(Context context, String str) {
        uv6.ld6(context, hyr.ASSEMBLE_PUSH_FCM, str);
    }

    /* JADX INFO: renamed from: s */
    public static void m19449s(Context context, Map<String, String> map) {
        PushMessageReceiver pushMessageReceiverM19563q;
        String str = map.get("pushMsg");
        if (TextUtils.isEmpty(str) || (pushMessageReceiverM19563q = uv6.m19563q(context)) == null) {
            return;
        }
        pushMessageReceiverM19563q.onNotificationMessageArrived(context, uv6.zy(str));
    }

    private static void toq(Context context, m28 m28Var) {
        try {
            MiPushMessage qVar = zurt.toq((rf) mcp.m19526q(context, m28Var), m28Var.m21235a(), false);
            PushMessageReceiver pushMessageReceiverM19563q = uv6.m19563q(context);
            if (pushMessageReceiverM19563q != null) {
                pushMessageReceiverM19563q.onNotificationMessageArrived(context, qVar);
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.zy.cdj("fcm broadcast notification come error ", th);
        }
    }

    public static void x2() {
        C5652i.m19467q(uv6.ni7(hyr.ASSEMBLE_PUSH_FCM), "fcm", 1L, "some fcm messages was deleted ");
    }

    /* JADX INFO: renamed from: y */
    public static boolean m19450y(Context context) {
        return uv6.m19558h(context, hyr.ASSEMBLE_PUSH_FCM) && cdj.jk(context);
    }

    private static void zy(Context context, byte[] bArr) {
        boolean zOc = d3.m19429y(context).oc();
        boolean z2 = true;
        boolean z3 = !"com.xiaomi.xmsf".equals(context.getPackageName());
        boolean zM19448q = m19448q(context);
        boolean z5 = false;
        if (zOc && z3 && zM19448q) {
            bArr = zsr0.m21811q(bArr, C5656l.m19500q(context).ni7());
            if (bArr == null) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("fcm message encrypt failed");
            } else {
                String strEncodeToString = Base64.encodeToString(bArr, 2);
                if (TextUtils.isEmpty(strEncodeToString)) {
                    com.xiaomi.channel.commonutils.logger.zy.kja0("fcm message buf base64 encode failed");
                    z2 = false;
                } else {
                    Intent intent = new Intent(com.xiaomi.push.service.dd.f73577n7h);
                    intent.setPackage("com.xiaomi.xmsf");
                    intent.setClassName("com.xiaomi.xmsf", "com.xiaomi.push.service.XMPushService");
                    intent.putExtra("ext_fcm_container_buffer", strEncodeToString);
                    intent.putExtra("mipush_app_package", context.getPackageName());
                    context.startService(intent);
                    com.xiaomi.channel.commonutils.logger.zy.kja0("fcm message reroute to xmsf");
                }
                z5 = z2;
            }
        } else {
            com.xiaomi.channel.commonutils.logger.zy.kja0(String.format("xmsf can not receive fcm msg - shouldUseMIUIPush=%s;isNotXmsf=%s;xmsfSupport=%s", Boolean.valueOf(zOc), Boolean.valueOf(z3), Boolean.valueOf(zM19448q)));
        }
        if (z5) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.zy.m19302z("fcm message post local");
        com.xiaomi.push.service.kja0.ki(context, com.xiaomi.push.service.zy.m21824q(bArr), bArr);
    }
}
