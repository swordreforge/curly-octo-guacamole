package com.xiaomi.analytics.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.xiaomi.analytics.internal.util.C5609k;

/* JADX INFO: compiled from: Debugger.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f73055f7l8 = "com.xiaomi.analytics.intent.STAGING_ON";

    /* JADX INFO: renamed from: g */
    private static final String f31190g = "com.xiaomi.analytics.intent.DEBUG_OFF";

    /* JADX INFO: renamed from: n */
    private static final String f31191n = "com.xiaomi.analytics.intent.DEBUG_ON";

    /* JADX INFO: renamed from: p */
    public static boolean f31192p = false;

    /* JADX INFO: renamed from: q */
    private static final String f31193q = "Debugger";

    /* JADX INFO: renamed from: s */
    private static volatile toq f31194s = null;

    /* JADX INFO: renamed from: y */
    private static final String f31195y = "com.xiaomi.analytics.intent.STAGING_OFF";

    /* JADX INFO: renamed from: k */
    private Context f31196k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private volatile boolean f73056toq = false;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private BroadcastReceiver f73057zy = new C5607k();

    /* JADX INFO: renamed from: com.xiaomi.analytics.internal.toq$k */
    /* JADX INFO: compiled from: Debugger.java */
    class C5607k extends BroadcastReceiver {
        C5607k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            Log.d(C5609k.m19240k(toq.f31193q), "action = " + action);
            if (toq.f31191n.equals(action)) {
                C5609k.f31199k = true;
                return;
            }
            if (toq.f31190g.equals(action)) {
                C5609k.f31199k = false;
            } else if (toq.f73055f7l8.equals(action)) {
                toq.f31192p = true;
            } else if (toq.f31195y.equals(action)) {
                toq.f31192p = false;
            }
        }
    }

    private toq(Context context) {
        this.f31196k = com.xiaomi.analytics.internal.util.toq.m19255k(context);
    }

    /* JADX INFO: renamed from: k */
    public static synchronized toq m19235k(Context context) {
        if (f31194s == null) {
            f31194s = new toq(context);
        }
        return f31194s;
    }

    public void toq() {
        if (this.f73056toq) {
            return;
        }
        this.f73056toq = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(f31191n);
        intentFilter.addAction(f31190g);
        intentFilter.addAction(f73055f7l8);
        intentFilter.addAction(f31195y);
        this.f31196k.registerReceiver(this.f73057zy, intentFilter);
    }

    public void zy() {
        this.f31196k.unregisterReceiver(this.f73057zy);
        this.f73056toq = false;
    }
}
