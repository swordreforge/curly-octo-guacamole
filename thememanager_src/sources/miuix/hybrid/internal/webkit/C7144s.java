package miuix.hybrid.internal.webkit;

import android.net.Uri;
import android.webkit.GeolocationPermissions;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import miuix.hybrid.AbstractC7152q;
import miuix.hybrid.HybridView;
import miuix.hybrid.InterfaceC7154t;
import miuix.hybrid.fn3e;

/* JADX INFO: renamed from: miuix.hybrid.internal.webkit.s */
/* JADX INFO: compiled from: WebChromeClient.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7144s extends miuix.hybrid.internal.provider.toq {

    /* JADX INFO: renamed from: miuix.hybrid.internal.webkit.s$k */
    /* JADX INFO: compiled from: WebChromeClient.java */
    class k extends WebChromeClient {
        k() {
        }

        /* JADX INFO: renamed from: k */
        public void m25889k(ValueCallback<Uri> uploadFile, String acceptType, String capture) {
            C7144s.this.mo25851y(new f7l8(uploadFile), acceptType, capture);
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
            C7144s.this.toq(origin, new C7140n(callback));
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView view, String url, String message, final JsResult result) {
            fn3e fn3eVar = new fn3e(result);
            C7144s c7144s = C7144s.this;
            return c7144s.zy(((miuix.hybrid.internal.provider.toq) c7144s).f87726toq, url, message, fn3eVar);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView view, String url, String message, final JsResult result) {
            fn3e fn3eVar = new fn3e(result);
            C7144s c7144s = C7144s.this;
            return c7144s.mo25850q(((miuix.hybrid.internal.provider.toq) c7144s).f87726toq, url, message, fn3eVar);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView view, int progress) {
            C7144s c7144s = C7144s.this;
            c7144s.mo25849n(((miuix.hybrid.internal.provider.toq) c7144s).f87726toq, progress);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView view, String title) {
            C7144s c7144s = C7144s.this;
            c7144s.mo25847g(((miuix.hybrid.internal.provider.toq) c7144s).f87726toq, title);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            return C7144s.this.f7l8(webView, new f7l8(filePathCallback), fileChooserParams);
        }
    }

    public C7144s(miuix.hybrid.qrj hybridChromeClient, HybridView hybridView) {
        super(hybridChromeClient, hybridView);
    }

    @Override // miuix.hybrid.internal.provider.toq
    public boolean f7l8(WebView webView, InterfaceC7154t<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return this.f40289k.m25917i(webView, filePathCallback, fileChooserParams);
    }

    @Override // miuix.hybrid.internal.provider.toq
    /* JADX INFO: renamed from: g */
    public void mo25847g(HybridView view, String title) {
        this.f40289k.t8r(view, title);
    }

    @Override // miuix.hybrid.internal.provider.toq
    /* JADX INFO: renamed from: k */
    public Object mo25848k() {
        return new k();
    }

    @Override // miuix.hybrid.internal.provider.toq
    /* JADX INFO: renamed from: n */
    public void mo25849n(HybridView view, int progress) {
        this.f40289k.ki(view, progress);
    }

    @Override // miuix.hybrid.internal.provider.toq
    /* JADX INFO: renamed from: q */
    public boolean mo25850q(HybridView view, String url, String message, fn3e result) {
        return this.f40289k.cdj(view, url, message, result);
    }

    @Override // miuix.hybrid.internal.provider.toq
    public void toq(String origin, AbstractC7152q.k callback) {
        this.f40289k.kja0(origin, callback);
    }

    @Override // miuix.hybrid.internal.provider.toq
    /* JADX INFO: renamed from: y */
    public void mo25851y(InterfaceC7154t<Uri> uploadFile, String acceptType, String capture) {
        this.f40289k.fn3e(uploadFile, acceptType, capture);
    }

    @Override // miuix.hybrid.internal.provider.toq
    public boolean zy(HybridView view, String url, String message, fn3e result) {
        return this.f40289k.m25916h(view, url, message, result);
    }
}
