package com.android.thememanager.basemodule.async;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.android.thememanager.basemodule.utils.C1819o;
import miuix.appcompat.app.dd;

/* JADX INFO: compiled from: AsyncTaskWithProgress.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class zy<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {

    /* JADX INFO: renamed from: k */
    private Activity f9839k;

    /* JADX INFO: renamed from: n */
    private long f9840n;

    /* JADX INFO: renamed from: q */
    private String f9841q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Handler f57506toq = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private dd f57507zy;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.async.zy$k */
    /* JADX INFO: compiled from: AsyncTaskWithProgress.java */
    class RunnableC1715k implements Runnable {
        RunnableC1715k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (zy.this.f57507zy == null || zy.this.f9839k.isFinishing()) {
                return;
            }
            zy.this.f57507zy.show();
        }
    }

    public zy(Activity activity) {
        this.f9839k = activity;
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(Result result) {
        if (this.f57507zy != null && C1819o.eqxt(this.f9839k)) {
            this.f57507zy.dismiss();
        }
        this.f57507zy = null;
        super.onPostExecute(result);
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
        dd ddVar = new dd(this.f9839k);
        this.f57507zy = ddVar;
        ddVar.y2(0);
        this.f57507zy.setCancelable(false);
        this.f57507zy.n5r1(this.f9841q);
        if (this.f9840n <= 0) {
            this.f57507zy.show();
        } else {
            this.f57506toq.postDelayed(new RunnableC1715k(), this.f9840n);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m6702q(String msg) {
        this.f9841q = msg;
    }

    public void zy(long delay) {
        this.f9840n = delay;
    }
}
