package com.android.thememanager;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.android.thememanager.util.gc3c;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingDeque;
import mbx.C6812k;

/* JADX INFO: renamed from: com.android.thememanager.y */
/* JADX INFO: compiled from: BgMemoryMgr.java */
/* JADX INFO: loaded from: classes.dex */
public class C2964y implements Handler.Callback, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: g */
    private static final String f17858g = "BgMemoryMgr";

    /* JADX INFO: renamed from: s */
    private static C2964y f17859s = null;

    /* JADX INFO: renamed from: y */
    private static final int f17860y = 1;

    /* JADX INFO: renamed from: k */
    private final Handler f17861k = new Handler(Looper.getMainLooper(), this);

    /* JADX INFO: renamed from: q */
    private final LinkedBlockingDeque<WeakReference<Activity>> f17863q = new LinkedBlockingDeque<>();

    /* JADX INFO: renamed from: n */
    private WeakReference<Activity> f17862n = null;

    private C2964y() {
    }

    /* JADX INFO: renamed from: n */
    private void m10532n(Activity activity) {
        this.f17862n = new WeakReference<>(activity);
        this.f17861k.removeMessages(1);
    }

    public static C2964y toq() {
        if (f17859s == null) {
            synchronized (C2964y.class) {
                if (f17859s == null) {
                    f17859s = new C2964y();
                }
            }
        }
        return f17859s;
    }

    private boolean zy(Activity activity) {
        return C6812k.f7l8(activity);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message msg) {
        if (msg.what == 1) {
            while (this.f17863q.size() > 0) {
                WeakReference<Activity> weakReferencePollLast = this.f17863q.pollLast();
                Activity activity = weakReferencePollLast != null ? weakReferencePollLast.get() : null;
                if (gc3c.cdj(activity)) {
                    Log.i(f17858g, "BgMemory, finish page: " + activity.getClass().getSimpleName());
                    activity.finish();
                }
            }
            com.bumptech.glide.zy.m11283n(bf2.toq.toq()).zy();
        }
        return true;
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    public Activity m10533k() {
        WeakReference<Activity> weakReference = this.f17862n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        if (zy(activity)) {
            this.f17863q.add(new WeakReference<>(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (zy(activity)) {
            for (WeakReference<Activity> weakReference : this.f17863q) {
                if (activity == weakReference.get()) {
                    this.f17863q.remove(weakReference);
                    return;
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        m10532n(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    /* JADX INFO: renamed from: q */
    public void m10534q() {
        WeakReference<Activity> weakReference = this.f17862n;
        if (weakReference != null) {
            weakReference.clear();
            this.f17862n = null;
        }
        this.f17861k.removeMessages(1);
        this.f17861k.sendEmptyMessageDelayed(1, com.google.android.exoplayer2.audio.n5r1.f63470fn3e);
    }
}
