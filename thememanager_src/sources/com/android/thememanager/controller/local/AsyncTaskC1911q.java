package com.android.thememanager.controller.local;

import android.app.Activity;
import android.os.AsyncTask;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.detail.theme.util.C1976k;
import com.android.thememanager.util.gc3c;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import miuix.appcompat.app.dd;

/* JADX INFO: renamed from: com.android.thememanager.controller.local.q */
/* JADX INFO: compiled from: DeleteResourceTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class AsyncTaskC1911q extends AsyncTask<Void, Void, Void> {

    /* JADX INFO: renamed from: k */
    private dd f10904k;

    /* JADX INFO: renamed from: n */
    private com.android.thememanager.basemodule.local.f7l8 f10905n;

    /* JADX INFO: renamed from: q */
    private C1791k f10906q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private WeakReference<Activity> f57920toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private List<Resource> f57921zy;

    public AsyncTaskC1911q(Activity activity, List<Resource> list, C1791k resourceContext, com.android.thememanager.basemodule.local.f7l8 listener) {
        this.f57920toq = new WeakReference<>(activity);
        this.f57921zy = list;
        this.f10906q = resourceContext;
        this.f10905n = listener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Void doInBackground(Void... params) {
        if (isCancelled()) {
            return null;
        }
        new com.android.thememanager.controller.x2(C2082k.zy().m8001n().m10537n(this.f10906q)).m7690k().jp0y(this.f57921zy);
        Iterator<Resource> it = this.f57921zy.iterator();
        while (it.hasNext()) {
            C1976k.m7741y().n7h(it.next().getProductId(), false);
        }
        return null;
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        if (gc3c.cdj(this.f57920toq.get())) {
            dd ddVar = new dd(this.f57920toq.get());
            this.f10904k = ddVar;
            ddVar.y2(0);
            this.f10904k.n5r1(this.f57920toq.get().getString(R.string.deleting));
            this.f10904k.setCancelable(false);
            this.f10904k.show();
        }
        C1976k.m7741y();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Void result) {
        if (gc3c.cdj(this.f57920toq.get())) {
            this.f10904k.dismiss();
            com.android.thememanager.basemodule.local.f7l8 f7l8Var = this.f10905n;
            if (f7l8Var != null) {
                f7l8Var.mo6814k();
            }
        }
    }
}
