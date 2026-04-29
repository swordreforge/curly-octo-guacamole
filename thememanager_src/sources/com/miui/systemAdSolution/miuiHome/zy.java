package com.miui.systemAdSolution.miuiHome;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import java.util.List;
import m2t.C6794k;

/* JADX INFO: compiled from: MiuiHomeDownloadActivateManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72508toq = "MiuiHomeDownloadActivateManager";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static volatile zy f72509zy;

    /* JADX INFO: renamed from: k */
    private Context f29858k;

    private zy(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f29858k = applicationContext;
        if (applicationContext == null) {
            this.f29858k = context;
        }
    }

    /* JADX INFO: renamed from: k */
    private Intent m18192k() {
        Intent intent = new Intent("miui.intent.action.ad.MIUI_HOME_DOWNLOAD_ACTIVATE");
        intent.setPackage(C6794k.f38036k);
        return intent;
    }

    /* JADX INFO: renamed from: q */
    private boolean m18193q() {
        List<ResolveInfo> listQueryIntentServices = this.f29858k.getPackageManager().queryIntentServices(m18192k(), 0);
        return (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) ? false : true;
    }

    public static zy toq(Context context) {
        if (f72509zy == null) {
            synchronized (zy.class) {
                if (f72509zy == null) {
                    f72509zy = new zy(context);
                }
            }
        }
        return f72509zy;
    }

    private int zy() {
        Integer numLd6;
        if (m18193q() && (numLd6 = new C5347k(this, this.f29858k, IMiuiHomeDownloadActivateService.class).ld6(m18192k())) != null) {
            return numLd6.intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public boolean m18194n() {
        Boolean boolLd6;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new RuntimeException("ShowDownloadNotification should not run on main thread.");
        }
        if (!m18193q() || zy() < 1 || (boolLd6 = new toq(this, this.f29858k, IMiuiHomeDownloadActivateService.class).ld6(m18192k())) == null) {
            return false;
        }
        return boolLd6.booleanValue();
    }
}
