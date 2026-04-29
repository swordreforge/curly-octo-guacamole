package com.xiaomi.accountsdk.utils;

import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import java.util.Map;

/* JADX INFO: compiled from: WebViewCookieUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class jp0y extends AbstractC5576q {
    /* JADX INFO: renamed from: g */
    public void m19091g(WebView webView, Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        CookieSyncManager.createInstance(webView.getContext());
        CookieManager cookieManager = CookieManager.getInstance();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            AbstractC5576q.m19124q(cookieManager, entry.getKey(), entry.getValue());
        }
        CookieSyncManager.getInstance().sync();
    }

    @Override // com.xiaomi.accountsdk.utils.AbstractC5576q
    /* JADX INFO: renamed from: k */
    protected String mo19067k() {
        return "";
    }

    @Override // com.xiaomi.accountsdk.utils.AbstractC5576q
    protected String toq() {
        return "";
    }
}
