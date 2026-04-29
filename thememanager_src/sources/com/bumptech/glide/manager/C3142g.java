package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.core.content.C0498q;
import com.bumptech.glide.manager.zy;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.manager.g */
/* JADX INFO: compiled from: DefaultConnectivityMonitorFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3142g implements InterfaceC3149q {

    /* JADX INFO: renamed from: k */
    private static final String f18869k = "ConnectivityMonitor";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f62979toq = "android.permission.ACCESS_NETWORK_STATE";

    @Override // com.bumptech.glide.manager.InterfaceC3149q
    @lvui
    /* JADX INFO: renamed from: k */
    public zy mo11085k(@lvui Context context, @lvui zy.InterfaceC3152k interfaceC3152k) {
        boolean z2 = C0498q.m2255k(context, f62979toq) == 0;
        if (Log.isLoggable(f18869k, 3)) {
            Log.d(f18869k, z2 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z2 ? new C3146n(context, interfaceC3152k) : new kja0();
    }
}
