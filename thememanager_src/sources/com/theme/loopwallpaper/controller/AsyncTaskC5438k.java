package com.theme.loopwallpaper.controller;

import android.annotation.SuppressLint;
import android.app.job.JobParameters;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.service.ThemeSchedulerService;

/* JADX INFO: renamed from: com.theme.loopwallpaper.controller.k */
/* JADX INFO: compiled from: LoopWallpaperTask.java */
/* JADX INFO: loaded from: classes3.dex */
public class AsyncTaskC5438k extends AsyncTask<Void, Void, Boolean> {

    /* JADX INFO: renamed from: q */
    private static final String f30295q = "LoopWallpaperTask";

    /* JADX INFO: renamed from: k */
    @SuppressLint({"StaticFieldLeak"})
    private ThemeSchedulerService f30296k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final JobParameters f72533toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final boolean f72534zy;

    public AsyncTaskC5438k(ThemeSchedulerService service, JobParameters param, boolean firstLoop) {
        this.f30296k = service;
        this.f72533toq = param;
        this.f72534zy = firstLoop;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Void... voids) throws Throwable {
        Context qVar = bf2.toq.toq();
        if (!this.f72534zy) {
            toq.n7h();
        }
        toq.m18516y().m18518i(0, this.f72534zy);
        if (C1819o.ncyb(qVar)) {
            Log.d(f30295q, "don`t change desk wallpaper because landscape");
            return Boolean.TRUE;
        }
        toq.m18516y().m18518i(1, this.f72534zy);
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean re) {
        this.f30296k.jobFinished(this.f72533toq, re.booleanValue());
        this.f30296k = null;
    }
}
