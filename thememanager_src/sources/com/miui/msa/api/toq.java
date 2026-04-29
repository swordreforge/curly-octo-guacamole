package com.miui.msa.api;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.miui.systemAdSolution.splashAd.IAdListener;
import com.miui.systemAdSolution.splashAd.ISystemSplashAdService;
import java.util.List;

/* JADX INFO: compiled from: RemoteSystemSplashAdService.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f72462f7l8 = "com.miui.systemAdSolution";

    /* JADX INFO: renamed from: g */
    private static final String f29739g = "miui.intent.action.ad.SYSTEM_SPLASH_AD_SERVICE";

    /* JADX INFO: renamed from: p */
    private static long f29740p = 0;

    /* JADX INFO: renamed from: s */
    private static toq f29741s = null;

    /* JADX INFO: renamed from: y */
    private static final String f29742y = "RemoteSplashAdService";

    /* JADX INFO: renamed from: k */
    private Context f29743k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    boolean f72463toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private ISystemSplashAdService f72464zy = null;

    /* JADX INFO: renamed from: q */
    private boolean f29745q = false;

    /* JADX INFO: renamed from: n */
    private ServiceConnection f29744n = new ServiceConnectionC5310k(this);

    private toq(Context context) {
        this.f72463toq = false;
        if (context != null) {
            this.f29743k = context.getApplicationContext();
        }
        this.f72463toq = m18112y(context);
        m18111q();
    }

    /* JADX INFO: renamed from: g */
    public static synchronized toq m18108g(Context context) {
        if (f29741s == null) {
            f29741s = new toq(context);
        }
        return f29741s;
    }

    /* JADX INFO: renamed from: n */
    private Intent m18110n() {
        Intent intent = new Intent();
        intent.setAction(f29739g);
        intent.setPackage("com.miui.systemAdSolution");
        return intent;
    }

    /* JADX INFO: renamed from: q */
    private void m18111q() {
        if (this.f72463toq) {
            try {
                this.f29743k.bindService(m18110n(), this.f29744n, 1);
                f29740p = System.currentTimeMillis();
                Log.d(f29742y, "start bind service " + f29740p);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private boolean m18112y(Context context) {
        List<ResolveInfo> listQueryIntentServices;
        try {
            Intent intentM18110n = m18110n();
            if (context != null && context.getPackageManager() != null && (listQueryIntentServices = context.getPackageManager().queryIntentServices(intentM18110n, 0)) != null && listQueryIntentServices.size() > 0) {
                Log.d(f29742y, "find the ad service in systemAdSolution!");
                return true;
            }
        } catch (Exception unused) {
        }
        Log.d(f29742y, "there is no a systemAdSolution app!");
        return false;
    }

    public boolean f7l8() {
        return this.f72463toq && this.f72464zy != null;
    }

    /* JADX INFO: renamed from: p */
    boolean m18113p(IAdListener iAdListener) {
        Context context;
        try {
            if (f7l8() && (context = this.f29743k) != null && this.f72464zy.requestSplashAd(context.getPackageName(), iAdListener)) {
                Log.d(f29742y, "requesting system splash ad success!");
                return true;
            }
            Log.d(f29742y, "requesting system splash ad failed!");
            return false;
        } catch (Throwable th) {
            Log.e(f29742y, "a exception occuors when requesting a system splash ad!", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m18114s() {
        if (this.f29745q && this.f72464zy == null) {
            m18111q();
        }
    }
}
