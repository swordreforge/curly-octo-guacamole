package com.xiaomi.onetrack.api;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.DeviceUtil;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.s */
/* JADX INFO: loaded from: classes3.dex */
class C5705s implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C5699m f31874a;

    /* JADX INFO: renamed from: b */
    private int f31875b = 0;

    /* JADX INFO: renamed from: c */
    private int f31876c;

    /* JADX INFO: renamed from: d */
    private long f31877d;

    /* JADX INFO: renamed from: e */
    private boolean f31878e;

    /* JADX INFO: renamed from: f */
    private boolean f31879f;

    C5705s(C5699m c5699m) {
        this.f31874a = c5699m;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f31874a.m19813a(activity.getClass().getName(), this.f31876c == System.identityHashCode(activity) ? SystemClock.elapsedRealtime() - this.f31877d : 0L);
        if (C5804p.f32410a) {
            C5804p.m20342a("OneTrackImp", "onActivityPaused:" + activity.getLocalClassName());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f31874a.m19826e(this.f31879f);
        this.f31876c = System.identityHashCode(activity);
        this.f31877d = SystemClock.elapsedRealtime();
        this.f31874a.m19814a(activity.getClass().getName(), this.f31878e);
        if (C5804p.f32410a) {
            C5804p.m20342a("OneTrackImp", "onActivityResumed:" + activity.getLocalClassName() + " isAppStart:" + this.f31878e);
        }
        this.f31878e = false;
        this.f31874a.m19832h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (this.f31875b == 0) {
            this.f31874a.f31851b.mo19704a(1);
            this.f31878e = true;
            this.f31879f = false;
            DeviceUtil.m20114a();
        } else {
            this.f31878e = false;
        }
        this.f31875b++;
        C5804p.m20342a("OneTrackImp", "onActivityStarted: " + activity.getLocalClassName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i2 = this.f31875b - 1;
        this.f31875b = i2;
        if (i2 == 0) {
            this.f31874a.f31851b.mo19704a(2);
            this.f31874a.m19840n();
            this.f31879f = true;
            this.f31878e = false;
        } else {
            this.f31879f = false;
        }
        this.f31874a.m19826e(this.f31879f);
        C5804p.m20342a("OneTrackImp", "onActivityStopped: " + activity.getLocalClassName());
    }
}
