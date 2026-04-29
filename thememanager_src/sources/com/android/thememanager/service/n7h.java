package com.android.thememanager.service;

import android.annotation.SuppressLint;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.provider.Settings;
import com.android.thememanager.controller.online.EnumC1933t;
import miuix.android.content.C6824k;

/* JADX INFO: compiled from: SyncFavTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class n7h extends AsyncTask<Void, Void, Void> {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f60766zy = "last_check_favorite_time";

    /* JADX INFO: renamed from: k */
    @SuppressLint({"StaticFieldLeak"})
    private ThemeSchedulerService f14838k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final JobParameters f60767toq;

    n7h(ThemeSchedulerService service, JobParameters param) {
        this.f14838k = service;
        this.f60767toq = param;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Void doInBackground(Void... voids) {
        Context qVar = bf2.toq.toq();
        if (Settings.System.getInt(qVar.getContentResolver(), C6824k.eklw, 0) != 0) {
            return null;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(qVar);
        long j2 = defaultSharedPreferences.getLong(f60766zy, 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - j2 <= 86400000) {
            return null;
        }
        EnumC1933t.FAVORITE.syncWithServerIfNeed();
        defaultSharedPreferences.edit().putLong(f60766zy, jCurrentTimeMillis).apply();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Void aVoid) {
        this.f14838k.jobFinished(this.f60767toq, false);
        this.f14838k = null;
    }
}
