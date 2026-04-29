package com.android.thememanager.basemodule.resource;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.thememanager.basemodule.utils.vyq;
import miui.theme.ThemeFileUtils;

/* JADX INFO: loaded from: classes.dex */
public class SystemAodBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: k */
    private static final String f10164k = "com.miui.aod.AOD_CHANGED";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f57647toq = "/data/system/theme/aod";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (f10164k.equals(intent.getAction())) {
            ThemeFileUtils.remove(f57647toq);
            vyq.f7l8("aod");
        }
    }
}
