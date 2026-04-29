package com.android.thememanager.basemodule.resource;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import yz.C7794k;

/* JADX INFO: compiled from: PriorityStorageBroadcastReceiver.java */
/* JADX INFO: loaded from: classes.dex */
public class zy extends BroadcastReceiver {

    /* JADX INFO: renamed from: k */
    private static final String f10248k = "PriorityStorageBR";

    /* JADX INFO: renamed from: k */
    public static boolean m6979k() {
        Context qVar = bf2.toq.toq();
        return qVar.getPackageManager().getComponentEnabledSetting(new ComponentName(qVar, (Class<?>) zy.class)) == 1;
    }

    public static void toq(boolean enabled) {
        if (!C1796y.m6977s()) {
            C7794k.m28195n(f10248k, "Device DOES NOT supprt plug-in sdcard storage");
            return;
        }
        C7794k.m28195n(f10248k, "Set priority storage to plugin sdcard: " + enabled);
        Context qVar = bf2.toq.toq();
        qVar.getPackageManager().setComponentEnabledSetting(new ComponentName(qVar, (Class<?>) zy.class), enabled ? 1 : 2, 1);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
    }
}
