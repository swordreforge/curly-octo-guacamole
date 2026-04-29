package com.xiaomi.onetrack.p009a.p011b;

import android.text.TextUtils;
import com.xiaomi.onetrack.api.C5694h;
import com.xiaomi.onetrack.p013b.C5720h;
import com.xiaomi.onetrack.p017f.C5757b;
import com.xiaomi.onetrack.util.C5804p;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.a.b.b */
/* JADX INFO: loaded from: classes3.dex */
public class C5679b extends C5757b {

    /* JADX INFO: renamed from: d */
    private static final String f31608d = "OTAdEvent";

    /* JADX INFO: renamed from: e */
    private List<C5678a> f31609e = null;

    public C5679b(String str, String str2, String str3, String str4) {
        try {
            m20068a(str);
            m20074c(str3);
            m20071b(str2);
            m20070b(System.currentTimeMillis());
            JSONObject jSONObject = new JSONObject(str4);
            JSONObject jSONObject2 = jSONObject.getJSONObject(C5694h.f31812b);
            m20072b(jSONObject);
            m20066a(C5720h.m19910a().m19916a(str, str3, "level", 0));
            m19680a(jSONObject2);
            m19678c(jSONObject2);
        } catch (Exception e2) {
            C5804p.m20347b(f31608d, "CustomEvent error:" + e2.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    private void m19678c(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has(C5757b.b.f32132H)) {
            jSONObject.remove(C5757b.b.f32132H);
        }
    }

    /* JADX INFO: renamed from: a */
    public List<C5678a> m19679a() {
        return this.f31609e;
    }

    /* JADX INFO: renamed from: a */
    public void m19680a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(C5757b.b.f32132H);
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                String strOptString = jSONArrayOptJSONArray.optString(i2);
                if (!TextUtils.isEmpty(strOptString)) {
                    if (strOptString.contains("api.ad.xiaomi.com") && !strOptString.contains("_sn_")) {
                        strOptString = strOptString.contains("?") ? strOptString + "&_sn_=" + UUID.randomUUID().toString() : strOptString + "?_sn_=" + UUID.randomUUID().toString();
                    }
                    C5678a c5678a = new C5678a();
                    c5678a.m19671c(m20073c());
                    c5678a.m19666a(m20076e());
                    c5678a.m19665a(m20079h());
                    c5678a.m19673d(m20075d());
                    c5678a.m19669b(strOptString);
                    arrayList.add(c5678a);
                }
            }
            this.f31609e = arrayList;
        } catch (Throwable th) {
            C5804p.m20342a(f31608d, "parseAdMonitor Throwable:" + th.getMessage());
        }
    }
}
