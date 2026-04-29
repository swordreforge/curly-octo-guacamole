package com.android.thememanager.util;

import android.content.Context;
import android.os.AsyncTask;
import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.service.ThemeSchedulerService;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: BackupThemeForOtaUpdateTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class cdj extends AsyncTask<Void, Void, Integer> implements InterfaceC1789q {

    /* JADX INFO: renamed from: g */
    public static final int f16364g = 0;

    /* JADX INFO: renamed from: n */
    public static final String f16365n = "BackupThemeForOtaUpdateTask";

    /* JADX INFO: renamed from: s */
    public static final int f16366s = 2;

    /* JADX INFO: renamed from: y */
    public static final int f16367y = 1;

    /* JADX INFO: renamed from: k */
    private yz f16368k = new yz();

    /* JADX INFO: renamed from: q */
    private WeakReference<Context> f16369q;

    public cdj(Context context) {
        this.f16369q = new WeakReference<>(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Integer doInBackground(Void... object) throws Throwable {
        Context context = this.f16369q.get();
        if (isCancelled() || context == null) {
            return null;
        }
        String strO1t = C2320q.o1t(context, "theme");
        String strT8r = p001b.toq.t8r("theme");
        if (strT8r != null && strO1t != null && (strT8r.equals(strO1t) || strO1t.startsWith(com.android.thememanager.basemodule.resource.constants.toq.anfo))) {
            return 2;
        }
        if (fn3e.t8r()) {
            return 1;
        }
        this.f16368k.eqxt();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Integer result) {
        if (this.f16369q.get() == null) {
            return;
        }
        this.f16368k.m10092r();
        if (result == null || 1 == result.intValue() || 2 == result.intValue()) {
            return;
        }
        yz yzVar = this.f16368k;
        if (yzVar != null) {
            yzVar.n5r1();
        }
        ThemeSchedulerService.m8900h();
    }
}
