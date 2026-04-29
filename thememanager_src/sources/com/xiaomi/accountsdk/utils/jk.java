package com.xiaomi.accountsdk.utils;

import android.os.SystemClock;
import com.xiaomi.accountsdk.account.C5504y;
import com.xiaomi.accountsdk.request.C5539k;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: SyncServerTimeExecutor.java */
/* JADX INFO: loaded from: classes3.dex */
public class jk {

    /* JADX INFO: renamed from: q */
    private static final String f31032q = "SyncServerTimeExecutor";

    /* JADX INFO: renamed from: k */
    private final Executor f31033k = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Object f72968toq = new Object();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f72969zy;

    /* JADX INFO: renamed from: n */
    private static final String f31031n = C5504y.f30808y + "/configuration";

    /* JADX INFO: renamed from: g */
    private static final jk f31030g = new jk();

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.jk$k */
    /* JADX INFO: compiled from: SyncServerTimeExecutor.java */
    class RunnableC5569k implements Runnable {
        RunnableC5569k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.xiaomi.accountsdk.request.wvg.x2(jk.f31031n, null, null, true);
            } catch (C5539k e2) {
                AbstractC5574n.m19113q(jk.f31032q, "syncServerTime", e2);
            } catch (com.xiaomi.accountsdk.request.zy e3) {
                AbstractC5574n.m19113q(jk.f31032q, "syncServerTime", e3);
            } catch (IOException e4) {
                AbstractC5574n.m19113q(jk.f31032q, "syncServerTime", e4);
            }
        }
    }

    private jk() {
    }

    public static jk zy() {
        return f31030g;
    }

    /* JADX INFO: renamed from: n */
    public void m19089n(Date date) {
        if (date == null) {
            AbstractC5574n.fu4(f31032q, "server date is null");
            return;
        }
        long time = date.getTime() - SystemClock.elapsedRealtime();
        synchronized (this.f72968toq) {
            if (time != this.f72969zy) {
                this.f72969zy = time;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m19090q() {
        this.f31033k.execute(new RunnableC5569k());
    }

    public long toq() {
        return this.f72969zy == 0 ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + this.f72969zy;
    }
}
