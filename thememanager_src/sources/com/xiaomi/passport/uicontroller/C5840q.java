package com.xiaomi.passport.uicontroller;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.xiaomi.accountsdk.utils.lvui;

/* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.q */
/* JADX INFO: compiled from: NotificationWebViewClient.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5840q extends WebViewClient {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f73247f7l8 = "auth-end";

    /* JADX INFO: renamed from: g */
    private static final String f32608g = "need-relogin";

    /* JADX INFO: renamed from: n */
    private static final String f32609n = "login-end";

    /* JADX INFO: renamed from: q */
    private static final String f32610q = "passInfo";

    /* JADX INFO: renamed from: k */
    private String f32611k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private CookieManager f73248toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private k f73249zy;

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.q$k */
    /* JADX INFO: compiled from: NotificationWebViewClient.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        void m20530k(String str, String str2);

        void toq(String str);

        void zy();
    }

    public C5840q(Context context, String str, k kVar) {
        this.f32611k = str;
        CookieSyncManager.createInstance(context);
        this.f73248toq = CookieManager.getInstance();
        this.f73249zy = kVar;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f73249zy == null) {
            return true;
        }
        String cookie = this.f73248toq.getCookie(this.f32611k);
        if (!TextUtils.isEmpty(cookie) && cookie.contains(f32610q)) {
            if (cookie.contains(f32608g)) {
                this.f73249zy.zy();
                return true;
            }
            if (cookie.contains(f32609n)) {
                String strZy = lvui.zy(cookie);
                this.f73249zy.m20530k(lvui.m19108q(cookie), strZy);
                return true;
            }
            if (cookie.contains(f73247f7l8)) {
                this.f73249zy.toq(str);
                return true;
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
