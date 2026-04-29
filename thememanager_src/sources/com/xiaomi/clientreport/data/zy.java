package com.xiaomi.clientreport.data;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class zy extends C5625q {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final long f73113ld6 = -1;

    /* JADX INFO: renamed from: y */
    public int f31280y;

    /* JADX INFO: renamed from: s */
    public long f31279s = -1;

    /* JADX INFO: renamed from: p */
    public long f31278p = -1;

    /* JADX INFO: renamed from: g */
    public static zy m19319g() {
        return new zy();
    }

    @Override // com.xiaomi.clientreport.data.C5625q
    /* JADX INFO: renamed from: n */
    public String mo19316n() {
        return super.mo19316n();
    }

    @Override // com.xiaomi.clientreport.data.C5625q
    /* JADX INFO: renamed from: q */
    public JSONObject mo19317q() {
        try {
            JSONObject jSONObjectMo19317q = super.mo19317q();
            if (jSONObjectMo19317q == null) {
                return null;
            }
            jSONObjectMo19317q.put("code", this.f31280y);
            jSONObjectMo19317q.put("perfCounts", this.f31279s);
            jSONObjectMo19317q.put("perfLatencies", this.f31278p);
            return jSONObjectMo19317q;
        } catch (JSONException e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            return null;
        }
    }
}
