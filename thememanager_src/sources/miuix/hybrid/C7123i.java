package miuix.hybrid;

import android.graphics.Bitmap;
import android.net.http.SslError;
import com.android.thememanager.basemodule.utils.C1819o;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: renamed from: miuix.hybrid.i */
/* JADX INFO: compiled from: HybridViewClient.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7123i {

    /* JADX INFO: renamed from: q */
    private static final String f40228q = "android_asset/hybrid/";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f87697zy = "hybrid/";

    /* JADX INFO: renamed from: k */
    private miuix.hybrid.internal.f7l8 f40229k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final miuix.hybrid.internal.webkit.kja0 f87698toq = new miuix.hybrid.internal.webkit.kja0();

    public cdj f7l8(HybridView view, String url) {
        int iIndexOf;
        int i2;
        if (url == null || !url.startsWith("http") || (iIndexOf = url.indexOf(f40228q)) < 0 || (i2 = iIndexOf + 21) >= url.length()) {
            return null;
        }
        String strSubstring = url.substring(i2);
        try {
            return new cdj(null, null, this.f40229k.qrj().getAssets().open(f87697zy + strSubstring));
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m25793g(miuix.hybrid.internal.f7l8 manager) {
        this.f40229k = manager;
    }

    /* JADX INFO: renamed from: k */
    public void mo7982k(HybridView view, String url) {
        C1819o.m7152e(this.f40229k.qrj(), view.getTitle());
        this.f87698toq.m25879k(view.getWebView(), url);
    }

    /* JADX INFO: renamed from: n */
    public void mo7983n(HybridView view, wvg handler, SslError error) {
        handler.mo25872k();
    }

    /* JADX INFO: renamed from: q */
    public void m25794q(HybridView view, String realm, String account, String args) {
        this.f87698toq.zy(view.getWebView(), realm, account, args);
    }

    public void toq(HybridView view, String url, Bitmap favicon) {
        fu4 fu4Var = new fu4();
        fu4Var.zy(UUID.randomUUID().toString());
        fu4Var.m25790q(url);
        this.f40229k.d3(fu4Var);
        this.f40229k.wvg();
        view.setWebProvider(url);
        view.setLoadingError(false);
        this.f87698toq.toq(view.getWebView(), url, favicon);
    }

    /* JADX INFO: renamed from: y */
    public boolean mo7984y(final HybridView view, String url) {
        return this.f87698toq.m25880q(view.getWebView(), url);
    }

    public void zy(HybridView view, int errorCode, String description, String failingUrl) {
        view.setLoadingError(true);
        view.n7h();
    }
}
