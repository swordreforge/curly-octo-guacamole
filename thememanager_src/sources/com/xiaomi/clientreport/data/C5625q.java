package com.xiaomi.clientreport.data;

import com.market.sdk.utils.C5019y;
import com.xiaomi.push.ek5k;
import com.xiaomi.push.nc;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.clientreport.data.q */
/* JADX INFO: loaded from: classes3.dex */
public class C5625q {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private String f73109f7l8;

    /* JADX INFO: renamed from: g */
    private String f31271g;

    /* JADX INFO: renamed from: k */
    public int f31272k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public String f73110toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public int f73111zy;

    /* JADX INFO: renamed from: q */
    private String f31274q = ek5k.m20774k();

    /* JADX INFO: renamed from: n */
    private String f31273n = nc.m21314q();

    /* JADX INFO: renamed from: k */
    public String m19315k() {
        return this.f31271g;
    }

    /* JADX INFO: renamed from: n */
    public String mo19316n() {
        JSONObject jSONObjectMo19317q = mo19317q();
        return jSONObjectMo19317q == null ? "" : jSONObjectMo19317q.toString();
    }

    /* JADX INFO: renamed from: q */
    public JSONObject mo19317q() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("production", this.f31272k);
            jSONObject.put("reportType", this.f73111zy);
            jSONObject.put("clientInterfaceId", this.f73110toq);
            jSONObject.put(C5019y.f69023cdj, this.f31274q);
            jSONObject.put(com.android.thememanager.basemodule.analysis.toq.wh, this.f31273n);
            jSONObject.put("pkgName", this.f31271g);
            jSONObject.put("sdkVersion", this.f73109f7l8);
            return jSONObject;
        } catch (JSONException e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            return null;
        }
    }

    public void toq(String str) {
        this.f31271g = str;
    }

    public void zy(String str) {
        this.f73109f7l8 = str;
    }
}
