package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.y */
/* JADX INFO: loaded from: classes3.dex */
public class C5668y {

    /* JADX INFO: renamed from: k */
    private static long f31441k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static volatile boolean f73197toq = false;

    public static void f7l8(Context context, String str) {
        uv6.ld6(context, hyr.ASSEMBLE_PUSH_FTOS, str);
    }

    /* JADX INFO: renamed from: g */
    public static void m19571g(boolean z2) {
        f73197toq = z2;
    }

    /* JADX INFO: renamed from: k */
    private static void m19572k(Context context) {
        InterfaceC5654k interfaceC5654kM19441q = C5648f.m19438n(context).m19441q(hyr.ASSEMBLE_PUSH_FTOS);
        if (interfaceC5654kM19441q != null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("ASSEMBLE_PUSH :  register fun touch os when network change!");
            interfaceC5654kM19441q.toq();
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m19573n(Context context, Map<String, String> map) {
        PushMessageReceiver pushMessageReceiverM19563q;
        if (map == null || !map.containsKey("pushMsg")) {
            return;
        }
        String str = map.get("pushMsg");
        if (TextUtils.isEmpty(str) || (pushMessageReceiverM19563q = uv6.m19563q(context)) == null) {
            return;
        }
        MiPushMessage miPushMessageZy = uv6.zy(str);
        if (miPushMessageZy.getExtra().containsKey("notify_effect")) {
            return;
        }
        pushMessageReceiverM19563q.onNotificationMessageClicked(context, miPushMessageZy);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m19574q(Context context) {
        return uv6.kja0(context);
    }

    public static void toq(Context context) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zy()) {
            long j2 = f31441k;
            if (j2 <= 0 || j2 + 300000 <= jElapsedRealtime) {
                f31441k = jElapsedRealtime;
                m19572k(context);
            }
        }
    }

    public static boolean zy() {
        return f73197toq;
    }
}
