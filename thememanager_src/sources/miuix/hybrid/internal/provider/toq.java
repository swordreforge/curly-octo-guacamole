package miuix.hybrid.internal.provider;

import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import miuix.hybrid.AbstractC7152q;
import miuix.hybrid.HybridView;
import miuix.hybrid.InterfaceC7154t;
import miuix.hybrid.fn3e;
import miuix.hybrid.qrj;

/* JADX INFO: compiled from: AbsWebChromeClient.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class toq {

    /* JADX INFO: renamed from: k */
    protected qrj f40289k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected HybridView f87726toq;

    public toq(qrj hybridChromeClient, HybridView hybridView) {
        this.f40289k = hybridChromeClient;
        this.f87726toq = hybridView;
    }

    public boolean f7l8(WebView webView, InterfaceC7154t<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void mo25847g(HybridView view, String title) {
    }

    /* JADX INFO: renamed from: k */
    public Object mo25848k() {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public void mo25849n(HybridView view, int progress) {
    }

    /* JADX INFO: renamed from: q */
    public boolean mo25850q(HybridView view, String url, String message, final fn3e result) {
        return false;
    }

    public void toq(String origin, AbstractC7152q.k callback) {
    }

    /* JADX INFO: renamed from: y */
    public void mo25851y(InterfaceC7154t<Uri> uploadFile, String acceptType, String capture) {
    }

    public boolean zy(HybridView view, String url, String message, final fn3e result) {
        return false;
    }
}
