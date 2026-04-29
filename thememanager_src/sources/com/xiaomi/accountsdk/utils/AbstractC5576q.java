package com.xiaomi.accountsdk.utils;

import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import com.xiaomi.accountsdk.account.C5502s;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.q */
/* JADX INFO: compiled from: AbstractAccountWebViewSingleCookieUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5576q {

    /* JADX INFO: renamed from: k */
    public static final String f31052k;

    static {
        f31052k = C5502s.f30772k ? ".account.preview.n.xiaomi.net" : ".account.xiaomi.com";
    }

    /* JADX INFO: renamed from: q */
    protected static void m19124q(CookieManager cookieManager, String str, String str2) {
        if (cookieManager == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        cookieManager.setCookie(f31052k, String.format("%s=%s;", str, str2));
    }

    /* JADX INFO: renamed from: k */
    protected abstract String mo19067k();

    /* JADX INFO: renamed from: n */
    public final void m19125n(WebView webView) {
        if (webView == null || TextUtils.isEmpty(toq())) {
            return;
        }
        CookieSyncManager.createInstance(webView.getContext());
        m19124q(CookieManager.getInstance(), mo19067k(), toq());
        CookieSyncManager.getInstance().sync();
    }

    protected abstract String toq();

    protected final void zy(CookieManager cookieManager, String str) {
        m19124q(cookieManager, mo19067k(), str);
    }
}
