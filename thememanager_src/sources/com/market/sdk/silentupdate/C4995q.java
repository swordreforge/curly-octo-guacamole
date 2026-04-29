package com.market.sdk.silentupdate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.market.sdk.utils.C5010k;
import zy.lvui;

/* JADX INFO: renamed from: com.market.sdk.silentupdate.q */
/* JADX INFO: compiled from: UpdateResultReceiver.java */
/* JADX INFO: loaded from: classes3.dex */
public class C4995q extends BroadcastReceiver {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final C4995q f68936zy = new C4995q();

    /* JADX INFO: renamed from: k */
    private volatile k f28141k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private volatile boolean f68937toq;

    /* JADX INFO: renamed from: com.market.sdk.silentupdate.q$k */
    /* JADX INFO: compiled from: UpdateResultReceiver.java */
    public interface k {
        void onResult(@lvui Bundle bundle);
    }

    /* JADX INFO: renamed from: k */
    public static C4995q m17375k() {
        return f68936zy;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!TextUtils.equals(context.getPackageName(), intent.getStringExtra("packageName")) || this.f28141k == null || intent.getExtras() == null) {
            return;
        }
        this.f28141k.onResult(intent.getExtras());
    }

    public void toq(k kVar) {
        this.f28141k = kVar;
        if (this.f68937toq) {
            return;
        }
        C5010k.toq().registerReceiver(this, new IntentFilter("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT"));
        this.f68937toq = true;
    }

    public void zy() {
        this.f28141k = null;
        C5010k.toq().unregisterReceiver(this);
        this.f68937toq = false;
    }
}
