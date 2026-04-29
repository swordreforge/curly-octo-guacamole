package com.miui.msa.api;

import android.util.Log;
import com.miui.systemAdSolution.splashAd.IAdListener;

/* JADX INFO: renamed from: com.miui.msa.api.q */
/* JADX INFO: compiled from: SystemSplashAd.java */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5316q implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ IAdListener f29738k;

    RunnableC5316q(IAdListener iAdListener) {
        this.f29738k = iAdListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (System.currentTimeMillis() - C5315n.f29736n < 500) {
            C5315n.m18104g(this.f29738k);
        } else {
            Log.e("SystemSplashAd", "waiting for the connection of the service is timeout!giving up!");
            C5315n.m18107q(this.f29738k);
        }
    }
}
