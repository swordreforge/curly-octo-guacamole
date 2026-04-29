package com.xiaomi.accountsdk.utils;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.xiaomi.accountsdk.account.C5500p;

/* JADX INFO: compiled from: WebViewNativeUserAgentUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class oc extends AbstractC5576q {
    public void f7l8(WebView webView) {
        super.m19125n(webView);
    }

    /* JADX INFO: renamed from: g */
    public void m19123g(String str, CookieManager cookieManager) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.zy(cookieManager, Base64.encodeToString(str.getBytes(), 2));
    }

    @Override // com.xiaomi.accountsdk.utils.AbstractC5576q
    /* JADX INFO: renamed from: k */
    protected String mo19067k() {
        return "NativeUserAgent";
    }

    @Override // com.xiaomi.accountsdk.utils.AbstractC5576q
    protected String toq() {
        String strM18780g = C5500p.m18780g();
        if (TextUtils.isEmpty(strM18780g)) {
            return null;
        }
        return Base64.encodeToString(strM18780g.getBytes(), 2);
    }
}
