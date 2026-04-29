package com.xiaomi.accountsdk.utils;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.xiaomi.accountsdk.account.IXiaomiAccountService;
import com.xiaomi.accountsdk.account.data.C5480k;
import com.xiaomi.accountsdk.futureservice.AbstractC5505k;
import com.xiaomi.accountsdk.futureservice.C5506q;
import com.xiaomi.passport.servicetoken.C5833s;
import com.xiaomi.passport.servicetoken.ServiceTokenResult;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.i */
/* JADX INFO: compiled from: MiuiCUserIdUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C5568i {

    /* JADX INFO: renamed from: g */
    private static final String f31025g = "com.xiaomi.account";

    /* JADX INFO: renamed from: n */
    private static final String f31026n = "com.xiaomi.account.action.BIND_XIAOMI_ACCOUNT_SERVICE";

    /* JADX INFO: renamed from: q */
    private static final String f31027q = "android.intent.action.BIND_XIAOMI_ACCOUNT_SERVICE";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f72966zy = "MiuiCUserIdUtil";

    /* JADX INFO: renamed from: k */
    private final Context f31028k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Account f72967toq;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.i$k */
    /* JADX INFO: compiled from: MiuiCUserIdUtil.java */
    class k extends com.xiaomi.accountsdk.futureservice.zy<IXiaomiAccountService, String, String> {
        k(Context context, String str, String str2, AbstractC5505k abstractC5505k) {
            super(context, str, str2, abstractC5505k);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.accountsdk.futureservice.zy
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public String mo18841q() throws RemoteException {
            return m18843y().getEncryptedUserId(C5568i.this.f72967toq);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.accountsdk.futureservice.zy
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public IXiaomiAccountService zy(IBinder iBinder) {
            return IXiaomiAccountService.Stub.asInterface(iBinder);
        }
    }

    public C5568i(Context context, Account account) {
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        this.f31028k = context.getApplicationContext();
        this.f72967toq = account;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    private String m19086q() {
        String str = this.f31028k.getPackageManager().resolveService(new Intent("com.xiaomi.account.action.BIND_XIAOMI_ACCOUNT_SERVICE"), 0) == null ? "android.intent.action.BIND_XIAOMI_ACCOUNT_SERVICE" : "com.xiaomi.account.action.BIND_XIAOMI_ACCOUNT_SERVICE";
        C5506q c5506q = new C5506q();
        new k(this.f31028k, str, "com.xiaomi.account", c5506q).toq();
        try {
            return (String) c5506q.get();
        } catch (InterruptedException e2) {
            AbstractC5574n.m19113q(f72966zy, "getCUserId", e2);
            return null;
        } catch (ExecutionException e3) {
            AbstractC5574n.m19113q(f72966zy, "getCUserId", e3);
            return null;
        }
    }

    private String zy() {
        ServiceTokenResult serviceTokenResult = C5833s.m20476q().zy().toq(this.f31028k, C5480k.f30619h).get();
        if (serviceTokenResult != null) {
            return serviceTokenResult.f32518z;
        }
        return null;
    }

    public final String toq() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("MiuiCUserIdUtil#getCUserId() should NOT be called on main thread!");
        }
        try {
            return m19086q();
        } catch (SecurityException unused) {
            return zy();
        }
    }
}
