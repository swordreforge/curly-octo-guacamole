package com.market.sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: AppActivityLifecycleTracker.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: g */
    private static final int f28176g = 2;

    /* JADX INFO: renamed from: h */
    private static final int f28177h = 6;

    /* JADX INFO: renamed from: n */
    private static final int f28178n = 1;

    /* JADX INFO: renamed from: p */
    private static final int f28179p = 5;

    /* JADX INFO: renamed from: q */
    private static final int f28180q = 0;

    /* JADX INFO: renamed from: s */
    private static final int f28181s = 4;

    /* JADX INFO: renamed from: y */
    private static final int f28182y = 3;

    /* JADX INFO: renamed from: k */
    private n7h f28183k = MarketManager.qrj().x2();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f28183k.f7l8(activity, 0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f28183k.f7l8(activity, 5);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f28183k.f7l8(activity, 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f28183k.f7l8(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f28183k.f7l8(activity, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f28183k.f7l8(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.f28183k.f7l8(activity, 4);
    }
}
