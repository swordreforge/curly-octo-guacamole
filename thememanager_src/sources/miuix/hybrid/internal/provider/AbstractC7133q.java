package miuix.hybrid.internal.provider;

import android.graphics.Bitmap;
import android.net.http.SslError;
import miuix.hybrid.C7123i;
import miuix.hybrid.HybridView;
import miuix.hybrid.cdj;
import miuix.hybrid.wvg;

/* JADX INFO: renamed from: miuix.hybrid.internal.provider.q */
/* JADX INFO: compiled from: AbsWebViewClient.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7133q {

    /* JADX INFO: renamed from: k */
    protected C7123i f40288k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected HybridView f87725toq;

    public AbstractC7133q(C7123i hybridViewClient, HybridView hybridView) {
        this.f40288k = hybridViewClient;
        this.f87725toq = hybridView;
    }

    public cdj f7l8(HybridView view, String url) {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public void mo25842g(HybridView view, wvg handler, SslError error) {
    }

    /* JADX INFO: renamed from: k */
    public Object mo25843k() {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public void mo25844n(HybridView view, String realm, String account, String args) {
    }

    /* JADX INFO: renamed from: q */
    public void mo25845q(HybridView view, int errorCode, String description, String failingUrl) {
    }

    public void toq(HybridView view, String url) {
    }

    /* JADX INFO: renamed from: y */
    public boolean mo25846y(final HybridView view, String url) {
        return false;
    }

    public void zy(HybridView view, String url, Bitmap favicon) {
    }
}
