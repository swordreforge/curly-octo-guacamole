package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: SystemClock.java */
/* JADX INFO: loaded from: classes2.dex */
public class dd implements InterfaceC3850n {
    protected dd() {
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC3850n
    /* JADX INFO: renamed from: k */
    public long mo13573k() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC3850n
    /* JADX INFO: renamed from: n */
    public void mo13574n() {
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC3850n
    /* JADX INFO: renamed from: q */
    public long mo13575q() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC3850n
    public long toq() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC3850n
    public ki zy(Looper looper, @zy.dd Handler.Callback callback) {
        return new x9kr(new Handler(looper, callback));
    }
}
