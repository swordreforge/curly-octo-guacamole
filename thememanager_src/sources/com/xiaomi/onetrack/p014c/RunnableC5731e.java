package com.xiaomi.onetrack.p014c;

import android.content.Intent;
import com.xiaomi.onetrack.p009a.p012c.C5682b;
import com.xiaomi.onetrack.util.C5804p;

/* JADX INFO: renamed from: com.xiaomi.onetrack.c.e */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5731e implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Intent f32008a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5730d f32009b;

    RunnableC5731e(C5730d c5730d, Intent intent) {
        this.f32009b = c5730d;
        this.f32008a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        String action = this.f32008a.getAction();
        if (action.equals("android.intent.action.SCREEN_OFF") || action.equals("android.intent.action.SCREEN_ON")) {
            C5804p.m20342a("EventManager", "screen on/off");
            C5745s.m19984a().m19990a(action.equals("android.intent.action.SCREEN_ON") ? 0 : 2, false);
            C5682b.m19681a().m19683b();
        }
    }
}
