package com.xiaomi.accountsdk.futureservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: ServerServiceConnector.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zy<IServiceType, ServerDataType, ClientDataType> implements ServiceConnection {

    /* JADX INFO: renamed from: h */
    private static final ExecutorService f30816h = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: k */
    private final String f30818k;

    /* JADX INFO: renamed from: p */
    private volatile AbstractC5505k<ServerDataType, ClientDataType> f30820p;

    /* JADX INFO: renamed from: q */
    private final String f30821q;

    /* JADX INFO: renamed from: s */
    private IServiceType f30822s;

    /* JADX INFO: renamed from: y */
    private Context f30823y;

    /* JADX INFO: renamed from: n */
    private final AtomicBoolean f30819n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    private final AtomicBoolean f30817g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.futureservice.zy$k */
    /* JADX INFO: compiled from: ServerServiceConnector.java */
    class RunnableC5508k implements Runnable {
        RunnableC5508k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                zy.this.f7l8();
            } finally {
                zy.this.m18842s();
            }
        }
    }

    protected zy(Context context, String str, String str2, AbstractC5505k<ServerDataType, ClientDataType> abstractC5505k) {
        this.f30823y = context.getApplicationContext();
        this.f30818k = str;
        this.f30821q = str2;
        this.f30820p = abstractC5505k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f7l8() {
        try {
            ServerDataType serverdatatypeMo18841q = mo18841q();
            if (this.f30820p != null) {
                this.f30820p.m18835y(serverdatatypeMo18841q);
            }
        } catch (Throwable th) {
            if (this.f30820p != null) {
                this.f30820p.m18834s(th);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m18838g() {
        this.f30822s = null;
        this.f30823y = null;
        this.f30820p = null;
    }

    /* JADX INFO: renamed from: n */
    static boolean m18840n(AtomicBoolean atomicBoolean) {
        return atomicBoolean.compareAndSet(false, true);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f30822s = zy(iBinder);
        f30816h.execute(new RunnableC5508k());
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        m18838g();
    }

    /* JADX INFO: renamed from: q */
    protected abstract ServerDataType mo18841q() throws RemoteException;

    /* JADX INFO: renamed from: s */
    final void m18842s() {
        if (m18840n(this.f30817g)) {
            Context context = this.f30823y;
            if (context != null) {
                context.unbindService(this);
            }
            m18838g();
        }
    }

    public final boolean toq() {
        if (!m18840n(this.f30819n)) {
            throw new IllegalStateException("should only bind for one time");
        }
        Intent intent = new Intent();
        intent.setAction(this.f30818k);
        intent.setPackage(this.f30821q);
        boolean zBindService = this.f30823y.bindService(intent, this, 1);
        if (!zBindService) {
            this.f30820p.m18834s(new RemoteException("failed to bind to service"));
            m18842s();
        }
        return zBindService;
    }

    /* JADX INFO: renamed from: y */
    protected final IServiceType m18843y() {
        return this.f30822s;
    }

    protected abstract IServiceType zy(IBinder iBinder);
}
