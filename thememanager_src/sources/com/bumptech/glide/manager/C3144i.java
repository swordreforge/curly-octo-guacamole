package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import com.bumptech.glide.manager.zy;
import com.bumptech.glide.util.C3209y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import zy.hyr;
import zy.lvui;
import zy.o1t;
import zy.yz;

/* JADX INFO: renamed from: com.bumptech.glide.manager.i */
/* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3144i {

    /* JADX INFO: renamed from: n */
    private static final String f18878n = "ConnectivityMonitor";

    /* JADX INFO: renamed from: q */
    private static volatile C3144i f18879q;

    /* JADX INFO: renamed from: k */
    private final zy f18880k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @o1t("this")
    final Set<zy.InterfaceC3152k> f62980toq = new HashSet();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @o1t("this")
    private boolean f62981zy;

    /* JADX INFO: renamed from: com.bumptech.glide.manager.i$k */
    /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
    class k implements C3209y.toq<ConnectivityManager> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f18881k;

        k(Context context) {
            this.f18881k = context;
        }

        @Override // com.bumptech.glide.util.C3209y.toq
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f18881k.getSystemService("connectivity");
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.manager.i$n */
    /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
    private static final class n implements zy {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        static final Executor f62983f7l8 = AsyncTask.SERIAL_EXECUTOR;

        /* JADX INFO: renamed from: g */
        final BroadcastReceiver f18882g = new k();

        /* JADX INFO: renamed from: k */
        final Context f18883k;

        /* JADX INFO: renamed from: n */
        volatile boolean f18884n;

        /* JADX INFO: renamed from: q */
        volatile boolean f18885q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final zy.InterfaceC3152k f62984toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final C3209y.toq<ConnectivityManager> f62985zy;

        /* JADX INFO: renamed from: com.bumptech.glide.manager.i$n$k */
        /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
        class k extends BroadcastReceiver {
            k() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(@lvui Context context, Intent intent) {
                n.this.m11099n();
            }
        }

        /* JADX INFO: renamed from: com.bumptech.glide.manager.i$n$n, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
        class RunnableC7948n implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ boolean f18887k;

            RunnableC7948n(boolean z2) {
                this.f18887k = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                n.this.f62984toq.mo10627k(this.f18887k);
            }
        }

        /* JADX INFO: renamed from: com.bumptech.glide.manager.i$n$q */
        /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
        class q implements Runnable {
            q() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z2 = n.this.f18885q;
                n nVar = n.this;
                nVar.f18885q = nVar.zy();
                if (z2 != n.this.f18885q) {
                    if (Log.isLoggable(C3144i.f18878n, 3)) {
                        Log.d(C3144i.f18878n, "connectivity changed, isConnected: " + n.this.f18885q);
                    }
                    n nVar2 = n.this;
                    nVar2.m11100q(nVar2.f18885q);
                }
            }
        }

        /* JADX INFO: renamed from: com.bumptech.glide.manager.i$n$toq */
        /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
        class toq implements Runnable {
            toq() {
            }

            @Override // java.lang.Runnable
            public void run() {
                n nVar = n.this;
                nVar.f18885q = nVar.zy();
                try {
                    n nVar2 = n.this;
                    nVar2.f18883k.registerReceiver(nVar2.f18882g, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    n.this.f18884n = true;
                } catch (SecurityException e2) {
                    if (Log.isLoggable(C3144i.f18878n, 5)) {
                        Log.w(C3144i.f18878n, "Failed to register", e2);
                    }
                    n.this.f18884n = false;
                }
            }
        }

        /* JADX INFO: renamed from: com.bumptech.glide.manager.i$n$zy */
        /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
        class zy implements Runnable {
            zy() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (n.this.f18884n) {
                    n.this.f18884n = false;
                    n nVar = n.this;
                    nVar.f18883k.unregisterReceiver(nVar.f18882g);
                }
            }
        }

        n(Context context, C3209y.toq<ConnectivityManager> toqVar, zy.InterfaceC3152k interfaceC3152k) {
            this.f18883k = context.getApplicationContext();
            this.f62985zy = toqVar;
            this.f62984toq = interfaceC3152k;
        }

        @Override // com.bumptech.glide.manager.C3144i.zy
        /* JADX INFO: renamed from: k */
        public void mo11098k() {
            f62983f7l8.execute(new zy());
        }

        /* JADX INFO: renamed from: n */
        void m11099n() {
            f62983f7l8.execute(new q());
        }

        /* JADX INFO: renamed from: q */
        void m11100q(boolean z2) {
            com.bumptech.glide.util.kja0.fu4(new RunnableC7948n(z2));
        }

        @Override // com.bumptech.glide.manager.C3144i.zy
        public boolean toq() {
            f62983f7l8.execute(new toq());
            return true;
        }

        @SuppressLint({"MissingPermission"})
        boolean zy() {
            try {
                NetworkInfo activeNetworkInfo = this.f62985zy.get().getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e2) {
                if (Log.isLoggable(C3144i.f18878n, 5)) {
                    Log.w(C3144i.f18878n, "Failed to determine connectivity status when connectivity changed", e2);
                }
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.manager.i$q */
    /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
    @hyr(24)
    private static final class q implements zy {

        /* JADX INFO: renamed from: k */
        boolean f18892k;

        /* JADX INFO: renamed from: q */
        private final ConnectivityManager.NetworkCallback f18893q = new k();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final zy.InterfaceC3152k f62986toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final C3209y.toq<ConnectivityManager> f62987zy;

        /* JADX INFO: renamed from: com.bumptech.glide.manager.i$q$k */
        /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
        class k extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: com.bumptech.glide.manager.i$q$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
            class RunnableC7949k implements Runnable {

                /* JADX INFO: renamed from: k */
                final /* synthetic */ boolean f18895k;

                RunnableC7949k(boolean z2) {
                    this.f18895k = z2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    k.this.m11101k(this.f18895k);
                }
            }

            k() {
            }

            private void toq(boolean z2) {
                com.bumptech.glide.util.kja0.fu4(new RunnableC7949k(z2));
            }

            /* JADX INFO: renamed from: k */
            void m11101k(boolean z2) {
                com.bumptech.glide.util.kja0.toq();
                q qVar = q.this;
                boolean z3 = qVar.f18892k;
                qVar.f18892k = z2;
                if (z3 != z2) {
                    qVar.f62986toq.mo10627k(z2);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@lvui Network network) {
                toq(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@lvui Network network) {
                toq(false);
            }
        }

        q(C3209y.toq<ConnectivityManager> toqVar, zy.InterfaceC3152k interfaceC3152k) {
            this.f62987zy = toqVar;
            this.f62986toq = interfaceC3152k;
        }

        @Override // com.bumptech.glide.manager.C3144i.zy
        /* JADX INFO: renamed from: k */
        public void mo11098k() {
            this.f62987zy.get().unregisterNetworkCallback(this.f18893q);
        }

        @Override // com.bumptech.glide.manager.C3144i.zy
        @SuppressLint({"MissingPermission"})
        public boolean toq() {
            this.f18892k = this.f62987zy.get().getActiveNetwork() != null;
            try {
                this.f62987zy.get().registerDefaultNetworkCallback(this.f18893q);
                return true;
            } catch (RuntimeException e2) {
                if (Log.isLoggable(C3144i.f18878n, 5)) {
                    Log.w(C3144i.f18878n, "Failed to register callback", e2);
                }
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.manager.i$toq */
    /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
    class toq implements zy.InterfaceC3152k {
        toq() {
        }

        @Override // com.bumptech.glide.manager.zy.InterfaceC3152k
        /* JADX INFO: renamed from: k */
        public void mo10627k(boolean z2) {
            ArrayList arrayList;
            com.bumptech.glide.util.kja0.toq();
            synchronized (C3144i.this) {
                arrayList = new ArrayList(C3144i.this.f62980toq);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((zy.InterfaceC3152k) it.next()).mo10627k(z2);
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.manager.i$zy */
    /* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
    private interface zy {
        /* JADX INFO: renamed from: k */
        void mo11098k();

        boolean toq();
    }

    private C3144i(@lvui Context context) {
        this.f18880k = new q(C3209y.m11265k(new k(context)), new toq());
    }

    /* JADX INFO: renamed from: k */
    static C3144i m11093k(@lvui Context context) {
        if (f18879q == null) {
            synchronized (C3144i.class) {
                if (f18879q == null) {
                    f18879q = new C3144i(context.getApplicationContext());
                }
            }
        }
        return f18879q;
    }

    @yz
    /* JADX INFO: renamed from: n */
    static void m11094n() {
        f18879q = null;
    }

    @o1t("this")
    private void toq() {
        if (this.f62981zy || this.f62980toq.isEmpty()) {
            return;
        }
        this.f62981zy = this.f18880k.toq();
    }

    @o1t("this")
    private void zy() {
        if (this.f62981zy && this.f62980toq.isEmpty()) {
            this.f18880k.mo11098k();
            this.f62981zy = false;
        }
    }

    /* JADX INFO: renamed from: g */
    synchronized void m11095g(zy.InterfaceC3152k interfaceC3152k) {
        this.f62980toq.remove(interfaceC3152k);
        zy();
    }

    /* JADX INFO: renamed from: q */
    synchronized void m11096q(zy.InterfaceC3152k interfaceC3152k) {
        this.f62980toq.add(interfaceC3152k);
        toq();
    }
}
