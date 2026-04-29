package com.miui.msa.api.landingPage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.miui.systemAdSolution.landingPageV2.listener.IActionTaskResultListener;
import com.miui.systemAdSolution.landingPageV2.service.ILandingPageServiceV2;
import com.miui.systemAdSolution.landingPageV2.task.action.Action;
import java.util.List;

/* JADX INFO: renamed from: com.miui.msa.api.landingPage.g */
/* JADX INFO: compiled from: RemoteProxy.java */
/* JADX INFO: loaded from: classes3.dex */
class C5311g {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f72437f7l8 = "com.miui.systemAdSolution";

    /* JADX INFO: renamed from: g */
    private static final String f29711g = "miui.intent.action.ad.LANDING_PAGE_SERVICEV2";

    /* JADX INFO: renamed from: n */
    public static final String f29712n = "RemoteProxy";

    /* JADX INFO: renamed from: y */
    private static final long f29713y = 1000;

    /* JADX INFO: renamed from: k */
    private Context f29714k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ILandingPageServiceV2 f72438toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Object f72439zy = new Object();

    /* JADX INFO: renamed from: q */
    private ServiceConnection f29715q = new ServiceConnectionC5313n(this);

    public C5311g(Context context) {
        this.f29714k = context;
        m18088q();
    }

    private Intent f7l8() {
        Intent intent = new Intent();
        intent.setAction(f29711g);
        intent.setPackage("com.miui.systemAdSolution");
        return intent;
    }

    private boolean ld6() throws InterruptedException {
        x2();
        if (m18085s()) {
            return true;
        }
        this.f72439zy.wait(1000L);
        return m18085s();
    }

    /* JADX INFO: renamed from: p */
    private boolean m18084p(Context context) {
        List<ResolveInfo> listQueryIntentServices;
        try {
            Intent intentF7l8 = f7l8();
            if (context != null && context.getPackageManager() != null && (listQueryIntentServices = context.getPackageManager().queryIntentServices(intentF7l8, 0)) != null && listQueryIntentServices.size() > 0) {
                Log.d(f29712n, "find the ad service in systemAdSolution.");
                return true;
            }
        } catch (Exception e2) {
            Log.e(f29712n, "some exceptions occur when judge if there is the system ad app.", e2);
        }
        Log.e(f29712n, "there is no a systemAdSolution app.");
        return false;
    }

    /* JADX INFO: renamed from: s */
    private boolean m18085s() {
        return m18084p(this.f29714k) && this.f72438toq != null;
    }

    private void x2() {
        if (this.f72438toq == null) {
            m18088q();
        }
    }

    /* JADX INFO: renamed from: g */
    public EnumC5312k m18086g(String str) {
        try {
        } catch (Exception e2) {
            Log.e(f29712n, "cancelTask e : ", e2);
            m18088q();
        }
        synchronized (this.f72439zy) {
            if (!ld6()) {
                return EnumC5312k.UNKNOWN;
            }
            return EnumC5312k.values()[this.f72438toq.getPackageDownloadStatus(str)];
        }
    }

    /* JADX INFO: renamed from: n */
    public void m18087n(List<Action> list, IActionTaskResultListener iActionTaskResultListener) {
        try {
            synchronized (this.f72439zy) {
                if (ld6()) {
                    this.f72438toq.executeTask(list, iActionTaskResultListener);
                }
            }
        } catch (Exception e2) {
            Log.e(f29712n, "executeTask e : ", e2);
            m18088q();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m18088q() {
        if (m18084p(this.f29714k)) {
            try {
                this.f29714k.bindService(f7l8(), this.f29715q, 1);
            } catch (Exception e2) {
                Log.e(f29712n, "could not bind the service.", e2);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public int m18089y() {
        try {
            synchronized (this.f72439zy) {
                if (!ld6()) {
                    return 0;
                }
                return this.f72438toq.getServiceVersion();
            }
        } catch (Exception e2) {
            Log.e(f29712n, "getServiceVersion e : ", e2);
            m18088q();
            return 0;
        }
    }

    public void zy(String str) {
        try {
            synchronized (this.f72439zy) {
                if (ld6()) {
                    this.f72438toq.cancelTask(str);
                }
            }
        } catch (Exception e2) {
            Log.e(f29712n, "cancelTask e : ", e2);
            m18088q();
        }
    }
}
