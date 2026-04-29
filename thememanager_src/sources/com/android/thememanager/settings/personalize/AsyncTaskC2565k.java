package com.android.thememanager.settings.personalize;

import android.os.AsyncTask;
import android.provider.Settings;

/* JADX INFO: renamed from: com.android.thememanager.settings.personalize.k */
/* JADX INFO: compiled from: GetLunarCalendarStateAsyncTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class AsyncTaskC2565k extends AsyncTask<Void, Void, Integer> {

    /* JADX INFO: renamed from: k */
    private String f15255k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private toq f60808toq;

    public AsyncTaskC2565k(String name, toq getLunarCalendarStateCallback) {
        this.f15255k = name;
        this.f60808toq = getLunarCalendarStateCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Integer doInBackground(Void... voids) {
        if (isCancelled()) {
            return null;
        }
        int i2 = 0;
        try {
            i2 = Settings.System.getInt(bf2.toq.toq().getContentResolver(), this.f15255k);
        } catch (Settings.SettingNotFoundException e2) {
            e2.printStackTrace();
        }
        return Integer.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Integer isShowLunarCalendar) {
        toq toqVar = this.f60808toq;
        if (toqVar == null || isShowLunarCalendar == null) {
            return;
        }
        toqVar.m9105k(isShowLunarCalendar.intValue());
    }
}
