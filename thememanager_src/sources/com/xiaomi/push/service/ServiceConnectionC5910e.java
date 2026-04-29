package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: renamed from: com.xiaomi.push.service.e */
/* JADX INFO: loaded from: classes3.dex */
class ServiceConnectionC5910e implements ServiceConnection {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ C5922k f33755k;

    ServiceConnectionC5910e(C5922k c5922k) {
        this.f33755k = c5922k;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f33755k) {
            this.f33755k.f33825g = new Messenger(iBinder);
            this.f33755k.f33827n = false;
            Iterator it = this.f33755k.f33828q.iterator();
            while (it.hasNext()) {
                try {
                    this.f33755k.f33825g.send((Message) it.next());
                } catch (RemoteException e2) {
                    com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
                }
            }
            this.f33755k.f33828q.clear();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f33755k.f33825g = null;
        this.f33755k.f33827n = false;
    }
}
