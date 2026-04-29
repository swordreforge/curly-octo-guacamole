package miuix.hybrid.internal.webkit;

import android.webkit.WebSettings;
import miuix.hybrid.ki;

/* JADX INFO: compiled from: WebSettings.java */
/* JADX INFO: loaded from: classes3.dex */
public class x2 extends ki {

    /* JADX INFO: renamed from: k */
    private final WebSettings f40321k;

    public x2(WebSettings webSettings) {
        this.f40321k = webSettings;
    }

    @Override // miuix.hybrid.ki
    public void f7l8(String databasePath) {
        this.f40321k.setGeolocationDatabasePath(databasePath);
    }

    @Override // miuix.hybrid.ki
    /* JADX INFO: renamed from: g */
    public void mo25890g(boolean flag) {
        this.f40321k.setDomStorageEnabled(flag);
    }

    @Override // miuix.hybrid.ki
    /* JADX INFO: renamed from: k */
    public String mo25891k() {
        return this.f40321k.getUserAgentString();
    }

    @Override // miuix.hybrid.ki
    public void kja0(String ua) {
        this.f40321k.setUserAgentString(ua);
    }

    @Override // miuix.hybrid.ki
    public void ld6(boolean overview) {
        this.f40321k.setLoadWithOverviewMode(overview);
    }

    @Override // miuix.hybrid.ki
    /* JADX INFO: renamed from: n */
    public void mo25892n(boolean flag) {
        this.f40321k.setDatabaseEnabled(flag);
    }

    @Override // miuix.hybrid.ki
    public void n7h(boolean use) {
        this.f40321k.setUseWideViewPort(use);
    }

    @Override // miuix.hybrid.ki
    /* JADX INFO: renamed from: p */
    public void mo25893p(boolean flag) {
        this.f40321k.setJavaScriptEnabled(flag);
    }

    @Override // miuix.hybrid.ki
    /* JADX INFO: renamed from: q */
    public void mo25894q(int mode) {
        this.f40321k.setCacheMode(mode);
    }

    @Override // miuix.hybrid.ki
    public void qrj(int textZoom) {
        this.f40321k.setTextZoom(textZoom);
    }

    @Override // miuix.hybrid.ki
    /* JADX INFO: renamed from: s */
    public void mo25895s(boolean flag) {
        this.f40321k.setJavaScriptCanOpenWindowsAutomatically(flag);
    }

    @Override // miuix.hybrid.ki
    public void toq(boolean flag) {
        this.f40321k.setAllowFileAccessFromFileURLs(flag);
    }

    @Override // miuix.hybrid.ki
    public void x2(boolean support) {
        this.f40321k.setSupportMultipleWindows(support);
    }

    @Override // miuix.hybrid.ki
    /* JADX INFO: renamed from: y */
    public void mo25896y(boolean flag) {
        this.f40321k.setGeolocationEnabled(flag);
    }

    @Override // miuix.hybrid.ki
    public void zy(boolean flag) {
        this.f40321k.setAllowUniversalAccessFromFileURLs(flag);
    }
}
