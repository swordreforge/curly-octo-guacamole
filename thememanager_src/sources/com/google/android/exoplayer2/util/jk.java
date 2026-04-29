package com.google.android.exoplayer2.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import zy.yz;

/* JADX INFO: compiled from: NetworkTypeObserver.java */
/* JADX INFO: loaded from: classes2.dex */
public final class jk {

    /* JADX INFO: renamed from: n */
    @zy.dd
    private static jk f23199n;

    /* JADX INFO: renamed from: k */
    private final Handler f23200k = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final CopyOnWriteArrayList<WeakReference<zy>> f66993toq = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Object f66994zy = new Object();

    /* JADX INFO: renamed from: q */
    @zy.o1t("networkTypeLock")
    private int f23201q = 0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.jk$n */
    /* JADX INFO: compiled from: NetworkTypeObserver.java */
    private class C3842n extends PhoneStateListener {
        private C3842n() {
        }

        @Override // android.telephony.PhoneStateListener
        @zy.hyr(31)
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            jk.this.x2(overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(@zy.dd ServiceState serviceState) {
            String string = serviceState == null ? "" : serviceState.toString();
            jk.this.x2(string.contains("nrState=CONNECTED") || string.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.jk$q */
    /* JADX INFO: compiled from: NetworkTypeObserver.java */
    private final class C3843q extends BroadcastReceiver {
        private C3843q() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iF7l8 = jk.f7l8(context);
            int i2 = lrht.f23230k;
            if (i2 >= 29 && !toq.f23204k && iF7l8 == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) C3844k.f7l8((TelephonyManager) context.getSystemService("phone"));
                    C3842n c3842n = new C3842n();
                    if (i2 < 31) {
                        telephonyManager.listen(c3842n, 1);
                    } else {
                        telephonyManager.listen(c3842n, 1048576);
                    }
                    telephonyManager.listen(c3842n, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            jk.this.x2(iF7l8);
        }
    }

    /* JADX INFO: compiled from: NetworkTypeObserver.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        private static volatile boolean f23204k;

        private toq() {
        }

        public static void toq() {
            f23204k = true;
        }
    }

    /* JADX INFO: compiled from: NetworkTypeObserver.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        void mo13462k(int i2);
    }

    private jk(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C3843q(), intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f7l8(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i2 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i2 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return m13612n(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i2;
    }

    @yz
    public static synchronized void ld6() {
        f23199n = null;
    }

    /* JADX INFO: renamed from: n */
    private static int m13612n(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return lrht.f23230k >= 29 ? 9 : 0;
        }
    }

    /* JADX INFO: renamed from: p */
    private void m13613p() {
        for (WeakReference<zy> weakReference : this.f66993toq) {
            if (weakReference.get() == null) {
                this.f66993toq.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static synchronized jk m13614q(Context context) {
        if (f23199n == null) {
            f23199n = new jk(context);
        }
        return f23199n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x2(int i2) {
        synchronized (this.f66994zy) {
            if (this.f23201q == i2) {
                return;
            }
            this.f23201q = i2;
            for (WeakReference<zy> weakReference : this.f66993toq) {
                zy zyVar = weakReference.get();
                if (zyVar != null) {
                    zyVar.mo13462k(i2);
                } else {
                    this.f66993toq.remove(weakReference);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m13615y(zy zyVar) {
        zyVar.mo13462k(m13616g());
    }

    /* JADX INFO: renamed from: g */
    public int m13616g() {
        int i2;
        synchronized (this.f66994zy) {
            i2 = this.f23201q;
        }
        return i2;
    }

    /* JADX INFO: renamed from: s */
    public void m13617s(final zy zyVar) {
        m13613p();
        this.f66993toq.add(new WeakReference<>(zyVar));
        this.f23200k.post(new Runnable() { // from class: com.google.android.exoplayer2.util.mcp
            @Override // java.lang.Runnable
            public final void run() {
                this.f23246k.m13615y(zyVar);
            }
        });
    }
}
