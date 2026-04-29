package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.s */
/* JADX INFO: loaded from: classes3.dex */
public class C5664s {

    /* JADX INFO: renamed from: k */
    private static boolean f31427k = false;

    public static void f7l8(Context context, String str) throws JSONException {
        String string = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("content")) {
                    string = jSONObject.getString("content");
                }
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.jk(e2.toString());
        }
        PushMessageReceiver pushMessageReceiverM19563q = uv6.m19563q(context);
        if (pushMessageReceiverM19563q != null) {
            pushMessageReceiverM19563q.onReceivePassThroughMessage(context, uv6.zy(string));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r2 = r3.getString("pushMsg");
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m19548g(android.content.Context r5, java.lang.String r6) throws org.json.JSONException {
        /*
            java.lang.String r0 = "pushMsg"
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r2 = ""
            if (r1 != 0) goto L37
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Exception -> L2f
            r1.<init>(r6)     // Catch: java.lang.Exception -> L2f
            int r6 = r1.length()     // Catch: java.lang.Exception -> L2f
            if (r6 <= 0) goto L37
            r6 = 0
        L16:
            int r3 = r1.length()     // Catch: java.lang.Exception -> L2f
            if (r6 >= r3) goto L37
            org.json.JSONObject r3 = r1.getJSONObject(r6)     // Catch: java.lang.Exception -> L2f
            boolean r4 = r3.has(r0)     // Catch: java.lang.Exception -> L2f
            if (r4 == 0) goto L2c
            java.lang.String r6 = r3.getString(r0)     // Catch: java.lang.Exception -> L2f
            r2 = r6
            goto L37
        L2c:
            int r6 = r6 + 1
            goto L16
        L2f:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            com.xiaomi.channel.commonutils.logger.zy.jk(r6)
        L37:
            com.xiaomi.mipush.sdk.PushMessageReceiver r6 = com.xiaomi.mipush.sdk.uv6.m19563q(r5)
            if (r6 == 0) goto L51
            com.xiaomi.mipush.sdk.MiPushMessage r0 = com.xiaomi.mipush.sdk.uv6.zy(r2)
            java.util.Map r1 = r0.getExtra()
            java.lang.String r2 = "notify_effect"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L4e
            return
        L4e:
            r6.onNotificationMessageClicked(r5, r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.C5664s.m19548g(android.content.Context, java.lang.String):void");
    }

    /* JADX INFO: renamed from: k */
    public static void m19549k(Intent intent) {
        uv6.qrj(intent);
    }

    public static void kja0(Context context, String str) {
        uv6.ld6(context, hyr.ASSEMBLE_PUSH_HUAWEI, str);
    }

    public static synchronized void ld6(Context context) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_get_token_time", System.currentTimeMillis()).commit();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m19550n() {
        return f31427k;
    }

    public static synchronized boolean n7h(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_connect_time", -1L)) > 5000;
    }

    /* JADX INFO: renamed from: p */
    public static synchronized void m19551p(Context context) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_connect_time", System.currentTimeMillis()).commit();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m19552q(Context context) {
        return cdj.a9(context);
    }

    public static synchronized boolean qrj(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_get_token_time", -1L)) > 172800000;
    }

    /* JADX INFO: renamed from: s */
    public static void m19553s(String str, int i2) {
        uv6.n7h(str, i2);
    }

    public static boolean toq(Context context) {
        return uv6.kja0(context);
    }

    public static void x2(boolean z2) {
        f31427k = z2;
    }

    /* JADX INFO: renamed from: y */
    public static void m19554y(Context context) {
        InterfaceC5654k interfaceC5654kM19441q = C5648f.m19438n(context).m19441q(hyr.ASSEMBLE_PUSH_HUAWEI);
        if (interfaceC5654kM19441q != null) {
            interfaceC5654kM19441q.toq();
        }
    }

    public static boolean zy(Context context) {
        String strM19557g = uv6.m19557g(context, hyr.ASSEMBLE_PUSH_HUAWEI, false);
        String strZy = o1t.toq(context).zy(dd.UPLOAD_HUAWEI_TOKEN);
        return (TextUtils.isEmpty(strM19557g) || TextUtils.isEmpty(strZy) || !"synced".equals(strZy)) ? false : true;
    }
}
