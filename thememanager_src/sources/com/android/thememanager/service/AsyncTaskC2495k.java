package com.android.thememanager.service;

import android.annotation.SuppressLint;
import android.app.job.JobParameters;
import android.os.AsyncTask;
import android.os.Bundle;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.analysis.zy;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.fu4;
import com.android.thememanager.o1t;
import java.util.List;
import zy.hyr;

/* JADX INFO: renamed from: com.android.thememanager.service.k */
/* JADX INFO: compiled from: BatchUpdateTask.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(26)
public class AsyncTaskC2495k extends AsyncTask<Void, Void, Void> {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f60763f7l8 = "entryType";

    /* JADX INFO: renamed from: g */
    public static final String f14817g = "resourceCode";

    /* JADX INFO: renamed from: y */
    public static final String f14818y = "resourceList";

    /* JADX INFO: renamed from: k */
    @SuppressLint({"StaticFieldLeak"})
    private ThemeSchedulerService f14819k;

    /* JADX INFO: renamed from: n */
    private List<Resource> f14820n;

    /* JADX INFO: renamed from: q */
    private String f14821q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final JobParameters f60764toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f60765zy;

    AsyncTaskC2495k(ThemeSchedulerService service, JobParameters param) {
        this.f14819k = service;
        this.f60764toq = param;
        Bundle transientExtras = param.getTransientExtras();
        this.f60765zy = transientExtras.getString("entryType");
        this.f14821q = transientExtras.getString(f14817g);
        this.f14820n = (List) transientExtras.getSerializable("resourceList");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Void doInBackground(Void... voids) throws Throwable {
        zy.C1711k c1711k = new zy.C1711k();
        c1711k.f9808n = true;
        c1711k.f57496toq = com.android.thememanager.basemodule.analysis.toq.wvka;
        c1711k.f57497zy = "";
        c1711k.f9807k = this.f60765zy;
        o1t o1tVarM8000g = C2082k.zy().m8000g();
        fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g(this.f14821q);
        for (Resource resource : this.f14820n) {
            if (!o1tVarM8000g.n7h(resource)) {
                o1tVarM8000g.m8431g(resource, fu4VarM10535g, c1711k, false);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Void aVoid) {
        this.f14819k.jobFinished(this.f60764toq, false);
    }
}
