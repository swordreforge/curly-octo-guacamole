package com.google.android.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;

/* JADX INFO: compiled from: WifiLockManager.java */
/* JADX INFO: loaded from: classes2.dex */
final class lh {

    /* JADX INFO: renamed from: g */
    private static final String f20615g = "ExoPlayer:WifiLockManager";

    /* JADX INFO: renamed from: n */
    private static final String f20616n = "WifiLockManager";

    /* JADX INFO: renamed from: k */
    @zy.dd
    private final WifiManager f20617k;

    /* JADX INFO: renamed from: q */
    private boolean f20618q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.dd
    private WifiManager.WifiLock f64874toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f64875zy;

    public lh(Context context) {
        this.f20617k = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void zy() {
        WifiManager.WifiLock wifiLock = this.f64874toq;
        if (wifiLock == null) {
            return;
        }
        if (this.f64875zy && this.f20618q) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m12170k(boolean z2) {
        if (z2 && this.f64874toq == null) {
            WifiManager wifiManager = this.f20617k;
            if (wifiManager == null) {
                com.google.android.exoplayer2.util.ni7.qrj(f20616n, "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, f20615g);
                this.f64874toq = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f64875zy = z2;
        zy();
    }

    public void toq(boolean z2) {
        this.f20618q = z2;
        zy();
    }
}
