package com.xiaomi.mipush.sdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.push.e5;
import com.xiaomi.push.ga;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(14)
public class fu4 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: k */
    private Set<String> f31358k = new HashSet();

    /* JADX INFO: renamed from: k */
    private static void m19465k(Application application) {
        application.registerActivityLifecycleCallbacks(new fu4());
    }

    public static void toq(Context context) {
        m19465k((Application) context.getApplicationContext());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("messageId");
        int intExtra = intent.getIntExtra("eventMessageType", -1);
        if (TextUtils.isEmpty(stringExtra) || intExtra <= 0 || this.f31358k.contains(stringExtra)) {
            return;
        }
        this.f31358k.add(stringExtra);
        if (intExtra == 3000) {
            e5.m20763k(activity.getApplicationContext()).f7l8(activity.getPackageName(), ga.m20888p(intExtra), stringExtra, 3008, null);
        } else if (intExtra == 1000) {
            e5.m20763k(activity.getApplicationContext()).f7l8(activity.getPackageName(), ga.m20888p(intExtra), stringExtra, 1008, null);
        }
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
