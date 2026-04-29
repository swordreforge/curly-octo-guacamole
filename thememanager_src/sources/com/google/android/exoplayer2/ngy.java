package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: compiled from: WakeLockManager.java */
/* JADX INFO: loaded from: classes2.dex */
final class ngy {

    /* JADX INFO: renamed from: g */
    private static final String f20909g = "ExoPlayer:WakeLockManager";

    /* JADX INFO: renamed from: n */
    private static final String f20910n = "WakeLockManager";

    /* JADX INFO: renamed from: k */
    @zy.dd
    private final PowerManager f20911k;

    /* JADX INFO: renamed from: q */
    private boolean f20912q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.dd
    private PowerManager.WakeLock f65013toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f65014zy;

    public ngy(Context context) {
        this.f20911k = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    private void zy() {
        PowerManager.WakeLock wakeLock = this.f65013toq;
        if (wakeLock == null) {
            return;
        }
        if (this.f65014zy && this.f20912q) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m12358k(boolean z2) {
        if (z2 && this.f65013toq == null) {
            PowerManager powerManager = this.f20911k;
            if (powerManager == null) {
                com.google.android.exoplayer2.util.ni7.qrj(f20910n, "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, f20909g);
                this.f65013toq = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f65014zy = z2;
        zy();
    }

    public void toq(boolean z2) {
        this.f20912q = z2;
        zy();
    }
}
