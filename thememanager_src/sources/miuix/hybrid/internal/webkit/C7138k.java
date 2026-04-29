package miuix.hybrid.internal.webkit;

import android.webkit.CookieManager;

/* JADX INFO: renamed from: miuix.hybrid.internal.webkit.k */
/* JADX INFO: compiled from: CookieManagerAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7138k extends miuix.hybrid.toq {

    /* JADX INFO: renamed from: k */
    private CookieManager f40306k;

    public C7138k(CookieManager cookieManager) {
        this.f40306k = cookieManager;
    }

    @Override // miuix.hybrid.toq
    public void f7l8() {
        this.f40306k.removeAllCookie();
    }

    @Override // miuix.hybrid.toq
    /* JADX INFO: renamed from: g */
    public boolean mo25873g() {
        return this.f40306k.hasCookies();
    }

    @Override // miuix.hybrid.toq
    /* JADX INFO: renamed from: k */
    public boolean mo25874k() {
        return CookieManager.getInstance().acceptCookie();
    }

    @Override // miuix.hybrid.toq
    /* JADX INFO: renamed from: p */
    public void mo25875p(boolean accept) {
        this.f40306k.setAcceptCookie(accept);
    }

    @Override // miuix.hybrid.toq
    /* JADX INFO: renamed from: q */
    public String mo25876q(String url) {
        return this.f40306k.getCookie(url);
    }

    @Override // miuix.hybrid.toq
    public void qrj(String url, String value) {
        this.f40306k.setCookie(url, value);
    }

    @Override // miuix.hybrid.toq
    /* JADX INFO: renamed from: s */
    public void mo25877s() {
        this.f40306k.removeSessionCookie();
    }

    @Override // miuix.hybrid.toq
    protected void x2(boolean accept) {
        CookieManager.setAcceptFileSchemeCookies(accept);
    }

    @Override // miuix.hybrid.toq
    /* JADX INFO: renamed from: y */
    public void mo25878y() {
        this.f40306k.removeExpiredCookie();
    }

    @Override // miuix.hybrid.toq
    protected boolean zy() {
        return CookieManager.allowFileSchemeCookies();
    }
}
