package com.xiaomi.onetrack.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.onetrack.util.C5804p;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.d */
/* JADX INFO: loaded from: classes3.dex */
class C5690d extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C5689c f31752a;

    C5690d(C5689c c5689c) {
        this.f31752a = c5689c;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            if (this.f31752a.f31744d != null) {
                String action = intent.getAction();
                if (TextUtils.isEmpty(action)) {
                    return;
                }
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    this.f31752a.f31744d.sendEmptyMessageDelayed(100, 500L);
                } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                    this.f31752a.f31744d.sendEmptyMessageDelayed(101, 500L);
                }
            }
        } catch (Throwable th) {
            C5804p.m20347b("BroadcastManager", "screenReceiver throwable: " + th.getMessage());
        }
    }
}
