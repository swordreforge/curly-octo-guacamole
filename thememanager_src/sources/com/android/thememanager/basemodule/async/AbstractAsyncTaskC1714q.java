package com.android.thememanager.basemodule.async;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.async.q */
/* JADX INFO: compiled from: ObservableAsyncTask.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAsyncTaskC1714q<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {

    /* JADX INFO: renamed from: k */
    private List<toq<Params, Progress, Result>> f9838k = new ArrayList();

    /* JADX INFO: renamed from: k */
    public void m6700k(toq<Params, Progress, Result> observer) {
        if (observer != null) {
            this.f9838k.add(observer);
        }
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        super.onCancelled();
        synchronized (this.f9838k) {
            Iterator<toq<Params, Progress, Result>> it = this.f9838k.iterator();
            while (it.hasNext()) {
                it.next().ch();
            }
        }
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(Result result) {
        super.onPostExecute(result);
        synchronized (this.f9838k) {
            Iterator<toq<Params, Progress, Result>> it = this.f9838k.iterator();
            while (it.hasNext()) {
                it.next().ij(result);
            }
        }
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
        synchronized (this.f9838k) {
            Iterator<toq<Params, Progress, Result>> it = this.f9838k.iterator();
            while (it.hasNext()) {
                it.next().n7h();
            }
        }
    }

    @Override // android.os.AsyncTask
    protected void onProgressUpdate(Progress... values) {
        super.onProgressUpdate(values);
        synchronized (this.f9838k) {
            Iterator<toq<Params, Progress, Result>> it = this.f9838k.iterator();
            while (it.hasNext()) {
                it.next().py(values);
            }
        }
    }

    public void toq(toq<Params, Progress, Result> observer) {
        if (observer != null) {
            this.f9838k.remove(observer);
        }
    }
}
