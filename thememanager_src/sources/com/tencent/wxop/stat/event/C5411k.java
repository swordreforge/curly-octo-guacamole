package com.tencent.wxop.stat.event;

import android.content.Context;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import com.tencent.wxop.stat.common.C5381a;
import com.tencent.wxop.stat.common.C5382b;
import com.tencent.wxop.stat.common.C5392l;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.wxop.stat.event.k */
/* JADX INFO: loaded from: classes3.dex */
public class C5411k extends AbstractC5405e {

    /* JADX INFO: renamed from: a */
    private C5382b f30213a;

    /* JADX INFO: renamed from: m */
    private JSONObject f30214m;

    public C5411k(Context context, int i2, JSONObject jSONObject, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i2, statSpecifyReportedInfo);
        this.f30214m = null;
        this.f30213a = new C5382b(context);
        this.f30214m = jSONObject;
    }

    @Override // com.tencent.wxop.stat.event.AbstractC5405e
    /* JADX INFO: renamed from: a */
    public EventType mo18479a() {
        return EventType.SESSION_ENV;
    }

    @Override // com.tencent.wxop.stat.event.AbstractC5405e
    /* JADX INFO: renamed from: a */
    public boolean mo18480a(JSONObject jSONObject) throws JSONException {
        C5381a c5381a = this.f30195e;
        if (c5381a != null) {
            jSONObject.put("ut", c5381a.m18384d());
        }
        JSONObject jSONObject2 = this.f30214m;
        if (jSONObject2 != null) {
            jSONObject.put("cfg", jSONObject2);
        }
        if (C5392l.m18447w(this.f30201l)) {
            jSONObject.put("ncts", 1);
        }
        this.f30213a.m18387a(jSONObject, (Thread) null);
        return true;
    }
}
