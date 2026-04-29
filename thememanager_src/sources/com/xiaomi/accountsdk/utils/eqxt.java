package com.xiaomi.accountsdk.utils;

import android.webkit.CookieManager;
import android.webkit.WebView;
import com.xiaomi.accountsdk.request.C5550t;

/* JADX INFO: compiled from: WebViewUserSpaceIdUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class eqxt extends AbstractC5576q {
    public void f7l8(WebView webView) {
        super.m19125n(webView);
    }

    /* JADX INFO: renamed from: g */
    public void m19066g(String str, CookieManager cookieManager) {
        super.zy(cookieManager, str);
    }

    @Override // com.xiaomi.accountsdk.utils.AbstractC5576q
    /* JADX INFO: renamed from: k */
    protected String mo19067k() {
        return C5550t.f30978q;
    }

    @Override // com.xiaomi.accountsdk.utils.AbstractC5576q
    protected String toq() {
        return a9.m19053k();
    }
}
