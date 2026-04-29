package com.android.thememanager.router.detail.callback;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes2.dex */
public interface StartCommentEditActivityListener {
    void onPostExecute(AsyncTask<?, ?, ?> asyncTask, boolean result);

    void onPreExecute(AsyncTask<?, ?, ?> asyncTask);
}
