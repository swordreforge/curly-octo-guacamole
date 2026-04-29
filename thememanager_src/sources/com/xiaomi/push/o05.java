package com.xiaomi.push;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.xiaomi.push.oki;

/* JADX INFO: loaded from: classes3.dex */
class o05 implements oki.InterfaceC5887k {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected Context f73506toq;

    /* JADX INFO: renamed from: k */
    private PendingIntent f33484k = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private volatile long f73507zy = 0;

    public o05(Context context) {
        this.f73506toq = null;
        this.f73506toq = context;
    }

    /* JADX INFO: renamed from: k */
    private void m21339k(AlarmManager alarmManager, long j2, PendingIntent pendingIntent) {
        try {
            AlarmManager.class.getMethod("setExact", Integer.TYPE, Long.TYPE, PendingIntent.class).invoke(alarmManager, 2, Long.valueOf(j2), pendingIntent);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.jk("[Alarm] invoke setExact method meet error. " + e2);
        }
    }

    @Override // com.xiaomi.push.oki.InterfaceC5887k
    /* JADX INFO: renamed from: a */
    public void mo21270a(boolean z2) {
        long qVar = com.xiaomi.push.service.py.zy(this.f73506toq).toq();
        if (z2 || this.f73507zy != 0) {
            if (z2) {
                mo21269a();
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (z2 || this.f73507zy == 0) {
                this.f73507zy = jElapsedRealtime + (qVar - (jElapsedRealtime % qVar));
            } else if (this.f73507zy <= jElapsedRealtime) {
                this.f73507zy += qVar;
                if (this.f73507zy < jElapsedRealtime) {
                    this.f73507zy = jElapsedRealtime + qVar;
                }
            }
            Intent intent = new Intent(com.xiaomi.push.service.dd.f73560cdj);
            intent.setPackage(this.f73506toq.getPackageName());
            toq(intent, this.f73507zy);
        }
    }

    public void toq(Intent intent, long j2) {
        AlarmManager alarmManager = (AlarmManager) this.f73506toq.getSystemService("alarm");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            this.f33484k = PendingIntent.getBroadcast(this.f73506toq, 0, intent, 33554432);
        } else {
            this.f33484k = PendingIntent.getBroadcast(this.f73506toq, 0, intent, 0);
        }
        if (i2 < 31 || nc.m21313p(this.f73506toq)) {
            C5892r.m21411n(alarmManager, "setExactAndAllowWhileIdle", 2, Long.valueOf(j2), this.f33484k);
        } else {
            alarmManager.set(2, j2, this.f33484k);
        }
        com.xiaomi.channel.commonutils.logger.zy.m19300t("[Alarm] register timer " + j2);
    }

    @Override // com.xiaomi.push.oki.InterfaceC5887k
    /* JADX INFO: renamed from: a */
    public void mo21269a() {
        if (this.f33484k != null) {
            try {
                ((AlarmManager) this.f73506toq.getSystemService("alarm")).cancel(this.f33484k);
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f33484k = null;
                com.xiaomi.channel.commonutils.logger.zy.m19300t("[Alarm] unregister timer");
                this.f73507zy = 0L;
                throw th;
            }
            this.f33484k = null;
            com.xiaomi.channel.commonutils.logger.zy.m19300t("[Alarm] unregister timer");
            this.f73507zy = 0L;
        }
        this.f73507zy = 0L;
    }

    @Override // com.xiaomi.push.oki.InterfaceC5887k
    /* JADX INFO: renamed from: a */
    public boolean mo21271a() {
        return this.f73507zy != 0;
    }
}
