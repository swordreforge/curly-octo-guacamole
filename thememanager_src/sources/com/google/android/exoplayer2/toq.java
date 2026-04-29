package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
/* JADX INFO: loaded from: classes2.dex */
final class toq {

    /* JADX INFO: renamed from: k */
    private final Context f22219k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final RunnableC3702k f65998toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f65999zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.toq$k */
    /* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
    private final class RunnableC3702k extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: k */
        private final InterfaceC7965toq f22220k;

        /* JADX INFO: renamed from: q */
        private final Handler f22222q;

        public RunnableC3702k(Handler handler, InterfaceC7965toq interfaceC7965toq) {
            this.f22222q = handler;
            this.f22220k = interfaceC7965toq;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f22222q.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (toq.this.f65999zy) {
                this.f22220k.zurt();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
    public interface InterfaceC7965toq {
        void zurt();
    }

    public toq(Context context, Handler handler, InterfaceC7965toq interfaceC7965toq) {
        this.f22219k = context.getApplicationContext();
        this.f65998toq = new RunnableC3702k(handler, interfaceC7965toq);
    }

    public void toq(boolean z2) {
        if (z2 && !this.f65999zy) {
            this.f22219k.registerReceiver(this.f65998toq, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f65999zy = true;
        } else {
            if (z2 || !this.f65999zy) {
                return;
            }
            this.f22219k.unregisterReceiver(this.f65998toq);
            this.f65999zy = false;
        }
    }
}
