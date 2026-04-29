package com.miui.systemAdSolution.remoteMethodInvoker;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.miui.systemAdSolution.remoteMethodInvoker.q */
/* JADX INFO: compiled from: RemoteMethodInvoker.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractServiceConnectionC5349q<T, S extends IInterface> extends FutureTask<T> implements ServiceConnection {

    /* JADX INFO: renamed from: y */
    private static final String f29859y = "RemoteMethodInvoker";

    /* JADX INFO: renamed from: g */
    private Class<S> f29860g;

    /* JADX INFO: renamed from: k */
    private Context f29861k;

    /* JADX INFO: renamed from: n */
    private S f29862n;

    /* JADX INFO: renamed from: q */
    private T f29863q;

    public AbstractServiceConnectionC5349q(Context context, Class<S> cls) {
        super(new CallableC5348k());
        this.f29861k = context;
        this.f29860g = cls;
        Log.i(f29859y, this.f29860g.getPackage().toString() + this.f29860g);
    }

    public T ld6(Intent intent) {
        if (!this.f29861k.bindService(intent, this, 1)) {
            Log.e(f29859y, "Can not find Service");
            return null;
        }
        try {
            return get();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException unused2) {
            return null;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        new toq(this, iBinder).start();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    /* JADX INFO: renamed from: p */
    public abstract T mo18148p(S s2);

    public void qrj(Intent intent) {
        new zy(this, intent).start();
    }

    public void x2(Intent intent) {
        this.f29861k.bindService(intent, this, 1);
    }
}
