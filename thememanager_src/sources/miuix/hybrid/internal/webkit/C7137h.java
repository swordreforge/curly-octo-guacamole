package miuix.hybrid.internal.webkit;

import android.content.Context;
import android.webkit.CookieManager;
import miuix.hybrid.C7123i;
import miuix.hybrid.HybridView;
import miuix.hybrid.internal.provider.AbstractC7131k;
import miuix.hybrid.internal.provider.AbstractC7133q;
import miuix.hybrid.internal.provider.C7130g;

/* JADX INFO: renamed from: miuix.hybrid.internal.webkit.h */
/* JADX INFO: compiled from: WebkitFactoryProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7137h extends C7130g {

    /* JADX INFO: renamed from: k */
    private miuix.hybrid.toq f40305k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private AbstractC7131k f87736toq;

    @Override // miuix.hybrid.internal.provider.C7130g
    /* JADX INFO: renamed from: k */
    public miuix.hybrid.internal.provider.toq mo25837k(miuix.hybrid.qrj hybridChromeClient, HybridView hybridView) {
        return new C7144s(hybridChromeClient, hybridView);
    }

    @Override // miuix.hybrid.internal.provider.C7130g
    /* JADX INFO: renamed from: n */
    public AbstractC7131k mo25838n() {
        if (this.f87736toq == null) {
            this.f87736toq = new toq();
        }
        return this.f87736toq;
    }

    @Override // miuix.hybrid.internal.provider.C7130g
    /* JADX INFO: renamed from: q */
    public miuix.hybrid.toq mo25839q() {
        if (this.f40305k == null) {
            this.f40305k = new C7138k(CookieManager.getInstance());
        }
        return this.f40305k;
    }

    @Override // miuix.hybrid.internal.provider.C7130g
    public miuix.hybrid.internal.provider.zy toq(Context context, HybridView hybridView) {
        return new qrj(context, hybridView);
    }

    @Override // miuix.hybrid.internal.provider.C7130g
    public AbstractC7133q zy(C7123i hybridViewClient, HybridView hybridView) {
        return new n7h(hybridViewClient, hybridView);
    }
}
