package com.android.thememanager.basemodule.account;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.account.n */
/* JADX INFO: compiled from: MibiPassportAccountProvider.java */
/* JADX INFO: loaded from: classes.dex */
public class C1687n implements vy.zy {

    /* JADX INFO: renamed from: k */
    private AccountManager f9641k;

    public C1687n(Context context) {
        this.f9641k = AccountManager.get(context);
    }

    @Override // vy.zy
    /* JADX INFO: renamed from: g */
    public void mo6575g(String accountType, String authToken) {
        this.f9641k.invalidateAuthToken(accountType, authToken);
    }

    @Override // vy.zy
    /* JADX INFO: renamed from: k */
    public Account[] mo6576k() {
        return this.f9641k.getAccounts();
    }

    @Override // vy.zy
    /* JADX INFO: renamed from: n */
    public AccountManagerFuture<Bundle> mo6577n(Account account, String authTokenType, Bundle options, boolean notifyAuthFailure, AccountManagerCallback<Bundle> callback, Handler handler) {
        return this.f9641k.getAuthToken(account, authTokenType, options, notifyAuthFailure, callback, handler);
    }

    @Override // vy.zy
    /* JADX INFO: renamed from: q */
    public AccountManagerFuture<Bundle> mo6578q(String accountType, String authTokenType, String[] requiredFeatures, Bundle addAccountOptions, Activity activity, AccountManagerCallback<Bundle> callback, Handler handler) {
        return this.f9641k.addAccount(accountType, authTokenType, requiredFeatures, addAccountOptions, activity, callback, handler);
    }

    @Override // vy.zy
    public AccountManagerFuture<Bundle> toq(Account account, String authTokenType, Bundle options, Activity activity, AccountManagerCallback<Bundle> callback, Handler handler) {
        return this.f9641k.getAuthToken(account, authTokenType, options, activity, callback, handler);
    }

    @Override // vy.zy
    public Account[] zy(String type) {
        return this.f9641k.getAccountsByType(type);
    }
}
