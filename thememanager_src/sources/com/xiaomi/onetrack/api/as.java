package com.xiaomi.onetrack.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.miui.analytics.ITrack;
import com.xiaomi.onetrack.Configuration;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.util.C5804p;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class as {

    /* JADX INFO: renamed from: a */
    public static final String f31691a = "com.miui.analytics";

    /* JADX INFO: renamed from: b */
    public static final String f31692b = "com.miui.analytics.onetrack.OneTrackService";

    /* JADX INFO: renamed from: c */
    private static final String f31693c = "ServiceConnectManager";

    /* JADX INFO: renamed from: h */
    private static final int f31694h = 1;

    /* JADX INFO: renamed from: i */
    private static final int f31695i = 2;

    /* JADX INFO: renamed from: k */
    private static volatile as f31696k = null;

    /* JADX INFO: renamed from: l */
    private static String f31697l = "onetrack_service_connect";

    /* JADX INFO: renamed from: d */
    private volatile ITrack f31698d;

    /* JADX INFO: renamed from: j */
    private HandlerC5686b f31702j;

    /* JADX INFO: renamed from: e */
    private AtomicBoolean f31699e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    private AtomicBoolean f31700f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m */
    private AtomicBoolean f31703m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n */
    private ServiceConnection f31704n = new ServiceConnection() { // from class: com.xiaomi.onetrack.api.ServiceConnectionManager$1
        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            try {
                try {
                    this.f31618a.f31701g.unbindService(this.f31618a.f31704n);
                } catch (Exception e2) {
                    C5804p.m20342a("ServiceConnectManager", "onBindingDied: " + e2.toString());
                }
                this.f31618a.m19718c();
            } catch (Throwable th) {
                C5804p.m20342a("ServiceConnectManager", "onBindingDied throwable:" + th.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            try {
                this.f31618a.m19718c();
            } catch (Throwable th) {
                C5804p.m20342a("ServiceConnectManager", "onNullBinding throwable:" + th.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f31618a.f31698d = ITrack.Stub.asInterface(iBinder);
                this.f31618a.f31700f.set(true);
                this.f31618a.f31699e.set(false);
                this.f31618a.m19727g();
                StringBuilder sb = new StringBuilder();
                sb.append("onServiceConnected  mConnecting ");
                sb.append(this.f31618a.f31699e);
                sb.append(" mBindResult:");
                sb.append(this.f31618a.f31700f);
                sb.append(" mIOneTrackService ");
                sb.append(this.f31618a.f31698d == null ? 0 : 1);
                sb.append(" pid:");
                sb.append(Process.myPid());
                sb.append(" tid:");
                sb.append(Process.myTid());
                C5804p.m20342a("ServiceConnectManager", sb.toString());
            } catch (Throwable th) {
                this.f31618a.m19718c();
                C5804p.m20342a("ServiceConnectManager", "onServiceConnected throwable:" + th.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            try {
                this.f31618a.m19718c();
                StringBuilder sb = new StringBuilder();
                sb.append("onServiceDisconnected:  mConnecting ");
                sb.append(this.f31618a.f31699e);
                sb.append(" mIOneTrackService ");
                sb.append(this.f31618a.f31698d == null ? 0 : 1);
                C5804p.m20342a("ServiceConnectManager", sb.toString());
            } catch (Throwable th) {
                C5804p.m20342a("ServiceConnectManager", "onServiceDisconnected throwable:" + th.getMessage());
            }
        }
    };

    /* JADX INFO: renamed from: o */
    private CopyOnWriteArrayList<InterfaceC5685a> f31705o = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: g */
    private Context f31701g = C5756a.m20053b();

    /* JADX INFO: renamed from: com.xiaomi.onetrack.api.as$a */
    public interface InterfaceC5685a {
        /* JADX INFO: renamed from: a */
        void mo19712a();
    }

    /* JADX INFO: renamed from: com.xiaomi.onetrack.api.as$b */
    private class HandlerC5686b extends Handler {
        public HandlerC5686b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 1) {
                as.this.m19725f();
            } else if (i2 == 2) {
                as.this.m19721d();
            }
        }
    }

    private as() {
        HandlerThread handlerThread = new HandlerThread(f31697l);
        handlerThread.start();
        HandlerC5686b handlerC5686b = new HandlerC5686b(handlerThread.getLooper());
        this.f31702j = handlerC5686b;
        handlerC5686b.sendEmptyMessage(2);
    }

    /* JADX INFO: renamed from: b */
    public static void m19717b() {
        if (f31696k == null) {
            synchronized (as.class) {
                if (f31696k == null) {
                    f31696k = new as();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m19718c() {
        this.f31698d = null;
        this.f31700f.set(false);
        this.f31699e.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m19721d() {
        if (!this.f31699e.get() && !this.f31700f.get() && this.f31698d == null) {
            m19722e();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ensureService mConnecting: ");
        sb.append(this.f31699e.get());
        sb.append(" mIsBindSuccess:");
        sb.append(this.f31700f.get());
        sb.append(" mAnalytics: ");
        sb.append(this.f31698d == null ? 0 : 1);
        C5804p.m20342a(f31693c, sb.toString());
    }

    /* JADX INFO: renamed from: e */
    private void m19722e() {
        this.f31699e.set(true);
        try {
            Intent intent = new Intent();
            intent.setClassName("com.miui.analytics", f31692b);
            boolean zBindService = this.f31701g.bindService(intent, this.f31704n, 1);
            if (zBindService) {
                this.f31700f.set(true);
            } else {
                this.f31700f.set(false);
                try {
                    this.f31701g.unbindService(this.f31704n);
                } catch (Throwable th) {
                    Log.d(f31693c, "unbindService e1: " + th.getMessage());
                }
            }
            C5804p.m20342a(f31693c, "bindService:  mConnecting: " + this.f31699e + " bindResult:" + zBindService);
        } catch (Throwable th2) {
            try {
                this.f31700f.set(false);
                this.f31699e.set(false);
                this.f31701g.unbindService(this.f31704n);
            } catch (Throwable th3) {
                Log.d(f31693c, "bindService e1: " + th3.getMessage());
            }
            C5804p.m20347b(f31693c, "bindService e: " + th2.getMessage());
        }
        this.f31699e.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m19725f() {
        try {
            if (this.f31700f.get()) {
                this.f31701g.unbindService(this.f31704n);
            }
        } catch (Throwable th) {
            C5804p.m20342a(f31693c, "unBindService Throwable: " + th.getMessage());
        }
        m19718c();
        C5804p.m20342a(f31693c, "unBindService  mIsBindSuccess:" + this.f31700f.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m19727g() {
        Iterator<InterfaceC5685a> it = this.f31705o.iterator();
        while (it.hasNext()) {
            it.next().mo19712a();
        }
    }

    /* JADX INFO: renamed from: a */
    public static as m19714a() {
        if (f31696k == null) {
            m19717b();
        }
        return f31696k;
    }

    /* JADX INFO: renamed from: a */
    public boolean m19733a(String str, String str2, Configuration configuration, boolean z2) {
        if (this.f31699e.get()) {
            return false;
        }
        if (this.f31698d != null) {
            try {
                String appId = configuration.getAppId();
                if (z2) {
                    appId = configuration.getAdEventAppId();
                }
                this.f31698d.trackEvent(appId, C5756a.m20058e(), str, str2);
                return true;
            } catch (Throwable th) {
                m19725f();
                C5804p.m20342a(f31693c, "track throwable: " + th.getMessage());
                return false;
            }
        }
        this.f31702j.sendEmptyMessage(2);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m19732a(String str, String str2, String str3) {
        try {
            C5804p.m20342a(f31693c, "trackCacheData: appId:" + str + "_eventName:_data:" + str3);
            this.f31698d.trackEvent(str, C5756a.m20058e(), str2, str3);
        } catch (Exception e2) {
            C5804p.m20347b(f31693c, "trackCacheData error:" + e2.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m19731a(InterfaceC5685a interfaceC5685a) {
        if (this.f31705o.contains(interfaceC5685a)) {
            return;
        }
        this.f31705o.add(interfaceC5685a);
    }

    /* JADX INFO: renamed from: a */
    public void m19730a(int i2) {
        if (i2 == 2) {
            this.f31702j.sendEmptyMessageDelayed(1, 5000L);
        } else if (this.f31702j.hasMessages(1)) {
            this.f31702j.removeMessages(1);
        }
    }
}
