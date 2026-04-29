package com.market.sdk.homeguide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.market.sdk.C5021z;
import com.market.sdk.homeguide.IAppstoreHomeGuideService;
import com.market.sdk.utils.C5010k;
import com.market.sdk.utils.C5013p;
import com.market.sdk.utils.x2;

/* JADX INFO: loaded from: classes3.dex */
class AppstoreUserGuideService extends C5021z implements IAppstoreHomeGuideService {
    private static final String TAG = "AppStoreUserGuide";
    private static final String TARGET_PKG = "com.xiaomi.mipicks";
    private static final String USER_GUIDE_ACTION = "com.xiaomi.market.HOME_USER_GUIDE";

    public AppstoreUserGuideService(Context context, Intent intent) {
        super(context, intent);
    }

    public static Intent getUserGuideIntent() {
        Intent intent = new Intent(USER_GUIDE_ACTION);
        intent.setPackage("com.xiaomi.mipicks");
        if (x2.m17495g(intent, 0).isEmpty()) {
            return null;
        }
        return intent;
    }

    public static AppstoreUserGuideService openService() {
        return new AppstoreUserGuideService(C5010k.toq(), getUserGuideIntent());
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    @Override // com.market.sdk.homeguide.IAppstoreHomeGuideService
    public HomeUserGuideResult ready(HomeUserGuideData homeUserGuideData) throws RemoteException {
        return null;
    }

    @Override // com.market.sdk.homeguide.IAppstoreHomeGuideService
    public void show(ResultReceiver resultReceiver) throws RemoteException {
    }

    public void tryShow(final HomeUserGuideData homeUserGuideData, final toq toqVar) {
        setTask(new C5021z.k<Void>(false) { // from class: com.market.sdk.homeguide.AppstoreUserGuideService.1

            /* JADX INFO: renamed from: com.market.sdk.homeguide.AppstoreUserGuideService$1$k */
            class k implements IBinder.DeathRecipient {
                k() {
                }

                @Override // android.os.IBinder.DeathRecipient
                public void binderDied() {
                    m17307p(true);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: p */
            public void m17307p(boolean z2) {
                toq toqVar2 = toqVar;
                if (toqVar2 != null) {
                    toqVar2.mo17319k(z2);
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.market.sdk.C5021z.k
            /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
            public Void f7l8(IBinder iBinder) throws RemoteException {
                IAppstoreHomeGuideService iAppstoreHomeGuideServiceAsInterface;
                int iM17312k;
                Handler handler = null;
                if (iBinder == null) {
                    return null;
                }
                boolean z2 = false;
                try {
                    iAppstoreHomeGuideServiceAsInterface = IAppstoreHomeGuideService.Stub.asInterface(iBinder);
                    C5010k.toq().grantUriPermission("com.xiaomi.mipicks", homeUserGuideData.getHomeScreenUri(), 1);
                    iM17312k = iAppstoreHomeGuideServiceAsInterface.ready(homeUserGuideData).m17312k();
                } catch (Throwable th) {
                    th = th;
                    z2 = true;
                }
                if (iM17312k == 1) {
                    throw new IllegalArgumentException();
                }
                if (iM17312k != 2) {
                    toq toqVar2 = toqVar;
                    if (toqVar2 != null && toqVar2.toq()) {
                        m17511y();
                    } else {
                        iAppstoreHomeGuideServiceAsInterface.show(new ResultReceiver(handler) { // from class: com.market.sdk.homeguide.AppstoreUserGuideService.1.1
                            @Override // android.os.ResultReceiver
                            protected void onReceiveResult(int i2, Bundle bundle) {
                                m17307p(i2 != 0);
                                m17511y();
                            }
                        });
                        iBinder.linkToDeath(new k(), 0);
                    }
                    return null;
                }
                try {
                    throw new IllegalArgumentException();
                } catch (Throwable th2) {
                    th = th2;
                    m17307p(z2);
                    m17511y();
                    C5013p.m17463n(AppstoreUserGuideService.TAG, th.toString(), th);
                    return null;
                }
            }
        });
    }
}
