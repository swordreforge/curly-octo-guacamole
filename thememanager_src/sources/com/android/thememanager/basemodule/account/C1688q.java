package com.android.thememanager.basemodule.account;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OnAccountsUpdateListener;
import android.accounts.OperationCanceledException;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.preference.ki;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.privacy.x2;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.lvui;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.xiaomi.accountsdk.account.C5502s;
import com.xiaomi.accountsdk.account.data.C5480k;
import com.xiaomi.accountsdk.account.data.fu4;
import com.xiaomi.accountsdk.request.C5539k;
import com.xiaomi.accountsdk.request.C5545n;
import com.xiaomi.accountsdk.utils.n7h;
import ek5k.C6002g;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import vy.C7718q;
import zy.y9n;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.account.q */
/* JADX INFO: compiled from: LoginManager.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"MissingPermission"})
public class C1688q {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final String f57423a9 = "_ph";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final String f57424fn3e = "LoginManager";

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final String f57425fti = "_slh";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final String f57426fu4 = "client_action";

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final String f57427gvn7 = "android.accounts.LOGIN_ACCOUNTS_POST_CHANGED";

    /* JADX INFO: renamed from: i */
    public static final int f9642i = 122;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final String f57428jk = "miuiVipServiceToken";

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final String f57429jp0y = ",";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final String f57430mcp = "serviceToken";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final String f57431ni7 = zurt();

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final String f57432o1t = "authtoken";

    /* JADX INFO: renamed from: t */
    private static final String f9643t = "userId";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final String f57433wvg = "miui_vip";

    /* JADX INFO: renamed from: z */
    private static final String f9644z = "passportapi";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static volatile C1688q f57434zurt;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private AccountManager f57436f7l8;

    /* JADX INFO: renamed from: g */
    private volatile long f9645g;

    /* JADX INFO: renamed from: h */
    boolean f9646h;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private WeakReference<Activity> f57438kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    protected com.xiaomi.accountsdk.account.data.f7l8 f57439ld6;

    /* JADX INFO: renamed from: n */
    private long f9648n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private n f57440n7h;

    /* JADX INFO: renamed from: p */
    private String f9649p;

    /* JADX INFO: renamed from: q */
    private final SharedPreferences f9650q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private com.xiaomi.accountsdk.account.data.f7l8 f57441qrj;

    /* JADX INFO: renamed from: s */
    private Account f9651s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private C1685g f57444x2;

    /* JADX INFO: renamed from: y */
    private volatile long f9652y;

    /* JADX INFO: renamed from: k */
    private final long f9647k = 10000;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final long f57443toq = 30000;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final long f57445zy = 30000;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private List<WeakReference<f7l8>> f57435cdj = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private boolean f57437ki = false;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private OnAccountsUpdateListener f57442t8r = new q();

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.account.q$f7l8 */
    /* JADX INFO: compiled from: LoginManager.java */
    public interface f7l8 {
        void ebn();
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.account.q$g */
    /* JADX INFO: compiled from: LoginManager.java */
    public enum g {
        ERROR_LOGIN_UNACTIVATED,
        ERROR_LOGIN_OTHER,
        ERROR_LOGIN_CANCEL
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.account.q$k */
    /* JADX INFO: compiled from: LoginManager.java */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (TextUtils.equals(intent.getAction(), C1688q.f57427gvn7)) {
                Log.w(C1688q.f57424fn3e, "receive account update, update type is " + intent.getIntExtra("extra_update_type", -1));
                C1688q.this.x9kr();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.account.q$n */
    /* JADX INFO: compiled from: LoginManager.java */
    public interface n {
        default void loginFail(g loginError) {
        }

        void loginSuccess();
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.account.q$q */
    /* JADX INFO: compiled from: LoginManager.java */
    class q implements OnAccountsUpdateListener {
        q() {
        }

        @Override // android.accounts.OnAccountsUpdateListener
        public void onAccountsUpdated(Account[] accounts) {
            C1688q.this.x9kr();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.account.q$toq */
    /* JADX INFO: compiled from: LoginManager.java */
    class toq extends BroadcastReceiver {
        toq() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C1688q.this.m6587p();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.account.q$y */
    /* JADX INFO: compiled from: LoginManager.java */
    private class y extends AsyncTask<Void, Void, C1685g> {
        private y() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C1685g doInBackground(Void... params) {
            Account account = C1688q.this.f9651s;
            if (account == null) {
                return null;
            }
            String str = account.name;
            com.xiaomi.accountsdk.account.data.f7l8 f7l8VarM6580i = C1688q.this.m6580i(account);
            if (f7l8VarM6580i == null) {
                return null;
            }
            String str2 = f7l8VarM6580i.f30588k;
            String str3 = f7l8VarM6580i.f72621toq;
            if (str2 == null || str3 == null) {
                return null;
            }
            try {
            } catch (C5539k e2) {
                Log.e(C1688q.f57424fn3e, "AccessDeniedException when get user info", e2);
            } catch (C5545n e3) {
                Log.e(C1688q.f57424fn3e, "CipherException when get user info", e3);
            } catch (IOException e4) {
                Log.e(C1688q.f57424fn3e, "IOException when get user info", e4);
            } catch (Exception e6) {
                Log.e(C1688q.f57424fn3e, "Exception when get user info", e6);
            }
            fu4 fu4VarHyr = C1781k.toq(bf2.toq.toq()) ? C5502s.hyr(str, C1688q.this.m6586h(), str2, str3) : null;
            if (fu4VarHyr == null) {
                return null;
            }
            C1685g c1685g = new C1685g();
            c1685g.f9637k = str;
            c1685g.f57422zy = fu4VarHyr.m18669q();
            c1685g.f9639q = fu4VarHyr.toq();
            c1685g.f57421toq = fu4VarHyr.m18671y();
            return c1685g;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            if (C1688q.this.f9651s == null) {
                if (C1688q.this.f57444x2 != null) {
                    C1688q.this.f57444x2 = null;
                }
                cancel(false);
                C1688q.this.f9646h = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(C1685g result) {
            if (result != null) {
                C1688q.this.f57444x2 = result;
            }
            C1688q c1688q = C1688q.this;
            c1688q.f9646h = false;
            c1688q.jp0y();
        }

        /* synthetic */ y(C1688q c1688q, k kVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.account.q$zy */
    /* JADX INFO: compiled from: LoginManager.java */
    class zy implements AccountManagerCallback<Bundle> {
        zy() {
        }

        @Override // android.accounts.AccountManagerCallback
        public void run(AccountManagerFuture<Bundle> future) {
            if (future.isDone()) {
                try {
                    Bundle result = future.getResult(30000L, TimeUnit.MILLISECONDS);
                    C1688q.this.f57439ld6 = com.xiaomi.accountsdk.account.data.f7l8.toq(result.getString(C1688q.f57432o1t));
                    C1688q.this.f9649p = result.getString(C5480k.f30620i);
                    C1688q.this.m6587p();
                    StringBuilder sb = new StringBuilder();
                    sb.append("asyncUpdateServiceTokenIfNeed ");
                    com.xiaomi.accountsdk.account.data.f7l8 f7l8Var = C1688q.this.f57439ld6;
                    sb.append(f7l8Var == null ? null : Integer.valueOf(f7l8Var.hashCode()));
                    Log.i(C1688q.f57424fn3e, sb.toString());
                } catch (Exception e2) {
                    e2.printStackTrace();
                    Log.i(C1688q.f57424fn3e, "loginManager: asyncUpdateServiceToken catch a exception");
                }
            }
        }
    }

    protected C1688q() {
        Log.d(f57424fn3e, "init login manager");
        Context qVar = bf2.toq.toq();
        this.f9650q = qVar.getSharedPreferences("time_line", 0);
        this.f57436f7l8 = AccountManager.get(qVar);
        oc(qVar);
        x9kr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a9(AccountManagerFuture accountManagerFuture) {
        Bundle bundle;
        try {
            bundle = (Bundle) accountManagerFuture.getResult();
        } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
            Log.w(f57424fn3e, "login. callback. getResult fail. " + e2);
            bundle = null;
        }
        if (bundle != null) {
            Intent intent = (Intent) bundle.get(C7718q.f97043a9);
            if (intent == null) {
                Log.w(f57424fn3e, "maybe login success, update account");
                x9kr();
                return;
            }
            Activity activity = this.f57438kja0.get();
            if (activity != null) {
                Log.w(f57424fn3e, "start login account");
                activity.startActivityForResult(intent, 122);
            }
        }
    }

    public static C1688q cdj() {
        if (f57434zurt == null) {
            synchronized (C1688q.class) {
                if (f57434zurt == null) {
                    f57434zurt = new C1688q();
                }
            }
        }
        return f57434zurt;
    }

    public static String gvn7(String origin) {
        if (TextUtils.isEmpty(origin)) {
            return null;
        }
        String[] strArrSplit = origin.split(",");
        if (strArrSplit.length >= 2) {
            return strArrSplit[1];
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public com.xiaomi.accountsdk.account.data.f7l8 m6580i(Account account) {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt(f57426fu4, 1);
            AccountManagerFuture<Bundle> authToken = this.f57436f7l8.getAuthToken(account, "passportapi", bundle, false, (AccountManagerCallback<Bundle>) null, (Handler) null);
            if (authToken.getResult() == null) {
                return null;
            }
            String string = authToken.getResult().getString(f57432o1t);
            if (string == null) {
                return null;
            }
            return com.xiaomi.accountsdk.account.data.f7l8.toq(string);
        } catch (AuthenticatorException | OperationCanceledException | IOException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jp0y() {
        Log.i(f57424fn3e, "Start notifyAccountUpdate");
        if (this.f57437ki) {
            n nVar = this.f57440n7h;
            if (nVar != null) {
                WeakReference<Activity> weakReference = this.f57438kja0;
                if (weakReference == null || !C1819o.eqxt(weakReference.get())) {
                    return;
                }
                if (wvg()) {
                    nVar.loginSuccess();
                } else {
                    Log.i(f57424fn3e, "Account has not login");
                    Account[] accountsByType = this.f57436f7l8.getAccountsByType("com.xiaomi.unactivated");
                    if (accountsByType == null || accountsByType.length <= 0) {
                        nVar.loginFail(g.ERROR_LOGIN_OTHER);
                    } else {
                        Log.d(f57424fn3e, "error account unactivated");
                        nVar.loginFail(g.ERROR_LOGIN_UNACTIVATED);
                    }
                }
                lvui();
            }
            this.f57437ki = false;
        }
        Iterator<WeakReference<f7l8>> it = this.f57435cdj.iterator();
        while (it.hasNext()) {
            f7l8 f7l8Var = it.next().get();
            if (f7l8Var != null) {
                f7l8Var.ebn();
            }
        }
    }

    public static String kja0(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            Log.e(f57424fn3e, "get cookies map is null");
            return null;
        }
        try {
            return new JSONObject(map).toString();
        } catch (Exception e2) {
            Log.e(f57424fn3e, "get cookies failed", e2);
            return null;
        }
    }

    public static String qrj() {
        C1688q c1688qCdj = cdj();
        StringBuilder sb = new StringBuilder();
        if (c1688qCdj.o1t()) {
            sb.append("serviceToken");
            sb.append("=");
            sb.append(c1688qCdj.x2());
            if (c1688qCdj.m6586h() != null) {
                sb.append("; ");
                sb.append(InterfaceC1925p.dqjj);
                sb.append("=");
                sb.append(c1688qCdj.m6586h());
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: s */
    private void m6584s(boolean forceUpdate) {
        if (this.f9651s == null) {
            return;
        }
        if (forceUpdate || System.currentTimeMillis() - this.f9648n > 10000) {
            this.f9648n = System.currentTimeMillis();
            this.f57436f7l8.getAuthToken(this.f9651s, f57431ni7, (Bundle) null, false, (AccountManagerCallback<Bundle>) new zy(), (Handler) null);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m6585t(Context context) {
        if (!C1781k.toq(context) || x2.m6914n() > -1) {
            return;
        }
        Log.d(f57424fn3e, "init and save select mode");
        x2.m6915p(3);
        if (a9.t8r(context)) {
            return;
        }
        ki.m4689q(context).edit().putBoolean(lvui.f57776x2, true).apply();
    }

    private void t8r(Account account) {
        String string;
        if (account == null) {
            return;
        }
        try {
            AccountManagerFuture<Bundle> authToken = this.f57436f7l8.getAuthToken(account, f57433wvg, (Bundle) null, false, (AccountManagerCallback<Bundle>) null, (Handler) null);
            if (authToken.getResult() == null || (string = authToken.getResult().getString(f57432o1t)) == null) {
                return;
            }
            this.f57441qrj = com.xiaomi.accountsdk.account.data.f7l8.toq(string);
        } catch (Exception e2) {
            Log.e(f57424fn3e, "get miui_vip serviceToken failed.", e2);
        }
    }

    public static String zurt() {
        return (bf2.toq.zy() == 1 || bf2.toq.zy() == 3) ? "dthememarket" : "thememarket";
    }

    public void d2ok(Context context) {
        context.registerReceiver(new toq(), new IntentFilter("com.xiaomi.action.XIAOMI_USER_INFO_CHANGED"));
    }

    public void d3() {
        if (this.f9651s == null || System.currentTimeMillis() - this.f9652y <= 30000) {
            Log.i(f57424fn3e, "invalidateServiceToken fail, account null? ");
            return;
        }
        this.f9652y = System.currentTimeMillis();
        this.f57441qrj = null;
        t8r(this.f9651s);
        com.xiaomi.accountsdk.account.data.f7l8 f7l8Var = this.f57441qrj;
        if (f7l8Var == null) {
            Log.w(f57424fn3e, "invalidateServiceToken fail, old miui token is null.");
        } else {
            this.f57436f7l8.invalidateAuthToken("com.xiaomi", f7l8Var.zy());
            t8r(this.f9651s);
        }
    }

    public void dd(f7l8 l2) {
        WeakReference<f7l8> weakReference = null;
        for (WeakReference<f7l8> weakReference2 : this.f57435cdj) {
            if (weakReference2.get() == l2) {
                weakReference = weakReference2;
            }
        }
        this.f57435cdj.remove(weakReference);
    }

    public void eqxt(f7l8 l2) {
        if (l2 != null) {
            this.f57435cdj.add(new WeakReference<>(l2));
        }
    }

    public String fn3e() {
        com.xiaomi.accountsdk.account.data.f7l8 f7l8Var = this.f57439ld6;
        if (f7l8Var != null) {
            return f7l8Var.f72621toq;
        }
        return null;
    }

    public void fti(final Activity activity, final n callback) {
        if (!C1781k.toq(bf2.toq.toq())) {
            if (callback != null) {
                callback.loginFail(g.ERROR_LOGIN_OTHER);
            }
        } else {
            if (wvg()) {
                if (callback != null) {
                    callback.loginSuccess();
                    return;
                }
                return;
            }
            this.f57438kja0 = new WeakReference<>(activity);
            if (x2.zy()) {
                AccountManagerCallback<Bundle> accountManagerCallback = new AccountManagerCallback() { // from class: com.android.thememanager.basemodule.account.zy
                    @Override // android.accounts.AccountManagerCallback
                    public final void run(AccountManagerFuture accountManagerFuture) {
                        this.f9663k.a9(accountManagerFuture);
                    }
                };
                this.f57440n7h = callback;
                this.f57436f7l8.addAccount("com.xiaomi", f57431ni7, null, null, null, accountManagerCallback, null);
            } else if (activity instanceof AbstractActivityC1717k) {
                ((AbstractActivityC1717k) activity).m6715x().m6909i(activity, null);
            }
        }
    }

    public Map<String, String> fu4() {
        if (this.f9651s != null) {
            n7h n7hVar = new n7h();
            n7hVar.easyPut("userId", m6586h()).easyPut("serviceToken", x2());
            return n7hVar;
        }
        Log.e(f57424fn3e, "getCookies, mAccount=" + this.f9651s);
        return null;
    }

    /* JADX INFO: renamed from: h */
    public String m6586h() {
        if (this.f9649p == null) {
            try {
                this.f9649p = this.f57436f7l8.getUserData(this.f9651s, C5480k.f30620i);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this.f9649p;
    }

    public boolean jk() {
        return Settings.Global.getInt(bf2.toq.toq().getContentResolver(), "xiaomi_account_is_child", 0) == 1;
    }

    public String ki() {
        com.xiaomi.accountsdk.account.data.f7l8 f7l8Var = this.f57441qrj;
        if (f7l8Var != null) {
            return f7l8Var.f30588k;
        }
        return null;
    }

    public void ld6() {
        this.f9651s = null;
        this.f57439ld6 = null;
        this.f9649p = null;
        this.f57444x2 = null;
    }

    public void lvui() {
        this.f57440n7h = null;
        this.f57438kja0 = null;
    }

    @y9n
    public void mcp() {
        if (this.f9651s == null || System.currentTimeMillis() - this.f9645g <= 30000) {
            return;
        }
        synchronized (C1688q.class) {
            if (this.f9651s == null || System.currentTimeMillis() - this.f9645g <= 30000) {
                StringBuilder sb = new StringBuilder();
                sb.append("invalidateServiceToken fail, time or account null? ");
                sb.append(this.f9651s == null);
                Log.i(f57424fn3e, sb.toString());
            } else {
                this.f9645g = System.currentTimeMillis();
                this.f57439ld6 = null;
                m6588r();
                com.xiaomi.accountsdk.account.data.f7l8 f7l8Var = this.f57439ld6;
                if (f7l8Var != null) {
                    this.f57436f7l8.invalidateAuthToken("com.xiaomi", f7l8Var.zy());
                    m6588r();
                } else {
                    Log.w(f57424fn3e, "invalidateServiceToken fail, old token is null.");
                }
            }
        }
    }

    public Map<String, String> n7h() {
        if (this.f9651s != null && this.f57441qrj != null) {
            n7h n7hVar = new n7h();
            n7hVar.easyPut("userId", m6586h()).easyPut("serviceToken", x2()).easyPut("miui_vip_ph", gvn7(this.f57436f7l8.getUserData(this.f9651s, "miui_vip_ph"))).easyPut("miui_vip_slh", gvn7(this.f57436f7l8.getUserData(this.f9651s, "miui_vip_slh")));
            return n7hVar;
        }
        Log.e(f57424fn3e, "getCookies, mAccount=" + this.f9651s + ",mMiuiVipServiceToken=" + this.f57441qrj);
        return null;
    }

    public String ni7() {
        Account account = this.f9651s;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public boolean o1t() {
        return (ni7() == null || x2() == null || fn3e() == null) ? false : true;
    }

    public void oc(Context context) {
        k kVar = new k();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(f57427gvn7);
        context.registerReceiver(kVar, intentFilter);
    }

    /* JADX INFO: renamed from: p */
    public void m6587p() {
        if (this.f9646h) {
            return;
        }
        this.f9646h = true;
        new y(this, null).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    @y9n
    /* JADX INFO: renamed from: r */
    public void m6588r() {
        Account account = this.f9651s;
        if (account == null) {
            Log.w(f57424fn3e, "syncUpdateServiceToken fail, mAccount is null.");
            return;
        }
        try {
            Bundle result = this.f57436f7l8.getAuthToken(account, f57431ni7, (Bundle) null, false, (AccountManagerCallback<Bundle>) null, (Handler) null).getResult(30000L, TimeUnit.MILLISECONDS);
            this.f57439ld6 = com.xiaomi.accountsdk.account.data.f7l8.toq(result.getString(f57432o1t));
            this.f9649p = result.getString(C5480k.f30620i);
            StringBuilder sb = new StringBuilder();
            sb.append("syncUpdateServiceToken ,t = ");
            com.xiaomi.accountsdk.account.data.f7l8 f7l8Var = this.f57439ld6;
            sb.append(f7l8Var == null ? null : Integer.valueOf(f7l8Var.hashCode()));
            Log.i(f57424fn3e, sb.toString());
        } catch (Exception e2) {
            e2.printStackTrace();
            Log.i(f57424fn3e, "loginManager: syncUpdateServiceToken catch a exception");
        }
    }

    public boolean wvg() {
        return ni7() != null;
    }

    public String x2() {
        com.xiaomi.accountsdk.account.data.f7l8 f7l8Var = this.f57439ld6;
        if (f7l8Var != null) {
            return f7l8Var.f30588k;
        }
        return null;
    }

    public void x9kr() {
        if (C1781k.toq(bf2.toq.toq()) && x2.zy()) {
            Log.w(f57424fn3e, "begin update account");
            Account[] accountsByType = this.f57436f7l8.getAccountsByType("com.xiaomi");
            ld6();
            if (accountsByType == null || accountsByType.length <= 0) {
                Log.w(f57424fn3e, "get account info fail");
                jp0y();
                return;
            }
            Account account = accountsByType[0];
            this.f9651s = account;
            if (account != null) {
                C1685g c1685g = new C1685g();
                this.f57444x2 = c1685g;
                c1685g.f9637k = this.f9651s.name;
                Log.i(f57424fn3e, "update account successful");
            }
            m6584s(true);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m6589y(int resultCode) {
        Log.w(f57424fn3e, "after login result code " + resultCode);
        n nVar = this.f57440n7h;
        if (nVar != null) {
            if (resultCode == -1) {
                this.f57437ki = true;
                x9kr();
            } else {
                nVar.loginFail(g.ERROR_LOGIN_CANCEL);
                lvui();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public C1685g m6590z() {
        return this.f57444x2;
    }
}
