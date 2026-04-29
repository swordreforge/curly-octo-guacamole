package com.android.thememanager.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.preference.PreferenceManager;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.ThemeApplication;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.jk;
import com.android.thememanager.miuixcompat.C2206g;
import com.android.thememanager.util.g1;
import com.android.thememanager.util.r8s8;
import com.android.thememanager.util.yz;
import com.android.thememanager.util.zkd;
import com.google.android.exoplayer2.C3548p;
import com.theme.loopwallpaper.controller.AsyncTaskC5438k;
import ek5k.C6002g;
import java.util.ArrayList;
import java.util.List;
import miui.os.Build;
import zy.hyr;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeSchedulerService extends JobService {

    /* JADX INFO: renamed from: c */
    private static final int f14768c = 515;

    /* JADX INFO: renamed from: e */
    private static final int f14769e = 516;

    /* JADX INFO: renamed from: f */
    private static final int f14770f = 514;

    /* JADX INFO: renamed from: g */
    private static final long f14771g = 1216800000;

    /* JADX INFO: renamed from: h */
    private static final int f14772h = 64;

    /* JADX INFO: renamed from: i */
    private static final int f14773i = 128;

    /* JADX INFO: renamed from: j */
    private static final int f14774j = 517;

    /* JADX INFO: renamed from: k */
    private static final String f14775k = "ThemeSchedulerService";

    /* JADX INFO: renamed from: l */
    private static final int f14776l = 513;

    /* JADX INFO: renamed from: n */
    private static final long f14777n = 1209600000;

    /* JADX INFO: renamed from: p */
    private static final int f14778p = 32;

    /* JADX INFO: renamed from: q */
    private static final long f14779q = 43200000;

    /* JADX INFO: renamed from: r */
    private static final int f14780r = 1024;

    /* JADX INFO: renamed from: s */
    private static final long f14781s = 172800000;

    /* JADX INFO: renamed from: t */
    private static final int f14782t = 512;

    /* JADX INFO: renamed from: y */
    private static final long f14783y = 3600000;

    /* JADX INFO: renamed from: z */
    private static final int f14784z = 256;

    public static void cdj() {
        if (Build.IS_TABLET || !zkd.zy()) {
            return;
        }
        ThemeApplication qVar = C2082k.zy().toq();
        if (PreferenceManager.getDefaultSharedPreferences(qVar).getBoolean(zkd.f16922n, true)) {
            JobScheduler jobScheduler = (JobScheduler) qVar.getSystemService("jobscheduler");
            if (jobScheduler == null || m8904p(jobScheduler, 128)) {
                Log.d(f14775k, "IdleUpdateThemeTask:is job existing");
                return;
            }
            JobInfo.Builder builder = new JobInfo.Builder(128, new ComponentName(qVar, (Class<?>) ThemeSchedulerService.class));
            builder.setRequiresDeviceIdle(true);
            builder.setMinimumLatency(43200000L);
            builder.setRequiredNetworkType(2);
            builder.setPersisted(true);
            jobScheduler.schedule(builder.build());
            Log.d(f14775k, "IdleUpdateThemeTask:start schedule");
        }
    }

    public static void f7l8() {
        m8903n(64);
    }

    public static void fn3e(Context context, String packageName) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        JobInfo.Builder builder = new JobInfo.Builder(f14770f, new ComponentName(context, (Class<?>) ThemeSchedulerService.class));
        builder.setRequiredNetworkType(0);
        builder.setOverrideDeadline(com.google.android.exoplayer2.t8r.f65475toq);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("android.intent.extra.PACKAGE_NAME", packageName);
        builder.setTriggerContentMaxDelay(1000L);
        builder.setExtras(persistableBundle);
        Log.i(f14775k, "startMiuixCompartCheck.r= " + jobScheduler.schedule(builder.build()));
    }

    /* JADX INFO: renamed from: g */
    public static void m8899g() {
        m8903n(512);
    }

    /* JADX INFO: renamed from: h */
    public static void m8900h() {
        ThemeApplication themeApplicationM7998k = C2082k.m7998k();
        JobScheduler jobScheduler = (JobScheduler) themeApplicationM7998k.getSystemService("jobscheduler");
        if (jobScheduler == null || m8904p(jobScheduler, 512)) {
            return;
        }
        JobInfo.Builder builder = new JobInfo.Builder(512, new ComponentName(themeApplicationM7998k, (Class<?>) ThemeSchedulerService.class));
        builder.setRequiredNetworkType(1);
        builder.setPeriodic(f14781s);
        builder.setPersisted(true);
        jobScheduler.schedule(builder.build());
    }

    /* JADX INFO: renamed from: i */
    private static boolean m8901i(Integer appointInterval, boolean immediately) {
        int iSchedule;
        ThemeApplication themeApplicationM7998k = C2082k.m7998k();
        JobScheduler jobScheduler = (JobScheduler) themeApplicationM7998k.getSystemService("jobscheduler");
        if (jobScheduler == null || m8904p(jobScheduler, 256)) {
            iSchedule = 0;
        } else {
            JobInfo.Builder builder = new JobInfo.Builder(256, new ComponentName(themeApplicationM7998k, (Class<?>) ThemeSchedulerService.class));
            builder.setRequiredNetworkType(0);
            if (appointInterval == null) {
                appointInterval = Integer.valueOf(com.theme.loopwallpaper.controller.toq.ld6());
            }
            builder.setPeriodic(appointInterval.intValue());
            if (immediately) {
                g1.gyi(com.theme.loopwallpaper.controller.toq.f72561wvg, true);
            } else {
                g1.gyi(com.theme.loopwallpaper.controller.toq.f30297g, true);
            }
            builder.setPersisted(true);
            iSchedule = jobScheduler.schedule(builder.build());
        }
        return iSchedule == 1;
    }

    @hyr(26)
    public static void ki(Context context, String resourceCode, List<Resource> updateList) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        JobInfo.Builder builder = new JobInfo.Builder(513, new ComponentName(context, (Class<?>) ThemeSchedulerService.class));
        builder.setRequiredNetworkType(1);
        Bundle bundle = new Bundle();
        bundle.putString("entryType", com.android.thememanager.basemodule.analysis.f7l8.m6607g());
        bundle.putSerializable("resourceList", new ArrayList(updateList));
        bundle.putString(AsyncTaskC2495k.f14817g, resourceCode);
        builder.setTransientExtras(bundle);
        builder.setTriggerContentMaxDelay(1000L);
        builder.setPersisted(false);
        Log.i(f14775k, "startBatchUpdateDownload. " + jobScheduler.schedule(builder.build()));
    }

    public static void kja0() {
        if (C1807g.m7081r() || !com.android.thememanager.basemodule.privacy.x2.zy()) {
            return;
        }
        ThemeApplication themeApplicationM7998k = C2082k.m7998k();
        JobScheduler jobScheduler = (JobScheduler) themeApplicationM7998k.getSystemService("jobscheduler");
        if (jobScheduler == null || m8904p(jobScheduler, f14774j)) {
            return;
        }
        JobInfo.Builder builder = new JobInfo.Builder(f14774j, new ComponentName(themeApplicationM7998k, (Class<?>) ThemeSchedulerService.class));
        builder.setRequiredNetworkType(1);
        builder.setPersisted(false);
        Log.i(f14775k, "setDownloadFontAdSchedule. " + jobScheduler.schedule(builder.build()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ld6(String[] strArr, JobParameters jobParameters) {
        for (String str : strArr) {
            boolean zM8309n = C2206g.m8309n(str);
            if (!zM8309n) {
                zM8309n = C2206g.toq(str);
            }
            Log.d(f14775k, "onStartJob: checkMiuiCompatible = " + zM8309n + "," + str);
            StringBuilder sb = new StringBuilder();
            sb.append("job scheduler , update finished,");
            sb.append(str);
            C2206g.o1t(zM8309n, "UNKNOWN", sb.toString());
            C2206g.jk(zM8309n, "job scheduler , update finished," + a9.m7000y(bf2.toq.toq(), str), str);
        }
        jobFinished(jobParameters, false);
    }

    /* JADX INFO: renamed from: n */
    private static void m8903n(int jobId) {
        JobScheduler jobScheduler = (JobScheduler) C2082k.zy().toq().getSystemService("jobscheduler");
        if (jobScheduler == null || !m8904p(jobScheduler, jobId)) {
            return;
        }
        jobScheduler.cancel(jobId);
        Log.d(f14775k, "cancelSchedulerJob" + jobId);
    }

    public static void n7h() {
        ThemeApplication themeApplicationM7998k = C2082k.m7998k();
        JobScheduler jobScheduler = (JobScheduler) themeApplicationM7998k.getSystemService("jobscheduler");
        if (jobScheduler == null || m8904p(jobScheduler, 32)) {
            return;
        }
        JobInfo.Builder builder = new JobInfo.Builder(32, new ComponentName(themeApplicationM7998k, (Class<?>) ThemeSchedulerService.class));
        builder.setRequiresDeviceIdle(true);
        builder.setRequiredNetworkType(1);
        builder.setPeriodic(43200000L);
        builder.setPersisted(true);
        jobScheduler.schedule(builder.build());
    }

    /* JADX INFO: renamed from: p */
    private static boolean m8904p(JobScheduler jobScheduler, int jobId) {
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        if (allPendingJobs != null) {
            for (JobInfo jobInfo : allPendingJobs) {
                if (jobInfo != null && jobInfo.getId() == jobId) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static void m8905q() {
        m8903n(256);
    }

    public static void qrj() {
        ThemeApplication themeApplicationM7998k = C2082k.m7998k();
        JobScheduler jobScheduler = (JobScheduler) themeApplicationM7998k.getSystemService("jobscheduler");
        if (jobScheduler == null || m8904p(jobScheduler, f14769e)) {
            return;
        }
        JobInfo.Builder builder = new JobInfo.Builder(f14769e, new ComponentName(themeApplicationM7998k, (Class<?>) ThemeSchedulerService.class));
        builder.setRequiredNetworkType(1);
        builder.setPersisted(false);
        builder.setTriggerContentMaxDelay(com.google.android.exoplayer2.t8r.f65475toq);
        Log.i(f14775k, "setCheckFavSchedule. " + jobScheduler.schedule(builder.build()));
    }

    /* JADX INFO: renamed from: s */
    public static boolean m8906s(Integer appointInterval, boolean immediately) {
        m8905q();
        return m8901i(appointInterval, immediately);
    }

    public static void t8r(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        JobInfo.Builder builder = new JobInfo.Builder(f14768c, new ComponentName(context, (Class<?>) ThemeSchedulerService.class));
        builder.setRequiredNetworkType(0);
        builder.setOverrideDeadline(com.google.android.exoplayer2.t8r.f65475toq);
        builder.setTriggerContentMaxDelay(1000L);
        Log.i(f14775k, "startCopyPrecustThemes.r= " + jobScheduler.schedule(builder.build()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x2(JobParameters jobParameters) {
        ((com.android.thememanager.controller.qrj) C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().m10536k()).m7690k()).kja0();
        jobFinished(jobParameters, false);
    }

    /* JADX INFO: renamed from: y */
    public static void m8907y() {
        m8903n(128);
    }

    public static boolean zurt(Integer appointInterval, boolean immediately) {
        return m8901i(appointInterval, immediately);
    }

    public static void zy() {
        ThemeApplication themeApplicationM7998k = C2082k.m7998k();
        JobScheduler jobScheduler = (JobScheduler) themeApplicationM7998k.getSystemService("jobscheduler");
        if (jobScheduler == null || m8904p(jobScheduler, 1024)) {
            return;
        }
        JobInfo.Builder builder = new JobInfo.Builder(1024, new ComponentName(themeApplicationM7998k, (Class<?>) ThemeSchedulerService.class));
        builder.setPeriodic(C3548p.f65176gcp);
        builder.setPersisted(true);
        jobScheduler.schedule(builder.build());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters params) {
        if (params == null) {
            return false;
        }
        Log.i(f14775k, "onStartJob. " + params.getJobId());
        int jobId = params.getJobId();
        if (jobId == 32) {
            new toq(this, params).executeOnExecutor(C6002g.x2(), new Void[0]);
            return true;
        }
        if (jobId == 64) {
            if (params.getExtras() != null) {
                String string = params.getExtras().getString(r8s8.f16780y);
                String string2 = params.getExtras().getString(r8s8.f16778s);
                Notification.Builder contentText = new Notification.Builder(this).setSmallIcon(params.getExtras().getInt(r8s8.f16772i)).setContentTitle(params.getExtras().getString("title")).setContentText(params.getExtras().getString(r8s8.f16771h));
                Intent intentM9975q = r8s8.m9975q(string, false);
                intentM9975q.putExtra("REQUEST_RESOURCE_CODE", string2);
                contentText.setContentIntent(PendingIntent.getActivity(this, 0, intentM9975q, 201326592));
                jk.m7104n(this, 2, contentText);
            }
            jobFinished(params, false);
        } else if (jobId == 128) {
            zkd.m10095g();
            jobFinished(params, false);
        } else if (jobId != 256) {
            if (jobId != 1024) {
                switch (jobId) {
                    case 512:
                        yz yzVar = new yz();
                        if (yzVar.x9kr() > f14781s) {
                            yzVar.hyr();
                        }
                        jobFinished(params, false);
                        break;
                    case 513:
                        new AsyncTaskC2495k(this, params).executeOnExecutor(C6002g.x2(), new Void[0]);
                        return true;
                    case f14770f /* 514 */:
                        String string3 = params.getExtras().getString("android.intent.extra.PACKAGE_NAME");
                        if (p029m.zy.toq(string3)) {
                            return true;
                        }
                        final String[] strArrSplit = string3.split(",");
                        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.service.kja0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f14829k.ld6(strArrSplit, params);
                            }
                        });
                        return true;
                    case f14768c /* 515 */:
                        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.service.h
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f14814k.x2(params);
                            }
                        });
                        return true;
                    case f14769e /* 516 */:
                        new n7h(this, params).executeOnExecutor(C6002g.x2(), new Void[0]);
                        return true;
                    case f14774j /* 517 */:
                        C6002g.f7l8(new RunnableC2496n(this, params));
                        return true;
                }
            } else {
                jobFinished(params, false);
            }
        } else {
            if (!g1.x2(com.theme.loopwallpaper.controller.toq.f30297g, false)) {
                if (g1.x2(com.theme.loopwallpaper.controller.toq.f72561wvg, false)) {
                    new AsyncTaskC5438k(this, params, true).executeOnExecutor(C6002g.ld6(), new Void[0]);
                    g1.gyi(com.theme.loopwallpaper.controller.toq.f72561wvg, false);
                } else {
                    new AsyncTaskC5438k(this, params, false).executeOnExecutor(C6002g.ld6(), new Void[0]);
                }
                return true;
            }
            g1.gyi(com.theme.loopwallpaper.controller.toq.f30297g, false);
            jobFinished(params, false);
        }
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters params) {
        return false;
    }
}
