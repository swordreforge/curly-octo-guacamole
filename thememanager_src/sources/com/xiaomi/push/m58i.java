package com.xiaomi.push;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.push.oki;
import com.xiaomi.push.service.XMJobService;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(21)
public class m58i implements oki.InterfaceC5887k {

    /* JADX INFO: renamed from: k */
    Context f33409k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    JobScheduler f73488toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f73489zy = false;

    m58i(Context context) {
        this.f33409k = context;
        this.f73488toq = (JobScheduler) context.getSystemService("jobscheduler");
    }

    @Override // com.xiaomi.push.oki.InterfaceC5887k
    /* JADX INFO: renamed from: a */
    public void mo21270a(boolean z2) {
        if (z2 || this.f73489zy) {
            long jM20892g = gb.m20892g();
            if (z2) {
                mo21269a();
                jM20892g -= SystemClock.elapsedRealtime() % jM20892g;
            }
            this.f73489zy = true;
            m21272k(jM20892g);
        }
    }

    /* JADX INFO: renamed from: k */
    void m21272k(long j2) {
        JobInfo.Builder builder = new JobInfo.Builder(1, new ComponentName(this.f33409k.getPackageName(), XMJobService.class.getName()));
        builder.setMinimumLatency(j2);
        builder.setOverrideDeadline(j2);
        builder.setRequiredNetworkType(1);
        com.xiaomi.channel.commonutils.logger.zy.m19300t("schedule Job = " + builder.build().getId() + " in " + j2);
        this.f73488toq.schedule(builder.build());
    }

    @Override // com.xiaomi.push.oki.InterfaceC5887k
    /* JADX INFO: renamed from: a */
    public void mo21269a() {
        this.f73489zy = false;
        this.f73488toq.cancel(1);
    }

    @Override // com.xiaomi.push.oki.InterfaceC5887k
    /* JADX INFO: renamed from: a */
    public boolean mo21271a() {
        return this.f73489zy;
    }
}
