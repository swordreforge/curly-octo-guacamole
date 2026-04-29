package com.xiaomi.mipush.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
class ch extends BroadcastReceiver {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ NotificationClickedActivity f31326k;

    ch(NotificationClickedActivity notificationClickedActivity) {
        this.f31326k = notificationClickedActivity;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.xiaomi.channel.commonutils.logger.zy.m19302z("clicked activity finish by normal.");
        this.f31326k.finish();
    }
}
