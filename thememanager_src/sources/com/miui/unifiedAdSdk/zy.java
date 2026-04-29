package com.miui.unifiedAdSdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.miui.systemAdSolution.changeSkin.IChangeSkinService;

/* JADX INFO: compiled from: RemoteUnifiedAdService.java */
/* JADX INFO: loaded from: classes3.dex */
class zy implements ServiceConnection {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ f7l8 f29891k;

    zy(f7l8 f7l8Var) {
        this.f29891k = f7l8Var;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.d(f7l8.f72510f7l8, "onServiceConnected. from startting binding service to connected,it spent " + (System.currentTimeMillis() - f7l8.f72511kja0) + "ms.");
        try {
            synchronized (this.f29891k.f72517zy) {
                this.f29891k.f72516toq = IChangeSkinService.Stub.asInterface(iBinder);
                this.f29891k.f72517zy.notifyAll();
            }
        } catch (Exception e2) {
            Log.e(f7l8.f72510f7l8, "onServiceConnected", e2);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Log.d(f7l8.f72510f7l8, "onServiceDisconnected");
        synchronized (this.f29891k.f72517zy) {
            this.f29891k.f72516toq = null;
        }
    }
}
