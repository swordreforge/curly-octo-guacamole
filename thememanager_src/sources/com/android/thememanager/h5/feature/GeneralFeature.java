package com.android.thememanager.h5.feature;

import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.util.C2755a;
import java.util.Map;
import miuix.hybrid.C7156z;
import miuix.hybrid.n7h;
import miuix.hybrid.o1t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class GeneralFeature implements n7h {
    public static final int JS_BRIDGE_VERSION = 3;

    /* JADX INFO: renamed from: g */
    private static final String f12088g = "showDialog";

    /* JADX INFO: renamed from: h */
    private static final String f12089h = "host";

    /* JADX INFO: renamed from: k */
    private static final String f12090k = "GeneralFeature";

    /* JADX INFO: renamed from: n */
    private static final String f12091n = "showToast";

    /* JADX INFO: renamed from: p */
    private static final String f12092p = "lengthType";

    /* JADX INFO: renamed from: q */
    private static final String f12093q = "getHost";

    /* JADX INFO: renamed from: s */
    private static final String f12094s = "message";

    /* JADX INFO: renamed from: y */
    private static final String f12095y = "title";

    /* JADX INFO: renamed from: k */
    private o1t m7931k() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("host", C2755a.zy());
            return new o1t(jSONObject);
        } catch (JSONException e2) {
            Log.e(f12090k, e2.getMessage());
            return new o1t(200, e2.getMessage());
        }
    }

    @Override // miuix.hybrid.n7h
    public n7h.EnumC7150k getInvocationMode(C7156z request) {
        if (TextUtils.equals(request.m25920k(), f12093q)) {
            return n7h.EnumC7150k.SYNC;
        }
        if (TextUtils.equals(request.m25920k(), f12091n)) {
            return n7h.EnumC7150k.SYNC;
        }
        if (TextUtils.equals(request.m25920k(), f12088g)) {
            return n7h.EnumC7150k.SYNC;
        }
        return null;
    }

    @Override // miuix.hybrid.n7h
    public o1t invoke(C7156z request) {
        return TextUtils.equals(request.m25920k(), f12093q) ? m7931k() : TextUtils.equals(request.m25920k(), f12091n) ? showToast(request) : TextUtils.equals(request.m25920k(), f12088g) ? showDialog(request) : new o1t(204, "no such action");
    }

    @Override // miuix.hybrid.n7h
    public void setParams(Map<String, String> params) {
    }

    public o1t showDialog(C7156z request) {
        return new o1t(0);
    }

    public o1t showToast(C7156z request) {
        try {
            JSONObject jSONObject = new JSONObject(request.m25921n());
            nn86.toq(jSONObject.getString("message"), jSONObject.optInt(f12092p) == 0 ? 0 : 1);
            return new o1t(0);
        } catch (JSONException e2) {
            Log.e(f12090k, e2.getMessage());
            return new o1t(200, e2.getMessage());
        }
    }
}
