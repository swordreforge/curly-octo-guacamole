package com.miui.systemAdSolution.remoteMethodInvoker;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* JADX INFO: compiled from: RemoteMethodInvoker.java */
/* JADX INFO: loaded from: classes3.dex */
class toq extends Thread {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ IBinder f29864k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ AbstractServiceConnectionC5349q f29865q;

    toq(AbstractServiceConnectionC5349q abstractServiceConnectionC5349q, IBinder iBinder) {
        this.f29865q = abstractServiceConnectionC5349q;
        this.f29864k = iBinder;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            Log.i("RemoteMethodInvoker", this.f29865q.f29860g.getCanonicalName());
            this.f29865q.f29862n = (IInterface) Class.forName(this.f29865q.f29860g.getCanonicalName() + "$Stub").getDeclaredMethod("asInterface", IBinder.class).invoke(null, this.f29864k);
            Log.i("RemoteMethodInvoker", "mService: " + this.f29865q.f29862n + ", service: " + this.f29864k);
        } catch (Exception e2) {
            Log.e("RemoteMethodInvoker", "asInterface error : ", e2);
        }
        this.f29865q.f29863q = null;
        try {
            try {
                AbstractServiceConnectionC5349q abstractServiceConnectionC5349q = this.f29865q;
                abstractServiceConnectionC5349q.f29863q = abstractServiceConnectionC5349q.mo18148p(abstractServiceConnectionC5349q.f29862n);
            } catch (Exception e3) {
                Log.e("RemoteMethodInvoker", "error while invoking service methods: ", e3);
            }
            this.f29865q.f29861k.unbindService(this.f29865q);
            AbstractServiceConnectionC5349q abstractServiceConnectionC5349q2 = this.f29865q;
            abstractServiceConnectionC5349q2.set(abstractServiceConnectionC5349q2.f29863q);
        } catch (Throwable th) {
            this.f29865q.f29861k.unbindService(this.f29865q);
            throw th;
        }
    }
}
