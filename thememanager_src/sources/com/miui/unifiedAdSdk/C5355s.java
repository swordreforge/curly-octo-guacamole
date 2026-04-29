package com.miui.unifiedAdSdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: renamed from: com.miui.unifiedAdSdk.s */
/* JADX INFO: compiled from: UpdateBroadCast.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5355s extends BroadcastReceiver {

    /* JADX INFO: renamed from: k */
    static final String f29889k = "miui.intent.action.ad.UNIFIED_AD_UPDATING";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72518toq = "key_tag_id";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && f29889k.equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra(f72518toq);
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            f7l8.ki(context).cdj(stringExtra);
            Log.i(f7l8.f72510f7l8, "receiver the update broadcast for tagid[" + stringExtra + "]");
        }
    }
}
