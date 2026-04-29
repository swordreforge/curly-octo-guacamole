package com.xiaomi.passport.uicontroller;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.xiaomi.accountsdk.account.C5497k;
import com.xiaomi.accountsdk.account.data.C5480k;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import com.xiaomi.accountsdk.utils.AbstractC5576q;
import com.xiaomi.accountsdk.utils.C5578t;
import com.xiaomi.accountsdk.utils.d3;
import com.xiaomi.accountsdk.utils.eqxt;
import com.xiaomi.accountsdk.utils.fti;
import com.xiaomi.accountsdk.utils.gvn7;
import com.xiaomi.accountsdk.utils.jp0y;
import com.xiaomi.accountsdk.utils.lvui;
import com.xiaomi.accountsdk.utils.oc;
import com.xiaomi.passport.uicontroller.C5840q;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class NotificationWebView extends WebView {

    /* JADX INFO: renamed from: h */
    private static final String f32566h = "need_remove_all_cookies";

    /* JADX INFO: renamed from: i */
    private static final String f32567i = "NotificationWebView";

    /* JADX INFO: renamed from: g */
    private final C5840q.k f32568g;

    /* JADX INFO: renamed from: k */
    private final C5578t.toq f32569k;

    /* JADX INFO: renamed from: n */
    private final boolean f32570n;

    /* JADX INFO: renamed from: p */
    private final Map<String, String> f32571p;

    /* JADX INFO: renamed from: q */
    private final String f32572q;

    /* JADX INFO: renamed from: s */
    private final String f32573s;

    /* JADX INFO: renamed from: y */
    private final String f32574y;

    public static class toq {

        /* JADX INFO: renamed from: k */
        private zy f32575k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Context f73232toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private C5840q.k f73233zy;

        /* JADX INFO: renamed from: k */
        public NotificationWebView m20486k() {
            Context context = this.f73232toq;
            zy zyVar = this.f32575k;
            return new NotificationWebView(context, zyVar.f32576k, zyVar.f73234toq, zyVar.f73235zy, zyVar.f32578q, zyVar.f32577n, this.f73233zy);
        }

        /* JADX INFO: renamed from: q */
        public toq m20487q(C5840q.k kVar) {
            this.f73233zy = kVar;
            return this;
        }

        public toq toq(Context context) {
            this.f73232toq = context;
            return this;
        }

        public toq zy(zy zyVar) {
            this.f32575k = zyVar;
            return this;
        }
    }

    public static class zy {

        /* JADX INFO: renamed from: k */
        public final String f32576k;

        /* JADX INFO: renamed from: n */
        public Map<String, String> f32577n;

        /* JADX INFO: renamed from: q */
        public final String f32578q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final boolean f73234toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final String f73235zy;

        public zy(String str, boolean z2) {
            this(str, z2, null, null);
        }

        /* JADX INFO: renamed from: k */
        public void m20488k(Map<String, String> map) {
            this.f32577n = map;
        }

        public zy(String str, boolean z2, String str2, String str3) {
            this.f32576k = str;
            this.f73234toq = z2;
            this.f73235zy = str2;
            this.f32578q = str3;
        }
    }

    private void f7l8(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        CookieSyncManager.createInstance(getContext());
        CookieManager cookieManager = CookieManager.getInstance();
        m20482g(cookieManager, "userId", str);
        m20482g(cookieManager, C5480k.f72649n7h, str2);
        CookieSyncManager.getInstance().sync();
    }

    /* JADX INFO: renamed from: g */
    private void m20482g(CookieManager cookieManager, String str, String str2) {
        cookieManager.setCookie(AbstractC5576q.f31052k, String.format("%s=%s;", str, str2));
    }

    /* JADX INFO: renamed from: k */
    private static String m20483k(String str, boolean z2) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter("_device_name", Build.DEVICE);
        builderBuildUpon.appendQueryParameter("_provision", String.valueOf(z2));
        return builderBuildUpon.build().toString();
    }

    /* JADX INFO: renamed from: n */
    public static void m20484n(Intent intent, zy zyVar) {
        intent.putExtra(C5497k.f72759qrj, zyVar.f32576k);
        intent.putExtra(f32566h, zyVar.f73234toq);
    }

    /* JADX INFO: renamed from: q */
    public static zy m20485q(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra(f32566h, true);
        String stringExtra = intent.getStringExtra(C5497k.f72759qrj);
        boolean booleanExtra2 = intent.getBooleanExtra(C5480k.f72656x2, false);
        return new zy(m20483k(stringExtra, booleanExtra2), booleanExtra, intent.getStringExtra("userId"), intent.getStringExtra(C5480k.f72649n7h));
    }

    static void toq(WebSettings webSettings) {
        String userAgentString = webSettings.getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return;
        }
        webSettings.setUserAgentString(String.format("%s PassportSDK/NotificationWebView/%s", userAgentString, fti.m19075k()));
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C5578t.m19135k(this.f32569k);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        C5578t.m19137q(this.f32569k);
        if (this.f32570n) {
            CookieSyncManager.createInstance(getContext());
            CookieManager.getInstance().removeAllCookie();
        }
        super.onDetachedFromWindow();
    }

    public boolean zy() {
        String strM19106k = lvui.m19106k(this.f32572q);
        if (TextUtils.isEmpty(strM19106k)) {
            AbstractC5574n.zy(f32567i, "invalid notificationUrl");
            return false;
        }
        if (this.f32570n) {
            CookieSyncManager.createInstance(getContext());
            CookieManager.getInstance().removeAllCookie();
        }
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        toq(settings);
        setWebViewClient(new C5840q(getContext(), strM19106k, this.f32568g));
        new gvn7().f7l8(this);
        new d3().toq(this);
        new eqxt().f7l8(this);
        new oc().f7l8(this);
        new jp0y().m19091g(this, this.f32571p);
        f7l8(this.f32574y, this.f32573s);
        loadUrl(strM19106k);
        return true;
    }

    private NotificationWebView(Context context, String str, boolean z2, String str2, String str3, Map<String, String> map, C5840q.k kVar) {
        super(context);
        this.f32569k = new d3.C5565k(this);
        C5837g.m20491k(str, "notificationUrl should not be empty");
        C5837g.toq(kVar, "notificationEndListener should not be null");
        C5837g.toq(context, "context should not be null");
        this.f32572q = str;
        this.f32570n = z2;
        this.f32568g = kVar;
        this.f32574y = str2;
        this.f32573s = str3;
        this.f32571p = map;
    }
}
