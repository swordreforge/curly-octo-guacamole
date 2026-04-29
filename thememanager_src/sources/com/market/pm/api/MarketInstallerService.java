package com.market.pm.api;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import com.market.AbstractC4931k;
import com.market.pm.IMarketInstallerService;
import com.market.pm.api.MarketInstallObserver;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MarketInstallerService extends AbstractC4931k implements IMarketInstallerService, zy {
    private IMarketInstallerService mService;

    /* JADX INFO: renamed from: com.market.pm.api.MarketInstallerService$k */
    class C4933k implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Uri f27884k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ ResultReceiver f68806toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ Bundle f68807zy;

        C4933k(Uri uri, ResultReceiver resultReceiver, Bundle bundle) {
            this.f27884k = uri;
            this.f68806toq = resultReceiver;
            this.f68807zy = bundle;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            if (MarketInstallerService.this.mService == null) {
                return;
            }
            try {
                MarketInstallerService.this.mService.installPackage(this.f27884k, this.f68806toq, this.f68807zy);
            } catch (RemoteException e2) {
                Log.w(((AbstractC4931k) MarketInstallerService.this).mTag, "fail install package", e2);
                ResultReceiver resultReceiver = this.f68806toq;
                if (resultReceiver instanceof MarketInstallObserver) {
                    new MarketInstallObserver.C4932k(resultReceiver).toq();
                }
                throw e2;
            }
        }
    }

    private MarketInstallerService(Context context, Intent intent) {
        super(context, intent);
    }

    static IMarketInstallerService openService(Context context) throws C4934k {
        Intent intent = new Intent(zy.dk);
        intent.setPackage(zy.uu0y);
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || !listQueryIntentServices.isEmpty()) {
            return new MarketInstallerService(context, intent);
        }
        throw new C4934k("Not found MarketInstallerService");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    @Override // com.market.pm.IMarketInstallerService
    public void installPackage(Uri uri, ResultReceiver resultReceiver, Bundle bundle) throws RemoteException {
        setTask(new C4933k(uri, resultReceiver, bundle), "installPackage");
    }

    @Override // com.market.AbstractC4931k
    public void onConnected(IBinder iBinder) {
        this.mService = IMarketInstallerService.Stub.asInterface(iBinder);
    }

    @Override // com.market.AbstractC4931k
    public void onDisconnected() {
    }
}
