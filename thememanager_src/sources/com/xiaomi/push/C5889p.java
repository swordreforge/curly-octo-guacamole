package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.xiaomi.push.p */
/* JADX INFO: loaded from: classes3.dex */
public class C5889p {

    /* JADX INFO: renamed from: n */
    private static volatile C5889p f33556n;

    /* JADX INFO: renamed from: q */
    private SharedPreferences f33558q;

    /* JADX INFO: renamed from: k */
    private ScheduledThreadPoolExecutor f33557k = new ScheduledThreadPoolExecutor(1);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Map<String, ScheduledFuture> f73525toq = new HashMap();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Object f73526zy = new Object();

    /* JADX INFO: renamed from: com.xiaomi.push.p$k */
    public static abstract class k implements Runnable {
        /* JADX INFO: renamed from: k */
        public abstract String mo19320k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.xiaomi.push.p$toq */
    static class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        k f33559k;

        public toq(k kVar) {
            this.f33559k = kVar;
        }

        /* JADX INFO: renamed from: k */
        void mo21153k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            mo21153k();
            this.f33559k.run();
            toq();
        }

        void toq() {
        }
    }

    private C5889p(Context context) {
        this.f33558q = context.getSharedPreferences("mipush_extra", 0);
    }

    /* JADX INFO: renamed from: g */
    private ScheduledFuture m21372g(k kVar) {
        ScheduledFuture scheduledFuture;
        synchronized (this.f73526zy) {
            scheduledFuture = this.f73525toq.get(kVar.mo19320k());
        }
        return scheduledFuture;
    }

    /* JADX INFO: renamed from: q */
    private static String m21375q(String str) {
        return "last_job_time" + str;
    }

    public static C5889p toq(Context context) {
        if (f33556n == null) {
            synchronized (C5889p.class) {
                if (f33556n == null) {
                    f33556n = new C5889p(context);
                }
            }
        }
        return f33556n;
    }

    public void f7l8(Runnable runnable) {
        m21378y(runnable, 0);
    }

    public boolean ld6(k kVar, int i2, int i3) {
        return x2(kVar, i2, i3, false);
    }

    public boolean n7h(k kVar, int i2) {
        if (kVar == null || m21372g(kVar) != null) {
            return false;
        }
        ScheduledFuture<?> scheduledFutureSchedule = this.f33557k.schedule(new x2(this, kVar), i2, TimeUnit.SECONDS);
        synchronized (this.f73526zy) {
            this.f73525toq.put(kVar.mo19320k(), scheduledFutureSchedule);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public boolean m21376p(k kVar, int i2) {
        return ld6(kVar, i2, 0);
    }

    public boolean qrj(String str) {
        synchronized (this.f73526zy) {
            ScheduledFuture scheduledFuture = this.f73525toq.get(str);
            if (scheduledFuture == null) {
                return false;
            }
            this.f73525toq.remove(str);
            return scheduledFuture.cancel(false);
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m21377s(k kVar) {
        return n7h(kVar, 0);
    }

    public boolean x2(k kVar, int i2, int i3, boolean z2) {
        if (kVar == null || m21372g(kVar) != null) {
            return false;
        }
        String strM21375q = m21375q(kVar.mo19320k());
        ld6 ld6Var = new ld6(this, kVar, z2, strM21375q);
        if (!z2) {
            long jAbs = Math.abs(System.currentTimeMillis() - this.f33558q.getLong(strM21375q, 0L)) / 1000;
            if (jAbs < i2 - i3) {
                i3 = (int) (((long) i2) - jAbs);
            }
        }
        try {
            ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = this.f33557k.scheduleAtFixedRate(ld6Var, i3, i2, TimeUnit.SECONDS);
            synchronized (this.f73526zy) {
                this.f73525toq.put(kVar.mo19320k(), scheduledFutureScheduleAtFixedRate);
            }
            return true;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            return true;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m21378y(Runnable runnable, int i2) {
        this.f33557k.schedule(runnable, i2, TimeUnit.SECONDS);
    }
}
