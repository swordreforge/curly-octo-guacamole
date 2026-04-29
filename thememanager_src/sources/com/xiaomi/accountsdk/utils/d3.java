package com.xiaomi.accountsdk.utils;

import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import com.xiaomi.accountsdk.request.C5550t;
import com.xiaomi.accountsdk.utils.C5578t;
import com.xiaomi.accountsdk.utils.kja0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: WebViewFidNonceUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class d3 {

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.d3$k */
    /* JADX INFO: compiled from: WebViewFidNonceUtil.java */
    public static final class C5565k implements C5578t.toq {

        /* JADX INFO: renamed from: k */
        private final WeakReference<WebView> f31016k;

        public C5565k(WebView webView) {
            this.f31016k = new WeakReference<>(webView);
        }

        @Override // com.xiaomi.accountsdk.utils.C5578t.toq
        /* JADX INFO: renamed from: k */
        public void mo19065k() {
            WebView webView = this.f31016k.get();
            if (webView != null) {
                new d3().toq(webView);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m19064k(kja0 kja0Var, CookieManager cookieManager) {
        AbstractC5576q.m19124q(cookieManager, C5550t.f30977k, kja0Var.f31024k);
        AbstractC5576q.m19124q(cookieManager, C5550t.f72945toq, kja0Var.f72965toq);
    }

    public final void toq(WebView webView) {
        kja0 kja0VarM19097k;
        if (webView == null || (kja0VarM19097k = new kja0.C5571k().m19097k(kja0.toq.WEB_VIEW)) == null) {
            return;
        }
        CookieSyncManager.createInstance(webView.getContext());
        m19064k(kja0VarM19097k, CookieManager.getInstance());
        CookieSyncManager.getInstance().sync();
    }
}
