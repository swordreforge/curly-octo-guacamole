package com.market.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.market.AbstractC4931k;
import com.market.sdk.utils.C5010k;
import com.market.sdk.utils.C5013p;
import com.xiaomi.market.IPreloadAppDetailService;

/* JADX INFO: loaded from: classes3.dex */
public class PreloadAppDetailService extends AbstractC4931k implements IPreloadAppDetailService {
    private static final String ACTION_PRELOAD_SERVICE = "com.xiaomi.market.PRELOAD_APP_DETAIL";
    private static final String TAG = "PreloadAppDetailService";
    private IPreloadAppDetailService mAidl;

    /* JADX INFO: renamed from: com.market.sdk.PreloadAppDetailService$k */
    class C4963k implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f28018k;

        C4963k(String str) {
            this.f28018k = str;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            if (PreloadAppDetailService.this.mAidl != null) {
                PreloadAppDetailService.this.mAidl.preloadAppDetail(this.f28018k);
            } else {
                C5013p.m17465q(PreloadAppDetailService.TAG, "IPreloadAppDetailService is null");
            }
        }
    }

    public PreloadAppDetailService(Context context, Intent intent) {
        super(context, intent);
    }

    public static IPreloadAppDetailService openService() {
        Intent intent = new Intent(ACTION_PRELOAD_SERVICE);
        intent.setPackage("com.xiaomi.market");
        return new PreloadAppDetailService(C5010k.toq(), intent);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    @Override // com.market.AbstractC4931k
    public void onConnected(IBinder iBinder) {
        this.mAidl = IPreloadAppDetailService.Stub.asInterface(iBinder);
    }

    @Override // com.market.AbstractC4931k
    public void onDisconnected() {
    }

    @Override // com.xiaomi.market.IPreloadAppDetailService
    public void preloadAppDetail(String str) throws RemoteException {
        setTask(new C4963k(str), "preloadAppDetail");
    }
}
