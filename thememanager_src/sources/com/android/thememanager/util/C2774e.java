package com.android.thememanager.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.util.e */
/* JADX INFO: compiled from: KeyDispatchHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2774e extends BroadcastReceiver {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f61230f7l8 = "homekey";

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    public static final String f16405g = "reason";

    /* JADX INFO: renamed from: n */
    public static final long f16406n = 150;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final String f16407q = "KeyDispatchHelper";

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    public static final String f16408y = "recentapps";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    public static final k f61231zy = new k(null);

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final vyq f16409k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private Map<String, Long> f61232toq = new LinkedHashMap();

    /* JADX INFO: renamed from: com.android.thememanager.util.e$k */
    /* JADX INFO: compiled from: KeyDispatchHelper.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }
    }

    public C2774e(@InterfaceC7395n vyq vyqVar) {
        this.f16409k = vyqVar;
    }

    /* JADX INFO: renamed from: k */
    public final void m9705k(@InterfaceC7396q Context applicationContext) {
        kotlin.jvm.internal.d2ok.m23075h(applicationContext, "applicationContext");
        applicationContext.registerReceiver(this, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@InterfaceC7395n Context context, @InterfaceC7395n Intent intent) {
        vyq vyqVar;
        if (!TextUtils.equals("android.intent.action.CLOSE_SYSTEM_DIALOGS", intent != null ? intent.getAction() : null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("incorrect action: ");
            sb.append(intent != null ? intent.getAction() : null);
            Log.w(f16407q, sb.toString());
            return;
        }
        String stringExtra = intent != null ? intent.getStringExtra("reason") : null;
        Long l2 = this.f61232toq.get(stringExtra);
        if (System.currentTimeMillis() - (l2 != null ? l2.longValue() : 0L) < 150) {
            return;
        }
        if (stringExtra != null) {
            this.f61232toq.put(stringExtra, Long.valueOf(System.currentTimeMillis()));
        }
        Log.i(f16407q, "reason: " + stringExtra);
        if (kotlin.jvm.internal.d2ok.f7l8(stringExtra, f61230f7l8)) {
            vyq vyqVar2 = this.f16409k;
            if (vyqVar2 != null) {
                vyqVar2.mo6409k(3);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.d2ok.f7l8(stringExtra, f16408y) || (vyqVar = this.f16409k) == null) {
            return;
        }
        vyqVar.mo6409k(82);
    }

    public final void toq(@InterfaceC7396q Context applicationContext) {
        kotlin.jvm.internal.d2ok.m23075h(applicationContext, "applicationContext");
        applicationContext.unregisterReceiver(this);
    }
}
