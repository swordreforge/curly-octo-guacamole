package com.android.thememanager.util;

import android.app.Activity;
import android.content.res.MiuiConfiguration;
import android.os.AsyncTask;
import com.android.thememanager.R;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: RecoveryThemeForOtaTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class a98o extends AsyncTask<Void, Integer, Boolean> {

    /* JADX INFO: renamed from: k */
    private WeakReference<Activity> f16311k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private miuix.appcompat.app.dd f61196toq;

    public a98o(Activity activity) {
        this.f16311k = new WeakReference<>(activity);
    }

    /* JADX INFO: renamed from: k */
    private void m9606k(Activity activity) {
        miuix.appcompat.app.dd ddVar;
        if (activity == null || (ddVar = this.f61196toq) == null) {
            return;
        }
        ddVar.dismiss();
    }

    private boolean zy(Activity activity) {
        return activity != null && activity.getComponentName().getClassName().contains("OtaUpdateDialogActivity");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        this.f61196toq.lv5(values[0].intValue());
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        Activity activity = this.f16311k.get();
        if (activity != null) {
            miuix.appcompat.app.dd ddVar = new miuix.appcompat.app.dd(activity);
            this.f61196toq = ddVar;
            ddVar.y2(1);
            this.f61196toq.nmn5(100);
            this.f61196toq.n5r1(activity.getString(R.string.theme_changing_dialog_title));
            this.f61196toq.setCancelable(false);
            this.f61196toq.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean aBoolean) {
        super.onPostExecute(aBoolean);
        Activity activity = this.f16311k.get();
        m9606k(activity);
        if (zy(activity)) {
            activity.finish();
        }
        g1.qo(true, false, false);
        MiuiConfiguration.sendThemeConfigurationChangeMsg(268466329L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Void... voids) {
        this.f16311k.get();
        if (!new File(yz.w97r).exists()) {
            return Boolean.FALSE;
        }
        publishProgress(50);
        new yz().m10091l();
        publishProgress(100);
        return Boolean.TRUE;
    }
}
