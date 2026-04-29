package com.android.thememanager.h5.jsinterface;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.android.thememanager.basemodule.account.C1685g;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.controller.online.ld6;
import com.android.thememanager.util.bz2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.thememanager.h5.jsinterface.q */
/* JADX INFO: compiled from: UserSatisfactionSurveyInterface.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2065q {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f60289f7l8 = "vaid";

    /* JADX INFO: renamed from: g */
    private static final String f12217g = "oaid";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f60290ld6 = "version_name";

    /* JADX INFO: renamed from: n */
    private static final String f12218n = "imei2";

    /* JADX INFO: renamed from: p */
    private static final String f12219p = "package_name";

    /* JADX INFO: renamed from: q */
    private static final String f12220q = "imei1";

    /* JADX INFO: renamed from: s */
    private static final String f12221s = "miid";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f60291toq = "littlebee";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f60292x2 = "miui_version";

    /* JADX INFO: renamed from: y */
    private static final String f12222y = "udid";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f60293zy = "q";

    /* JADX INFO: renamed from: k */
    private bz2 f12223k;

    public C2065q(bz2 helper) {
        this.f12223k = helper;
    }

    @JavascriptInterface
    public void closeWindow() {
        this.f12223k.m9642g();
    }

    @JavascriptInterface
    public String getDeviceMessage() {
        C1685g c1685gM6590z = C1688q.cdj().m6590z();
        String str = c1685gM6590z == null ? "" : c1685gM6590z.f9637k;
        String strM7564e = ld6.m7564e();
        String strQrj = C1807g.qrj();
        String strM7075i = C1807g.m7075i();
        String str2 = TextUtils.isEmpty(strM7564e) ? TextUtils.isEmpty(strQrj) ? strM7075i : strQrj : strM7564e;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f12220q, strM7564e);
            jSONObject.put("oaid", strQrj);
            jSONObject.put("vaid", strM7075i);
            jSONObject.put(f12222y, str2);
            jSONObject.put("miid", str);
            jSONObject.put("package_name", com.android.thememanager.ad.zy.m6537q());
            jSONObject.put(f60290ld6, ld6.qrj());
            jSONObject.put(f60292x2, C1807g.ld6());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    @JavascriptInterface
    public boolean isDarkMode() {
        return C1819o.d2ok(bf2.toq.toq());
    }

    @JavascriptInterface
    public void loadComplete() {
        this.f12223k.m9644s(true);
    }

    @JavascriptInterface
    public void vibrator() {
    }
}
