package com.android.thememanager.basemodule.async;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.async.n */
/* JADX INFO: compiled from: UniqueAsyncTask.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAsyncTaskC1713n<Params, Progress, Result> extends AbstractAsyncTaskC1714q<Params, Progress, Result> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f57505toq;

    public AbstractAsyncTaskC1713n() {
        this.f57505toq = String.valueOf(super.hashCode());
    }

    public boolean equals(Object o2) {
        if (o2 instanceof AbstractAsyncTaskC1713n) {
            return this.f57505toq.equals(((AbstractAsyncTaskC1713n) o2).f57505toq);
        }
        return false;
    }

    public int hashCode() {
        return this.f57505toq.hashCode();
    }

    /* JADX INFO: renamed from: n */
    public void m6699n(String id) {
        this.f57505toq = id;
    }

    @Override // com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q, android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
        if (mo6421q()) {
            cancel(false);
        }
    }

    /* JADX INFO: renamed from: q */
    protected abstract boolean mo6421q();

    public String zy() {
        return this.f57505toq;
    }

    public AbstractAsyncTaskC1713n(String id) {
        this.f57505toq = id;
    }
}
