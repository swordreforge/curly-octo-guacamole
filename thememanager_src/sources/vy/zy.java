package vy;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: IMibiAccountProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public interface zy {
    /* JADX INFO: renamed from: g */
    void mo6575g(String str, String str2);

    /* JADX INFO: renamed from: k */
    Account[] mo6576k();

    /* JADX INFO: renamed from: n */
    AccountManagerFuture<Bundle> mo6577n(Account account, String str, Bundle bundle, boolean z2, AccountManagerCallback<Bundle> accountManagerCallback, Handler handler);

    /* JADX INFO: renamed from: q */
    AccountManagerFuture<Bundle> mo6578q(String str, String str2, String[] strArr, Bundle bundle, Activity activity, AccountManagerCallback<Bundle> accountManagerCallback, Handler handler);

    AccountManagerFuture<Bundle> toq(Account account, String str, Bundle bundle, Activity activity, AccountManagerCallback<Bundle> accountManagerCallback, Handler handler);

    Account[] zy(String str);
}
