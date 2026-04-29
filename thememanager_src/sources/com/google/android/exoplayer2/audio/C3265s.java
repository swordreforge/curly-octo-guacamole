package com.google.android.exoplayer2.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.util.C3844k;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.s */
/* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3265s {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f63500f7l8;

    /* JADX INFO: renamed from: g */
    @zy.dd
    C3270y f19449g;

    /* JADX INFO: renamed from: k */
    private final Context f19450k;

    /* JADX INFO: renamed from: n */
    @zy.dd
    private final toq f19451n;

    /* JADX INFO: renamed from: q */
    @zy.dd
    private final BroadcastReceiver f19452q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final q f63501toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Handler f63502zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.s$q */
    /* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
    public interface q {
        /* JADX INFO: renamed from: k */
        void m11511k(C3270y c3270y);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.s$toq */
    /* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
    private final class toq extends ContentObserver {

        /* JADX INFO: renamed from: k */
        private final ContentResolver f19453k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Uri f63503toq;

        public toq(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f19453k = contentResolver;
            this.f63503toq = uri;
        }

        /* JADX INFO: renamed from: k */
        public void m11512k() {
            this.f19453k.registerContentObserver(this.f63503toq, false, this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            C3265s c3265s = C3265s.this;
            c3265s.zy(C3270y.zy(c3265s.f19450k));
        }

        public void toq() {
            this.f19453k.unregisterContentObserver(this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.s$zy */
    /* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
    private final class zy extends BroadcastReceiver {
        private zy() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            C3265s.this.zy(C3270y.m11538q(context, intent));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3265s(Context context, q qVar) {
        Context applicationContext = context.getApplicationContext();
        this.f19450k = applicationContext;
        this.f63501toq = (q) C3844k.f7l8(qVar);
        Handler handlerWvg = com.google.android.exoplayer2.util.lrht.wvg();
        this.f63502zy = handlerWvg;
        this.f19452q = com.google.android.exoplayer2.util.lrht.f23230k >= 21 ? new zy() : null;
        Uri uriM11537n = C3270y.m11537n();
        this.f19451n = uriM11537n != null ? new toq(handlerWvg, applicationContext.getContentResolver(), uriM11537n) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zy(C3270y c3270y) {
        if (!this.f63500f7l8 || c3270y.equals(this.f19449g)) {
            return;
        }
        this.f19449g = c3270y;
        this.f63501toq.m11511k(c3270y);
    }

    /* JADX INFO: renamed from: n */
    public void m11509n() {
        if (this.f63500f7l8) {
            this.f19449g = null;
            BroadcastReceiver broadcastReceiver = this.f19452q;
            if (broadcastReceiver != null) {
                this.f19450k.unregisterReceiver(broadcastReceiver);
            }
            toq toqVar = this.f19451n;
            if (toqVar != null) {
                toqVar.toq();
            }
            this.f63500f7l8 = false;
        }
    }

    /* JADX INFO: renamed from: q */
    public C3270y m11510q() {
        if (this.f63500f7l8) {
            return (C3270y) C3844k.f7l8(this.f19449g);
        }
        this.f63500f7l8 = true;
        toq toqVar = this.f19451n;
        if (toqVar != null) {
            toqVar.m11512k();
        }
        Intent intentRegisterReceiver = null;
        if (this.f19452q != null) {
            intentRegisterReceiver = this.f19450k.registerReceiver(this.f19452q, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f63502zy);
        }
        C3270y c3270yM11538q = C3270y.m11538q(this.f19450k, intentRegisterReceiver);
        this.f19449g = c3270yM11538q;
        return c3270yM11538q;
    }
}
