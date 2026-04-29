package com.miui.msa.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.miui.systemAdSolution.splashAd.IAdListener;

/* JADX INFO: renamed from: com.miui.msa.api.n */
/* JADX INFO: compiled from: SystemSplashAd.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5315n {

    /* JADX INFO: renamed from: k */
    private static final String f29735k = "SystemSplashAd";

    /* JADX INFO: renamed from: n */
    private static long f29736n = -1;

    /* JADX INFO: renamed from: q */
    private static Handler f29737q = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final long f72460toq = 500;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static toq f72461zy;

    private C5315n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static void m18104g(IAdListener iAdListener) {
        f72461zy.m18114s();
        toq toqVar = f72461zy;
        if (!toqVar.f72463toq) {
            Log.i(f29735k, "there is no systemAdSolution apk!");
            m18107q(iAdListener);
        } else if (!toqVar.f7l8()) {
            f29737q.post(new RunnableC5316q(iAdListener));
        } else {
            if (f72461zy.m18113p(iAdListener)) {
                return;
            }
            m18107q(iAdListener);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m18106n(Context context, IAdListener iAdListener) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new RuntimeException("this method must be invoked by main thread!");
        }
        if (context == null || iAdListener == null) {
            Log.e(f29735k, "the params is Invalid!");
            throw new IllegalArgumentException("the params is Invalid!");
        }
        if (f72461zy == null) {
            f72461zy = toq.m18108g(context);
        }
        if (f29737q == null) {
            f29737q = new Handler(Looper.getMainLooper());
        }
        f29736n = System.currentTimeMillis();
        m18104g(iAdListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static void m18107q(IAdListener iAdListener) {
        if (iAdListener != null) {
            try {
                iAdListener.onAdError();
            } catch (RemoteException unused) {
            }
        }
    }
}
