package com.xiaomi.accountsdk.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.xiaomi.accountsdk.account.C5497k;
import com.xiaomi.accountsdk.futureservice.AbstractC5505k;
import com.xiaomi.accountsdk.futureservice.C5506q;
import com.xiaomi.accountsdk.futureservice.zy;
import com.xiaomi.accountsdk.service.DeviceInfoResult;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import com.xiaomi.passport.IPassportCommonService;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.service.k */
/* JADX INFO: compiled from: PassportCommonServiceClient.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5561k {

    /* JADX INFO: renamed from: k */
    private static final String f31011k = "PassportCommonServiceClient";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72958toq = "feature_get_device_info_version";

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.service.k$k */
    /* JADX INFO: compiled from: PassportCommonServiceClient.java */
    static class k extends toq<DeviceInfoResult> {

        /* JADX INFO: renamed from: i */
        final /* synthetic */ String f31012i;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f31013z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context, AbstractC5505k abstractC5505k, String str, int i2) {
            super(context, abstractC5505k);
            this.f31012i = str;
            this.f31013z = i2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.accountsdk.futureservice.zy
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public DeviceInfoResult mo18841q() throws RemoteException {
            return m18843y().getDeviceInfo(this.f31012i, this.f31013z);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.service.k$toq */
    /* JADX INFO: compiled from: PassportCommonServiceClient.java */
    private static abstract class toq<T> extends zy<IPassportCommonService, T, T> {
        protected toq(Context context, AbstractC5505k<T, T> abstractC5505k) {
            super(context, C5497k.f30750s, "com.xiaomi.account", abstractC5505k);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.accountsdk.futureservice.zy
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final IPassportCommonService zy(IBinder iBinder) {
            return IPassportCommonService.Stub.asInterface(iBinder);
        }
    }

    private C5561k() {
    }

    /* JADX INFO: renamed from: k */
    private static boolean m19051k(Context context, String str, int i2) {
        ResolveInfo resolveInfo;
        Bundle bundle;
        Intent intent = new Intent(C5497k.f30750s);
        intent.setPackage("com.xiaomi.account");
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty() && (resolveInfo = listQueryIntentServices.get(0)) != null && resolveInfo.serviceInfo != null) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            try {
                ServiceInfo serviceInfo2 = context.getPackageManager().getServiceInfo(new ComponentName(serviceInfo.packageName, serviceInfo.name), 128);
                if (serviceInfo2 != null && (bundle = serviceInfo2.metaData) != null) {
                    Object obj = bundle.get(str);
                    if (obj instanceof Integer) {
                        return ((Integer) obj).intValue() >= i2;
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                AbstractC5574n.m19116z(f31011k, "component not found", e2);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DeviceInfoResult toq(Context context, String str, int i2, int i3) {
        if (!zy(context)) {
            return new DeviceInfoResult.C5560k(null).f7l8(DeviceInfoResult.toq.ERROR_NOT_SUPPORTED).m19050y("GetDeviceInfo feature is not yet supported by this version of XiaomiAccount, please update a newer version.").m19048n();
        }
        C5506q c5506q = new C5506q();
        new k(context, c5506q, str, i2).toq();
        try {
            return (DeviceInfoResult) c5506q.get(i3, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            AbstractC5574n.m19113q(f31011k, "getDeviceInfoRpc", e2);
            return new DeviceInfoResult.C5560k(null).f7l8(DeviceInfoResult.toq.ERROR_EXECUTION_EXCEPTION).m19050y(e2.getMessage()).m19048n();
        }
    }

    private static boolean zy(Context context) {
        return m19051k(context, f72958toq, 1);
    }
}
