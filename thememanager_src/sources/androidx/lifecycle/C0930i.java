package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import zy.yz;

/* JADX INFO: renamed from: androidx.lifecycle.i */
/* JADX INFO: compiled from: LifecycleDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
class C0930i {

    /* JADX INFO: renamed from: k */
    private static AtomicBoolean f5089k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.lifecycle.i$k */
    /* JADX INFO: compiled from: LifecycleDispatcher.java */
    @yz
    static class k extends C0947s {
        k() {
        }

        @Override // androidx.lifecycle.C0947s, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            lvui.f7l8(activity);
        }

        @Override // androidx.lifecycle.C0947s, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // androidx.lifecycle.C0947s, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    private C0930i() {
    }

    /* JADX INFO: renamed from: k */
    static void m4445k(Context context) {
        if (f5089k.getAndSet(true)) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new k());
    }
}
