package com.xiaomi.push;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class wx16 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: k */
    private String f34130k;

    /* JADX INFO: renamed from: n */
    private Context f34131n;

    /* JADX INFO: renamed from: q */
    private String f34132q;

    public wx16(Context context, String str) {
        this.f34131n = context;
        this.f34130k = str;
    }

    /* JADX INFO: renamed from: k */
    private void m21983k(String str) {
        f7z0 f7z0Var = new f7z0();
        f7z0Var.m20839a(str);
        f7z0Var.m20837a(System.currentTimeMillis());
        f7z0Var.m20838a(sc.ActivityActiveTimeStamp);
        zwy.zy(this.f34131n, f7z0Var);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (TextUtils.isEmpty(this.f34130k) || TextUtils.isEmpty(localClassName)) {
            return;
        }
        this.f34132q = "";
        if (!TextUtils.isEmpty("") && !TextUtils.equals(this.f34132q, localClassName)) {
            this.f34130k = "";
            return;
        }
        m21983k(this.f34131n.getPackageName() + "|" + localClassName + ":" + this.f34130k + "," + String.valueOf(System.currentTimeMillis() / 1000));
        this.f34130k = "";
        this.f34132q = "";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (TextUtils.isEmpty(this.f34132q)) {
            this.f34132q = activity.getLocalClassName();
        }
        this.f34130k = String.valueOf(System.currentTimeMillis() / 1000);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
