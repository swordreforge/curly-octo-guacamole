package com.android.thememanager.service;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.ThemeResourceProxyTabActivity;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.jk;
import com.android.thememanager.controller.C1900g;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.util.ch;
import java.util.List;
import miuix.android.content.C6824k;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: DailyCheckTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq extends AsyncTask<Void, Void, Boolean> {

    /* JADX INFO: renamed from: k */
    @SuppressLint({"StaticFieldLeak"})
    private ThemeSchedulerService f14869k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final JobParameters f60773toq;

    toq(ThemeSchedulerService service, JobParameters param) {
        this.f14869k = service;
        this.f60773toq = param;
    }

    /* JADX INFO: renamed from: k */
    private void m8960k(Context appContext) {
        com.android.thememanager.controller.ld6 ld6VarM7690k = new com.android.thememanager.controller.x2(C2082k.zy().m8001n().m10535g("theme")).m7690k();
        List<Resource> listCdj = ld6VarM7690k.cdj(false, false);
        int iX2 = ld6VarM7690k.x2();
        Log.d(C2755a.f16307g, "Daily check for update: " + iX2 + "/" + listCdj.size());
        ch.lv5(appContext, iX2, true);
        if (iX2 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addFlags(268468224);
            intent.setAction(ThemeResourceProxyTabActivity.bl);
            intent.setPackage(bf2.toq.toq().getPackageName());
            intent.putExtra(InterfaceC1357q.f53967yl, "mine");
            intent.putExtra(InterfaceC1357q.f53961wx16, InterfaceC1357q.f53920nme);
            PendingIntent activity = PendingIntent.getActivity(appContext, 0, intent, 1275068416);
            String quantityString = appContext.getResources().getQuantityString(R.plurals.theme_update_local_resource_notifaction, iX2, Integer.valueOf(iX2));
            NotificationManager notificationManager = (NotificationManager) appContext.getSystemService(com.android.thememanager.basemodule.analysis.toq.mle);
            Notification.Builder builder = new Notification.Builder(appContext);
            builder.setSmallIcon(R.drawable.notification_small_icon).setContentIntent(activity).setContentTitle(appContext.getString(R.string.local_notification_update_theme_title)).setContentText(quantityString).setAutoCancel(true);
            Notification qVar = jk.toq(appContext, jk.f57769toq, builder);
            com.android.thememanager.basemodule.utils.cdj.n7h(qVar, iX2);
            notificationManager.notify(ki.f14825p, qVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Void... v2) {
        Context qVar = bf2.toq.toq();
        if (Settings.System.getInt(this.f14869k.getContentResolver(), C6824k.eklw, 0) != 0) {
            return Boolean.TRUE;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(qVar);
        if (System.currentTimeMillis() - defaultSharedPreferences.getLong(ki.f14824n, 0L) > 86400000 && C1915g.m7550n()) {
            SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
            editorEdit.putLong(ki.f14824n, System.currentTimeMillis());
            editorEdit.apply();
            if (!C1807g.lvui()) {
                m8960k(qVar);
                ki.toq(qVar);
            }
            ki.m8939s();
            C1900g.zy().m7463s(false);
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean re) {
        this.f14869k.jobFinished(this.f60773toq, re.booleanValue());
        this.f14869k = null;
    }
}
