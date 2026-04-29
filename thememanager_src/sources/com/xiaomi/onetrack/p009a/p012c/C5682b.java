package com.xiaomi.onetrack.p009a.p012c;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.onetrack.p013b.C5726n;
import com.xiaomi.onetrack.util.C5804p;

/* JADX INFO: renamed from: com.xiaomi.onetrack.a.c.b */
/* JADX INFO: loaded from: classes3.dex */
public class C5682b {

    /* JADX INFO: renamed from: a */
    private static final String f31614a = "AdMonitorUploadTimer";

    /* JADX INFO: renamed from: b */
    private static volatile C5682b f31615b;

    /* JADX INFO: renamed from: c */
    private a f31616c;

    /* JADX INFO: renamed from: com.xiaomi.onetrack.a.c.b$a */
    private static final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            C5804p.m20342a(C5682b.f31614a, "AdMonitorUploadTimer.handleMessage, msg.what=" + message.what);
            C5683c.m19687a();
        }

        /* JADX INFO: renamed from: a */
        public void m19686a(int i2) {
            if (hasMessages(i2)) {
                C5804p.m20342a(C5682b.f31614a, "has message\u3000prio=" + i2);
                return;
            }
            long jM19931a = C5726n.m19931a(i2);
            C5804p.m20342a(C5682b.f31614a, "will check prio=" + i2 + ", delay=" + jM19931a);
            m19684a(i2, jM19931a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m19684a(int i2, long j2) {
            removeMessages(i2);
            C5804p.m20342a(C5682b.f31614a, "will post msg, prio=" + i2 + ", delay=" + j2);
            sendEmptyMessageDelayed(i2, j2);
        }
    }

    private C5682b() {
        HandlerThread handlerThread = new HandlerThread("onetrack_ad_monitor_uploader");
        handlerThread.start();
        this.f31616c = new a(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: a */
    public static C5682b m19681a() {
        if (f31615b == null) {
            synchronized (C5682b.class) {
                if (f31615b == null) {
                    f31615b = new C5682b();
                }
            }
        }
        return f31615b;
    }

    /* JADX INFO: renamed from: b */
    public void m19683b() {
        this.f31616c.m19686a(0);
    }

    /* JADX INFO: renamed from: a */
    public void m19682a(boolean z2) {
        a aVar;
        if (!z2 || (aVar = this.f31616c) == null) {
            return;
        }
        aVar.m19684a(0, 1000L);
    }
}
