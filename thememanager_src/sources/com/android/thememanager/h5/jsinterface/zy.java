package com.android.thememanager.h5.jsinterface;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.webkit.JavascriptInterface;
import com.android.thememanager.R;
import com.android.thememanager.activity.ThemeTabActivity;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.privacy.x2;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.share.f7l8;
import com.android.thememanager.util.C2755a;
import com.google.gson.C4871g;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import miuix.hybrid.HybridView;

/* JADX INFO: compiled from: ThemeH5Interface.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final Object f60294ld6 = new Object();

    /* JADX INFO: renamed from: p */
    private static final String f12226p = "TH20210111_JS_EMPTY";

    /* JADX INFO: renamed from: s */
    public static final String f12227s = "backPreviousPage";

    /* JADX INFO: renamed from: y */
    public static final String f12228y = "themeNative";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f60295f7l8;

    /* JADX INFO: renamed from: g */
    private int f12229g = 0;

    /* JADX INFO: renamed from: k */
    private volatile boolean f12230k;

    /* JADX INFO: renamed from: n */
    private AsyncTaskC2067q f12231n;

    /* JADX INFO: renamed from: q */
    private WeakReference<HybridView> f12232q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Context f60296toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private WeakReference<HybridView> f60297zy;

    /* JADX INFO: renamed from: com.android.thememanager.h5.jsinterface.zy$k */
    /* JADX INFO: compiled from: ThemeH5Interface.java */
    class RunnableC2066k implements Runnable {
        RunnableC2066k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - zy.this.f60295f7l8 > 1000) {
                zy.this.f60295f7l8 = jCurrentTimeMillis;
                HybridView hybridView = (HybridView) zy.this.f60297zy.get();
                if (hybridView != null) {
                    hybridView.x2("javascript:themeNativeToWeb.share()");
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.h5.jsinterface.zy$q */
    /* JADX INFO: compiled from: ThemeH5Interface.java */
    private static class AsyncTaskC2067q extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: k */
        private WeakReference<HybridView> f12234k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f60298toq;

        public AsyncTaskC2067q(HybridView webView, String jsCallbackMethod) {
            this.f12234k = new WeakReference<>(webView);
            this.f60298toq = jsCallbackMethod;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voids) {
            C1688q.cdj().m6588r();
            C1688q.cdj().d3();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            zy.f7l8(this.f12234k.get(), this.f60298toq);
        }
    }

    /* JADX INFO: compiled from: ThemeH5Interface.java */
    class toq implements C1688q.n {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f12235k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ HybridView f60299toq;

        toq(final String val$jsCallbackMethod, final HybridView val$webView) {
            this.f12235k = val$jsCallbackMethod;
            this.f60299toq = val$webView;
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            if (!mcp.m7138k() || !mcp.m7139n()) {
                nn86.m7150k(R.string.online_no_network, 0);
                return;
            }
            if (TextUtils.equals(zy.f12226p, this.f12235k)) {
                return;
            }
            if (zy.this.f12231n != null) {
                zy.this.f12231n.cancel(true);
                zy.this.f12231n = null;
            }
            zy.this.f12231n = new AsyncTaskC2067q(this.f60299toq, this.f12235k);
            zy.this.f12231n.executeOnExecutor(C6002g.ld6(), new Void[0]);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.h5.jsinterface.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ThemeH5Interface.java */
    private static class C7920zy {

        /* JADX INFO: renamed from: k */
        public String f12236k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public ArrayMap<String, Object> f60301toq;

        private C7920zy() {
        }
    }

    public zy(Context context, HybridView webView) {
        this.f60296toq = context;
        this.f60297zy = new WeakReference<>(webView);
    }

    public static void f7l8(final HybridView webView, String jsCallbackMethod) {
        if (webView == null || TextUtils.isEmpty(jsCallbackMethod)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("javascript:");
        sb.append(jsCallbackMethod);
        sb.append("()");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            webView.x2(sb.toString());
        } else {
            webView.post(new Runnable() { // from class: com.android.thememanager.h5.jsinterface.toq
                @Override // java.lang.Runnable
                public final void run() {
                    zy.m7957s(webView, sb);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m7957s(HybridView hybridView, StringBuilder sb) {
        hybridView.x2(sb.toString());
    }

    @JavascriptInterface
    public static void stats(String evParam) {
        if (TextUtils.isEmpty(evParam)) {
            return;
        }
        try {
            C7920zy c7920zy = (C7920zy) new C4871g().n7h(evParam, C7920zy.class);
            C1708s.f7l8().ld6().n5r1(c7920zy.f12236k, c7920zy.f60301toq);
        } catch (Exception e2) {
            Log.e("Stat", "stats in ThemeH5Interface error.", e2);
        }
    }

    @JavascriptInterface
    public void changeStatusBar(int darkText) {
        Context context = this.f60296toq;
        if (context instanceof ThemeTabActivity) {
            ((ThemeTabActivity) context).bb.n7h(Integer.valueOf(darkText));
        }
    }

    @JavascriptInterface
    public int getActionBarHeight() {
        return C1819o.cdj(this.f60296toq.getResources());
    }

    @JavascriptInterface
    public boolean getIsChildAccount() {
        return C1688q.cdj().jk();
    }

    @JavascriptInterface
    public String getLoginCookie() {
        return C1688q.cdj().wvg() ? C1688q.kja0(C1688q.cdj().n7h()) : "";
    }

    @JavascriptInterface
    public String getOaid() {
        return C1807g.qrj();
    }

    @JavascriptInterface
    public int getStatusBarHeight() {
        return C1819o.gvn7(this.f60296toq.getResources());
    }

    @JavascriptInterface
    public String getUserIdAndAutoToken() {
        String strKja0;
        return (!C1688q.cdj().wvg() || (strKja0 = C1688q.kja0(C1688q.cdj().fu4())) == null) ? "" : strKja0;
    }

    @JavascriptInterface
    public void goNextPage() {
        this.f12229g++;
    }

    @JavascriptInterface
    public void goPreviousPage() {
        this.f12229g--;
    }

    @JavascriptInterface
    public boolean isDarkModeEnabled() {
        return C1819o.d2ok(bf2.toq.toq());
    }

    @JavascriptInterface
    public boolean isNetworkAvailable() {
        return mcp.m7138k() && mcp.m7139n();
    }

    @JavascriptInterface
    public String isShareAvailable() {
        return "true";
    }

    public void ld6(HybridView webView) {
        this.f12232q = new WeakReference<>(webView);
    }

    @JavascriptInterface
    public void login() {
        login(f12226p);
    }

    @JavascriptInterface
    public void onBackBtnPressed() {
        ((ThemeTabActivity) this.f60296toq).finish();
    }

    @JavascriptInterface
    public void onShareBtnPressed() {
        new Handler(Looper.getMainLooper()).post(new RunnableC2066k());
    }

    /* JADX INFO: renamed from: p */
    public void m7958p() {
        Object obj = f60294ld6;
        synchronized (obj) {
            this.f12230k = true;
            obj.notify();
        }
    }

    @JavascriptInterface
    public void ready() {
        if (!this.f12230k) {
            Object obj = f60294ld6;
            synchronized (obj) {
                if (!this.f12230k) {
                    try {
                        obj.wait(1000L);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        this.f12230k = false;
    }

    @JavascriptInterface
    public void setAccountVerifyResult(String result) {
        Activity activity = (Activity) this.f60296toq;
        if (C1819o.eqxt(activity) && (activity instanceof ThemeTabActivity)) {
            Intent intent = new Intent();
            intent.putExtra("result", result);
            intent.putExtra(ThemeTabActivity.az, ((ThemeTabActivity) activity).mbx());
            activity.setResult(-1, intent);
            activity.finish();
            Log.d(C2755a.f16307g, "ThemeH5Interface receive account safe verify result");
        }
    }

    @JavascriptInterface
    public void share(String title, String des, String url) {
        if (x2.zy()) {
            f7l8.m9439s(this.f60296toq, title, des, url);
            return;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.android.thememanager", "com.android.thememanager.activity.TransparentActivity"));
        intent.putExtra(p001b.f7l8.iz, 1);
        ((Activity) this.f60296toq).startActivityForResult(intent, 6002);
    }

    /* JADX INFO: renamed from: y */
    public int m7959y() {
        return this.f12229g;
    }

    @JavascriptInterface
    public void login(String jsCallbackMethod) {
        WeakReference<HybridView> weakReference = this.f12232q;
        if (weakReference == null) {
            return;
        }
        HybridView hybridView = weakReference.get();
        if (TextUtils.isEmpty(jsCallbackMethod) || hybridView == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("js method is null, or webView is null? ");
            sb.append(hybridView == null);
            Log.d(f12228y, sb.toString());
            return;
        }
        if (this.f60296toq instanceof Activity) {
            if (x2.zy()) {
                C1688q.cdj().fti((Activity) this.f60296toq, new toq(jsCallbackMethod, hybridView));
                return;
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.android.thememanager", "com.android.thememanager.activity.TransparentActivity"));
            intent.putExtra(p001b.f7l8.iz, 1);
            ((Activity) this.f60296toq).startActivityForResult(intent, 6002);
        }
    }
}
