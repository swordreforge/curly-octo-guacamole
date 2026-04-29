package com.miui.msa.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.miui.systemAdSolution.splashAd.ISystemSplashAdService;

/* JADX INFO: renamed from: com.miui.msa.api.k */
/* JADX INFO: compiled from: RemoteSystemSplashAdService.java */
/* JADX INFO: loaded from: classes3.dex */
class ServiceConnectionC5310k implements ServiceConnection {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ toq f29710k;

    ServiceConnectionC5310k(toq toqVar) {
        this.f29710k = toqVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.d("RemoteSplashAdService", "onServiceConnected!from startting binding service to connected,it spent " + (System.currentTimeMillis() - toq.f29740p) + "ms!");
        try {
            this.f29710k.f72464zy = ISystemSplashAdService.Stub.asInterface(iBinder);
            this.f29710k.f29745q = false;
        } catch (Exception e2) {
            Log.e("RemoteSplashAdService", "onServiceConnected", e2);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Log.d("RemoteSplashAdService", "onServiceDisconnected");
        this.f29710k.f72464zy = null;
        this.f29710k.f29745q = true;
    }
}
