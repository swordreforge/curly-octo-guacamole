package miuix.hybrid.internal.webkit;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import miuix.hybrid.C7123i;
import miuix.hybrid.HybridView;
import miuix.hybrid.cdj;
import miuix.hybrid.internal.provider.AbstractC7133q;
import miuix.hybrid.wvg;

/* JADX INFO: compiled from: WebViewClient.java */
/* JADX INFO: loaded from: classes3.dex */
public class n7h extends AbstractC7133q {

    /* JADX INFO: renamed from: miuix.hybrid.internal.webkit.n7h$k */
    /* JADX INFO: compiled from: WebViewClient.java */
    class C7141k extends WebViewClient {
        C7141k() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            n7h n7hVar = n7h.this;
            n7hVar.toq(((AbstractC7133q) n7hVar).f87725toq, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            n7h n7hVar = n7h.this;
            n7hVar.zy(((AbstractC7133q) n7hVar).f87725toq, url, favicon);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            n7h n7hVar = n7h.this;
            n7hVar.mo25845q(((AbstractC7133q) n7hVar).f87725toq, errorCode, description, failingUrl);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(WebView view, String realm, String account, String args) {
            n7h n7hVar = n7h.this;
            n7hVar.mo25844n(((AbstractC7133q) n7hVar).f87725toq, realm, account, args);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            C7136g c7136g = new C7136g(handler);
            n7h n7hVar = n7h.this;
            n7hVar.mo25842g(((AbstractC7133q) n7hVar).f87725toq, c7136g, error);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            n7h n7hVar = n7h.this;
            cdj cdjVarF7l8 = n7hVar.f7l8(((AbstractC7133q) n7hVar).f87725toq, url);
            if (cdjVarF7l8 == null) {
                return null;
            }
            return new ld6(cdjVarF7l8);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            n7h n7hVar = n7h.this;
            return n7hVar.mo25846y(((AbstractC7133q) n7hVar).f87725toq, url);
        }
    }

    public n7h(C7123i hybridViewClient, HybridView hybridView) {
        super(hybridViewClient, hybridView);
    }

    @Override // miuix.hybrid.internal.provider.AbstractC7133q
    public cdj f7l8(HybridView view, String url) {
        return this.f40288k.f7l8(view, url);
    }

    @Override // miuix.hybrid.internal.provider.AbstractC7133q
    /* JADX INFO: renamed from: g */
    public void mo25842g(HybridView view, wvg handler, SslError error) {
        this.f40288k.mo7983n(view, handler, error);
    }

    @Override // miuix.hybrid.internal.provider.AbstractC7133q
    /* JADX INFO: renamed from: k */
    public Object mo25843k() {
        return new C7141k();
    }

    @Override // miuix.hybrid.internal.provider.AbstractC7133q
    /* JADX INFO: renamed from: n */
    public void mo25844n(HybridView view, String realm, String account, String args) {
        this.f40288k.m25794q(view, realm, account, args);
    }

    @Override // miuix.hybrid.internal.provider.AbstractC7133q
    /* JADX INFO: renamed from: q */
    public void mo25845q(HybridView view, int errorCode, String description, String failingUrl) {
        this.f40288k.zy(view, errorCode, description, failingUrl);
    }

    @Override // miuix.hybrid.internal.provider.AbstractC7133q
    public void toq(HybridView view, String url) {
        this.f40288k.mo7982k(view, url);
    }

    @Override // miuix.hybrid.internal.provider.AbstractC7133q
    /* JADX INFO: renamed from: y */
    public boolean mo25846y(HybridView view, String url) {
        return this.f40288k.mo7984y(view, url);
    }

    @Override // miuix.hybrid.internal.provider.AbstractC7133q
    public void zy(HybridView view, String url, Bitmap favicon) {
        this.f40288k.toq(view, url, favicon);
    }
}
