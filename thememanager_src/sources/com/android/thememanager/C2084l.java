package com.android.thememanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.thememanager.util.uc;

/* JADX INFO: renamed from: com.android.thememanager.l */
/* JADX INFO: compiled from: WallpaperReceiver.java */
/* JADX INFO: loaded from: classes.dex */
public class C2084l extends BroadcastReceiver {

    /* JADX INFO: renamed from: k */
    private static final String f12319k = "miui.intent.action.SET_LOCK_WALLPAPER";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f60333toq = "lockWallpaperPath";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (f12319k.equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra(f60333toq);
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            uc.ld6(context, stringExtra, null);
        }
    }
}
