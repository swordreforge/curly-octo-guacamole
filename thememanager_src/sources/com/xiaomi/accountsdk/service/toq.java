package com.xiaomi.accountsdk.service;

import android.content.Context;
import android.os.Bundle;
import com.xiaomi.accountsdk.hasheddeviceidlib.InterfaceC5533q;

/* JADX INFO: compiled from: UnifiedDeviceInfoFetcherImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq implements InterfaceC5533q {
    @Override // com.xiaomi.accountsdk.hasheddeviceidlib.InterfaceC5533q
    /* JADX INFO: renamed from: k */
    public String mo18908k(Context context) {
        Bundle bundle;
        DeviceInfoResult qVar = C5561k.toq(context, "passport", 1, 5000);
        if (qVar == null || (bundle = qVar.f31005k) == null) {
            return null;
        }
        return bundle.getString(DeviceInfoResult.f31001p);
    }
}
