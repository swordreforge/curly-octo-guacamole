package com.xiaomi.accountsdk.utils;

import android.webkit.CookieManager;
import android.webkit.WebView;
import com.xiaomi.accountsdk.account.C5500p;
import com.xiaomi.accountsdk.request.C5550t;

/* JADX INFO: compiled from: WebViewDeviceIdUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gvn7 extends AbstractC5576q {
    public void f7l8(WebView webView) {
        super.m19125n(webView);
    }

    /* JADX INFO: renamed from: g */
    public void m19084g(String str, CookieManager cookieManager) {
        super.zy(cookieManager, str);
    }

    @Override // com.xiaomi.accountsdk.utils.AbstractC5576q
    /* JADX INFO: renamed from: k */
    protected String mo19067k() {
        return C5550t.f72946zy;
    }

    @Override // com.xiaomi.accountsdk.utils.AbstractC5576q
    protected String toq() {
        return new com.xiaomi.accountsdk.hasheddeviceidlib.zy(C5500p.toq()).zy();
    }
}
