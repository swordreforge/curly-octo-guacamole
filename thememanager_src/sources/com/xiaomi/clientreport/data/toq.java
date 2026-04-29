package com.xiaomi.clientreport.data;

import miuix.android.content.C6824k;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class toq extends C5625q {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public String f73112ld6;

    /* JADX INFO: renamed from: p */
    public long f31275p;

    /* JADX INFO: renamed from: s */
    public int f31276s;

    /* JADX INFO: renamed from: y */
    public String f31277y;

    /* JADX INFO: renamed from: g */
    public static toq m19318g() {
        return new toq();
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
            jSONObjectMo19317q.put(C6824k.f86553hyow, this.f31277y);
            jSONObjectMo19317q.put("eventType", this.f31276s);
            jSONObjectMo19317q.put("eventTime", this.f31275p);
            String str = this.f73112ld6;
            if (str == null) {
                str = "";
            }
            jSONObjectMo19317q.put("eventContent", str);
            return jSONObjectMo19317q;
        } catch (JSONException e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            return null;
        }
    }
}
