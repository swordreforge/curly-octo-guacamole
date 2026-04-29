package miuix.hybrid.internal.webkit;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import miuix.hybrid.AbstractC7149n;
import miuix.hybrid.HybridView;
import miuix.hybrid.internal.provider.AbstractC7133q;
import miuix.hybrid.ki;

/* JADX INFO: compiled from: WebView.java */
/* JADX INFO: loaded from: classes3.dex */
public class qrj extends miuix.hybrid.internal.provider.zy {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected WebView f87740zy;

    public qrj(Context context, HybridView hybridView) {
        super(context, hybridView);
        this.f87740zy = new WebView(this.f40290k);
    }

    @Override // miuix.hybrid.internal.provider.zy
    public void cdj(String url) {
        this.f87740zy.loadUrl(url);
    }

    @Override // miuix.hybrid.internal.provider.zy
    public void f7l8(Canvas canvas) {
        this.f87740zy.draw(canvas);
    }

    @Override // miuix.hybrid.internal.provider.zy
    public void fn3e(miuix.hybrid.internal.provider.toq wrapper) {
        this.f87740zy.setWebChromeClient((WebChromeClient) wrapper.mo25848k());
    }

    @Override // miuix.hybrid.internal.provider.zy
    /* JADX INFO: renamed from: g */
    public void mo25852g() {
        this.f87740zy.destroy();
    }

    @Override // miuix.hybrid.internal.provider.zy
    /* JADX INFO: renamed from: h */
    public void mo25853h() {
        this.f87740zy.goBack();
    }

    @Override // miuix.hybrid.internal.provider.zy
    /* JADX INFO: renamed from: i */
    public void mo25854i(int visibility) {
        this.f87740zy.setVisibility(visibility);
    }

    @Override // miuix.hybrid.internal.provider.zy
    /* JADX INFO: renamed from: k */
    public void mo25855k(Object obj, String name) {
        this.f87740zy.addJavascriptInterface(obj, name);
    }

    @Override // miuix.hybrid.internal.provider.zy
    public void ki() {
        this.f87740zy.reload();
    }

    @Override // miuix.hybrid.internal.provider.zy
    public String kja0() {
        return this.f87740zy.getUrl();
    }

    @Override // miuix.hybrid.internal.provider.zy
    public View ld6() {
        return this.f87740zy.getRootView();
    }

    @Override // miuix.hybrid.internal.provider.zy
    /* JADX INFO: renamed from: n */
    public AbstractC7149n mo25856n() {
        return new C7145y(this.f87740zy.copyBackForwardList());
    }

    @Override // miuix.hybrid.internal.provider.zy
    public String n7h() {
        return this.f87740zy.getTitle();
    }

    @Override // miuix.hybrid.internal.provider.zy
    /* JADX INFO: renamed from: p */
    public Context mo25857p() {
        return this.f87740zy.getContext();
    }

    @Override // miuix.hybrid.internal.provider.zy
    /* JADX INFO: renamed from: q */
    public void mo25858q(boolean includeDiskFiles) {
        this.f87740zy.clearCache(includeDiskFiles);
    }

    @Override // miuix.hybrid.internal.provider.zy
    public ki qrj() {
        return new x2(this.f87740zy.getSettings());
    }

    @Override // miuix.hybrid.internal.provider.zy
    /* JADX INFO: renamed from: s */
    public int mo25859s() {
        return this.f87740zy.getContentHeight();
    }

    @Override // miuix.hybrid.internal.provider.zy
    public void t8r(DownloadListener downloadListener) {
        this.f87740zy.setDownloadListener(downloadListener);
    }

    @Override // miuix.hybrid.internal.provider.zy
    public boolean toq() {
        return this.f87740zy.canGoBack();
    }

    @Override // miuix.hybrid.internal.provider.zy
    public float x2() {
        return this.f87740zy.getScale();
    }

    @Override // miuix.hybrid.internal.provider.zy
    /* JADX INFO: renamed from: y */
    public View mo25860y() {
        return this.f87740zy;
    }

    @Override // miuix.hybrid.internal.provider.zy
    public void zurt(AbstractC7133q wrapper) {
        this.f87740zy.setWebViewClient((WebViewClient) wrapper.mo25843k());
    }

    @Override // miuix.hybrid.internal.provider.zy
    public boolean zy() {
        return this.f87740zy.canGoForward();
    }
}
