package com.miui.msa.api.landingPage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.miui.systemAdSolution.landingPageV2.service.ILandingPageServiceV2;

/* JADX INFO: renamed from: com.miui.msa.api.landingPage.n */
/* JADX INFO: compiled from: RemoteProxy.java */
/* JADX INFO: loaded from: classes3.dex */
class ServiceConnectionC5313n implements ServiceConnection {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ C5311g f29717k;

    ServiceConnectionC5313n(C5311g c5311g) {
        this.f29717k = c5311g;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            synchronized (this.f29717k.f72439zy) {
                this.f29717k.f72438toq = ILandingPageServiceV2.Stub.asInterface(iBinder);
                this.f29717k.f72439zy.notifyAll();
            }
        } catch (Exception e2) {
            Log.e(C5311g.f29712n, "onServiceConnected", e2);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Log.d(C5311g.f29712n, "onServiceDisconnected");
        synchronized (this.f29717k.f72439zy) {
            this.f29717k.f72438toq = null;
        }
    }
}
