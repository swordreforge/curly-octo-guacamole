package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class lvui implements ServiceConnection {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ d3 f31401k;

    lvui(d3 d3Var) {
        this.f31401k = d3Var;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f31401k) {
            this.f31401k.f31332q = new Messenger(iBinder);
            this.f31401k.f73130f7l8 = false;
            Iterator it = this.f31401k.f31328g.iterator();
            while (it.hasNext()) {
                try {
                    this.f31401k.f31332q.send((Message) it.next());
                } catch (RemoteException e2) {
                    com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
                }
            }
            this.f31401k.f31328g.clear();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f31401k.f31332q = null;
        this.f31401k.f73130f7l8 = false;
    }
}
