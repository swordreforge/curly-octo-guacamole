package com.android.thememanager.v9;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.util.g1;
import ek5k.C6002g;

/* JADX INFO: compiled from: ThemeCommentManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class kja0 {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f61478ld6 = 180000;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f61479n7h = 2;

    /* JADX INFO: renamed from: p */
    private static final String f17165p = "last_show_comment_dialog";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f61480qrj = 1;

    /* JADX INFO: renamed from: s */
    private static final String f17166s = "need_show_comment_dialog";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f61481x2 = 86400000;

    /* JADX INFO: renamed from: y */
    public static final String f17167y = "com.android.thememanager.COUNT_DOWN_FINISH";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private Application.ActivityLifecycleCallbacks f61482f7l8;

    /* JADX INFO: renamed from: g */
    private Application f17168g;

    /* JADX INFO: renamed from: k */
    private Handler f17169k;

    /* JADX INFO: renamed from: n */
    private boolean f17170n;

    /* JADX INFO: renamed from: q */
    private int f17171q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f61483toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f61484zy;

    /* JADX INFO: renamed from: com.android.thememanager.v9.kja0$k */
    /* JADX INFO: compiled from: ThemeCommentManager.java */
    class HandlerC2866k extends Handler {
        HandlerC2866k() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            int i2 = msg.what;
            if (i2 == 1) {
                kja0.this.f17168g.unregisterActivityLifecycleCallbacks(kja0.this.f61482f7l8);
                g1.m9740d(kja0.f17166s, System.currentTimeMillis());
                com.android.thememanager.basemodule.utils.ni7.m7146k().zy(kja0.f17167y, new Intent(kja0.f17167y));
            } else if (i2 == 2 && ((Boolean) msg.obj).booleanValue()) {
                kja0.this.f17168g.registerActivityLifecycleCallbacks(kja0.this.f61482f7l8);
                kja0.this.ki();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v9.kja0$q */
    /* JADX INFO: compiled from: ThemeCommentManager.java */
    private static final class C2867q {

        /* JADX INFO: renamed from: k */
        private static kja0 f17173k = new kja0(null);

        private C2867q() {
        }
    }

    /* JADX INFO: compiled from: ThemeCommentManager.java */
    class toq implements Application.ActivityLifecycleCallbacks {
        toq() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (kja0.m10185n(kja0.this) == 1 && kja0.this.n7h()) {
                kja0.this.ki();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (kja0.m10182g(kja0.this) == 0) {
                kja0.this.m10183h();
                kja0.this.f17170n = !y9n.m7256t();
            }
        }
    }

    /* JADX INFO: compiled from: ThemeCommentManager.java */
    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            kja0.this.cdj();
            boolean zN7h = kja0.this.n7h();
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            messageObtain.obj = Boolean.valueOf(zN7h);
            kja0.this.f17169k.sendMessage(messageObtain);
        }
    }

    /* synthetic */ kja0(HandlerC2866k handlerC2866k) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cdj() {
        m10183h();
        this.f61483toq = 0L;
        this.f61484zy = 180000L;
        g1.m9759x(f17166s);
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ int m10182g(kja0 kja0Var) {
        int i2 = kja0Var.f17171q - 1;
        kja0Var.f17171q = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m10183h() {
        this.f17169k.removeMessages(1);
        if (this.f61483toq != 0) {
            this.f61484zy -= System.currentTimeMillis() - this.f61483toq;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ki() {
        if (g1.x9kr(f17166s)) {
            return;
        }
        this.f61483toq = System.currentTimeMillis();
        this.f17169k.removeMessages(1);
        this.f17169k.sendEmptyMessageDelayed(1, this.f61484zy);
    }

    /* JADX INFO: renamed from: n */
    static /* synthetic */ int m10185n(kja0 kja0Var) {
        int i2 = kja0Var.f17171q + 1;
        kja0Var.f17171q = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n7h() {
        return g1.hyr() && !g1.m9742f() && this.f17170n && System.currentTimeMillis() - g1.m9738b() < 86400000 && (!g1.x9kr(f17165p) || System.currentTimeMillis() - g1.ni7(f17165p) > 86400000);
    }

    private void t8r(ActivityC0891q activity) {
        n7h.f1bi(activity);
    }

    public static kja0 x2() {
        return C2867q.f17173k;
    }

    public void kja0() {
        cdj();
        this.f17170n = false;
        this.f17171q = 1;
        this.f17168g.registerActivityLifecycleCallbacks(this.f61482f7l8);
    }

    public void ld6(ActivityC0891q activity) {
        if (!g1.x9kr(f17166s) || g1.m9738b() > g1.ni7(f17166s)) {
            return;
        }
        t8r(activity);
        g1.m9740d(f17165p, System.currentTimeMillis());
        g1.m9759x(f17166s);
    }

    public void qrj(Application application) {
        this.f17168g = application;
        C6002g.m22247s(new zy());
    }

    private kja0() {
        this.f17169k = new HandlerC2866k();
        this.f61484zy = 180000L;
        this.f17171q = 0;
        this.f17170n = true;
        this.f61482f7l8 = new toq();
    }
}
