package com.xiaomi.analytics.internal.v1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import com.miui.analytics.ICore;
import com.xiaomi.analytics.internal.C5604k;
import com.xiaomi.analytics.internal.C5605n;
import com.xiaomi.analytics.internal.util.C5609k;
import com.xiaomi.analytics.internal.util.n7h;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: compiled from: SysAnalytics.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy implements InterfaceC5615k {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f73071ld6 = "com.miui.analytics.AnalyticsService";

    /* JADX INFO: renamed from: p */
    private static final String f31226p = "SysAnalytics";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f73072x2 = "com.miui.analytics.ICore";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private Context f73073f7l8;

    /* JADX INFO: renamed from: g */
    private ICore f31227g;

    /* JADX INFO: renamed from: k */
    private boolean f31228k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f73074toq = false;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f73075zy = false;

    /* JADX INFO: renamed from: q */
    private final Object f31230q = new Object();

    /* JADX INFO: renamed from: n */
    private final Object f31229n = new Object();

    /* JADX INFO: renamed from: y */
    private final Set<String> f31232y = new ConcurrentSkipListSet();

    /* JADX INFO: renamed from: s */
    private ServiceConnection f31231s = new ServiceConnectionC5616k();

    /* JADX INFO: renamed from: com.xiaomi.analytics.internal.v1.zy$k */
    /* JADX INFO: compiled from: SysAnalytics.java */
    class ServiceConnectionC5616k implements ServiceConnection {
        ServiceConnectionC5616k() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            zy.this.f73074toq = true;
            zy.this.f73075zy = false;
            zy.this.f31227g = ICore.Stub.asInterface(iBinder);
            Log.i(C5609k.m19240k(zy.f31226p), String.format("onServiceConnected %s, pid:%d, tid:%d", zy.this.f31227g, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid())));
            synchronized (zy.this.f31230q) {
                try {
                    zy.this.f31230q.notifyAll();
                } catch (Exception e2) {
                    Log.e(C5609k.m19240k(zy.f31226p), "onServiceConnected notifyAll exception:", e2);
                }
            }
            zy.this.ld6();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.i(C5609k.m19240k(zy.f31226p), String.format("onServiceDisconnected, pid:%d, tid:%d", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid())));
            zy.this.f73074toq = false;
            zy.this.f31227g = null;
            zy.this.f73075zy = false;
        }
    }

    /* JADX INFO: compiled from: SysAnalytics.java */
    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (zy.this.f31232y) {
                try {
                } catch (Exception e2) {
                    Log.e(C5609k.m19240k(zy.f31226p), "onServiceConnected drain pending events exception:", e2);
                }
                if (!zy.this.f31232y.isEmpty()) {
                    Class.forName(zy.f73072x2).getMethod("trackEvents", String[].class).invoke(zy.this.f31227g, (String[]) zy.this.f31232y.toArray(new String[zy.this.f31232y.size()]));
                    C5609k.m19239g(zy.f31226p, String.format("onServiceConnected drain %d pending events", Integer.valueOf(zy.this.f31232y.size())));
                    zy.this.f31232y.clear();
                }
            }
        }
    }

    public zy(Context context) {
        this.f31228k = false;
        this.f73073f7l8 = com.xiaomi.analytics.internal.util.toq.m19255k(context);
        this.f31228k = m19268h(context);
        m19270p();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m19268h(Context context) {
        List<ResolveInfo> listQueryIntentServices;
        try {
            Intent intent = new Intent();
            intent.setClassName("com.miui.analytics", f73071ld6);
            if (context != null && context.getPackageManager() != null && (listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0)) != null) {
                if (listQueryIntentServices.size() > 0) {
                    return true;
                }
            }
        } catch (Exception e2) {
            Log.e(C5609k.m19240k(f31226p), "isServiceBuiltIn exception:", e2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ld6() {
        new Thread(new toq()).start();
    }

    /* JADX INFO: renamed from: p */
    private void m19270p() {
        if (this.f31228k) {
            try {
                Intent intent = new Intent();
                intent.setClassName("com.miui.analytics", f73071ld6);
                this.f73073f7l8.bindService(intent, this.f31231s, 1);
                this.f73075zy = true;
                C5609k.m19239g(f31226p, "try bind sys service");
            } catch (Exception e2) {
                Log.e(C5609k.m19240k(f31226p), "bind service exception:", e2);
            }
        }
    }

    private String qrj() {
        try {
            x2();
            return this.f31227g != null ? (String) Class.forName(f73072x2).getMethod("getVersionName", new Class[0]).invoke(this.f31227g, new Object[0]) : C5604k.f73035zy;
        } catch (Exception e2) {
            Log.e(C5609k.m19240k(f31226p), "getVersionName exception:", e2);
            return C5604k.f73035zy;
        }
    }

    private void x2() {
        synchronized (this.f31229n) {
            boolean z2 = this.f73075zy;
            if (z2 || (this.f73074toq && this.f31227g != null)) {
                Object[] objArr = new Object[3];
                int i2 = 0;
                objArr[0] = Boolean.valueOf(z2);
                objArr[1] = Boolean.valueOf(this.f73074toq);
                if (this.f31227g != null) {
                    i2 = 1;
                }
                objArr[2] = Integer.valueOf(i2);
                C5609k.m19239g(f31226p, String.format("ensureService mConnecting:%s, mConnected:%s, mAnalytics:%d", objArr));
            } else {
                this.f73073f7l8.unbindService(this.f31231s);
                m19270p();
            }
        }
    }

    public void cdj() {
        if (!this.f31228k || this.f73074toq) {
            return;
        }
        synchronized (this.f31230q) {
            try {
                this.f31230q.wait(n7h.f31205g * 3);
            } catch (Exception e2) {
                Log.e(C5609k.m19240k(f31226p), "waitForConnected mSyncGuard.wait exception:", e2);
            }
        }
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    public void close() {
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    public void deleteAllEvents(String str) {
        try {
            x2();
            if (this.f31227g != null) {
                Class.forName(f73072x2).getMethod("deleteAllEvents", String.class).invoke(this.f31227g, str);
            }
        } catch (Exception e2) {
            Log.e(C5609k.m19240k(f31226p), "deleteAllEvents exception:", e2);
        }
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    public C5605n getVersion() {
        return new C5605n(qrj());
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    public void init() {
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    /* JADX INFO: renamed from: k */
    public boolean mo19266k(String str) {
        try {
            x2();
            if (this.f31227g != null) {
                return ((Boolean) Class.forName(f73072x2).getMethod("isPolicyReady", String.class, String.class).invoke(this.f31227g, this.f73073f7l8.getPackageName(), str)).booleanValue();
            }
        } catch (Exception e2) {
            Log.e(C5609k.m19240k(f31226p), "isPolicyReady exception:", e2);
        }
        return false;
    }

    public boolean kja0() {
        return this.f31228k && this.f73074toq;
    }

    public boolean n7h() {
        return this.f31228k;
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    public void setDebugOn(boolean z2) {
        try {
            x2();
            if (this.f31227g != null) {
                Class.forName(f73072x2).getMethod("setDebugOn", Boolean.TYPE).invoke(this.f31227g, Boolean.valueOf(z2));
            }
        } catch (Exception e2) {
            Log.e(C5609k.m19240k(f31226p), "setDebugOn exception:", e2);
        }
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    public void setDefaultPolicy(String str, String str2) {
        try {
            x2();
            if (this.f31227g != null) {
                Class.forName(f73072x2).getMethod("setDefaultPolicy", String.class, String.class).invoke(this.f31227g, str, str2);
            }
        } catch (Throwable th) {
            Log.e(C5609k.m19240k(f31226p), "setDefaultPolicy exception:", th);
        }
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    public String toq(String str) {
        try {
            x2();
            return this.f31227g != null ? (String) Class.forName(f73072x2).getMethod("getClientExtra", String.class, String.class).invoke(this.f31227g, this.f73073f7l8.getPackageName(), str) : "";
        } catch (Exception e2) {
            Log.e(C5609k.m19240k(f31226p), "getClientExtra exception:", e2);
            return "";
        }
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    public void trackEvent(String str) {
        try {
            x2();
            if (this.f31227g != null) {
                Class.forName(f73072x2).getMethod("trackEvent", String.class).invoke(this.f31227g, str);
                return;
            }
            synchronized (this.f31232y) {
                this.f31232y.add(str);
            }
            C5609k.m19239g(f31226p, "add 1 event into pending event list");
        } catch (Exception e2) {
            Log.e(C5609k.m19240k(f31226p), "trackEvent exception:", e2);
        }
    }

    @Override // com.xiaomi.analytics.internal.v1.InterfaceC5615k
    public void trackEvents(String[] strArr) {
        try {
            x2();
            if (this.f31227g != null) {
                Class.forName(f73072x2).getMethod("trackEvents", String[].class).invoke(this.f31227g, strArr);
                return;
            }
            synchronized (this.f31232y) {
                if (strArr != null) {
                    if (strArr.length > 0) {
                        Collections.addAll(this.f31232y, strArr);
                    }
                }
            }
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(strArr == null ? 0 : strArr.length);
            C5609k.m19239g(f31226p, String.format("add %d events into pending event list", objArr));
        } catch (Exception e2) {
            Log.e(C5609k.m19240k(f31226p), "trackEvents exception:", e2);
        }
    }
}
