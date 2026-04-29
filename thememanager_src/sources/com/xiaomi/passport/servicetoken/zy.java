package com.xiaomi.passport.servicetoken;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.xiaomi.accountsdk.utils.AbstractC5574n;

/* JADX INFO: compiled from: AMUtilImpl.java */
/* JADX INFO: loaded from: classes3.dex */
final class zy implements InterfaceC5832q {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f73231toq = "AMUtilImpl";

    /* JADX INFO: renamed from: k */
    private final toq f32565k;

    zy(toq toqVar) {
        if (toqVar == null) {
            throw new IllegalArgumentException("amKeys == null");
        }
        this.f32565k = toqVar;
    }

    @Override // com.xiaomi.passport.servicetoken.InterfaceC5832q
    public AccountManagerFuture<Bundle> f7l8(Context context, String str, Account account) {
        return AccountManager.get(context).getAuthToken(account, str, (Bundle) null, (Activity) null, (AccountManagerCallback<Bundle>) null, (Handler) null);
    }

    @Override // com.xiaomi.passport.servicetoken.InterfaceC5832q
    /* JADX INFO: renamed from: g */
    public Account mo20472g(Context context) {
        Account[] accountsByType = AccountManager.get(context).getAccountsByType(this.f32565k.m20479q());
        if (accountsByType == null || accountsByType.length <= 0) {
            return null;
        }
        return accountsByType[0];
    }

    @Override // com.xiaomi.passport.servicetoken.InterfaceC5832q
    /* JADX INFO: renamed from: k */
    public void mo20473k(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken(this.f32565k.m20479q(), str);
    }

    @Override // com.xiaomi.passport.servicetoken.InterfaceC5832q
    /* JADX INFO: renamed from: n */
    public String mo20474n(Context context, String str, Account account) {
        try {
            return AccountManager.get(context).getUserData(account, this.f32565k.toq(str));
        } catch (SecurityException e2) {
            AbstractC5574n.toq(f73231toq, "getSlh", e2);
            return null;
        }
    }

    @Override // com.xiaomi.passport.servicetoken.InterfaceC5832q
    /* JADX INFO: renamed from: q */
    public String mo20475q(Context context, String str, Account account) {
        try {
            return AccountManager.get(context).getUserData(account, this.f32565k.zy(str));
        } catch (SecurityException e2) {
            AbstractC5574n.toq(f73231toq, "getSlh", e2);
            return null;
        }
    }

    @Override // com.xiaomi.passport.servicetoken.InterfaceC5832q
    public String toq(Context context, Account account) {
        try {
            return AccountManager.get(context).getUserData(account, this.f32565k.m20478k());
        } catch (SecurityException e2) {
            AbstractC5574n.toq(f73231toq, "getSlh", e2);
            return null;
        }
    }

    @Override // com.xiaomi.passport.servicetoken.InterfaceC5832q
    public String zy(Context context, String str, Account account) {
        try {
            return AccountManager.get(context).peekAuthToken(account, str);
        } catch (SecurityException e2) {
            AbstractC5574n.toq(f73231toq, "peedAuthToken", e2);
            return null;
        }
    }
}
