package com.miui.maml;

import android.os.Looper;
import android.view.DisplayEventReceiver;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MamlDisplayEventReceiver extends DisplayEventReceiver {
    public MamlDisplayEventReceiver(Looper looper) {
        super(looper);
    }

    public abstract void onVsync(long j2);

    public void onVsync(long j2, long j3, int i2) {
        onVsync(j2);
    }

    public void onVsync(long j2, int i2, int i3) {
        onVsync(j2);
    }

    public void onVsync(long j2, long j3, int i2, DisplayEventReceiver.VsyncEventData vsyncEventData) {
        onVsync(j2);
    }
}
