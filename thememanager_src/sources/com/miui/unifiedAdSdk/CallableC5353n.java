package com.miui.unifiedAdSdk;

import com.miui.unifiedAdSdk.f7l8;
import java.util.concurrent.Callable;
import u38j.C7683q;

/* JADX INFO: renamed from: com.miui.unifiedAdSdk.n */
/* JADX INFO: compiled from: RemoteUnifiedAdService.java */
/* JADX INFO: loaded from: classes3.dex */
class CallableC5353n implements Callable<Object> {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ f7l8.AbstractRunnableC5350k f29880k;

    CallableC5353n(f7l8.AbstractRunnableC5350k abstractRunnableC5350k) {
        this.f29880k = abstractRunnableC5350k;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        try {
            return this.f29880k.m18211q();
        } catch (Exception e2) {
            C7683q.m28055n(f7l8.f72510f7l8, "could not run sync.", e2);
            return null;
        }
    }
}
