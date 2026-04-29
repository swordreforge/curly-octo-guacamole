package com.android.thememanager.h5.feature;

import android.util.Log;
import com.android.thememanager.basemodule.analysis.f7l8;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.controller.online.ld6;
import com.android.thememanager.util.ch;
import java.util.Map;
import miui.os.Build;
import miuix.hybrid.C7156z;
import miuix.hybrid.n7h;
import miuix.hybrid.o1t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceFeature implements n7h {

    /* JADX INFO: renamed from: c */
    private static final String f12070c = "oaid";

    /* JADX INFO: renamed from: e */
    private static final String f12071e = "vaid";

    /* JADX INFO: renamed from: f */
    private static final String f12072f = "subTitleColor";

    /* JADX INFO: renamed from: g */
    private static final String f12073g = "jsBridgeVersion";

    /* JADX INFO: renamed from: h */
    private static final String f12074h = "system";

    /* JADX INFO: renamed from: i */
    private static final String f12075i = "systemVersion";

    /* JADX INFO: renamed from: k */
    private static final String f12076k = "DeviceFeature";

    /* JADX INFO: renamed from: l */
    private static final String f12077l = "ref";

    /* JADX INFO: renamed from: n */
    private static final String f12078n = "apkVersion";

    /* JADX INFO: renamed from: p */
    private static final String f12079p = "isGlobal";

    /* JADX INFO: renamed from: q */
    private static final String f12080q = "getExtraDeviceInfo";

    /* JADX INFO: renamed from: r */
    private static final String f12081r = "capability";

    /* JADX INFO: renamed from: s */
    private static final String f12082s = "region";

    /* JADX INFO: renamed from: t */
    private static final String f12083t = "language";

    /* JADX INFO: renamed from: y */
    private static final String f12084y = "device";

    /* JADX INFO: renamed from: z */
    private static final String f12085z = "alpha";

    public o1t getDeviceInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("apkVersion", ld6.qrj());
            jSONObject.put(f12073g, 3);
            jSONObject.put("device", C1807g.m7073g());
            jSONObject.put("region", ld6.m7578u());
            jSONObject.put("isGlobal", Build.IS_INTERNATIONAL_BUILD);
            jSONObject.put("system", ld6.qkj8());
            jSONObject.put(f12075i, ld6.fnq8());
            jSONObject.put("alpha", Build.IS_ALPHA_BUILD);
            jSONObject.put("language", ld6.hb());
            jSONObject.put("capability", ld6.n7h());
            jSONObject.put(f12072f, ch.jk());
            jSONObject.put("ref", f7l8.m6613s());
            jSONObject.put("oaid", C1807g.qrj());
            jSONObject.put("vaid", C1807g.m7075i());
            return new o1t(jSONObject);
        } catch (JSONException e2) {
            Log.e(f12076k, e2.getMessage());
            return new o1t(200, e2.getMessage());
        }
    }

    @Override // miuix.hybrid.n7h
    public n7h.EnumC7150k getInvocationMode(C7156z request) {
        if (f12080q.equals(request.m25920k())) {
            return n7h.EnumC7150k.SYNC;
        }
        return null;
    }

    @Override // miuix.hybrid.n7h
    public o1t invoke(C7156z request) {
        return f12080q.equals(request.m25920k()) ? getDeviceInfo() : new o1t(204, "no such action");
    }

    @Override // miuix.hybrid.n7h
    public void setParams(Map<String, String> params) {
    }
}
