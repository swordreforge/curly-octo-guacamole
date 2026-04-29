package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.util.C3844k;

/* JADX INFO: compiled from: StreamVolumeManager.java */
/* JADX INFO: loaded from: classes2.dex */
final class wx16 {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f67249ld6 = 1;

    /* JADX INFO: renamed from: p */
    private static final String f23638p = "android.media.VOLUME_CHANGED_ACTION";

    /* JADX INFO: renamed from: s */
    private static final String f23639s = "StreamVolumeManager";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f67250f7l8;

    /* JADX INFO: renamed from: g */
    private int f23640g;

    /* JADX INFO: renamed from: k */
    private final Context f23641k;

    /* JADX INFO: renamed from: n */
    @zy.dd
    private zy f23642n;

    /* JADX INFO: renamed from: q */
    private final AudioManager f23643q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Handler f67251toq;

    /* JADX INFO: renamed from: y */
    private boolean f23644y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final toq f67252zy;

    /* JADX INFO: compiled from: StreamVolumeManager.java */
    public interface toq {
        void d3(int i2, boolean z2);

        /* JADX INFO: renamed from: i */
        void mo12145i(int i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: StreamVolumeManager.java */
    final class zy extends BroadcastReceiver {
        private zy() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = wx16.this.f67251toq;
            final wx16 wx16Var = wx16.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.ixz
                @Override // java.lang.Runnable
                public final void run() {
                    wx16.toq(wx16Var);
                }
            });
        }
    }

    public wx16(Context context, Handler handler, toq toqVar) {
        Context applicationContext = context.getApplicationContext();
        this.f23641k = applicationContext;
        this.f67251toq = handler;
        this.f67252zy = toqVar;
        AudioManager audioManager = (AudioManager) C3844k.ld6((AudioManager) applicationContext.getSystemService(com.google.android.exoplayer2.util.wvg.f67137toq));
        this.f23643q = audioManager;
        this.f23640g = 3;
        this.f67250f7l8 = m13907y(audioManager, 3);
        this.f23644y = m13905g(audioManager, this.f23640g);
        zy zyVar = new zy();
        try {
            applicationContext.registerReceiver(zyVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f23642n = zyVar;
        } catch (RuntimeException e2) {
            com.google.android.exoplayer2.util.ni7.n7h(f23639s, "Error registering stream volume receiver", e2);
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m13905g(AudioManager audioManager, int i2) {
        return com.google.android.exoplayer2.util.lrht.f23230k >= 23 ? audioManager.isStreamMute(i2) : m13907y(audioManager, i2) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kja0() {
        int iM13907y = m13907y(this.f23643q, this.f23640g);
        boolean zM13905g = m13905g(this.f23643q, this.f23640g);
        if (this.f67250f7l8 == iM13907y && this.f23644y == zM13905g) {
            return;
        }
        this.f67250f7l8 = iM13907y;
        this.f23644y = zM13905g;
        this.f67252zy.d3(iM13907y, zM13905g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void toq(wx16 wx16Var) {
        wx16Var.kja0();
    }

    /* JADX INFO: renamed from: y */
    private static int m13907y(AudioManager audioManager, int i2) {
        try {
            return audioManager.getStreamVolume(i2);
        } catch (RuntimeException e2) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i2);
            com.google.android.exoplayer2.util.ni7.n7h(f23639s, sb.toString(), e2);
            return audioManager.getStreamMaxVolume(i2);
        }
    }

    public int f7l8() {
        return this.f67250f7l8;
    }

    public void ld6() {
        zy zyVar = this.f23642n;
        if (zyVar != null) {
            try {
                this.f23641k.unregisterReceiver(zyVar);
            } catch (RuntimeException e2) {
                com.google.android.exoplayer2.util.ni7.n7h(f23639s, "Error unregistering stream volume receiver", e2);
            }
            this.f23642n = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public int m13908n() {
        if (com.google.android.exoplayer2.util.lrht.f23230k >= 28) {
            return this.f23643q.getStreamMinVolume(this.f23640g);
        }
        return 0;
    }

    public void n7h(int i2) {
        if (i2 < m13908n() || i2 > m13910q()) {
            return;
        }
        this.f23643q.setStreamVolume(this.f23640g, i2, 1);
        kja0();
    }

    /* JADX INFO: renamed from: p */
    public boolean m13909p() {
        return this.f23644y;
    }

    /* JADX INFO: renamed from: q */
    public int m13910q() {
        return this.f23643q.getStreamMaxVolume(this.f23640g);
    }

    public void qrj(int i2) {
        if (this.f23640g == i2) {
            return;
        }
        this.f23640g = i2;
        kja0();
        this.f67252zy.mo12145i(i2);
    }

    /* JADX INFO: renamed from: s */
    public void m13911s() {
        if (this.f67250f7l8 >= m13910q()) {
            return;
        }
        this.f23643q.adjustStreamVolume(this.f23640g, 1, 1);
        kja0();
    }

    public void x2(boolean z2) {
        if (com.google.android.exoplayer2.util.lrht.f23230k >= 23) {
            this.f23643q.adjustStreamVolume(this.f23640g, z2 ? -100 : 100, 1);
        } else {
            this.f23643q.setStreamMute(this.f23640g, z2);
        }
        kja0();
    }

    public void zy() {
        if (this.f67250f7l8 <= m13908n()) {
            return;
        }
        this.f23643q.adjustStreamVolume(this.f23640g, -1, 1);
        kja0();
    }
}
