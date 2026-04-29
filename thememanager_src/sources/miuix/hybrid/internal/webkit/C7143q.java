package miuix.hybrid.internal.webkit;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.accountsdk.account.data.C5480k;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: miuix.hybrid.internal.webkit.q */
/* JADX INFO: compiled from: DeviceAccountLogin.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7143q {

    /* JADX INFO: renamed from: g */
    private static final String f40315g = "DeviceAccountLogin";

    /* JADX INFO: renamed from: k */
    protected Activity f40316k;

    /* JADX INFO: renamed from: n */
    private AccountManagerCallback<Bundle> f40317n = new k(this);

    /* JADX INFO: renamed from: q */
    protected AccountManager f40318q;

    /* JADX INFO: renamed from: miuix.hybrid.internal.webkit.q$k */
    /* JADX INFO: compiled from: DeviceAccountLogin.java */
    private static class k implements AccountManagerCallback<Bundle> {

        /* JADX INFO: renamed from: k */
        private WeakReference<C7143q> f40319k;

        public k(C7143q login) {
            this.f40319k = new WeakReference<>(login);
        }

        @Override // android.accounts.AccountManagerCallback
        public void run(AccountManagerFuture<Bundle> value) {
            C7143q c7143q = this.f40319k.get();
            if (c7143q == null) {
                return;
            }
            try {
                String string = value.getResult().getString("authtoken");
                if (string == null) {
                    c7143q.zy();
                } else {
                    c7143q.mo25883g(string);
                }
            } catch (Exception e2) {
                Log.e(C7143q.f40315g, "Fail to login", e2);
                c7143q.zy();
            }
        }
    }

    public C7143q(Activity activity) {
        this.f40316k = activity;
        this.f40318q = AccountManager.get(activity.getApplicationContext());
    }

    /* JADX INFO: renamed from: g */
    public void mo25883g(String url) {
    }

    /* JADX INFO: renamed from: k */
    public void m25884k(String realm, String accountName, String args) {
        Account account;
        Account[] accountsByType = this.f40318q.getAccountsByType(realm);
        if (accountsByType.length == 0) {
            toq();
            return;
        }
        Account account2 = null;
        if (TextUtils.isEmpty(accountName)) {
            account2 = accountsByType[0];
        } else {
            for (Account account3 : accountsByType) {
                if (account3.name.equals(accountName)) {
                    account = account3;
                    break;
                }
            }
        }
        account = account2;
        if (account == null) {
            toq();
            return;
        }
        mo25885n();
        this.f40318q.getAuthToken(account, C5480k.f72647ld6 + args, (Bundle) null, (Activity) null, this.f40317n, (Handler) null);
    }

    /* JADX INFO: renamed from: n */
    public void mo25885n() {
    }

    /* JADX INFO: renamed from: q */
    public void mo25886q() {
    }

    public void toq() {
    }

    public void zy() {
    }
}
