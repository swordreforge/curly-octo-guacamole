package com.market.sdk;

import android.net.Uri;

/* JADX INFO: renamed from: com.market.sdk.y */
/* JADX INFO: compiled from: DetailPageRequest.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5020y {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f69068f7l8 = "nonce";

    /* JADX INFO: renamed from: g */
    private static final String f28267g = "appSignature";

    /* JADX INFO: renamed from: n */
    private static final String f28268n = "appClientId";

    /* JADX INFO: renamed from: p */
    private static final String f28269p = "needTaskRoot";

    /* JADX INFO: renamed from: q */
    private static final String f28270q = "startDownload";

    /* JADX INFO: renamed from: s */
    private static final String f28271s = "backUrl";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f69069toq = "id";

    /* JADX INFO: renamed from: y */
    private static final String f28272y = "launchWhenInstalled";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f69070zy = "ref";

    /* JADX INFO: renamed from: k */
    private Uri.Builder f28273k;

    /* JADX INFO: renamed from: com.market.sdk.y$k */
    /* JADX INFO: compiled from: DetailPageRequest.java */
    public enum k {
        DETAILS("mimarket://details"),
        CARD("mimarket://details/detailcard"),
        CARD_MINI("mimarket://details/detailmini");

        private String data;

        k(String str) {
            this.data = str;
        }
    }

    public C5020y(k kVar) {
        this.f28273k = Uri.parse(kVar.data).buildUpon();
    }

    public void f7l8(String str) {
        this.f28273k.appendQueryParameter("ref", str);
    }

    /* JADX INFO: renamed from: g */
    public void m17503g(String str) {
        this.f28273k.appendQueryParameter("id", str);
    }

    /* JADX INFO: renamed from: k */
    public void m17504k(String str, String str2) {
        this.f28273k.appendQueryParameter(str, str2);
    }

    /* JADX INFO: renamed from: n */
    public void m17505n(String str) {
        this.f28273k.appendQueryParameter(f28271s, str);
        this.f28273k.appendQueryParameter(f28269p, Boolean.FALSE.toString());
    }

    /* JADX INFO: renamed from: q */
    String m17506q() {
        return this.f28273k.build().toString();
    }

    public void toq(String str, String str2, String str3) {
        zy(str, str2, str3, false);
    }

    public void zy(String str, String str2, String str3, boolean z2) {
        this.f28273k.appendQueryParameter("startDownload", Boolean.TRUE.toString());
        this.f28273k.appendQueryParameter(f28268n, str);
        this.f28273k.appendQueryParameter(f28267g, str2);
        this.f28273k.appendQueryParameter(f69068f7l8, str3);
        this.f28273k.appendQueryParameter(f28272y, String.valueOf(z2));
    }

    public C5020y(String str) {
        this.f28273k = Uri.parse(str).buildUpon();
    }
}
