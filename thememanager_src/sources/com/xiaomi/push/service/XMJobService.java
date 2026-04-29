package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.xiaomi.push.C5892r;
import com.xiaomi.push.oki;

/* JADX INFO: loaded from: classes3.dex */
public class XMJobService extends Service {

    /* JADX INFO: renamed from: a */
    static Service f33653a;

    /* JADX INFO: renamed from: a */
    private IBinder f33654a = null;

    /* JADX INFO: renamed from: com.xiaomi.push.service.XMJobService$k */
    @TargetApi(21)
    static class JobServiceC5895k extends JobService {

        /* JADX INFO: renamed from: k */
        Binder f33655k;

        /* JADX INFO: renamed from: q */
        private Handler f33656q;

        /* JADX INFO: renamed from: com.xiaomi.push.service.XMJobService$k$k */
        private static class k extends Handler {

            /* JADX INFO: renamed from: k */
            JobService f33657k;

            k(JobService jobService) {
                super(jobService.getMainLooper());
                this.f33657k = jobService;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    return;
                }
                JobParameters jobParameters = (JobParameters) message.obj;
                com.xiaomi.channel.commonutils.logger.zy.kja0("Job finished " + jobParameters.getJobId());
                this.f33657k.jobFinished(jobParameters, false);
                if (jobParameters.getJobId() == 1) {
                    oki.m21369q(false);
                }
            }
        }

        JobServiceC5895k(Service service) {
            this.f33655k = null;
            this.f33655k = (Binder) C5892r.m21411n(this, "onBind", new Intent());
            C5892r.m21411n(this, "attachBaseContext", service);
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("Job started " + jobParameters.getJobId());
            Intent intent = new Intent(this, (Class<?>) XMPushService.class);
            intent.setAction("com.xiaomi.push.timer");
            intent.setPackage(getPackageName());
            startService(intent);
            if (this.f33656q == null) {
                this.f33656q = new k(this);
            }
            Handler handler = this.f33656q;
            handler.sendMessage(Message.obtain(handler, 1, jobParameters));
            return true;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("Job stop " + jobParameters.getJobId());
            return false;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IBinder iBinder = this.f33654a;
        return iBinder != null ? iBinder : new Binder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f33654a = new JobServiceC5895k(this).f33655k;
        f33653a = this;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        f33653a = null;
    }
}
