package com.market.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.market.sdk.IMarketService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: RemoteMethodInvoker.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ni7<T> extends com.market.sdk.compat.toq<T> implements ServiceConnection {

    /* JADX INFO: renamed from: s */
    private static ExecutorService f28102s = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: y */
    private static final String f28103y = "RemoteMethodInvoker";

    /* JADX INFO: renamed from: q */
    private final String f28106q = "com.xiaomi.market.data.MarketService";

    /* JADX INFO: renamed from: n */
    private T f28105n = null;

    /* JADX INFO: renamed from: g */
    private Context f28104g = MarketManager.m17271y();

    /* JADX INFO: renamed from: com.market.sdk.ni7$k */
    /* JADX INFO: compiled from: RemoteMethodInvoker.java */
    class RunnableC4982k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ IBinder f28107k;

        RunnableC4982k(IBinder iBinder) {
            this.f28107k = iBinder;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context context;
            IMarketService iMarketServiceAsInterface = IMarketService.Stub.asInterface(this.f28107k);
            ni7.this.f28105n = null;
            try {
                try {
                    try {
                        ni7 ni7Var = ni7.this;
                        ni7Var.f28105n = ni7Var.mo17245g(iMarketServiceAsInterface);
                        context = ni7.this.f28104g;
                    } catch (RemoteException e2) {
                        Log.e(ni7.f28103y, "error while invoking market service methods", e2);
                        context = ni7.this.f28104g;
                    }
                    context.unbindService(ni7.this);
                } catch (Throwable th) {
                    try {
                        ni7.this.f28104g.unbindService(ni7.this);
                    } catch (Exception unused) {
                    }
                    throw th;
                }
            } catch (Exception unused2) {
            }
            ni7 ni7Var2 = ni7.this;
            ni7Var2.set(ni7Var2.f28105n);
        }
    }

    /* JADX INFO: compiled from: RemoteMethodInvoker.java */
    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(MarketManager.f27965p, "com.xiaomi.market.data.MarketService"));
            ni7.this.f28104g.bindService(intent, ni7.this, 1);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract T mo17245g(IMarketService iMarketService) throws RemoteException;

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f28102s.execute(new RunnableC4982k(iBinder));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    /* JADX INFO: renamed from: p */
    public void m17336p() {
        f28102s.execute(new toq());
    }

    /* JADX INFO: renamed from: s */
    public void m17337s() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(MarketManager.f27965p, "com.xiaomi.market.data.MarketService"));
        this.f28104g.bindService(intent, this, 1);
    }

    /* JADX INFO: renamed from: y */
    public T m17338y() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(MarketManager.f27965p, "com.xiaomi.market.data.MarketService"));
        if (this.f28104g.bindService(intent, this, 1)) {
            return get();
        }
        Log.e(f28103y, "Can not find MarketService");
        return null;
    }
}
