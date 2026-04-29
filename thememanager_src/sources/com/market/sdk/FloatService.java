package com.market.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.market.AbstractC4931k;
import com.market.sdk.utils.C5013p;
import com.xiaomi.market.IAppDownloadManager;

/* JADX INFO: loaded from: classes3.dex */
public class FloatService extends AbstractC4931k implements IAppDownloadManager {
    private static final String BIND_SERVICE_ACTION = "com.xiaomi.market.service.AppDownloadService";
    private static final String BIND_SERVICE_NAME = "com.xiaomi.market.data.AppDownloadService";
    private static final String TAG = "FloatService";
    private IAppDownloadManager mAidl;

    class f7l8 implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f27948k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ int f68812toq;

        f7l8(String str, int i2) {
            this.f27948k = str;
            this.f68812toq = i2;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            if (FloatService.this.mAidl != null) {
                FloatService.this.mAidl.lifecycleChanged(this.f27948k, this.f68812toq);
            } else {
                C5013p.m17465q(FloatService.TAG, "IAppDownloadManager is null");
            }
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.FloatService$g */
    class C4945g implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Uri f27949k;

        C4945g(Uri uri) {
            this.f27949k = uri;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            if (FloatService.this.mAidl != null) {
                FloatService.this.mAidl.resumeByUri(this.f27949k);
            } else {
                C5013p.m17465q(FloatService.TAG, "IAppDownloadManager is null");
            }
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.FloatService$k */
    class C4946k implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Bundle f27950k;

        C4946k(Bundle bundle) {
            this.f27950k = bundle;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            if (FloatService.this.mAidl != null) {
                FloatService.this.mAidl.download(this.f27950k);
            } else {
                C5013p.m17465q(FloatService.TAG, "IAppDownloadManager is null");
            }
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.FloatService$n */
    class C4947n implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Uri f27951k;

        C4947n(Uri uri) {
            this.f27951k = uri;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            if (FloatService.this.mAidl != null) {
                FloatService.this.mAidl.pauseByUri(this.f27951k);
            } else {
                C5013p.m17465q(FloatService.TAG, "IAppDownloadManager is null");
            }
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.FloatService$q */
    class C4948q implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Uri f27952k;

        C4948q(Uri uri) {
            this.f27952k = uri;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            if (FloatService.this.mAidl != null) {
                FloatService.this.mAidl.downloadByUri(this.f27952k);
            } else {
                C5013p.m17465q(FloatService.TAG, "IAppDownloadManager is null");
            }
        }
    }

    class toq implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.market.sdk.compat.toq f27953k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f68818toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ String f68819zy;

        toq(com.market.sdk.compat.toq toqVar, String str, String str2) {
            this.f27953k = toqVar;
            this.f68818toq = str;
            this.f68819zy = str2;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            if (FloatService.this.mAidl != null) {
                this.f27953k.set(Boolean.valueOf(FloatService.this.mAidl.pause(this.f68818toq, this.f68819zy)));
            } else {
                C5013p.m17465q(FloatService.TAG, "IAppDownloadManager is null");
            }
        }
    }

    class zy implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.market.sdk.compat.toq f27955k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f68820toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ String f68821zy;

        zy(com.market.sdk.compat.toq toqVar, String str, String str2) {
            this.f27955k = toqVar;
            this.f68820toq = str;
            this.f68821zy = str2;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            if (FloatService.this.mAidl != null) {
                this.f27955k.set(Boolean.valueOf(FloatService.this.mAidl.resume(this.f68820toq, this.f68821zy)));
            } else {
                C5013p.m17465q(FloatService.TAG, "IAppDownloadManager is null");
            }
        }
    }

    private FloatService(Context context, Intent intent) {
        super(context, intent);
    }

    public static IAppDownloadManager openService(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = MarketManager.f27965p;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, BIND_SERVICE_NAME));
        intent.setAction(BIND_SERVICE_ACTION);
        return new FloatService(context, intent);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    @Override // com.xiaomi.market.IAppDownloadManager
    public boolean cancel(String str, String str2) throws RemoteException {
        return false;
    }

    @Override // com.xiaomi.market.IAppDownloadManager
    public void download(Bundle bundle) throws RemoteException {
        setTask(new C4946k(bundle), "download");
    }

    @Override // com.xiaomi.market.IAppDownloadManager
    public void downloadByUri(Uri uri) throws RemoteException {
        setTask(new C4948q(uri), "downloadByUri");
    }

    @Override // com.xiaomi.market.IAppDownloadManager
    public void lifecycleChanged(String str, int i2) throws RemoteException {
        setTask(new f7l8(str, i2), "lifecycleChanged");
    }

    @Override // com.market.AbstractC4931k
    public void onConnected(IBinder iBinder) {
        this.mAidl = IAppDownloadManager.Stub.asInterface(iBinder);
    }

    @Override // com.market.AbstractC4931k
    public void onDisconnected() {
    }

    @Override // com.xiaomi.market.IAppDownloadManager
    public boolean pause(String str, String str2) throws RemoteException {
        com.market.sdk.compat.toq toqVar = new com.market.sdk.compat.toq();
        setTask(new toq(toqVar, str, str2), "pause");
        waitForCompletion();
        if (toqVar.isDone()) {
            return ((Boolean) toqVar.get()).booleanValue();
        }
        return false;
    }

    @Override // com.xiaomi.market.IAppDownloadManager
    public void pauseByUri(Uri uri) throws RemoteException {
        setTask(new C4947n(uri), "pauseByUri");
    }

    @Override // com.xiaomi.market.IAppDownloadManager
    public boolean resume(String str, String str2) throws RemoteException {
        com.market.sdk.compat.toq toqVar = new com.market.sdk.compat.toq();
        setTask(new zy(toqVar, str, str2), "resume");
        waitForCompletion();
        if (toqVar.isDone()) {
            return ((Boolean) toqVar.get()).booleanValue();
        }
        return false;
    }

    @Override // com.xiaomi.market.IAppDownloadManager
    public void resumeByUri(Uri uri) throws RemoteException {
        setTask(new C4945g(uri), "resumeByUri");
    }
}
