package com.xiaomi.onetrack.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import com.xiaomi.onetrack.util.C5804p;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.e */
/* JADX INFO: loaded from: classes3.dex */
class C5691e extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C5689c f31753a;

    C5691e(C5689c c5689c) {
        this.f31753a = c5689c;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f31753a.f31744d != null) {
            Intent intent2 = new Intent();
            intent2.putExtras(intent);
            Message messageObtain = Message.obtain();
            messageObtain.what = 10;
            messageObtain.obj = intent2;
            this.f31753a.f31744d.sendMessage(messageObtain);
            C5804p.m20342a("BroadcastManager", "netReceiver");
        }
    }
}
