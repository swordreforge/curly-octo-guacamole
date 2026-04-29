package com.market.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.market.sdk.utils.C5010k;
import com.xiaomi.market.IAppDownloadManager;
import zy.dd;

/* JADX INFO: compiled from: FloatCardManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class n7h {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f68915toq = "&overlayPosition=";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile n7h f68916zy;

    /* JADX INFO: renamed from: k */
    @dd
    private String f28089k;

    /* JADX INFO: renamed from: com.market.sdk.n7h$k */
    /* JADX INFO: compiled from: FloatCardManager.java */
    class RunnableC4980k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ IAppDownloadManager f28090k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f28092q;

        RunnableC4980k(IAppDownloadManager iAppDownloadManager, String str) {
            this.f28090k = iAppDownloadManager;
            this.f28092q = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28090k.pause(n7h.this.m17327g(Uri.parse(this.f28092q), "packageName"), C5010k.toq().getPackageName());
            } catch (RemoteException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.n7h$q */
    /* JADX INFO: compiled from: FloatCardManager.java */
    class RunnableC4981q implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ IAppDownloadManager f28093k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f28095q;

        RunnableC4981q(IAppDownloadManager iAppDownloadManager, String str) {
            this.f28093k = iAppDownloadManager;
            this.f28095q = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28093k.resume(n7h.this.m17327g(Uri.parse(this.f28095q), "packageName"), C5010k.toq().getPackageName());
            } catch (RemoteException unused) {
            }
        }
    }

    /* JADX INFO: compiled from: FloatCardManager.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ IAppDownloadManager f28096k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f28098q;

        toq(IAppDownloadManager iAppDownloadManager, String str) {
            this.f28096k = iAppDownloadManager;
            this.f28098q = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28096k.pause(n7h.this.m17327g(Uri.parse(this.f28098q), "packageName"), C5010k.toq().getPackageName());
            } catch (RemoteException unused) {
            }
        }
    }

    /* JADX INFO: compiled from: FloatCardManager.java */
    class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ IAppDownloadManager f28099k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f28101q;

        zy(IAppDownloadManager iAppDownloadManager, String str) {
            this.f28099k = iAppDownloadManager;
            this.f28101q = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28099k.resume(n7h.this.m17327g(Uri.parse(this.f28101q), "packageName"), C5010k.toq().getPackageName());
            } catch (RemoteException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public String m17327g(Uri uri, String str) {
        return (uri == null || !uri.isHierarchical()) ? "" : uri.getQueryParameter(str);
    }

    /* JADX INFO: renamed from: n */
    public static n7h m17329n(Application application) {
        if (f68916zy == null) {
            synchronized (n7h.class) {
                if (f68916zy == null) {
                    f68916zy = new n7h();
                }
            }
        }
        return f68916zy;
    }

    public boolean f7l8(Activity activity, int i2) {
        try {
            FloatService.openService(C5010k.toq(), this.f28089k).lifecycleChanged(activity.toString(), i2);
            return true;
        } catch (Exception e2) {
            Log.e(MarketManager.f27964n, e2.toString());
            return false;
        }
    }

    @Deprecated
    public boolean ld6(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (i2 != 1 && i2 != -1) {
            i2 = 1;
        }
        String str2 = str + f68915toq + i2;
        try {
            IAppDownloadManager iAppDownloadManagerOpenService = FloatService.openService(C5010k.toq(), this.f28089k);
            if (MarketManager.qrj().cdj(EnumC4976i.FLOAT_CARD)) {
                iAppDownloadManagerOpenService.resumeByUri(Uri.parse(str2));
            } else {
                new Thread(new zy(iAppDownloadManagerOpenService, str2)).start();
            }
            return true;
        } catch (Exception e2) {
            Log.e(MarketManager.f27964n, e2.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m17330p(String str) {
        if (!TextUtils.isEmpty(str) && str.contains(f68915toq)) {
            try {
                IAppDownloadManager iAppDownloadManagerOpenService = FloatService.openService(C5010k.toq(), this.f28089k);
                if (MarketManager.qrj().cdj(EnumC4976i.FLOAT_CARD)) {
                    iAppDownloadManagerOpenService.resumeByUri(Uri.parse(str));
                    return true;
                }
                new Thread(new RunnableC4981q(iAppDownloadManagerOpenService, str)).start();
                return true;
            } catch (Exception e2) {
                Log.e(MarketManager.f27964n, e2.toString());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public boolean m17331q(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            FloatService.openService(C5010k.toq(), this.f28089k).downloadByUri(Uri.parse(str));
            return true;
        } catch (Exception e2) {
            Log.e(MarketManager.f27964n, e2.toString());
            return false;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public boolean m17332s(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (i2 != 1 && i2 != -1) {
            i2 = 1;
        }
        String str2 = str + f68915toq + i2;
        try {
            IAppDownloadManager iAppDownloadManagerOpenService = FloatService.openService(C5010k.toq(), this.f28089k);
            if (MarketManager.qrj().cdj(EnumC4976i.FLOAT_CARD)) {
                iAppDownloadManagerOpenService.pauseByUri(Uri.parse(str2));
            } else {
                new Thread(new RunnableC4980k(iAppDownloadManagerOpenService, str2)).start();
            }
            return true;
        } catch (Exception e2) {
            Log.e(MarketManager.f27964n, e2.toString());
            return false;
        }
    }

    public boolean toq(String str) {
        if (!TextUtils.isEmpty(str) && str.contains(f68915toq)) {
            try {
                FloatService.openService(C5010k.toq(), this.f28089k).downloadByUri(Uri.parse(str));
                return true;
            } catch (Exception e2) {
                Log.e(MarketManager.f27964n, e2.toString());
            }
        }
        return false;
    }

    public void x2(boolean z2) {
        if (miuix.os.toq.f40717k && z2) {
            this.f28089k = "com.xiaomi.mipicks";
        } else {
            Log.e(MarketManager.f27964n, "you can only set target market package name in international build!");
        }
    }

    /* JADX INFO: renamed from: y */
    public boolean m17333y(String str) {
        if (!TextUtils.isEmpty(str) && str.contains(f68915toq)) {
            try {
                IAppDownloadManager iAppDownloadManagerOpenService = FloatService.openService(C5010k.toq(), this.f28089k);
                if (MarketManager.qrj().cdj(EnumC4976i.FLOAT_CARD)) {
                    iAppDownloadManagerOpenService.pauseByUri(Uri.parse(str));
                    return true;
                }
                new Thread(new toq(iAppDownloadManagerOpenService, str)).start();
                return true;
            } catch (Exception e2) {
                Log.e(MarketManager.f27964n, e2.toString());
            }
        }
        return false;
    }

    @Deprecated
    public boolean zy(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (i2 != 1 && i2 != -1) {
            i2 = 1;
        }
        try {
            FloatService.openService(C5010k.toq(), this.f28089k).downloadByUri(Uri.parse(str + f68915toq + i2));
            return true;
        } catch (Exception e2) {
            Log.e(MarketManager.f27964n, e2.toString());
            return false;
        }
    }
}
