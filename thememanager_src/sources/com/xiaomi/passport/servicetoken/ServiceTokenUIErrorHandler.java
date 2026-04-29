package com.xiaomi.passport.servicetoken;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.xiaomi.passport.servicetoken.IServiceTokenUIResponse;
import com.xiaomi.passport.servicetoken.ServiceTokenResult;

/* JADX INFO: loaded from: classes3.dex */
final class ServiceTokenUIErrorHandler {
    private ServiceTokenUIErrorHandler() {
    }

    /* JADX INFO: renamed from: k */
    public static ServiceTokenResult m20446k(Context context, ServiceTokenResult serviceTokenResult) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!activity.isFinishing() && serviceTokenResult != null && serviceTokenResult.f32506g == ServiceTokenResult.toq.ERROR_USER_INTERACTION_NEEDED && serviceTokenResult.f32512p != null && new ld6().m20464p(activity)) {
                return toq(serviceTokenResult, activity);
            }
        }
        return serviceTokenResult;
    }

    private static ServiceTokenResult toq(final ServiceTokenResult serviceTokenResult, Activity activity) {
        final f7l8 f7l8Var = new f7l8(null);
        serviceTokenResult.f32512p.putExtra("accountAuthenticatorResponse", new ServiceTokenUIResponse(new IServiceTokenUIResponse.Stub() { // from class: com.xiaomi.passport.servicetoken.ServiceTokenUIErrorHandler.1
            @Override // com.xiaomi.passport.servicetoken.IServiceTokenUIResponse
            public void onError(int i2, String str) throws RemoteException {
                if (i2 == 4) {
                    f7l8Var.m18835y(new ServiceTokenResult.C5817k(serviceTokenResult.f32509k).cdj(ServiceTokenResult.toq.ERROR_CANCELLED).n7h());
                } else {
                    f7l8Var.m18835y(serviceTokenResult);
                }
            }

            @Override // com.xiaomi.passport.servicetoken.IServiceTokenUIResponse
            public void onRequestContinued() throws RemoteException {
                f7l8Var.m18835y(serviceTokenResult);
            }

            @Override // com.xiaomi.passport.servicetoken.IServiceTokenUIResponse
            public void onResult(Bundle bundle) throws RemoteException {
                f7l8Var.m18835y(C5824k.toq(bundle, serviceTokenResult.f32509k));
            }
        }));
        activity.startActivity(serviceTokenResult.f32512p);
        return f7l8Var.get();
    }
}
