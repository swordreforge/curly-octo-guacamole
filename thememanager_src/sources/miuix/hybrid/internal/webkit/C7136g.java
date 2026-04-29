package miuix.hybrid.internal.webkit;

import android.webkit.SslErrorHandler;
import miuix.hybrid.wvg;

/* JADX INFO: renamed from: miuix.hybrid.internal.webkit.g */
/* JADX INFO: compiled from: SslErrorHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7136g extends wvg {

    /* JADX INFO: renamed from: k */
    private SslErrorHandler f40304k;

    public C7136g(SslErrorHandler sslErrorHandler) {
        this.f40304k = sslErrorHandler;
    }

    @Override // miuix.hybrid.wvg
    /* JADX INFO: renamed from: k */
    public void mo25872k() {
        this.f40304k.cancel();
    }

    @Override // miuix.hybrid.wvg
    public void toq() {
        this.f40304k.proceed();
    }
}
