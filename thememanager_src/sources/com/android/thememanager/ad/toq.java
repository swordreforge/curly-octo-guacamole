package com.android.thememanager.ad;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.android.thememanager.basemodule.utils.a9;
import hb.C6072k;
import hb.toq;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: AdH5Interface.java */
/* JADX INFO: loaded from: classes.dex */
public class toq implements com.android.thememanager.ad.download.zy {

    /* JADX INFO: renamed from: g */
    private static final String f9531g = "downloadStatus";

    /* JADX INFO: renamed from: n */
    private static final String f9532n = "downloadProgress";

    /* JADX INFO: renamed from: q */
    private static final String f9533q = "AdH5Interface";

    /* JADX INFO: renamed from: k */
    private WeakReference<WebView> f9534k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private HashMap<String, String> f57387toq = new HashMap<>(1);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private HashMap<String, String> f57388zy = new HashMap<>(1);

    public toq(WebView webView) {
        this.f9534k = new WeakReference<>(webView);
        com.android.thememanager.ad.download.toq.m6518s().m6520q(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m6532g(WebView webView, StringBuilder sb) {
        webView.evaluateJavascript(sb.toString(), null);
    }

    /* JADX INFO: renamed from: n */
    private static void m6533n(final WebView webView, String jsCallbackMethod, String... args) {
        if (webView == null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("javascript:");
        sb.append(jsCallbackMethod);
        sb.append("(");
        for (int i2 = 0; i2 < args.length; i2++) {
            zy(sb, args[i2]);
            if (i2 != args.length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            webView.evaluateJavascript(sb.toString(), null);
        } else {
            webView.post(new Runnable() { // from class: com.android.thememanager.ad.k
                @Override // java.lang.Runnable
                public final void run() {
                    toq.m6532g(webView, sb);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    private static void m6534q(WebView webView, String jsMethod, C6072k downloadRecord) {
        m6533n(webView, jsMethod, String.valueOf(downloadRecord.f35087k), String.valueOf(downloadRecord.f35088n), String.valueOf(downloadRecord.f77067toq), String.valueOf(downloadRecord.f77068zy));
    }

    private static void zy(StringBuilder builder, String arg) {
        if (TextUtils.isEmpty(arg)) {
            arg = "";
        }
        if (arg.startsWith("{")) {
            builder.append(arg);
            return;
        }
        builder.append("'");
        builder.append(arg);
        builder.append("'");
    }

    public void f7l8() {
        com.android.thememanager.ad.download.toq.m6518s().kja0(this);
        HashMap<String, String> map = this.f57387toq;
        if (map != null) {
            map.clear();
            this.f57387toq = null;
        }
        HashMap<String, String> map2 = this.f57388zy;
        if (map2 != null) {
            map2.clear();
            this.f57388zy = null;
        }
    }

    @JavascriptInterface
    public int getApkVersion(String packageName) {
        return a9.m7000y(bf2.toq.toq(), packageName);
    }

    @JavascriptInterface
    public String getAppDownloadState(String packageName) {
        C6072k c6072kM6521y = com.android.thememanager.ad.download.toq.m6518s().m6521y(packageName);
        JSONObject jSONObject = new JSONObject();
        try {
            if (AdUtils.m6496t(packageName)) {
                jSONObject.put(f9531g, 4);
                jSONObject.put(f9532n, 100);
            } else if (c6072kM6521y == null) {
                jSONObject.put(f9531g, -1);
                jSONObject.put(f9532n, 0);
            } else {
                jSONObject.put(f9531g, c6072kM6521y.f35089q);
                jSONObject.put(f9532n, c6072kM6521y.f35088n);
            }
        } catch (JSONException e2) {
            Log.e(f9533q, "JSONException", e2);
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public boolean isFeatureSupport(int type) {
        return type == 3 || type == 4;
    }

    @Override // com.android.thememanager.ad.download.zy
    /* JADX INFO: renamed from: k */
    public void mo6522k(String packageName, C6072k downloadRecord) {
        WebView webView = this.f9534k.get();
        if (webView == null) {
            Log.d(f9533q, "WebView invalid");
            this.f57387toq.remove(packageName);
            this.f57388zy.remove(packageName);
            return;
        }
        HashMap<String, String> map = this.f57387toq;
        if (map != null && map.containsKey(packageName)) {
            m6534q(webView, this.f57387toq.get(packageName), downloadRecord);
        }
        HashMap<String, String> map2 = this.f57388zy;
        if (map2 != null && map2.containsKey(packageName) && downloadRecord.f35089q == 2) {
            m6534q(webView, this.f57388zy.get(packageName), downloadRecord);
        }
    }

    @JavascriptInterface
    public void pauseDownloadAppDirectly(String packageName, String senderPackageName, String jsCallback) {
        toq.C6073k c6073k = new toq.C6073k();
        c6073k.m22363p(packageName);
        com.android.thememanager.ad.download.toq.m6518s().x2(c6073k.m22364q());
        if (this.f57388zy.containsKey(packageName)) {
            return;
        }
        this.f57388zy.put(packageName, jsCallback);
    }

    @JavascriptInterface
    public void resumeDownloadAppDirectly(String packageName, String senderPackageName) {
        toq.C6073k c6073k = new toq.C6073k();
        c6073k.m22363p(packageName);
        com.android.thememanager.ad.download.toq.m6518s().m6519h(c6073k.m22364q());
    }

    @JavascriptInterface
    public void setCallbackForNotifyAppLaunch(String deeplinkUrl, String packageName, String jsCallback) {
        WebView webView;
        boolean zX2;
        int i2;
        if (TextUtils.isEmpty(jsCallback) || (webView = this.f9534k.get()) == null) {
            return;
        }
        if (TextUtils.isEmpty(deeplinkUrl)) {
            zX2 = false;
            i2 = 0;
        } else {
            zX2 = a9.x2(webView.getContext(), deeplinkUrl);
            i2 = 3;
        }
        if (!zX2) {
            i2 = a9.kja0(webView.getContext(), packageName) ? 1 : 2;
        }
        m6533n(webView, jsCallback, packageName, String.valueOf(i2));
    }

    @JavascriptInterface
    public void startInstallAppDirectly(final String packageName, final String ref, final String appClientId, final String paramSignature, final String nonce, final String senderPackageName, String jsCallback) {
        startInstallAppDirectly(packageName, ref, appClientId, paramSignature, nonce, senderPackageName, null, jsCallback);
    }

    @JavascriptInterface
    public void startInstallAppDirectly1(final String packageName, final String url, final String jsCallback) {
        toq.C6073k c6073k = new toq.C6073k();
        c6073k.m22363p(packageName).m22360g(url).m22364q();
        com.android.thememanager.ad.download.toq.m6518s().cdj(c6073k.m22364q());
        if (this.f57387toq.containsKey(packageName)) {
            return;
        }
        this.f57387toq.put(packageName, jsCallback);
    }

    @JavascriptInterface
    public void startInstallAppDirectly(final String packageName, final String ref, final String appClientId, final String paramSignature, final String nonce, final String senderPackageName, final String extraQueryParams, String jsCallback) {
        toq.C6073k c6073k = new toq.C6073k();
        c6073k.m22363p(packageName).toq(ref).m22361k(appClientId).zy(paramSignature).m22366y(nonce);
        if (!TextUtils.isEmpty(extraQueryParams)) {
            try {
                JSONObject jSONObject = new JSONObject(extraQueryParams);
                if (jSONObject.optBoolean("ext_launchWhenInstalled", false)) {
                    c6073k.f7l8(true);
                }
                jSONObject.remove("ext_launchWhenInstalled");
                c6073k.m22362n(jSONObject.toString());
            } catch (JSONException e2) {
                c6073k.m22362n(extraQueryParams);
                Log.e(f9533q, e2.getLocalizedMessage());
            }
        }
        com.android.thememanager.ad.download.toq.m6518s().cdj(c6073k.m22364q());
        if (this.f57387toq.containsKey(packageName)) {
            return;
        }
        this.f57387toq.put(packageName, jsCallback);
    }
}
