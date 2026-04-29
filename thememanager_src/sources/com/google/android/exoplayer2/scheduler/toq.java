package com.google.android.exoplayer2.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import zy.dd;
import zy.hyr;

/* JADX INFO: compiled from: RequirementsWatcher.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @dd
    private C3563q f65320f7l8;

    /* JADX INFO: renamed from: g */
    private int f21205g;

    /* JADX INFO: renamed from: k */
    private final Context f21206k;

    /* JADX INFO: renamed from: n */
    @dd
    private C7958toq f21207n;

    /* JADX INFO: renamed from: q */
    private final Handler f21208q = lrht.wvg();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final zy f65321toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Requirements f65322zy;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.google.android.exoplayer2.scheduler.toq$q */
    /* JADX INFO: compiled from: RequirementsWatcher.java */
    @hyr(24)
    final class C3563q extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: k */
        private boolean f21209k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f65323toq;

        private C3563q() {
        }

        /* JADX INFO: renamed from: g */
        private void m12544g() {
            toq.this.f21208q.post(new Runnable() { // from class: com.google.android.exoplayer2.scheduler.zy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21211k.m12547q();
                }
            });
        }

        /* JADX INFO: renamed from: n */
        private void m12546n() {
            toq.this.f21208q.post(new Runnable() { // from class: com.google.android.exoplayer2.scheduler.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21204k.zy();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public /* synthetic */ void m12547q() {
            if (toq.this.f65320f7l8 != null) {
                toq.this.f7l8();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void zy() {
            if (toq.this.f65320f7l8 != null) {
                toq.this.m12538n();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            m12546n();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z2) {
            if (z2) {
                return;
            }
            m12544g();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (this.f21209k && this.f65323toq == zHasCapability) {
                if (zHasCapability) {
                    m12544g();
                }
            } else {
                this.f21209k = true;
                this.f65323toq = zHasCapability;
                m12546n();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            m12546n();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.scheduler.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RequirementsWatcher.java */
    private class C7958toq extends BroadcastReceiver {
        private C7958toq() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            toq.this.m12538n();
        }
    }

    /* JADX INFO: compiled from: RequirementsWatcher.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        void mo12390k(toq toqVar, int i2);
    }

    public toq(Context context, zy zyVar, Requirements requirements) {
        this.f21206k = context.getApplicationContext();
        this.f65321toq = zyVar;
        this.f65322zy = requirements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f7l8() {
        if ((this.f21205g & 3) == 0) {
            return;
        }
        m12538n();
    }

    @hyr(24)
    private void ld6() {
        ((ConnectivityManager) C3844k.f7l8((ConnectivityManager) this.f21206k.getSystemService("connectivity"))).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) C3844k.f7l8(this.f65320f7l8));
        this.f65320f7l8 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m12538n() {
        int iM12532g = this.f65322zy.m12532g(this.f21206k);
        if (this.f21205g != iM12532g) {
            this.f21205g = iM12532g;
            this.f65321toq.mo12390k(this, iM12532g);
        }
    }

    @hyr(24)
    /* JADX INFO: renamed from: y */
    private void m12540y() {
        ConnectivityManager connectivityManager = (ConnectivityManager) C3844k.f7l8((ConnectivityManager) this.f21206k.getSystemService("connectivity"));
        C3563q c3563q = new C3563q();
        this.f65320f7l8 = c3563q;
        connectivityManager.registerDefaultNetworkCallback(c3563q);
    }

    /* JADX INFO: renamed from: g */
    public Requirements m12541g() {
        return this.f65322zy;
    }

    /* JADX INFO: renamed from: p */
    public void m12542p() {
        this.f21206k.unregisterReceiver((BroadcastReceiver) C3844k.f7l8(this.f21207n));
        this.f21207n = null;
        if (lrht.f23230k < 24 || this.f65320f7l8 == null) {
            return;
        }
        ld6();
    }

    /* JADX INFO: renamed from: s */
    public int m12543s() {
        this.f21205g = this.f65322zy.m12532g(this.f21206k);
        IntentFilter intentFilter = new IntentFilter();
        if (this.f65322zy.t8r()) {
            if (lrht.f23230k >= 24) {
                m12540y();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f65322zy.m12534y()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f65322zy.x2()) {
            if (lrht.f23230k >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if (this.f65322zy.ni7()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        C7958toq c7958toq = new C7958toq();
        this.f21207n = c7958toq;
        this.f21206k.registerReceiver(c7958toq, intentFilter, null, this.f21208q);
        return this.f21205g;
    }
}
