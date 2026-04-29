package com.android.thememanager.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.v9.data.LoginLoader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Stack;
import miuix.appcompat.app.AbstractC6946k;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: BaseWebActivity.java */
/* JADX INFO: loaded from: classes.dex */
public class ek5k extends kja0 implements InterfaceC1357q, InterfaceC1925p, LoginLoader.InterfaceC2849k {

    /* JADX INFO: renamed from: a */
    public static final String f9026a = "com.google.android.webview";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    protected static final long f57303bo = 4;

    /* JADX INFO: renamed from: d */
    protected static final long f9027d = 16;

    /* JADX INFO: renamed from: u */
    protected static final long f9028u = 2;

    /* JADX INFO: renamed from: v */
    protected static final long f9029v = 8;

    /* JADX INFO: renamed from: w */
    protected static final long f9030w = 32;

    /* JADX INFO: renamed from: x */
    protected static final long f9031x = 1;

    /* JADX INFO: renamed from: c */
    protected WebView f9033c;

    /* JADX INFO: renamed from: e */
    private View f9034e;

    /* JADX INFO: renamed from: j */
    private LoginLoader f9035j;

    /* JADX INFO: renamed from: o */
    protected Uri f9037o;

    /* JADX INFO: renamed from: m */
    private Stack<String> f9036m = new Stack<>();

    /* JADX INFO: renamed from: b */
    private HashMap<String, Uri> f9032b = new HashMap<>();

    /* JADX INFO: renamed from: com.android.thememanager.activity.ek5k$k */
    /* JADX INFO: compiled from: BaseWebActivity.java */
    class C1578k implements C1688q.n {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C1688q f9038k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Uri f57304toq;

        C1578k(final C1688q val$login, final Uri val$uriAfterLogin) {
            this.f9038k = val$login;
            this.f57304toq = val$uriAfterLogin;
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
            if (loginError == C1688q.g.ERROR_LOGIN_UNACTIVATED) {
                com.android.thememanager.util.ch.yz(ek5k.this);
            } else {
                com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.fail_to_add_account, 0);
            }
            Uri uri = this.f57304toq;
            ek5k ek5kVar = ek5k.this;
            if (uri == ek5kVar.f9037o) {
                ek5kVar.finish();
            }
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            if (this.f9038k.x2() == null) {
                ek5k.this.f9034e.setVisibility(0);
                ek5k.this.yl();
            } else {
                com.android.thememanager.controller.online.fu4.m7547q();
                ek5k.this.h7am(this.f57304toq);
            }
        }
    }

    /* JADX INFO: compiled from: BaseWebActivity.java */
    protected class toq implements DownloadListener {
        protected toq() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
            ek5k.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
        }
    }

    /* JADX INFO: compiled from: BaseWebActivity.java */
    protected class zy extends WebViewClient {
        protected zy() {
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(WebView view, String url, boolean isReload) {
            super.doUpdateVisitedHistory(view, url, isReload);
            if (ek5k.this.f9036m.isEmpty() || !url.equals(ek5k.this.f9036m.peek())) {
                ek5k.this.f9036m.push(url);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            ek5k.this.f9033c.getSettings().setCacheMode(-1);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (!super.shouldOverrideUrlLoading(view, url)) {
                ek5k ek5kVar = ek5k.this;
                if (!ek5kVar.mbx(ek5kVar.zkd(url), url)) {
                    return false;
                }
            }
            return true;
        }
    }

    private boolean bek6(Uri uri) {
        return (ktq(uri) & 24) != 0;
    }

    private boolean cv06(Uri uri) {
        return (ktq(uri) & 8) != 0;
    }

    private void jbh(final Uri uriAfterLogin) {
        C1688q c1688qCdj = C1688q.cdj();
        c1688qCdj.fti(this, new C1578k(c1688qCdj, uriAfterLogin));
    }

    private long ktq(Uri uri) {
        try {
            return Long.parseLong(uri.getQueryParameter(InterfaceC1925p.en));
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yl() {
        if (this.f9035j == null) {
            this.f9035j = new LoginLoader(this);
            getLifecycle().mo4451k(this.f9035j);
        }
        this.f9035j.m10149n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Uri zkd(String url) {
        Uri uri = this.f9032b.get(url);
        return uri == null ? Uri.parse(url) : uri;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: a */
    public String mo6345a() {
        return com.android.thememanager.basemodule.analysis.toq.z3jl;
    }

    protected WebViewClient b3e() {
        return new zy();
    }

    protected DownloadListener bwp() {
        return new toq();
    }

    protected com.android.thememanager.controller.online.zurt bz2(Uri uri) {
        com.android.thememanager.controller.online.zurt zurtVar = new com.android.thememanager.controller.online.zurt(uri);
        long jKtq = ktq(uri);
        if ((2 & jKtq) != 0) {
            zurtVar.setHttpMethod(zurt.toq.POST);
        }
        if ((4 & jKtq) != 0) {
            zurtVar.addRequestFlag(1);
        }
        if ((jKtq & 8) != 0) {
            zurtVar.addRequestFlag(4);
        }
        com.android.thememanager.controller.online.ld6.m7572n(zurtVar);
        return zurtVar;
    }

    @Override // com.android.thememanager.v9.data.LoginLoader.InterfaceC2849k
    public void gbni() {
        this.f9034e.setVisibility(8);
        com.android.thememanager.controller.online.fu4.m7547q();
        h7am(this.f9037o);
    }

    protected void h7am(Uri uri) {
        byte[] bytes;
        if (C1915g.m7549k()) {
            if (cv06(uri) && C1688q.cdj().fn3e() == null) {
                com.android.thememanager.basemodule.utils.nn86.toq("error: failed token", 0);
                return;
            }
            if ((ktq(uri) & 1) != 0) {
                this.f9033c.getSettings().setCacheMode(2);
            } else {
                this.f9033c.getSettings().setCacheMode(-1);
            }
            com.android.thememanager.controller.online.zurt zurtVarBz2 = bz2(uri);
            if (zurtVarBz2.usingHttpGetMethod()) {
                String finalGetUrl = zurtVarBz2.getFinalGetUrl();
                this.f9033c.loadUrl(finalGetUrl);
                this.f9032b.put(finalGetUrl, uri);
                return;
            }
            Pair<String, String> finalPostUrl = zurtVarBz2.getFinalPostUrl();
            Object obj = finalPostUrl.second;
            if (obj == null) {
                Log.e("loadUrl", "data may not be null");
                return;
            }
            try {
                bytes = ((String) obj).getBytes("base64");
            } catch (UnsupportedEncodingException unused) {
                bytes = ((String) finalPostUrl.second).getBytes();
            }
            this.f9033c.postUrl((String) finalPostUrl.first, bytes);
            this.f9032b.put((String) finalPostUrl.first, uri);
        }
    }

    protected boolean mbx(Uri uri, String originUrl) {
        if ((("http".equals(uri.getScheme()) || "https".equals(uri.getScheme())) && (ktq(uri) & 32) == 0) ? false : true) {
            com.android.thememanager.basemodule.utils.x9kr.m7239g(this, uri, originUrl);
            return true;
        }
        if (!bek6(uri)) {
            return com.android.thememanager.util.nmn5.f7l8(this, uri);
        }
        if (C1688q.cdj().fn3e() == null) {
            jbh(uri);
        } else {
            h7am(uri);
        }
        return true;
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f9036m.size() <= 1) {
            super.onBackPressed();
        } else {
            this.f9036m.pop();
            h7am(zkd(this.f9036m.peek()));
        }
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Uri uriSe = se();
        this.f9037o = uriSe;
        if (uriSe == null || !com.android.thememanager.controller.online.fu4.m7546k(uriSe) || "http".equals(this.f9037o.getScheme())) {
            com.android.thememanager.basemodule.utils.nn86.toq("Invalid url !", 0);
            finish();
            return;
        }
        if (!com.android.thememanager.basemodule.utils.a9.m6999s(f9026a)) {
            com.android.thememanager.basemodule.utils.nn86.toq("webview not installed", 0);
            startActivity(com.android.thememanager.basemodule.utils.x9kr.zy(this.f9037o.toString()));
            finish();
            return;
        }
        AbstractC6946k appCompatActionBar = getAppCompatActionBar();
        if (appCompatActionBar != null) {
            appCompatActionBar.mo152a(true);
            appCompatActionBar.mo173v(uj2j());
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.webview_container);
        WebView webView = new WebView(this);
        this.f9033c = webView;
        viewGroup.addView(webView, 0);
        this.f9034e = findViewById(R.id.loading);
        WebSettings settings = this.f9033c.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        this.f9033c.setOverScrollMode(2);
        this.f9033c.setWebViewClient(b3e());
        this.f9033c.setDownloadListener(bwp());
        com.android.thememanager.basemodule.utils.a98o.m7002k(this.f9033c);
        com.android.thememanager.controller.online.fu4.m7547q();
        if (C1688q.cdj().fn3e() == null && bek6(this.f9037o)) {
            jbh(this.f9037o);
        } else {
            h7am(this.f9037o);
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        WebView webView = this.f9033c;
        if (webView != null) {
            if (webView.getParent() != null) {
                ((ViewGroup) this.f9033c.getParent()).removeView(this.f9033c);
            }
            this.f9033c.destroy();
        }
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f9033c.onPause();
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f9033c.onResume();
    }

    @Override // com.android.thememanager.activity.kja0
    protected int r8s8() {
        return R.layout.resource_webview;
    }

    protected Uri se() {
        String stringExtra = getIntent().getStringExtra(InterfaceC1357q.f53885i1);
        if (stringExtra == null) {
            return null;
        }
        return Uri.parse(stringExtra);
    }

    protected String uj2j() {
        return null;
    }

    protected void vep5() {
        if (this.f9036m.size() > 0) {
            h7am(zkd(this.f9036m.peek()));
        }
    }
}
