package com.xiaomi.passport.servicetoken;

import android.accounts.Account;
import android.accounts.AccountManagerFuture;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: com.xiaomi.passport.servicetoken.q */
/* JADX INFO: compiled from: IAMUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5832q {
    AccountManagerFuture<Bundle> f7l8(Context context, String str, Account account);

    /* JADX INFO: renamed from: g */
    Account mo20472g(Context context);

    /* JADX INFO: renamed from: k */
    void mo20473k(Context context, String str);

    /* JADX INFO: renamed from: n */
    String mo20474n(Context context, String str, Account account);

    /* JADX INFO: renamed from: q */
    String mo20475q(Context context, String str, Account account);

    String toq(Context context, Account account);

    String zy(Context context, String str, Account account);
}
