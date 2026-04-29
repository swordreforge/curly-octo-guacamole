package com.android.thememanager.basemodule.account;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.privacy.x2;
import com.xiaomi.accountsdk.account.C5502s;
import com.xiaomi.accountsdk.account.data.C5480k;
import com.xiaomi.accountsdk.account.data.f7l8;
import com.xiaomi.accountsdk.account.data.fu4;
import com.xiaomi.accountsdk.request.C5539k;
import com.xiaomi.accountsdk.request.C5545n;
import com.xiaomi.accountsdk.request.n7h;
import ek5k.C6002g;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: LoginDialogManager.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static final String f9659k = "LoginDialogManager";

    /* JADX INFO: renamed from: n */
    private static C1685g f9660n = null;

    /* JADX INFO: renamed from: q */
    private static final String f9661q = "authtoken";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f57446toq = "client_action";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57447zy = "passportapi";

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.account.toq$k */
    /* JADX INFO: compiled from: LoginDialogManager.java */
    public interface InterfaceC1689k {
        void hyr(C1685g info);
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.account.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LoginDialogManager.java */
    private static class AsyncTaskC7905toq extends AsyncTask<Void, Void, C1685g> {

        /* JADX INFO: renamed from: k */
        private WeakReference<Activity> f9662k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private WeakReference<InterfaceC1689k> f57448toq;

        protected AsyncTaskC7905toq(Activity activity, InterfaceC1689k getUserInfoCallback) {
            this.f9662k = new WeakReference<>(activity);
            this.f57448toq = new WeakReference<>(getUserInfoCallback);
        }

        private f7l8 toq(AccountManager accountManager, Account account) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt(toq.f57446toq, 1);
                AccountManagerFuture<Bundle> authToken = accountManager.getAuthToken(account, "passportapi", bundle, false, (AccountManagerCallback<Bundle>) null, (Handler) null);
                if (authToken.getResult() == null) {
                    return null;
                }
                String string = authToken.getResult().getString(toq.f9661q);
                if (string == null) {
                    return null;
                }
                return f7l8.toq(string);
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C1685g doInBackground(Void... voids) throws n7h, C5545n, com.xiaomi.accountsdk.request.zy, C5539k, IOException {
            Account account;
            C1685g c1685g = new C1685g();
            fu4 fu4VarHyr = null;
            if (this.f9662k.get() == null) {
                return null;
            }
            AccountManager accountManager = AccountManager.get(this.f9662k.get());
            Account[] accountsByType = accountManager.getAccountsByType("com.xiaomi");
            if (accountsByType == null || accountsByType.length <= 0) {
                account = null;
            } else {
                account = accountsByType[0];
                if (account != null) {
                    c1685g.f9637k = account.name;
                }
            }
            f7l8 qVar = toq(accountManager, account);
            if (qVar != null) {
                String str = qVar.f30588k;
                String str2 = qVar.f72621toq;
                if (str != null && str2 != null) {
                    try {
                        String userData = accountManager.getUserData(account, C5480k.f30620i);
                        if (C1781k.toq(bf2.toq.toq())) {
                            fu4VarHyr = C5502s.hyr(c1685g.f9637k, userData, str, str2);
                        }
                    } catch (Exception e2) {
                        Log.e(toq.f9659k, "Exception when get user info", e2);
                    }
                    if (fu4VarHyr != null) {
                        c1685g.f9639q = fu4VarHyr.toq();
                        c1685g.f57421toq = fu4VarHyr.m18671y();
                    }
                }
            }
            c1685g.f57422zy = p029m.zy.toq(c1685g.f57421toq) ? c1685g.f9637k : c1685g.f57421toq;
            return c1685g;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(C1685g userInfo) {
            C1685g unused = toq.f9660n = userInfo;
            if (this.f57448toq.get() != null) {
                this.f57448toq.get().hyr(userInfo);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m6593q(Activity activity, InterfaceC1689k getUserInfoCallback) {
        if (C1781k.toq(bf2.toq.toq()) && x2.zy()) {
            new AsyncTaskC7905toq(activity, getUserInfoCallback).executeOnExecutor(C6002g.ld6(), new Void[0]);
        }
    }

    public static C1685g toq() {
        return f9660n;
    }

    public static boolean zy() {
        C1685g c1685g = f9660n;
        return (c1685g == null || p029m.zy.toq(c1685g.f9639q) || p029m.zy.toq(f9660n.f9637k)) ? false : true;
    }
}
