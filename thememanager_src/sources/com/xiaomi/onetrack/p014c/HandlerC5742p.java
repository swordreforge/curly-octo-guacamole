package com.xiaomi.onetrack.p014c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.onetrack.p013b.C5726n;
import com.xiaomi.onetrack.p018g.C5766c;
import com.xiaomi.onetrack.util.C5776i;
import com.xiaomi.onetrack.util.C5804p;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.xiaomi.onetrack.c.p */
/* JADX INFO: loaded from: classes3.dex */
public class HandlerC5742p extends Handler {

    /* JADX INFO: renamed from: a */
    private static final String f32050a = "UploadTimer";

    /* JADX INFO: renamed from: b */
    private static final int f32051b = 5000;

    /* JADX INFO: renamed from: c */
    private static final int f32052c = 15000;

    /* JADX INFO: renamed from: d */
    private static final int f32053d = 1200000;

    /* JADX INFO: renamed from: e */
    private final int f32054e;

    /* JADX INFO: renamed from: f */
    private final int f32055f;

    /* JADX INFO: renamed from: g */
    private final int f32056g;

    /* JADX INFO: renamed from: h */
    private int f32057h;

    /* JADX INFO: renamed from: i */
    private AtomicBoolean f32058i;

    public HandlerC5742p(Looper looper) {
        super(looper);
        this.f32054e = 1000;
        this.f32055f = 10000;
        this.f32056g = f32053d;
        this.f32057h = 10000;
        this.f32058i = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: b */
    private void m19980b() {
        if (C5745s.m19984a().m19992a(2)) {
            this.f32057h = 10000;
            C5804p.m20342a(f32050a, "retry success");
            return;
        }
        removeMessages(1000);
        int i2 = this.f32057h * 2;
        this.f32057h = i2;
        if (i2 > f32053d) {
            this.f32057h = f32053d;
        }
        C5804p.m20342a(f32050a, "will restart retry msg after " + this.f32057h);
        sendEmptyMessageDelayed(1000, (long) this.f32057h);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws Throwable {
        super.handleMessage(message);
        if (!C5726n.m19933a() || !C5766c.m20110a() || C5726n.m19935b()) {
            C5804p.m20342a(f32050a, "不用处理消息, available=" + C5726n.m19933a() + ", 是否有网=" + C5766c.m20110a() + ", 数据库是否为空=" + C5726n.m19935b());
            return;
        }
        int i2 = message.what;
        if (i2 == 1000) {
            m19980b();
            return;
        }
        boolean zM19992a = C5745s.m19984a().m19992a(i2);
        C5804p.m20342a(f32050a, "handleCheckUpload ret=" + zM19992a + ", prio=" + i2);
        if (zM19992a) {
            return;
        }
        C5804p.m20342a(f32050a, "handleCheckUpload failed, will check if need to send retry msg");
        if (hasMessages(1000)) {
            return;
        }
        sendEmptyMessageDelayed(1000, this.f32057h);
        C5804p.m20342a(f32050a, "fire retry timer after " + this.f32057h);
    }

    /* JADX INFO: renamed from: a */
    public void m19982a(int i2, boolean z2) {
        if (hasMessages(1000)) {
            C5804p.m20342a(f32050a, "in retry mode, return, prio=" + i2);
            return;
        }
        if (z2) {
            removeMessages(i2);
        }
        if (hasMessages(i2)) {
            return;
        }
        long jM19931a = z2 ? 0L : C5726n.m19931a(i2);
        C5804p.m20342a(f32050a, "will check prio=" + i2 + ", delay=" + jM19931a);
        m19979a(i2, jM19931a);
    }

    /* JADX INFO: renamed from: a */
    private void m19979a(int i2, long j2) {
        removeMessages(i2);
        C5804p.m20342a(f32050a, "will post msg, prio=" + i2 + ", delay=" + j2);
        sendEmptyMessageDelayed(i2, j2);
    }

    /* JADX INFO: renamed from: a */
    public void m19983a(boolean z2) {
        C5727a.m19938a(new RunnableC5743q(this, z2));
    }

    /* JADX INFO: renamed from: a */
    public void m19981a() {
        C5776i.m20256a(new RunnableC5744r(this));
    }
}
