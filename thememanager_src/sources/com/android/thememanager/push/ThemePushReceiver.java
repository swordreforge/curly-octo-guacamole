package com.android.thememanager.push;

import android.content.Context;
import android.util.Log;
import com.android.thememanager.basemodule.privacy.x2;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.util.C2755a;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import com.xiaomi.mipush.sdk.cdj;

/* JADX INFO: loaded from: classes2.dex */
public class ThemePushReceiver extends PushMessageReceiver {
    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onCommandResult(Context context, MiPushCommandMessage cmdMsg) {
        if (bf2.toq.m5812n()) {
            Log.d(C2755a.f16307g, "push onCommanddResult : " + cmdMsg.toString());
        }
        Log.i("ThemePushReceiver", "onCommandResult: " + cmdMsg.getResultCode());
        if (cmdMsg.getResultCode() == 0) {
            if (cdj.f31317k.equals(cmdMsg.getCommand())) {
                f7l8.m8456g().m8463s(cmdMsg.getCommandArguments().get(0));
                return;
            }
            return;
        }
        Log.i(C2755a.f16307g, "push cmd result error: " + cmdMsg.toString());
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceiveMessage(Context context, MiPushMessage pushMsg) {
        if (bf2.toq.m5812n()) {
            Log.d(C2755a.f16307g, "push onReceiveMessage : " + pushMsg.toString());
        }
        Log.i("ThemePushReceiver", "onCommandResult: " + pushMsg.getNotifyId() + "," + pushMsg.getMessageType() + "," + pushMsg.getMessageType());
        if (y9n.vyq()) {
            boolean z2 = context.getPackageManager().checkPermission("android.permission.POST_NOTIFICATIONS", y9n.f10446p) == 0;
            Log.d(C2755a.f16307g, "POST_NOTIFICATIONS grant = " + z2);
            if (!a9.m6999s(y9n.f10446p) || !z2) {
                Log.i(C2755a.f16307g, "drop push message because theme store has been uninstalled or POST_NOTIFICATIONS not granted");
                return;
            }
        }
        if (!f7l8.m8456g().cdj(pushMsg.getAlias())) {
            cdj.vq(context, pushMsg.getAlias(), null);
            Log.i(C2755a.f16307g, "invalid ALIAS onReceiveMessage : " + pushMsg.toString());
            return;
        }
        if (!f7l8.m8456g().ki(pushMsg.getTopic())) {
            cdj.fnq8(context, pushMsg.getTopic(), null);
            Log.i(C2755a.f16307g, "invalid TOPIC onReceiveMessage : " + pushMsg.toString());
            return;
        }
        if (pushMsg.getPassThrough() == 1) {
            if (x2.f7l8()) {
                Log.i(C2755a.f16307g, "local mode not push message");
                return;
            }
            C2315k qVar = C2315k.toq(C2319y.toq(pushMsg));
            if (qVar.m8467k()) {
                return;
            }
            Log.i(C2755a.f16307g, "fail to handle push message : " + pushMsg.toString() + " | Reason: " + qVar.zy());
        }
    }
}
