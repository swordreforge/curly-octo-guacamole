package com.xiaomi.onetrack.api;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.p009a.p012c.C5682b;
import com.xiaomi.onetrack.p013b.C5726n;
import com.xiaomi.onetrack.p014c.C5745s;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.p018g.C5766c;
import com.xiaomi.onetrack.util.C5804p;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.c */
/* JADX INFO: loaded from: classes3.dex */
public class C5689c {

    /* JADX INFO: renamed from: a */
    private static final String f31736a = "BroadcastManager";

    /* JADX INFO: renamed from: b */
    private static String f31737b = "onetrack_broadcast_manager";

    /* JADX INFO: renamed from: c */
    private static volatile C5689c f31738c = null;

    /* JADX INFO: renamed from: e */
    private static final int f31739e = 10;

    /* JADX INFO: renamed from: f */
    private static final int f31740f = 100;

    /* JADX INFO: renamed from: g */
    private static final int f31741g = 101;

    /* JADX INFO: renamed from: h */
    private static volatile boolean f31742h = false;

    /* JADX INFO: renamed from: j */
    private static volatile boolean f31743j = false;

    /* JADX INFO: renamed from: d */
    private Handler f31744d;

    /* JADX INFO: renamed from: i */
    private CopyOnWriteArrayList<InterfaceC5696j> f31745i = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: k */
    private AtomicBoolean f31746k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l */
    private boolean f31747l = false;

    /* JADX INFO: renamed from: m */
    private boolean f31748m = false;

    /* JADX INFO: renamed from: n */
    private BroadcastReceiver f31749n = new C5690d(this);

    /* JADX INFO: renamed from: o */
    private BroadcastReceiver f31750o = new C5691e(this);

    /* JADX INFO: renamed from: com.xiaomi.onetrack.api.c$a */
    private class a extends Handler {
        /* synthetic */ a(C5689c c5689c, Looper looper, C5690d c5690d) {
            this(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean zM20110a;
            if (message == null) {
                return;
            }
            int i2 = message.what;
            if (i2 == 100 || i2 == 101) {
                try {
                    C5689c.this.m19766a(i2);
                } catch (Exception e2) {
                    C5804p.m20344a(C5689c.f31736a, "screenReceiver exception: ", e2);
                }
            }
            if (message.what == 10) {
                if (C5689c.this.f31746k.get()) {
                    try {
                        if (OneTrack.isRestrictGetNetworkInfo()) {
                            zM20110a = C5726n.m19936c();
                            C5726n.m19934b(!zM20110a);
                        } else {
                            zM20110a = C5766c.m20110a();
                            C5726n.m19934b(zM20110a);
                        }
                        C5804p.m20342a(C5689c.f31736a, "Only one of allowed NetworkInfo :" + OneTrack.isRestrictGetNetworkInfo() + " ,network status changed, isNetworkConnected: " + C5726n.m19936c());
                        if (zM20110a) {
                            if (C5689c.this.f31747l) {
                                C5682b.m19681a().m19682a(C5726n.m19936c());
                            }
                            if (C5689c.this.f31748m) {
                                C5745s.m19984a().m19991a(C5726n.m19936c());
                            }
                        }
                    } catch (Throwable th) {
                        C5804p.m20347b(C5689c.f31736a, "MESSAGE_BROADCAST_NET_RECEIVER throwable:" + th.getMessage());
                    }
                }
                C5689c.this.f31746k.set(true);
            }
        }

        private a(Looper looper) {
            super(looper);
        }
    }

    private C5689c() {
        try {
            HandlerThread handlerThread = new HandlerThread(f31737b);
            handlerThread.start();
            this.f31744d = new a(this, handlerThread.getLooper(), null);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    private void m19772g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        C5756a.m20053b().registerReceiver(this.f31749n, intentFilter);
        Log.d(C5804p.m20340a(f31736a), "register screen receiver");
    }

    /* JADX INFO: renamed from: h */
    private void m19773h() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        C5756a.m20053b().registerReceiver(this.f31750o, intentFilter);
        Log.d(C5804p.m20340a(f31736a), "register net receiver");
    }

    /* JADX INFO: renamed from: e */
    public void m19777e() {
        if (f31742h) {
            return;
        }
        f31742h = true;
        try {
            m19772g();
        } catch (Throwable unused) {
            f31742h = false;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m19778f() {
        if (f31743j) {
            return;
        }
        f31743j = true;
        boolean zM20111b = C5766c.m20111b();
        C5804p.m20342a(f31736a, "Get network status for the first time, isNetworkConnected: " + zM20111b);
        C5726n.m19934b(zM20111b);
        try {
            m19773h();
        } catch (Throwable unused) {
            f31743j = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m19769b() {
        if (f31738c == null) {
            synchronized (C5689c.class) {
                if (f31738c == null) {
                    f31738c = new C5689c();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m19775c() {
        this.f31747l = true;
    }

    /* JADX INFO: renamed from: d */
    public void m19776d() {
        this.f31748m = true;
    }

    /* JADX INFO: renamed from: a */
    public static C5689c m19765a() {
        if (f31738c == null) {
            m19769b();
        }
        return f31738c;
    }

    /* JADX INFO: renamed from: a */
    public void m19774a(InterfaceC5696j interfaceC5696j) {
        if (this.f31745i.contains(interfaceC5696j)) {
            return;
        }
        this.f31745i.add(interfaceC5696j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m19766a(int i2) {
        for (InterfaceC5696j interfaceC5696j : this.f31745i) {
            if (i2 == 100) {
                interfaceC5696j.mo19706a(true);
            } else if (i2 == 101) {
                interfaceC5696j.mo19706a(false);
            }
        }
    }
}
