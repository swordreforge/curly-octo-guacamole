package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.zy;
import com.xiaomi.push.oki;
import com.xiaomi.push.service.C5922k;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.dd;

/* JADX INFO: loaded from: classes3.dex */
public class PingReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        zy.m19300t(intent.getPackage() + " is the package name");
        if (XMPushService.m21511e()) {
            return;
        }
        if (!dd.f73560cdj.equals(intent.getAction())) {
            zy.kja0("cancel the old ping timer");
            oki.m21367k();
        } else if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
            zy.m19300t("Ping XMChannelService on timer");
            try {
                Intent intent2 = new Intent(context, (Class<?>) XMPushService.class);
                intent2.putExtra("time_stamp", System.currentTimeMillis());
                intent2.setAction("com.xiaomi.push.timer");
                C5922k.zurt(context).oc(intent2);
            } catch (Exception e2) {
                zy.t8r(e2);
            }
        }
    }
}
