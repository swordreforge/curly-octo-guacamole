package com.xiaomi.accountsdk.guestaccount;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.xiaomi.accountsdk.utils.C5567h;
import com.xiaomi.mipush.sdk.C5658n;
import java.util.UUID;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.n */
/* JADX INFO: compiled from: GuestAccountHardwareInfoFetchImplDefault.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5523n implements InterfaceC5518g {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72873toq = "HardwareInfoFetcherDefa";

    /* JADX INFO: renamed from: k */
    private final Context f30867k;

    public C5523n(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        this.f30867k = context;
    }

    @Override // com.xiaomi.accountsdk.guestaccount.InterfaceC5518g
    /* JADX INFO: renamed from: k */
    public String mo18871k() {
        return new com.xiaomi.accountsdk.hasheddeviceidlib.zy(this.f30867k).zy();
    }

    @Override // com.xiaomi.accountsdk.guestaccount.InterfaceC5518g
    /* JADX INFO: renamed from: n */
    public String mo18872n() {
        return com.xiaomi.accountsdk.hasheddeviceidlib.toq.zy(this.f30867k);
    }

    @Override // com.xiaomi.accountsdk.guestaccount.InterfaceC5518g
    /* JADX INFO: renamed from: q */
    public String mo18873q() {
        return com.xiaomi.accountsdk.hasheddeviceidlib.toq.m18909k(this.f30867k);
    }

    @Override // com.xiaomi.accountsdk.guestaccount.InterfaceC5518g
    public C5567h toq() {
        return null;
    }

    @Override // com.xiaomi.accountsdk.guestaccount.InterfaceC5518g
    public String zy() {
        Context context = this.f30867k;
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        if (!TextUtils.isEmpty(kja0.toq(this.f30867k))) {
            return kja0.toq(this.f30867k);
        }
        String str = "f_" + UUID.randomUUID().toString().replace(C5658n.f73185t8r, "").trim().substring(8, 24);
        kja0.zy(this.f30867k, str);
        return str;
    }
}
