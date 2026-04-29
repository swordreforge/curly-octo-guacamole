package com.xiaomi.mipush.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.exoplayer2.yqrt;
import com.xiaomi.mipush.sdk.MessageHandleService;
import com.xiaomi.push.e5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PushMessageReceiver extends BroadcastReceiver {
    public void onCommandResult(Context context, MiPushCommandMessage miPushCommandMessage) {
    }

    public void onNotificationMessageArrived(Context context, MiPushMessage miPushMessage) {
    }

    public void onNotificationMessageClicked(Context context, MiPushMessage miPushMessage) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            com.xiaomi.channel.commonutils.logger.zy.a9("[CRcv] receive a msg broadcast: " + intent.getAction());
        }
        MessageHandleService.addJob(context.getApplicationContext(), new MessageHandleService.C5637k(intent, this));
        try {
            int intExtra = intent.getIntExtra("eventMessageType", -1);
            if (intExtra == 2000) {
                e5.m20763k(context.getApplicationContext()).m20767q(context.getPackageName(), intent, 2003, null);
            } else if (intExtra == 6000) {
                e5.m20763k(context.getApplicationContext()).m20767q(context.getPackageName(), intent, yqrt.ERROR_CODE_DRM_DISALLOWED_OPERATION, null);
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.jk("meet error in PushMessageReceiver. " + e2);
        }
    }

    @Deprecated
    public void onReceiveMessage(Context context, MiPushMessage miPushMessage) {
    }

    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
    }

    public void onReceiveRegisterResult(Context context, MiPushCommandMessage miPushCommandMessage) {
    }

    public void onRequirePermissions(Context context, String[] strArr) {
    }
}
