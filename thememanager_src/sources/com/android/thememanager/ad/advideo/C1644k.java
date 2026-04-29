package com.android.thememanager.ad.advideo;

import android.content.AsyncTaskLoader;
import android.content.Context;

/* JADX INFO: renamed from: com.android.thememanager.ad.advideo.k */
/* JADX INFO: compiled from: AdBaseAsyncTaskLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class C1644k<D> extends AsyncTaskLoader {
    public C1644k(Context context) {
        super(context);
    }

    @Override // android.content.AsyncTaskLoader
    public D loadInBackground() {
        return null;
    }

    @Override // android.content.Loader
    protected void onStartLoading() {
        super.onStartLoading();
        if (takeContentChanged()) {
            forceLoad();
        }
    }
}
