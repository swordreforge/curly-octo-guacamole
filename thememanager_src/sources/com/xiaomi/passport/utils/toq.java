package com.xiaomi.passport.utils;

import com.xiaomi.accountsdk.account.C5502s;
import com.xiaomi.accountsdk.request.C5539k;
import com.xiaomi.accountsdk.request.C5550t;
import com.xiaomi.accountsdk.request.n7h;
import com.xiaomi.accountsdk.request.wvg;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import com.xiaomi.accountsdk.utils.lvui;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p039w.C7727s;
import ra.C7630k;

/* JADX INFO: compiled from: LoginPreferenceConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static final String f32634k = "PhoneLoginPreferenceConfig";

    /* JADX INFO: renamed from: k */
    public static C7630k m20548k(String str, String str2) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException, C7727s {
        wvg.C5555y c5555yX2 = C5550t.x2(lvui.m19106k(C5848q.f73255toq), new com.xiaomi.accountsdk.utils.n7h().easyPut("phone", str).easyPutOpt("region", str2), null, true);
        if (c5555yX2 == null) {
            throw new n7h("result content is null");
        }
        String strM18811v = C5502s.m18811v(c5555yX2);
        try {
            JSONObject jSONObject = new JSONObject(strM18811v);
            int i2 = jSONObject.getInt("code");
            String string = jSONObject.getString("description");
            if (i2 == 0) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                return new C7630k(jSONObject2.optString("idcZone"), jSONObject2.optString("userRegion"), C7630k.k.valueOf(jSONObject2.getString("type")));
            }
            if (i2 != 70008) {
                throw new n7h(i2, string);
            }
            throw new C7727s(string);
        } catch (JSONException e2) {
            AbstractC5574n.m19113q(f32634k, "realBody", e2);
            throw new n7h(strM18811v);
        }
    }
}
