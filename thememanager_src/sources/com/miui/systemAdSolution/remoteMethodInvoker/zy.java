package com.miui.systemAdSolution.remoteMethodInvoker;

import android.content.Intent;
import android.util.Log;

/* JADX INFO: compiled from: RemoteMethodInvoker.java */
/* JADX INFO: loaded from: classes3.dex */
class zy extends Thread {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Intent f29866k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ AbstractServiceConnectionC5349q f29867q;

    zy(AbstractServiceConnectionC5349q abstractServiceConnectionC5349q, Intent intent) {
        this.f29867q = abstractServiceConnectionC5349q;
        this.f29866k = intent;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            this.f29867q.f29861k.bindService(this.f29866k, this.f29867q, 1);
        } catch (Exception e2) {
            Log.e("RemoteMethodInvoker", "invokeInNewThread: ", e2);
        }
    }
}
