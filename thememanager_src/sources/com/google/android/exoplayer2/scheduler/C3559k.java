package com.google.android.exoplayer2.scheduler;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import zy.hyr;

/* JADX INFO: renamed from: com.google.android.exoplayer2.scheduler.k */
/* JADX INFO: compiled from: PlatformScheduler.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
public final class C3559k implements InterfaceC3560n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f65317f7l8 = "requirements";

    /* JADX INFO: renamed from: g */
    private static final String f21199g = "service_package";

    /* JADX INFO: renamed from: n */
    private static final String f21200n = "service_action";

    /* JADX INFO: renamed from: q */
    private static final String f21201q = "PlatformScheduler";

    /* JADX INFO: renamed from: y */
    private static final int f21202y;

    /* JADX INFO: renamed from: k */
    private final int f21203k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ComponentName f65318toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final JobScheduler f65319zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.scheduler.k$k */
    /* JADX INFO: compiled from: PlatformScheduler.java */
    public static final class k extends JobService {
        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            PersistableBundle extras = jobParameters.getExtras();
            int iM12532g = new Requirements(extras.getInt("requirements")).m12532g(this);
            if (iM12532g == 0) {
                String str = (String) C3844k.f7l8(extras.getString(C3559k.f21200n));
                lrht.uc(this, new Intent(str).setPackage((String) C3844k.f7l8(extras.getString(C3559k.f21199g))));
                return false;
            }
            StringBuilder sb = new StringBuilder(33);
            sb.append("Requirements not met: ");
            sb.append(iM12532g);
            ni7.qrj(C3559k.f21201q, sb.toString());
            jobFinished(jobParameters, true);
            return false;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    static {
        f21202y = (lrht.f23230k >= 26 ? 16 : 0) | 15;
    }

    @zy.lrht("android.permission.RECEIVE_BOOT_COMPLETED")
    public C3559k(Context context, int i2) {
        Context applicationContext = context.getApplicationContext();
        this.f21203k = i2;
        this.f65318toq = new ComponentName(applicationContext, (Class<?>) k.class);
        this.f65319zy = (JobScheduler) C3844k.f7l8((JobScheduler) applicationContext.getSystemService("jobscheduler"));
    }

    private static JobInfo zy(int i2, ComponentName componentName, Requirements requirements, String str, String str2) {
        Requirements qVar = requirements.toq(f21202y);
        if (!qVar.equals(requirements)) {
            int iF7l8 = qVar.f7l8() ^ requirements.f7l8();
            StringBuilder sb = new StringBuilder(46);
            sb.append("Ignoring unsupported requirements: ");
            sb.append(iF7l8);
            ni7.qrj(f21201q, sb.toString());
        }
        JobInfo.Builder builder = new JobInfo.Builder(i2, componentName);
        if (requirements.fu4()) {
            builder.setRequiredNetworkType(2);
        } else if (requirements.t8r()) {
            builder.setRequiredNetworkType(1);
        }
        builder.setRequiresDeviceIdle(requirements.x2());
        builder.setRequiresCharging(requirements.m12534y());
        if (lrht.f23230k >= 26 && requirements.ni7()) {
            builder.setRequiresStorageNotLow(true);
        }
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(f21200n, str);
        persistableBundle.putString(f21199g, str2);
        persistableBundle.putInt("requirements", requirements.f7l8());
        builder.setExtras(persistableBundle);
        return builder.build();
    }

    @Override // com.google.android.exoplayer2.scheduler.InterfaceC3560n
    public boolean cancel() {
        this.f65319zy.cancel(this.f21203k);
        return true;
    }

    @Override // com.google.android.exoplayer2.scheduler.InterfaceC3560n
    /* JADX INFO: renamed from: k */
    public boolean mo12536k(Requirements requirements, String str, String str2) {
        return this.f65319zy.schedule(zy(this.f21203k, this.f65318toq, requirements, str2, str)) == 1;
    }

    @Override // com.google.android.exoplayer2.scheduler.InterfaceC3560n
    public Requirements toq(Requirements requirements) {
        return requirements.toq(f21202y);
    }
}
