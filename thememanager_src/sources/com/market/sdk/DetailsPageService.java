package com.market.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.market.AbstractC4931k;
import com.market.sdk.C4993s;
import com.market.sdk.utils.C5010k;
import com.market.sdk.utils.C5013p;
import com.xiaomi.market.IDetailsPageManager;

/* JADX INFO: loaded from: classes3.dex */
class DetailsPageService extends AbstractC4931k implements IDetailsPageManager {
    static final String SERVICE_NAME = "com.xiaomi.market.data.DetailsPageService";
    private static final String TAG = "DetailsPageService";
    private IDetailsPageManager manager;

    /* JADX INFO: renamed from: com.market.sdk.DetailsPageService$k */
    class C4944k implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.market.sdk.compat.toq f27946k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Bundle f68808toq;

        C4944k(com.market.sdk.compat.toq toqVar, Bundle bundle) {
            this.f27946k = toqVar;
            this.f68808toq = bundle;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            if (DetailsPageService.this.manager != null) {
                this.f27946k.set(Boolean.valueOf(DetailsPageService.this.manager.openDetailsPage(this.f68808toq)));
            } else {
                C5013p.m17465q(DetailsPageService.TAG, "IDetailsPageManager is null");
            }
        }
    }

    class toq implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C4993s.k f27947k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Bundle f68810toq;

        toq(C4993s.k kVar, Bundle bundle) {
            this.f27947k = kVar;
            this.f68810toq = bundle;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            if (DetailsPageService.this.manager != null) {
                this.f27947k.m17374k(DetailsPageService.this.manager.openDetailsPage(this.f68810toq));
            } else {
                C5013p.m17465q(DetailsPageService.TAG, "IDetailsPageManager is null");
            }
        }
    }

    private DetailsPageService(Context context, Intent intent) {
        super(context, intent);
    }

    static DetailsPageService openConnect() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.xiaomi.market", SERVICE_NAME));
        return new DetailsPageService(C5010k.toq(), intent);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    @Override // com.market.AbstractC4931k
    public void onConnected(IBinder iBinder) {
        this.manager = IDetailsPageManager.Stub.asInterface(iBinder);
    }

    @Override // com.market.AbstractC4931k
    public void onDisconnected() {
    }

    void openDetailPageAsync(Bundle bundle, C4993s.k kVar) throws RemoteException {
        setTask(new toq(kVar, bundle), "open_market_request_async");
    }

    @Override // com.xiaomi.market.IDetailsPageManager
    public boolean openDetailsPage(Bundle bundle) throws RemoteException {
        com.market.sdk.compat.toq toqVar = new com.market.sdk.compat.toq();
        setTask(new C4944k(toqVar, bundle), "open_market_request");
        waitForCompletion();
        if (toqVar.isDone()) {
            return ((Boolean) toqVar.get()).booleanValue();
        }
        return false;
    }
}
