package com.android.thememanager.ad.view.activity;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.a98o;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.basemodule.views.LoadingView;
import com.android.thememanager.basemodule.views.ld6;
import miuix.core.util.x2;

/* JADX INFO: loaded from: classes.dex */
public class AdWebViewActivity extends AbstractActivityC1717k {

    /* JADX INFO: renamed from: m */
    public static final String f9535m = "extra_url";

    /* JADX INFO: renamed from: o */
    private static final String f9536o = "AdWebViewActivity";

    /* JADX INFO: renamed from: c */
    private ViewGroup f9537c;

    /* JADX INFO: renamed from: e */
    private LoadingView f9538e;

    /* JADX INFO: renamed from: f */
    private FrameLayout f9539f;

    /* JADX INFO: renamed from: j */
    private String f9540j;

    /* JADX INFO: renamed from: l */
    private com.android.thememanager.ad.toq f9541l;

    /* JADX INFO: renamed from: r */
    private WebView f9542r;

    /* JADX INFO: renamed from: com.android.thememanager.ad.view.activity.AdWebViewActivity$k */
    class C1654k extends WebViewClient {
        C1654k() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            if (C1819o.eqxt(AdWebViewActivity.this) && view != null) {
                C1819o.m7152e(AdWebViewActivity.this, view.getTitle());
            }
            AdWebViewActivity.this.r8s8();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            AdWebViewActivity.this.yqrt();
        }
    }

    private void bwp() {
        if (this.f9537c == null) {
            ViewGroup viewGroupM7337k = new ld6().m7337k((ViewStub) findViewById(R.id.webview_reload_stub), 1);
            this.f9537c = viewGroupM7337k;
            viewGroupM7337k.findViewById(R.id.local_entry).setVisibility(8);
            this.f9537c.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.ad.view.activity.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9544k.w831(view);
                }
            });
        }
        this.f9537c.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cfr(View view) {
        onBackPressed();
    }

    private void etdu() {
        this.f9539f = (FrameLayout) findViewById(R.id.container);
        this.f9538e = (LoadingView) findViewById(R.id.loading_view);
        View viewFindViewById = findViewById(R.id.up);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.ad.view.activity.toq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9545k.cfr(view);
                }
            });
        }
        sok();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r8s8() {
        LoadingView loadingView = this.f9538e;
        if (loadingView != null) {
            loadingView.setVisibility(8);
        }
    }

    private void sok() {
        WebView webView = (WebView) findViewById(R.id.ad_web_view);
        this.f9542r = webView;
        WebSettings settings = webView.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setTextZoom(100);
        if (mcp.m7140q(Uri.parse(this.f9540j))) {
            com.android.thememanager.ad.toq toqVar = new com.android.thememanager.ad.toq(this.f9542r);
            this.f9541l = toqVar;
            this.f9542r.addJavascriptInterface(toqVar, x2.f87403zy);
            settings.setJavaScriptEnabled(true);
        } else {
            Log.d(f9536o, "host not match,cannot add js.");
        }
        this.f9542r.setWebViewClient(new C1654k());
        a98o.m7002k(this.f9542r);
    }

    private void v0af() {
        ViewGroup viewGroup = this.f9537c;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w831(View view) {
        v0af();
        z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yqrt() {
        LoadingView loadingView = this.f9538e;
        if (loadingView != null) {
            loadingView.setVisibility(0);
        }
    }

    private void z4() {
        if (mcp.m7139n()) {
            this.f9542r.loadUrl(this.f9540j);
        } else {
            bwp();
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        WebView webView = this.f9542r;
        if (webView == null || !webView.canGoBack()) {
            super.onBackPressed();
        } else {
            this.f9542r.goBack();
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (m6709b() != null) {
            m6709b().mo173v(" ");
        }
        setContentView(R.layout.activity_ad_web_view);
        String stringExtra = getIntent().getStringExtra("extra_url");
        this.f9540j = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            Log.d(f9536o, "url is empty.");
            finish();
        } else {
            etdu();
            z4();
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.android.thememanager.ad.toq toqVar = this.f9541l;
        if (toqVar != null) {
            toqVar.f7l8();
            this.f9541l = null;
        }
        WebView webView = this.f9542r;
        if (webView != null) {
            this.f9539f.removeView(webView);
            this.f9542r.destroy();
            this.f9542r = null;
        }
    }
}
