package com.xiaomi.push.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
class y2 extends Handler {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ XMPushService f33935k;

    y2(XMPushService xMPushService) {
        this.f33935k = xMPushService;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message != null) {
            try {
                int i2 = message.what;
                if (i2 == 17) {
                    Object obj = message.obj;
                    if (obj != null) {
                        this.f33935k.onStart((Intent) obj, 1);
                    }
                } else if (i2 == 18) {
                    Message messageObtain = Message.obtain((Handler) null, 0);
                    messageObtain.what = 18;
                    Bundle bundle = new Bundle();
                    bundle.putString("xmsf_region", C5926m.m21688k(this.f33935k.getApplicationContext()).toq());
                    messageObtain.setData(bundle);
                    message.replyTo.send(messageObtain);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
